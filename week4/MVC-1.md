# MVC Design Pattern - Models

## Office Hours

## Objectives

- Recognize the MVC Design Pattern
- Connect to a mysql database in spring
- setup your models to generate a mysql table
- recognize the flow of data 


## Lecture

### MVC

- Models       -> Usually database stuff and classes
- Views        -> The pages the user can see
- Controllers  -> The engine of your project, handles routing and logic

### Setting up mysql

- dependencies
- schema
- application.properties

### Domain Model & Annotations

- JPA -> Java Persistence API
- Persistence = Permanent
- @NotNull vs @NotEmpty vs @NotBlank

### Repositories & Services

- CRUDRepository
- View -> Controller -> Service -> Repository -> Database <-> // Flow of data
