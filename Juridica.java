import java.time.LocalDate;

public class Juridica extends Pessoa{
    private String cnpj;
    private String inscricaoEstadual;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private double valorContrato;

    public Juridica(String id, String nome, String telefone, Endereco endereco, String cnpj, String inscricaoEstadual, LocalDate dataInicio, LocalDate dataTermino, double valorContrato) {
        super(id, nome, telefone, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.valorContrato = valorContrato;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(double valorContrato) {
        this.valorContrato = valorContrato;
    }

    @Override
    public String toString() {
        return "Pessoa Juridica: " +
                "\n id='" + id + '\'' +
                "\n nome='" + nome + '\'' +
                "\n telefone='" + telefone + '\'' +
                "\n endereco=" + endereco.toString() +
                "\n cnpj='" + cnpj + '\'' +
                "\n inscricaoEstadual='" + inscricaoEstadual + '\'' +
                "\n dataInicio=" + dataInicio +
                "\n dataTermino=" + dataTermino +
                "\n valorContrato=" + valorContrato +
                '}';


    }
}
