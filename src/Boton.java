public class Boton extends RopaPadre {

    private String tamanio;

	private String forma;

    public Boton (String color, String forma, String tamanio){

        super(color);
        this.tamanio = tamanio;
        this.forma = forma;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    
}
