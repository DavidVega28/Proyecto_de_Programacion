
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

public class Reportes {
    String nombreArchivo;
    String Fecha;
    String rutaImagen;
    ArrayList<Usuario> usuarios;
    
    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;

    public Reportes(String Fecha, String rutaImagen, ArrayList<Usuario> usuarios) {
        nombreArchivo ="Carreras Disponibles";
        this.Fecha = Fecha;
        this.rutaImagen = rutaImagen;
        this.usuarios = usuarios;
        documento = new Document();
        titulo = new Paragraph("Carreras Universidad LD Costa Rica ");
    }

    public void CrearReporte(){
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
        
        //Tabla de carreras
        PdfPTable table = new PdfPTable(3);
            
        documento.add(Chunk.NEWLINE);
        
        table.setWidthPercentage(100);
        PdfPCell nombre_carrera = new PdfPCell(new Phrase("Nombre de Carrera"));
        nombre_carrera.setBackgroundColor(BaseColor.LIGHT_GRAY);
        
        PdfPCell codigo = new PdfPCell(new Phrase("Codigo"));
        codigo.setBackgroundColor(BaseColor.LIGHT_GRAY);
        
        PdfPCell cupos = new PdfPCell(new Phrase("Cupos"));
        cupos.setBackgroundColor(BaseColor.LIGHT_GRAY);
                
        table.addCell(nombre_carrera);
        table.addCell(codigo);
        table.addCell(cupos);
        
        table.addCell("Ingenieria en Informática");
        table.addCell("SD785");
        table.addCell("30");
        
        table.addCell("Arquitectura");
        table.addCell("AT785");
        table.addCell("25");
        
        table.addCell("Administración de Empresas");
        table.addCell("AD505");
        table.addCell("30");
        
        table.addCell("Farmacia");
        table.addCell("FA851");
        table.addCell("25");
        
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
