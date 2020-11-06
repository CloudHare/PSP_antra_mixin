package Destinations
import Enums._

trait BostonDestination  extends Destination {

  override def calculatePrice(): Double = 230.12

  override def goodDocument(doc: Document): Boolean = doc match {
    case IDCard() => false
    case Passport() => true
  }

  override def getDestination(): String = "Boston"
}
