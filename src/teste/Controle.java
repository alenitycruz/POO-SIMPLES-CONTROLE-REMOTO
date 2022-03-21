package teste;

public class Controle {
    String modelo;

    int canal;

    int volume;

    boolean ligado;


    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Volume: " + this.volume);
        System.out.println("Canal: " + this.canal);
        System.out.println("Está ligado?  " + this.ligado);
    }

    void ligar()  {
        this.ligado = true;
    }

    void desligar() {
        this.ligado = false;
    }

}
