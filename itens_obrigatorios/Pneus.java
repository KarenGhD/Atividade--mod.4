package itens_obrigatorios;

public class Pneus {

    private  Integer quantidadePneus;

    private Integer quantidadeCalotas;

    private Integer quantidadeParafusoPneu;

    public Pneus(Integer quantidadePneus){
        setQuantidadePneus(quantidadePneus);
    }
    public Integer getQuantidadePneus(){
        return quantidadePneus +1;
        // 1 pneu reserva
     }
     public void setQuantidadePneus( Integer quantidadePneus){
        setQuantidadeCalotas(quantidadePneus);
        setQuantidadeParafusoPneu(quantidadePneus *5);
       this.quantidadePneus= quantidadePneus;
     }

    public Integer getQuantidadeCalotas() {
        return quantidadeCalotas;
    }

    public void setQuantidadeCalotas(Integer quantidadeCalotas) {
        this.quantidadeCalotas = quantidadeCalotas;
    }

    public Integer getQuantidadeParafusoPneu() {
        return quantidadeParafusoPneu;
    }

    public void setQuantidadeParafusoPneu(Integer quantidadeParafusoPneu) {
        this.quantidadeParafusoPneu = quantidadeParafusoPneu;
    }
    public void ImprimeDados(){
        System.out.println(" - Quantidade de pneus : " + getQuantidadePneus());
        System.out.println("-- Quantidade de parafusos: " + getQuantidadeParafusoPneu());
        System.out.println("---Quantidade de calotas : " + getQuantidadeCalotas());

    }
}
