public class _10Methods {

    public static int sumOfArray(int arr[]){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    //Another method to pass an array
    public static int sumOfArr(int ...arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static String toUpper(String s){
        return s.toUpperCase();
    }

    //Compile-Time Polymorphism
//Method Overloading  (different in datatype or no. of attributes)
    public static int add(int a, int b){
        return a + b;
    }
    public static float add(float a, float b){
        return a + b;
    }

    public static int add(int a, int b, int c){
        return a + b + c;
    }


    //prime no.
    public static boolean isPrime(int n){
        boolean flag = false;
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                flag = false;
            }
            else{
                flag = true;
            }
        }
        return flag;
    }

    public static void main(String[] args){
        int arr[] = {3,4,2,5};
        int result = sumOfArray(arr);
        System.out.println(result);
        System.out.println(sumOfArr(1,2,3));

        String str = "aayush";
        System.out.println(toUpper(str));

        int a = 1, b = 2, c = 3;
        System.out.println(add(a, b));
        System.out.println(add(9.8f, 9.9f));
        System.out.println(add(a, b, c));

        System.out.println(isPrime(13));
    }
}
