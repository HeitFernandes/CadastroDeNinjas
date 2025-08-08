package dev.java10x.cadastroDeNinjas.Ninjas;
// TODO = Vamos tornar esta classe em uma entidade para o banco de dados.

import dev.java10x.cadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data; // lombok trabalha com getter e setter, ajuda em construtor.
import lombok.NoArgsConstructor;


// JPA == Java Persistence API
@Entity // TODO == com o @Entity fazemos essa classe se tornar uma entidade para o BD, usando JPA. Usando os atributos na tabela.
@Table(name = "tb_cadastro")// usando @Table para gerar a tabela cadastro de ninjas
@Data // cria getters e setters
@NoArgsConstructor // cria construtor usando a dpd LOMBOK
@AllArgsConstructor

public class NinjaModel {

    @Id // @Id sinalizamos que o proximo atributo a vir será o Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Passamos uma strategy para gerar o Id

    private Long id;

    private String nome;

    @Column(unique = true)
    private String email;

    private int idade;

    @ManyToOne // Um ninja tem uma unica missao
    @JoinColumn(name = "missoes_id") // FK
    private MissoesModel missoes;

}
