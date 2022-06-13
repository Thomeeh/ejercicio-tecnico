package gestiondefacultad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nombre = "";
        String apellido = "";
        String curso = "";
        String departamento = "";
        String seccion = "";
        int dni = 0;
        int edad = 0;
        int telefono = 0;
        int incorporacion = 0;
        int despacho = 0;
        int entrada = 0;
        

        int menu = 0;
        int op2 = 0;
        int op3 = 0;
        int op4 = 0;
        int op5 = 0;
        int op6 = 0;
        int dni1 = 0;
        String secc = "";
        String depto = "";
        float sueldo = 0;
        boolean estadoCivil = false;
        String estado = "p";

        empleados em = new empleados();
        persona pr = new persona();
        profesor prf = new profesor();
        personalDeServicio pds = new personalDeServicio();
        estudiante es = new estudiante();

        List<persona> lisPersona = new ArrayList<>();
        List<profesor> lisProfesor = new ArrayList<>();
        List<estudiante> lisEstudiante = new ArrayList<>();
        List<empleados> lisEmpleados = new ArrayList<>();
        List<personalDeServicio> lisPersonalDeServicio = new ArrayList<>();

        System.out.println("1-ingresar una persona");
        System.out.println("2-cambiar estado civil de una persona");
        System.out.println("3-matriculacion de un estudiante a un nuevo curso ");
        System.out.println("4-cambio de departamento de un profesor");
        System.out.println("5-translado de seccion del personal de servicio");
        System.out.println("0-Salir");

        menu = scan.nextInt();

        while (menu != 0) {

            switch (menu) {
                case 1:

                    System.out.println("ingresar nombre :");
                    nombre = scan.next();

                    scan.nextLine();

                    System.out.println("ingresar apellido :");
                    apellido = scan.next();
                    scan.nextLine();

                    System.out.println("ingresar estadoCivil con "
                            + "p/(p=pareja/" + "s=sol@):");
                    estado = scan.nextLine();

                    System.out.println("ingresar d.n.i :");
                    dni = scan.nextInt();

                    System.out.println("ingresar edad:");
                    edad = scan.nextInt();
                    System.out.println("ingresar telefono :");
                    telefono = scan.nextInt();

                    if (estado.equals("p")) {
                        estadoCivil = true;
                    } else {
                        estadoCivil = false;
                    }

                    scan.nextLine();

                    System.out.println("ingresar opcion");
                    System.out.println("1-estudiante, 2-empleado");
                    op2 = scan.nextInt();
                    switch (op2) {
                        case 1:
                            int index = 0;
                            System.out.println("ingresar matriculacion a nuevo curso");
                            System.out.println("escribir con palabra el curso deseado ");
                            System.out.println("curso:mañana-tarde-noche");
                            scan.nextLine();
                            curso = scan.nextLine();
                            es = new estudiante(nombre, apellido, dni, edad, telefono, estadoCivil,
                                    curso);
                            lisEstudiante.add(es);
                            index++;
                            break;
                        case 2:
                            System.out.println("ingresar opcion");
                            System.out.println("1-profesor, 2-empleado de servicio");
                            op6 = scan.nextInt();
                            switch (op6) {
                                case 1:

                                    System.out.println("ingresar el año de incorporacion a la facultad:");
                                    entrada = scan.nextInt();
                                    System.out.println("ingresar el despacho:");
                                    despacho = scan.nextInt();
                                    System.out.println("ingresar el sueldo:");
                                    sueldo = scan.nextInt();
                                    System.out.println("ingresar el departamento:");
                                    System.out.println("lenguaje, matematica, arquitura");
                                    scan.nextLine();
                                    departamento = scan.nextLine();
                                    break;
                                case 2:
                                    System.out.println("ingresar el año de incorporacion a la facultad:");
                                    entrada = scan.nextInt();
                                    System.out.println("ingresar el despacho:");
                                    despacho = scan.nextInt();
                                    System.out.println("ingresar el sueldo:");
                                    sueldo = scan.nextInt();
                                    System.out.println("ingresar la seccion:");
                                    System.out.println("biblioteca, decanato, secretaria");
                                    scan.nextLine();
                                    seccion = scan.nextLine();
                                    break;
                            }
                            break;

                    }
                    em = new empleados(nombre, apellido, dni, edad, telefono,
                            estadoCivil, incorporacion, despacho, sueldo);
                    es = new estudiante(nombre, apellido, dni, edad, telefono, estadoCivil,
                            curso);
                    pr = new persona(nombre, apellido, dni, edad, telefono, estadoCivil);
                    prf = new profesor(nombre, apellido, dni, edad, telefono,
                            estadoCivil, incorporacion, despacho, sueldo, departamento);
                    pds = new personalDeServicio(nombre, apellido, dni, edad, telefono,
                            estadoCivil, incorporacion, despacho, sueldo, seccion);
                    lisPersona.add(pr);
                    lisEstudiante.add(es);
                    lisEmpleados.add(em);
                    lisProfesor.add(prf);
                    lisPersonalDeServicio.add(pds);

                    break;
                case 2:
                    estadoCivil = estado.equals("p");
                    pr.setEstadoCivil(estadoCivil);
                    pr.mostrarEstado();
                   pr = new persona(nombre, apellido, dni, edad, telefono, estadoCivil);
                    break;

                case 3:

                    System.out.println("ingresar dni del alumno");
                    op3 = scan.nextInt();
                    System.out.println("escribir con palabra el curso deseado ");
                    System.out.println("curso:mañana-tarde-noche");
                    scan.nextLine();
                    curso = scan.nextLine();

                    for (int i = 0; i < lisEstudiante.size(); i++) {

                        if (lisEstudiante.get(i).getDni() == op3) {
                            lisEstudiante.get(i).setCurso(curso);
                        }
                    }

                    System.out.println("cambio efectuado");

                    es.mostrarCurso();

                    break;
                case 4:
                    System.out.println("ingresar dni del profesor");
                    op4 = scan.nextInt();
                    System.out.println("cambio de departamento");
                    System.out.println("ingresar el departamento:");
                    System.out.println("lenguaje, matematica, arquitura");
                    scan.nextLine();
                    depto = scan.nextLine();
                    for (int i = 0; i < lisProfesor.size(); i++) {

                        if (lisProfesor.get(i).getDni() == op4) {
                            lisProfesor.get(i).setDepartamento(depto);
                        }
                    }
                        
                     prf.mostrarCambio();
                     System.out.println("cambio efectuado");
                    
                     lisProfesor.add(prf);
                    break;
                case 5:
                    System.out.println("ingresar dni del personal de servicio");
                    op5 = scan.nextInt();
                    System.out.println("ingresar opcion");
                    System.out.println("biblioteca, decanato, secretaria");
                    secc = scan.nextLine();
                    scan.next();

                    for (int i = 0; i < lisPersonalDeServicio.size(); i++) {
                        if (lisPersonalDeServicio.get(i).getDni() == op5) {
                            lisPersonalDeServicio.get(i).setSeccion(secc);
                        }
                    }

                    /*System.out.println("cantidad=" + lisPersona.size());

                    for (int i = 0; i < lisEstudiante.size(); i++) {

                        lisEstudiante.get(i).mostrarCurso();
                    }
                     */
                    break;

                case 6:
                    break;
                case 7:

                    break;

                case 0:
                    menu = 0;
                    break;
                default:
                    break;

            }
            System.out.println("1-ingresar una persona");
            System.out.println("2-cambiar estado de una persona");
            System.out.println("3-matriculacion estudiante ");
            System.out.println("4-cambio de departamento de un profesor");
            System.out.println("5-translado de seccion del personal de servicio");
            System.out.println("0-Salir");
            System.out.println("ingresar opcion :");
            menu = scan.nextInt();
        }

    }

}

