public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        byte clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android  по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS  по ссылке");
        } else System.out.println("Неизвестная ОС");

        System.out.println("Задание 2");
        int clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android  по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите  версию приложения для Android  по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS  по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS  по ссылке");
        }
        System.out.println("Задание 3");
        int year = 400;
        int leapControl4 = year % 4;
        int leapControl10 = year % 100;
        int leapControl400 = year % 400;
        if (leapControl4 == 0 && leapControl10 != 0) {
            System.out.println(" Этот год високостный");
        } else if (leapControl400 == 0 && leapControl10 == 0) {
            System.out.println("Год  високостный");
        } else {
            System.out.println("Год не високостный");
        }
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int dayDelivery = 1;
        if (deliveryDistance<20){
            System.out.println("Потребуется дней: " + dayDelivery);
        } else if (deliveryDistance>=20&&deliveryDistance<60) {
            dayDelivery++;
            System.out.println("Потребуется дней: " + dayDelivery);
        }
        else {
            dayDelivery+=2;
            System.out.println("Потребуется дней: " + dayDelivery);
        }
        System.out.println("Задание 5");
        int monthNumber = 9;
        switch (monthNumber){
            case 1:
                System.out.println("Это зимний месяц");
                break;
            case 2:
                System.out.println("Это зимний месяц");
                break;
            case 3:
                System.out.println("Это осенний месяц");
                break;
            case 4:
                System.out.println("Это осенний месяц");
                break;
            case 5:
                System.out.println("Это осенний месяц");
                break;
            case 6:
                System.out.println("Это летний месяц");
                break;
            case 7:
                System.out.println("Это летний месяц");
                break;
            case 8:
                System.out.println("Это летний месяц");
                break;
            case 9:
                System.out.println("Это осенний месяц");
                break;
            case 10:
                System.out.println("Это осенний месяц");
                break;
            case 11:
                System.out.println("Это осенний месяц");
                break;
            case 12:
                System.out.println("Это зимний месяц");
                break;
            default:
                System.out.println("Такого месяца не сушествует");
        }



    }

}
