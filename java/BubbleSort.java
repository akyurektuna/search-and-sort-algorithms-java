import java.util.*;
public class BubbleSort{
    public void sort(int array[]) 
    { 
        int n = array.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (array[j] > array[j+1]) 
                { 
                    int temp = array[j]; 
                    array[j] = array[j+1]; 
                    array[j+1] = temp; 
                } 
    }
    public static void main(String[]args){
        BubbleSort example = new BubbleSort();
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