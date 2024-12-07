import java.util.*;
//Java Programming Internship Task 2 by  ANUKRITI BISHT
 
class StudentGradeCalculator
{
  
public static void main (String args[])
  {
    
System.out.print (" Enter the name of the student: ");
    
Scanner sc = new Scanner (System.in);
    
String name = sc.nextLine ();
    
System.out.println ("Enter the Total Number of Subjects: ");
    
int sub = sc.nextInt ();
    
 
      //Java Programming Internship Task 2 by  ANUKRITI BISHT
      sc.nextLine ();
    
 
System.out.
      println ("Please enter the marks only out of 100 for each subjects: ");
    
double totalmarks = 0.0;
    
double marks;
    
for (int i = 1; i <= sub; i++)
      {
	
marks = sc.nextDouble ();
	
totalmarks += marks;
      
} 
System.out.println ("NAME OF STUDENT: " + name);
    
System.out.println ("Total Marks Otained are: " + totalmarks + " Out of: " +
			 (100 * sub));
    
double percent = (totalmarks) / (sub * 100) * 100;
    
System.out.println ("Percentage: " + percent);
    
if (percent >= 90.00)
      {
	
System.out.println ("Grade: A+");
      
}
    else if (percent>= 80.00 && percent < 90.00)
      {
	
System.out.println ("Grade Obtained: A");
      
}
    else if (percent>= 70.00 && percent< 80.00)
      {
	
System.out.println ("Grade Obtained: B+");
      
}
    else if (percent>= 60.00 && percent< 70.00)
      {
	
System.out.println ("Grade Otained: B");
      
}
    else if (percent >= 55.00 && percent< 60.00)
      {
	
System.out.println ("Grade Obtained: C+");
      
}
    else if (percent>= 45.00 && percent < 55.00)
      {
	
System.out.println ("Grade Obtained: C");
      
}
    else if (percent >= 40.00 && percent < 45.00)
      {
	
System.out.println ("Grade Obtained: D");
      
}
    else if (percent< 40.00)
      {
	
System.out.println ("Grade Obtained: E");
      
}
  
}

}

//Java Programming Internship Task 2 by  ANUKRITI BISHT