import java.util.*;

public class BubbleSort
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
    
    int tmp = 0, swpCnt;
    for ( int j= 0; j < arr.size(); j++) {
        swpCnt = 0;
        for (int i=0; i < arr.size()-j-1; i++) {
            if(arr.get(i) > arr.get(i+1)) {
                tmp = arr.get(i);
                arr.set(i, arr.get(i+1));
                arr.set(i+1, tmp);
                swpCnt = 1;
            }
        }
        if (swpCnt == 0) break;
    }
    System.out.println("After sorting: ");
    for(int x : arr) System.out.println(x);
  }
}