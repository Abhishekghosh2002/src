import java. util.*;
public class Q24 {

	public static void main(String[] args) {
int k=0;
int i,j;
for(i=1;i<6;i=i+1) {	
	int s=1;
	for(j=1;j<=i;j++) {
		s=s*j;
	}
k=k+s;
}
System.out.println(k);

}}

	


