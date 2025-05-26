package Day05;

public class TesteLampada {
    public static void main (String[] args) {

        Lampada lampada = new Lampada("intelbras","spot","branca",false,false,50);

        String lampadaSelecionada = "Lampada selecionada foi: \n" +
                "nome: %s \n"+
                "modelo: %s \n"+
                "cor: %s \n"+
                "é led? %s \n"+
                "está ligada? %s \n"+
                "preço: %s";

        System.out.printf((lampadaSelecionada) + "%n",lampada.getMark(),lampada.getModel(),lampada.getColor(),
                lampada.isLed(),lampada.isConnected(),lampada.getPrice());

        Lampada lampada2 = new Lampada();
        lampada2.setMark("Elgin");
        lampada2.setModel("bulbo");
        lampada2.setColor("branca");
        lampada2.setIfItIsled(false);
        lampada2.turnOnTheLamp(false);
        lampada2.setPrice(32);

        String lampadaSelecionada2 = "Lampada selecionada foi: \n" +
                "nome: %s \n"+
                "modelo: %s \n"+
                "cor: %s \n"+
                "é led? %s \n"+
                "está ligada? %s \n"+
                "preço: %s";

        System.out.printf((lampadaSelecionada2) + "%n",lampada2.getMark(),lampada2.getModel(),lampada2.getColor(),
                lampada2.isLed(),lampada2.isConnected(),lampada2.getPrice());
    }
}