package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StoredPostTestSuite {

    @Test
    public void testUpdateBestsellers() throws SQLException {
        //Given
        //UpdateBestsellers()
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE BOOKS SET BESTSELLER=\"false\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        //When
        String sqlProcedureCall = "CALL UpdateBestsellers(11)";
        statement.execute(sqlProcedureCall);
        //Then
        String sqlCheckTable = "SELECT TITLE FROM BOOKS WHERE BESTSELLER=\"true\"";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        String result = "";
        if (rs.next()) {
            result = rs.getString("TITLE");
        }
        Assert.assertEquals("Man's Fate", result);
    }
}