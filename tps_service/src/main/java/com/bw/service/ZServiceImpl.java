package com.bw.service;

import com.bw.bean.Zy;
import com.bw.dao.ZDao;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZServiceImpl implements  ZService{

    @Autowired
    private ZDao zDao;


    @Override
    public PageInfo<Zy> selectAll(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Zy> list = zDao.selectAll();
        return new PageInfo<>(list);
    }

    @Override
    public boolean save(Zy z) {
        if(z.getWid()!=null){
            return  zDao.update(z)>0;
        }
        return zDao.insert(z)>0;
    }



    @Override
    public boolean del(String ids) {
        return zDao.del(ids)>0;
    }


}
