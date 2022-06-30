package com.newcoder.community.entity;

/**
 * @author feyfey
 * @create 2022/6/30
 * @University JiangHan Univiersity
 */
public class Page {
    private int current = 1;
    private int limit = 10;
    private int rows;
    private String path;

    public int getCurrent() {

        return current;
    }

    public void setCurrent(int current) {
        if(current>=1) {
            this.current = current;
        }
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if(limit>=1 && limit <= 100)
        {
            this.limit = limit;
        }
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if(rows>=0)
        {
            this.rows = rows;
        }

    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Page{" +
                "current=" + current +
                ", limit=" + limit +
                ", rows=" + rows +
                ", path='" + path + '\'' +
                '}';
    }
    public int getoffset()
    {
        return (current-1)*limit;
    }
    public int getTotal()
    {
        if(rows%limit == 0)
        {
            return rows/limit;
        }
        else
        {
            return rows/limit +1;
        }
    }
    public int getFrom()
    {
        if(current -2 <=1)
        {
            return 1;
        }
        else
        {
            return current-2;
        }
    }

    public int getTo()
    {
        int total = this.getTotal();
        if(current+2 >= total)
        {
            return total;
        }
        else
        {
            return current+2;
        }
    }
}
