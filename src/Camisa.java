public class Camisa extends RopaPadre{

    private Boton [] botones;

    public Camisa (String color,double precio ,String talla, Boton [] botones){
        
        super(color, talla, precio);
        this.botones = botones;
    }

    public Boton[] getBotones() {
        return botones;
    }

    public void setBotones(Boton[] botones) {
        this.botones = botones;
    }

    

}
