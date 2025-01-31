public class Pantalon extends RopaPadre{

    private Boton boton;

    public Pantalon (String color, String talla, double precio, Boton boton){
        super(color, talla, precio);
        this.boton = boton;
    }

    public Boton getBoton() {
        return boton;
    }

    public void setBoton(Boton boton) {
        this.boton = boton;
    }

    

}
