/*
Aim :
To write a Java program to demonstrate thread priority using multiple threads.

Algorithm :
Step 1: Create three thread classes A, B, and C by extending Thread.
Step 2: Define the run() method in each thread class.
Step 3: Create objects for threads A, B, and C.
Step 4: Set the priority of thread C to maximum priority.
Step 5: Set the priority of thread A to minimum priority.
Step 6: Set the priority of thread B to one level higher than thread A.
Step 7: Start all three threads using the start() method.
Step 8: Display the execution of the threads.
*/

import java.io.*;
class A extends Thread
{
public void run()
{
System.out.println("Thread A started");
for(int i=1;i<=4;i++)
{
System.out.println("From Thread A i="+i);
}
System.out.println("Exit from A");
}
}
class B extends Thread
{
public void run()
{
System.out.println("Thread B started");
for(int j=1;j<=4;j++)
{
System.out.println("From Thread B j="+j);
}
System.out.println("Exit from B");
}
}
class C extends Thread
{
public void run()
{
System.out.println("Thread C started");
for(int k=1;k<=4;k++)
{
System.out.println("Thread c=" + k);
}
System.out.println("Exit from c");
}
}
class Threadpriority
{
public static void main(String [] args)
{
A threadA=new A();
B threadB=new B();
C threadC=new C();
threadC.setPriority(Thread.MAX_PRIORITY);
threadB.setPriority(threadA.getPriority()+1);
threadA.setPriority(Thread.MIN_PRIORITY);
System.out.println("start thread A");
threadA.start();
System.out.println("start thread B");
threadB.start();
System.out.println("start thread C");
threadC.start();
System.out.println("end of main thread");
}
}

/*
Output :
start thread A
start thread B
start thread C
end of main thread
Thread A started
From Thread A i=1
From Thread A i=2
From Thread A i=3
From Thread A i=4
Exit from A
Thread B started
From Thread B j=1
From Thread B j=2
From Thread B j=3
From Thread B j=4
Exit from B
Thread C started
Thread c=1
Thread c=2
Thread c=3
Thread c=4
Exit from c

Result :
Thus, the Java program to demonstrate thread priority was successfully executed.
*/


