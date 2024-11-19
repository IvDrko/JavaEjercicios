//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Pedro","Pérez",1300,2,'B');
        Empleado e2 = new Empleado("Ana","Díez");
        Empleado e3 = new Empleado("Carmen", "Lorenzo", 1250, 6, 'D');

        // Mostrar los datos de los empleados antes de aplicar la prima
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println("Número de empleados: " + Empleado.getNum_empleados());

        // Aplicar prima global del 10% a todos los empleados
        Empleado.setPrimaGlobal(10);

        // Mostrar los datos de los empleados después de aplicar la prima
        System.out.println("Después de aplicar la prima global del 10%: ");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println("Número de empleados: " + Empleado.getNum_empleados());

        // Cambio la categoria del empleado 1
        e1.setCategoria('C');

        // Mostrar los datos de los empleados después del ascenso de Pedro
        System.out.println("Después del ascenso de Pedro a categoría C:");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println("Número de empleados: " + Empleado.getNum_empleados());
    }
}