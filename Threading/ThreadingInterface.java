package Threading;


class Number1 extends Thread{
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadingInterface{
    public static void main(String[] args) throws InterruptedException {
        Runnable b = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Update Database");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        Number1 n = new Number1();
        Thread t = new Thread(b);

        t.start();
        n.start();

        System.out.println("Bye");

    }
}

