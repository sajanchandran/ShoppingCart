package com.hmrc.exercise

object ShoppingCart {

  def main(args: Array[String]): Unit = {
    var total: Double = 0
    var totalApple: Int = args.count(p => p.equals("Apple"))
    var totalOrange: Int = args.count(p => p.equals("Orange"))
    var appleBuyCounter: Int = 0
    var orangeBuyCounter: Int = 0

    while (totalApple > 1) {
      totalApple = totalApple - 2
      appleBuyCounter = appleBuyCounter + 1
    }
    if (totalApple == 1) {
      appleBuyCounter += 1
    }

    while (totalOrange > 2) {
      totalOrange = totalOrange - 3
      orangeBuyCounter = orangeBuyCounter + 2
    }
    orangeBuyCounter = totalOrange + orangeBuyCounter

    var appleTotalCosts = (appleBuyCounter * PriceList.APPLE.price) / 100D
    var orangeTotalCosts = (orangeBuyCounter * PriceList.ORANGE.price) / 100D
    println("Total Apple Costs -->> " + appleTotalCosts)
    println("Total orange Costs -->> " + orangeTotalCosts)
    println("Total checkout Amount -->> " + (appleTotalCosts + orangeTotalCosts))

  }

}