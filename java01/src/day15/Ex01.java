package day15;
/*
	¹®Á¦ 1 ]
		ÀÌ¸ŞÀÏÀ» ÀÔ·Â¹Ş¾Æ¼­
		ÀÔ·Â¹ŞÀº ¹®ÀÚ¿­ÀÌ ÀÌ¸ŞÀÏ Çü½Ä¿¡ ¸Â´ÂÁö ¾Æ´ÑÁö °Ë»çÇÏ¼¼¿ä.
		ÀÌ¸ŞÀÏ Çü½ÄÀº 
			¾ËÆÄºª ¼ıÀÚ·Î 8ÀÚ ÀÌ»óÀ¸·Î ÇÏ°í @ µµ¸ŞÀÎÁÖ¼Ò
		·Î Ã³¸®ÇÏ¼¼¿ä. 
		Âü°í ] 
			ÇÑ±Û Ã³¸® : [°¡-ÆR] - ÇÑ±ÛÀº ¾ÆÀÌµğ¿¡ ¾²Áö¸¶¼¼¿ä.
			
 */
import java.util.*;
import javax.swing.*;
import java.util.regex.*;
public class Ex01 {

	public static void main(String[] args) {
		String mail = JOptionPane.showInputDialog("ÀÌ¸ŞÀÏÀ» ÀÔ·ÂÇÏ¼¼¿©");
		Pattern p = p.compile(".*[a-zA-z]\d{8}@.*[a-zA-z]{8}.*[a-zA-z]{5}");
		Matcher mat = p.matcher(mail);
		if(mat.matches()) {
			JOptionPane.showMessageDialog(null, "¿Ã¹Ù¸¥ ÀÌ¸ŞÀÏÀÔ´Ï´Ù.");
		} else {
			JOptionPane.showMessageDialog(null, "Àß¸øµÈ ÀÌ¸ŞÀÏÀÔ´Ï´Ù.");
		}
	}

}
