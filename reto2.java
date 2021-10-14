
import java.util.ArrayList;

public class reto2 {
    private ArrayList<Empleado> empleados;

    public static double liquidarPrestacionesEmp( Empleado empleado){
        
        int salario = empleado.getSalario();
        double primaServicios; 
        double Cesantias; 
        double interesesces; 
        double vacaciones; 
        double prestacionEmp;
        
        primaServicios =  salario * 0.0833;
        Cesantias = salario * 0.0833;
        interesesces = Cesantias * 0.12;
        vacaciones = salario * 0.0416;
        prestacionEmp = primaServicios + Cesantias + interesesces + vacaciones;

        return prestacionEmp;       

    }

    public static double liquidarSegSocialEmp( Empleado empleado ){
        int salario = empleado.getSalario(); 
        double salud; 
        double pension; 
        double ARL; 
        double liquidarSegSEmp;
 
        
        salud = salario * 0.085;
        pension = salario * 0.12; 
        ARL = salario * 0.0052;
        liquidarSegSEmp = salud + pension + ARL; 

        return liquidarSegSEmp;
    

    } 
    
    
    public ArrayList<Empleado> getEmpleados (){
        return empleados;
    }


    public static void main(String[] args) {
        double prestacionEmp;
        double liquidarSegSEmp;
        
        prestacionEmp = liquidarPrestacionesEmp(null);
        System.out.format("%.2f\n",(prestacionEmp));

        liquidarSegSEmp = liquidarSegSocialEmp(null);
        System.out.format("%.2f",(liquidarSegSEmp));
        

    }

}
