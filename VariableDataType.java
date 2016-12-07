public class VariableDataType
{  
	public static void main(String args[])
	{  
		int a = 10;
                int b = 20;
		b= a-- - --a;  
		System.out.println("Value of b= a-- - --a is : " + b);
		int c=a--;
		System.out.println("Value of c=a-- is        : " + c);
		int d=a>>2; 
		System.out.println("Value of d=a>>2 is       : " + d);
		int e=a&b;
		System.out.println("Value of e=a&b is        : " + e);
   	}  
}