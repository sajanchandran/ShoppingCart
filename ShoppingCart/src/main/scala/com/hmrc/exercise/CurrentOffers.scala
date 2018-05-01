package com.hmrc.exercise

object CurrentOffers {
  
  def getOffer(item:String): Offers = {
    item match {
      case "Apple" => Offers.BUY_ONE_GET_ONE
      case "Orange" => Offers.THREE_PRICE_OF_TWO
    }
  }
}