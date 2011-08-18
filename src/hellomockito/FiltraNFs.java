package hellomockito;

import java.util.ArrayList;
import java.util.List;

public class FiltraNFs {

	private NFDao dao;

	public FiltraNFs(NFDao dao) {
		this.dao = dao;
	}

	
	public List<NF> filtra(){
		List<NF> filtrados = new ArrayList<NF>();
		for(NF nf : dao.pegaTodos()){
			if(nf.getValor() > 1000){
				filtrados.add(nf);
			}
		}
		return filtrados;
	}
	
}
