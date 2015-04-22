import scala.math.min

object loops {
  
  // Return a string containing n copies of s, end to end.
  // For example StringOfReps("Ok", 9) returns: "OkOkOkOkOkOkOkOkOk"
  def stringOfReps(s: String, n: Int): String = {
    "unknown"
  var y=0
      var returns=""
      for (y<-0 until n){
          returns+=s
      }
      returns
     }

  // Return n! (n factorial: 1*2*3 *...* n if n >=1; 0! is 1.).  
  //For example Factorial(4) returns 1*2*3*4 = 24.
         def factorial(n: Int): Int = {
        var y=0
      var total : Int=1
      for(y<-1 until(n+1)){
          total=total*y
      }
      total
  }

   // Return a string containing a filled rectange, where the filling is 
   // the specified number of columns and rows of the character inChar,
   // surrounded by a border made of the character edgeChar.
   // For example printRectangle(3, 2, 'i', 'e') prints
   //    eeeee
   //    eiiie
   //    eiiie
   //    eeeee
   def printRectangle(columns:Int, rows:Int, inChar:String, edgeChar:String): String = {
     "unknown"
var upperouter = edgeChar * (columns + rows)

    var insidecolumns = (columns + rows) - 2

    var inside = edgeChar + (inChar * insidecolumns) + edgeChar


    var data = ""
    data += upperouter
    for( a <- 1 to rows){
     data += "\n" + inside
    }

    data += "\n" + upperouter

    return data



    //printTableBorders(3,2,4,1)
}
}
