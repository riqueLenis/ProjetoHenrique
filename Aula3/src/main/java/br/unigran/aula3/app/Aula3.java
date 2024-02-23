
package br.unigran.aula3.app;

import br.unigran.app.Cadastro;
import br.unigran.dados.Dados;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;


public class Aula3  extends JFrame{
    JPanel panel;
    JButton btn1;
    JButton btn2;
    JTextArea areaDados;
    
    public Aula3() {
        configuracoes();
        alocaComponentes();
        acoes();
        
    
    }

    private void configuracoes() {
        setTitle("Agenda");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
         
    }

    private void alocaComponentes() {
        setLayout(new BorderLayout());
        areaDados = new JTextArea();
        add(areaDados, BorderLayout.CENTER);
        panel = new JPanel (new FlowLayout());
        panel.setBackground(Color.RED);
        btn1 = new JButton("Novo");
        btn2 = new JButton("Sair");
        //adicionar
        panel.add(btn1);
        panel.add(btn2);
        add(panel, BorderLayout.PAGE_START);
        
    }
    
    public static void main(String[] args) {
        new Aula3().setVisible(true);
    }

    private void acoes() {
       btn1.addActionListener((var e) -> {
           new Cadastro().setVisible(true);
           areaDados.setText(Dados.listar().toString().replace("[",""));
       });
       
        btn2.addActionListener((var e) -> {
           System.exit(0);
        });
    }    
    
  
    
}
