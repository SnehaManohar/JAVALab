import java.util.Scanner;
 class Record{
	String name[]=new String[5];
	int rnk[]=new int[5];
	Record()
	{
		
		for(int i=0;i<5;i++)
		{
			
			name[i]="";
			rnk[i]=0;
		}
	}
	void readvalues()
	{
		Scanner in=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter name of student "+(i+1));
			name[i]=in.next();
			System.out.println("Enter rank of student "+(i+1));
			rnk[i]=in.nextInt();
		}
	}
	void display()
	{
		System.out.println("\nNAME\tRANK");
		//System.out.format("\naNAME\tRANK");
		for(int i=0;i<5;i++)
		{
			//System.out.format("\n%s\t%d",name[i],rnk[i]);
			System.out.println(name[i]+"  "+rnk[i]);
		}
	}
}
 class Rank extends Record{
	int index;
	Rank()
	{
		super();
		index=0;
	}
	void highest()
	{
		for(int i=0;i<rnk.length;i++)
		{
			if(rnk[i]==1)
				index=i;
		}
	}
	void display()
	{
		System.out.println("TOPMOST RANK IS:");
		System.out.println("NAME: "+name[index]+" RANK: "+rnk[index]);
		System.out.format("\nNAME\tRANK\n");
		for(int i=0;i<5;i++)
		{
			//System.out.format("\n%s\t\t%d",name[i],rnk[i]);
			System.out.println(name[i]+"\t"+rnk[i]);

		}
	}
}
public class RRmain {
	public static void main(String args[])
	{
		Rank r = new Rank();
		r.readvalues();
		r.highest();
		r.display();
	}
}
