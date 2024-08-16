package com.tarun;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "spring.kafka")
public class KafkaProperties {

    /**
     * The bootstrap-servers property will be mapped to the bootstrapServers field in the KafkaProperties class.
     * Spring does this mapping by converting property names from kebab-case (e.g., bootstrap-servers) to camelCase
     * (e.g., bootstrapServers).
     */
    private String bootstrapServers;

    // Getters and Setters

    public String getBootstrapServers() {
        return bootstrapServers;
    }

    public void setBootstrapServers(String bootstrapServers) {
        this.bootstrapServers = bootstrapServers;
    }
}
