public class Ejercicio6 {
    public void ejecutar(){
        Cola c = new Cola();
        for (int i=0; i<10; i++){
            c.encolar((int) (Math.random() * 9) +1);
        }
        c.mostrar();



        c.mostrar();
    }
}
