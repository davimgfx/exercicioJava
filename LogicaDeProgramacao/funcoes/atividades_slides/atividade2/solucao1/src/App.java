public class App {
    public static void main(String[] args){
        obrigatoriedade(72);
    }
    
    public static void obrigatoriedade (int idade){
        if (idade >= 0 && idade <= 15){
            System.out.println("Sem permissão para votar");
        } else if ((idade >= 16 && idade <= 17) || idade > 65){
            System.out.println("Voto facultativo");
        } else if (idade >= 18 && idade <= 65) {
            System.out.println("Voto obrigatório");
        } else {
            System.out.println("Idade não existente!");
        }
    }
}
