

import javax.security.auth.login.AccountException;

public class Asignatura {
    private String materia;
    private String profesor;
    private String estudiante;
    private Float nota;
   


    
    



   /* public Asignatura(String nombre, Profesor profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
        
    }
*/


   


    public String getMateria() {
        return materia;
    }



    public void setMateria(String materia) {
        this.materia = materia;
    }



    public String getEstudiante() {
        return estudiante;
    }



    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }



    


    public String getProfesor() {
        return profesor;
    }



    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }



    public Float getNota() {
        return nota;
    }



    public void setNota(Float nota) {
        this.nota = nota;
    }

    public void comprobarlista(Float n) throws AccountException{
        if (n < 0.0 || n > 5.0 ){
            throw new AccountException("La nota no es valida");

        }
    }
    



    



    


    
}
