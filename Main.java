import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Endereco diego = new Endereco("Vista Alegre", "106",  "bloco 134 B", "40730289", "Salvador", UnidadeFederativa.BAHIA);
        Pessoa pessoa = new Fisica("1234", "Diego", "(71) 985226776", diego, Genero.MASCULINO, "5678", "91011", LocalDate.of(2005, Month.APRIL, 30), 1500.50);

        Endereco lula = new Endereco("Mangueirinho", "307",  "bloco 145 A", "40730289", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO);
        Pessoa pessoa2 = new Juridica("89279233-09", "Lula", "(71) 987743279", lula, "456-789", "1234", LocalDate.of(2023, Month.AUGUST, 1), LocalDate.of(2025, Month.DECEMBER, 17), 5000);

        System.out.println(pessoa2.toString());



    }
}
