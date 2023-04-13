package br.com.univertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.univertec.entity.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {
    // methods
}