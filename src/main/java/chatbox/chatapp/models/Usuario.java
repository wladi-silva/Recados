package chatbox.chatapp.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo;

    private String nome;
    private String mensagem;

    public long getCodigo() {
        return codigo;
    }

    
    public String getMensagem() {
        return mensagem;
    }


    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }


    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}