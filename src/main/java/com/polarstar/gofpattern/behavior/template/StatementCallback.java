package com.polarstar.gofpattern.behavior.template;

import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by zhangxuegang on 2016/5/18.
 */
public interface StatementCallback {
    Object doInStatement(Statement stmt) throws SQLException;
}
