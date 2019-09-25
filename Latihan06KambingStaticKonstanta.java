/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan06.kambingstatic.konstanta;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

/**
 *
 * @author Lenovo
 * Nama : Tassyakur Pasya
 * Kelas : IF-01
 * NIM : 10118009
 * Matkul : PBO-01
 * Deskripsi Program : Static dan Konstanta
 */

public class Latihan06KambingStaticKonstanta {
    // Nama_kambing sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + "Memiliki kambing sebanyak " + Mamalia.jumlahKambing );
    }
    
}
