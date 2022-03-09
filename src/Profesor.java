import javax.security.auth.login.AccountException;

public class Profesor extends Persona {

    private Integer categoria;

    public Profesor(int id, String nombre, String apellido, Integer categoria) {
        super(id, nombre, apellido);
        this.categoria = categoria;
       
    }

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }

    public void medioTiempo(int cantidad) throws AccountException{
        if(cantidad ==1){
            System.out.println("Medio tiempo");

        }
        else if(cantidad == 2){
            System.out.println("Tiempo completo");
        }else{
            throw new AccountException("Opcion de tipo de contrato no encontrado");
        }

        
        
    }
    

    

   
    


    
}
