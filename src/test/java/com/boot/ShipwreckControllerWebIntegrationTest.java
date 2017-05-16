package com.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {App.class})
public class ShipwreckControllerWebIntegrationTest {

    @Test
    public void testListAll() throws IOException {
        //        RestTemplate restTemplate = new RestTemplate();
        //        ResponseEntity<String> response =
        //                restTemplate.getForEntity("http://localhost:8080/api/v1/shipwrecks", String.class);
        //
        //        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
        //
        //        ObjectMapper objectMapper = new ObjectMapper();
        //        JsonNode responseJson = objectMapper.readTree(response.getBody());
        //
        //        assertThat(responseJson.isMissingNode(), is(false));
        //        assertThat(responseJson.toString(), equalTo("[]"));
    }
}
