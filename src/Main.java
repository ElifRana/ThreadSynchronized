public class Main {

    public static void main(String[] args) {

        Counter counter = new Counter();
        Thread increment = new Thread(counter);
        Thread decrement = new Thread(counter);

        increment.start();
        decrement.start();

    }
}
