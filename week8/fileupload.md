# File Uploads with Spring

## Office Hours

- Q & A
- Application of our Nutritionix API

## Objectives

- Learn how to create folder for file uploads
- Upload new file using multipart/form-data
- Get a list of all the files in our upload dir
- Display all images in our directory

## Lecture

### End of Stack Survey
    - 10 minutes

### File upload
    - application.properties
        - set max upload size
        - set max request size
    - Service
        - init
        - store
        - loadAll
    - Exceptions
        - StorageException
        - IOException
        - RuntimeException
    - Controller
        - handle form data
    - View
        - enctype=multipart/form-data