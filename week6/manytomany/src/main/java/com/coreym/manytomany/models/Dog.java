package com.coreym.manytomany.models;

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
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="dogs")
public class Dog {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(min=2, max=200)
	private String name;
	@NotBlank
	@Size(min=2, max=200)
	private String breed;
	
	@Min(0)
	private Integer age;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
			name="dogs_and_trainers",
			joinColumns=@JoinColumn(name="dog_id"),
			inverseJoinColumns=@JoinColumn(name="trainer_id"))
	private List<Trainer> trainers;
	
	public Dog() {}
	
	
	
	
	
	public Dog(Long id, @NotBlank @Size(min = 2, max = 200) String name,
			@NotBlank @Size(min = 2, max = 200) String breed, @Min(0) Integer age, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
	





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getBreed() {
		return breed;
	}





	public void setBreed(String breed) {
		this.breed = breed;
	}





	public Integer getAge() {
		return age;
	}





	public void setAge(Integer age) {
		this.age = age;
	}

	
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
		return this.createdAt;
	}
	
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	

	public List<Trainer> getTrainers() {
		return trainers;
	}



	public void setTrainers(List<Trainer> trainers) {
		this.trainers = trainers;
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
