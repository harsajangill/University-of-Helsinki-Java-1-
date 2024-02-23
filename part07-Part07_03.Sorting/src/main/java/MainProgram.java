import java.util.Arrays;

public class MainProgram {

    public static int smallest(int[] array){
        int smallest = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array){
        int smallestIndex = 0;
        int smallest = array[0];

        for(int i = 0; i < array.length; i++){
            if (array[i] < smallest){
                smallest = array[i];
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int smallest = table[startIndex];
        int smallestIndex = startIndex;

        for (int i = startIndex; i < table.length; i++){
            if(table[i] < smallest){
                smallest = table[i];
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int holder = array[index1];
        array[index1] = array[index2];
        array[index2] = holder;
    }

    public static void sort(int[] array){
        int startIndex = 0;
        System.out.println(Arrays.toString(array));
        while (startIndex < array.length){
            int smallestIndex = MainProgram.indexOfSmallestFrom(array, startIndex);
            MainProgram.swap(array, startIndex, smallestIndex);
            startIndex++;
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
        
   
    }

}
