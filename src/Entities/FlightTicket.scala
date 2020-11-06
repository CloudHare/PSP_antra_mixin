package Entities

import Destinations._
import Enums._
import FlightClasses._
import CaseClasses._

abstract class FlightTicket extends FlightClass with Destination {

  def getTicket(doc: Document): FlightTicketData = {
    var price : Double = calculatePriceCoefficient() * calculatePrice()
    price = BigDecimal(price).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    FlightTicketData(goodDocument(doc), price, calculateLuggage())
  }
/*
  def calculatePrice(): Double // both superclasses have such method
  def calculateLuggage(): Int
  def goodDocument(doc: Document): Boolean
  def getDestination(): String
  def getFlightClass(): String
*/
}

