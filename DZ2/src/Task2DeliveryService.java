

import java.util.Scanner;

public class Task2DeliveryService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ТАРИФІКАТОР СЛУЖБИ ДОСТАВКИ ===");

        // читает данные
        System.out.print("Введіть вагу відправлення (кг): ");
        double weight = scanner.nextDouble();

        System.out.print("Введіть відстань транспортування (км): ");
        int distance = scanner.nextInt();

        System.out.print("Оберіть пункт призначення (1 - Відділення, 2 - Поштомат, 3 - Кур'єр): ");
        int deliveryType = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Чи є у вас карта Premium? (так/ні): ");
        String premiumInput = scanner.nextLine();


        if (weight <= 0 || weight > 50.0) {
            System.out.println("Помилка: вага має бути більше 0 та не більше 50 кг.");
            return;
        }
        if (distance <= 0) {
            System.out.println("Помилка: відстань має бути більше 0 км.");
            return;
        }

        // базовый тариф считывает сфич вич все дела
        double baseTariff = switch (deliveryType) {
            case 1 -> 50.0;
            case 2 -> {
                if (weight > 15.0) {
                    System.out.println("Помилка: поштомат не приймає посилки вагою більше 15 кг!");
                    yield -1;
                } else {
                    yield 60.0;
                }
            }
            case 3 -> 100.0;
            default -> -1;
        };

        // если поштомат не подошел
        if (baseTariff == -1) {
            System.out.println("Помилка: некоректний тип доставки або перевищено габарити.");
            return;
        }

        // ну тут иф елс
        double distanceFee = 0.0;
        if (distance <= 50) {
            distanceFee = 0.0;
        } else if (distance <= 200) {
            distanceFee = 35.0;
        } else {
            distanceFee = 80.0;
        }

        // проверка статуса премиум
        boolean isPremium = premiumInput.equalsIgnoreCase("так");
        double totalBeforeDiscount = baseTariff + distanceFee;

        // если скидка процент 20
        double finalTotal = isPremium ? totalBeforeDiscount * 0.8 : totalBeforeDiscount;


        String typeName = switch (deliveryType) {
            case 1 -> "Відділення";
            case 2 -> "Поштомат";
            default -> "Кур'єр";
        };

        // 5. результат
        System.out.println("\n------------- НАКЛАДНА ДОСТАВКИ -------------");
        System.out.println("Тип доставки:              " + typeName + " (базовий тариф: " + baseTariff + " грн)");
        System.out.println("Доплата за відстань:       " + distanceFee + " грн (" + distance + " км)");
        System.out.println("Сума до знижки:            " + totalBeforeDiscount + " грн");
        System.out.println("Статус клієнта:            " + (isPremium ? "Premium (-20%)" : "Звичайний (0%)"));
        System.out.println("---------------------------------------------");
        System.out.println("РАЗОМ ДО СПЛАТИ:           " + finalTotal + " грн");
        System.out.println("=============================================");
    }
}
