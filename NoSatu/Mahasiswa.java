/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S10;

/**
 *
 * @author Restu
 */
public class Mahasiswa<mahanim, mahaname, mahakelas> {
    private mahanim nim;
    private mahaname name;
    private mahakelas kelas;
    
    public void setNim(mahanim nim) {
        this.nim = nim;
    }
    
    public mahanim getNim() {
        return nim;
    }
    
    public void setName(mahaname name) {
        this.name = name;
    }
    
    public mahaname getName() {
        return name;
    }
    
    public void setClass(mahakelas kelas) {
        this.kelas = kelas;
    }
    
    public mahakelas getKelas() {
        return kelas;
    }
}
