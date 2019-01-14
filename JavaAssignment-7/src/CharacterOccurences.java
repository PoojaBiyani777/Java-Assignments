import java.sql.SQLOutput;
import java.io.*;
public class CharacterOccurences {
    private static final int MAX_CHAR = 256 ;

    public static void main(String args[]) throws FileNotFoundException
    {
        int length=0;
        String argsString="";

        for(int i=0;i<args.length;i++){
            argsString+=args[i];
        }
        System.out.println("Given file name path is : "+argsString);

        File file=new File(argsString);
        BufferedReader br=new BufferedReader(new FileReader(file));
        String st;
        String str="";
        try {
            while ((st = br.readLine()) != null) {
                System.out.println(st);
                length++;
                str+=st;

            }
            System.out.println("String is : "+str);

            int count[] = new int[MAX_CHAR];

            int len = str.length();
            System.out.println("Length is : "+len);

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
                    if (str.charAt(i) == ch[j])
                        find++;
                }

                if (find == 1)
                    System.out.println("Number of Occurrence of " +
                            str.charAt(i) + " is:" + count[str.charAt(i)]);
            }
        }

        catch(Exception e){
            System.out.println("IO Exception exists here!!!");
        }

    }
}
