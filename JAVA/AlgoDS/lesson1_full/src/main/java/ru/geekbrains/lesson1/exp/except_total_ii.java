package ru.geekbrains.lesson1.exp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class except_total_ii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные в следующем формате: Фамилия Имя Отчество датарождения номертелефона пол");

        String inputLine = scanner.nextLine();
        String[] inputData = inputLine.split(" ");

        if (inputData.length != 6) {
            System.out.println("Ошибка: неверное количество данных.");
            return;
        }

        // Проверяем правильность форматов данных
        String nameRegex = "^[а-яА-Яa-zA-Z]+$";
        String dateOfBirthRegex = "^\\d{2}\\.\\d{2}\\.\\d{4}$";
        String phoneNumberRegex = "^\\d+$";
        String genderRegex = "^[mf]$";

        String lastName = inputData[0];
        if (!lastName.matches(nameRegex)) {
            System.out.println("Ошибка: Фамилия должна состоять только из букв.");
            return;
        }

        String firstName = inputData[1];
        if (!firstName.matches(nameRegex)) {
            System.out.println("Ошибка: Имя должно состоять только из букв.");
            return;
        }

        String middleName = inputData[2];
        if (!middleName.matches(nameRegex)) {
            System.out.println("Ошибка: Отчество должно состоять только из букв.");
            return;
        }

        String dateOfBirth = inputData[3];
        if (!dateOfBirth.matches(dateOfBirthRegex)) {
            System.out.println("Ошибка: неверный формат даты рождения. Используйте формат dd.mm.yyyy.");
            return;
        }

        String phoneNumber = inputData[4];
        if (!phoneNumber.matches(phoneNumberRegex)) {
            System.out.println("Ошибка: Номер телефона должен состоять только из цифр.");
            return;
        }

        String gender = inputData[5];
        if (!gender.matches(genderRegex)) {
            System.out.println("Ошибка: пол должен быть м или ж.");
            return;
        }

        try {
            // создаем новый файл с именем фамилии в текущей директории
            File file = new File(lastName + ".txt");
            file.createNewFile();

            // создаем FileWriter для записи в файл
            FileWriter writer = new FileWriter(file, true);

            // формируем строку для записи
            String outputLine = lastName + firstName + middleName + dateOfBirth + " " + phoneNumber + gender;

            // записываем в файл
            writer.write(outputLine);
            writer.write(System.lineSeparator()); // переходим на следующую строку

            // закрываем FileWriter
            writer.close();

            System.out.println("Данные успешно записаны в файл " + lastName + ".txt");

        } catch (IOException e) {
            System.out.println("Произошла ошибка при записи в файл: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
