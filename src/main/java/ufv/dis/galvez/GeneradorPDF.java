package ufv.dis.galvez;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import ufv.dis.galvez.Usuario;

public class GeneradorPDF {
	
	public static void generarPDF (Usuario u) throws FileNotFoundException, DocumentException {
		
	String filename = "pdfs/" + u.getNombre() + "-" + u.getApe() + ".pdf";
	Document document = new Document();
	PdfWriter.getInstance(document, new FileOutputStream(filename));
	document.open();
	
	document.add(new Paragraph("Nombre: " + u.getNombre()));
	document.add(new Paragraph("Apellido: " + u.getApe()));
	document.add(new Paragraph("Email: " + u.getEmail()));
	
	
	document.add(new Paragraph("Doc generado el: " + new Date()));
	
	document.close();

	}
}
	
	

