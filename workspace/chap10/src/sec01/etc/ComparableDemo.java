package sec01.etc;

import java.util.Arrays;

class Rectangle {
    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int findArea() {
        return width * height;
    }

    public String toString() {
        return String.format("�簢��[��=%d, ����=%d]", width, height);
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        Rectangle[] rectangles = { new Rectangle(3, 5),
                new Rectangle(2, 10), new Rectangle(5, 5) };

        Arrays.sort(rectangles);

        for (Rectangle r : rectangles)
            System.out.println(r);
    }
}