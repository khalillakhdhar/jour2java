package ex2;

public class Calcule {
	public String verifdiv(int a)
	{
		int c=a/100;
		int d= (a%100)/10;
		int u=a%10;
		int result=c+d+u;
		if(result%3==0)
			return "divisible";
		else
			return "non divisible";
		
	}

}
