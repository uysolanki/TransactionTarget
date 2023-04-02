import java.util.Scanner;

public class TransactionTarget {
	static int sum;
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number of Transactions");
	int size=sc.nextInt();
	int i;
	int trans[]=new int[size];
	
	for(i=0;i<size;i++)
	{
		System.out.println("Enter Value of the transaction");
		trans[i]=sc.nextInt();
	}
	
	System.out.println("Enter the number of Targets");
	int targets=sc.nextInt();
	int flag;
	for(i=1;i<=targets;i++)
	{
		sum=0;
		flag=0;    //target not met
		
		System.out.println("Enter the target Amount  number "+i);
		int target=sc.nextInt();  //kidsfee=target
		
		for(int j=0;j<trans.length;j++)
		{
			sum+=trans[j];
			if(sum>=target)
			{
				flag=1;
				System.out.println("Target achived on transaction number "+ (j+1));
				break;
			}
		}
			if(flag==0)
				System.out.println("Sorry, this Target not achived");
	}
	
	
}
}
