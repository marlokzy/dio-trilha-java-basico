public class SisemaMedida2 {
    public static void main(String[] args) {
        // Modo condicional switch/case

        String medida = "M";

        switch(medida){
            case "P":
                System.out.println("PEQUENO");
                break;

            case "M":
                System.out.println("MEDIO");
                break;

            case "G":
                System.out.println("GRANDE");
                break;

            default:
                System.out.println("INDEFINIDO");
        }
    }
}
