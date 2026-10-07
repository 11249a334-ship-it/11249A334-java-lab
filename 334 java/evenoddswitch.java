/*
AIM :
To write a Java program to check whether a given number is even or odd using a switch statement.

ALGORITHM :
Step 1: Start the program.
Step 2: Read a number n.
Step 3: Find the remainder using n % 2.
Step 4: If the remainder is 0, display "this number is even".
Step 5: If the remainder is 1, display "this number is odd".
Step 6: Stop the program.
*/

import java.util.Scanner;
class evenoddswitch
{
public static void main(String args[])
{
int n,i;
Scanner s=new
Scanner(System.in);
System.out.println("enter a number");
n=s.nextInt();
switch(n%2)
{
case 0:
System.out.println("this number is even");
break;
case 1:
System.out.println("this number is odd");
break;
}
}
}
/*
OUTPUT :
enter a number
10
this number is even

RESULT :
The program successfully checks whether the given number is even or odd using switch statement.
*/
