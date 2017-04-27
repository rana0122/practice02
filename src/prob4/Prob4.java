package prob4;
public class Prob4 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		/* 코드를 완성합니다 */
		char []cs = str.toCharArray();
		char c;
		for(int i=0;i<(cs.length/2);i++){
				c=cs[i];
				cs[i]=cs[cs.length-1-i];
				cs[cs.length-1-i]=c;
		}
		return cs;
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */
		for(int i =0;i<array.length;i++)
			System.out.print(array[i]);
		System.out.println();
	}
	
}
