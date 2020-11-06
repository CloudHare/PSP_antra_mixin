package Implementations
import Destinations._
import FlightClasses._
import Entities._

class BusinessRomeTicket extends FlightTicket with BusinessFlightClass with RomeDestination {}
