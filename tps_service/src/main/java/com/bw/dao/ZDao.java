package com.bw.dao;

import com.bw.bean.Zy;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ZDao {


        @Select("select w.*,z.zname from t_w w ,t_z z where  w.zid=z.zid")
      public  List<Zy> selectAll();


        @Insert("insert into t_w(wid,wname,wcreated,xc,gh,name,tel,pic,bz,zid)" +
                "values(#{wid},#{wname},#{wcreated},#{xc},#{gh},#{name},#{tel},#{pic},#{bz},#{zid})")
        int insert(Zy z);

        @Update("update t_w set wname=#{wname},wcreated=#{wcreated},xc=#{xc},gh=#{gh},name=#{name},tel=#{tel},pic=#{pic}," +
                "bz=#{bz},zid=#{zid} where wid=#{wid}")
        int update(Zy z);

        @Delete("delete from t_w where id in(${ids})")
        int del(String  ids);
}
