package ja_024_bancoempleado;


public class JA_024_BancoEmpleado {

  
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Jorge","Macias");
        Empleado emp2 = new Empleado("Martín","Perez");
        Empleado emp3 = new Empleado("Susana","Caldas");
        
        Empleado listaEmpleados[] = new Empleado[200];
        listaEmpleados[0] = emp1;
        listaEmpleados[1] = emp2;
        listaEmpleados[2] = emp3;
        Banco banco = new Banco("Bancolombia", listaEmpleados);
        banco.agregarEmpleado(emp3, 2);
    }
    
}
