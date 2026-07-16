package com.eucodo.usuario.business;

import com.eucodo.usuario.business.converter.UsuarioConverter;
import com.eucodo.usuario.business.dto.UsuarioDTO;
import com.eucodo.usuario.infraestructure.entity.Usuario;
import com.eucodo.usuario.infraestructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        return usuarioConverter.paraUsuarioDTO(usuarioRepository.save(usuario));
    }
}
