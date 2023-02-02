/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programacion.Tema6.biblioteca;

/**
 *
 * @author Windows
 */
public class TestLibro {
    public static void main(String[] args) {
        Libro l1=new Libro();
        l1.settitulo("Don quijote");
        l1.setautor("Cervantes");
        l1.setejemplares(7);
        l1.setejprestados(3);
        System.out.println(l1.toString());
    }
}
