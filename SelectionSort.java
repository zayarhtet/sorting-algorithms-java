import java.util.*;

public class SelectionSort
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
    
    int tmp;
    int index =0;
    for (int j=0; j < arr.size(); j++) {
        index = j;
        for(int i=j+1; i < arr.size(); i++) {
            if(arr.get(i) < arr.get(index)) {
                index = i;
            }
        }
        tmp = arr.get(j);
        arr.set(j, arr.get(index));
        arr.set(index, tmp);
    }
    
    System.out.println("After sorting: ");
    for(int x : arr) System.out.println(x);
  }
}
