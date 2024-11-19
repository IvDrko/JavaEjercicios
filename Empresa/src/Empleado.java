public class Empleado {
    private String nombre;
    private String apellidos;
    private int sueldo_base;
    private double retenciones;
    private char categoria;

    private static int num_empleados=0;
    private static double primaGlobal=0;

    // Constructores
    public Empleado(String nombre){
        this.nombre=nombre;
        this.sueldo_base=1500;
        this.categoria='A';
        this.retenciones=5.0;
        num_empleados++;
    }
    public Empleado(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldo_base = 1500;
        this.categoria = 'A';
        this.retenciones = 5.0;
        num_empleados++;
    }

    public Empleado(String nombre, String apellidos, int sueldo_base, double retenciones, char categoria){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.sueldo_base=sueldo_base    ;
        this.retenciones=retenciones;
        this.categoria=categoria;
        num_empleados++;
    }

    // Metodos get + set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(int sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    public double getRetenciones() {
        return retenciones;
    }

    public void setRetenciones(double retenciones) {
        this.retenciones = retenciones;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }
    // Resto de métodos
    public double calcularSueldo() {
        double sueldoBruto = this.sueldo_base;
        switch (getCategoria()) {
            case 'A' -> sueldoBruto += 100;
            case 'B' -> sueldoBruto += 200;
            case 'C' -> sueldoBruto += 300;
            case 'D' -> sueldoBruto += 500;
            default -> {
                System.out.println("Categoría no válida");
                return 0;
            }
        }
        sueldoBruto += sueldoBruto * (primaGlobal / 100);

        sueldoBruto -= sueldoBruto * (retenciones / 100);
        return sueldoBruto;
    }
    @Override
    public String toString(){
        return getNombre()+" "+getApellidos()+", Sueldo base: "+getSueldo_base()+"Euros"+","+getCategoria()+", Retenciones"+getRetenciones()+"%";
    }
    public static int getNum_empleados(){
        return num_empleados;
    }
    public static void setPrimaGlobal(double prima){
        primaGlobal=prima;
    }
}
