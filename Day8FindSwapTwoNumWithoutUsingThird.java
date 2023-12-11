/* I/P: a=10
 *      b=20
 *      
 * O/P: b=10
 *      a=20     
 * 
 */
package main1;

public class Day8FindSwapTwoNumWithoutUsingThird {
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		System.out.println("before swapping two num:\n A = "+a+" \n B = "+b);
		
		a=a+b; //10+20=30
		b=a-b; //30-20=10
		a=a-b; //30-10=20
		
		System.out.println("after swapping two num:\n A = "+a+"\n B = "+b);
	}

}
