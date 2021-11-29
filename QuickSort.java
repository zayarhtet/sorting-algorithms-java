import java.util.*;

public class QuickSort
{
    static int partition (List <Integer> arr, int start , int end) {
        int pivot = arr.get(end);
        int pIndex = start;
        int tmp= 0;
        for (int i=start; i < end; i++) {
            if (arr.get(i) <= pivot) {
                tmp = arr.get(pIndex);
                arr.set(pIndex, arr.get(i));
                arr.set(i, tmp);
                pIndex++;
            }
        }
        tmp = arr.get(pIndex);
        arr.set(pIndex, arr.get(end));
        arr.set(end, tmp);
        return pIndex;
    }
    
    static void qSort (List<Integer> arr, int start, int end) {
        if (start < end) {
            int partitionIndex = partition(arr, start, end);
            qSort(arr, start, partitionIndex-1);
            qSort(arr, partitionIndex, end);
        }
    }
    
  public static void main (String[]args)
  {
    List < Integer > arr = new ArrayList ();
    arr.add (4);
    arr.add (10);
    arr.add (8);
    arr.add (4);
    arr.add (6);
    arr.add (2);
    
    System.out.println("Before sorting: ");
    for(int x : arr) System.out.println(x);
    
    qSort(arr, 0, arr.size()-1);
    
    System.out.println("After sorting: ");
    for(int x : arr) System.out.println(x);
  }
}