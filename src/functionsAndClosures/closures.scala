var more = 0

val addMore = (x: Int) => x + more

def makeIncreaser(more: Int) = (x: Int) => x + more

val inc1 = makeIncreaser(1) // here, more is captured as 1. This means that inc1 is a function NOT a value
// This explains why if you print inc1 then you will get mem address rather than value. This means that
// inc1 means it is a function where more has been set to 1


val inc9999 = makeIncreaser(9999)

println(inc1(10))
println(inc9999(10))
