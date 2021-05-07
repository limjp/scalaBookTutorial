abstract class IntQueue {
  def get(): Int
  def put(x: Int): Unit
}

import scala.collection.mutable.ArrayBuffer

class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]
  //reminder both get and put below are concrete methods defining the abstract method defined in IntQueue above
  def get() = buf.remove(0) // queue is FIFO. So this means remove first element.
  def put(x: Int) = { buf += x} // this just means append element to the end
}

trait Doubling extends IntQueue {
  abstract override def put(x: Int) = { super.put(2 * x) } //super here just means call method in base class. But insert 2 * x into the parameter
}

//class MyQueue extends BasicIntQueue with Doubling
//
//val queue = new MyQueue
//
//queue.put(10)
//println(queue.get()) // returns 20
//
//val newQueue = new BasicIntQueue with Doubling
//newQueue.put(10)
//println(newQueue.get())

trait Incrementing extends IntQueue {
  abstract override def put(x: Int) = { super.put(x + 1) }
}

trait Filtering extends IntQueue {
  abstract override def put(x: Int) = {
    if (x >= 0) super.put(x)
  }
}

//val queue = (new BasicIntQueue with Incrementing with Filtering)
val queue = (new BasicIntQueue with Filtering with Incrementing)

queue.put(-1); queue.put(0); queue.put(1)

println(queue.get())

println(queue.get())