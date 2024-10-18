import java.util.Scanner;
import java.util.*;
//sqrt
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);//input de datos
//        //LibroCalificaciones miLibroCalificaciones =
//        //      new LibroCalificaciones("","",0,0.0);
//        System.out.println("Ingrese el nombre del curso: ");
//        String nombreDelCurso = scanner.nextLine();
//
//        System.out.println("Ingrese periodo: ");
//        String periodo = scanner.nextLine();
//
//        System.out.println("Ingrese el año: ");
//        int anio = scanner.nextInt();
//
//        System.out.println("Ingrese el promedio: ");
//        Double promedio = scanner.nextDouble();
//        LibroCalificaciones miLibroCalificaciones =
//                new LibroCalificaciones(nombreDelCurso, periodo, anio, promedio);
//        miLibroCalificaciones.establecerNombreDelCurso(nombreDelCurso);
//        //miLibroCalificaciones.setPeriodo(periodo);
//        //miLibroCalificaciones.setAnio(anio);
//        //miLibroCalificaciones.setPromedio(promedio);
//        miLibroCalificaciones.mostrarMensaje();
//




        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese el primer numero: ");
        Double n1 = sc.nextDouble();

        System.out.println("Ingrese el segundo numero: ");
        Double n2 = sc.nextDouble();

        Operaciones op = new Operaciones();

        Operaciones operaciones = new Operaciones();
        op.calcularSumaImpresion();
        op.setN1((n1));
        op.setN2(n2);
        op.imprimirDatos();

        System.out.println(op.calcularSuma());
        op.calcularSumaImpresion();

    }
}