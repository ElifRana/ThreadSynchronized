public class Counter implements Runnable {

    int value = 0;

    @Override
    public void run() {
        increment();
        decrement();
    }

    private void increment() {
        for (int i = 0; i < 5; i++) {
            synchronized (this) {
                value++;
                System.out.println("Increment: " + this.value);
            }
        }
    }
    private void decrement() {
        for (int i = 0; i < 5; i++) {
            synchronized (this) {
                value--;
                System.out.println("Decrement: " + this.value);
            }
        }
    }
}
