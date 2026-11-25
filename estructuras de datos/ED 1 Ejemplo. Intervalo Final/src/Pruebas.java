// No necesario importar java.lang.String
class Pruebas {
    public static void main(String[] args){
        String cadena = "competencia";
        String otraCadena = new String("desleal");
        String otraCadenaMas = new String();
        otraCadenaMas = cadena + " " + otraCadena;
        System.out.println(otraCadenaMas + ": " + otraCadenaMas.length() + " caracteres");
        System.out.println("Posicion 'pete' en " + cadena + ": " + cadena.indexOf("pete"));
        System.out.println("Caracteres 5 al 8 en " + cadena + ": " + cadena.substring(5,8));
        System.out.println("8 al cubo: " + Math.pow(8,3));
        double x = Math.pow(Math.sin(1),2) + Math.pow(Math.cos(1),2);
        System.out.println("Ecuación fundamental trigonometría: " + x);
        int radio = 7;
        System.out.println("Circunferencia: " + 2 * Math.PI * radio);
        System.out.println("Logaritmo natural: " + Math.log(Math.E));

        Integer numero = new Integer(5);
        numero+= 3;  // Se puede hacer lo mismo que con un int

        byte numByte = numero.byteValue();
        int diferencia = numero.compareTo(new Integer(3));
        System.out.println ("numByte: " + numByte + " y diferencia: " + diferencia);
        int valor = Integer.parseInt("27");
        int minimo = Integer.min(5,3);
        System.out.println("valor: " + valor + " y minimo = " + minimo);


    }
}