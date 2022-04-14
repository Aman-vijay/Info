package classwork;

import java.util.*;

public class Q8Palindrome {
    public static boolean Pal(String str){

        if(str.length() == 0 || str.length() == 1)
            return true;

        if(str.charAt(0) == str.charAt(str.length()-1))
           
            return Pal(str.substring(1, str.length()-1));

      
        return false;
    }

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String string = scan.nextLine();

        if(Pal(string))
            System.out.println(string + " is a palindrome");
        else
            System.out.println(string + " is not a palindrome");
    }
}
