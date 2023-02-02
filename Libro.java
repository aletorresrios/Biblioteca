/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programacion.Tema6.biblioteca;

/**
 *
 * @author Windows
 */
public class Libro {
    String titulo;
    String autor;
    int ejemplares;
    int prestados;
    
    Libro(){
        
    }

    Libro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }
    void settitulo(String titulo){
        this.titulo=titulo;
    }
    void setautor(String autor){
        this.autor=autor;
    }
    void setejemplares(int ejemplares){
        this.ejemplares=ejemplares;
    }
    void setejprestados(int prestados){
        this.prestados=prestados;
    }
    String gettitulo(){
        return this.titulo;
    }
    String getautor(){
        return this.autor;
    }
    int getejemplares(){
        return this.ejemplares;
    }
    int getprestados(){
        return this.prestados;
    }
    boolean prestamo(){
        boolean res;
        if(this.ejemplares>0){
            res=true;
            this.ejemplares--;
            this.prestados++;
        }else{
            res=false;
        }return res;
    }
    boolean devolucion(){
        boolean res;
        if(this.prestados>0){
            res=true;
            this.prestados--;
            this.ejemplares++;
        }else{
            res=false;
        }return res;
    }
    @Override
    public String toString(){
        return "El libro "+this.titulo+" del autor "+this.autor+" tiene "+this.ejemplares+" ejemplares y "+this.prestados+" libros en prestamos";
    }
    
}
