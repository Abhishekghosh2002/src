
public class q13 {

	public static void main(String args[]) {
       
		Box<String> test1;
		test1= new Box<String>(null);
		Box<String> var1=test1;
		Box<String> var2=test1;
		var1.setvar("value 1");
		System.out.println(var1.getvar());
		var2.setvar("value 2");
		System.out.println(var1.getvar());
		Box<integer> test2;
		test2=new box<integer>(null);
		box<integer> var3=test2;
		box<integer>var4=test2;
		var3.setvar(1);
		System.out.println(var3.getvar());
		var4.setvar(2);
		System.out.println(var3.getvar());
		Box<object> test2;
		test3=new box<object>(null);
		Box<object> var5=test3;
		Box<object>var6=test3;
		var5.setvar((double)0.1);
		System.out.println(var5.getvar());
		var6.setvar("value 2");
		System.out.println(var5.getvar());
	}
}
class box<T>
{
	public T var;
	Box(T var)
	{
		this.var=var;
	}
	void setvar(T var)
	{
		this.var=var;
	}
	T getvar()
	{
		return var;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
				
				
		

	}

}
