/**
 * This file is used to find a value in a single array and to find the smallest value in an array.
 * 
 * @author Owen Rose
 */
public class Search_Array_For_Value {
  public static void arrayValue() {
    System.out.println("\n"
        + "This next line of code tells " 
        + "you if you scored a 100 on one of your test and which test it was.");
    System.out.println("The Scores are: 87, 75, 98, 100, 82, 72, 88, 92, 60, 78");
    int[] scores = {87, 75, 98, 100, 82, 72, 88, 92, 60, 78};

    boolean found;

    int index;

    found = false;


    index = 0;

    while (found == false && index < scores.length) {
      if (scores[index] == 100) {
        found = true;
      } else {
        index = index + 1;
      }
    }

    if (found) {
      System.out.println("You earned 100 on test number " + (index + 1));
    } else {
      System.out.println("You did not earn 100 on any test.");
    }

    int minNumber = 100;

    for (index = 0; index < scores.length; index++) {
      if (scores[index] < minNumber) {
        minNumber = scores[index];
      }
    }
    System.out.println(minNumber + " is the lowset test score.");
  }
}
