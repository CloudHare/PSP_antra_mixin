package FlightClasses

trait FlightClass {

  def calculatePriceCoefficient(): Double
  def calculateLuggage(): Int
  def getFlightClass(): String
}
