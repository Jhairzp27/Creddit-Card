public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, user");

        int ancho = 23;
        int alto = 10;

        // NUMERO DE LA TARJETA
        NumeroTarjeta card = new NumeroTarjeta();
        card.setNumero("1234-5678-9012-3456");
        int posicionNumTarj = (alto -1)/2;
        // NOMBRE DEL TITULAR

        NombreTitular titular = new NombreTitular();
        titular.setNombre("Jhair Zambrano");
        int posicionNombre = (ancho - card.getNUmero().length())/2;
        /*
         * FECHA
         *      Formato YY/MM
         */
        FormatFecha fecha = new FormatFecha();

        fecha.setFecha("26/08");

         // NUMERO SEGURIDAD

        NumeroSeguridad Seguridad = new NumeroSeguridad();
        System.out.println(Seguridad.getSeguridad());
        
        System.out.println(card.getNUmero());
        System.out.println(titular.getNombre());
        System.out.println(fecha.getFecha());
        
        Seguridad.setSeguridad("357");
    }

}
