# Final Project Ideas 
    - social media
    - Recipes blog social media
    - for people to find foods safe for their dietary needs

# Models

    ## MVP

    - Users
        - first name
        - last name
        - email
        - createdRecipes - List<Recipe>
        - favoriteRecipes - List<Recipe>
        - ratedRecipes - List<Recipe>
        
    - UserProfile
        - Biography
        - Address
        - Phone number
        - Number of recipes created
        

    - Recipes
        - name
        - cookTime
        - underFifteen
        - ingredients List<Ingredient>
        - tags List<Tag>

    - Ingredients
        - name
        recipes List<Recipe>
    - Tags
        - name
        recipes List<Recipe>


    ## Backlog
    - Ratings
    - Friends
    - Comments
    - Make some kind of modal

    ### Relationships

    - Users <--> Recipes (Likes)(Ratings)
    - Recipes <--> Ingredients
    - Recipes <--> Tags

    ## Features

        - OAuth
        - File Upload (Pictures for recipes)
        - Users can add recipes
        - Users can edit recipes if they created them
        - Users can delete recipes if they created them
        - Users can rate other recipes
        - Users can favorite other recipes
        - Users can search for recipes based on:
            - Tags
            - Specific ingredients
            - Rating
        - API - Edamam Nutrition Analysis API
            - used to display nutritional facts about ingredients

    ## Views
        - Login page
        - Create recipes
            - file upload for picture
            - add tags
            - add ingredient if not in db
        - Add Ingredient form 
        - Home page
            - display top 10 rated recipes
            - search bar for finding specific recipes
            - navigation
        - Profile page
            - number of recipes created
            - general info
            - biography
            - button to see all recipes from that person
        - Info page for ingredients
                - this will use our API
        - Show recipe page
            

    

