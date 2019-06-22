

import java.sql.Timestamp;
import java.util.ArrayList;

public class MensagemF implements Mensagem{
	public final static int RESPOSTA = 0;
	public final static int REQUISICAO = 1;
	public final static int FINALIZA = 2;
	public final static int LOGIN = 3;
	public final static int INICIAR = 4;
	
	
	private int tipo;
	private Timestamp tempoMensagem;//tempo inicial que comecou a msg
	private String id;
	private ArrayList<String> vizinhos;
	private String nome;
	
	public MensagemF(){
		setTimestamp(new Timestamp(System.currentTimeMillis()));
	}
	
	
	public void setNome(int tipo) {
		switch(tipo){
			case 0:
				this.nome = "RESPOSTA";
				break;
			case 1:
				this.nome = "REQUISICAO";
				break;
			case 2:
				this.nome = "FINALIZA";
				break;
			case 3:
				this.nome = "LOGIN";
				break;
			case 4:
				this.nome = "INICIAR";
				break;
		}
	}
	
	public String getNome(){
		return nome;
	}
	
	@Override
	public int getTipo() {
		return tipo;
	}

	@Override
	public void setTipo(int tipo) {
		this.tipo = tipo;
		setNome(tipo);
	}

	public ArrayList<String> getVizinhos() {
		return vizinhos;
	}

	public void setVizinhos(ArrayList<String> vizinhos) {
		this.vizinhos = vizinhos;
	}

	public Timestamp getTimestamp() {
		return tempoMensagem;
	}

	public void setTimestamp(Timestamp tempoMensagem) {
		this.tempoMensagem = tempoMensagem;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}