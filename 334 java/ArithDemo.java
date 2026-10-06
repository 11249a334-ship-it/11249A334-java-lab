/*
Aim :
     To write a Java program to demonstrate the use of multiple user-defined packages for arithmetic operations.

Algorithm :
Step 1: Import the required packages add, sub, mul, and div.
Step 2: Create objects for the classes Add, Sub, Mul, and Div.
Step 3: Call the addop() method to perform addition.
Step 4: Call the subop() method to perform subtraction.
Step 5: Call the mulop() method to perform multiplication.
Step 6: Call the divop() method to perform division.
Step 7: Display the results.
*/

import java.util.*;
import add.*;
import sub.*;
import mul.*;
import div.*;
public class ArithDemo
{
public static void main(String args [])
{
Add ad= new Add();
Sub su= new Sub();
Mul mu= new Mul();
Div di= new Div();
ad.addop(20,10);
su.subop(20,10);
mu.mulop(20,10);
di.divop(20,10);
}
}
/*
Output :
     Add:30
     Sub:10
     Mul:200
     Div:2
Result :
      Thus, the Java program to perform arithmetic operations using multiple user-defined packages was successfully executed.
*/
