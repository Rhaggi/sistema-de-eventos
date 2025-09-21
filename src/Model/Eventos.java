package Model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Eventos implements Serializable {
    String nome;
    String endereco;
    int telefone;
    LocalDateTime horario;
    String descricao;

    public Eventos(String nome, String endereco, int telefone, String categoria, LocalDateTime horario, String descricao) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.horario = horario;
        this.descricao = descricao;
    }

    private Categorias categorias;
}
