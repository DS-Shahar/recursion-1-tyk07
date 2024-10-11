package Snorlax054;

public class Main5 {
	public static int sum(int n) //1
	{
		if(n == 0)
		{
			return 0;
		}
		return n + sum(n-1);
	}
	public static int f(int n) //2
	{
		if(n == 1)
		{
			return 1;
		}
		return n * f(n-1);
	}
	public static int odd(int n) //3 
	{
		if(n % 2 == 0)
		{
			n = n - 1;
		}
		if(n == 1)
		{
			return 1;
		}
		return n * odd(n-2);
	}
	public static int digits(int n) //4
	{
		if(n == 0)
		{
			return 0;
		}
		return 1 + digits(n/10);
	}
	public static double d(int n1, int n2) //5-6
	{
		if(n2 > n1)
		{
			return 1.0*n1/n2;
		}
		return 1 + d(n1-n2, n2);
	}
	public static boolean m(int n1, int n2) //7
	{
		if(n1 == n2)
		{
			return true;
		}
		else if(n1 < n2)
		{
			return false;
		}
		return m(n1-n2, n2);
	}
	public static boolean check(int n) //8
	{
		if(n % 2 == 0)
		{
			return isEven(n);
		}
		else
		{
			return isOdd(n);
		}
	}
	public static boolean isEven(int n) //8
	{
		if(n == 0)
		{
			return true;
		}
		else if(n % 2 != 0)
		{
			return false;
		}
		return isEven(n/10);
	}
	public static boolean isOdd(int n) //8
	{
		if(n == 0)
		{
			return true;
		}
		else if(n % 2 == 0)
		{
			return false;
		}
		return isOdd(n/10);
	}
	public static boolean t(int n) //9
	{
		if(n/10 == 0)
		{
			return true;
		}
		else if(n%2 != (n/10)%2)
		{
			return false;
		}
		return t(n/10);
	}
	public static int s(int n) //10
	{
		if(n == 0)
		{
			return 0;
		}
		else if(n % 2 == 0)
		{
			return (int)(Math.pow(n, 2)) + s(n-1);
		}
		return n*2 + s(n-1);
	}
	public static double a(int n) //11
	{
		if(n == 0)
		{
			return 0;
		}
		else if(n % 2 == 0)
		{
			return Math.sqrt(2*n-1)*(-1) + a(n-1);
		}
		return 2*n - 1 + a(n-1);
	}
	public static void main(String[] args) {
		System.out.println(sum(5));
		System.out.println(f(5));
		System.out.println(odd(6));
		System.out.println(digits(45489));
		System.out.println(d(20, 50));
		System.out.println(m(15, 5));
		System.out.println(check(642));
		System.out.println(t(2864));
		System.out.println(s(10));
		System.out.println(a(4));
	}
}