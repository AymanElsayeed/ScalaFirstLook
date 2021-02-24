import scala.io.Source.fromFile
import java.io._

object error_handling extends App {
  try {
    val lines =  fromFile("notExist.txt").getLines()
    for(line <- lines)
      println(line.toLowerCase())
  }
  catch {
    case e:FileNotFoundException =>println(s"No Such file found: ${e.getMessage}")
    case e:Exception =>println(s"unknown exception occur: ${e.getMessage}")
  }
}

error_handling