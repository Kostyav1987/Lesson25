package by.overone.lesson25;

public class MyErrorTask4 extends RuntimeException{
    public MyErrorTask4(String message) {
        super(message);
    }


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
