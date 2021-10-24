package republica;
import republicaExceptions.*;
public class Pagamentos {
	Residente[] listaResidentes = new Residente[0];
	float[] listaPagamentos = new float[0];

public Pagamentos( Residente[] listaResidentes, float[] listaPagamentos) {
	this.listaResidentes = listaResidentes;
	this.listaPagamentos = listaPagamentos;
}
public Residente[] getListaResidentes() { 
    return listaResidentes;
}

public void setListaResidentes(Residente[] listaResidentes) throws ListadeResidentesVaziaException{
	if (listaResidentes.length <= 0)
	{
		throw  new ListadeResidentesVaziaException("Não há residentes. Favor primeiro cadastre residentes");

	}
	else
	{
			this.listaResidentes = listaResidentes;
	}
}

public float[] getListaPagamentos() { 
    return listaPagamentos;
}

public void setListaPagamentos(float[] listaPagamentos) throws NroPagamentosDiferenteNroResidentesAException{

	if (this.listaResidentes.length != listaPagamentos.length)
	{
		throw  new NroPagamentosDiferenteNroResidentesAException("O número de Pagamentos não é igual ao número de residentes da república");

	}
	else
	{
			this.listaPagamentos = listaPagamentos;
	}

}

}
