package itens_obrigatorios;

public class Portas {
    private Integer quantidadePortas;
    private String tipoVidro;

    public Portas(String tipoVidro, Integer quantidadePortas){
        this.quantidadePortas= quantidadePortas;
        this.tipoVidro= tipoVidro;

    }

    public Integer getQuantidadePortas() {

        return quantidadePortas;
    }

    public void setQuantidadePortas(Integer quantidadePortas) {

        this.quantidadePortas = quantidadePortas;
    }

    public String getTipoVidro() {

        return tipoVidro;
    }

    public void setTipoVidro(String tipoVidro) {
        this.tipoVidro = tipoVidro;


    }


}
