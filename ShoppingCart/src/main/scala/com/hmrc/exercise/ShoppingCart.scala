package com.hmrc.exercise

object ShoppingCart {

  def main(args: Array[String]): Unit = {
    var total: Double = 0
    var totalApple: Int = args.count(p => p.equals("Apple"))
    var totalOrange: Int = args.count(p => p.equals("Orange"))

    var appleBuyCounter = CurrentOffers.getOffer("Apple").calc(totalApple)

    println("Price for Apple -->> " + (appleBuyCounter * PriceList.APPLE.price) / 100D)

    var orangeBuyCounter = CurrentOffers.getOffer("Orange").calc(totalOrange)

    println("Price for Orange -->> " + (orangeBuyCounter * PriceList.ORANGE.price) / 100D)

  }

}