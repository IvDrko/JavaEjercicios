//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Lavadora lavadoraAEG = new Lavadora(400.0,"PK",30, Electrodomestico.Color.plateado,7);
        Television tvSamsung = new Television();
        System.out.println("Lavadora AEG: "+lavadoraAEG);
        System.out.println("El precio final será de: "+lavadoraAEG.precioFinal()+"€");
        System.out.println("tvSamsung: "+tvSamsung);
        System.out.println("El precio final será de: "+tvSamsung.precioFinal()+"€");
        System.out.println("Cambio en la tvSamsung: ");
        tvSamsung.setPrecio_base(190);
        tvSamsung.setConsumo_energetico("A+");
        tvSamsung.setColores(Electrodomestico.Color.negro);
        tvSamsung.setPeso(10);
        tvSamsung.setResolucion(24);
        tvSamsung.setNetflix(true);
        System.out.println("tvSamsung: "+tvSamsung);
        System.out.println("El precio final será de: "+tvSamsung.precioFinal()+"€");
        }
    }