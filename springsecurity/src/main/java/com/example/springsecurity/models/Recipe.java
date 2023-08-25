package com.example.springsecurity.models;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="recipes")
public class Recipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min=5, max=200)
	private String name;
	
	@Min(1)
	private Integer cookTime;
	
	private Boolean underFifteen;
	
	private String instructions;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="recipe_tags",
			joinColumns=@JoinColumn(name="recipe_id"),
			inverseJoinColumns=@JoinColumn(name="tag_id"))
	private List<Tag> tags;
	
	@OneToMany(mappedBy="recipe", fetch=FetchType.LAZY)
	@JoinColumn(name="recipe_id")
	private List<Rating> ratings;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="recipe_ingredients",
			joinColumns=@JoinColumn(name="recipe_id"),
			inverseJoinColumns=@JoinColumn(name="ingredient_id"))
	private List<Ingredient> ingredients;

	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

}
