//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Coche coche = Coche.crearCochePorConsola();

        coche.mostrarDetalles();

        coche.encenderMotor();

        coche.abrirPuertas();

    }
}