package teste;

public class Main {
    public static void main(String[] args) {
        Controle c1 = new Controle();
        c1.setCanal(13);
        c1.setVolume(30);
        c1.ligar();
        c1.status();

        Controle c2 = new Controle();
        c2.setModelo("Sony");
        c2.setCanal(2);
        c2.setVolume(40);
        c2.ligar();
        c2.status();

        Controle c3 = new Controle();
        c3.setCanal(11);
        c3.setVolume(20);
        c3.ligar();
        c3.status();




    }
}
