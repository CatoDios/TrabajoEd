package Logica;

import java.awt.Image;
import javax.swing.ImageIcon;

public class ProductoVO {

/*Todo los atributos*/
    private int idproducto; // 
    private byte stock;
    private String descrip;   
    private String nombre;
    private byte categoria;
    private int precio;
    private String marca;
    private Image img;
    private byte[] foto;
    

    public byte getCategoria() {
        return categoria;
    }

    public void setCategoria(byte categoria) {
        this.categoria = categoria;
    }


public ProductoVO(){}

/*Todo los codigos get*/
     public byte getStock() {
        return stock;
    }     
     public String getDescrip() {
        return descrip;
    }    
    public int getIdproducto(){
        return idproducto;
    }
    public String getNombre(){
        return nombre;
    }
    public int getPrecio(){
        return precio;
    }
    public String getMarca(){
        return marca;
    }


/*Todo los codigos set*/   
    public void setStock(byte stock) {
        this.stock = stock;
    }   
    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
    public void setIdproducto(int idproducto){
        this.idproducto = idproducto;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    /**
     * @return the foto
     */
    public byte[] getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }
    
    public void Describir(){
        System.out.println(getIdproducto()+" Producto: "+getNombre()+" Precio: "+getPrecio()+" Stock: "+this.getStock()+""
                + " Marca: "+getMarca()+" \nDescripción: "+getDescrip());
    }

}
