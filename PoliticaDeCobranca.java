/**
 * Contrato (Strategy) de uma política de cobrança.
 * Cada tipo de consulta implementa a sua própria regra.
 */
public interface PoliticaDeCobranca {

    double calcular(double subtotal, boolean aplicaAcrescimoFixo);
}
