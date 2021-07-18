//19001207
object Q1{
  import scala.io.StdIn._

  def main(args: Array[String]): Unit ={

    print("Enter an integer : ");
    val n = readInt();

    if(prime(n)){
      println(n + " is a Prime Number");
    }
    else{
      println(n + " is not a Prime Number");
    }

  }

  def GCD(a: Int, b: Int): Int = b match{
    case 0 => a;
    case x if(x>a) => GCD(x,a);
    case x => GCD(x,a%x);
  }

  def prime(n : Int, a : Int = 2): Boolean = a match{
    case x if(x==n) => true;
    case x if GCD(n,x)>1 => false;
    case x => prime(n,x+1);
  }

}
