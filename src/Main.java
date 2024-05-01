public class Main {
    public static void main(String[] args) {
        task1();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1 и 2");
        int clientOS = 1;
        int clientDeviceYear = 2012;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("установите облегченную версию для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println(" установите версию для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("установите облегченную версию для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("установите версию для Android по ссылке");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2024;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("високосный год");
        } else {
            System.out.println(" год невисокосный");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 35;
        int time = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется " + time + " день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется " + 2 + " дня");
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется " + 3 + " дня");
        } else {
            System.out.println("доставки нет");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNomber = 6;
        switch (monthNomber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("других сезонов не существует");
        }
    }
}
