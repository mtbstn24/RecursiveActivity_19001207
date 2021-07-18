//19001207
object Q4{
  import scala.io.StdIn._

  def main(args : Array[String]): Unit ={
    print("Enter an Integer : ");
    val n = readInt();

    if(isEven(n)){
      println(n + " is an Even Number");
    }
    else{
      println(n + " is an Odd Number");
    }

  }

  def isEven(n : Int): Boolean ={
    if(n == 0){
      return true;
    }
    else if(n == 1){
      return false;
    }
    else{
      return isEven(n%2);
    }
  }

}
