public class Camisa extends RopaPadre{

    private Boton [] botones;

    public Camisa (String color,double precio ,String talla, Boton [] botones){
        
        super(color, talla, precio);
        this.botones = botones;
    }

}
