package org.acme;

import io.quarkus.test.InjectMock;
import io.quarkus.test.junit.QuarkusTest;
import org.acme.domain.data.dto.response.ResponseDto;
import org.acme.services.TriangleService;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;
import org.acme.domain.data.dto.request.RequestDto;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class GreetingResourceTest {

    @InjectMock
    TriangleService triangleService;
    @Test
    void testHelloEndpoint() {
        given()
          .when().get("/hello")
          .then()
             .statusCode(200)
             .body(is("Hello from Quarkus REST"));
    }

    @Test
    void testTriangles() {
        RequestDto esperado = new RequestDto(10,10,10);
        RequestDto simulador = new RequestDto(10,10,10);
        Mockito.when(triangleService.triangleEval(new RequestDto(10,10,10)))
                .thenReturn(new ResponseDto("Isoceles"));
        final ResponseDto resultado = triangleService.triangleEval(simulador);
        Assertions.assertEquals(esperado.getaSide(),simulador.getaSide());
        Assertions.assertEquals(esperado.getbSide(),simulador.getbSide());
        Assertions.assertEquals(esperado.getcSide(),simulador.getcSide());
        Assertions.assertEquals(esperado,simulador);
    }

}