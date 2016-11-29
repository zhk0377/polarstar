package com.polarstar.gofpattern.behavior.template;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangxuegang on 2016/5/18.
 */
public class JdbcTemplate {
    //template method
//    public final Object execute(String sql) throws SQLException {

    // 带回调功能
    private final Object execute(StatementCallback action) throws SQLException {

        Connection con = HsqldbUtil.getConnection();
        Statement stmt = null;
        try

        {

            stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery(sql);
//            Object result = doInStatement(rs);//abstract method
            // 带回调功能
            Object result = action.doInStatement(stmt);//abstract method
            return result;
        } catch (
                SQLException ex
                )

        {
            ex.printStackTrace();
            throw ex;
        } finally

        {

            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (!con.isClosed()) {
                    try {
                        con.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }


    public Object query(StatementCallback stmt) throws SQLException{
        return execute(stmt);
    }

    //implements in subclass
//    protected abstract Object doInStatement(ResultSet rs);

    //内部类方式
    public Object query(final String sql) throws SQLException {
        class QueryStatementCallback implements StatementCallback {

            public Object doInStatement(Statement stmt) throws SQLException {
                ResultSet rs = stmt.executeQuery(sql);
                List<User> userList = new ArrayList<User>();

                User user = null;
                while (rs.next()) {

                    user = new User();
                    user.setId(rs.getInt("id"));
                    user.setUserName(rs.getString("user_name"));
                    user.setBirth(rs.getDate("birth"));
                    user.setCreateDate(rs.getDate("create_date"));
                    userList.add(user);
                }
                return userList;

            }

        }

        JdbcTemplate jt = new JdbcTemplate();
        return jt.query(new QueryStatementCallback());
    }



}
