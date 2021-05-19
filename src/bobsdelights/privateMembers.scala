class Outer {
  // the below is called an inner class. In Scala possible to let classes have other classes as members. These inner classes are bound to the outer object.
  class Inner {
    // private means that it is only visible inside the class or object that contains the member definition
    private def f() = { println("f") }
    class InnerMost {
      f()
    }
  }
  (new Inner).f() // this causes an error as f() is private to Inner and can't be accessed here as it is located in Outer
}
