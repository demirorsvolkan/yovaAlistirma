package tr.edu.medipol.yova.birimtestornek1;
import org.apache.commons.lang3.StringUtils;
public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("Uygulama açılıyor;");
		String ornekMetin="                   yazilim ortam ve araclari";
		String sonuc= metniFormatla(ornekMetin);
		System.out.println(sonuc);

	}
	public static String metniFormatla(String kaynakMetin) {
		String formatliMetin;
		//adım1 boşluk temizle
		formatliMetin=StringUtils.normalizeSpace(kaynakMetin);
		//adım2 baş harfi büyüt
		formatliMetin=StringUtils.capitalize(formatliMetin);
		//adım3 uzunsa kısalt
		formatliMetin=StringUtils.abbreviate(formatliMetin, 25);
		return formatliMetin;
	}
}
