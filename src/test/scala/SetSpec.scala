import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by Anatoliy on 19.03.2017.
  */
class SetSpec extends FlatSpec
  with Matchers {

  it should "check balance correctly" in {
    val set = EmptyIntSet include 7 include 5 include 9 include 12 include 15
    (set isBalanced) should be (true)
    val set2 = new NonEmptySet[Int](8, new NonEmptySet[Int](25, EmptyIntSet, EmptyIntSet), new NonEmptySet[Int](24, EmptyIntSet, EmptyIntSet))
    (set2 isBalanced) should be (false)
  }

  "map" should "return balanced tree" in {
    val set = EmptyIntSet include 7 include 5 include 9 include 12 include 15
    (set map { x => if (x > 7) x else -x } isBalanced) should be (true)
  }

  "rebalance" should "return balanced tree" in {
    val set = new NonEmptySet[Int](8, new NonEmptySet[Int](25, EmptyIntSet, EmptyIntSet), new NonEmptySet[Int](24, EmptyIntSet, EmptyIntSet))
    ((set rebalance) isBalanced) should be (true)
  }
}
