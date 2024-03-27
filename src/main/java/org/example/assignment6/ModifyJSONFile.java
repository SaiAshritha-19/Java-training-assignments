package org.example.assignment6;

import java.io.*;
import java.util.*;

import org.json.simple.*;
import org.json.simple.parser.*;

public class ModifyJSONFile {

    public static void main(String[] args) {
        // Get input JSON file path from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path of the JSON file:");
        String inputFilePath = scanner.nextLine();

        // Read JSON file and modify its content
        try {
            // Read JSON content from input file
            FileReader fileReader = new FileReader("src/main/resources/input.json");
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(fileReader);

            // Modify JSON content
            modifyJSONContent(jsonObject);

            // Save modified JSON content to output file
            saveToFile(jsonObject);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    // Method to modify JSON content
    private static void modifyJSONContent(JSONObject jsonObject) {
        // Modify values of any two keys
        jsonObject.put("key1", "new_value1");
        jsonObject.put("key2", "new_value2");

        // Add two additional keys and their values
        jsonObject.put("new_key1", "new_value1");
        jsonObject.put("new_key2", "new_value2");
    }

    // Method to save modified JSON content to output file
    private static void saveToFile(JSONObject jsonObject) {
        // Get output file path from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path to save the modified JSON file:");
        String outputFilePath = scanner.nextLine();
        scanner.close();

        // Write modified JSON content to output file
        try (FileWriter fileWriter = new FileWriter(outputFilePath)) {
            fileWriter.write(jsonObject.toJSONString());
            System.out.println("Modified JSON saved to " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
