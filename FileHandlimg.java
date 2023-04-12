import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlimg {
    public static void main(String[] args) {
        File myfile = new File("test.txt");
        
        try{
            FileWriter myfile2 =  new FileWriter("copy.txt");
            // myfile.createNewFile();
            Scanner reader = new Scanner(myfile);

            while(reader.hasNextLine()){
                String data =  reader.nextLine();
                myfile2.write(data+"\n");
               

            }
            reader.close();
            myfile2.close();

        }

        catch(IOException e){
            System.out.println("ERROR!!!!!!!!!!!!!!!!!");
            System.out.println(e);
        }
    }
}
