/*
1. You are given two text files, file1.txt and file2.txt, both of which contain a list of names.
  Your task is to find names that are common to both files and write them to a new file called 
  common_names.txt. 
 */

package wt.may25.pkg;

import java.io.*;
import java.util.*;

public class Question1 {
    public static void main(String[] args) throws Exception {
        String folderPath = "E:\\Work\\Codenera\\WeeklyTest\\WeeklyTest_15th_Feb\\WeeklyTest25thMay\\files";

        Set<String> set1 = new HashSet<>();
        List<String> commonNames = new ArrayList<>();

        // Read and split names in file1
        Scanner sc1 = new Scanner(new File(folderPath + "\\file1.txt"));
        while (sc1.hasNextLine()) {
            String[] names = sc1.nextLine().trim().split("\\s+");
            for (String name : names) {
                set1.add(name.toLowerCase());
            }
        }
        sc1.close();

        // Read and split names in file2, check common
        Scanner sc2 = new Scanner(new File(folderPath + "\\file2.txt"));
        while (sc2.hasNextLine()) {
            String[] names = sc2.nextLine().trim().split("\\s+");
            for (String name : names) {
                if (set1.contains(name.toLowerCase())) {
                    commonNames.add(name); // Keep original casing if needed
                }
            }
        }
        sc2.close();

        // Print and write to file
        System.out.println("Common names: " + commonNames);

        PrintWriter writer = new PrintWriter(new File(folderPath + "\\common_names.txt"));
        for (String name : commonNames) {
            writer.println(name);
        }
        writer.close();
    }
}
