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

        // Задание 4
        System.out.println( " Задание 4");
      int purpose = 12_000_000;
      int contribution = 15_000;
      double percent = 0.07;
      int monthCount = 0;
      for (; contribution <= purpose; monthCount++){
          contribution+=contribution*percent;
          System.out.println( " За " + monthCount + " месяцев, накопил, " + contribution+ " рублей.");
      }

        // Задание 5
        System.out.println( " Задание 5 ");
        int purpose1 = 12_000_000;
        int contribution1 = 15_000;
        double percent1 = 0.07;
        int monthCount1 = 0;
        for (; contribution1 <= purpose1; monthCount1 ++) {
            contribution1 += contribution1 * percent1;
            if (monthCount1 % 6 == 0) {
                System.out.println(" За " + monthCount1 + " месяцев, накопил, " + contribution1 + " рублей.");
            }
        }

        // Задание 6
        System.out.println( " Задание 6 ");
        int contribution2 = 15_000;
        double percent2 = 0.07;
        int monthCount2 = 1;
        for (; monthCount2 <= 108; monthCount2 ++) {
            contribution2 += contribution2 * percent2;
            if (monthCount2 % 6 == 0) {
                System.out.println(" За " + monthCount2 + " месяцев, накопил, " + contribution2 + " рублей.");

            }
        }

        // Задание 7
        System.out.println( " Задание 7 ");
        int firstFriday =7;
        for (int day = firstFriday; day <=31; day+=7 ){
            System.out.println( " Сегодня пятница " + day + "-ое число. Необходимо подготовить отчет. ");
        }


        // Задание 8
        System.out.println( " Задание 8 ");
        int year = 0;
        int nowYear = 2022;
        int startYear = nowYear - 200;
        int finishYear = nowYear + 100;
        int period = 79;
        while ( year <= finishYear){
            if ( year >= startYear ){
                System.out.println( year);
            }
            year += period;
        }

        // Задание 9
        System.out.println( " Задание 9");
        int h = 2;
        for ( i = 1; i<= 10; i++){
            System.out.println( h + " * " + i + " = " + h*i);
      }

}}
