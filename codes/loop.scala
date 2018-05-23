// Simple For Loop
println("For loop using range of 'to'")
for (x <- 1 to 7) { println(s"Day$x") }

println("For loop using range of 'until'")
for (x <- 1 until 7 ) { println(s"Day$x") }

println("Multiple Iterators in For Loop")
for (x <- 1 to 7; y <- 0 until 7) {
  println(s"X Day-$x, Y Day-$y")
}

for (x <- 1 until 10 ) {
  for (y <- 1 until 10) {
      println(s"$x * $y = " + (x*y))
  }
}

println("Yield keywords in For Loop")
val result = for (x <- 1 to 9; y <- 1 to 9) yield {
  val multiple = x*y
  s"$x*$y=$multiple"
}
print(result)
for (multipleLine <- result) println(multipleLine)

println("Using Iterator-To by Increment")
for (x <- 1 to 10 by 2) {
  print(s"$x,")
}

println("\nUsing Iterator-Until by Decrement")
for (x <- 10 until 1 by -1) {
  print(s"$x,")
}
println("\n")

val threes = for (i <- 1 to 20 if i % 3 == 0) yield i
println(threes)

val quote = "Faith,Hope,,Charity,Generosity"
for { t <- quote.split(",") if t != null if t.size > 0 } {
  println(t)
}

