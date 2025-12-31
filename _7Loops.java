public class _7Loops {
    public static void main(String[] args){
//While Loop
//we don't know where will it end

        int i = 1;
        while(i <= 5){
            System.out.println(i++);
            int j = 1;
            while(j < i){
                System.out.println("Hi");
                j++;
            }
        }

//Do While Loop
//run at least once

        int j = 5;
        do{
            System.out.println("hi");
            j++;
        }while(j <= 4);


//For Loop
//user know from where will it start and end

        for(int k = 0; k < 4; k++){
            System.out.println("Hi " + k);
        }


        for(int l = 1, m = 0; m < 6; l = l * 10, m++){
            System.out.println(l);
        }


        //Nested For loop(pattern printing)
        for(int p = 0; p < 5; p++){
            for(int q = 0; q <= p; q++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
