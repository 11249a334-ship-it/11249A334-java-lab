/*
Aim:
To write a Java program to perform various string operations such as length, concatenation, case conversion, replacement, comparison, and searching.

Algorithm :
Step 1: Create two strings str1 and str2.
Step 2: Find the length of str1.
Step 3: Concatenate str1 and str2.
Step 4: Convert the string into uppercase and lowercase.
Step 5: Replace "Java" with "World".
Step 6: Append the strings using StringBuilder.
Step 7: Compare the strings using equals() and compareTo().
Step 8: Check whether the string starts with "Hello" and ends with "Java".
Step 9: Find the index positions of "Java" and 'o'.
Step 10: Display all the results.
*/

public class StringOperations {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Java";
        System.out.println("1. Length of str1: " + str1.length());
        String result = str1 + " " + str2;
        System.out.println("2. Concatenation: " + result);
        System.out.println("3. Uppercase: " + result.toUpperCase());
        System.out.println("4. Lowercase: " + result.toLowerCase());
        String replaced = result.replace("Java", "World");
        System.out.println("5. Replace: " + replaced);
        StringBuilder sb = new StringBuilder(str1);
        sb.append(" ");
        sb.append(str2);
        System.out.println("6. Append: " + sb);
        System.out.println("7. Compare using equals: "
                + str1.equals(str2));
        System.out.println("8. Compare using compareTo: "
                + str1.compareTo(str2));
        System.out.println("9. Starts with 'Hello': "
                + result.startsWith("Hello"));
        System.out.println("10. Ends with 'Java': "
                + result.endsWith("Java"));
        System.out.println("11. Index of 'Java': "
                + result.indexOf("Java"));
        System.out.println("12. Index of 'o': "
                + result.indexOf('o'));
    }
}
/*
Output :
1. Length of str1: 5
2. Concatenation: Hello Java
3. Uppercase: HELLO JAVA
4. Lowercase: hello java
5. Replace: Hello World
6. Append: Hello Java
7. Compare using equals: false
8. Compare using compareTo: -2
9. Starts with 'Hello': true
10. Ends with 'Java': true
11. Index of 'Java': 6
12. Index of 'o': 4

Result :
Thus, the Java program to perform various string operations was successfully executed.
*/
