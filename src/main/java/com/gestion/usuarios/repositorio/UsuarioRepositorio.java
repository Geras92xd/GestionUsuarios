package com.gestion.usuarios.repositorio;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.gestion.Entidades.Usuario;

public interface UsuarioRepositorio extends PagingAndSortingRepository<Usuario, Long>{
	
	
}
