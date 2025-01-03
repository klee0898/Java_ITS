package sec02;

import java.util.HashSet;
import java.util.Set;

public class HashSet2Demo {
    public static void main(String[] args) {
        Set<Fruit> fruits = new HashSet<>();
        fruits.add(new Fruit("���"));
        fruits.add(new Fruit("���"));
        System.out.println(fruits.size());
        System.out.println(fruits);
    }
}

class Fruit {
    String name;

    public Fruit(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Fruit)
            return ((Fruit) o).name.equals(name);

        return false;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return String.format("Fruit(%s)", name);
    }
}