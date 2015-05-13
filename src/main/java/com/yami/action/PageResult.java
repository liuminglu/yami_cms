package com.yami.action;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2015/4/10.
 */
public class PageResult<T> implements Serializable{
    private long total;
    private List<T> rows;
    public PageResult(List rows,long total){
        this.rows = rows;
        this.total = total;
    }
    public PageResult(){}

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
