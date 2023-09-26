package aula05;

public class ControleRemote implements Controlador {
    private int volume;
    private boolean ligando;
    private boolean tocando;

    public ControleRemote() {
        this.volume = 50;
        this.ligando = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigando() {
        return ligando;
    }

    private void setLigando(boolean ligando) {
        this.ligando = ligando;
    }

    public boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        setLigando(true);
    }

    @Override
    public void desligar() {
        setLigando(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Esta ligado? " + getLigando());
        System.out.println("Esta tocando? " + getTocando());
        System.out.println("Volume: " + getVolume());
        for (int i = 0; i < 10; i++) {
            System.out.println("[]");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu");
    }

    @Override
    public void maisVolume() {
        if (getLigando()) {
            setVolume(getVolume() + 1);
        }
    }

    @Override
    public void menosVolume() {
        if (getLigando()) {
            setVolume(getVolume() - 1);
        }
    }

    @Override
    public void ligarMudo() {
        if (getLigando() && getVolume() > 0) {
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (getLigando() && getVolume() == 0) {
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if (getLigando() && !getTocando()) {
            setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (getLigando() && getTocando()) {
            setTocando(false);
        }
    }
}
