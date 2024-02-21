package br.ulbra.poo;

/**
 *
 * @author aluno.saolucas
 */
public class Sistema {
    public static void main(String[] args) {
        Almoxarifado a1 = new Almoxarifado();  //criando objetos
        Almoxarifado a2 = new Almoxarifado();  //criando objetos
        
        a1.mostrar();
        a2.mostrar();
        
        //atribuindo objeto a1
        a1.cod = 1;
        a1.nome = "Caneta"; //atribuindo
        a1.saldo = 3;
        a1.mostrar();
        
        //atribuindo objeto a2
        a2.cod = 2;
        a2.nome = "Lapis"; //atribuindo
        a2.saldo = 8;
        a2.mostrar();
  
        
    }
}
