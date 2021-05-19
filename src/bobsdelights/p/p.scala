package p {
  class Super {
    protected def f() = { println("f") }
  }
  class Sub extends Super {
    f() // this is okay as Sub is within Super where f() is defined
  }
  class Other {
    (new Super).f() // this would result in an error
  }
}