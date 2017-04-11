package Box;

public class Box {
  int sideA;
  int sideB;
  int sideC;

  public Box (int sideA, int sideB, int sideC) {
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;
  }

  public void getVolume (Box box){
    System.out.println(box.sideA * box.sideB * box.sideC);
  }

  public void getSurface (Box box){
    System.out.println((box.sideA*box.sideB)*2 + (box.sideC*box.sideB)*2 + (box.sideA*box.sideC)*2);
  }

  public static void main(String[] args) {
    Box test = new Box (3, 3, 3);
    test.getVolume(test);
    test.getSurface(test);
  }
}
