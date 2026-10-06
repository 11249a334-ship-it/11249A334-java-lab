/*
Aim :
   To create a Java package named mul and define a class Mul to perform multiplication of two numbers.

Algorithm :
step 1: Create a package named mul.
step 2: Define a class Mul.
step 3: Declare an integer variable res.
step 4: Create a method mulop() that accepts two integers.
step 5: Multiply the two numbers.
step 6: Store the result in res.
step 7: Display the multiplication result.

*/

package mul;
public class Mul
{
int res;
public void mulop(int a,int b)
{
res=a*b;
System.out.println("Mul:" + res);
}
}
/*
Output :
      For a = 10 and b = 5:
       Mul:50

Result :
      Thus, the Java program to create a package and perform multiplication of two numbers was successfully executed
*/
