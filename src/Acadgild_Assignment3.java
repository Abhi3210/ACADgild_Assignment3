import java.util.*;
public class Acadgild_Assignment3 {
        public static void main(String args[]){
        	byte a,b;
        	Scanner sc=new Scanner(System.in);
        	for(int i=0;i<4;i++){
        		System.out.println("Enter the value of a,b :");
        		a=sc.nextByte();
        		b=sc.nextByte();
        		System.out.println(" value of a :"+a);
        		System.out.println(" value of b :"+b);
        		System.out.println("BITWISE AND OPERATOR ");
        		System.out.println(a&b);
        		System.out.println("LOGICAL AND OPERATOR ");
        		System.out.println(a>=1 && b>0);
        	}
        }
}
