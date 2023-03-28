/**
 * @class: MyAssignment
 * @author: Joseph Amnicki
 * @course: ITEC-2140 - 04 Spring, 2023
 * @written: March 27, 2023
 * @description: This class will include 11 different methods which are called through the main method.
 */
public class MyAssignment {
    public String reverseDoubleChar(String word){
        //method will print the string in reverse with each character repeated
        String str = "";
        for(int i = 1; i <= word.length(); i++){
            str = str + word.charAt(word.length()-i) + word.charAt(word.length()-i);
            //continues to add each character twice until the entire string is reached
        }
        return str;
    }

    public int sumDigits(int n) {
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

    public String birthdayName(String name){
        //method will print "Happy Birthday !" with the given name
        return "Happy Birthday " + name + "!";
    }

    public String missingFront(String str){
        //method prints out a string without the first three characters
        return str.substring(3);
    }

    public String swapEnds(String st) {
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

    public String nonStart(String a, String b) {
        //combines two strings into one string without the first character of each string
        a = a.substring(1);
        b = b.substring(1);
        return a + b;
    }

    public int fibonacci(int n) {
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

    public int luckySum(int one, int two, int three) {
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

    public boolean powerOfTwo(int n) {
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

    public String everyOther(String so){
        //prints out a given string with every other character in the string
        String result = "";
        for(int i = 0; i < so.length(); i += 2){
            //keeps looping and adding every other character until the end of the string
            result += so.charAt(i);
        }
        return result;
    }

    public boolean hasPalindrome(String ok){
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
        MyAssignment object = new MyAssignment();

        String word = "house";
        object.reverseDoubleChar(word);
        System.out.println(object.reverseDoubleChar(word));

        object.sumDigits(112);
        System.out.println(object.sumDigits(112));

        String name = "Joseph";
        object.birthdayName(name);
        System.out.println(object.birthdayName(name));

        String str = "kazoo";
        object.missingFront(str);
        System.out.println(object.missingFront(str));

        String st = "guitar";
        object.swapEnds(st);
        System.out.println(object.swapEnds(st));

        String a = "cheese";
        String b = "pizza";
        object.nonStart(a, b);
        System.out.println(object.nonStart(a, b));

        object.fibonacci(30);
        System.out.println(object.fibonacci(30));

        int one = 12;
        int two = 3;
        int three = 9;
        object.luckySum(one, two, three);
        System.out.println(object.luckySum(one, two, three));

        object.powerOfTwo(12);
        System.out.println(object.powerOfTwo(12));

        String so = "music";
        object.everyOther(so);
        System.out.println(object.everyOther(so));

        String ok = "a nut for a jar of tuna";
        object.hasPalindrome(ok);
        System.out.println(object.hasPalindrome(ok));
    }
}
