package sec02;

import java.util.Arrays;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        String[] animals1 = { "�罿", "ȣ����", "�ٴ�ǥ��", "��" };

        List<String> animals2 = Arrays.asList(animals1);
        animals2.set(1, "�޹���");
//        animals2.add("����");

        for (String s : animals2)
            System.out.print(s + " ");
        System.out.println();

        animals2.sort((x, y) -> x.length() - y.length());
        String[] animals3 = animals2.toArray(new String[0]);
        for (int i = 0; i < animals3.length; i++)
            System.out.print(animals3[i] + " ");
        System.out.println();

        List<String> car = List.of("�׷���", "�ҳ�Ÿ", "�ƹ���", "���׽ý�");
//        car.set(1, "��Ÿ��");
        car.forEach(s -> System.out.print(s + " "));

//        List<Object> objects = List.of("a", null);
    }
}