/**
  * Created by Anatoliy on 13.03.2017.
  */
case class NonEmptySet[T <% Comparable[T]] (element: T, left: Set[T], right: Set[T]) extends Set[T] {
  override def contains(x: T): Boolean =
    if(x.compareTo(element) < 0) left contains(x)
    else
      if (x.compareTo(element) > 0) right contains(x)
      else true

  override def include(x: T): Set[T] =
    if (x.compareTo(element) < 0) NonEmptySet[T](element, left include x, right)
    else if(x.compareTo(element) > 0) NonEmptySet[T](element, left, right include x)
    else this

  override def union(other: Set[T]): Set[T] = ((left union right) union other) include element

  override def toString() = "{" + left + element + right + "}"

  override def map(f: (T) => T): Set[T] = left map f union (right map f) include f(element)

  override def isBalanced(): Boolean = (right isRightBalanced element) &&
    (right isBalanced) &&
    (left isLeftBalanced element) &&
    (left isBalanced)

  override def isRightBalanced(x: T): Boolean = x.compareTo(element) < 0

  override def isLeftBalanced(x: T): Boolean = x.compareTo(element) > 0

  override def rebalance(): Set[T] = left union right include element
}
