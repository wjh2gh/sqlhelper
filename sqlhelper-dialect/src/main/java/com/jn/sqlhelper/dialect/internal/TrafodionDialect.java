package com.jn.sqlhelper.dialect.internal;

import com.jn.sqlhelper.dialect.internal.limit.FirstLimitHandler;

/**
 * http://trafodion.apache.org/docs/sql_reference/index.html#select_syntax
 */
public class TrafodionDialect extends AbstractDialect {
    public TrafodionDialect() {
        super();
        setLimitHandler(new FirstLimitHandler());
    }

    @Override
    public boolean isSupportsLimitOffset() {
        return false;
    }

    @Override
    public boolean isSupportsLimit() {
        return true;
    }
}
