/*
AIM :
To write a Java program to find the largest of three numbers.

ALGORITHM :
Step 1: Start the program.
Step 2: Read three integers x, y, and z.
Step 3: Compare x with y and z.
Step 4: If x is greater than both, display "First number is largest".
Step 5: Otherwise, compare y with x and z.
Step 6: If y is greater than both, display "Second number is largest".
Step 7: Otherwise, compare z with x and y.
Step 8: If z is greater than both, display "Third number is largest".
Step 9: If none of the above conditions are true, display "All are equal".
Step 10: Stop the program.
*/

import java.util.Scanner;
class largestofthreenumbers
{
public static void main(String args[])
{
int x,y,z;
System.out.println("enter three integers");
Scanner in =new Scanner(System.in);
x=in.nextInt();
y=in.nextInt();
z=in.nextInt();
if(x>y&&x>z)
System.out.println("First number is largest");
else if(y>x&&y>z)
System.out.println("Second number is largest");
else if(z>x&&z>y)
System.out.println("Third number is largest");
else
System.out.println("All are equal");
}
}
/*
OUTPUT :
enter three integers
10
25
15
Second number is largest
  
RESULT :
The program successfully finds the largest among three given numbers.
*/
