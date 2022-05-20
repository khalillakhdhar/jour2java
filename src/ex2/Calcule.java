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
	public void affichepaire(int debut,int fin)
	{
		
		for(int i=debut; i<=fin;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
		
	}
	public int pcgd(int a,int b)
	{
		while(a!=b)
		{
			if(a>b)
				a=a-b;
			else 
				b=b-a;
			
		}
		
		return a;
	}

}
