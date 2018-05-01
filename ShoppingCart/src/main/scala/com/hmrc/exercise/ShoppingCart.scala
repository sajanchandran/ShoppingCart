package com.hmrc.exercise

object ShoppingCart {

  def main(args: Array[String]): Unit = {
    var total: Double = 0;
    for (items <- args) {
      items match {
        case "Apple" =>
          total.+=(PriceList.APPLE.price)
        case "Orange" => {
          total.+=(PriceList.ORANGE.price)
        }
      }
    }
    print("total ->" + total / 100)
  }

}