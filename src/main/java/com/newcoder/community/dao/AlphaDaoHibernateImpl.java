package com.newcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @author feyfey
 * @create 2022/6/29
 * @University JiangHan Univiersity
 */
@Repository
public class AlphaDaoHibernateImpl implements AlphaDao{
    @Override
    public String select() {
        return "Hello";
    }
}
