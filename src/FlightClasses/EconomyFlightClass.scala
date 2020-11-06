package FlightClasses

trait EconomyFlightClass extends FlightClass {

  override def calculatePriceCoefficient(): Double = 1.22
  override def calculateLuggage(): Int = 15
  override def getFlightClass(): String = "Economy"
}
