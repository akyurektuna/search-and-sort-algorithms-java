import java.util.*;
public class SelectionSort{
    public void sort(int array[]){
        int n = array.length;
        for(int i=0; i<n-1; i++){
            int minIndex = i;

            for(int j=i+1; j<n; j++){
                if(array[j]<array[minIndex])
                    minIndex=j;
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i]=temp;
        }
    }

    public static void main(String[]args){
        SelectionSort example = new SelectionSort();
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