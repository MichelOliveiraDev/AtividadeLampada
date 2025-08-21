// Classe de Teste da Lâmpada
public class LampadaTeste {
    public static void main(String[] args) {
        Lampada lamp1 = new Lampada("LED", 110, "Branca", "Philips", 20.5, 15, false);
        Lampada lamp2 = new Lampada("Fluorescente", 220, "Amarela", "Osram", 35.0, 20, true);

        System.out.println(lamp1.toString());
        System.out.println(lamp2.toString());

        // Comparar potência
        if (lamp1.getPotencia() > lamp2.getPotencia()) {
            System.out.println("A lâmpada de maior potência é: " + lamp1.getMarca());
        } else if (lamp2.getPotencia() > lamp1.getPotencia()) {
            System.out.println("A lâmpada de maior potência é: " + lamp2.getMarca());
        } else {
            System.out.println("As duas lâmpadas possuem a mesma potência.");
        }

        // Comparar preço
        if (lamp1.getPreco() > lamp2.getPreco()) {
            System.out.println("A lâmpada mais cara é: " + lamp1.getMarca());
        } else if (lamp2.getPreco() > lamp1.getPreco()) {
            System.out.println("A lâmpada mais cara é: " + lamp2.getMarca());
        } else {
            System.out.println("As duas lâmpadas possuem o mesmo preço.");
        }
    }
}