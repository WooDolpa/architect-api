package com.architecture.api.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * packageName : com.architecture.api.config
 * className : OpenApiConfig
 * user : jwlee
 * date : 24. 6. 18.
 * description :
 */
@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                                .title("Architecture API")
                                .version("1.0")
                                .description("Architecture API")
                        );
    }

//    @Bean
//    public GroupedOpenApi adminApi() {
//        return GroupedOpenApi.builder()
//                .group()
//                .pathsToMatch()
//                .build();
//    }

}
