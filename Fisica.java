import java.time.LocalDate;
import java.time.Period;

public class Fisica extends Pessoa {

    private Genero genero;
    private String cpf;
    private String rg;
    private LocalDate dataNascimento;
    private double salario;

    public Fisica(String id, String nome, String telefone, Endereco endereco, Genero genero, String cpf, String rg, LocalDate dataNascimento, double salario) {
        super(id, nome, telefone, endereco);
        this.genero = genero;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Pessoa Fisica: " +
                "id = '" + id + '\'' +
                "\n nome = '" + nome + '\'' +
                "\n Idade = '" + getIdade() + '\'' +
                "\n telefone = '" + telefone + '\'' +
                "\n endereco = " + endereco.toString() +
                "\n genero = " + genero.getFormat() +
                "\n cpf = '" + cpf + '\'' +
                "\n rg = '" + rg + '\'' +
                "\n dataNascimento = " + dataNascimento +
                "\n salario = " + salario +
                '}';
    }

}
