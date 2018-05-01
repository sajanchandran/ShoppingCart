package com.hmrc.exercise

sealed trait PriceList {

  def price: Int;
}

object PriceList {

  case object APPLE extends PriceList { val price = 60 }
  case object ORANGE extends PriceList { val price = 25 }

}