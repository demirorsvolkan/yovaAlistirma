package tr.edu.medipol.yova.birimtestornek1;
import org.junit.Test;
import static org.junit.Assert.*;


public class MainTest {
	@Test
	public void testMetniFormatla() {
		//ön koşul given
		String kaynakMetinString="     ders 1     ";
		//test edilecek okd çağırıldığında when 
		String sonuc= Main.metniFormatla(kaynakMetinString);
		//kontroller then
		assertNotNull(sonuc);
		assertEquals("Ders 1", sonuc);
	}

}
