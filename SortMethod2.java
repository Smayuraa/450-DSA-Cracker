class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public static void sort012(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {0, 1, 2, 0, 2, 1, 0};

        sort012(arr); // Just call the function

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
//solve this problem without utilizing the built-in sort function.