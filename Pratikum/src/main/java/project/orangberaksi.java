/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project;
import Modifier.orang;


public class orangberaksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        orang murid = new orang();
        //anton
        murid.setnama("anton");
        murid.setjeniskelamin("lakilaki");
        murid.setumur ("14");
        System.out.println("Nama Murid :" + murid.getnama());
        System.out.println("Jenis Kelamin Murid :" + murid.getjeniskelamin());
        System.out.println("Umur Murid :" + murid.getumur());
        
        //riko
        murid.setnama("riko");
        murid.setjeniskelamin("lakilaki");
        murid.setumur("16");
        System.out.println("Nama murid :" + murid.getnama());
        System.out.println("Jenis Kelamin Murid :" + murid.getjeniskelamin());
        System.out.println("Umur Murid :" + murid.getumur());
    }
    
}
