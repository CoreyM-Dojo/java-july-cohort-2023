# Password Security

## Office Hours

## Objectives

- Understand the importance of encryption
- Get a good understanding of how encryption works
- utilize bcrypt in our projects to create safe and secure passwords

## Lecture

### What is encryption

- The process of securing information based on a specific algorithm

### What is decryption

- the process of undoing an encryption based on that same algorithm.

### BCrypt

- salt
- encryption
- non-reversible

### Login!!!!

- Lets finish our login
- LoginUser model
- authentication
- securing our pages

### Login and Registration

- Registration
    - make sure all fields are valid
    - encrypt the password before adding it to the database
    - set session to the newly created user object id

- Login
    - make sure all fields are valid
    - make sure the user exists in the database
    - use bcrypt to compare passwords to make sure they are correct
    - set session to logged in user id


### Have a great weekend! Be ready for your exam next week!