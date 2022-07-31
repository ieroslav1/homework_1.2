public class Main {
    public static void main(String[] args) {
        // Задание 1
        var Do = "До";
        int Re = 2;
        double Me = 3.2;
        float Fa = (float) 4.7;
        byte Sol = 5;
        long Lya = 600L;
        char Dies = 35;
        boolean Si = false;

        System.out.println( Do + Dies );

        // Задание 2
        double firstBoxerWeight = 78.2;
        double secondBoxerWeight = 82.7;
        var twoBoxerWeight = firstBoxerWeight + secondBoxerWeight;
        var differentBoxerWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Два боксёра вместе весят: " + twoBoxerWeight +" кг");
        System.out.println("Разница в весе боксёров составляет: " + differentBoxerWeight + " кг");

        // Задание 3
        double bananas = 80;
        double milk = 105;
        double iceCream = 100;
        double eag = 70;
        var breakfastWeightGram = bananas*5 + milk*2 + iceCream*2 + eag*4;
        var breakfastWeightKilogram = breakfastWeightGram / 1000;

        System.out.println("Вес завтрака в граммах: " + breakfastWeightGram);
        System.out.println("Вес завтрака в килограммах: " + breakfastWeightKilogram);

        // Задание 4
        double fullWeight = 7000;
        double minWeightInDay = 250;
        double maxWeightInDay = 500;
        int minDay = (int) (fullWeight / minWeightInDay);
        int maxDay = (int) (fullWeight / maxWeightInDay);
        int mediumDay = (maxDay + minDay) / 2;

        System.out.println("Для сброса веса по 250 грамм в день потребуется: " + minDay + " дней.");
        System.out.println("Для сброса веса по 500 грамм в день потребуется: " + maxDay + " дней.");
        System.out.println("Среднеарифметически для сброса веса потребуется: " + mediumDay + " дней.");

        // Задание 5
        int mashaMonth = 67760;
        int denisMonth = 83690;
        int cristinaMonth = 76230;
        int viraMashaMonth = mashaMonth / 10 * 11 ;
        int viraDenisMonth = denisMonth /10 * 11;
        int viraCristinaMonth = cristinaMonth / 10 * 11;
        int viraMashaYear = viraMashaMonth * 12;
        int viraDenisYear = viraDenisMonth * 12;
        int viraCristinaYear = viraCristinaMonth * 12;
        int differentMashaYear = viraMashaYear - (mashaMonth * 12);
        int differentDenisYear = viraDenisYear - (denisMonth * 12);
        int differentCristinaYear = viraCristinaYear - (cristinaMonth * 12);

        System.out.println("В месяц Маша стала зарабатывать " + viraMashaMonth + " рублей");
        System.out.println("Годовой доход Маши увеличился на " + differentMashaYear + " рублей");
        System.out.println("В месяц Денис стал зарабатывать " + viraDenisMonth + " рублей");
        System.out.println("Годовой доход Дениса увеличился на " + differentDenisYear + " рублей");
        System.out.println("В месяц Кристина стала зарабатывать " + viraCristinaMonth + " рублей");
        System.out.println("Годовой доход Кристины увеличился на " + differentCristinaYear + " рублей");
    }
}