public class Question8 {
    public static void main(String[] args) {
        Question8 ts = new Question8();
        System.out.println(isAvailable + "");
        isAvailable = ts.doStuff();
        System.out.println(isAvailable);
    }

    public static boolean doStuff() {
        return !isAvailable;
    }

    static boolean isAvailable = false;
}