public class SistemaMedida {
    public static void main(String[] args) {
    // Modo condicional if/else
        
    String medida = "M";

    if(medida == "P")
        System.out.println("PEQUENO");

    else if (medida == "M")
        System.out.println("MÉDIO");
        
    else if (medida == "G")
        System.out.println("GRANDE");

    else
        System.out.println("INDEFINIDO");
    }
}
