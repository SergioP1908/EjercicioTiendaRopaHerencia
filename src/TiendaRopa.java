public class TiendaRopa {

    public static void main(String[] args) {
        TiendaRopa tienda = new TiendaRopa();

        tienda.abrirTienda();
    }

    private void abrirTienda(){

        Boton boton1 = new Boton("rojo", "redondo", "pequeño");
        Boton boton2 = new Boton("verde", "redondo", "pequeño");
        Boton boton3 = new Boton("azul", "redondo", "pequeño");

        Boton [] botones = {boton1,boton2,boton3};

        Camisa camisa1 = new Camisa("verde", 10.50, "L", botones);

        for (Boton boton : botones) {
            System.out.println(camisa1.getColor()+" "+ boton.getColor());
        }

        
    }

}
