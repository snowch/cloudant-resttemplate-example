package hello;

import org.springframework.web.client.RestTemplate;

public class Application {
	
	private final static String URL = "https://education.cloudant.com/animaldb/_design/views101/_view/latin_name?include_docs=true";

    public static void main(String args[]) {

        RestTemplate restTemplate = new RestTemplate();
    
        // See https://spring.io/guides/gs/consuming-rest/ for examples of binding 
        // response objects to java domain objects
        String animals = restTemplate.getForObject(URL, String.class);

        System.out.println(animals);
    }

}
