package cobranca;

/**
 * Factory responsável por escolher a política de cobrança conforme o tipo de consulta.
 * Para criar um novo tipo, basta criar uma nova política e registrá-la aqui.
 */
public class PoliticaDeCobrancaFactory {

    public static final int TIPO_CONVENIO = 1;
    public static final int TIPO_PARTICULAR = 2;

    public static PoliticaDeCobranca criar(int tipoConsulta) {
        switch (tipoConsulta) {
            case TIPO_CONVENIO:
                return new CobrancaConvenio();
            case TIPO_PARTICULAR:
                return new CobrancaParticular();
            default:
                return new CobrancaSemAjuste();
        }
    }
}
