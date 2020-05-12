public class Test
{
   public static int numberPasses(Student [] student)
   {
      int numPassed = 0;
      for(int i = 0; i < student.length; i++)
      
     {
         if((student[i].getMark()>39))
         {
         numPassed++;
   }
     }
     return numPassed;
       
   }
}