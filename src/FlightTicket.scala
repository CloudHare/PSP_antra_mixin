import Enums._
import Destinations._
import FlightClasses._

case class FlightTicketData(GoodDoc: Boolean, Price: Double, Luggage:Int)

abstract class FlightTicket extends FlightClass with Destination {

  def getTicket(doc: Document): Option[FlightTicketData] = {
    var price : Double = super[FlightClass].calculatePrice() * super[Destination].calculatePrice()
    BigDecimal(price).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    Some(FlightTicketData(goodDocument(doc), price, calculateLuggage()))
  }
/*
  def calculatePrice(): Double // both superclasses have such method
  def calculateLuggage(): Int
  def goodDocument(doc: Document): Boolean
  def getDestination(): String
  def getFlightClass(): String
*/
}

