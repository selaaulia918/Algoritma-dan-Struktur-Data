/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programbarang;

/**
 *
 * @author Asus
 */
public class Barang {
    static String nama;
	static int hargaSatuan;
	static int jumlah;
	static int diskon;

	public static int hitungHargaTotal(){
		return hargaSatuan * jumlah;
	}

	public static int hitungDiskon(){
		if (hitungHargaTotal() > 100000) {
			return (hitungHargaTotal() * 10)/100;	
		}else if (hitungHargaTotal() < 50000) {
			return 0;
		}else{
			return (hitungHargaTotal() * 5)/100;
		}
	}

	public static int hitungHargaBayar(){
		return hitungHargaTotal() - hitungDiskon();
	}
}
