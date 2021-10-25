package republica;
import republicaExceptions.*;

public class Data {

	int mes;
	int ano;

    public Data (int mes, int ano) throws DataInvalidaException {
        this.setMes(mes);
        this.setAno(ano);
    }

    public void setMes(int mes) throws DataInvalidaException { 
    	if(mes <= 0 || mes > 12)
    		throw new DataInvalidaException("Insira um mes valido");
    	else
    		this.mes = mes;
    }

    public void setAno(int ano) throws DataInvalidaException { 
    	if(ano < 1000 || ano >= 10000)
    		throw new DataInvalidaException("Insira um ano valido");	
    	else	
    		this.ano = ano;
    }
    
    public int getMes() { 
        return mes;
    }
    public int getAno() { 
        return ano;
    }
}
