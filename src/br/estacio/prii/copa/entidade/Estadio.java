package br.estacio.prii.copa.entidade;


public class Estadio 
{
    private Integer codigo;
    private String nome;
    private String cidade;
    private Integer capacidade;


    public Estadio() { }

    public Estadio(int codigo, String nome, String cidade, int capacidade) 
    {
        this.codigo     = codigo;
        this.nome       = nome;
        this.cidade     = cidade;
        this.capacidade = capacidade;
    }
    
    public int getCodigo() 
    {
        return codigo;
    }

    public void setCodigo(int codigo) 
    {
        this.codigo = codigo;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getCidade() 
    {
        return cidade;
    }

    public void setCidade(String cidade) 
    {
        this.cidade = cidade;
    }

    public int getCapacidade() 
    {
        return capacidade;
    }

    public void setCapacidade(int capacidade) 
    {
        this.capacidade = capacidade;
    }
    
    
}
