/*
AIM :
To write a Java program to display the names and marks of students who scored 60 or above.

ALGORITHM :
Step 1: Start the program.
Step 2: Declare an array to store marks of 6 students.
Step 3: Declare an array to store student names.
Step 4: Read the name and marks of 6 students.
Step 5: Store the names and marks in the respective arrays.
Step 6: Check the marks of each student.
Step 7: If the marks are greater than or equal to 60, display the student's name and marks.
Step 8: Repeat the process for all 6 students.
Step 9: Stop the program.
*/

import java.util.Scanner;
public class marks_abvsixty
{
public static void main(String args[])
{
int marks[]=new
int[6];int i;
String name[]=new String[4];
Scanner scanner=new Scanner(System.in);
for(i=0;i<6;i++)
{
System.out.print("enter name of student and marksof subject"+(i+1)+":");
name[i]=scanner.next();
marks[i]=scanner.nextInt();
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
Rahul75Arun80Ravi65

RESULT :
The program successfully displays the names and marks of students who scored 60 or above.
*/
