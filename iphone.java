// Dispositivo.java
public interface Dispositivo {
    void ligar();
    void desligar();
}

// iPhone.java
public abstract class iPhone implements Dispositivo {
    protected int bateria;
    protected boolean ligado;

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public void carregarBateria() {
        this.bateria = 100;
    }

    public int verificarBateria() {
        return this.bateria;
    }
}

// ReprodutorMusical.java
public class ReprodutorMusical extends iPhone {
    private int volume;

    public void aumentarVolume() {
        this.volume++;
    }

    public void diminuirVolume() {
        this.volume--;
    }

    public void tocarMusica(String musica) {
        // Implementação do método para tocar música
    }

    public void pausarMusica() {
        // Implementação do método para pausar música
    }
}

// AparelhoTelefonico.java
public class AparelhoTelefonico extends iPhone {
    private String numero;

    public void discar(String numero) {
        // Implementação do método para discar
    }

    public void atender() {
        // Implementação do método para atender
    }

    public void encerrar() {
        // Implementação do método para encerrar
    }
}

// NavegadorInternet.java
public class NavegadorInternet extends iPhone {
    private String url;

    public void navegarPara(String url) {
        // Implementação do método para navegar para uma URL
    }

    public void voltar() {
        // Implementação do método para voltar
    }

    public void avancar() {
        // Implementação do método para avançar
    }
}
