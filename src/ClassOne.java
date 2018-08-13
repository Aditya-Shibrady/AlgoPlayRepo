public class ClassOne {

    public static void main(String args[]) {
        Runnable runner = () -> System.out.println("Hello World!");
        runner.run();

        Interf first = v -> v - 1;

        System.out.println(first.m1(5));

    }
}