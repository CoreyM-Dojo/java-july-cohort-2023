package com.coreym.mvc.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="dogs")
public class Dog {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@NotBlank
	@Size(min=3, max=200, message="Name must be at least 3 characters")
	private String name;
	
	@NotNull
	@NotBlank
	@Size(min=3, max=200, message="Breed must be at least 3 characters")
	private String breed;
	
	@NotNull
	@NotBlank
	@Size(min=3, max=200, message="Size must be at least 3 characters")
	private String size;
	
	@Min(1)
	@Max(20)
	private Integer age;
	
	@Min(1)
	@Max(100)
	private Integer floofMeter;
	
	private Boolean isBoopable;
	
	 // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    public Dog() {}

	public Dog(Long id,
			@NotNull @NotBlank @Size(min = 3, max = 200, message = "Name must be at least 3 characters") String name,
			@NotNull @NotBlank @Size(min = 3, max = 200, message = "Breed must be at least 3 characters") String breed,
			@NotNull @NotBlank @Size(min = 3, max = 200, message = "Size must be at least 3 characters") String size,
			@Min(1) @Max(20) Integer age, @Min(1) @Max(100) Integer floofMeter, Boolean isBoopable) {
		super();
		this.id = id;
		this.name = name;
		this.breed = breed;
		this.size = size;
		this.age = age;
		this.floofMeter = floofMeter;
		this.isBoopable = isBoopable;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getFloofMeter() {
		return floofMeter;
	}

	public void setFloofMeter(Integer floofMeter) {
		this.floofMeter = floofMeter;
	}

	public Boolean getIsBoopable() {
		return isBoopable;
	}

	public void setIsBoopable(Boolean isBoopable) {
		this.isBoopable = isBoopable;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	 // other getters and setters removed for brevity
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
    
    
	
	
}
