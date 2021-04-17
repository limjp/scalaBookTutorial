object FileMatcher {
  private def filesHere = (new java.io.File(".")).listFiles()

  def filesEnding(query: String) =
    for (file <- filesHere; if file.getName.endsWith(query))
      yield file

  def filesContaining(query: String) =
    for (file <- filesHere; if file.getName.contains(query))
      yield file

  def filesRegex(query:String) =
    for (file <- filesHere; if file.getName.matches(query))
      yield file

  def filesMatching(query: String,
                    matcher: (String, String) => Boolean) = {
    for (file <- filesHere; if matcher(file.getName, query))
      yield file
  }
  // I don't understand how come matcher is written this way. Does this mean matcher is a function? It seems so but it seems like
  // matcher is actually not a function.
  // matcher is meant to check file name against a query. matcher should take in 2 string arguments that are the filename and query
  // apparently in scala, functions arguments can be omitted. You just need to write type.
  // matcher does not contain any logic because it is not a full fledged function. It is merely a paramter that says that
  // this parameter is a function that takes in 2 strings and return a boolean

  def filesEnding(query: String) = {
    filesMatching(query, _.endsWith(_))
    // the above line means the same as (fileName: String, query:String) => fileName.endsWith(query)
  }

  def filesContaining(query: String) =
    filesMatching(query, _.contains(_))

  def filesregex(query: String) =
    filesMatching(query, _.matches(_))
}

