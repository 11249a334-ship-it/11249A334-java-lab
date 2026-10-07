/*
AIM :
To write a Java program to check whether a given number is an Armstrong number or not.

ALGORITHM :
Step 1: Start the program.
Step 2: Read a positive number n.
Step 3: Store n in nu and initialize num = 0.
Step 4: Find the remainder using rem = nu % 10.
Step 5: Add the cube of the remainder to num.
Step 6: Remove the last digit using nu = nu / 10.
Step 7: Repeat Steps 4–6 until nu becomes 0.
Step 8: Compare num with the original number n.
Step 9: If both are equal, display "Armstrong Number".
Step 10: Otherwise, display "Not an Armstrong number".
Step 11: Stop the program.
*/

import java.util.Scanner;
public class ascendingorder
{
public static void main(String[]args)
{
int n,temp;
Scanner s=new Scanner(System.in);
System.out.print("eneter no.of elements you want in array:");
n=s.nextInt();
int a[]=new int[n];
System.out.println("enter all the elements:");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
for (int j=i+1;j<n;j++)

{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.print("AscendingOrder:");
for(int i=0;i<n-1;i++)
{
System.out.print(a[i]+",");
}
System.out.print(a[n-1]);
}
}
/*
OUTPUT :
eneter no.of elements you want in array:5
enter all the elements:
50
20
40
10
30
AscendingOrder:10,20,30,40,50

RESULT :
The program successfully arranges the given array elements in ascending order.
*/
