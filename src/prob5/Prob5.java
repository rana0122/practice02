package prob5;

import java.util.*;

public class Prob5 {

	public static void main(String[] args) {
		
		int max=100;
		int min=1;
		int guessNum;
		int i=1;
		
		Random r =new Random();
		Scanner scanner =  new Scanner(System.in);
		

		int correctNum =r.nextInt(100)+1;//0~99까지 나오므로 +1
		System.out.println("수를 결정하였습니다. 맞추어 보세요.ㅎㅎ");
		
		while(true){
			System.out.println(correctNum);
			System.out.println(min+"-"+max);
			System.out.print(i+">>");
			guessNum=scanner.nextInt();
			scanner.nextLine();
				
			
			if(guessNum==correctNum){
				System.out.println("맞았습니다.");
				System.out.println("다시 하시겠습니까?");
				String answer = scanner.next();
				
				if(answer.equals("n")){
					return;
				}else{
					correctNum =r.nextInt(100)+1;
				}
				i=0;
				max=100;
				min=0;
			}else if(guessNum<correctNum){
				System.out.println("더 높게");
				min=guessNum;
			}else if(guessNum>correctNum){
				System.out.println("더 낮게");
				max=guessNum;
			}
			
			i++;
		}
		
		
	
	}
	}
