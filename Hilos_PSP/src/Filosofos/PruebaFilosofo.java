package Filosofos;

public class PruebaFilosofo {
        public static void main(String[] args) {
                int NUM_PROCESOS=5;
                Filosofo filosofos[]=new Filosofo[NUM_PROCESOS];
                ManejaPalillos gestorPalillos;
                gestorPalillos=new ManejaPalillos(NUM_PROCESOS);
                Thread hilos[]=new Thread[NUM_PROCESOS];
                for (int i=1; i<NUM_PROCESOS; i++){
                        filosofos[i]=new Filosofo(
                                gestorPalillos, i, i-1);
                        hilos[i]=new Thread(filosofos[i]);
                        hilos[i].start();
                }
                filosofos[0]=new Filosofo(
                                gestorPalillos, 0, 4);
                hilos[0]=new Thread(filosofos[0]);
                hilos[0].start();
        } //Fin del main
} //Fin de la clase

