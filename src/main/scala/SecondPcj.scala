import org.pcj.PCJ._
import org.pcj.{StartPoint, Storage}

/**
 * Author: Michal Szynkiewicz, michal.l.szynkiewicz@gmail.com
 * Date: 10/8/14
 * Time: 12:19 PM
 */
object SecondPcj extends App {

  override def main(args: Array[String]) = {
    val nodes = Array[String]("localhost:8091", "localhost:8001", "localhost:8003", "localhost:8004", "localhost:8005")
    deploy(classOf[HelloScala], classOf[HelloScala], nodes)
  }
}


class HelloScala extends Storage with StartPoint {
  override def main() = {
    log(s"hello, I'm ${myId()}")
    barrier()
    log(s"It's ${myId()} again. All of us have greeted you. Goodbye.")
  }
}