import Enums._
import Destinations._

abstract class PackageDelivery extends Destination{

  def calculatePrice(weight: Int): Double = {
    super[Destination].calculatePrice() * weight * 0.02
  }

}
