package edu.uchicago.gerber._02arrays;
import java.io.*;
import java.util.*;
public class E7_4 {
    public static List<String> output=new ArrayList<String>();
    public static void read_file(String filename){
        BufferedReader b = null;

        try{
            b= new BufferedReader(new FileReader(filename));
            String l;
            while ((l=b.readLine())!=null){
//                System.out.println(l);
                output.add(l);

            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                b.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void output_file(String filename){
        try {
            File myObj = new File(filename);
            if (myObj.createNewFile()) {
                String newLine = System.getProperty("line.separator");
                FileWriter myWriter = new FileWriter(filename);
                for(int j = 0;j<output.size();j++){
                    myWriter.write("/*"+String.valueOf(j+1)+"*/"+output.get(j)+newLine);
                }
                myWriter.close();
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }


    public static void main(String[] args){
        String f = "C:\\Users\\yijia chen\\Desktop\\projava-freyablue-master\\src\\main\\java\\edu\\uchicago\\gerber\\_02arrays\\test.txt";
        read_file(f);
        //output_file("C:\\Users\\yijia chen\\Desktop\\projava-freyablue-master\\src\\main\\java\\edu\\uchicago\\gerber\\_02arrays\\output.txt");
    }
}
