package by.overone.lesson25;

public class HomeTask1 {
    public static void main(String[] args) {
        Integer iAmNull;
        try {
            iAmNull = null;
            int a = iAmNull;
            System.out.println(a);
        } catch (NullPointerException exception) {
            exception.printStackTrace();

        }
    }
}
