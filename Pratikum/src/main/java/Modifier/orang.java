/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modifier;

/**
 *
 * @author USER
 */
public class orang {
    
    public String nama;
    public String jeniskelamin;
    public String umur;
    //setter
    public void setnama(String nama){
        this.nama = nama;
    }
    
    public void setjeniskelamin(String jeniskelamin){
        this.jeniskelamin = jeniskelamin;
    }
    
    public void setumur (String umur){
        this.umur = umur;
    }
    
    //getter
    public String getnama(){
        return this.nama;
    }
    public String getjeniskelamin(){
        return this.jeniskelamin;
    }
    public String getumur(){
        return this.umur;
    }
}
