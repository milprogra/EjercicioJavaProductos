/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import models.Comprador;
import models.Producto;
import models.Venta;
import models.VentaDetalle;

/**
 *
 * @author mjara
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        Comprador usuario;
        ArrayList<Comprador> arrComprador = new ArrayList<Comprador>();
        Venta venta;
        ArrayList<Venta> arrVenta = new ArrayList<Venta>();
        VentaDetalle ventaDetalle;
        ArrayList<VentaDetalle> arrDetalle = new ArrayList<VentaDetalle>();
        Producto producto;
        ArrayList<Producto> arrProducto = new ArrayList<Producto>();
        int seleccion = 0;
        do {
            mensajeMenu();
            seleccion = entrada.nextInt();
            entrada.skip("\n");
            switch (seleccion) {
                case 1:
                    int subSeleccion=0;
                    do {
                        mensajeMenuComprador();
                        subSeleccion= entrada.nextInt();
                        entrada.skip("\n");
                        switch (subSeleccion) {
                            case 1:
                                for (int i = 0; i < arrComprador.size(); i++) {
                                    System.out.println(arrComprador.get(i).mostarDatos());
                                }
                            break;
                            case 2:
                                System.out.println("ingrese identificador");
                                int id = entrada.nextInt();
                                entrada.skip("\n");
                                System.out.println("ingrese nombre:");
                                String nombre = entrada.nextLine();
                                System.out.println("ingrese apellido:");
                                String apellido = entrada.nextLine();
                                System.out.println("ingrese direccion:");
                                String direccion = entrada.nextLine();
                                System.out.println("ingrese telefono:");
                                String telefono = entrada.nextLine();
                                usuario = new Comprador(id,nombre,apellido,telefono,direccion);
                                arrComprador.add(usuario);
                                System.out.println("Comprador ingresado con exito!");
                            break;
                            case 3:
                                for (int i = 0; i < arrComprador.size(); i++) {
                                    System.out.println("id-"+i+", "+arrComprador.get(i).mostarDatos());
                                }
                                System.out.println("ingrese id de comprador a eliminar");
                                int identificador = entrada.nextInt();
                                entrada.skip("\n");
                                System.out.println(arrComprador.get(identificador).mostarDatos()+"\n"
                                        + "seguro de eliminar este comprador?(si/no)");
                                String seguro = entrada.nextLine();
                                if(seguro.equals("si")){
                                    arrComprador.remove(identificador);
                                    System.out.println("comprador eliminado con exito!");
                                }else{
                                    System.out.println("Comprador no eliminado!");
                                }

                            break;
                            case 0:

                            break;
                            default:
                                System.out.println("Seleccion incorrecta!");
                            break;
                        }
                        TimeUnit.SECONDS.sleep(2);
                    } while (subSeleccion!=0);
                break;
                case 2:
                    
                break;
                case 3:

                break;
                case 0:
                    System.out.println("Adios!");
                break;
                default:
                    System.out.println("ingrese un valor correcto!");
                break;
            }
            TimeUnit.SECONDS.sleep(2);
        } while (seleccion !=0);
        
    }
    public static void mensajeMenu(){
        System.out.println(":: Menu ::\n"
                    + "1) menu comprador\n"
                    + "2) menu producto\n"
                    + "3) generar venta\n"
                    + "0) salir\n"
                    + "ingresar seleccion:");
    }
    public static void mensajeMenuComprador(){
        System.out.println(":: Menu Comprador ::\n"
                + "1) listar compradores\n"
                + "2) ingresar comprador\n"
                + "3) eliminar comprador\n"
                + "0) volver\n"
                + "ingrese seleccion:");
    }
    
}
