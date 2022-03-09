import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;


public class Principal{
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int opcion;
      
    
        List<Alumno> alumno = new ArrayList<Alumno>();
        List<Profesor> profesores = new ArrayList<Profesor>();
        List<Asignatura> asignatura = new ArrayList<Asignatura>();

        do{
            System.out.println("Ingrese una opción");
            System.out.println("1. Registrar estudiantes");
            System.out.println("2. Registar Profesores");
            System.out.println("3. Registrar materias");
            System.out.println("4. Mostrar estudiantes");
            System.out.println("5. Mostrar Profesores");
            System.out.println("6. Mostrar Materias registradas");
            System.out.println("0.Salir");

            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    try{
                        System.out.println("Ingrese el nombre del estudiante");
                        String nombre = scan.next();

                        System.out.println("Ingrese el apellido");
                        String apellido = scan.next();

                        System.out.println("Ingrese id");
                        int id = scan.nextInt();

                        System.out.println("Ingrese en el semetre que va a cursar");
                        int semetre = scan.nextInt();

                        Alumno al = new Alumno(id, nombre,apellido,semetre);

                        al.setNombre(nombre);
                        al.setApellido(apellido);
                        al.setId(id);
                        al.setSemetre(semetre);
                        al.semetre(semetre);
                        alumno.add(al);
                    }catch (Exception e){
                        System.out.println("Error "+ e.getMessage());
                    }
                    break;
                        
                case 2:
                    try {
                        System.out.println("Ingrese el nombre del profesor");
                        String nombre = scan.next();
    
                        System.out.println("Ingrese el apellido");
                        String apellido = scan.next();
    
                        System.out.println("Ingrese id");
                        int id = scan.nextInt();
    
                        System.out.println("Ingrese 1 si su contrato es a medio tiempo o 2 si es tiempo completo");
                        int tiempo1 = scan.nextInt();//1 o2
                       
                
                    
    
                        Profesor pro = new Profesor(id, nombre, apellido, tiempo1);
                        pro.setId(id);
                        pro.setNombre(nombre);
                        pro.setApellido(apellido);
                        pro.setCategoria(tiempo1);
                        pro.medioTiempo(tiempo1);
                        profesores.add(pro);
                        
                        
                    } catch (Exception e) {
                        System.out.println("Error "+ e.getMessage());
                    }
                    break;
                    
                 
                case 3:
                    try {
                        System.out.println("Digite el nombre del estudiante");
                        String nomes = scan.next();
                        
                        for (Alumno estudian : alumno){

                            if (nomes.equals(estudian.getNombre())){
                                System.out.println("Estudiante correctamente registrado");
                                System.out.println("Ingrese el nombre del profesor");
                                String pro = scan.next();
                            
                                for (Profesor prof : profesores){

                                    if (pro.equals(prof.getNombre())){
                                        System.out.println("Profesor correctamente registrado");
                                        Asignatura asig = new Asignatura();
                                        System.out.println("Ingrese la nota del estudiante");
                                        float nota = scan.nextFloat();
                                        System.out.println("Digite el nombre de la materia");
                                        String mat =scan.next();
                                        asig.comprobarlista(nota);
                                        asig.setMateria(mat);
                                        asig.setEstudiante(nomes);
                                        asig.setProfesor(pro);
                                        asig.setNota(nota);
                                        asignatura.add(asig);

                                    

                                    }

                                }
                            }
                        }
                        
                    } catch (Exception e) {
                        System.out.println("Error "+e);
                        
                    }
                    break;
                        
                case 4:
                    alumno.forEach((c) -> System.out.println("Nombre: " + c.getNombre() + ", apellido: " + c.getApellido() + 
                    ", id: " + c.getId() + ", semetre: "+ c.getSemetre()));
                    break;
                case 5:
                    profesores.forEach((c) -> System.out.println("Nombre: " + c.getNombre() + ", apellido: " + c.getApellido() + 
                    ", id: " + c.getId() + ", tipo trabajo: "+ c.getCategoria()));
                    break;
                case 6:
                asignatura.forEach((a) -> System.out.println("Materia: " + a.getMateria() + "Nota: " +  a.getNota() + "Esudiante: " + a.getEstudiante() + "Profesor: " + a.getProfesor()));
                    break;

                    
                    
            } 
        }while(opcion !=0);
    }
    // 
  //

   
}
        

            
        
        