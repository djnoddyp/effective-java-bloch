package chapter2.item1;

public class Item1 {

    private String name;
    private int age;
    private String address;

    public Item1(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Item1(String name, int age) {
        this(name, age, "test");
    }

    public static Item1 withAddress(String name, int age, String address) {
        return new Item1(name, age, address);
    }

    public static Item1 withoutAddress(String name, int age) {
        return new Item1(name, age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}
