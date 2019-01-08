/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir.service;

import java.sql.SQLException;
import java.util.ArrayList;
import kasir.Minuman;

/**
 *
 * @author bastian
 */
public interface ServiceMinuman {
    public void insertMinuman(Minuman m) throws SQLException;
    public void updateMinuman(Minuman m) throws SQLException;
    public void deleteMinuman(Minuman m) throws SQLException;
    public Minuman getMinumanByKodep(String kodep) throws SQLException;
    public ArrayList<Minuman> getMinuman() throws SQLException;
}
