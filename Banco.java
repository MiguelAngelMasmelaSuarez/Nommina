import java.util.ArrayList;

public class Banco {
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
        ARL = salario * 0.00522;
        liquidarSegSEmp = salud + pension + ARL; 

        return liquidarSegSEmp;
    
    } 
    
    public static double liquidarNominaEmp( Empleado empleado){
        int salario = empleado.getSalario();
        double salud1;
        double pension1;
        double totalDevengado;
        double liquidarNomEmp;
        
        


        salud1 = salario *0.04; 
        pension1 = salario * 0.04;
        totalDevengado = salud1 + pension1;
        
        liquidarNomEmp = salario - totalDevengado ;
        
        
        
        return liquidarNomEmp;
        
        

    }

    public static double liquidarParafiscalesEmp( Empleado empleado){
        int salario = empleado.getSalario(); 
        double compFamiliar; 
        double ICBF; 
        double SENA; 
        double liquidarParafEmp;
 

        
        compFamiliar = salario * 0.04;
        ICBF = salario * 0.03; 
        SENA = salario * 0.02;
        liquidarParafEmp = compFamiliar + ICBF + SENA; 

        return liquidarParafEmp;

    }

    public static double costoEmpleadoParaLaEmpresa (Empleado empleado){
        int salario = empleado.getSalario();
        double prestacionEmp;
        double liquidarSegSEmp;
        double liquidarParafEmp;
        double liquidarNomEmp;
        double costoEmpPLEmpresa;

        prestacionEmp = liquidarPrestacionesEmp(empleado);
        liquidarSegSEmp = liquidarSegSocialEmp(empleado);
        liquidarParafEmp = liquidarParafiscalesEmp(empleado);
        liquidarNomEmp = liquidarNominaEmp(empleado);

        
        costoEmpPLEmpresa = salario + prestacionEmp + liquidarSegSEmp + liquidarParafEmp - liquidarNomEmp;

        return costoEmpPLEmpresa;

    }

    
    public ArrayList<Empleado> getEmpleados (){
        return empleados;
    }


    public static void main(String[] args) {
                        
        double prestacionEmp;
        double liquidarSegSEmp;
        double liquidarNomEmp;
        double liquidarParafEmp;
        double costoEmpPLEmpresa;

        prestacionEmp = liquidarPrestacionesEmp(null);
        System.out.format("%.2f\n",(prestacionEmp));

        liquidarSegSEmp = liquidarSegSocialEmp(null);
        System.out.format("%.2f",(liquidarSegSEmp));

        liquidarNomEmp = liquidarNominaEmp(null);
        System.out.format("%.2f\n",(liquidarNomEmp));

        liquidarParafEmp = liquidarParafiscalesEmp(null);
        System.out.format("%.2f", (liquidarParafEmp));

        costoEmpPLEmpresa = costoEmpleadoParaLaEmpresa(null);
        System.out.format("%.1f", (costoEmpPLEmpresa));

        

    }

}
