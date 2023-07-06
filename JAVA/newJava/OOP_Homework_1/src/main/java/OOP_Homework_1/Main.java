package OOP_Homework_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/*
Задание 1
Приложение для проведения исследования генеологического древа
Описать компоненты. Тип человека, связь между людьми (родитель, ребенок). Дополнительные компоненты: вывод данных,
загрузка и сохранение данных, вывод по разным категориям

Задание 2
Взоимодействие объектов по какому то условию если хозяин позвал кота то он сделал то то
 */
/*
Что будим использовать
создание полей
создание статических полей
взаимодействие с объектами
геттеры сеттеры вывод объектов в консоль
документирование коментирование методов
конструкторы
методы объектов
объединение методов в каскады методов
создание перечислений констант
наследование

 */
public class Main {
    public static void main(String[] args) {
        Man dad = new Man("Иванов", "Иван", "5-10-1990", Man.Status.individual);
        //System.out.println(dad);
        Woman mom = new Woman("Иванова", "Мария", "5-5-1993", Woman.Status.wife);
        //System.out.println(mom);
        Man son1 = new Man("Иванов", "Виктор", "8-8-2015", Man.Status.descendant);
        //System.out.println(son1);
        Man son2 = new Man("Иванов", "Андрей", "10-10-2018", Man.Status.descendant);
        //System.out.println(son2);
        Woman daughter = new Woman("Иванова", "Наталья", "25-2-2020", Woman.Status.daughter);
        //System.out.println(daughter);

        FamilyComposition family = new FamilyComposition();
        family.setHasband(dad);
        family.setWife(mom);
        family.setSon(son1);
        family.setSon(son2);
        family.setDoughter(daughter);
        //System.out.println(family);
        TreeCell tree = new TreeCell(family);
        //System.out.println(tree);
        TreeCell.familyTree.addLast(family);
        //System.out.println(tree);

    }

}