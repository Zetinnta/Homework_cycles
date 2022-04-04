package ru.skypro;

public class Main {

    public static void main(String[] args) {

        //Задача 1

        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        //Задача 2

        int friday = 2;
        for (; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }

        System.out.println("___________________________________________________________________");
        //Иначе

        double dayFriday = 2;
        while (dayFriday < 31) {
            boolean enoughDaysPassed = (dayFriday - 2) % 7 == 0;
            if (enoughDaysPassed) {
                System.out.println("Сегодня пятница, " + Math.round(dayFriday) + "-е число. Необходимо подготовить отчет.");
            }
            dayFriday++;
        }

        //Задача 3

        int currentYear = 2022;
        int leftGap = currentYear - 200;
        int rightGap = currentYear + 100;
        for (int referencePoint = 0; referencePoint < rightGap; referencePoint++) {
            boolean isTheYearWeAreLookingFor = (referencePoint % 79 == 0) && (referencePoint > leftGap);
            if (isTheYearWeAreLookingFor) {
                System.out.println(referencePoint);
            }
        }

        System.out.println("___________________________________________________________________");
        //Если не нужен шаг по единичке

        for (int theYear = 0; theYear < rightGap; theYear += 79) {
            boolean theYearWeNeed = (theYear % 79 == 0) && (theYear > leftGap);
            if (theYearWeNeed) {
                System.out.println(theYear);
            }
        }
    }
}
