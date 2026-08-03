package br.com.studiofranchini.service;

import br.com.studiofranchini.entity.Usuario;
import br.com.studiofranchini.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import br.com.studiofranchini.enums.Role;
import java.time.LocalDateTime;

@Service
public class UsuarioService {

    @Value("${app.admin.email}")
    private String adminEmail;

    @Value("${app.admin.password}")
    private String adminPassword;

    @Value("${app.admin.name}")
    private String adminName;

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void createAdminIfNotExists() {

        if (usuarioRepository.findByEmail(adminEmail).isPresent()) {
            return;
        }

        Usuario admin = new Usuario();

        admin.setNome(adminName);
        admin.setEmail(adminEmail);
        admin.setSenha(adminPassword);
        admin.setAtivo(true);
        admin.setRole(Role.ROLE_ADMIN);
        admin.setDataCriacao(LocalDateTime.now());

        usuarioRepository.save(admin);
    }
}