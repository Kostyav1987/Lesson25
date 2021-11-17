package by.overone.lesson25;

public class MyError extends Exception {
    public static void main(String[] args) {
        int a, b;
        try{
            a = 5;
            b = 0;

            if(b==0) {
                throw new MyError();
            }
            System.out.println(a/b);
        }catch (MyError exception){
            exception.printStackTrace();
        } finally {
            System.out.println("finally block");
        }
    }
}
