package sec04;

public class SwitchDemo {
    public static void main(String[] args) {
        Gender gender = Gender.����;

        String s = switch(gender) {
            case ���� -> "�� ���� �ǹ��� �ִ�.";
            case ���� -> "�� ���� �ǹ��� ����.";
        };
        System.out.println(gender + s);
    }
}

enum Gender {
    ����, ����
}