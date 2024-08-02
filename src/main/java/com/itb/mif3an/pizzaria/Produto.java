package com.itb.mif3an.pizzaria;

public class Produto {

    //Encapusulamento protegendo atributos,ode estar ligado
// ás questoões de vlidção

//para obter o encapsulameno temos que seguir alguns passos:
// 1 Passo:trabalhar os modifcadores de acesso

//temos tres:
// public -> Acessp livre todAas classes
//  private -> Acessp permitido apena dentro  classes
// protected -> Acessp permitido apenas para as classes classes

//Enfim ,deixar os atributospriate ou protected

        //2° Passo;ciar métodos de acesso aos atributos uma prtica muito utilizada
    //é criar os métodos SETTER E GETTERS

// SETTER ATRIBIR A INFORMAÇÃO
//GET RECUPERAR INFORMAÇÃO


    private long id;

    private String nome;

    private String tipo;

    private String descricao;

    private double precoCompra;

    private double precoVenda;

    private int quantidadeEstoque;

    private boolean codStatus;

    //void: "mudo", ou seja, o método não tem retorno
// Atributos de apoio
    private String mensagemErro = "";
    private boolean isValid = true;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public boolean isCodStatus() {
        return codStatus;
    }

    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }

    //mensagem de alerta

    public boolean validarProduto(){
        if(nome == null || nome.isEmpty()){
            mensagemErro += "preço deve sser maior que zero:";
            isValid = false;

        }
        if (precoCompra<10){
            precoCompra=0;
            mensagemErro += "o preço do produto deve ser maior que zero:";
            isValid = false;
        }
        return isValid;
    }

}
