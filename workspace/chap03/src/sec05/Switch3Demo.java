package sec05;

public class Switch3Demo {
    public static void main(String[] args) {
        show("호랑이");
        show("참새");
        show("고등어");
        show("곰팡이");
    }

    static void show(String bio) {
        String kind = "...";
        switch (bio) {
            case "호랑이", "사자" -> kind = "포유류";
            case "독수리", "참새" -> kind = "조류";
            case "고등어", "연어" -> kind = "어류";
            default -> System.out.print("어이쿠! ");
        }
        System.out.printf("%s는 %s이다.\n", bio, kind);
    }
}
