package models

/**
  * Created by srijithnair on 16/02/2016.
  */
import play.api.libs.json.Json
import reactivemongo.bson.BSONObjectID

case class Person(name : String ,email: String)

object Person{
  implicit  val PersonFormat =Json.format[Person]

}