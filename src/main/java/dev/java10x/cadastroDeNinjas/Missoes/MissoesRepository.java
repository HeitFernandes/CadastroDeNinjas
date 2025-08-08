package dev.java10x.cadastroDeNinjas.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;
// abstracao == maneira da gente deixar mais facil o entendimento
// JPA == ajuda na interacao de banco de dados
//Object Relational Mappping(ORM)  == scanner que ira ficar indo e vindo na classe que é uma entidade.
public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {





}
