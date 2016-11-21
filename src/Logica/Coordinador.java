package Logica;

import Conexion.ConexionProductos;
import Conexion.ConexionUsuarios;
import java.util.ArrayList;

public class Coordinador {
	
        public ArrayList <Usuario> Usuarios;
	public ArrayList <ProductoVO> Productos;
	public ArrayList <ProductoVO> carrito;
	public Usuario us_actual=null;
        public Usuario us_activo=null;
        
        public Coordinador(){
            CargarDatos();
        }
        
        public void CargarDatos(){
            Productos= new ConexionProductos().ObtenerProductos();
            Usuarios= new ConexionUsuarios().ObtenerUsuarios();
            System.out.println("Usuarios y productos actualizados.");
        }
	
}
