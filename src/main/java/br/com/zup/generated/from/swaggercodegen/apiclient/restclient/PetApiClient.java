package br.com.zup.generated.from.swaggercodegen.apiclient.restclient;

    import org.springframework.cloud.netflix.feign.FeignClient;
import io.swagger.configuration.ClientConfiguration;

@FeignClient(name="${swaggerPetstore.name:swaggerPetstore}", url="${swaggerPetstore.url:https://petstore.swagger.io/v2}", configuration = ClientConfiguration.class)
public interface PetApiClient extends PetApi {
}