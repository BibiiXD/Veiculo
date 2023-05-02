public class Principal {
    public static void main(String[] args) {
        Mobilete mobilete = new Mobilete("Mobilete", "Monark", "Rosa", 2000);

        System.out.println(mobilete.getMarca());
        System.out.println(mobilete.getModelo());
        System.out.println(mobilete.getCor());
        System.out.println(mobilete.getAno());

        Bicicleta bicicleta = new Bicicleta("Caloi", "Caloizinha", "Azul Calcinha", 2006);

        System.out.println(bicicleta.getMarca());
        System.out.println(bicicleta.getModelo());
        System.out.println(bicicleta.getCor());
        System.out.println(bicicleta.getAno());

        Patinete patinete = new Patinete("Scooter", "Scoteira", "Amarelo Sol", 2020);

        System.out.println(patinete.getMarca());
        System.out.println(patinete.getModelo());
        System.out.println(patinete.getCor());
        System.out.println(patinete.getAno());

    }

}
