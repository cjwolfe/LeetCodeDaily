
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class FileProcessor{
    private File file;
    private String tempText;
    private String text;
    private Scanner s;

    public FileProcessor(String filePath){
        try {
            this.file = new File(filePath);
            System.out.println("Looking for file at " + file.getAbsolutePath());
            s = new Scanner(this.file);
            while(s.hasNextLine()){
                tempText += s.nextLine();
                //System.out.println(text);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not Found exception");
            System.out.println(Arrays.toString(e.getStackTrace()));

        }
    }

    public String processFile(){
        //handle reading/writing here
        while(s.hasNextLine()){
            tempText += s.nextLine();
            System.out.println(tempText);
        }
        s.close();
        for(Character c : tempText.toCharArray()){
            if(Character.isLetter(c)){
                text += c;
            }
        }
        // handle filtering of text's contents
        return text;
    
    }


}