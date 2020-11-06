package FlightClasses

trait BusinessFlightClass extends FlightClass {

  override def calculatePriceCoefficient(): Double = 2.11
  override def calculateLuggage(): Int = 25
  override def getFlightClass(): String = "Business"
}
