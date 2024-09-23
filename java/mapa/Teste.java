package mapa;
public class Teste {
    public boolean validarLocacao(double valorAluguel, double salario){
        boolean resultado = false;
        double valorReferencia = salario * (1 + 0.3);
        if(valorAluguel <= valorReferencia){
            resultado = true;
        }else{
            resultado = false;
        }
        return resultado;
    }
}
