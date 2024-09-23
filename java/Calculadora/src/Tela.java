import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Tela extends JFrame{
    JFrame frame = new JFrame("Calculadora");
    JButton btn = new JButton("Clique em mim");
    JLabel txt = new JLabel("Aqui vai a mensagem!");
    JTextField txf = new JTextField();
    JTextField txf2 = new JTextField();

    public Tela(){
        inicializa();

    }

    private void inicializa(){

        frame.setSize(800,600);
        frame.setLayout(null);
        frame.setVisible(true);

        btn.setBounds(100,100,150,50);
        txt.setBounds(100, 200, 150, 20);
        txf.setBounds(100, 50, 150, 20);
        txf2.setBounds(100, 10, 150, 20);

        frame.add(btn);
        frame.add(txt);
        frame.add(txf);
        frame.add(txf2);
        
        // btn.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e){
                
        //     }
        // });
    }
    
}
