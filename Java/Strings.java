package Java;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        //string declaration
        String name = "priyanka";

        //from user 
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter name:");
        String firstName = sc.nextLine();

        //concatenation
        System.out.println(name + " " + firstName);

        //length
        System.out.println(name.length());

        //charAt
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
        }
        System.out.println();

        //compareTo
        if (name.compareTo(firstName) == 0) {
            System.out.println("both are equal");
        }
        else{
            System.out.println("strings are not equal");
        }

        //substring
        String sub = name.substring(0, 5);
        System.out.println(sub);

        //int to string
        int numb = 123;
        String str = Integer.toString(numb);
        System.out.println(str);

        //str to int
        String lastName = "123";
        int number = Integer.parseInt(lastName);
        System.out.println(number);
        
    }
    
}
