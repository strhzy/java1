package org.example;
import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;
import javax.swing.table.TableStringConverter;
import java.util.Scanner;
import java.util.Formatter;

public class Main {
    public static void main(String[] args) throws IOException {
        int age;//обьявляем переменные
        float marks;
        String name;
        Scanner in = new Scanner(System.in);//обьявляем сканер для ввода данных
        System.out.print("Введите имя студента: ");
        name = in.nextLine();//ввод имени
        System.out.print("Введите возраст студента: ");
        age = in.nextInt();//ввод возраста
        System.out.print("Введите средний балл студента: ");
        marks = in.nextFloat();//ввод среднего балла
        FileWriter writer = new FileWriter("students.txt", true);//обьявление файлврайтера для добавления текста
        BufferedWriter bw = new BufferedWriter(writer);
        String student = String.format("Имя: %s, возраст: %s, средний балл: %s",name, Integer.toString(age), Float.toString(marks));//форматирование строки для красоты
        bw.write(student);//добавление данных
        bw.newLine();
        bw.close();//закрытие файл врайтера
    }
}
