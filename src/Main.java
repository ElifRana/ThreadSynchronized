public class Main {

    public static void main(String[] args) {

        Counter counter = new Counter();
        Thread a = new Thread(counter);

        a.start();

    }
}
