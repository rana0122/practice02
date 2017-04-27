package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int amount=0;
		int crtMoney=0;
		
		Scanner scanner = new Scanner( System.in  );
		
		System.out.print("금액 : ");
		crtMoney=scanner.nextInt();
		
		for(int i=0;i<MONEYS.length;i++){
			amount=crtMoney/MONEYS[i];
			crtMoney=crtMoney%MONEYS[i];
				
			if(amount!=0)
				System.out.println(MONEYS[i] +"원 "+ amount+"개");		
		}
	
		
 	}
}