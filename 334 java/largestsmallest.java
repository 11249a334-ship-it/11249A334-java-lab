/*
AIM :
To write a Java program to find the sum, largest number, and smallest number in an array.

ALGORITHM :
Step 1: Start the program.
Step 2: Declare and initialize an integer array.
Step 3: Initialize sum = 0, min = a[0], and max = a[0].
Step 4: Traverse the array from the second element.
Step 5: If the current element is greater than max, assign it to max.
Step 6: If the current element is smaller than min, assign it to min.
Step 7: Add each element to sum.
Step 8: Display the sum of the array elements.
Step 9: Display the largest number in the array.
Step 10: Display the smallest number in the array.
Step 11: Stop the program.
*/

import java.util.Scanner;
public class largestsmallest
{
public static void main(String args[])
{
int a[]=new int[] {23,34,13,64,72,90,10,15,9,27};
int sum=0;
int min=a[0];
int max=a[0];
for(int i=1;i<a.length;i++)
{
if(a[i]>max)
{
max=a[i];
}
if (a[i]<min)
{
min=a[i];
}
sum=sum+a[i];
}
System.out.println("the sum is:" + sum);
System.out.println("largest number in a given array is:" + max);
System.out.println("smallest number in a given array is:" + min);
}
}
/*
OUTPUT :
the sum is:357
largest number in a given array is:90
smallest number in a given array is:9

RESULT :
The program successfully finds the sum, largest number, and smallest number in the given array.
*/
