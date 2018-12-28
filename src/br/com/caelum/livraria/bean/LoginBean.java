package br.com.caelum.livraria.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.caelum.livraria.dao.UsuarioDAO;
import br.com.caelum.livraria.modelo.Usuario;

@ManagedBean
@ViewScoped
public class LoginBean {

	private Usuario usuario = new Usuario();

	public Usuario getUsuario() {
		return usuario;
	}

	public String efetuarLogin() {
		System.out.println("Fazendo login do usuario: " + this.usuario.getEmail());

		boolean existe = new UsuarioDAO().existe(this.usuario);
		if (existe) {
			return "livro?faces-redirect=true";
		}

		return null;

	}

}
