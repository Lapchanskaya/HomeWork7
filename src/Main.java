public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println( " Задание 1");

     int goal = 2_459_000;
     int deposit = 15_000;
     int month = 0;
     int saving = 0;

     while ( saving <= goal) {
         saving+=saving/100;
         saving+=deposit;
         month++;
         System.out.println( " Месяц " + month + " , сумма накоплений равна " + saving + " рублей.");
     }


        // Задание 2
        System.out.println( " Задание 2");

     int a = 0;
    int i = 10;
     while ( a < 10) {
         a++;
         System.out.print( a);
     }
        System.out.println();

     for (i = 10; i >=1; i--) {
         System.out.print( i);
     }



    }
}