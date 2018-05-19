/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odissey;

/**
 *
 * @author maesly
 */
public class Usuarios {
    private String nombre;
    private String nombreUsuario;
    private String apellido;
    private String edad;
    private String contraseña;
    private String amigos;
    private String generos;
    
    public Usuarios(String nombre,String nombreUsuario,String apellido,
                    String edad,String contraseña,String amigos,String generos){
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.apellido = apellido;
        this.edad = edad;
        this.contraseña = contraseña;
        this.amigos = amigos;
        this.generos = generos;
    }
    
    
    public void imprimirUsuario(){
        for (int i = 0; i < 7; i++) {
            System.out.println(nombre +" "+apellido + " " + edad + " " + nombreUsuario 
                                 + " "+ contraseña + " "+ amigos + " " + generos);
            
        }
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setNombreUsuario(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public void setEdad(String edad){
        this.edad = edad;
    }
    
    public void setContraseña(String contraseña){
        this.contraseña = contraseña;
    }
    
    public void setAmigos(String amigos){
        this.amigos = amigos;
    }
    
    public void setGeneros(String generos){
        this.generos = generos;
    }
    
    public String getNombre(){
    return nombre;}
    
    public String getNombreUsuario(){
    return nombreUsuario;}
    
    public String getApellido(){
    return apellido;}
    
    public String getEdad(){
    return edad;}
    
    public String getContraseña(){
    return contraseña;}
    
    public String getAmigos(){
    return amigos;}
    
    public String getGeneros(){
    return generos;}
    
    
    
}
