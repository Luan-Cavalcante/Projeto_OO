package republica;

public class Pagamentos {
	Residente[] listaResidentes = new Residente[0];
	int[] listaPagamentos = new int[0];

public Pagamentos( Residente[] listaResidentes, int[] listaPagamentos) {
	this.listaResidentes = listaResidentes;
	this.listaPagamentos = listaPagamentos;
}
public Residente[] getListaResidentes() { 
    return listaResidentes;
}

public void setListaResidentes() { 
}

public int[] getListaPagamentos() { 
    return listaPagamentos;
}

public void setListaPagamentos() { 
}

}
