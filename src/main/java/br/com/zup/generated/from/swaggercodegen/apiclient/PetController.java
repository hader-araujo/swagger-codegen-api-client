package br.com.zup.generated.from.swaggercodegen.apiclient;

import br.com.zup.generated.from.swaggercodegen.apiclient.dto.PetDTO;
import br.com.zup.generated.from.swaggercodegen.apiclient.restclient.PetApiClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pet")
public class PetController {

    private PetApiClient petApi;

    public PetController(PetApiClient petApi) {
        this.petApi = petApi;
    }

    @GetMapping(value = "/findByStatus")
    @ResponseBody
    public ResponseEntity<List<PetDTO>> findByStatus(@RequestParam("status") List<String> status) {
        return this.petApi.findPetsByStatus(status);
    }
}
