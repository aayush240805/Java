public class _8Arrays {
    public static void main(String[] args){
        int arr1[] = {1, 2, 3};
        int[] arr2 = {10, 20, 30}; // <-stack
        int arr3[] = new int[5]; // <-heap

        for(int i = 0; i < arr3.length; i++){
            System.out.println(i);
        }
        System.out.println(arr2); // printing object(array) identifier

        //for each loop (specially used for array)
        int[][] arr4 = new int[3][3]; // <-- java's style to declare an array.
        //int arr4[][] = {{3,3,3}, {3,3,3}, {3,3,3}};
        for(int[] i : arr4){
            for(int j : i){
                System.out.print(j);
            }
            System.out.println();
        }

        //Max value in an array
        int arr5[] = {3,5,2,65,33,23};
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr5.length; i++) {
            if(arr5[i] >= ans){
                ans = arr5[i];
            }
        }
        System.out.println("max : " + ans);



        //jagged array
        int nums[][] = new int[3][];

        nums[0] = new int[3];
        nums[1] = new int[1];
        nums[2] = new int[4];

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
