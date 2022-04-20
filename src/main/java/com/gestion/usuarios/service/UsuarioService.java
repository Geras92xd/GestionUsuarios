package com.gestion.usuarios.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.gestion.Entidades.Usuario;

public interface UsuarioService {
	
	public Page<Usuario> findAll(Pageable pageable);
	
	public Optional<Usuario> findUsuario(Long id);
	
	public List<Usuario> findAll();
	
	public void save(Usuario usuario);
	
	public void delete(Long id);
}
