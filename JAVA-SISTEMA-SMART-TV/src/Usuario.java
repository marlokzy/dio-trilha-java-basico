public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("A SmartTV está ligada? " + smartTv.ligada);
        System.out.println("Em qual canal está? " + smartTv.canal);
        System.out.println("Qual seu volume atual? " + smartTv.volume);

        // ligando a SmartTV
        smartTv.ligar();
        System.out.println("Seu novo status -> A SmartTV está ligada? " + smartTv.ligada);

        // desligando a SmartTV
        smartTv.desligar();
        System.out.println("Seu novo status -> A SmartTV está ligada? " + smartTv.ligada);

        // aumentando volume da SmartTV
        smartTv.aumentarVol();
        System.out.println("O volume aumentou -> Seu novo volume é "+ smartTv.volume);

        // diminuindo volume da SmartTV
        smartTv.diminuirVol();
        smartTv.diminuirVol();
        smartTv.diminuirVol();
        System.out.println("O volume diminuiu -> Seu novo volume é "+ smartTv.volume);

        // mundando o canal +1
        smartTv.aumentarCanal();
        System.out.println("O canal aumentou -> Seu novo canal é "+ smartTv.canal);

        // mundando o canal -1
        smartTv.diminuirCanal();
        System.out.println("O canal diminuiu -> Seu novo canal é "+ smartTv.canal);

        // mundando o canal para qual eu quero
        smartTv.mudarCanal(13);
        System.out.println("O canal mudou -> Seu novo canal é "+ smartTv.canal);
    }

}
