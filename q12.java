import java.util.*;
public class q12 {

	public static void main(String[] args) {
	class MarkoutofBoundException extends Exception {
		MarkoutofBoundException(String s){
			System.out.println(s);
		}
		public String tostring() {
			return "Invalid mark";
		}
	}
	class student
	{
		 String name;
		 float mark;
		 student(String name , float mark){
		 this.name=name;
		 this.mark=mark;
		 }
		 public String toString() {
			 return "student [Name="+name+",mark="+mark+"]";
		 }
	public static void main (String Args[])
	{
		Scanner sc=new Scanner(System.in);
		int m=0;
		try {
			 System.out.println("Input marks ");
			 m= sc.nextInt();
			 System.out.println("enter the name of the student");
			 String n=sc.next();
			 if(m<0 || m>100)
			 {
			throw new MarkoutofBoundException("wrong");
			 }
			 else
			 {
				 student s = new student (n,m);
				 System.out.println(s);
			 }
			 }
			 catch(Exception e)
			 {
				 System.out.println(e);
			 }
			   sc.close();
			 
			 
			
			
			
			
			
			
		
		}
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
		 }
	}
		
	
	}


