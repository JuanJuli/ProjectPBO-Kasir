/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir.service;

import java.sql.SQLException;
import java.util.ArrayList;
import kasir.Makanan;

/**
 *
 * @author bastian  
 */
public interface ServiceMakanan {
    public void insertMakanan(Makanan m) throws SQLException;
    public void updateMakanan(Makanan m) throws SQLException;
    public void deleteMakanan(Makanan m) throws SQLException;
    public Makanan getMakananByKodep(String nim) throws SQLException;
    public ArrayList<Makanan> getMakanan() throws SQLException;
}
