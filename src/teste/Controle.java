package teste;

public class Controle {
    public String modelo;

    public int canal;

    public int volume;

    protected boolean ligado;

    public Controle() {
        this.setModelo("Panasonic");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void status(){
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Volume: " + this.getVolume());
        System.out.println("Canal: " + this.getCanal());
        System.out.println("Está ligado?  " + this.isLigado());
    }

    protected void ligar()  {
        this.ligado = true;
    }

    protected void desligar() {
        this.ligado = false;
    }

}
