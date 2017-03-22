/**
  * Created by Anatoliy on 13.03.2017.
  */
trait Set[T] {
  def contains(x: T): Boolean
  def include(x: T): Set[T]
  def union(other: Set[T]): Set[T]
  def map(f: T => T) : Set[T]

  def isBalanced(): Boolean
  def isRightBalanced(el: T): Boolean
  def isLeftBalanced(el: T): Boolean

  def rebalance(): Set[T]
}
