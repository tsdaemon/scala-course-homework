/**
  * Created by Anatoliy on 13.03.2017.
  */
import org.scalacheck.{Gen, Properties}
import org.scalacheck.Prop.forAll

object ComplexSpecification extends Properties("Complex") {
  val complexValues: Gen[Complex] =
    for {
      i <- Gen.choose(-100, 100)
      r <- Gen.choose(-100, 100)
    } yield new Complex(i, r)

  property("associative") = forAll(complexValues, complexValues) { (a: Complex, b: Complex) => (a+b).equals(b+a) }
}
