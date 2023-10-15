package paquete1;

class Hilo extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("Primero " + i);
            System.out.println("Segundo " + i);
        }
    }
}