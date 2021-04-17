val oneTwoThree = List (1, 2, 3)

val FourFiveSix = List (4, 5, 6)

val together = oneTwoThree ::: FourFiveSix

println(oneTwoThree + " and " + FourFiveSix + " were not mutated.")
println("Thus, " + together + " is a new list")
