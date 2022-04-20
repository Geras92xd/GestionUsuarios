package com.gestion.usuarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gestion.Entidades.Usuario;
import com.gestion.usuarios.service.UsuarioService;
import com.gestion.usuarios.util.paginacion.PageRender;

public class EmpleadoController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping({"/", "/listarUsuarios"})
	public String listarUsuarios(@RequestParam(name = "page", defaultValue = "0")int page, Model model) {
		Pageable pageRequest = PageRequest.of(page, 5);
		Page<Usuario> usuarios = usuarioService.findAll(pageRequest);
		PageRender<Usuario> pageRender = new PageRender("/lista", usuarios);
		
		model.addAttribute("Titulo", "Lista de usuarios");
		model.addAttribute("usuarios", usuarios);
		model.addAttribute("page", pageRender);
		return "listarUsuarios";
	}
	
}
