/*
Aim :
   To write a Java program to write characters into a file using FileWriter.
   
Algorithm :
Step 1: Import the java.io package.
Step 2: Create a FileWriter object for sample2.txt.
Step 3: Write characters from A to Z into the file.
Step 4: Close the file after writing.
Step 5: Handle any exception using try-catch.
*/
import java.io.*;
class Filewriter
{
public static void main(String [] args)
{
try
{
FileWriter fw=new FileWriter("sample2.txt");
for(char i=65;i<91;i++)
{
fw.write(i);
}
fw.close();
}
catch(Exception e)
{
System.out.println("Exception:"+e);
}
}
}
/*
Output :
     The file sample2.txt contains:
      ABCDEFGHIJKLMNOPQRSTUVWXYZ

Result :
        Thus, the Java program to write characters into a file using FileWriter was successfully executed.
*/
