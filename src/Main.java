public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");

        int a = 1;
        System.out.println("значение переменной a с типом int равно " + a);
        byte b = 2;
        System.out.println("значение переменной b с типом byte равно " + b);
        short c = 3;
        System.out.println("значение переменной c с типом short равно " + c);
        long d = 4L;
        System.out.println("значение переменной d с типом long равно " + d);
        float e = 5.1f;
        System.out.println("значение переменной e с типом float равно " + e);
        double f = 6;
        System.out.println("значение переменной f с типом double равно " + f);
    }

    public static void task2 () {
        System.out.println("Задача 2");

        int a = 27897;
        byte b = 67;
        short c = -159;
        short c1 = 569;
        long d = 987768965549L;
        float e = 27.12f;
        double f = 2.786;
    }

    public static void task3 () {
        System.out.println("Задача 3");

        byte teacherOne = 23;
        byte teacherTwo = 27;
        byte teacherThree = 30;
        int totalStudent = teacherOne + teacherTwo + teacherThree;
        short totalPaper = 480;
        int paperOneStudent = totalPaper / totalStudent;
        System.out.println("На каждого ученика расчитано " + paperOneStudent + " лисов бумаги");
    }

    public static void task4 () {
        System.out.println("Задача 4");

        byte efficiency = 16;
        byte timeTwoMinutes = 2;
        int efficiencyOneMinutes = efficiency / timeTwoMinutes;
        int efficiencyTwentyMinutes = efficiencyOneMinutes * 20;
        System.out.println("за 20 минут машина произвела " + efficiencyTwentyMinutes + " штук бутылок");
        int efficiencyDay = efficiencyOneMinutes * 1440;
        System.out.println("за сутки машина произвела " + efficiencyDay + " штук бутылок");
        int efficiencyThreeDay = efficiencyDay * 3;
        System.out.println("за 3 дня машина произвела " + efficiencyThreeDay + " штук бутылок");
        int efficiencyMonth = efficiencyDay * 30;
        System.out.println("за месяц машина произвела " + efficiencyMonth + " штук бутылок");
    }

    public static void task5 () {
        System.out.println("Задача 5");

        byte totalCan = 120;
        byte canWhiteOneClass = 2;
        byte canBrownOneClass = 4;
        int totalCanOneClass = canWhiteOneClass + canBrownOneClass;
        int totalClass = totalCan / totalCanOneClass;
        int totalCanWhite = totalClass * canWhiteOneClass;
        int totalCanBrown = totalClass * canBrownOneClass;
        System.out.println("В школе, где " + totalClass + " классов, нужно" + totalCanWhite + " банок белой краски и " + totalCanBrown + " банок коричневой краски");
    }

    public static void task6 () {
        System.out.println("Задача 6");

        byte bananas  = 5;
        byte weightOneBananas = 80;
        short milk = 200;
        byte weightOneMilk = 105;
        byte iceCream = 2;
        byte weightOneIceCream = 100;
        byte egg = 4;
        byte weightOneEgg = 70;
        int totalWeightBananas = bananas * weightOneBananas;
        int totalWeightMilk = (milk / 100) * weightOneMilk;
        int totalWeightIceCream = iceCream * weightOneIceCream;
        int totalWeightEgg = egg * weightOneEgg;
        double totalWeight = totalWeightBananas + totalWeightMilk + totalWeightIceCream + totalWeightEgg;
        double totalWeightKg = totalWeight / 1_000;
        System.out.println(totalWeight + " грамм");
        System.out.println(totalWeightKg + " кг");
    }

    public static void task7 () {
        System.out.println("Задача 7");

        int weightForLoseGram = 7000;
        int lossWeightMin = 250;
        int lossWeightMax = 500;
        double maxDayCount = (double) weightForLoseGram / lossWeightMin;
        double minDayCount = (double) weightForLoseGram / lossWeightMax;
        double lossWeightAverage = (lossWeightMin + lossWeightMax) / 2D;
        double averageCountDay = weightForLoseGram / lossWeightAverage;
        System.out.println("Минимальное количество дней для похудения " + minDayCount);
        System.out.println("Максимальное количество дней для похудения " + maxDayCount);
        System.out.println("Среднее количество дней для похудения " + averageCountDay);


    }

    public static void task8 () {
        System.out.println("Задача 8");

        int masha = 67760;
        int denis = 83690;
        int kris = 76230;
        double percent = 1.1;
        double newMasha = masha * percent;
        double newDenis = denis * percent;
        double newKris = kris * percent;

        double mashaSalary = masha * 12;
        double newMashaSalary = newMasha * 12;

        double denisSalary = denis * 12;
        double newDenisSalary = newDenis * 12;

        double krisSalary = kris * 12;
        double newKrisSalary = newKris * 12;

        System.out.println("Маша теперь получает " + newMasha + " рублей, годовой доход вырос на " + (newMashaSalary - mashaSalary ) + " рублей");
        System.out.println("Денис теперь получает " + newDenis + " рублей, годовой доход вырос на " + (newDenisSalary - denisSalary ) + " рублей");
        System.out.println("Кристина теперь получает " + newKris + " рублей, годовой доход вырос на " + (newKrisSalary - krisSalary ) + " рублей");

    }
}