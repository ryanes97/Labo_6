/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import conexion.Conexion;
import dao.FiltroDao;
import modelo.Filtro;

/**
 *
 * @author LN710Q
 */
public class Inventario {
    public static void main(String[] args) {
       FiltroDao filtro = new FiltroDao();
       
       filtro.create(new Filtro("hola","adios",76,true));
    }   
}
