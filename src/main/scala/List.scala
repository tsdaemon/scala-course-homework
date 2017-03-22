/**
  * Created by Anatoliy on 21.03.2017.
  */
trait List[+A] {
  def ++[B >: A](that: List[B]): List[B]
  def nth(n:Int): Option[A]
  def length(): Int
  def foldRight[B](z: B)(f: (A,B) => B): B
  def concat[B >: A](that: List[B]):List[B]
}


