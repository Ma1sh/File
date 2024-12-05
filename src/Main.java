import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

     while(true){
         System.out.println("\n Menu:");
         System.out.println("1. Создание файла");
         System.out.println("2. Запись данных в файл");
         System.out.println("3. Чтение данных из файла");
         System.out.println("4. Удаление данных из файла");
         System.out.println("5. Выход");
         System.out.print("Enter your choice: ");
         int choice = scanner.nextInt();
         switch (choice) {
             case 1:
                 System.out.println("You chose Option 1.");
                 File newFile = new File("D:\\ИС-3\\File\123.txt");
                 try {
                     boolean created = newFile.createNewFile();
                     if (created) {
                         System.out.println("File has been created");
                     }
                 } catch (IOException ex) {
                     System.out.println(ex.getMessage());
                 }

                 break;
             case 2:
                 System.out.println("You chose Option 2.");
                 break;
             case 3:
                 System.out.println("You chose Option 3.");
                 break;
             case 4:
                 System.out.println("You chose Option 3.");
                 break;

         }
     }



    }
}