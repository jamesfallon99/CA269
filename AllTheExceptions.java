public class Catch
{
    public static void main(String [] args)
    {
        try{
        Broken broke = new Broken();
        System.out.println("Testing");
      broke.cracked();}
      catch(Exception e){
          if(e instanceof ArrayIndexOutOfBoundsException){
          System.out.println("ArrayIndexOutOfBoundsException");}
          
        if(e instanceof ArithmeticException){
          System.out.println("ArithmeticException");}
          
        if(e instanceof NullPointerException){
          System.out.println("NullPointerException");}
          
      }
      finally{ System.out.println("Finally");}
    }
}