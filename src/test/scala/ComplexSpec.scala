/**
  * Created by Anatoliy on 13.03.2017.
  */

import org.scalatest.{FlatSpec,Matchers}

class ComplexSpec extends FlatSpec
  with Matchers{

  it should "have correct phi value" in { (new Complex(1, 1).phi) should be (scala.math.Pi/4) }

}