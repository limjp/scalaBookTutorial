class rationalNumber (n: Int, d: Int) {
  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val numerator: Int = n / g
  val denominator: Int = d / g

  def this(n: Int) = this(n, 1)

  def + (that: rationalNumber): rationalNumber =
    new rationalNumber(
      numerator * that.denominator + that.numerator * denominator,
      denominator * that.denominator
    )

  def + (i: Int): rationalNumber =
    new rationalNumber(numerator + i * denominator, denominator)

  def - (that: rationalNumber): rationalNumber =
    new rationalNumber(
      numerator * that.denominator - that.numerator * denominator,
      denominator * that.denominator
    )

  def - (i: Int): rationalNumber =
    new rationalNumber(numerator - i * denominator, denominator)

  def * (that: rationalNumber): rationalNumber =
    new rationalNumber(
      numerator * that.numerator,
      denominator * that.denominator
    )

  def * (i: Int): rationalNumber =
    new rationalNumber(numerator * i, denominator)

  def / (that: rationalNumber): rationalNumber =
    new rationalNumber(numerator * that.denominator, denominator * that.numerator)

  def / (i: Int): rationalNumber =
    new rationalNumber(numerator, denominator * i)

  override def toString = s"$numerator/$denominator"

  def add(that: rationalNumber): rationalNumber =
    new rationalNumber(
      numerator * that.denominator + that.numerator * denominator,
      denominator * that.denominator
    )

  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }
}

object rationalClass extends App {
  implicit def intToRational(x: Int) = new rationalNumber(x)
  val x = new rationalNumber(2,3)

  val z  = x + 1

  println(z)
}
