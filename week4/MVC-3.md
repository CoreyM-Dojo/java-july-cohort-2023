# MVC Design Pattern - CRUD - Update and Delete

## Office Hours

## Objectives

- Set up an edit form for validations
- understand how Spring handles restful routing. 
- Edit an existing record in the database
- Delete an existing record from the database

## Lecture

- Lets talk about CRUD
    - Create
    - Read
    - Update
    - Delete

### Controller

- pass the id through the path and access it with @PathVariable
- Make sure you use id as the name of the path variable (THIS IS NOT OPTIONAL)
- @PutMapping 

### Views

#### Update
- isErrorPage
- hidden filter method
- passing the id with the form
- pre-population with modelAttribute

#### Delete

- cant be a simple button
- pass the id of the item you wish to delete through the path