package br.com.studiofranchini.config;

import br.com.studiofranchini.service.UsuarioService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BootstrapConfig {

    @Bean
    CommandLineRunner init(UsuarioService usuarioService) {
        return args -> usuarioService.createAdminIfNotExists();
    }
}