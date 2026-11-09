/**
 * Política para qualquer outro tipo de consulta: o legado não define regra,
 * então o valor permanece igual ao subtotal.
 */
public class CobrancaSemAjuste implements PoliticaDeCobranca {

    @Override
    public double calcular(double subtotal, boolean aplicaAcrescimoFixo) {
        return subtotal;
    }
}
