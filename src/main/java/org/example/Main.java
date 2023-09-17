package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("Опис Gradle-проекту:");

        // 1. Ініціалізація проекту
        System.out.println("1. Ініціалізація проекту:");
        System.out.println("   - Використовувала команду 'gradle init' для створення нового проекту.");
        System.out.println("   - Ця команда створює базову структуру каталогів та файли налаштувань.");

        // 2. Конфігурація build.gradle
        System.out.println("2. Конфігурація build.gradle:");
        System.out.println("   - Файл 'build.gradle' містить конфігураційні налаштування для мого проекту.");
        System.out.println("   - Там можна додати залежності, плагіни, завдання тощо.");

        // 3. Додавання залежностей
        System.out.println("3. Додавання залежностей:");
        System.out.println("   - В секції 'dependencies' в 'build.gradle', додала залежності для мого проекту.");
        System.out.println("   - Наприклад, для додавання бібліотеки GSON використовуйте 'implementation 'com.google.code.gson:gson:2.8.9''.");

        // 4. Створення основного коду
        System.out.println("4. Створення основного коду:");
        System.out.println("   - Мій основний код зберігається в 'src/main/java'.");
        System.out.println("   - Створила там пакет та класи, які мені потрібні.");

        // 5. Запуск проекту
        System.out.println("5. Запуск проекту:");
        System.out.println("   - Використовувала команду 'gradle run' для запуску свого проекту, якщо плагін 'application'.");

        // 6. Створення виконуваного JAR
        System.out.println("6. Створення виконуваного JAR:");
        System.out.println("   - Для створення 'fat JAR' або JAR, який містить всі залежності, налаштувала завдання 'jar' в 'build.gradle'.");
        System.out.println("   - Після цього  створила JAR за допомогою команди 'gradle jar'.");


    }
}
