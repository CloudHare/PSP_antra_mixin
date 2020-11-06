package Entities

import Destinations._

abstract class PackageDelivery extends Destination{

  def calculatePrice(weight: Int): Double = {
    var price: Double = calculatePrice() * weight * 0.02
    price = BigDecimal(price).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    return price
  }

}
