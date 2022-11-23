import java.util.*;
public class Q34 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int x=0;
	
	int[] arr ={5,10,8,9,6,11,3,1,2,12,4,7};
	
	for(int i=0;i<10;i++) {
	System.out.println(i);
	
	if(arr[0]<arr[1]) {
	 x=arr[1];
	}
	else {x=arr[0];
	}
	if(arr[2]<x) {
	x=x;
	
	}
	else {x=arr[2];
	
	
	
	}
	
	}
	
		
		
	

	


