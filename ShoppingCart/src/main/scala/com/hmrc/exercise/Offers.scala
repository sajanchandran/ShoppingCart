package com.hmrc.exercise

sealed trait Offers {

  def buy: Int;
  def get: Int;
}

object Offers {

  case object BUY_ONE_GET_ONE extends Offers { val buy = 1; val get = 1 }
  case object THREE_PRICE_OF_TWO extends Offers { val buy = 2; val get = 1 }
}