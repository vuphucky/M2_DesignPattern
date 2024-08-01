// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ObjectPoolDemo {
    public static final int NUM_OF_CLIENT = 8;
    public static void main(String[] args) {
       TaxiPool taxiPool = new TaxiPool();
        for (int i = 0; i < NUM_OF_CLIENT; i++) {
            Runnable client = new TaxiThread(taxiPool);
            Thread thread = new Thread(client);
            thread.start();
        }
    }
}