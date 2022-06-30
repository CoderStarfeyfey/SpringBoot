package com.newcoder.community.service;

import com.newcoder.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author feyfey
 * @create 2022/6/29
 * @University JiangHan Univiersity
 */
@Service
public class AlphaService {
    @Autowired
    private AlphaDao dao;
    public String find()
    {
        return dao.select();
    }
}
