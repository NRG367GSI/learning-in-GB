package OOP_Homework_1;

import java.util.ArrayList;
import java.util.LinkedList;

/*
Если брать во внимание что генеалогическое дерево ведут по мужской линии тогда
предок может быть 1
а вот потомков может быть несколько значит
первое поле это предок а второе это массив потомки
эти поля будут наполняться типом МУЖЧИНЫ наследниками класса человек
также должно быть поле содержащие в себе данные о нынешнем индивиде individual
это поле будит так же содержать тип мужчина

А что если этот класс будит принемать список состава семьи и отца записывать В ИНДИВИД, СЫНОВЕЙ  В список ПОТОМКИ,
а кого он будит записывать в поле ПРЕДОК
Допустим мы наполнили класс СЕМЬЯ объектами типа ИНДИВИД но отца главы семьи сдесь нет откуда его взять
Добавить в ручную из ИНДИВИДА или оставить пустым всеравно должен быть какой то первый объект с которого начинается все
Нет  все же разберать на состовные части класс СЕМЬЯ не практично, а вдруг понадобится дописать что то ну так добавить
функцию редактирования
 */
public class TreeCell {
    private Man ancestor;
    private Man individual;
    private Woman wife;
    private ArrayList<Woman> doughter;
    private ArrayList<Man> descendant;

    static LinkedList<FamilyComposition> familyTree;

    static {
        familyTree = new LinkedList<>();
    }

    public TreeCell(Man ancestor, Man individual, Man descendant) {
        this.ancestor = ancestor;
        this.individual = individual;
        this.descendant.add(descendant);
    }

    public TreeCell(FamilyComposition family) {
        if (familyTree.size() == 0) {
            this.ancestor = null;
            this.individual = family.getHasband();
            this.descendant = new ArrayList<>(family.son);
            this.wife = family.getWife();
            this.doughter = new ArrayList<>(family.doughter);
            }
        }

    public static void setFamilyTree(LinkedList<FamilyComposition> familyTree) {

    }

    @Override
    public String toString() {
        return String.format("Дедушка: %s \n \n Отец: %s \n\n Сыновья: %s", ancestor, individual, descendant);
    }

    public ArrayList<Woman> getDoughter() {
        return doughter;
    }

    public Woman getWife() {
        return wife;
    }
}

