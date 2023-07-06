package OOP_Homework_1;


import java.util.ArrayList;

public class Man extends Individual{
    final String floor = "Мужчина";
    private String id;

    private Status status;

    enum Status {
        ancestor, individual, descendant;
    }

    public Man(String surname, String name, String birthday, Status status) {
        super(surname, name, birthday);
        this.id = String.format("%s%d", this.getClass().getSimpleName().charAt(0), setCount());;
        this.status = status;

    }

    @Override
    public String toString() {
        return String.format("id: %s \n %s \n Пол: %s \n Статус: %s \n", this.id, super.toString(), floor, status);
    }

}
