package Pirates;
import java.util.*;

public class PirateCounter{

  public void pirateCount (ArrayList arrayList) {
    String pirateCounter;
    for (int i = 0; i < arrayList.size(); i++) {
      Pirate pirate = (Pirate) arrayList.get(i);
      if (pirate.hasWoodenLeg && pirate.gold > 15) {
        pirateCounter = pirate.name;
        System.out.println(pirateCounter);
      }
    }
  }

  public static void main(String... args){
    PirateCounter pirateCounter = new PirateCounter();
    ArrayList<Pirate> pirates = new ArrayList<>();
    pirates.add(new Pirate("Olaf", false, 12));
    pirates.add(new Pirate("Uwe", true, 9));
    pirates.add(new Pirate("Jack", true, 16));
    pirates.add(new Pirate("Morgan", false, 17));
    pirates.add(new Pirate("Hook", true, 20));
    pirateCounter.pirateCount(pirates);
  }
}
