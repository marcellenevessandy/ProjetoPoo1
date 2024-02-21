package br.ulbra.poo;

/**
 * @author Marcelle Sandy
 */
public class Almoxarifado {
    public int cod;
    public String nome;
    public double saldo;
    public Almoxarifado(){
        this.cod = 1;
        this.nome = "Produto Padrão";
        this.saldo = 50;
        System.out.println("Nasci");
    }
    public void abastecer (double saldo){
    this.saldo+=saldo;
    }
    public void retirar (double saldo){
    this.saldo-=saldo;
    }
    public void mostrar (){
        System.out.println("Código: "+cod+" Nome: "+nome+" Saldo: "+saldo);
    }
    public void alterarNome (String nome){
    this.nome=nome;
    }
}
