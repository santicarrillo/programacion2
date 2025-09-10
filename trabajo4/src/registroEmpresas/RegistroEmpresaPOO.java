package registroEmpresas;

public class RegistroEmpresaPOO {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Empleado e1 = new Empleado("Ana", "Lopez", 30, 101, 50000);
        Empleado e2 = new Empleado("Juan", "Perez", 25, 102, 45000);
        UsuarioFinal u1 = new UsuarioFinal("Laura", "Gomez", 28, "lgomez", "1234");

        Jerarquico j1 = new Jerarquico("Carlos", "Martinez", 45, 201, 80000);
        j1.agregarEmpleado(e1);
        j1.agregarEmpleado(e2);

        empresa.agregarPersona(e1);
        empresa.agregarPersona(e2);
        empresa.agregarPersona(u1);
        empresa.agregarPersona(j1);

        System.out.println(empresa.exportarRegistro());
    }
}
