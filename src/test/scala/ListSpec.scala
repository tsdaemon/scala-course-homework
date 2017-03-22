import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by Anatoliy on 22.03.2017.
  */
class ListSpec extends FlatSpec
  with Matchers {

  val list = Cons[Int](5, Cons[Int](3, Cons[Int](7, Cons[Int](0, Nil))))

  "length" should "return correct length" in {
    (list.length) should be (4)
  }

  "nth" should "return nth element" in {
    (list nth -1) should be (Some(0))
    (list nth -2) should be (Some(7))
    (list nth 1) should be (Some(3))
    (list nth 0) should be (Some(5))
  }

  "concat" should "concatenate" in {
    val list2 = Cons[Int](9, Cons[Int](1, Cons[Int](3, Cons[Int](1, Nil))))

    (list concat list2) should be (list++list2)
  }
}
