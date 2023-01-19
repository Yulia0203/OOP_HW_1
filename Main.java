package OOP_HW_1;

public class Main {
    public static void main(String[] args) {
        Children child = new Children("Нина", "Иванова", 5, "Дочь");
        System.out.println(child);
        System.out.println(child.mother());
        System.out.println(child.father());
        System.out.println(child.grandFather());
        System.out.println(child.grandMother());
    }
}
