import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileAbsolutePath {
    public static void main(String args[]) throws Exception {
        File homeDirectory = new File("/home/pooja");   // home directory
        System.out.println("Enter the files Regular Expressions");
        Scanner sc = new Scanner(System.in);
        File[] listOfFiles = homeDirectory.listFiles();    // stores abstract pathnames of all files and  directories present in homeDirectory

        while (sc.hasNext()) {
            int numberOfFiles=0;
            Pattern p = Pattern.compile(sc.next());    // compiles the pattern input
            for (File file : listOfFiles)
                if (file.isFile()) {
                    String fileName = file.getName();
                    Matcher m = p.matcher(fileName);
                    if (m.find()) {
                        System.out.println(file.getAbsolutePath());    // prints the whole path of the matched file
                        numberOfFiles++;
                    }
                }
            if(numberOfFiles==0)
                System.out.println("You don't have files with such Regular Expression! ");
        }
    }
}
/*
1.
Enter the files names
.java
No such files!
    
2.
.js
/home/pooja/genesis.json

3.
.txt
/home/pooja/a.txt
/home/pooja/emp.txt

4.
LMS	
No such files!


*/
