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
