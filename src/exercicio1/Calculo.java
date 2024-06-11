package exercicio1;

import exercicio1.InputOutput;

public class Calculo {
    InputOutput inputOutput;

    public Calculo() {

    }

    public double Aritmetica(double nota1, double nota2){

        return (nota1+nota2)/2;

    }

    public double Ponderada(double nota1, double nota2, double peso1, double peso2){

        return (nota1 + nota2)/(peso1 + peso2);

    }
}