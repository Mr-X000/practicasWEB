package xyz.practica.model;

import javax.persistence.*;

@Entity
@Table (name = "estado")
public class Estado {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	@JoinColumn(name="id_pais")
	private Pais pais;
	private String nombre;
	
	public Estado() {
	}
	
	public Estado(Pais pais, String estado) {
		super();
		this.pais = pais;
		this.nombre = estado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}