package RegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionClass {

    public void regularExpressionMethod(){
        Pattern p= Pattern.compile("[A-Z]{1}[a-zA-z]*[.]{1}");
        Scanner in=new Scanner(System.in);

        while(true) {

            System.out.println("Please Enter the string to be checked!");
            String str = in.next();

            Matcher m = p.matcher(str);
            Boolean b = m.matches();
            System.out.println("String matches the pattern ? \n Ans:- " + b+"\n");
        }
    }

    public static void main(String args[]){
        RegularExpressionClass object=new RegularExpressionClass();
        object.regularExpressionMethod();
    }




}
