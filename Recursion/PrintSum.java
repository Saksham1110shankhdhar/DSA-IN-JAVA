package Recursion;

public class PrintSum {
        public static void main(String[] args) {
            int arr[]={1,2,3,4,5,6};
    
            System.out.println(sum(arr,0));
            System.out.println(max(arr,0));
            System.out.println(product(arr,0));
        }

        private static int product(int[] arr, int i) {
            if(i == arr.length) {
                return 1;
            }
            return arr[i]*product(arr,i+1);
        }

        private static int max(int[] arr, int i) {
            if(i==arr.length-1){
                return arr[i];
            }
            return Math.max(arr[i], max(arr,i+1));
        }

        private static int sum(int[] arr, int i) {
            if(i==arr.length){
                return 0;
            }
            return arr[i]+sum(arr,i+1);
        }
    }
