import itens_obrigatorios.Pneus;
import itens_obrigatorios.Portas;
import java.util.Scanner;

public class Master {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        Pneus pneus = new Pneus(4);


        pneus.ImprimeDados();


        System.out.println("Qual tipo de vidro vocÊ deseja? Eletrico/Manual");
        String tipoVidro = scanner.nextLine();

        System.out.println("Quantidade de portas : 2/4");
        Integer portas = scanner.nextInt();

        Portas novaPorta = new Portas(tipoVidro, portas);

        System.out.println(" Tipo de vidro escolhido: " + novaPorta.getTipoVidro());
        System.out.println(" Quantidade de portas : " + novaPorta.getQuantidadePortas());
    }
}