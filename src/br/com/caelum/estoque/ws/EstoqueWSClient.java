package br.com.caelum.estoque.ws;

import java.util.List;

import javax.jws.WebService;

import br.com.caelum.estoque.modelo.Filtro;
import br.com.caelum.estoque.modelo.Filtros;
import br.com.caelum.estoque.modelo.Item;
import br.com.caelum.estoque.modelo.ListaItens;
import br.com.caelum.estoque.modelo.TokenUsuario;
import br.com.caelum.estoque.dao.ItemDao;
import br.com.caelum.estoque.dao.TokenDao;
import br.com.caelum.estoque.exeption.AuthorizationException;

@WebService(endpointInterface = "br.com.caelum.estoque.ws.EstoqueWS",serviceName = "EstoqueWSClient")
public class EstoqueWSClient implements EstoqueWS {

	private ItemDao dao;
	
	@Override
	public ListaItens todosOsItens(Filtros filtros) {
		System.out.println("Chamando getItens()");
		List<Filtro> lista = filtros.getFiltro();
		List<Item> itensResultado = dao.todosItens(lista);
		return new ListaItens(itensResultado);
	}

	@Override
	public CadastrarItemResponse cadastrarItem(CadastrarItem item, TokenUsuario token) throws AuthorizationException {

		boolean valido = new TokenDao().ehValido(token);

		if (!valido) {
			throw new AuthorizationException("Não autenticado.","Token invalido");
		}

		this.dao.cadastrar(item.getItem());
		return new CadastrarItemResponse(item.getItem());
	}

}
