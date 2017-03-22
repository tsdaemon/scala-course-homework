/**
  * Created by Anatoliy on 21.03.2017.
  */
case class Cons[+A](head: A, tail: List[A]) extends List[A] {
  override def toString = head match
  {
    case _: List[_] => "[" + head + "]" + "->" + tail
    case _ => head + "->" + tail
  }

  override def ++[B >: A](that: List[B]): List[B] = Cons[B](head, tail++that)

  override def nth(n: Int): Option[A] = n match {
    case x if x < 0 => nth(length() + n)
    case 0 => Option[A](head)
    case _ => tail.nth(n-1)
  }

  override def foldRight[B](z: B)(f: (A, B) => B) = tail.foldRight(f(head, z))(f)

  override def length(): Int = foldRight(0)((a, b) => b + 1)

  override def concat[B >: A](that: List[B]): List[B] = foldRight(that)((a,b) => Cons(a, b))
}

