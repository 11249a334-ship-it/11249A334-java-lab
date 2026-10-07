/*
AIM :
To write a Java program to check whether a given number is an Armstrong number or not.

ALGORITHM :
Step 1: Start the program.
Step 2: Read the number n.
Step 3: Store n in nu and initialize num = 0.
Step 4: Find the remainder using rem = nu % 10.
Step 5: Add the cube of the remainder to num.
Step 6: Divide nu by 10 and repeat until nu becomes 0.
Step 7: Compare num with n.
Step 8: If both are equal, display "Armstrong Number".
Step 9: Otherwise, display "Not an Armstrong number".
Step 10: Stop the program.
*/

import java.util.Scanner;
public class armstrong{
public static void main(String [] args){
int n,nu,num=0,rem;
Scanner scan=new Scanner(System.in);
System.out.println("Enter any positive number:");
n=scan.nextInt();
nu=n;
while(nu!=0)
{
rem=nu%10;
num=num+rem*rem*rem;
nu=nu/10;
}
if(num==n)
{
System.out.println("Armstrong Number");
}
else
{
System.out.println("Not an Armstrong number");
}
}
}
/*
OUTPUT :
Enter any positive number: 153
Armstrong Number

RESULT :
The program was successfully executed to check whether the given number is an Armstrong number.
*/
