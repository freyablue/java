package edu.uchicago.gerber._02arrays;
import java.io.*;
import java.util.*;

public class P7_5 {

    public static int i = 0;
    public static String[][] table = new String[1000][1000];
    public static void read_file(String filename){
        BufferedReader b = null;
        try{
            String l;
            b= new BufferedReader(new FileReader(filename));
            while ((l = b.readLine())!=null){
                String[] store =l.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                table[i++] = store;
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            try {
                b.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static int numberOfRows(){
        return i;
    }
    public static int numberOfFields(int row){
        return table[row].length;
    }
    public static String field(int row, int column){
        return table[row][column];
    }

    public static void main(String[] args) {
//        String path = "C:\\Users\\yijia chen\\Desktop\\projava-freyablue-master\\src\\main\\java\\edu\\uchicago\\gerber\\_02arrays\\test_7_5";
//        read_file(path);
//        System.out.println(numberOfRows());
//        System.out.println(numberOfFields(0));
//        System.out.println(field(0,2));

    }
}
