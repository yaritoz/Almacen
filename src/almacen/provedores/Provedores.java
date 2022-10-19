/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen.provedores;

import javax.swing.JOptionPane;

/**
 *
 * @author said_
 */
public class Provedores {
    
   String id_provedor;
   String Nombre_del_provedor;
   String Empresa;
   String Fecha_de_Entrega;

    public Provedores(String id_provedor, String Nombre_del_provedor, String Empresa, String Fecha_de_Entrega) {
        this.id_provedor = id_provedor;
        this.Nombre_del_provedor = Nombre_del_provedor;
        this.Empresa = Empresa;
        this.Fecha_de_Entrega = Fecha_de_Entrega;
    }

    public Provedores() {
        
    }

 
    public String getId_provedor() {
        return id_provedor;
    }

    public void setId_provedor(String id_provedor) {
        this.id_provedor = id_provedor;
    }

    public String getNombre_del_provedor() {
        return Nombre_del_provedor;
    }

    public void setNombre_del_provedor(String Nombre_del_provedor) {
        String Nombre_Upper="";
        char[] word;
        String[] tokens=Nombre_del_provedor.split(" ");
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            String output = token.substring(0, 1).toUpperCase() + token.substring(1);
            Nombre_Upper+=output;
            Nombre_Upper+=" ";
            
        }
        this.Nombre_del_provedor = Nombre_Upper;
    }

    public String getEmpresa() {
        
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        String Nombre_Upper="";
        char[] word;
        String[] tokens=Empresa.split(" ");
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            String output = token.substring(0, 1).toUpperCase() + token.substring(1);
            Nombre_Upper+=output;
            Nombre_Upper+=" ";
            
        }
        this.Empresa = Nombre_Upper;
    }

    public String getFecha_de_Entrega() {
        return Fecha_de_Entrega;
    }

    public void setFecha_de_Entrega(String Fecha_de_Entrega) {
        this.Fecha_de_Entrega = Fecha_de_Entrega;
    }
   
   

    
}
