class NumberPrinter implements Runnable {
    private int limit;
    private boolean isEvenNumber;
    
    public NumberPrinter(int limit, boolean isEvenNumber) {
        this.limit = limit;
        this.isEvenNumber = isEvenNumber;
    }
    
    public void run() {
        int number = isEvenNumber ? 2 : 1;
        while (number <= limit) {
            if ((isEvenNumber && number % 2 == 0) || (!isEvenNumber && number % 2 != 0)) {
                System.out.println(Thread.currentThread().getName() + ": " + number);
            }
            number += 2;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int limit = 20;
        Thread t1 = new Thread(new NumberPrinter(limit, true), "Even Thread");
        Thread t2 = new Thread(new NumberPrinter(limit, false), "Odd Thread");
        
        t1.start();
        t2.start();
    }
}
