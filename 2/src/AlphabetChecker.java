import java.util.Scanner;

public class AlphabetChecker{

    public static boolean areAllAlphabetsPresent(String toCheckString) {

        boolean isPresent[] = new boolean[26];
        boolean flag = true;

        // if string is less than 26 characters
        if (toCheckString.length() < 26) {
            flag = false;
            return flag;
        }

        //Assigns boolean value true to indices for corresponding alphabets (0 -> a/A ..... 25 -> z/Z)
        for (int i = 0; i < toCheckString.length(); i++) {
            char character = toCheckString.charAt(i);
            int val = (int) character;
            if (val > 64 && val < 91) {
                isPresent[val - 65] = true;
            } else if (val > 96 && val < 123) {
                isPresent[val - 97] = true;
            }
        }

        // Checks if all the alphabets are present
        for (int i = 0; i < 26; i++) {
            if (!isPresent[i]) {
                flag = false;
                break;
            }
        }
        return flag;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String toCheckString = null;


            while(true) {
                System.out.println("Enter the string to check, -1 to exit");
                toCheckString = scan.nextLine();
                if (toCheckString.equals("-1")) {
                    continue;
                }

                boolean flag = areAllAlphabetsPresent(toCheckString);
                if (flag) {
                    System.out.println("Contains all the alphabets!");
                } else {
                    System.out.println("Does not contain all the alphabets!");
                }
            }
        }
        }
