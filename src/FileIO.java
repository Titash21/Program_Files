import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by TITASH MANDAL on 5/7/2017.
 */
public class FileIO {
    public static void main(String[] args){
        InputStream stream=null;
        int read;
        try {
            stream = new FileInputStream("D:\\NYU_SEM_2\\Intro to Java\\Files.docx");
            while ((read=stream.read())!= -1) {
                byte valueRead = (byte) read;
                System.out.printf("%s Read byte value", (char)(valueRead));
                System.out.print("\n");
            }
            System.out.println("Single byte reading done. Stream closed!");
        }catch (IOException ioe){
            System.out.printf("Failed to get message %s",ioe.getMessage());
        } finally{
            if(stream!=null){
                try{
                    stream.close();
                }catch (IOException ioe){
                    System.out.printf("%s %n",ioe.getMessage());
                }
            }
        }


        /*// read more than one byte
            try{

                int availableAmount= stream.available();
                if(availableAmount>0){
                    byte[] into=new byte[availableAmount];
                    int reading=stream.read(into,0,into.length);
                    String s = new String(into);
                    System.out.printf("Read %s byte into buffer", s);
                }

            }catch(IOException io){
                System.out.printf("Failed to get message %s", io.getMessage());
            }
            */


        }
    }

