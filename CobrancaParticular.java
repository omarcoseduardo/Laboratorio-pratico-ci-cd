/**
 * Política do tipo de consulta 2 (particular).
 * Aplica 5% de desconto somente quando o subtotal ultrapassa o limite.
 */
public class CobrancaParticular implements PoliticaDeCobranca {

    private static final double LIMITE_PARA_DESCONTO = 500.0;
    private static final double PERCENTUAL_DESCONTO = 0.05;

    @Override
    public double calcular(double subtotal, boolean aplicaAcrescimoFixo) {
        if (subtotal > LIMITE_PARA_DESCONTO) {
            return subtotal - (subtotal * PERCENTUAL_DESCONTO);
        }
        return subtotal;
    }
}
