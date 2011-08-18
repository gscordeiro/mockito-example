package hellomockito;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class FiltraNFsTest {

	@Test
	public void deveRemoverNFsMenorQue100(){
		
		List<NF> listaFalsa = Arrays.asList(new NF(500), new NF(600));
		
		NFDao dao = mock(NFDao.class);
		
		when(dao.pegaTodos()).thenReturn(listaFalsa);
		
		FiltraNFs filtro = new FiltraNFs(dao);
		
		List<NF> nfs = filtro.filtra();
		assertEquals(0, nfs.size());
		
		verify(dao).pegaTodos();
	}
}
