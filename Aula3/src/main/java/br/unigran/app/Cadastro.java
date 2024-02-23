package br.unigran.app;

import br.unigran.dados.Dados;
import java.awt.BorderLayout;
import br.unigran.entidades.Pessoa;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Cadastro extends JDialog{
    
    private JPanel titulo =new JPanel();
    private JPanel botoes =new JPanel(new FlowLayout());
    private JPanel itens =new JPanel(null);
    private JTextField jtNome = new JTextField(20);
    private JTextField jtTelefone = new JTextField(20);
    JLabel lNome = new JLabel("Nome");
    JLabel lTelefone = new JLabel("telefone");
    JButton btnSair = new JButton("Voltar");
    JButton btnSalvar = new JButton("Salvar");
    public Cadastro() {
        setModal(true);
       //COnfiguração tela
        setLayout(new BorderLayout());
        setLocationRelativeTo(rootPane);
        setSize(300,200);
        //itens
        lNome.setBounds(10, 10, 50, 20);
        jtNome.setBounds(60, 10, 150, 20);
        lTelefone.setBounds(10, 40, 50, 20);
        jtTelefone.setBounds(60, 40, 150, 20);
        //add itens
        itens.add(lNome);
        itens.add(jtNome);
        itens.add(lTelefone);
        itens.add(jtTelefone);
        //paineis
        titulo.add(new JLabel("Cadastro"));
        add(titulo,BorderLayout.PAGE_START);
        add(botoes,BorderLayout.PAGE_END);
        add(itens,BorderLayout.CENTER);
        itens.setLayout(null);

        //botoes
        botoes.add(btnSair);
        botoes.add(btnSalvar);
        
        btnSalvar.addActionListener((var e) -> {
                Pessoa pessoaCadastro = new Pessoa();
                pessoaCadastro.setNome(jtNome.getText());
                pessoaCadastro.setTelefone(jtTelefone.getText());
                Dados.salvar(pessoaCadastro);
                dispose();


            
        });
        
    }

    public static void main(String[] args) {
       
    }
}