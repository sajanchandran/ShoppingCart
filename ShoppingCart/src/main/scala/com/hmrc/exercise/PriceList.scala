package com.hmrc.exercise

sealed trait PriceList {
  
  def item: String;
  def price: Int;
}

object PriceList {
  
  case object APPLE extends PriceList {val item = "Apple"; val price = 60; }
  case object ORANGE extends PriceList {val item = "Orange"; val price = 25}

}