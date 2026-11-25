package Modulo2;

import java.util.Scanner;

public class Ejecutar2 {
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        VectorAleatorio v = null;

        //numero de elementos
        int x = 0;
        while (seguir) {
            System.out.print("Cuantos elementos tiene el vector?: ");

            try {
                x = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Escribe un entero trozo de mierda");
            }
            sc.nextLine();

            if (x > 0) {
                seguir = false;
                v = new VectorAleatorio(x);
                System.out.println("El vector es el siguiente:\n" + v.imprimir());
            } else {
                System.out.println("Debe tener más de 0 elementos");
            }
        }

        seguir = true;
        int min = 0;
        int max = 0;
        final int MIN = 0;
        final int MAX = 100;

        //rango
        while (seguir) {
            System.out.println("Rango entre el cual estarán los elementos del vector (si escribes 0   0 se agregarán valores por defecto):");
            try {
                System.out.print("\tMínimo: ");
                min = sc.nextInt();
                sc.nextLine();
                System.out.print("\tMáximo: ");
                max = sc.nextInt();

                if (min == 0 && max == 0) {
                    min = MIN;
                    max = MAX;
                }

                if (min >= max) {
                    System.out.println("El minimo y el maximo deben ser correctos");
                } else {
                    seguir = false;
                }


            } catch (Exception e) {
                System.out.println("Escribe enteros mamawebo");
            }
            sc.nextLine();
        }

        seguir = true;

        //ordenado o no?
        while (seguir) {
            System.out.print("Vamos a generar un vector aleatorio\n" +
                    "Desea que el vector esté ordenado?(si/no): ");

            try {
                String res = sc.next();

                if (res.equals("si") || res.equals("Si") || res.equals("SI") || res.equals("sí") || res.equals("Sí") || res.equals("SÍ")) {
                    if (x / (max - min) >= 1) {
                        v.generarAleatorioOrdenadoBruto(min, max);
                    } else {
                        v.generarAleatorioOrdenadoNormalizada(min, max);
                    }
                    seguir = false;

                } else if (res.equals("no") || res.equals("No") || res.equals("NO")) {
                    v.generarAleatorio(min, max);
                    seguir = false;
                } else {
                    System.out.println("No has respondido a mi pregunta debes responder si o no");
                }

            } catch (Exception e) {
                System.out.println("ERROR");
            }
            sc.nextLine();
        }

        System.out.println("Este es el vector con rango [" + min + ", " + max + "]:\n" + v.imprimir());


        //empezamos con lo chido

        seguir = true;

        while (seguir) {
            System.out.print("Desea ejecutar algoritmos de\n" +
                    "\t1-Ordenación\n" +
                    "\t2-Búsqueda\n\n" +
                    "\t\tOpción: ");

            int res = 0;
            try {
                res = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Aprende a escribir puto retrasado");
            }

            if (res == 1 || res == 2) {
                switch (res) {
                    case 1:
                        seguir = false;
                        ordenacion(v);
                        break;
                    case 2:
                        seguir = false;
                        busqueda(v);
                        break;
                    default:
                        System.out.println("mamawebo");
                        break;
                }
                esperar(2);

            } else {
                System.out.println("ERROR POR USUARIO ESTÚPIDO");
            }
        }
    }


    private static void ordenacion(VectorAleatorio v){
        System.out.print("Seleccione el algoritmo:\n\n" +
                "\t1-Ordenación por seleccicón\n" +
                "\t2-Ordenación por inserción\n" +
                "\t3-Ordenación por burbuja\n" +
                "\t4-CombSort\n" +
                "\t5-HeapSort\n" +
                "\t6-QuickSort\n" +
                "\t7-MergueSort\n" +
                "\t\tOtro-Nada\n\n" +
                "Opción: ");

        Scanner sc = new Scanner(System.in);

        int x=0;
        try {
            x = sc.nextInt();
        }catch (Exception e){
            System.out.print(e);
        }

        ArgoritmosOrdenacion a = new ArgoritmosOrdenacion();
        switch (x){
            case 1:
                System.out.println("\nEl vector está ordenado antes de usar el algoritmo?: "+v.ordenado());
                v = a.seleccion(v);
                System.out.print("EL vector tras el algoritmo de selección quedó así:\n" +
                        v.imprimir());
                System.out.print("\nEl vector quedó ordenado después?: "+v.ordenado());
                break;
            case 2:
                System.out.println("\nEl vector está ordenado antes de usar el algoritmo?: "+v.ordenado());
                v = a.insercion(v);
                System.out.print("EL vector tras el algoritmo de inserción quedó así:\n" +
                        v.imprimir());
                System.out.print("\nEl vector quedó ordenado después?: "+v.ordenado());
                break;
            case 3:
                System.out.println("\nEl vector está ordenado antes de usar el algoritmo?: "+v.ordenado());
                v = a.burbuja(v);
                System.out.print("EL vector tras el algoritmo de burbuja quedó así:\n" +
                        v.imprimir());
                System.out.print("\nEl vector quedó ordenado después?: "+v.ordenado());
                break;
            case 4:
                System.out.println("\nEl vector está ordenado antes de usar el algoritmo?: "+v.ordenado());
                v = a.combSort(v);
                System.out.print("EL vector tras el algoritmo de CombSort quedó así:\n" +
                        v.imprimir());
                System.out.print("\nEl vector quedó ordenado después?: "+v.ordenado());
                break;
            case 5:
                System.out.println("\nEl vector está ordenado antes de usar el algoritmo?: "+v.ordenado());
                v = a.heapSort(v);
                System.out.print("EL vector tras el algoritmo de HeapSort quedó así:\n" +
                        v.imprimir());
                System.out.print("\nEl vector quedó ordenado después?: "+v.ordenado());
                break;
            case 6:
                System.out.println("\nEl vector está ordenado antes de usar el algoritmo?: "+v.ordenado());
                v = a.QuickSort(v);
                System.out.print("EL vector tras el algoritmo de HeapSort quedó así:\n" +
                        v.imprimir());
                System.out.print("\nEl vector quedó ordenado después?: "+v.ordenado());
                break;
            case 7:
                System.out.println("\nEl vector está ordenado antes de usar el algoritmo?: "+v.ordenado());
                v = a.MergeSort(v);
                System.out.print("EL vector tras el algoritmo de HeapSort quedó así:\n" +
                        v.imprimir());
                System.out.print("\nEl vector quedó ordenado después?: "+v.ordenado());
                break;
            default:
                System.out.print("Tú eres tonto");
                break;
        }
    }

    private static void busqueda(VectorAleatorio v){
        System.out.print("Seleccione el algoritmo:\n\n" +
                "\t1-Búsqueda binaria\n" +
                "\t2-Problema del máximo subarray\n" +
                "\t3-Máximo de un vector sin DyV\n" +
                "\t4-Máximo de un vector con DyV\n" +
                "\t5-Trasponer matriz sin DyV\n" +
                "\t6-Trasponer matriz con DyV\n" +
                "\t7-Seleción QuickSelect\n" +
                "\t8-Multiplicar números grandes Karatsuba\n" +
                "\t9-Multiplicar matrices Strassen\n" +
                "\t\tOtro-Nada\n\n" +
                "Opción: ");

        Scanner sc = new Scanner(System.in);

        int x=0;
        try {
            x = sc.nextInt();
        }catch (Exception e){
            System.out.print(e);
        }

        AlgoritmosBusqueda a = new AlgoritmosBusqueda();
        switch (x){
            case 1:
                if(v.ordenado()){
                    System.out.print("Teclee el número a buscar: ");
                    try {
                        boolean res;
                        int num = sc.nextInt();
                        res = a.busquedaBinaria(v, num);
                        System.out.print("El número se encuentra en el vector?: "+res);
                    }catch (Exception e){
                        System.out.print("ERROR: Debe ser un número entero");
                    }
                }else{
                    System.out.print("Error, el vector debe estar ordenado");
                }
                break;
            case 2:
                System.out.print("La suma del máximo subarray del vector "+v.imprimir()+" es: "+a.maximoSubarray(v));
                break;
            case 3:
                System.out.print("El elemanto mayor del vector "+v.imprimir()+" es: "+a.maximoElementoSinDyV(v));
                break;
            case 4:
                System.out.print("El elemanto mayor del vector "+v.imprimir()+" es: "+a.maximoElementoConDyV(v));
                break;
            case 5:
                a.trasponerMatrizSinDyV(v);
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            default:
                System.out.print("Tú eres tonto");
                break;
        }
    }

    private void esperar(double seg){
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep((int) (seg*1000));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
