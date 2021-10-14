public class Empleado {
    private int id;
    private String nombre;
    private int salario;

    public Empleado( String nombre, int salario){
        this.nombre = nombre;
        this.salario = salario;      
    }

    public int getSalario(){
        return this.salario;        
    }
    
    public String getNombre(){
        return this.nombre;
    }

    public int setid(){
        return this.id;
    }
    
}
