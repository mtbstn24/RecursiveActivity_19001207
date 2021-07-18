//19001207
object Q3{
  import scala.io.StdIn._

  def main(args : Array[String]): Unit = {
    print("Enter an Integer : ");
    val n = readInt();

    println("Sum of numbers from 1 to " + n + " : " + sum(n));

  }

  def sum(n : Int): Int = {
    if(n==0){
      return 0;
    }
    else{
      return (n + sum(n-1));
    }
  }

}
