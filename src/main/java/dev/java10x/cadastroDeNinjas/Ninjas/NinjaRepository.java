package dev.java10x.cadastroDeNinjas.Ninjas;

import org.springframework.data.jpa.repository.JpaRepository;
// ORM vai mapear toda nossa classe e vai traduzir isso para o banco de dados.
public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {






}
