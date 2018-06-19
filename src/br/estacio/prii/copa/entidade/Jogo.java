package br.estacio.prii.copa.entidade;


import java.time.LocalDateTime;

public class Jogo 
{
    private Integer codigo;
    private String selecaoA;
    private String selecaoB;
    private Integer placarA;
    private Integer placarB;
    private String local;
    private String datahora;
    private String fase;
    private String grupo;

    public Jogo() { }

    public Jogo
    (
        Integer codigo, String selecaoA, String selecaoB, 
        Integer placarA, Integer placarB, String local, 
        String datahora, String fase
    ) 
    {
        this.codigo   = codigo;
        this.selecaoA = selecaoA;
        this.selecaoB = selecaoB;
        this.placarA  = placarA;
        this.placarB  = placarB;
        this.local    = local;
        this.datahora = datahora;
        this.fase     = fase;
    }

    public Integer getCodigo() 
    {
        return codigo;
    }

    public void setCodigo(Integer codigo) 
    {
        this.codigo = codigo;
    }

    public String getSelecaoA() 
    {
        return selecaoA;
    }

    public void setSelecaoA(String selecaoA) 
    {
        this.selecaoA = selecaoA;
    }

    public String getSelecaoB() 
    {
        return selecaoB;
    }

    public void setSelecaoB(String selecaoB) 
    {
        this.selecaoB = selecaoB;
    }

    public Integer getPlacarA() 
    {
        return placarA;
    }

    public void setPlacarA(Integer placarA) 
    {
        this.placarA = placarA;
    }

    public Integer getPlacarB() 
    {
        return placarB;
    }

    public void setPlacarB(Integer placarB) 
    {
        this.placarB = placarB;
    }

    public String getLocal() 
    {
        return local;
    }

    public void setLocal(String local) 
    {
        this.local = local;
    }

    public String getDatahora() 
    {
        return datahora;
    }

    public void setDatahora(String datahora) 
    {
        this.datahora = datahora;
    }

    public String getFase() 
    {
        return fase;
    }

    public void setFase(String fase) 
    {
        this.fase = fase;
    }

    public String getGrupo() 
    {
        return grupo;
    }

    public void setGrupo(String grupo) 
    {
        this.grupo = grupo;
    }

}
