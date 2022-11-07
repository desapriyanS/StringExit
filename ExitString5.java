package com;
import java.util.Scanner;

public class ExitString5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String choice ;
		Scanner sc= new Scanner(System.in);
		
		String desa=new String();
		while(true){
		    System.out.println("Enter a number or6u to quit");
		    choice = sc.nextLine();

		    if(choice.equals("exit")){
		       break;
		       
		        
		    }
		    
		    desa+=choice;
		} 
	
		
		System.out.println("waith the name "+desa);

	}

}
