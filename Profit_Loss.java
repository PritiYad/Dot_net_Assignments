package Condtional_Staments;

import java.util.Scanner;

public class Profit_Loss {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sp,cp,res;
		System.out.println("Enter the selling price ");
		sp=sc.nextInt();
		System.out.println("Enter the Cost price ");
		cp=sc.nextInt();
		res=sp-cp;
		if(res==0)
		{
			System.out.println("Neither profit Nor loss");
		}
		else if(res>0)
		{
			System.out.println(" profit ="+res);
		}
		else
		{
			System.out.println(" Loss ="+(-res));
		}
		
	}
}




