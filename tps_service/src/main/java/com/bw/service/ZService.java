package com.bw.service;

import com.bw.bean.Zy;
import com.github.pagehelper.PageInfo;

public interface ZService {


    PageInfo<Zy> selectAll(Integer pageNo,Integer pageSize);


    boolean save(Zy z);

    boolean del(String ids);


}
