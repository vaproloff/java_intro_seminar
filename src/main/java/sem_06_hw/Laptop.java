package sem_06_hw;

public class Laptop {
    private String brandName;
    private String modelName;
    private String color;
    private String cpu;
    private int ramSize;
    private int romSize;
    private double screenSize;
    private boolean ssd;
    private boolean touchScreen;

    public Laptop(String brandName, String modelName, String color, String cpu, int ramSize, int romSize,
                  double screenSize, boolean ssd, boolean touchScreen) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.color = color;
        this.cpu = cpu;
        this.ramSize = ramSize;
        this.romSize = romSize;
        this.screenSize = screenSize;
        this.ssd = ssd;
        this.touchScreen = touchScreen;
    }

    @Override
    public String toString() {
        return "Бренд: " + brandName + "\n" +
                "Модель: " + modelName + "\n" +
                "Цвет: " + color + "\n" +
                "Процессор: " + cpu + "\n" +
                "Оперативная память: " + ramSize + "\n" +
                "Встроенный накопитель: " + romSize + "\n" +
                "Экран: " + screenSize + "\n" +
                "SSD: " + (ssd ? "Да" : "Нет") + "\n" +
                "Сенсорный экран: " + (touchScreen ? "Да" : "Нет") + "\n";
    }

    public String getBrandName() {
        return brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public String getColor() {
        return color;
    }

    public String getCpu() {
        return cpu;
    }

    public int getRamSize() {
        return ramSize;
    }

    public int getRomSize() {
        return romSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public boolean isSsd() {
        return ssd;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }
}
