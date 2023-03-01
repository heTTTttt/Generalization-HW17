import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());


        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple());
        apples.add(new Apple());
        apples.add(new Apple());
        apples.add(new Apple());

        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruits(apples);

        float expectedWeight = 4.0f;

        if (expectedWeight != appleBox1.getWeight()) {
            System.out.println("Who stole my apples???");
        } else System.out.println("Right weight");

        System.out.println("================================");

        boolean isEqual = orangeBox.compare(appleBox);

        System.out.println(isEqual);

        System.out.println("================================");

        System.out.println("Before merge:");
        System.out.println("Box 1 weight " + orangeBox.getWeight());
        System.out.println("Box 2 weight " + orangeBox1.getWeight());
        System.out.println();

        orangeBox.merge(orangeBox1);

        System.out.println();
        System.out.println("After merge:");
        System.out.println("Box 1 weight " + orangeBox.getWeight());
        System.out.println("Box 2 weight " + orangeBox1.getWeight());
    }
}
