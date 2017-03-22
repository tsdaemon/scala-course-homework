/**
  * Created by Anatoliy on 13.03.2017.
  */
class EmptySet[T <% Comparable[T]]() extends Set[T] {
  override def contains(x: T): Boolean = false

  override def include(x: T): Set[T] = new NonEmptySet[T](x, new EmptySet[T], new EmptySet[T])

  override def union(other: Set[T]): Set[T] = other

  override def toString() = "."

  override def map(f: (T) => T): Set[T] = this

  override def isBalanced(): Boolean = true

  override def isRightBalanced(el: T): Boolean = true

  override def isLeftBalanced(el: T): Boolean = true

  override def rebalance(): Set[T] = this
}
