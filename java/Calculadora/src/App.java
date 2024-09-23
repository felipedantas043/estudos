import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {

        try{
            int n1 = Integer.parseInt(JOptionPane.showInputDialog("digite um número: "));
            int n2 = Integer.parseInt(JOptionPane.showInputDialog("digite outro número: "));
            escreva(n1+n2);

            par(1);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 0);


        }
    }
    public static int par(int num)throws ArithmeticException, Exception{
        if (num == 0) {
            throw new ArithmeticException();
        }

        return 0;
    }
    public static void escreva(String e){
        JOptionPane.showMessageDialog(null,e, "Resposta", 1);

    }
    public static void escreva(int e){
        JOptionPane.showMessageDialog(null,e, "Resposta", 1);

    }


}
