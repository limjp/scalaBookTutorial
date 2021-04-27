import Element.elem

abstract class Element {
  def contents: Array[String]
  def height: Int = contents.length
  def width: Int = if (height == 0) 0 else contents(0).length

  def above(that: Element) : Element =
    elem(this.contents ++ that.contents)

  def beside(that: Element) : Element = {
    elem(
      for (
        (line1, line2) <- this.contents zip that.contents // this is actual a form of pattern matching.
        // line1 and line2 are the 2 vals for the tuples in this and that
      ) yield line1 + line2
      // yield here means for expression yields a result which is the same kind as the expression iterated over which in this case is an Array.
      // each element of the array is the result of concatenating line 1 and 2
      // This is a functional way of programming as it avoids explicit array indexing
    )
  }

  def widen(w: Int) : Element =
    if (w <= width) this
    else {
      val left = elem(' ', (w - width) / 2, height)
      val right = elem(' ', w - width - left.width, height)
      left beside this beside right
    }

  def heighten(h: Int): Element =
    if (h <= height) this
    else {
      val top = elem(' ', width, (h - height) / 2)
      val bot = elem(' ', width, h - height - top.height)
      top above this above bot
    }

  override def toString = contents mkString "\n"
  // toString method represents what the class would look like when printed out.
  // You want to override toString when you want to create your own idea of what the class should look like
  // When doing this to collections, you can use mkString because mkString allows you to create String representations of collections by
  // iterating through the collection.
  // toString does not contain an empty parameter list. Follows uniform access pricniple as it is a pure method and does not take any paramter.
}