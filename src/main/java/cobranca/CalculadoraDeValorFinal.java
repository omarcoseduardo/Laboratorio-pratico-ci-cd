package cobranca;

/**
 * Orquestra o cálculo: soma os procedimentos e delega o ajuste
 * à política de cobrança adequada.
 * (Substitui a classe legada x_Mgr_F, sem efeitos colaterais como System.out.println.)
 */
public class CalculadoraDeValorFinal {

    public double calcular(int tipoConsulta,
                           double[] procedimentosRealizados,
                           boolean aplicaAcrescimoFixo) {
        double subtotal = somarProcedimentos(procedimentosRealizados);
        PoliticaDeCobranca politica = PoliticaDeCobrancaFactory.criar(tipoConsulta);
        return politica.calcular(subtotal, aplicaAcrescimoFixo);
    }

    private double somarProcedimentos(double[] procedimentosRealizados) {
        double soma = 0;
        for (int i = 0; i < procedimentosRealizados.length; i++) {
            soma += procedimentosRealizados[i];
        }
        return soma;
    }
}
