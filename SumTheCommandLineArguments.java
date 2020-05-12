public class TotalArgs
{
    public static void main(String [] args)
    {
        int count = 0;
          for(int i = 0; i < args.length; i++)
         {   String s = args[i];
             int num = Integer.parseInt(s);
          count =  count + num;
        }
      System.out.println("The sum of all the args is " + count + ".");        
    }}
