package br.estacio.prii.copa.entidade;

/**
 * Copa2018
 * @author Newton Gomes - 2018.1
 */
public class Selecao 
{
    private Integer codigo;
    private String nome;
    private String tecnico;
    private String grupo;
    private String descricao;
    private String imagem;

    public Selecao() { }

    public Selecao
    (
        Integer codigo, String nome, String tecnico, 
        String grupo, String descricao, String imagem
    ) 
    {
        this.codigo    = codigo;
        this.nome      = nome;
        this.tecnico   = tecnico;
        this.grupo     = grupo;
        this.descricao = descricao;
        this.imagem    = imagem;
    }

    public Integer getCodigo() 
    {
        return codigo;
    }

    public void setCodigo(Integer codigo) 
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

    public String getTecnico() 
    {
        return tecnico;
    }

    public void setTecnico(String tecnico) 
    {
        this.tecnico = tecnico;
    }

    public String getGrupo() 
    {
        return grupo;
    }

    public void setGrupo(String grupo) 
    {
        this.grupo = grupo;
    }

    public String getDescricao() 
    {
        return descricao;
    }

    public void setDescricao(String descricao) 
    {
        this.descricao = descricao;
    }

    public String getImagem() 
    {
        return imagem;
    }

    public void setImagem(String imagem) 
    {
        this.imagem = imagem;
    }
    
}
