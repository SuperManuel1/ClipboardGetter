import java.awt.datatransfer.*;
import java.awt.*;


public class clipboardGetter
{



	public static void main(String []args) throws Exception
	{
	Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
	
	System.out.println(c.getData(DataFlavor.stringFlavor));





	}




}