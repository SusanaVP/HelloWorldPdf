package es.iessoterhernandez.daw.endes.HelloWorldPdf;

import java.io.*;//para deja poner la ubicacion del PDF
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class HelloWorld{

    public static void main( String[] args ) {
    try {
    	//Create Document instance.
    	Document document = new Document();
     
    	//Create OutputStream instance.
    	OutputStream outputStream = 
    		new FileOutputStream(new File("C:\\Users\\Public\\HelloWorld.pdf"));//hay que ponerle la ubicación donde a todo el mundo le funcione
     
    	//Create PDFWriter instance.
            PdfWriter.getInstance(document, outputStream);
     
            //Open the document.
            document.open();
     
            //Add content to the document.
            document.add(new Paragraph("Hello world"));
     
            //Close document and outputStream.
            document.close();
            outputStream.close();
     
            System.out.println("Pdf created successfully.");
        } catch (Exception e) {
    	e.printStackTrace();
        }
      }
}
			
	
      
      