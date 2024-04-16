package interview;

public class Abc {
    public  interface a{
        void text();
         default void fun(){
             System.out.println("Hi");
        }
    }

    public class b implements a{
        @Override
        public void text() {

        }

    }
}
