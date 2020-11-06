import Enums._
import Implementations._
import CaseClasses._

object Main {

  def main(args: Array[String]): Unit = {
    val document = Passport()
    val weight = 10
    val ticket = new EconomyBostonTicket
    val delivery = new RomeDelivery

    val ticketData = ticket.getTicket(document)

    println("Your flight ticket")
    println("Price(Eur): " + ticketData.Price)
    println("Luggage(kg): " + ticketData.Luggage)
    println("Your document type: " + document)
    println("Right documents: " + ticketData.GoodDoc)
    println("Destination: " + ticket.getDestination())
    println("Flight class: " + ticket.getFlightClass())
    println("")
    println("Your package delivery")
    println("Price(Eur): " + delivery.calculatePrice(weight))
    println("Package weight(kg): " + weight)
    println("Destination: " + delivery.getDestination())
  }

}
