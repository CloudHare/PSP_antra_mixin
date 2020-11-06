package Destinations

import Enums.Document

trait Destination {

  def calculatePrice(): Double
  def goodDocument(doc: Document): Boolean
  def getDestination(): String
}
