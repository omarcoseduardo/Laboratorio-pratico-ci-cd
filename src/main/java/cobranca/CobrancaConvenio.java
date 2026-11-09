package cobranca;

/**
 * Política do tipo de consulta 1 (convênio).
 * Aplica 12% de desconto e, depois do desconto, o acréscimo fixo (se solicitado).
 */
public class CobrancaConvenio implements PoliticaDeCobranca {

    private static final double PERCENTUAL_DESCONTO = 0.12;
    private static final double ACRESCIMO_FIXO = 15.50;

    @Override
    public double calcular(double subtotal, boolean aplicaAcrescimoFixo) {
        double valorComDesconto = subtotal - (subtotal * PERCENTUAL_DESCONTO);
        if (aplicaAcrescimoFixo) {
            return valorComDesconto + ACRESCIMO_FIXO;
        }
        return valorComDesconto;
    }
}
