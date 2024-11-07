package visao;

import java.util.Date;

import controle.MovimentacaoControle;
import dao.ClienteDAO;
import dao.ContaDAO;
import entidade.Movimentacao;

public class MovimentacaoTela {

	public static void main(String[] args) {

		ClienteDAO clienteDao= new ClienteDAO();
		ContaDAO contaDAO = new ContaDAO();
		
		ClienteDAO cliente = new ClienteDAO();
		clienteDao.inserir(cliente);

		ContaDAO conta = new ContaDAO();
		conta.setCliente(cliente);
		contaDAO.inserir(conta);
		MovimentacaoControle controle = new MovimentacaoControle();
		
		Movimentacao movimentacao = new Movimentacao();
		
		movimentacao.setDataTransacao(new Date());
		movimentacao.setDescricao("Depósito de 500,00 no dia 03/10/24");
		movimentacao.setTipoTransacao("depósito");
		movimentacao.setValorOperacao(500.);
		
		controle.inserir(movimentacao);
	}

}
