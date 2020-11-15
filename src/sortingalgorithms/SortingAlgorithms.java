package sortingalgorithms;
import java.util.Arrays;
import java.util.Scanner;

public class SortingAlgorithms {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hold = 0;
        double total = 0;
        System.out.println("Enter the amount of numbers you'd like to sort");
        int arraySize = input.nextInt();
        int[] numbersToSort = new int[arraySize];
        System.out.println("Enter a number then press enter for the numbers of times you specified previously");
        
        for (int i=0; i < arraySize; i++) {
            numbersToSort[i] = input.nextInt();
        }
    
    
        for (int i=0; i < arraySize; i++) {
            for(int j=1; j< (arraySize-i); j++) {
                if (numbersToSort[j-1] > numbersToSort[j]) {
                    hold = numbersToSort[j-1];
                    numbersToSort[j-1] = numbersToSort[j];
                    numbersToSort[j] = hold;
                }
            }
        }
    
    
        System.out.println("This is the sorted list:\n"+ Arrays.toString(numbersToSort));
        System.out.println("The minimum number is:\n"+numbersToSort[0]);
        System.out.println("The maximum number is:\n"+numbersToSort[arraySize-1]);
        
        for(int i=0; i<arraySize; i++) {
            total = total + numbersToSort[i];
        }
        total = total/arraySize;
        System.out.println("The average is: \n"+total);
    }
    
}
