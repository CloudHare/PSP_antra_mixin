package FlightClasses

trait FlightClass {

  def calculatePrice(): Double
  def calculateLuggage(): Int
  def getFlightClass(): String
}
