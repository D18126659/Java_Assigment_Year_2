package Assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Excel_Sheet {

    public List Excel_Sheet() {

        //Setting an arraylist for records
        List<List<String>> records = new ArrayList<>();
        //Telling the array what to find the ML Data for Covid-19
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Sulta\\Desktop\\Java Assignment\\MLData.csv"))) {
            String line;
            //Allowing the program to read line by line of the ML data
            while ((line = br.readLine()) != null) {
                //Making all variables into small lowercase
                String[] values = line.toLowerCase().split(",");
                records.add(Arrays.asList(values));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
            return records;
    }


    }
