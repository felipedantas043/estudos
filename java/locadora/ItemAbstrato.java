package locadora;

public abstract class ItemAbstrato {
    private int codigo;
    private String titulo;
    private String dataEmprestimo;
    private String dataDevolucao;
    private String SituacaoItem;

    public abstract void cadastrar();
    public abstract void emprestar();
    public abstract void devolver();
    
}
