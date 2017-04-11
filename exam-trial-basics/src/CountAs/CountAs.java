package CountAs;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountAs {
   public void letterCounter (String fileName){
    Path filePath = Paths.get(fileName);
    try {
      List<String> list = Files.readAllLines(filePath);
      String toCount;
      char needed = 'a';
      int counter = 0;
      for (int i = 0; i < list.size(); i++) {
        toCount = list.get(i);
        for (int j = 0; j < toCount.length(); j++) {
          if (toCount.charAt(i) == needed) {
            counter++;
          }
        }
      } System.out.println("The occurence of the letter a is: " + counter);
    } catch (Exception e) {
      System.out.println(0);
    }
  }
  public static void main(String[] args) {
     CountAs countAs = new CountAs();
     countAs.letterCounter("src/CountAs/aFile.txt");
  }
}
