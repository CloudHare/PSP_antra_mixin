package Destinations
import Enums._

trait RomeDestination extends Destination {

  override def calculatePrice(): Double = 40.44

  override def goodDocument(doc: Document): Boolean = doc match {
    case IDCard() => true
    case Passport() => true
  }

  override def getDestination(): String = "Rome"
}
