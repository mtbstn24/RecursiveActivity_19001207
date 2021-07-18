//19001207
object Q5{
  import scala.io.StdIn._

  def main(args : Array[String]): Unit ={
    print("Enter an Integer : ");
    val n = readInt;

    println("Sun of all Even numbers less than " + n + " : " + addEven(n-1));

  }

  def addEven(n : Int): Int ={
    if(n==0){
      return 0;
    }
    else if(n%2 == 0){
      return(n + addEven(n-1));
    }
    else{
      addEven(n-1);
    }
  }

}
