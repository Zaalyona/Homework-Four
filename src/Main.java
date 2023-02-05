public class Main {
    public static void main(String[] args) {
        //четвёртая домашка
        //задача первая
        int i = 1;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //вторая
        int friday = 6;
        for (i = 1; i<= 31; i++) {
            if (i == friday) {
                System.out.println("Сегодня пятница, " + i + "-ое число. Необходимо подготовить отчёт.");
                friday = friday + 7;
            }
        }

        //третья
        int currentYear = 2021;
        int pastPeriod = currentYear - 200;
        int futurePeriod = currentYear + 100;
        i = pastPeriod + 79;
        for ( ; i < futurePeriod; i = i + 79) {
            System.out.println(i);
        }

        //четвёртая
        i = 1;
        for ( ; i <= 30; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i + ": ping pong");
            } else if (i % 3 == 0) {
                System.out.println(i + ": ping");
            } else if (i % 5 == 0) {
                System.out.println(i + ": pong");
            } else {System.out.println(i + ":");}
        }

        //пятая
        int firstNumber = 0;
        int secondNumber = 1;
        int fibonachi;
        System.out.print(firstNumber + " " + secondNumber);
        i = 3;
        for ( ; i <= 10; i++) {
            fibonachi = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = fibonachi;
            System.out.print(" " + secondNumber);
        }
    }
}