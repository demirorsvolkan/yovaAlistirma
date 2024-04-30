package tr.edu.medipol.yova.birimtestornek1;
import org.junit.Test;
import static org.junit.Assert.*;


public class HesapTest {
	@Test
	public void testTopla() {
		//given
		int sayi1=2;
		int sayi2=2;
		//when
		int sonuc=Hesap.topla(sayi1, sayi2);
		//then
		assertEquals(4, sonuc);
	}
	@Test
	public void testCikar() {
		//given
		int sayi1=4;
		int sayi2=2;
		//when
		int sonuc=Hesap.cikar(sayi1, sayi2);
		//then
		assertEquals(2, sonuc);
	}	
	@Test
	public void testCarp() {
		//given
		int sayi1=4;
		int sayi2=2;
		//when
		int sonuc=Hesap.carp(sayi1, sayi2);
		//then
		assertEquals(8, sonuc);
	}
	@Test
	public void testBol() {
		//given
		int sayi1=4;
		int sayi2=2;
		//when
		int sonuc=Hesap.bol(sayi1, sayi2);
		int sifirSonuc=Hesap.bol(sayi1,0);
		//then
		assertEquals(2, sonuc);
		assertEquals(-1, sifirSonuc);
		
	}

}
/*
*/