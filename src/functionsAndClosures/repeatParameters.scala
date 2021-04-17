def echo (args: String*) =
  for (arg <- args) println(arg)

echo()

echo("one")
echo("hello", "world!")