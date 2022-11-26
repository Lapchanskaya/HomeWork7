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

        // Задание 3
        System.out.println( " Задание 3");

     int populationCountry = 12_000_000;
     int birthPer1000 = 17;
     int mortalyPer1000 = 8;
     int increase = birthPer1000 - mortalyPer1000;
     for ( int year = 1; year <= 10; year ++) {
         populationCountry += populationCountry * increase / 1000;
         System.out.println(" Год " + year + " , численность населения составляет " + populationCountry + " человек.");
     }



    }
}