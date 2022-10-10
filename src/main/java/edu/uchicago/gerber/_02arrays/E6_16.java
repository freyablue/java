package edu.uchicago.gerber._02arrays;
import java.io.*;
import java.util.*;

public class E6_16 {
    public static List<Double> output=new ArrayList<>();
    public static List<Long> nums=new ArrayList<>();
    public static void read_and_print(String filename){
        BufferedReader b = null;
        try{
            Integer m;
            String line;
            b= new BufferedReader(new FileReader(filename));
            Double max = 0.0;
            if ((line = b.readLine())!=null){
                String[] l =line.split(" ");
                for(String f:l){
                    Double num = new Double(f);
                    output.add(num);
                }

                for(Double d:output) {
                    max = Math.max(max, d);
                }
            }
            for(Double o:output){
                long n = Math.round((o/max)*20);
                nums.add(n);
//                System.out.println(n);
            }
            int[][] stars = new int[20][nums.size()];
            for(int j =0;j<nums.size();j++){
                for (int i =0;i<nums.get(j);i++){
                    stars[i][j]=1;
                }
            }
            for(int s = 19;s>=0;s--){
//
                for(int k=0;k<nums.size();k++){
                    if (stars[s][k]==1){
                        System.out.print('*');
                    }else{
                        System.out.print(' ');
                    }

                }
                System.out.println();
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
    public static void main(String[] args) {
//        String file = "C:\\Users\\yijia chen\\Desktop\\projava-freyablue-master\\src\\main\\java\\edu\\uchicago\\gerber\\_02arrays\\test_16";
//        read_and_print(file);
    }
}
