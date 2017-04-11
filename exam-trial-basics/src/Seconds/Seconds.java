package Seconds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Seconds {
   public void listDivider(){
    List<Object> toPrint = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    for (int i = 0; i < toPrint.size(); i++) {
      if (i % 2 == 1) {
        System.out.print(toPrint.get(i) + " ");
      }
    }
  }

  public static void main(String[] args) {
     Seconds seconds = new Seconds();
    seconds.listDivider();
  }
}
