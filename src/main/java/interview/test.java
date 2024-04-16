package interview;

public class test {
    public interface Left {
        default void m1() {
            System.out.println("M1 called from Left");
        }
    }

    public interface Right {
        default void m1() {
            System.out.println("M1 called from Right");
        }
    }

    public static class Main implements Left, Right {
        @Override
        public void m1() {
            Right.super.m1();
        }
        public static void main(String[] args) {
            Main obj = new Main();
            obj.m1(); // Call the overridden or chosen implementation of m1()
        }
    }
}
