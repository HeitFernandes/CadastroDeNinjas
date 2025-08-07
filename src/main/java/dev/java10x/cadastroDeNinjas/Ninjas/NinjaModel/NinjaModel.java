package dev.java10x.cadastroDeNinjas.Ninjas.NinjaModel;
// TODO = Vamos tornar esta classe em uma entidade para o banco de dados.

import dev.java10x.cadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;



// JPA == Java Persistence API
@Entity // TODO == com o @Entity fazemos essa classe se tornar uma entidade para o BD, usando JPA. Usando os atributos na tabela.
@Table(name = "tb_cadastro") // usando @Table para gerar a tabela cadastro de ninjas
public class NinjaModel {

    @Id // @Id sinalizamos que o proximo atributo a vir será o Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Passamos uma strategy para gerar o Id

    private Long id;

    private String nome;

    private String email;

    private int idade;

    @ManyToOne // Um ninja tem uma unica missao
    @JoinColumn(name = "missoes_id") // FK
    private MissoesModel missoes;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
