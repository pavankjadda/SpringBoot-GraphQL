# Spring Boot with GraphQL

Sample project that demonstrates how to use Spring Boot with GraphQL.

### How to run the application?

1. Start the MySQL database using the following command
    ```
    docker run -e MYSQL_ROOT_PASSWORD=Test@2020  -e MYSQL_DATABASE=springboot-graphql --name mysql -p 3306:3306 -d mysql
    ```
2. Download and run the [Spring Boot application](src/main/java/com/pj/springbootgraphql/SpringBootGraphQlApplication.java)
3. Open the browser and navigate to http://localhost:8081/graphiql to test the GraphQL API
4. Enter the mutation to create a new author
    ``` graphql
    mutation {
        createAuthor(input: {name: "John Doe", email: "jdoe@exampl.com", phoneNumber: "12334344949"}) {
            id
            name
            email
            phoneNumber
        }
    }
    ```
5. Enter the query to get all authors
    ``` graphql
    query {
        findAllAuthors {
            id
            name
            email
            phoneNumber
        }
    }
    ```
6. Or the query to get all Author by ID:1
    ``` graphql
    query {
        findAuthorById(id: 1) {
            id
            name
            email
            phoneNumber
        }
    }
    ```
