package edu.uchicago.gerber._07streams.E19_16;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFile {
    //Read all words in a file and group them by the first letter (in lowercase). Print the
    //average word length for each initial letter. Use collect and Collectors.groupingBy.
    public static void read(String filename){
        File file = new File(filename);
        ArrayList<String> arrays = new ArrayList<>();

        try(Scanner s = new Scanner(file);){
            while(s.hasNext()){
                arrays.add(s.next());
            }
            Stream<String> streams = arrays.stream();
            Map<String,Double> letterGroup =streams.collect(Collectors.groupingBy(str->str.toString().toLowerCase().substring(0,1),
                    Collectors.averagingDouble(String::length)));
            for(Map.Entry<String,Double> entry : letterGroup.entrySet()){
                System.out.println("key= "+entry.getKey()+"  value= "+entry.getValue());

            }


        }catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.println("Exception Occurs: "+e.getMessage());
        }
//        Scanner s =  new Scanner(file);

    }

    public static void main(String[] args) {
        read("C:\\Users\\yijia chen\\Desktop\\projava-freyablue-master\\src\\main\\java\\edu\\uchicago\\gerber\\_07streams\\E19_7\\test");

    }

}
