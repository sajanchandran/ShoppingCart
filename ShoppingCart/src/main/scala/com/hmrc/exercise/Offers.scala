package com.hmrc.exercise

sealed trait Offers {

  def buy: Int;
  def get: Int;
  def calc(in: Int): Int;
}

object Offers {

  case object BUY_ONE_GET_ONE extends Offers {
    val buy = 1
    val get = 1
    var actualCount = 0

    def calc(in: Int): Int = {
      var counter = in
      while (counter > 0) {
        var extracted = (counter - buy)
        if (extracted >= 0) {
          actualCount += buy
          counter = extracted - get;
        }
      }
      actualCount
    }
  }
  case object THREE_PRICE_OF_TWO extends Offers {
    val buy = 2;
    val get = 1;
    var actualCount = 0

    def calc(in: Int): Int = {
      var counter = in
      while (counter > 2) {
        var extracted = (counter - buy)
        if (extracted >= 0) {
          actualCount += buy
          counter = extracted - get;
        }
      }
      actualCount + counter
    }
  }
}