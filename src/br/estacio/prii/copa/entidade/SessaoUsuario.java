package br.estacio.prii.copa.entidade;

public class SessaoUsuario {
    
    private static Usuario usuario;

    public static Usuario getUsuario() {
        return SessaoUsuario.usuario;
    }

    public static void setUsuario(Usuario usuario) {
        SessaoUsuario.usuario = usuario;
    }
    
}
