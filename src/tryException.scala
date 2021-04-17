val n = 15

try {
  val isZeroDivisible = n / 0
} catch {
  case ex: ArithmeticException => println("Catching the exception")
}
finally {
  println("Just to show")
}

println("Does the rest of the code still execute?")