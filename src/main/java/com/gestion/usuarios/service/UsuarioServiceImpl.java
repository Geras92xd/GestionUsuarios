package com.gestion.usuarios.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import com.gestion.Entidades.Usuario;
import com.gestion.usuarios.repositorio.UsuarioRepositorio;

public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	UsuarioRepositorio usuarioRepositorio;
	
	@Override
	@Transactional(readOnly = true)
	public Page<Usuario> findAll(Pageable pageable) {
		return usuarioRepositorio.findAll(pageable);
	}
		
	@Transactional(readOnly = true)
	public List<Usuario> findAll(){
		return (List<Usuario>) usuarioRepositorio.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Usuario> findUsuario(Long id) {
		return usuarioRepositorio.findById(id);
	}

	@Override
	@Transactional
	public void save(Usuario usuario) {
		usuarioRepositorio.save(usuario);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		usuarioRepositorio.deleteById(id);
		
	}

}
