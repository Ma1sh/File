import java.util.*;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // везде указ полный путь для файла
        while (true) {
            System.out.println("\n Menu:");
            System.out.println("1. Создание файла");
            System.out.println("2. Запись данных в файл");
            System.out.println("3. Чтение данных из файла");
            System.out.println("4. Удаление данных из файла");
            System.out.println("5. Выход");
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Создание файла");
                    File newFile = new File("");
                    try {
                        boolean created = newFile.createNewFile();
                        if (created) {
                            System.out.println("Файл был создан");
                        }
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Запись данных в файл");
                    try (FileWriter writer = new FileWriter("", false)) {
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Введите текст для записи в файл:");
                        writer.write(sc.nextLine());
                    } catch (IOException ex) {
                        System.out.println("Ошибка записи в файл: " + ex.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Чтение данных из файла");
                    try (FileReader reader = new FileReader("")) {
                        System.out.println("Текст из файла");
                        int c;
                        while ((c = reader.read()) != -1) {
                            System.out.print((char) c);
                        }
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Удаление данных из файла");
                    try {
                        FileWriter rem = new FileWriter("", false);
                        rem.close();
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Выход");
                    return;
                default:
                    System.out.println("Введите другое число");
                    break;

            }
        }
    }
}