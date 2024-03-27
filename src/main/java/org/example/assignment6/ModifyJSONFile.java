package org.example.assignment6;

import java.io.*;
import java.util.*;

import org.json.simple.*;
import org.json.simple.parser.*;

public class ModifyJSONFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path of the JSON file:");
        String inputFilePath = scanner.nextLine();

        try {
            // Read JSON content from input file
            FileReader fileReader = new FileReader(inputFilePath);
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(fileReader);


            modifyJSONContent(jsonObject);


            saveToFile(jsonObject);

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        scanner.close();
    }


    private static void modifyJSONContent(JSONObject jsonObject) {
        // Modify values of any two keys
        jsonObject.put("1", "Amulya");
        jsonObject.put("2", "Jangiti");
    }


    private static void saveToFile(JSONObject jsonObject) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path to save the modified JSON file:");
        String outputFilePath = scanner.nextLine();
        scanner.close();

        try (FileWriter fileWriter = new FileWriter(outputFilePath)) {
            fileWriter.write(jsonObject.toJSONString());
            System.out.println("Modified JSON saved to " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
