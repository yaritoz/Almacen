/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen.metodos;

import almacen.provedores.Provedores;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.util.StringTokenizer;

/**
 *
 * @author said_
 */
public class Metodos {
    Vector provedores = new Vector();
    
    public void guardar(Provedores nuevoProvedor){
    provedores.addElement(nuevoProvedor);

}
    
    public void guardarArchivo(Provedores provedor){
    
        try{
            FileWriter write = new FileWriter ("Provedores.txt",true);  
            BufferedWriter buff = new BufferedWriter(write);
            PrintWriter print = new PrintWriter(buff);
            
            print.print(provedor.getId_provedor());
            print.print(","+provedor.getNombre_del_provedor());
            print.print(","+provedor.getEmpresa());
            print.println(","+provedor.getFecha_de_Entrega());
            print.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    
    
    }
    
    public DefaultTableModel listaProvedores(){
        
    Vector cabeceras = new Vector();
    
    cabeceras.addElement("ID Provedor");
    cabeceras.addElement("Nombre Provedor");    
    cabeceras.addElement("Empresa");
    cabeceras.addElement("Fecha de Entrega");

    DefaultTableModel  tabla = new DefaultTableModel(cabeceras,0){
        @Override
        public boolean isCellEditable(int filas, int columnas) {
            if(columnas==-1){
            return true;}else{
            return false;} //To change body of generated methods, choose Tools | Templates.
        }
    };
    
    try{
        FileReader reader = new FileReader("Provedores.txt");
        BufferedReader buffer = new BufferedReader(reader);
        String line;
        
        while((line=buffer.readLine())!=null){
            StringTokenizer dato = new StringTokenizer(line,",");
            Vector x = new Vector();
            while(dato.hasMoreTokens()){
            x.addElement(dato.nextToken());
            
            
            }
            tabla.addRow(x);
    }
    
    }catch(Exception e){
    
     JOptionPane.showMessageDialog(null, e);
    }
    return tabla;
    }
}
