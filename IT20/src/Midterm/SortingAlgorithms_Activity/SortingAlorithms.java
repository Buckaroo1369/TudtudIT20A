public class SortingAlgorithms {

    public static void bubbleSort(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++){
            for(int i = 0; i < arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j = 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            } 
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            
            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void displayArray(int[] arr) {
        for(int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] originalSignals = { 37, 12, 89, 4, 56, 23, 71, 9, 45, 18 };

        int[] bubbleSignals = originalSignals.clone();
        int[] selectionSignals = originalSignals.clone();
        int[] insertionSignals = originalSignals.clone();

        System.out.println("==========================================");
        System.out.println("           THE LAST TRANSMISSION");
        System.out.println("==========================================");
        System.out.println("Incoming signal strengths:");
        displayArray(originalSignals);

        System.out.println("\nArranging signals from weakest to strongest...");

        bubbleSort(bubbleSignals);
        System.out.println("\n[BUBBLE SORT]");
        displayArray(bubbleSignals);

        selectionSort(selectionSignals);
        System.out.println("\n[SELECTION SORT]");
        displayArray(selectionSignals);

        insertionSort(insertionSignals);
        System.out.println("\n[INSERTION SORT]");
        displayArray(insertionSignals);

        System.out.println("\nAll signals have been arranged.");
        System.out.println("Broadcast preparation complete.");
        System.out.println("==========================================");
    }
}