package sec04.one;

public class EnumDemo {
    public static void main(String[] args) {
        Gender gender = Gender.FEMALE;
        if (gender == Gender.MALE)
            System.out.println(Gender.MALE + "�� ���� �ǹ��� �ִ�.");
        else
            System.out.println(Gender.FEMALE + "�� ���� �ǹ��� ����.");

//        if (gender == Direction.SOUTH)
//            System.out.println(Direction.SOUTH + "�� ����?");
//        gender = 5;
    }
}

enum Gender { MALE, FEMALE }
enum Direction { EAST, WEST, SOUTH, NORTH }