package com.gaohuan.pattern.tmp;

/**
 * <p>User: acer
 * <p>Date: 2016/7/27
 * <p>Version: 1.0
 */
public interface MyJdbcOperations {

    <T> T execute(MyStatementCallback<T> callback);
}
