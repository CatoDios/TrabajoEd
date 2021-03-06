/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import Logica.ProductoVO;
import Logica.Usuario;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Billy
 */
public class ConexionUsuarios{
    
    public ConexionUsuarios(){
        
    }

    public ArrayList<Usuario> ObtenerUsuarios(){
        ArrayList<Usuario> list = new ArrayList<Usuario>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM usuario;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Usuario vo = new Usuario();
                vo.setIdusuario(rs.getInt(1));
                vo.setNombre(rs.getString(2));
                vo.setApellido(rs.getString(3));
                vo.setDni(rs.getString(4));
                vo.setCorreo(rs.getString(5));
                vo.setTelefono(rs.getString(6));
                vo.setSaldo(rs.getInt(7));
                vo.setUsuario(rs.getString(8));
                vo.setPassword(rs.getString(9).toCharArray());
                vo.setFoto(rs.getBytes(10));
                
                Blob blob = rs.getBlob(10);
                
                byte[] data= blob.getBytes(1, (int)blob.length());
                
                BufferedImage bi=null;
                try{
                    bi= ImageIO.read(new ByteArrayInputStream(data));
                }catch(Exception e){
                    System.out.println("Error al traducir bytes para obtener la imagen.");
                }             
                
                ImageIcon i = new ImageIcon(bi);
                vo.setIcono(i.getImage());
                
                list.add(vo);
                
                /*
                vo.setIdproducto(rs.getInt(1));
                vo.setNombre(rs.getString(2));
                vo.setPrecio(rs.getDouble(3));
                vo.setMarca(rs.getString(4));
                vo.setDescrip(rs.getString(5));
                vo.setStock(rs.getByte(6));
                vo.setCategoria(rs.getByte(7));
                vo.setFoto(rs.getBytes(8));
                list.add(vo);*/
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                rs.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
        return list;
    }


/*Metodo agregar*/
    public void Agregar_Usuario(Usuario vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO usuario (idusuario, nombre, apellidos, dni, correo, telefono, saldo, usuario, password, foto)\n" +
"VALUES (NULL,?,?,?,?,?,?,?,?,?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getNombre());
            ps.setString(2, vo.getApellido());
            ps.setString(3, vo.getDni());
            ps.setString(4, vo.getCorreo());
            ps.setString(5, vo.getTelefono());
            ps.setInt(6, vo.getSaldo());
            ps.setString(7, vo.getUsuario());
            ps.setString(8, String.valueOf(vo.getPassword()));
            ps.setBytes(9, vo.getFoto());
            
            
            /* ps.setString(1, vo.getNombre());
            ps.setDouble(2, vo.getPrecio());
            ps.setString(3, vo.getMarca());
            ps.setString(4, vo.getDescrip());
            ps.setByte(5, vo.getStock());
            ps.setByte(6, vo.getCategoria());
            ps.setBytes(7, vo.getFoto());*/
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println("A "+ex.getMessage());
        }catch(Exception ex){
            System.out.println("B "+ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
        System.out.print("Se agregó el usuario "+vo.getNombre()+" a la base de datos. :) ");
        
    }


/*Metodo Modificar*/
    public void ModificarUsuario(ProductoVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE usuario SET nombre = ?, precio = ?, marca = ?, foto = ?\n" +
"WHERE idProducto = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getNombre());
            ps.setDouble(2, vo.getPrecio());
            ps.setString(3, vo.getMarca());
            ps.setBytes(4, vo.getFoto());
            ps.setInt(5, vo.getIdproducto());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
    }

    public void Modificar_ProductoVO2(ProductoVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE producto SET nombre = ?, precio = ?, marca = ? \n" +
"WHERE idProducto = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getNombre());
            ps.setDouble(2, vo.getPrecio());
            ps.setString(3, vo.getMarca());
            ps.setInt(4, vo.getIdproducto());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
    }

/*Metodo Eliminar*/
    public void Eliminar_ProductoVO(ProductoVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM producto WHERE idProducto = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getIdproducto());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
    }
    
    public static void main(String[] args) {
	// TODO Auto-generated method stub        
        /*ArrayList <ProductoVO> prueba = new Coordinador().ObtenerProductos();
        
        for(ProductoVO tmp : prueba){
            tmp.Describir();
        }*/
        
        
        
        String nombre= "Cosa";
        int precio= 14;
        String marca="Lacosanostra";
        File ruta=new File("C:/Users/Billy/Desktop/xd.jpg");
        
        ProductoVO vo = new ProductoVO();
        ConexionProductos dao = new ConexionProductos();
        
        vo.setNombre(nombre);
        vo.setPrecio(precio);
        vo.setMarca(marca);
        vo.setDescrip("Lo malo de ser bueno.");
        vo.setStock((byte)1);
        vo.setCategoria((byte)4);
        
        try{
            byte[] icono = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(icono);
            vo.setFoto(icono);
        }catch(Exception ex){
            vo.setFoto(null);
        }
        dao.Agregar_ProductoVO(vo);
        
        System.out.print("Terminado.");
    }


}

