/*
AIM :
To write a Java program to search for an element in an array using Binary Search.

ALGORITHM :
Step 1: Start the program.
Step 2: Read the number of elements n.
Step 3: Read the elements of the array.
Step 4: Read the element x to be searched.
Step 5: Set first = 0 and last = n-1.
Step 6: Find the middle position using mid = (first+last)/2.
Step 7: If a[mid] > x, set last = mid-1.
Step 8: If a[mid] < x, set first = mid+1.
Step 9: If a[mid] == x, display "element found".
Step 10: Repeat Steps 6–9 until the element is found or first > last.
Step 11: If the element is not found, display "element not found".
Step 12: Stop the program.
*/

import java.util.Scanner;
class binarysearch
{
public static void main(String args[])
{
int i,mid,first,last,x,n,flag=0;
Scanner sc=new Scanner(System.in);
System.out.print("enter number of elements:");
n=sc.nextInt();
int a[]=new int[n];
System.out.print("enter elements of array:");
for(i=0;i<n;i++)
a[i]=sc.nextInt();
System.out.println("enter element to search:");
x=sc.nextInt();
first=0;
last=n-1;
while(first<=last)
{
mid=(first+last)/2;
if(a[mid]>x)
last=mid-1;
else
if(a[mid]<x)
first=mid+1;
else
{
flag=1;
System.out.println("element found");
break;
}
}
if(flag==0)
System.out.println("element not found");
}
}
/*
OUTPUT :
enter number of elements:5
enter elements of array:10 20 30 40 50
enter element to search:
30
element found 

RESULT :
The program successfully searches for an element in an array using the Binary Search technique.
*/
