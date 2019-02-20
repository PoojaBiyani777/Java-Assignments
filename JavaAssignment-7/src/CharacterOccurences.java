import java.io.*;
import java.util.Arrays;
import java.util.logging.Logger;

public class CharacterOccurences {

    static Logger logger = Logger.getLogger(CharacterOccurences.class.getName());
    private static final int MAX_CHAR = 256 ;

    public static void main(String[] args) throws FileNotFoundException,IOException {
        BufferedReader br = null;
        try {
            int length = 0;
            String argsString = Arrays.toString(args);
            String filePath = argsString.substring(1, argsString.length() - 1);
            logger.info("Given file name is "+filePath);

            File file = new File(filePath);
            br = new BufferedReader(new FileReader(file));
            String st;
            String str = "";

            while ((st = br.readLine()) != null) {
                System.out.println(st);
                length++;
                str += st;
            }
            logger.info("String is : " + str);

            int count[] = new int[MAX_CHAR];
            int len = str.length();
            // Initialize count array index
            for (int i = 0; i < len; i++)
                count[str.charAt(i)]++;

            // Create an array of given String size
            char ch[] = new char[str.length()];
            for (int i = 0; i < len; i++) {
                ch[i] = str.charAt(i);
                int find = 0;
                for (int j = 0; j <= i; j++) {

                    // If any matches found
                    if (str.charAt(i) == ch[j]) {
                        find++;
                    }
                }

                if (find == 1) {
                    System.out.println("Number of Occurrence of " +
                            str.charAt(i) + " is:" + count[str.charAt(i)]);
                }

            }
        } catch (Exception e) {
            System.out.println("IO Exception exists here!!!");
        } finally {
            br.close();
        }

    }
}
