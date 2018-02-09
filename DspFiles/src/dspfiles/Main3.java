
package dspfiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Main3 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        InputStream inputStream  = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferReader = new BufferedReader(inputStreamReader);
        //int  i = inputStream.read();
        //int t = inputStreamReader.read();
        System.out.println("Digite algo: ");
        String line = bufferReader.readLine();
        while(line != null){
            
            System.out.println(line);
            System.out.println("Digite algo: ");
            line = bufferReader.readLine();
        }
        
        //shift + f6
        
    }
    
}
