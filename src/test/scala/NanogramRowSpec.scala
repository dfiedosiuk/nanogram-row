import org.scalatest._
import flatspec._
import matchers._
import NanogramRow._


class NanogramRowSpec extends AnyFlatSpec with should.Matchers {

  behavior of "A NanogramRow.countOnes() "

  it should "given a binary array of any length, " +
    "return an array of positive integers that represent " +
    "the lengths of the sets of consecutive 1's in the input array, " +
    "in order from left to right " in {
    countOnes(Array.empty) shouldBe Array.empty
//    countOnes(Array[0,0,0,0,0]) shouldBe Array.empty
//    countOnes(Array[1,1,1,1,1]) shouldBe Array[5]
//    countOnes(Array[0,1,1,1,1,1,0,1,1,1,1]) shouldBe Array[5,4]
//    countOnes(Array[1,1,0,1,0,0,1,1,1,0,0]) shouldBe Array[2,1,3]
//    countOnes(Array[0,0,0,0,1,1,0,0,1,0,1,1,1]) shouldBe Array[2,1,3]
//    countOnes(Array[1,0,1,0,1,0,1,0,1,0,1,0,1,0,1]) shouldBe Array[1,1,1,1,1,1,1,1]
  }

}
