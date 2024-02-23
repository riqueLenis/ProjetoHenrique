package br.unigran.app;

import br.unigran.entidade.Pessoa;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;


public class Aula1 {
   
    public static void main(String[] args) {
        
        List pessoas = new LinkedList();
        
        do{
       
            Pessoa pessoa = new Pessoa();
            
            pessoa.setNome(
                JOptionPane.showInputDialog("Entre com seu nome")

            );
            pessoa.setCpf(
                    JOptionPane.showInputDialog("Entre com seu cpf")
            );
            pessoas.add(pessoa);
        }while(JOptionPane.showConfirmDialog(null, "Continuar?") == 0); 
                  
        JOptionPane.showMessageDialog(null, pessoas);
 
    }
}
