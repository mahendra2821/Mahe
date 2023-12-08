 import java.util.Scanner;
 public class array {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Enter the number of elements in the array: ");
            int n = scanner.nextInt();
    
            int[] arr = new int[n];
    
            System.out.println("Enter the elements of the array (0, 1, or 2): ");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
    
            // Call the function to segregate the array
            segregate012(arr);
    
            // Print the segregated array
            System.out.println("The segregated array is:");
            for (int i : arr) {
                System.out.print(i + " ");
            }
    
            scanner.close();
        }
    
        public static void segregate012(int[] arr) {
            int low = 0;
            int mid = 0;
            int high = arr.length - 1;
    
            while (mid <= high) {
                switch (arr[mid]) {
                    case 0:
                        // Swap arr[low] and arr[mid], increment both low and mid
                        int temp = arr[low];
                        arr[low] = arr[mid];
                        arr[mid] = temp;
                        low++;
                        mid++;
                        break;
                    case 1:
                        // Just move mid pointer ahead
                        mid++;
                        break;
                    case 2:
                        // Swap arr[mid] and arr[high], decrement high pointer
                        int temp2 = arr[mid];
                        arr[mid] = arr[high];
                        arr[high] = temp2;
                        high--;
                        break;
                }
            }
        }
    } 

