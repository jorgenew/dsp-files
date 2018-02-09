
package dspfiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;


public class Main2 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        InputStream inputStream  = new FileInputStream("arquivo.txt");
        Scanner scanner = new Scanner(inputStream);
        //int  i = inputStream.read();
        //int t = inputStreamReader.read();
        
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
        
    }
    
}
