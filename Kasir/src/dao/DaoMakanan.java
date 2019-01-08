/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import kasir.Koneksi;
import kasir.Makanan;
import kasir.service.ServiceMakanan;

/**
 *
 * @author bastian
 */
public class DaoMakanan implements ServiceMakanan {
    Koneksi kdb = new Koneksi();
    Connection connection = kdb.connect();
    
    @Override
    public void insertMakanan(Makanan m) throws SQLException {
        PreparedStatement st = null;
        String jenis = "Makanan";
        String sql = "INSERT INTO produk (nama_produk,harga,kode_produk,nomor_izin,jenis_produk) VALUES(?,?,?,?,?)";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, m.getNama());
            st.setString(2, Integer.toString(m.getHarga()));
            st.setString(3, m.getKodep());
            st.setString(4, Integer.toString(m.getNiema()));
            st.setString(5, jenis);
            st.executeUpdate(); 
        } catch (SQLException e) {
            System.out.println("Koneksi Gagal");
            throw e;
            
        } finally {
            if (st != null) {
                st.close();
            }
        }

    }

    @Override
    public void updateMakanan(Makanan m) throws SQLException {
        PreparedStatement st = null;
        String sql = "UPDATE produk SET nama_produk=?, harga=?, nomor_izin=? WHERE kodep=?";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, m.getNama());
            st.setString(2, Integer.toString(m.getHarga()));
            st.setString(3, Integer.toString(m.getNiema()));
            st.setString(4, m.getKodep());
            st.executeUpdate();
        } catch (SQLException e) {
            throw e;
        } finally {
            if (st != null) {
                st.close();
            }
        }

    }

    @Override
    public void deleteMakanan(Makanan m) throws SQLException {
        PreparedStatement st = null;
        String sql = "DELETE FROM produk WHERE kode_produk=?";

        try {
            st = connection.prepareCall(sql);
            st.setString(1, m.getKodep());
            st.executeUpdate();
        } catch (SQLException e) {
            throw e;
        } finally {
            if (st != null) {
                st.close();
            }
        }

    }

    @Override
    public Makanan getMakananByKodep(String kodep) throws SQLException {
        PreparedStatement st = null;
        ResultSet rs = null;
        Makanan m = null;
        String sql = "SELECT * FROM produk WHERE kode_produk=?";

        try {
            st = connection.prepareStatement(sql);
            st.setString(1, kodep);
            rs = st.executeQuery();
            while (rs.next()) {
                m = new Makanan();
                m.setKodep(rs.getString("kode_produk"));
                m.setNama(rs.getString("nama_produk"));
                m.setNiema(Integer.parseInt(rs.getString("nomor_izin")));
                m.setHarga(Integer.parseInt(rs.getString("harga")));
            }
            return m;
        } catch (SQLException e) {
            throw e;
        } finally {
            if (st != null) {
                st.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
    }

    @Override
    public ArrayList<Makanan> getMakanan() throws SQLException {
        PreparedStatement st = null;
        ArrayList<Makanan> listMakanan = new ArrayList<>();
        ResultSet rs = null;
        String sql = "SELECT * FROM produk";

        try {
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                Makanan m = new Makanan();
                m.setKodep(rs.getString("kode_produk"));
                m.setNama(rs.getString("nama_produk"));
                m.setHarga(Integer.parseInt(rs.getString("harga")));
                m.setNiema(Integer.parseInt(rs.getString("nomor_izin")));
                listMakanan.add(m);
            }
            return listMakanan;
        } catch (SQLException e) {
            throw e;
        } finally {
            if(st != null){
                st.close();
            }
            if(rs != null){
                rs.close();
            }
        }
    }
}
