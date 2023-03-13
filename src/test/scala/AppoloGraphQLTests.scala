import java.util
import io.restassured.RestAssured.{`given`, given}
import io.restassured.http.ContentType
import io.restassured.module.scala.RestAssuredSupport.AddThenToResponse
import org.junit.Test


class AppoloGraphQLTests {

  private val url = "https://swapi-graphql.netlify.app"
  private var endpoint = "/.netlify/functions/index"

  @Test def allFilmsTest(): Unit = {

    val queryString = "query Query {\n  allFilms {\n    films {\n      title\n      director\n    }\n  }\n}"
    val query = new GraphQLQuery
    query.setQuery(queryString)
    val response = `given`()
      .contentType(ContentType.JSON)
      .body(query)
      .log()
      .headers()
      .when()
      .post(url+endpoint)
      .`then`()
      .statusCode(200)
  }
}
