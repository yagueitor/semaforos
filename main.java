package actividad2;

public class main {

    public static void main(String[] args) {
        int n = 5;
        int k = 10;

        semaforo semaforo = new semaforo(k);

        for (int i = 0; i < n; i++) {
            Thread t = new Thread(() -> {
                for (int j = 0; j < 3; j++) {
                    try {
                        semaforo.guardar(1);
                        semaforo.liberar(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            t.start();
        }
    }
}