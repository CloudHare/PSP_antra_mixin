package Implementations
import Destinations._
import FlightClasses._
import Entities._

class BusinessBostonTicket extends FlightTicket with BusinessFlightClass with BostonDestination {}
