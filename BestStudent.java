public class Test
{
   public static Student getBestStudent(Student [] student)
   {
      int best = 0;
      int bestname = 0;
      for(int i = 0; i < student.length; i++)
      
     {
         if((student[i].getMark()>best))
         {
         best = student[i].getMark();
         bestname = i;
   }
     }
     return student[bestname];
       
   }
}