package br.com.zup.generated.from.swaggercodegen.apiclient.restclient;

import org.springframework.cloud.openfeign.FeignClient;
import io.swagger.configuration.ClientConfiguration;

@FeignClient(contextId="StoreApiClient", name="${swaggerPetstore.name:swaggerPetstore}", url="${swaggerPetstore.url:https://petstore.swagger.io/v2}", configuration = ClientConfiguration.class)
public interface StoreApiClient extends StoreApi {
}
