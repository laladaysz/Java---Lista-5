package exercicio3;

public class Validacao {

    public boolean validParcela (double parcela, double porcentagemSalario) {
        return parcela < porcentagemSalario;
    };

    public boolean validValor (double emprestimo){
        return emprestimo <= 200;
    }



}

