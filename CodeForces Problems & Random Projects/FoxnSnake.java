package tester;
import java.util.Scanner;
public class FoxnSnake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner fns = new Scanner(System.in);      
   		int height = fns.nextInt();
   		int length = fns.nextInt();
   		int i = 0;
   		int j = 0;
   		int layers = height/2;
   		int ln = 0;
   		if(height%2==0) {
   			for (j=0;j<layers;j++) {
   				ln ++;
       			for(i=0;i<length-1;i++) {
       	       		System.out.print("#");	
       	       		}
       	       		System.out.println("#");
       	       		if(ln%2==0) {
       	       		System.out.print("#");
       	       			for(i=0;i<length-1;i++) {
       	       	       		System.out.print(".");
       	       	       		}
       	       		}else {
       	       			for(i=0;i<length-1;i++) {
       	       	       		System.out.print(".");
       	       	       		}
       	       		System.out.println("#");
       	       		}
       		} 
   		}else if (height%2!=0){
   			for (j=0;j<layers;j++) {
   				ln ++;
       			for(i=0;i<length-1;i++) {
       	       		System.out.print("#");	
       	       		}
       	       		System.out.println("#");
       	       		if(ln%2==0) {
       	       		System.out.print("#");
       	       			for(i=0;i<length-2;i++) {
       	       	       		System.out.print(".");
       	       	       		}
       	       		System.out.println(".");
       	       		}else{
       	       			for(i=0;i<length-1;i++) {
       	       	       		System.out.print(".");
       	       	       		}
       	       		System.out.println("#");
       	       		}
       		}	
   			for(i=0;i<length;i++) {
   	       		System.out.print("#");	
   	       		}
   		}

	}

}
