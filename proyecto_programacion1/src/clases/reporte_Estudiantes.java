
package clases;

import clases.Usuario;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BarcodeQRCode;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Image;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class reporte_Estudiantes {
    String nombreArchivo;
    String Fecha;
    String rutaImagen;
    ArrayList<Usuario> usuarios;
    
    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;

    public reporte_Estudiantes(String Fecha, String rutaImagen, ArrayList<Usuario> usuarios) {
        nombreArchivo ="Personas Registrados";
        this.Fecha = Fecha;
        this.rutaImagen = rutaImagen;
        this.usuarios = usuarios;
        documento = new Document();
        titulo = new Paragraph("Personas Registrados ");
    }

    public void CrearReporte_estu(){
       try{
        archivo = new FileOutputStream(nombreArchivo + ".pdf");
        
        PdfWriter.getInstance(documento, archivo);
        
        documento.open();
        titulo.setAlignment(1);
        documento.add(titulo);
        
           com.itextpdf.text.Image imagen = null;
        try{
            imagen = com.itextpdf.text.Image.getInstance(rutaImagen);
            imagen.scaleAbsolute(175, 175);
            imagen.setAbsolutePosition(400, 675);
        }catch(Exception e){
           
        }
        documento.add(imagen);
        documento.add(Chunk.NEWLINE);
        documento.add(new Paragraph(""));
        documento.add(Chunk.NEWLINE);       
        documento.add(Chunk.NEWLINE);
        
        //Tabla de estudiantes
        PdfPTable table = new PdfPTable(4);
            
        documento.add(Chunk.NEWLINE);
        
        table.setWidthPercentage(100);
            PdfPCell nombre = new PdfPCell(new Phrase("Nombre"));
            nombre.setBackgroundColor(BaseColor.LIGHT_GRAY);
        
            PdfPCell apellidos = new PdfPCell(new Phrase("Apellidos"));
            apellidos.setBackgroundColor(BaseColor.LIGHT_GRAY);

            PdfPCell cedula = new PdfPCell(new Phrase("Cédula"));
            cedula.setBackgroundColor(BaseColor.LIGHT_GRAY);

            PdfPCell rol = new PdfPCell(new Phrase("Rol"));
            rol.setBackgroundColor(BaseColor.LIGHT_GRAY);
            
                          
        table.addCell(nombre);
        table.addCell(apellidos);
        table.addCell(cedula);
        table.addCell(rol);

           for (Usuario p : usuarios) {
               table.addCell(p.getNombre());
               table.addCell(p.getApellidos());
               table.addCell(p.getNumcedula());
               table.addCell(p.getRol());
           }
        documento.add(table);
        
        //Codigo QR    
        BarcodeQRCode codqr = new BarcodeQRCode("hola",1,1,null);
        com.itextpdf.text.Image qrimage = codqr.getImage();
        qrimage.scalePercent(400);
        documento.add(qrimage);
        
        documento.add(Chunk.NEWLINE);
        documento.add(new Paragraph("Fecha: " + Fecha));
        
        documento.close();
        
        JOptionPane.showMessageDialog(null,"Reporte creado ");
  
    }catch(Exception e){   
    }
}}

