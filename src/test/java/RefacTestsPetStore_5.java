import org.hamcrest.Matchers;
import org.junit.Test;

public class RefacTestsPetStore_5 {
    @Test
    public void verifyBody() {
        new PetStorePetEndPoint()
                .getPetByStatus("available")
                .then()
                .assertThat()
                //.log().body()
                .body(Matchers.notNullValue());
    }

    @Test
    public void verifyBodyUseParam() {
        new PetStorePetEndPoint()
                .getPetByStatus("available")
                .then()
                .assertThat()
                //.log().body()
                .body(Matchers.notNullValue());
    }
    @Test
    public void verifyExistingPetReturn200() {
        new PetStorePetEndPoint()
                .getPetById("1")
                .then()
                .log().body()
                .statusCode(200);
    }
    @Test
    public void verifyNotExistingPetReturn404() {
        new PetStorePetEndPoint()
                .getPetById("123456789012345")
                .then()
                .log().body()
                .statusCode(404);
    }

}
