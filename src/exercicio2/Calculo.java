package exercicio2;

public class Calculo {

    public double INSS (double salario) {
        return salario * 0.20;
    }

    public double IRPF (double salario) {
        return salario * 0.10;
    }

    public double Unimed (double salario) {
        return salario * 0.05;
    }

    public double horaExtra(double totalHoras, double salario) {
        double horaNormal = salario/160;
        double horasvalor = horaNormal*2;
        totalHoras = totalHoras * horasvalor;
        return totalHoras;
    };

    public double salarioLiquido (double salario, double INSS, double IRPF, double Unimed, double horaExtra) {

        double salarioFinal = salario - INSS;
        salarioFinal = salarioFinal - IRPF;
        salarioFinal = salarioFinal - Unimed;
        salarioFinal = salarioFinal + horaExtra;

        return salarioFinal;

    };

}
