/**
  * Created by Anatoliy on 13.03.2017.
  */
class Complex(r:Double, i:Double) {
  def real = r
  def imaginary = i
  def abs = scala.math.sqrt(r*r + i*i)
  def phi = scala.math.atan(i/r)
  def +(that:Complex) = new Complex(r + that.real, i + that.imaginary)

  override def equals(any: scala.Any): Boolean = any match {
    case that:Complex => r == that.real && i == that.imaginary
    case _ => false
  }
}
