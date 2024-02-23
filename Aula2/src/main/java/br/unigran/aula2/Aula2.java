package br.unigran.aula2;
import javax.swing.JFrame;
import javax.swing.JDialog;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class Aula2 extends JFrame implements ActionListener {
    JButton botao = new JButton("Testando o botao na tela");

    public static void main (String [] args) {
        Aula2 teste =  new Aula2();
        teste.setVisible(true);
 
    }

    public Aula2() throws HeadlessException {
        JButton botao1 = new JButton ("Click1");
        JButton botao2 = new JButton ("click2");
        botao1.setBounds(150, 150, 400, 400);
        botao2.setBounds(150, 150, 450, 400);
        botao1.addActionListener(this);
        botao2.addActionListener(this);
        
        setLayout(null);
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Aula2");
        //posicionamento manual
        botao.setBounds(150, 150, 450, 400);
        //add na tela comando
        add(botao);
        botao.addActionListener(this); //a propria tela vai observar esse botao
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(botao))
        JOptionPane.showMessageDialog(this, "voce clicou na tela");
        else if (e.getSource().equals(botao))
            new Tela2().setVisible(true);
    }
   
}
