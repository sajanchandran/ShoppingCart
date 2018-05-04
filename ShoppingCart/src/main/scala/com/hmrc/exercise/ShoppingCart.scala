package com.hmrc.exercise

object ShoppingCart {

  def main(args: Array[String]): Unit = {
    var total: Double = 0
    var totalApple: Int = args.count(p => p.equals("Apple"))
    var totalOrange: Int = args.count(p => p.equals("Orange"))

    var appleBuyCounter = CurrentOffers.getOffer("Apple").calc(totalApple)
    
    val applePrice = (appleBuyCounter * PriceList.APPLE.price) / 100D

    println("Price for Apple -->> " + applePrice)

    var orangeBuyCounter = CurrentOffers.getOffer("Orange").calc(totalOrange)
    val orangePrice = (orangeBuyCounter * PriceList.ORANGE.price) / 100D

    println("Price for Orange -->> " + orangePrice)
    
    println("Total Price -->> £" + (applePrice + orangePrice))
  }

}