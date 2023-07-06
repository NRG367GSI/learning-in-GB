package OOP_Homework_1;

// Т.к. Вызов этого класса не подразумевается переведем его в разряд абстрактных
public abstract class Individual {

    private String surname;
    private String name;
    private String birthday;

    private static int count;

    static {
        count = 1;
    }

    static int setCount() {
        return count++;
    }

    public Individual(String surname, String name, String birthday) {
        this.surname = surname;
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return String.format("Фамилия: %s \n Имя: %s \n Родился: %s", surname, name, birthday);
    }
}
