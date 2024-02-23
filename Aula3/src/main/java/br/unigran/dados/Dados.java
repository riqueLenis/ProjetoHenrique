package br.unigran.dados;

import br.unigran.entidades.Pessoa;
import java.awt.PopupMenu;
import java.util.LinkedList;
import java.util.List;


public class Dados {
    private static final List pessoas = new LinkedList<>();


    public static void salvar(Object o) {
        pessoas.add(o);
    }
     public static List listar(){
     return pessoas;
     }


}
