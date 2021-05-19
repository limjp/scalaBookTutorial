package bobsdelights

abstract class Fruit(
                    val name: String,
                    val color: String
                    )

object Fruits {
  object Apple extends Fruit("apple", "red")
  object Orange extends Fruit("apple", "red")
  object Pear extends Fruit("pear", "yellowish")
  val menu = List(Apple, Orange, Pear)
  println(Apple)
}

def showFruit(fruit: Fruit) = {
  import Fruits._
  println(name + "s are " + color)
}