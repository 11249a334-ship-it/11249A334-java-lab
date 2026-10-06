/*
Aim :
To write a Java program to generate the Fibonacci series up to 10 terms.

Algorithm :
Step 1: Initialize n1 = 0, n2 = 1, and count = 10.
Step 2: Display the first two Fibonacci numbers.
Step 3: Calculate the next number by adding n1 and n2.
Step 4: Display the calculated number.
Step 5: Assign n2 to n1 and the new number to n2.
Step 6: Repeat the steps until 10 terms are generated.
*/

class a{
public static void main(String [] args){
int n1=0,n2=1,count=10;
System.out.println("Fibonacci:"+n1+" "+n2);
for(int i=2;i<count;i++)
{
int n3=n1+n2;
System.out.println(" "+n3);
n1=n2;
n2=n3;
}
}
}
/*
Output :
Fibonacci:0 1
 1
 2
 3
 5
 8
 13
 21
 34
 
Result :
Thus, the Java program to generate the Fibonacci series was successfully executed.
*/
