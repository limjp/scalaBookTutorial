import java.io.{File, PrintWriter}

def withPrintWriter(file: File)(op: PrintWriter => Unit) = {
  val writer = new PrintWriter(file)
  try {
    op(writer)
  } finally {
    writer.close()
  }

// This is a curried function of withPrintWriter. It takes in 2 parameter list with one parameter each instead of one
// parameter list with 2 parameters.
// function withPrintWriter takes in 2 parameter lists. First, a file. Second, a function that takes in type PrinterWriter and outputs unit.
// PrintWriter class is a java class used to write formatted data to an underlying writer.

val file = new File("date.txt")

withPrintWriter(file) { writer =>
  writer.println(new java.util.Date)
}


