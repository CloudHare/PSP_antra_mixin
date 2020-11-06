package Enums

sealed trait Document
case class IDCard() extends Document
case class Passport() extends Document
