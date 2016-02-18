package models
import play.api.libs.json.Json
/**
  * Created by srijithnair on 15/02/2016.
  */

case class Person(name:String,email:String)
object  Person{

  implicit val personFormat=Json.format[Person]
}
