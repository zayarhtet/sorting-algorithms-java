import java.util.*;

public class MergeSort
{
    static void merge (List<Integer> left, List <Integer> right, List<Integer> arr) {
        int lengthLeft = left.size();
        int lengthRight = right.size();
        int i = 0, j = 0, k=0;
        while ( i < lengthLeft && j < lengthRight) {
            if (left.get(i) <= right.get(j)) {
                arr.set(k, left.get(i));
                i++;
            } else {
                arr.set(k, right.get(j));
                j++;
            }
            k++;
        }
        while (i < lengthLeft) {
            arr.set(k, left.get(i));
            i++;
            k++;
        }
        while (j < lengthRight) {
            arr.set(k, right.get(j));
            j++;
            k++;
        }
    }
    
    static void mergeSort (List<Integer> arr) {
        int n = arr.size();
        if (n < 2)
            return;
        int mid = arr.size()/2;
        List <Integer> left = new ArrayList();
        List <Integer> right = new ArrayList();
        for (int i = 0; i < mid; i++) {
            left.add(arr.get(i));
        }
        for (int i = mid; i < n; i++) {
            right.add(arr.get(i));
        }
        mergeSort(left);
        mergeSort(right);
        merge(left,right,arr);
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
    
    mergeSort(arr);
    
    System.out.println("After sorting: ");
    for(int x : arr) System.out.println(x);
  }
}