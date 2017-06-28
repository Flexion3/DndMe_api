package api.common.responses;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class SuccesResponse extends ResponseEntity<Object> {

    public SuccesResponse(Object body) {
        super(body, HttpStatus.OK);
    }

}
