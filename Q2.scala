//19001207
object Q2{
  import scala.io.StdIn._

  def main(args: Array[String]): Unit ={

    print("Enter an integer : ");
    val n = readInt();

    print("Prime Numbers less than " + n + " : ");
    primeSeq(n);

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

  def primeSeq(n : Int){
    if(n>2){
      if(prime(n-1)){
        print(n-1);
        if(n>3){
          print(",");
        }
      }
      primeSeq(n-1);
    }
  }

}
