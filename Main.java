/**
 * Validação de manutenção de comportamento: compara o código novo
 * com o legado e com o valor esperado calculado à mão.
 */
public class Main {

    public static void main(String[] args) {
        CalculadoraDeValorFinal novo = new CalculadoraDeValorFinal();
        x_Mgr_F legado = new x_Mgr_F();

        // tipoConsulta, procedimentos, aplicaAcrescimoFixo, esperado
        testar(novo, legado, "Convênio com acréscimo", 1, new double[]{200.0, 100.0}, true, 279.5);
        testar(novo, legado, "Convênio sem acréscimo", 1, new double[]{200.0, 100.0}, false, 264.0);
        testar(novo, legado, "Particular acima de 500", 2, new double[]{600.0}, false, 570.0);
        testar(novo, legado, "Particular até 500", 2, new double[]{400.0}, false, 400.0);
        testar(novo, legado, "Outro tipo (sem regra)", 3, new double[]{100.0}, true, 100.0);
    }

    private static void testar(CalculadoraDeValorFinal novo, x_Mgr_F legado, String nome,
                               int tipo, double[] valores, boolean acrescimo, double esperado) {
        double resultadoNovo = novo.calcular(tipo, valores, acrescimo);
        double resultadoLegado = legado.calc(tipo, valores, acrescimo);
        boolean ok = resultadoNovo == esperado && resultadoNovo == resultadoLegado;
        System.out.println(nome + " -> novo=" + resultadoNovo
                + " | legado=" + resultadoLegado
                + " | esperado=" + esperado
                + " | " + (ok ? "OK" : "FALHOU"));
    }
}
