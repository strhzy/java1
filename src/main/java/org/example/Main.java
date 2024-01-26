package org.example;
import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;
import javax.swing.table.TableStringConverter;
import java.util.Scanner;
import java.util.Formatter;

public class Main {
    public static void main(String[] args) throws IOException {
        int age;
        float marks;
        String name;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя студента: ");
        name = in.nextLine();
        System.out.print("Введите возраст студента: ");
        age = in.nextInt();
        System.out.print("Введите средний балл студента: ");
        marks = in.nextFloat();
        FileWriter writer = new FileWriter("students.txt", true);
        BufferedWriter bw = new BufferedWriter(writer);
        String student = String.format("Имя: %s, возраст: %s, средний балл: %s",name, Integer.toString(age), Float.toString(marks));
        bw.write(student);
        bw.newLine();
        bw.close();
    }
}
