import java.util.Scanner;
public class Libro extends Publicacion{
    private String autor;
    private String isbn;

    public Libro(String t1, int mp, String autor, String isbn) {
        super(t1, mp); //Llamar a los atributos del padre, tambien son necesarios pedirlos.
        this.autor = autor;
        this.isbn = isbn;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Autor: "+this.autor);
        System.out.println("isbn: "+this.isbn);
    }
    public static Libro crearLibroConsola(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un titulo: ");
        String titulo = sc.nextLine();

        System.out.println("Dime un num pag: ");
        int np = sc.nextInt();
        sc.nextLine();

        System.out.println("Dime un autor: ");
        String autor = sc.nextLine();

        System.out.println("Dime un isbn: ");
        String isbn = sc.nextLine();

        return new Libro(titulo,np,autor,isbn);

    }
}
