def twice(op: Double => Double, x: Double) = op(op(x))
// This means that twice is a function that expects 2 parameters. The first one is a function that takes in 1 parameter
// of double and outputs a result of Double. The second parameter is a variable of Double.
// The output of this function is that the function is called recursively on itself once and the inner function
// takes in the 2nd paramter of double.
// Answer below is 7. The default value of _ depends on what type the placeholder is. When it is an Int, default is 0
// other default are false if boolean, () for unit and null for all other types. Arithmetic types are all 0

println(twice(_ + 1, 5))