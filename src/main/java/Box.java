import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> fruits;

    public Box () {
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        if (fruits.isEmpty() || fruits.get(0).getClass() == fruit.getClass()) {
            fruits.add(fruit);
        } else {
            throw new IllegalArgumentException("Can't add " + fruit.getClass().getSimpleName()
            + " to " + getClass().getSimpleName());
        }
    }

    public void addFruits(List<T> fruits) {
        for(T fruit : fruits) {
            addFruit(fruit);
        }
    }

    public float getWeight() {
        float weight = 0.0f;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<?> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.0001;
    }

    public void merge(Box<T> box) {
        if (this == box) {
            return;
        }
        if (fruits.isEmpty() || fruits.get(0).getClass() ==
                box.fruits.get(0).getClass()) {
            fruits.addAll(box.fruits);
            box.fruits.clear();
        } else {
            throw new IllegalArgumentException("Can't merge " + getClass().
                    getSimpleName() + " with " + box.getClass().getSimpleName());
        }
    }

    public List<T> toList(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }
}
