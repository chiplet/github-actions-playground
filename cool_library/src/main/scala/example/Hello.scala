package example

object Hello extends Greeting with App {
  println(greeting)
  Cool.doCoolThing()
}

object Cool {
  def doCoolThing() = {
    println("Doing a very cool thing!!!")
  }
}

trait Greeting {
  lazy val greeting: String = "hello"
}
