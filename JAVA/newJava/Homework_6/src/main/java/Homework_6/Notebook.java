package Homework_6;


public class Notebook {
    int id;
    String screen;
    String manufacturer;
    String seriesName;
    String processor;
    int volumeRam;
    int storage;
    String graphicsAccelerator;

    String color;
    Double cost;

    private static int counter;

    public Notebook() {
        counter++;
    }

    public static int getNumOfInstances() {
        return counter;
    }

    @Override
    public String toString() {
        return String.format("%3d, %24s, %8s, %16s, %16s, %4d, %4d, %s, %8s, цена: %8.2f",
                id, manufacturer, seriesName, screen, processor, volumeRam, storage,graphicsAccelerator, color, cost);
    }
}
