import Enums._
import Destinations._
import FlightClasses._

abstract class FlightTicket extends FlightClass with Destination {

  def getTicket(doc: Document): String //change return value to FlightTicket Data
  def calculatePrice(): Double
  def calculateLuggage(): Int
  def goodDocument(doc: Document): Boolean
  def getDestination(): String
  def getFlightClass(): String
}
