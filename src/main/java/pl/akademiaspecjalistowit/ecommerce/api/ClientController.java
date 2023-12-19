package pl.akademiaspecjalistowit.ecommerce.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import pl.akademiaspecjalistowit.api.ClientApi;
import pl.akademiaspecjalistowit.model.AddFundsRequest;

@Slf4j
@RestController
public class ClientController implements ClientApi {

    @Override
    public ResponseEntity<Void> addFunds(AddFundsRequest addFundsRequest) {
        log.info("User triggered founds upgrade: {} ", addFundsRequest.toString());
        return ResponseEntity.ok().build();
    }
}
