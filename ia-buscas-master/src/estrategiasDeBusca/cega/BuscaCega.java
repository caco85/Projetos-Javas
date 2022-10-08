package estrategiasDeBusca.cega;

import java.util.ArrayList;
import java.util.List;

import espacoDeEstados.Estado;


public abstract class BuscaCega {

	protected String nomeDaEstrategia;
	protected Estado<?> eInicial;
	protected Estado<?> eObjetivo;
	protected List<Estado<?>> caminho;

	public BuscaCega() {
		this(null, null);
	}

	public BuscaCega(Estado<?> estadoInicial, Estado<?> estadoMeta) {
		this.nomeDaEstrategia = "Busca cega";
		eInicial = estadoInicial;
		eObjetivo = estadoMeta;
		caminho = new ArrayList<Estado<?>>();
	}

	public String getNomeDaEstrategia() {
		return nomeDaEstrategia;
	}

	public void setInicio(Estado<?> estadoInicial) {
		this.eInicial = estadoInicial;
	}

	public void setObjetivo(Estado<?> estadoMeta) {
		this.eObjetivo = estadoMeta;
	}

	public Estado<?> getObjetivo() {
		return eObjetivo;
	}

	public abstract void buscar();

	public List<Estado<?>> getCaminhoSolucao() {
		return caminho;
	}

}