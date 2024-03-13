package com.haianh123bg.shopbook.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
@Table(name = "sach")
public class Sach {
    @Id
    @Column(name = "ma_sach")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maSach;

    @Column(name = "ten_sach", length = 256)
    private String tenSach;

    @Column(name = "ten_gia_gia", length = 512)
    private String tenTacGia;

    @Column(name = "isbn", length = 256)
    private String ISBN;

    @Column(name = "mo_ta", columnDefinition = "text")
    private String moTa;

    @Column(name = "gia_niem_yet")
    private double giaNiemYet;

    @Column(name = "gia_ban")
    private double giaBan;

    @Column(name = "so_luong")
    private int soLuong;

    @Column(name = "trung_binh_xep_hang")
    private double trungBinhXepHang;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    @JoinTable(
            name = "sach_theloai",
            joinColumns = @JoinColumn(name = "ma_sach"),
            inverseJoinColumns = @JoinColumn(name = "ma_the_loai")
    )
    List<TheLoai> danhSachTheLoai;

    @OneToMany(mappedBy = "sach", fetch = FetchType.LAZY, cascade = {
            CascadeType.ALL
    })
    List<HinhAnh> danhSachHinhAnh;

    @OneToMany(mappedBy = "sach", fetch = FetchType.LAZY, cascade = {
            CascadeType.ALL
    })
    List<SuDanhGia> danhSachSuDanhGia;

    @OneToMany(mappedBy = "sach", fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    List<ChiTietDonHang> danhSachChiTietDonHang;

    @OneToMany(mappedBy = "sach", fetch = FetchType.LAZY, cascade = {
            CascadeType.ALL
    })
    List<SachYeuThich> danhSachSachYeuThich;



}



















