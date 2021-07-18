//19001207
object Q6{
  import scala.io.StdIn._

  def main(args : Array[String]): Unit ={
    print("Enter an Integer : ");
    val n = readInt();

    var i = 1;
    for(i <- 1 to n){
      print(findFib(i));
      if(i<n){
        print(",");
      }
    }

  }

  def findFib(i : Int): Int ={
      if(i==1){
        return 0;
      }
      else if(i==2){
        return 1;
      }
      else{
        return (findFib(i-1) + findFib(i-2));
      }
  }

}
