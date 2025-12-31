public class _6Conditional_Statements {
    public static void main(String[] args){
//relational operators

        int a = 6;
        int b = 3;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a <= b);
        System.out.println(a >= b);

        char d = 'd';
        char l = 'l';
        System.out.println('d' + 0);
        System.out.println('l' + 0);
        System.out.println(d > l);
        System.out.println(d < l);


        String str1 = "hello"; //string pool
        String str2 = new String("hello"); //heap

        System.out.println(str1 == str2);// return false
        System.out.println();



//logical operators
        //AND  &&
        //OR   ||
        //NOT  !
        int l1 = 4;
        int l2 = 5;
        int l3 = 6;
        System.out.println(l1 > l2 && l2 > l3);
        System.out.println(l1 < l2 && l2 < l3);
        System.out.println(l1 > l2 && l2 < l3);

        System.out.println(l1 > l2 || l2 < l3);
        System.out.println(l1 > l2 || l2 < l3);
        System.out.println(l1 > l2 || l2 < l3);

        System.out.println(l1 != l2);
        System.out.println(!(l1 == l2));


        String name = "ram";
        int exp = 3;
        boolean tier1 = true;

        System.out.println(tier1 || exp >= 5);




//Conditional Statements

        int age = 20;
        int marks = 84;
        if(age >=18 && marks >= 33){
            System.out.println("Congrats");
        }
        else{
            System.out.println("Better Luck Next Time.");
        }

        if(marks >= 90){
            System.out.println("Grade A");
        }
        else if(marks >= 75){
            System.out.println("Grade B");
        }
        else if(marks >= 60){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Grade D");
        }


        //Switch Case

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Trusday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
                break;
        }



        int num = 2;
        switch (num) {
            case 1:
            case 2:
            case 3:
                System.out.println("num is 1, 2, or 3");
                break;

            case 4:
            case 5:
            case 6:
                System.out.println("num is 4, 5, or 6");
                break;

            default:
                System.out.println(".........?");
                break;
        }






//WITHOUT BREAK

        String day_ = "Tuesday";

        switch(day_){
            case "Saturday", "Sunday" -> System.out.println("6AM");

            case "Tuesday" -> System.out.println("3AM");

            default -> System.out.println("4AM");
        }



        /*public class switch_case {
            public static void main(String[] args){
                String _day = "Tuesday";
                String result = "";

                switch(_day){
                    case "Satarday", "Sunday" -> result = "6AM";

                    case "Tuesday" -> result = "3AM";

                    default -> result = "4AM";
                }
                System.out.println(result);
            }
        }*/

        /*public class switch_case {
            public static void main(String[] args){
                String _day = "Tuesday";
                String result = "";

                result = switch(_day){
                    case "Satarday", "Sunday" : yield "6AM";

                    case "Tuesday" : yield "3AM";

                    default : yield "4AM";
                };
                System.out.println(result);
            }
        }*/
    }
}
