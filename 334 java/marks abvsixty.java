/*
AIM :
To write a Java program to display the names and marks of students who scored 60 or above.

ALGORITHM :
Step 1: Start the program.
Step 2: Declare arrays to store student names and marks.
Step 3: Read the name and marks of 6 students.
Step 4: Store each student's name and marks in the respective arrays.
Step 5: Traverse the arrays and check whether the marks are greater than or equal to 60.
Step 6: If the marks are 60 or above, display the student's name and marks.
Step 7: Repeat the process for all 6 students.
Step 8: Stop the program.
*/

import java.util.Scanner;
public class marks_abvsixty
{
public static void main(String args[])
{
int marks[]=new
int[6];int I;
String name[]=new String[30];
Scanner scanner=new Scanner(system.in);
for(i=0;i<6;i++)
{
System.out.print("enter name of student and marksof subject"+(i+1)+":");
name[i]=Scanner.next();
marks[i]=Scanner.nextInt();
}
for(i=0;i<6;i++)
{
if(marks[i]>=60)
{
System.out.print(name[i]+""+ marks[i]);
}
}
}
}
/*
OUTPUT :
enter name of student and marksof subject1:
Rahul 75
enter name of student and marksof subject2:
Priya 55
enter name of student and marksof subject3:
Arun 80
enter name of student and marksof subject4:
Kiran 45
enter name of student and marksof subject5:
Ravi 65
enter name of student and marksof subject6:
Anu 50
Rahul75
Arun80
Ravi65

RESULT :
The program successfully displays the names and marks of students who scored 60 or above.
*/
