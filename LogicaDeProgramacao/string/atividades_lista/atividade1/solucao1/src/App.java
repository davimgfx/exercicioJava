public class App {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Digite um nome: ");
        String nome = scanner.nextLine();
        
        if (nome.toLowerCase().charAt(0) == 'a') {
            System.out.println(nome);
        }
        
        scanner.close();
    }
}
