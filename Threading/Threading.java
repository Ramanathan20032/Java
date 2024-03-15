package Threading;

class Book extends Thread{  // while using thread extend thread class
    // We are overriding the method in Thread
    // It should be public and void return type
    public void run(){     // run
        for(int i = 1; i <= 5; i++){
            System.out.println("Update Database");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Number extends Thread{
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
public class Threading{
    public static void main(String[] args) throws InterruptedException {    // Thread
        Book b = new Book();                    // Book - Thread
        Number n = new Number();
//      -----------------------------------------------
//        b.updateDB();
        // To Start the thread  obj.start();
        b.start();  // it searches for run() method
//      -----------------------------------------------
        n.start();
 /*
        if(Book.isAlive()) {
            System.out.println("Still executing");
        }
*/
//      -----------------------------------------------

//      object will wait and join with main thread
        b.join();
        b.join();
//      -----------------------------------------------

/*
        if(Book.isAlive()) {
            System.out.println("Still executing");
        }
*/

        System.out.println("Bye");
        // Bye will execute first
        // because Book,Number both r in different Threads
    }
}
