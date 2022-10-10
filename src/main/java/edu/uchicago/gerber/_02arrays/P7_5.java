package edu.uchicago.gerber._02arrays;
import java.io.*;
import java.util.*;

public class P7_5 {
    public String[][] table;

    public void read_file(String filename){
        BufferedReader b = null;
        int i = 0;
        try{
            b= new BufferedReader(new FileReader(filename));
            while (b.readLine()!=null){
                String l = b.readLine();
                String[] store =l.split(",");
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
    public int numberOfRows(){
        return table.length;
    }
    public int numberOfFields(int row){
        return table[row].length;
    }
    public String field(int row, int column){
        return table[row][column];
    }
}
