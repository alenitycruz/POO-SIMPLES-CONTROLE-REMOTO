package teste;

public class Controle {
    public String modelo;

    public int canal;

    public int volume;

    protected boolean ligado;


    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Volume: " + this.volume);
        System.out.println("Canal: " + this.canal);
        System.out.println("Está ligado?  " + this.ligado);
    }

    protected void ligar()  {
        this.ligado = true;
    }

    protected void desligar() {
        this.ligado = false;
    }

}
