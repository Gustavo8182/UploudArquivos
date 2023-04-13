package br.com.univertec.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Carro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false, length = 50)
	private String tipo;
	@Column(nullable = false, length = 100)
	private String nome;
	@Column(name = "descricao", nullable = true, length = 500)
	private String desc;
	@Column(nullable = true, length = 50)
	private String urlFoto;
	@Column(nullable = true, length = 50)
	private String urlVideo;
	@Column(nullable = true, length = 15)
	private String latitude;
	@Column(nullable = true, length = 15)
	private String longitude;

}
