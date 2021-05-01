trait Philosophical {
  def philosophize() = {
    println("I consume memory, therefore I am!")
  }
}

class Animal

class Frogs extends Animal with Philosophical {
  override def toString = "green"

  override def philosophize(): Unit =
    println(s"It ain't easy being $toString")
}

val frog = new Frogs

frog.philosophize()

val phrog: Philosophical = new Frogs

phrog.philosophize()