import java.util.*;
public class InsertionSort{

    public void sort(int array[]){
        int n = array.length; 
        for (int i = 1; i < n; ++i) { 
            int key = array[i]; 
            int j = i - 1; 
  
            while (j >= 0 && array[j] > key) { 
                array[j + 1] = array[j]; 
                j = j - 1; 
            } 
            array[j + 1] = key; 
        } 
    }
    public static void main(String[]args){
        InsertionSort example = new InsertionSort();
        int array[] = {13,24,9,12};
        
        System.out.println("array before sort: ");
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
        System.out.println();    

        example.sort(array);

        System.out.println("array after sort: ");
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
        System.out.println();

    }


}