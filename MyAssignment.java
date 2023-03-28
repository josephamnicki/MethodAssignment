/**
 * @class: MyAssignment
 * @author: Joseph Amnicki
 * @course: ITEC-2140 - 04 Spring, 2023
 * @written: March 27, 2023
 * @description: This class will include 11 different methods which are called through the main method.
 */
public class MyAssignment {

    public static String reverseDoubleChar(String word){
        //method will print the string in reverse with each character repeated
        String str = "";
        for(int i = 1; i <= word.length(); i++){
            str = str + word.charAt(word.length()-i) + word.charAt(word.length()-i);
            //continues to add each character twice until the entire string is reached
        }
        return str;
    }

    public static int sumDigits(int n) {
        //method will find the sum of a number's digits (ex:12 = 1+2 = 3)
        if (n == 0) {
            return 0;
        } else {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            return sum;
        }
    }

    public static String birthdayName(String name){
        //method will print "Happy Birthday !" with the given name
        return "Happy Birthday " + name + "!";
    }

    public static String missingFront(String str){
        //method prints out a string without the first three characters
        return str.substring(3);
    }

    public static String swapEnds(String st) {
        //swaps the first character of a string with the last character and vice versa
        if(st.length() <= 1){
            return st;
            //will print the string if it is only one character
        }else{
            char front = st.charAt(st.length() - 1);
            String middle = st.substring(1, st.length() - 1);
            char end = st.charAt(0);
            return front + middle + end;
        }
    }

    public static String nonStart(String a, String b) {
        //combines two strings into one string without the first character of each string
        a = a.substring(1);
        b = b.substring(1);
        return a + b;
    }

    public static int fibonacci(int n) {
        //continues the fibonacci sequence until the nth term
        int a = 0;
        int b = 1;
        int c = 0;

        for(int i = 0; i < n; i++){
            a = b;
            b = c;
            c = a + b;
        }
        return c;
    }

    public static int luckySum(int one, int two, int three) {
        //sums each number together unless one of the numbers is 13
        if(one == 13){
            return 0;
            //results from first number being 13
        }else if(two == 13){
            return one;
            //results from second number being 13
        }else if(three == 13){
            return one + two;
            //results from third number being 13
        }else{
            return one + two + three;
            //results if neither number is 13
        }
    }

    public static boolean powerOfTwo(int n) {
        //returns if a value is a power of two
        if (n == 0) {
            return false;
            //returns false if n = 0
        } else {
            do {
                if (n == 1) {
                    return true;
                    //returns true if n = 1
                } else if (n % 2 != 0) {
                    return false;
                    //only returns true if n % 2 = 0 or if n = 1
                }
                n /= 2;
            } while (true);
        }
    }

    public static String everyOther(String so){
        //prints out a given string with every other character in the string
        String result = "";
        for(int i = 0; i < so.length(); i += 2){
            //keeps looping and adding every other character until the end of the string
            result += so.charAt(i);
        }
        return result;
    }

    public static boolean hasPalindrome(String ok){
        for(int i = 0; i < ok.length(); i++){
            //checks for even length palindromes
            int left = i - 1;
            int right = i + 1;
            while(left >= 0 && right < ok.length() && ok.charAt(left) == ok.charAt(right)){
                //only returns true if both sides share the same character and neither side reaches
                //outside the string length
                return true;
            }
            left = i;
            right = i + 1;
            while(left >= 0 && right< ok.length() && ok.charAt(left) == ok.charAt(right)){
                //checks for odd length palindromes with same length conditions as before
                return true;
            }
        }
        return false;
        //will return false unless true in the loops
    }

    public static void main(String[] args) {
        String word = "house";
        reverseDoubleChar(word);

        sumDigits(112);

        String name = "Joseph";
        birthdayName(name);

        String str = "kazoo";
        missingFront(str);

        String st = "guitar";
        swapEnds(st);

        String a = "cheese";
        String b = "pizza";
        nonStart(a, b);

        fibonacci(30);

        int one = 12;
        int two = 3;
        int three = 9;
        luckySum(one, two, three);

        powerOfTwo(12);

        String so = "music";
        everyOther(so);

        String ok = "a nut for a jar of tuna";
        hasPalindrome(ok);
    }
}
