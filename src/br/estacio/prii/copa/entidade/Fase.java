package br.estacio.prii.copa.entidade;


public enum Fase 
{
    GRUPOS("Grupos"), 
    OITAVAS("Oitavas-de-Final"), 
    QUARTAS("Quartas-de-Final"),
    SEMI("Semi-Final"),
    FINAL("Final");

    private final String nome;
    
    private Fase(String nome)
    {
        this.nome = nome;
    }
    
    public String getNome() 
    {
        return nome;
    }

}
