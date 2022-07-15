package itens_opcionais;


import java.util.Scanner;

public class ARCONDICIONADO{
    private String tipoVentilacao;

    public ARCONDICIONADO(String tipoVentilacao) {
        setTipoVentilacao( tipoVentilacao);
    }

    public String getTipoVentilacao() {
        return tipoVentilacao;
    }

    public void setTipoVentilacao(String tipoVentilacao) {
        this.tipoVentilacao = tipoVentilacao;
    }



    public static void EscolhaAr(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voce deseja carro com ar condicionado?: S/N");
        String tipoVentilacao= scanner.nextLine();
       ARCONDICIONADO novoARCONDICIONADO= new ARCONDICIONADO( tipoVentilacao);

        System.out.println(" - Item opcional do carro escolhido : " + novoARCONDICIONADO.getTipoVentilacao());


    }
}