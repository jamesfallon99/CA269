public class Test
{
   public static Double getPassingAverage(Student [] student)
   {
      Double count = 0.0;
      int passed = 0;
      for(int i = 0; i < student.length; i++)
      
     {
         if((student[i].getMark()>39))
         {
         count = count + student[i].getMark();
         passed++;
   }
     }
     return (count / passed);
       
   }
}