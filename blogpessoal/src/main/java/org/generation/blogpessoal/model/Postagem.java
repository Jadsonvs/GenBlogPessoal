package org.generation.blogpessoal.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

@Entity //indica que a classe será uma entidade no DB
@Table(name="tb_postagens") // essa anotação diz para criar uma tabela no DB/nomeia a tabela
public class Postagem {
	
	//Para indicar a primary key com autoincrement
	@Id // informar que é um id
	@GeneratedValue(strategy= GenerationType.IDENTITY) // auto-incremente
	private Long id; //criar o id
	
	@NotNull //não permite dados nulos
	private String titulo; //criar titulo
	
	@NotNull
	@Size(min=4, max=50) //define tamanho maximo e/ou minimo de caracteres do texto
	private String texto; //criar texto
	
	@UpdateTimestamp //pega a data e hora do computador e salva
	private LocalDateTime data; // criar data e hora, devemos importar o LocalDateTime

	//Gerar os getters e setters no final.
	// Botao direito mouse > Source > Generate Getters and Setters
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	
	
}





