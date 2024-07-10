package Study.day8.section1;

public class NullPointExceptionEx {

  public static void main(String[] args) {
    int[] intArray = null;
    int[] intArrayClone = intArray;

    intArray = new int[5];

    System.out.println(intArray + " " + intArray.hashCode());

    intArray[0] = 10;
    intArray[1] = 20;
    intArray[2] = 30;
    intArray[3] = 40;
    intArray[4] = 50;

    for (int i : intArray) {
      System.out.println(i);
    }

    if (intArray == intArrayClone) {
      System.out.println("주소값이 같다.");
    } else {
      System.out.println("주소값이 다르다.");
    }
  }
}
