

import java.io.Serializable;

public interface Mensagem extends Serializable{
	
	public abstract int getTipo();
	public abstract void setTipo(int tipe);
	
}