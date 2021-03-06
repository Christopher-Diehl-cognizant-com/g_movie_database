The G Movie Database
====================

Fans are crazy for movies and the G company would like to build an
application for users to browse all the movies of the world!

Your team is to develop the specs and implement the API.

### Objectives

Use what you've learned about pair programming, the test cycle, and OOP
to fulfill the acceptance criteria.

#### Your final code should have:

1.  No compilation errors.
2.  No failing tests.
3.  Meet acceptance criteria.
4.  Document your API spec in the `README.md`{tabindex="0"} of your
    repository.

      URI                 HTTP Method   HTTP Status   Description            Request                              Response
      ------------------- ------------- ------------- ---------------------- ------------------------------------ --------------------------------------
      /path/to/resource                 XXX           Blurb about endpoint   `{ "key": "value" }`{tabindex="0"}   `[{ "key": "value" }]`{tabindex="0"}

    -   Example Markdown

    ``` {.text tabindex="0"}
    | URI               | HTTP Method | HTTP Status |      Description     |       Request        |        Response        | 
    |-------------------|-------------|-------------|----------------------|----------------------|------------------------|
| /movies           | GET         | 200         | Get Movies           | `                  ` | `[
  {
    "title": "The Avengers",
    "director": "Joss Whedon",
    "actors": "Robert Downey Jr., Chris Evans, Mark Ruffalo, Chris Hemsworth",
    "release": "2012",
    "description": "Earth's mightiest heroes must come together and learn to fight as a team if they are going to stop the mischievous Loki and his alien army from enslaving humanity.",
    "rating": null
  },...
  ]
 | /movies | post            | 200     | Post Movies | ` {
    "title": "The Avengers",
    "director": "Joss Whedon",
    "actors": "Robert Downey Jr., Chris Evans, Mark Ruffalo, Chris Hemsworth",
    "release": "2012",
    "description": "Earth's mightiest heroes must come together and learn to fight as a team if they are going to stop the mischievous Loki and his alien army from enslaving humanity.",
    "rating": null
  }` | `` |
    ```

Apply what you've learned so far.

-   Follow TDD Practices
-   Make sure your API follows RESTful principles
-   Use SEAT to help write tests
-   Use unit testing, integration testing, mocking, etc where
    appropriate
-   Apply ZOMBIES for test coverage
-   Use proper Spring Web and Data JPA patterns

### Instructions

1.  Create a project with Spring Initializer.
2.  Create a repository.
3.  Make initial commit before writing any non-generated code.
4.  Work on the project, following the stories and the objectives listed
    above.
5.  Submit a link to your completed code in Learn. Both of you should
    submit the same link.

Stories and Acceptance Criteria
-------------------------------

**Tip**: When reading through stories, try focusing on writing the test
that will fulfill the criteria first. Stoires and their critera outline
behavior, *not code*.

As a user, I should see a list of movies when I visit GMDB.

    Given the GBDB is empty
    When I visit GMDB movies
    Then I should see no movies

    Given a new movie has released
    When I submit this new movie to GMDB movies
    Then I should see that movie in GMDB movies

    Given the GBDB has a movie
    When I visit GMDB movies
    Then I should see that movie in GMDB movies

    Given the GBDB has many movies
    When I visit GMDB movies
    Then I should see that movie in GMDB movies

    Given the GBDB has many movies
    When I visit GMDB movies
    Then I should see a list with that movie

As a user, I can browse each movie so I can learn all the details.

    Rule: Movie details include title, director, actors, release year, description and star rating.

    Given the GBDB has many movies
    When I visit GMDB movies with an existing title
    Then I should see that movie's details

    Given the GBDB has many movies
    When I visit GMDB movies with a non-existing title
    Then I receive a friendly message that it doesn't exist

As a user, I can give a star rating to a movie so that I can share my
experiences with others.

    Given an existing movie
    When I submit a 5 star rating
    Then I can see it in the movie details.

    Given a movie with one 5 star rating and one 3 star rating
    When I view the movie details
    Then I expect the star rating to be 4.

As a user, I can review a movie so that I can share my thoughts about
it.

    Given an existing movie
    When I submit a star rating and text review
    Then I can see my contribution on the movie details.

    Given an existing movie
    When I submit a text review without a star rating
    Then I receive a friendly message that a star rating is required.

Here is sample json of movies, but keep in mind this is data to *start
with* and may not represent the models your final solution has. It is
**NOT REQUIRED** to use this data, but feel free to copy this into your
project if it is useful to you.

    [
      {
        "title": "The Avengers",
        "director": "Joss Whedon",
        "actors": "Robert Downey Jr., Chris Evans, Mark Ruffalo, Chris Hemsworth",
        "release": "2012",
        "description": "Earth's mightiest heroes must come together and learn to fight as a team if they are going to stop the mischievous Loki and his alien army from enslaving humanity.",
        "rating": null
      },
      {
        "title": "Superman Returns",
        "director": "Bryan Singer",
        "actors": "Brandon Routh, Kate Bosworth, Kevin Spacey, James Marsden",
        "release": "2006",
        "description": "Superman returns to Earth after spending five years in space examining his homeworld Krypton. But he finds things have changed while he was gone, and he must once again prove himself important to the world.",
        "rating": null
      },
      {
        "title": "Steel",
        "director": "Kenneth Johnson",
        "actors": "Shaquille O'Neal, Annabeth Gish, Judd Nelson, Richard Roundtree",
        "release": "1997",
        "description": "A scientist for the military turns himself into a cartoon-like superhero when a version of one of his own weapons is being used against enemies.",
        "rating": null
      },
      {
        "title": "Unbreakable",
        "director": "M. Night Shyamalan",
        "actors": "Bruce Willis, Samuel L. Jackson, Robin Wright, Spencer Treat Clark",
        "release": "2000",
        "description": "A man learns something extraordinary about himself after a devastating accident.",
        "rating": null
      },
      {
        "title": "Rocketeer",
        "director": "Jay Light",
        "actors": "Christopher Coakley",
        "release": "2012",
        "description": "N/A",
        "rating": null
      },
      {
        "title": "The Incredibles",
        "director": "Brad Bird",
        "actors": "Craig T. Nelson, Holly Hunter, Samuel L. Jackson, Jason Lee",
        "release": "2004",
        "description": "A family of undercover superheroes, while trying to live the quiet suburban life, are forced into action to save the world.",
        "rating": null
      },
      {
        "title": "The Lego Batman Movie",
        "director": "Chris McKay",
        "actors": "Will Arnett, Michael Cera, Rosario Dawson, Ralph Fiennes",
        "release": "2017",
        "description": "A cooler-than-ever Bruce Wayne must deal with the usual suspects as they plan to rule Gotham City, while discovering that he has accidentally adopted a teenage orphan who wishes to become his sidekick.",
        "rating": null
      }
    ]
