import java.util.*;

public class InsertionSort
{
  public static void main (String[]args)
  {
    List < Integer > arr = new ArrayList ();
    arr.add (4);
    arr.add (10);
    arr.add (8);
    arr.add (4);
    arr.add (6);
    arr.add (2);
    
    List < Integer > arrSorted = new ArrayList ();
    System.out.println("Before sorting: ");
    for(int x : arr) System.out.println(x);
    
    int value, hole;
    
    for (int i=1; i < arr.size(); i++) {
        value = arr.get(i);
        hole = i;
        while ( hole > 0 && arr.get(hole-1) > value) {
            arr.set(hole, arr.get(hole-1));
            hole--;
        }
        arr.set(hole, value);
    }
    
    
    System.out.println("After sorting: ");
    for(int x : arr) System.out.println(x);
  }
}