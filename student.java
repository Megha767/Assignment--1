//Create a java program that enters the details of 10 students by creating a class student.The details entered are Rollno,Name ,Phone number,age,and CGPA.Display the name of the student with the highest CGPA.Display the Rollno of the youngest student in the class.//

import java.io.*;
import java.util.*;
class student
{
	public static void main ( String args[])
	{
		 Scanner obj= new Scanner( System.in);
		 int i ,n=10;
		 String[] string = new String[100];
		 int a[] = new int[100];
		 int b[] = new int[100];
		 long c[] = new long[1000];
		 int d[] = new int[100];
		 for(i=0;i<n;i++)
		 { 
		     System.out.println("enter the name");
		     string[i]= obj.next();
		     System.out.println("enter the roll no");
		     a[i] = obj.nextInt();
		     System.out.println("enter the age");
		     b[i] = obj.nextInt();
		     System.out.println("enter the phone number");
		     c[i]= obj.nextLong();
		     System.out.println("enter the CGPA");
		     d[i] =obj.nextInt();
		 }
	     System.out.println("name"+"\t roll no"+"\t age"+"\t phone "+"\t CGPA");
	     for(i=0;i<n;i++)
	     {
	     	System.out.println(string[i]+"\t"+a[i]+"\t"+b[i]+"\t"+c[i]+"\t"+d[i]);
	     }
	     int lar;
	     lar=d[0];
	     for(i=0;i<n;i++)
	     {
	     	if(lar<d[i])
	     	{
	     		lar=d[i];
	     	}
	     }
	     for(i=0;i<n;i++)
	     {
	     	 if(lar==d[i])	
	     	 {
	     	 	System.out.println("student having higest cgpa= "+string[i]);
	     	 }
	     }
	      int small;
	      small=b[0];
	      for(i=0;i<n;i++)
	      {
	      	 if(small>b[i])
	      	 {
	      	 	 small=b[i];
	      	 }
	      }
	      for(i=0;i<n;i++)
	      {
	      	if(small==b[i])
	      	{
	      		System.out.println("roll no of youngest= " + a[i]);
	      	}
	      }
	     
	     for(i=0;i<n;i++)
	     {
	        if((string[i].compareToIgnoreCase("aNu"))==0)
	        {
	        	 System.out.println("phone no of anu= "+c[i]);
	        }
	     }
	    
  }
}
	      