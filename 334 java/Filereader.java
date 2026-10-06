/*
Aim :
    To write a Java program to read and display the contents of a file using FileReader.

Algorithm :
Step 1: Import the java.io package.
Step 2: Create a FileReader object for sample2.txt.
Step 3: Read the file character by character.
Step 4: Display each character on the screen.
Step 5: Close the file after reading.
Step 6: Handle any exception using try-catch.
*/

import java.io.*;
class Filereader
{
public static void main(String [] args)
{
try
{
FileReader fr=new FileReader("sample2.txt");
int i;
while((i=fr.read())!=-1)
{
System.out.println((char)i);
}
fr.close();
}
catch(Exception e)
{
System.out.println("Exception:"+e);
}
}
}
/*
Output :
     If sample2.txt contains ABCDEFGHIJKLMNOPQRSTUVWXYZ:
A
B
C
D
E
F
G
H
I
J
K
L
M
N
O
P
Q
R
S
T
U
V
W
X
Y
Z

Result :
       Thus, the Java program to read and display the contents of a file using FileReader was successfully executed.
*/
