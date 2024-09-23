package exercicios;

import javax.swing.JOptionPane;

public class ValidaImposto {
    public static void main(String args[]){
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor: ", "Valor em BRL", 1));
        String imposto = JOptionPane.showInputDialog(null, "Digite o tipo de imposto: INSS ou IR ", "imposto", 1);

        calculaImposto(valor, imposto);
    }

    public static double calculaImposto(double valor, String imposto){
        double res;
        try {
            int i = Integer.parseInt(calculaImposto(imposto));
            res = valor - valor*(i/100);
            return res;

        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, "Erro em calcula imposto double e string"+e, "Exception", 0);
        }
        return 0;

    }
    public static String calculaImposto(String imposto){
        if (imposto == "INSS") {
            res = "8";
        }if (imposto == "IR" || imposto == "ir") {
            res = "20";
        } else {
            JOptionPane.showMessageDialog(null, "Erro", res, 0);
        }

        return res;
    }
}
