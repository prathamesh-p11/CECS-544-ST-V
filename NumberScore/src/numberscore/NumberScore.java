/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberscore;

/**
 *
 * @author prathamesh
*/
import java.util.Scanner;

public class NumberScore {

	int numb ;
	int count, counterforeven,doublecount,remaincount = 0;
	int score;
	String tempstring,numberstring = "" ;
	
	public void score(int number)
	{
		
		tempstring = Integer.toString(number);
		numberstring = Integer.toString(number);			
	//****************************
		while(number != 0)
		{
			
			
			numb = number%10;
			
			
			if(numb%2 == 0 || numb == 0)
			{
				
				counterforeven = counterforeven + 4;
			}
			
			
			if(numb == 7)
			{
				
				count++;
			}
			
			number = number/10;
		}
		//****************************
		score = count ;
		
		
		
		//****************************
		
		if(number%3 == 0)
		{
			score = score+2 ;
		}
		
		
		//****************************
		
		score = score + counterforeven ;
		
		
		
		//****************************
		
		for(int i = 0 ; i<numberstring.length()-1 ; i++)
		{
			tempstring = numberstring ;
			System.out.println(tempstring);
		//	System.out.println(tempstring);
		//	System.out.println(numberstring);
			if(numberstring.charAt(i)==numberstring.charAt(i+1))
			{
				
					doublecount = +3 ;
					
					//	tempstring = numberstring.replace(tempstring.substring(i, i+1), "*");
						tempstring = 	numberstring.replace(numberstring.substring(i, i+2),  "**");
						System.out.println(tempstring);
						
					for(int j = 0 ; j < tempstring.length() ; j++)
				{
						
					
					if(tempstring.charAt(j)==5)
					{
						System.out.println("*******");
						remaincount = remaincount +3 ;
					}
				}
			}
			
		}
		
		
		
		
		//****************************
		score = score + doublecount + remaincount ;
		
		System.out.println(score);
	}
	
	
	
	public int sequence(int numbers)
	{
		int numb = numbers ;
		int length = 0 ;
		int digit ;
		int seq = 0;
		int sum = 0;
		//Find the length of the interger number
		
		while(numb != 0)
		{
			numb = numb/10 ;
			length++ ;
		}
		
                //System.out.println("Length"+length);
                
		int lengths = length ;
		int[] arr = new int[length];
		numb = numbers;
                //System.out.println("numb"+numb);
                
		while(numb != 0)
		{       
                	digit = numb % 10 ;
			numb = numb/10 ;
			arr[length-1] = digit ;
			length-- ;
		}
                
                /*System.err.println("ARRAY =>");
                for(int i=0;i<length;i++)
                {
                    System.out.println(arr[i] + " ");
                }
                */
                
                //System.err.println(arr[0]+arr[1]);
                
                
		int j = 0;
		for(int i = 0;i<lengths ; i++)
		{
			while(arr[i] == (arr[i+1]+1)  && i<=length)
			{
				seq++ ; //2
				i++; //3
				System.out.println("i=  " + i);
			}
			sum = sum + (seq+1)*(seq+1) ;
			seq = 0 ;
		}

                System.out.println(sum);
        return 0 ;
	}
	public static void main(String[] args) {
		
System.out.println("Enter the number");

Scanner scan = new Scanner(System.in);

int a = scan.nextInt();

NumberScore num = new NumberScore();
num.sequence(a);
		
		
	}

}
