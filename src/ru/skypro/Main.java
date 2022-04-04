package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // task1
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println('\n');

        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        // task2
        System.out.println('\n');


        for (int friday = 1; friday <= 31; friday = friday+7) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");

        }

// task3
        System.out.println();

        int  startPeriodComet = 1817;
        int endPeriodComet = 2054;
        int interval = 79;
        while(startPeriodComet<endPeriodComet){
            startPeriodComet = startPeriodComet+interval;
            System.out.println("Следующая комета пролетит в  " + startPeriodComet + " году.");
        }


        }
    }





       
















