package wt.may31.pkg;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class ReportDAO 
{
	public void generateReport() {
        try (Connection con = DBConnection.getConnection()) {
            CallableStatement cs = con.prepareCall("{CALL generate_library_report()}");

            boolean hasResult = cs.execute();

            while (hasResult) {
                ResultSet rs = cs.getResultSet();
                while (rs.next()) {
                    System.out.println(
                        rs.getMetaData().getColumnLabel(1) + ": " +
                        rs.getString(1)
                    );
                }
                hasResult = cs.getMoreResults();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
