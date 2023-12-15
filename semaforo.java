package actividad2;
import java.util.concurrent.Semaphore;

public class semaforo {

    private final Semaphore sem;
    private final int s;

    public semaforo(int s) {
        this.sem = new Semaphore(s);
        this.s = s;
    }

    public void guardar(int b) throws InterruptedException {
        sem.acquire(b);
        System.out.println("El proceso llamado " + Thread.currentThread().getName() + " se guarda " + b + " unidades");
    }

    public void liberar(int c) {
        sem.release(c);
        System.out.println("El proceso llamado " + Thread.currentThread().getName() + " deja libres " + c + " unidades");
    }
}