import javax.security.auth.login.AccountException;

public class Alumno extends Persona {

    private int semetre;

    public Alumno(int id, String nombre, String apellido, int semetre) {
        super(id, nombre, apellido);
        this.semetre = semetre;
    }




  

    public int getSemetre() {
        return semetre;
    }

    public void setSemetre(int semetre) {
        this.semetre = semetre;
    }
    public void semetre(int sem) throws AccountException{
        if(sem > 10 || sem < 1){
            throw new AccountException("El semestre no existe");
        }
    }

    public void error() throws AccountException{
        throw new AccountException("Error no sirve");
    }

   

    

    
}