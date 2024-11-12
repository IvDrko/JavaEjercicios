//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejecutadora {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Libro l1= Libro.crearLibroConsola();
        l1.mostrarInformacion();
        Revista r1 = new Revista("R1",20,"Enero");
        r1.mostrarInformacion();
    }
}