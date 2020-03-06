package lab.pkg6_sebastianramirez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class admin {
    File archivo  = null;
    ArrayList<usuario> usuarios = new ArrayList();

    public admin(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<usuario> usuarios) {
        this.usuarios = usuarios;
    }
    public void escribirArchivo() throws IOException{
        FileWriter fw = new FileWriter(archivo,true);
        BufferedWriter bw = new BufferedWriter(fw);
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        try{
            for (usuario u : usuarios) {
                bw.write(u.getNombre()+";");
                bw.write(u.getUsuario()+";");
                bw.write(u.getContraseña()+";");
                bw.write(sd.format(u.getFecha())+"\n");
            }
            bw.flush();
        }catch (Exception ex) {
            
        }bw.close();
        fw.close();
    }
    
}
