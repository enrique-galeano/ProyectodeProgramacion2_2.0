
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enriquejosegaleanotalavera
 */
public class AdministrarCodigo {
	  private ArrayList<JLabel>listaLabels=new ArrayList(); 
  private File archivo=null;

    public AdministrarCodigo(String path) {
        archivo=new File(path);
    }
	
    public ArrayList<JLabel> getListaPersonas() {
        return listaLabels;
    }

    public void setListaPersonas(ArrayList<JLabel> listaPersonas) {
        this.listaLabels = listaPersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

	
    public void cargarArchivo(){
        try{
            listaLabels = new ArrayList();
			JLabel temp;
            if(archivo.exists()){
                FileInputStream entrada=new FileInputStream(archivo);
                ObjectInputStream objeto=new ObjectInputStream(entrada);
                try{
                   while((temp=(JLabel)objeto.readObject())!=null){
                       listaLabels.add(temp);
                   } 
                }catch(EOFException ex){
                    //encontro el final del archivo
                    
                }
                objeto.close();
                entrada.close();
            }
        }catch(Exception ex){
            //encontro el final del archivo
        }
            
    }
    public void escribirArchivo() throws IOException{
        FileOutputStream fw=null;
        ObjectOutputStream bw=null;
        try{
           fw=new FileOutputStream(archivo);
           bw=new ObjectOutputStream(fw);
            for (JLabel t : listaLabels) {
                bw.writeObject(t);
            }
            bw.flush();
        }catch(Exception ex){
            
        }
        bw.close();
        fw.close();
        
    }

    @Override
    public String toString() {
        return  "Lista Label: "+listaLabels;
    }

	
}
