package javasecondtime;

import java.util.Scanner;
import java.io.*;
public class JavaSecondTime { 
    public static void main(String[] args) throws IOException{
        try {
            File file = new File(args[0]);
            Scanner in = new Scanner(file);

            int quant=0;
            while (in.hasNext()){
                quant++;
                in.next();
            }
            in.close();
            System.out.println(quant);
        }catch(IllegalArgumentException e){
            throw e;
        }

    }
       }

