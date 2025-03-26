package br.cnj.projeto.models;

import org.springframework.stereotype.Component;

@Component
public class CasoJudicial {
    
    private int numero;
    private String decisao;
    private String descricao;

    private CustoJudicial custoJudicial;
    private TaxaJudicial taxaJudicial;

    public CasoJudicial() {
        // Construtor vazio necessário para o Spring
    }

    public CasoJudicial(int numero, String decisao, String descricao){
        this.numero = numero;
        this.decisao = decisao;
        this.descricao = descricao;
    }

    public CasoJudicial(CustoJudicial custoJudicial, TaxaJudicial taxaJudicial) {
        this.custoJudicial = custoJudicial;
        this.taxaJudicial = taxaJudicial;
    }

    public double finalizarCusto(double custo, String estado, int ano){
        custo += custoJudicial.adicionarCursot(ano);
        custo += taxaJudicial.adicionarTaxa(estado);
        return custo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDecisao() {
        return decisao;
    }

    public void setDecisao(String decisao) {
        this.decisao = decisao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
