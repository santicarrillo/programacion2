package Sueldos;

public class SueldosPOO {
        public static void main(String[] args) {
            Empresa e1 = new EmpleadoContratado("Ana", "Desarrollo", "Perez", 50000);
            Empresa e2 = new EmprleadoHoraExtras("Soporte", "luis", "García", 40000, 1000, 5);
            Empresa e3 = new EmpleadoPorComision("Ventas", "Marta", "Dias", 30000, 200000, 0.05);

            System.out.println(e1 + " → Sueldo semanal: $" + e1.sueldo());
            System.out.println(e2 + " → Sueldo semanal: $" + e2.sueldo());
            System.out.println(e3 + " → Sueldo semanal: $" + e3.sueldo());
        }
}
