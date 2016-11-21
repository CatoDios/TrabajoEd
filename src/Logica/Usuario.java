package Logica;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Usuario {
    private int idusuario;
    private String nombre;
    private String apellido;
    private String dni;
    private String correo;
    private String telefono;
    private int saldo;
    private String usuario;
    private char[] password;
    private byte[] foto;
    private Image icono;
    
    /* Métodos getters */
    public int getIdusuario() {
        return idusuario;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getDni() {
        return dni;
    }
    public String getCorreo() {
        return correo;
    }
    public String getTelefono() {
        return telefono;
    }
    public int getSaldo() {
        return saldo;
    }
    public String getUsuario() {
        return usuario;
    }
    public char[] getPassword() {
        return password;
    }    
    public byte[] getFoto() {
        return foto;
    }
    public Image getIcono() {
        return icono;
    }
    
    /*Métodos Setters*/

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public void setPassword(char[] password) {
        this.password = password;
    }
    
    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    public void setIcono(Image icono) {
        this.icono = icono;
    }
    
    
    
    
}
