package com.vandung.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="CHITIETSANPHAM")
public class ChiTietSanPham {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="machitietsanpham", nullable=false)
	int machitietsanpham;
	
	@Column(name="soluong")
	int soluong;
	
	@Column(name="ngaynhap")
	String ngaynhap;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="masanpham")
	SanPham sanpham;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="masize")
	SizeSanPham sizesanpham;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="mamau")
	MauSanPham mausanpham;

	public int getMachitietsanpham() {
		return machitietsanpham;
	}

	public void setMachitietsanpham(int machitietsanpham) {
		this.machitietsanpham = machitietsanpham;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public String getNgaynhap() {
		return ngaynhap;
	}

	public void setNgaynhap(String ngaynhap) {
		this.ngaynhap = ngaynhap;
	}

	public SanPham getSanpham() {
		return sanpham;
	}

	public void setSanpham(SanPham sanpham) {
		this.sanpham = sanpham;
	}

	public SizeSanPham getSizesanpham() {
		return sizesanpham;
	}

	public void setSizesanpham(SizeSanPham sizesanpham) {
		this.sizesanpham = sizesanpham;
	}

	public MauSanPham getMausanpham() {
		return mausanpham;
	}

	public void setMausanpham(MauSanPham mausanpham) {
		this.mausanpham = mausanpham;
	}
	
}
