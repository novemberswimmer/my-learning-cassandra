#My First Spring Reactor Cassandra App
This sample app focuses on how to run CRUD query using Cassandra database.  This
does not show good data modeling using Cassandra. I'm still at lost with how to
come up with a good Cassandra data model

## References
This application is based on the following tutorials:
 * [medium.com](https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=2&cad=rja&uact=8&ved=2ahUKEwjNn6zSk67lAhXVvJ4KHRduAGcQFjABegQIARAB&url=https%3A%2F%2Fmedium.com%2F%40ankitkumargupta%2Fquick-start-spring-rest-api-with-cassandra-e112700936cf&usg=AOvVaw1aKt9deHFYkLHqzuHfaldW)
 * [baeldung.com](https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=3&cad=rja&uact=8&ved=2ahUKEwiJiY2Bp67lAhUBPq0KHVYAAb0QFjACegQIABAB&url=https%3A%2F%2Fwww.baeldung.com%2Fspring-data-cassandra-reactive&usg=AOvVaw0M7W9783QLopFE8WDeuHJN)
 * [docker.com](https://hub.docker.com/_/cassandra)
 
## Notes
 * When running the Cassandra container make sure you map the default port 9042 to your local machine 
   * ```docker run  --name my-cassandra-container -p 9042:9042 -d cassandra```
 * The property ```spring.data.cassandra.schema-action``` only creates table if it does not exist but not keyspace
 you still have to manually create the keyspace using ```cqlsh```