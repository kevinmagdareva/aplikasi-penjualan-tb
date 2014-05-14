package net.smktarunabhakti.penjualan.service;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;

import net.smktarunabhakti.penjualan.domain.Barang;

public interface AppService {
	void simpanBarang(Barang b);
	
	void hapusBarang(Barang b);
	
	Page<Barang> cariSemuaBarang(Pageable p);
	Barang cariBarangById(String id);
	
	Long countSemuaBarang();
}
