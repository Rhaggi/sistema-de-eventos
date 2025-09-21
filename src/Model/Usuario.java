package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Usuario implements Serializable {
    int id;
    String nome;
    String email;
    int telefone;
    String cidade;
    List<Eventos> eventosConfirmados;

    public void usuario(int id, String nome, String email, int telefone, String cidade) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cidade = cidade;
        this.eventosConfirmados = new ArrayList<>();
    }

}
