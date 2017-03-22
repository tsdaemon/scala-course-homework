/**
  * Created by Anatoliy on 21.03.2017.
  */
case object Nil extends List[Nothing] {
  override def ++[B >: Nothing](that: List[B]): List[B] = that

  override def nth(n: Int): Option[Nothing] = None

  override def length(): Int = 0

  override def foldRight[B](z: B)(f: (Nothing, B) => B): B = z

  override def concat[B >: Nothing](that: List[B]): List[B] = that
}