package br.estacio.prii.copa.entidade;


public class Usuario
{
   private String login;
   private String senha;
   private String nome;
   private String email;
   private String celular;
   private String admin;
   private String obs;

    public Usuario() { }

    public Usuario
    (
        String login, String senha, String nome, 
        String email, String celular, String admin, String obs
    ) 
    {
        this.login   = login;
        this.senha   = senha;
        this.nome    = nome;
        this.email   = email;
        this.celular = celular;
        this.admin   = admin;
        this.obs     = obs;
    }
   
    public String getLogin() 
    {
        return login;
    }

    public void setLogin(String login) 
    {
        this.login = login;
    }

    public String getSenha() 
    {
        return senha;
    }

    public void setSenha(String senha) 
    {
        this.senha = senha;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getCelular() 
    {
        return celular;
    }

    public void setCelular(String celular) 
    {
        this.celular = celular;
    }

    public String getAdmin() 
    {
        return admin;
    }

    public void setAdmin(boolean admin) 
    {
        if(admin){
            this.admin = "1";
        }else{
            this.admin = "0";
        }
        
    }

    public String getObs() 
    {
        return obs;
    }

    public void setObs(String obs) 
    {
        this.obs = obs;
    }
   
}
