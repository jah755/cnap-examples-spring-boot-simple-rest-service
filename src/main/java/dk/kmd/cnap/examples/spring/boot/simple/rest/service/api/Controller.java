package dk.kmd.cnap.examples.spring.boot.simple.rest.service.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/** The Rest API controller of the SpringBootSimpleRestApplication */

@RestController
public class Controller {


  private Logger logger = LoggerFactory.getLogger(getClass());


  private String applicationName = "spring-boot-simple-rest-service";


  @GetMapping(value = "/")
  public ResponseEntity<String> noPath() {
    String msg = "This is the default message from "+ applicationName;
    logger.info(msg);
    return ResponseEntity.ok(msg);
  }

  @GetMapping(value = "/api/health")
  public ResponseEntity<String> health() {
    String msg = "The health of "+ applicationName+" is fine";
    logger.info(msg);
    return ResponseEntity.ok(msg);
  }

  @GetMapping(value = "/api/echo")
  public ResponseEntity<String> echo(@RequestParam String message) {
    String msg =
       applicationName+ " echoes the provided message : \""
            + message
            + "\"";
    logger.info(msg);
    return ResponseEntity.ok(msg);
  }
}
