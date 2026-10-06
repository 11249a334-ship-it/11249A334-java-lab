/*
Aim :
To write a Java program to demonstrate the yield(), stop(), and sleep() methods in threads.

Algorithm :
Step 1: Create three thread classes A, B, and C by extending Thread.
Step 2: In thread A, use yield() to temporarily give control to another thread.
Step 3: In thread B, use stop() to terminate the thread.
Step 4: In thread C, use sleep() to pause the thread for 1500 milliseconds.
Step 5: Create objects for threads A, B, and C.
Step 6: Start all three threads using the start() method.
Step 7: Display the thread execution.
*/


import java.io.*;
class A extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
if(i==1)
yield();
System.out.println("From Thread A i="+i);
}
System.out.println("Exit from A");
}
}
class B extends Thread
{
public void run()
{
for(int j=1;j<=5;j++)
{
System.out.println("From Thread B j="+j);
if(j==3)
System.out.println("Exit from B");
stop();
}
}
}
class C extends Thread
{
public void run()
{
for(int k=1;k<=5;k++)
{
System.out.println("Thread c=" + k);
if(k==1)
try
{
sleep(1500);
}
catch(Exception c)
{
System.out.println("Exit from c");
}
}
}
}
class Threadtest
{
public static void main(String [] args)
{
A a=new A();
B b=new B();
C c=new C();
System.out.println("Start thread A");
a.start();
b.start();
c.start();
System.out.println("Exit from main thread");
}
}
/*
Output :
Start thread A
Exit from main thread
From Thread A i=1
From Thread A i=2
From Thread A i=3
From Thread A i=4
From Thread A i=5
Exit from A
From Thread B j=1
From Thread B j=2
From Thread B j=3
Exit from B
Thread c=1
Thread c=2
Thread c=3
Thread c=4
Thread c=5

Result :
Thus, the Java program to demonstrate yield(), stop(), and sleep() thread methods was successfully executed.
*/
