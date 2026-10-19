package semester1.practice02;

/**
 * Практична робота №2
 * Змінні, типи даних, оператори та математичні обчислення в Java.
 */
public class Practice02 {
    public static void main(String[] args) {

        // ==================== БЛОК 1: Змінні та типи даних ====================

        // Завдання 1: особиста картка студента (змініть на свої дані)
        System.out.println("=== Завдання 1 ===");
        int age = 18;
        double height = 1.78;
        char firstLetter = 'О';
        boolean isStudent = true;
        System.out.println(age);
        System.out.println(height);
        System.out.println(firstLetter);
        System.out.println(isStudent);

        // Завдання 2: byte, short, int, long
        System.out.println();
        System.out.println("=== Завдання 2 ===");
        byte temperature = -15;
        short currentYear = 2026;
        int cityPopulation = 1200000;
        long worldPopulation = 8100000000L; // суфікс L обов'язковий
        System.out.println(temperature);
        System.out.println(currentYear);
        System.out.println(cityPopulation);
        System.out.println(worldPopulation);

        // Завдання 3: float проти double
        // float зберігає ~7 цифр, double — ~15-16, тому у double більше знаків після коми
        System.out.println();
        System.out.println("=== Завдання 3 ===");
        float floatValue = 1.1234567f;
        double doubleValue = 1.123456789012345;
        System.out.println(floatValue);
        System.out.println(doubleValue);

        // Завдання 4: char та коди Unicode (усі три надрукують літеру J)
        System.out.println();
        System.out.println("=== Завдання 4 ===");
        char symbol1 = 'J';
        char symbol2 = 74;
        char symbol3 = '\u004A';
        System.out.println(symbol1);
        System.out.println(symbol2);
        System.out.println(symbol3);

        // Завдання 5: boolean
        System.out.println();
        System.out.println("=== Завдання 5 ===");
        boolean isJavaFun = true;
        boolean isFishFly = false;
        boolean isSkyBlue = true;
        System.out.println(isJavaFun);
        System.out.println(isFishFly);
        System.out.println(isSkyBlue);

        // Завдання 6: константи (final)
        System.out.println();
        System.out.println("=== Завдання 6 ===");
        final double GRAVITY = 9.81;
        final int DAYS_IN_WEEK = 7;
        final String UNIVERSITY_NAME = "Львівська Політехніка";
        System.out.println(GRAVITY);
        System.out.println(DAYS_IN_WEEK);
        System.out.println(UNIVERSITY_NAME);
        // GRAVITY = 10.0; // ПОМИЛКА КОМПІЛЯЦІЇ: значення final-змінної змінити не можна

        // Завдання 7: неявне розширення (int -> double)
        System.out.println();
        System.out.println("=== Завдання 7 ===");
        int intVal = 250;
        double doubleVal = intVal;
        System.out.println("int: " + intVal);
        System.out.println("double: " + doubleVal);

        // Завдання 8: явне звуження (double -> int), дробова частина відкидається
        System.out.println();
        System.out.println("=== Завдання 8 ===");
        double priceWithPennies = 49.99;
        int roundedPrice = (int) priceWithPennies;
        System.out.println(roundedPrice);

        // ==================== БЛОК 2: Конкатенація та іменування ====================

        // Завдання 9: правильні імена в camelCase
        // Було: 1number, user_weight, Usercity, is_valid_user
        System.out.println();
        System.out.println("=== Завдання 9 ===");
        int firstNumber = 5;
        double userWeight = 72.5;
        String userCity = "Kyiv";
        boolean isValidUser = true;
        System.out.println(firstNumber + ", " + userWeight + ", " + userCity + ", " + isValidUser);

        // Завдання 10: візитка через конкатенацію
        System.out.println();
        System.out.println("=== Завдання 10 ===");
        String firstName = "Тарас";
        String lastName = "Шевченко";
        int poetAge = 47;
        System.out.println("Мене звати " + firstName + " " + lastName + ", мені " + poetAge + " років.");

        // Завдання 11: пастка додавання чисел і рядків
        System.out.println();
        System.out.println("=== Завдання 11 ===");
        int numberA = 10;
        int numberB = 20;
        // Вираз обчислюється зліва направо: "Сума без дужок: " + 10 дає рядок "Сума без дужок: 10",
        // потім до цього рядка приклеюється 20 -> "1020" (це конкатенація, а не додавання).
        System.out.println("Сума без дужок: " + numberA + numberB);
        // Дужки обчислюються першими: (10 + 20) = 30, і лише потім число склеюється з текстом.
        System.out.println("Сума з дужками: " + (numberA + numberB));

        // Завдання 12: генератор email
        System.out.println();
        System.out.println("=== Завдання 12 ===");
        String login = "ivan.petrenko";
        String domain = "gmail.com";
        String role = "student";
        String email = login + "@" + domain;
        System.out.println("Користувач " + login + " (роль: " + role + ") має пошту: " + email);

        // Завдання 13: чек з \n та +
        System.out.println();
        System.out.println("=== Завдання 13 ===");
        String productName = "Ноутбук";
        int quantity = 2;
        double pricePerUnit = 24500.50;
        System.out.println("ЧЕК:\nТовар: " + productName + "\nКількість: " + quantity + " шт.\nЦіна: " + pricePerUnit + " грн");

        // Завдання 14: баланс рахунку
        System.out.println();
        System.out.println("=== Завдання 14 ===");
        String currency = "UAH";
        int hryvnias = 1500;
        int kopecks = 75;
        System.out.println("Поточний баланс: " + hryvnias + "." + kopecks + " " + currency);

        // Завдання 15: збирання URL
        System.out.println();
        System.out.println("=== Завдання 15 ===");
        String protocol = "https://";
        String host = "api.example.com";
        String endpoint = "/users";
        int userId = 42;
        System.out.println("Запит відправлено на: " + protocol + host + endpoint + "/" + userId);

        // Завдання 16: резюме навичок
        System.out.println();
        System.out.println("=== Завдання 16 ===");
        String language = "Java";
        int level = 1;
        boolean isReady = true;
        System.out.println("Мова: " + language + " | Рівень: " + level + " | Готовність до практики: " + isReady);

        // ==================== БЛОК 3: Арифметика, %, ++ / -- ====================

        // Завдання 17: парність через %
        System.out.println();
        System.out.println("=== Завдання 17 ===");
        int parityNumber = 19;
        int remainder = parityNumber % 2;
        System.out.println("Число " + parityNumber + " при діленні на 2 дає остачу: " + remainder);

        // Завдання 18: секунди -> хвилини і секунди
        System.out.println();
        System.out.println("=== Завдання 18 ===");
        int totalSeconds = 385;
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        System.out.println(totalSeconds + " секунд = " + minutes + " хв " + seconds + " сек");

        // Завдання 19: сума цифр двозначного числа
        System.out.println();
        System.out.println("=== Завдання 19 ===");
        int twoDigitNumber = 47;
        int tens = twoDigitNumber / 10;
        int units = twoDigitNumber % 10;
        int digitsSum = tens + units;
        System.out.println("Число: " + twoDigitNumber + ". Десятки: " + tens + ", Одиниці: " + units
                + ". Сума цифр: " + digitsSum);

        // Завдання 20: скорочені оператори присвоєння
        System.out.println();
        System.out.println("=== Завдання 20 ===");
        int score = 100;
        score += 50;
        System.out.println("Після додавання: " + score);
        score -= 20;
        System.out.println("Після віднімання: " + score);
        score *= 2;
        System.out.println("Після множення: " + score);
        score /= 4;
        System.out.println("Після ділення: " + score);

        // Завдання 21: постфіксний інкремент x++
        System.out.println();
        System.out.println("=== Завдання 21 ===");
        int counterPostfix = 5;
        // Постфікс: спочатку повертається поточне значення (5), і лише після цього змінна збільшується.
        System.out.println(counterPostfix++);
        // Тепер змінна вже збільшена, тому друкується 6.
        System.out.println(counterPostfix);

        // Завдання 22: префіксний інкремент ++x
        System.out.println();
        System.out.println("=== Завдання 22 ===");
        int counterPrefix = 5;
        // Префікс: спочатку змінна збільшується (стає 6), і вже це нове значення повертається.
        System.out.println(++counterPrefix);

        // Завдання 23: середнє арифметичне (ділимо на 3.0, щоб не було цілочисельного ділення)
        System.out.println();
        System.out.println("=== Завдання 23 ===");
        int grade1 = 4;
        int grade2 = 5;
        int grade3 = 4;
        double averageGrade = (grade1 + grade2 + grade3) / 3.0;
        System.out.println("Середній бал: " + averageGrade);

        // Завдання 24: Цельсій -> Фаренгейт і Кельвін
        System.out.println();
        System.out.println("=== Завдання 24 ===");
        double celsius = 25.0;
        double fahrenheit = celsius * 1.8 + 32;
        double kelvin = celsius + 273.15;
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
        System.out.println(celsius + "°C = " + kelvin + " K");

        // ==================== БЛОК 4: Порівняння та логіка ====================

        // Завдання 25: повноліття
        System.out.println();
        System.out.println("=== Завдання 25 ===");
        int userAge = 17;
        boolean isAdult = userAge >= 18;
        System.out.println("Вік: " + userAge + ". Чи є повнолітнім: " + isAdult);

        // Завдання 26: порівняння двох чисел
        System.out.println();
        System.out.println("=== Завдання 26 ===");
        int x = 15;
        int y = 20;
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));

        // Завдання 27: діапазон швидкості (&&)
        System.out.println();
        System.out.println("=== Завдання 27 ===");
        int speed = 75;
        boolean isSafeSpeed = (speed >= 20) && (speed <= 80);
        System.out.println("Швидкість у безпечному діапазоні: " + isSafeSpeed);

        // Завдання 28: пільговий квиток (||)
        System.out.println();
        System.out.println("=== Завдання 28 ===");
        int personAge = 70;
        boolean hasFreePass = (personAge < 7) || (personAge >= 65);
        System.out.println("Вік: " + personAge + ". Право на безкоштовний проїзд: " + hasFreePass);

        // Завдання 29: інверсія (!)
        System.out.println();
        System.out.println("=== Завдання 29 ===");
        boolean isDoorLocked = true;
        boolean canEnter = !isDoorLocked;
        System.out.println("Двері зачинені: " + isDoorLocked);
        System.out.println("Чи можна увійти: " + canEnter);

        // Завдання 30: кратність на 3 і на 5 одночасно
        System.out.println();
        System.out.println("=== Завдання 30 ===");
        int firstCheckNumber = 30;
        boolean isFirstDivisibleByBoth = (firstCheckNumber % 3 == 0) && (firstCheckNumber % 5 == 0);
        System.out.println("Число " + firstCheckNumber + " ділиться на 3 і на 5: " + isFirstDivisibleByBoth);
        int secondCheckNumber = 25;
        boolean isSecondDivisibleByBoth = (secondCheckNumber % 3 == 0) && (secondCheckNumber % 5 == 0);
        System.out.println("Число " + secondCheckNumber + " ділиться на 3 і на 5: " + isSecondDivisibleByBoth);

        // Завдання 31: багатофакторна перевірка доступу
        System.out.println();
        System.out.println("=== Завдання 31 ===");
        boolean hasPassword = true;
        boolean hasSmsCode = true;
        boolean isAccountBlocked = false;
        boolean canLogin = hasPassword && hasSmsCode && !isAccountBlocked;
        System.out.println("Доступ до системи дозволено: " + canLogin);

        // Завдання 32: високосний рік
        System.out.println();
        System.out.println("=== Завдання 32 ===");
        int year = 2024;
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(year + " рік високосний: " + isLeapYear);

        // ==================== БЛОК 5: Клас Math ====================

        // Завдання 33: теорема Піфагора
        System.out.println();
        System.out.println("=== Завдання 33 ===");
        double legA = 3.0;
        double legB = 4.0;
        double hypotenuse = Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));
        System.out.println("Катети: " + legA + " та " + legB + ". Гіпотенуза: " + hypotenuse);

        // Завдання 34: довжина кола та площа круга
        System.out.println();
        System.out.println("=== Завдання 34 ===");
        double radius = 5.0;
        double circleLength = 2 * Math.PI * radius;
        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.println("Радіус: " + radius);
        System.out.println("Довжина кола: " + circleLength);
        System.out.println("Площа круга: " + circleArea);

        // Завдання 35: abs, max, min
        System.out.println();
        System.out.println("=== Завдання 35 ===");
        double dayTemp = 18.5;
        double nightTemp = -3.2;
        System.out.println("Перепад температури: " + Math.abs(dayTemp - nightTemp));
        System.out.println("Максимальна температура: " + Math.max(dayTemp, nightTemp));
        System.out.println("Мінімальна температура: " + Math.min(dayTemp, nightTemp));

        // Завдання 36: round, ceil, floor
        System.out.println();
        System.out.println("=== Завдання 36 ===");
        double num = 5.67;
        System.out.println("round(" + num + ") = " + Math.round(num));
        System.out.println("ceil(" + num + ") = " + Math.ceil(num));
        System.out.println("floor(" + num + ") = " + Math.floor(num));
        double negNum = -5.67;
        // Для від'ємних: ceil йде вгору до -5.0, а floor — вниз до -6.0
        System.out.println("round(" + negNum + ") = " + Math.round(negNum));
        System.out.println("ceil(" + negNum + ") = " + Math.ceil(negNum));
        System.out.println("floor(" + negNum + ") = " + Math.floor(negNum));

        // Завдання 37: квадратне рівняння
        System.out.println();
        System.out.println("=== Завдання 37 ===");
        double coefA = 1.0;
        double coefB = -7.0;
        double coefC = 10.0;
        double discriminant = Math.pow(coefB, 2) - 4 * coefA * coefC;
        double root1 = (-coefB + Math.sqrt(discriminant)) / (2 * coefA);
        double root2 = (-coefB - Math.sqrt(discriminant)) / (2 * coefA);
        System.out.println("Дискримінант D = " + discriminant);
        System.out.println("Корінь x1 = " + root1);
        System.out.println("Корінь x2 = " + root2);

        // Завдання 38: кубик
        System.out.println();
        System.out.println("=== Завдання 38 ===");
        int dice = (int) (Math.random() * 6) + 1;
        System.out.println("Випало на кубику: " + dice);

        // Завдання 39: випадкова температура від -10 до 35
        System.out.println();
        System.out.println("=== Завдання 39 ===");
        int minTemp = -10;
        int maxTemp = 35;
        int randomTemp = (int) (Math.random() * (maxTemp - minTemp + 1)) + minTemp;
        System.out.println("Погода на завтра: " + randomTemp + "°C");

        // Завдання 40: депозитний калькулятор (складні відсотки)
        System.out.println();
        System.out.println("=== Завдання 40 ===");
        double principal = 10000.0;
        int years = 3;
        double rate = 12.0;
        // Округлюємо до копійок, щоб уникнути "хвостів" типу 14049.280000000002
        double finalSum = Math.round(principal * Math.pow(1 + rate / 100, years) * 100) / 100.0;
        double profit = Math.round((finalSum - principal) * 100) / 100.0;
        System.out.println("+------------------------------------+");
        System.out.println("|     ДЕПОЗИТНИЙ КАЛЬКУЛЯТОР         |");
        System.out.println("+------------------------------------+");
        System.out.println("Початкова сума: " + principal + " грн");
        System.out.println("Термін: " + years + " роки під " + rate + "% річних");
        System.out.println("Підсумкова сума: " + finalSum + " грн");
        System.out.println("Чистий прибуток: " + profit + " грн");
        System.out.println("+------------------------------------+");
    }
}
