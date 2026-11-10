package cobranca;

public class App {

    public static void main(String[] args) {
        CalculadoraDeValorFinal calculadora = new CalculadoraDeValorFinal();
        double[] procedimentos = {200.0, 100.0};

        System.out.println("Convênio com acréscimo: " + calculadora.calcular(1, procedimentos, true));
        System.out.println("Convênio sem acréscimo: " + calculadora.calcular(1, procedimentos, false));
        System.out.println("Particular: " + calculadora.calcular(2, new double[]{600.0}, false));
    }
}
