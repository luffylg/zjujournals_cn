package com.zdxb.Service;

import com.zdxb.bean.Manuflow;
import com.zdxb.bean.Manuscript;
import com.zdxb.dao.ManuflowDao;
import com.zdxb.dao.ManuscriptDao;

import java.sql.SQLException;
import java.util.List;

/**
 * 数据表相关的业务功能
 */
public class TableService {
    public String ManuscriptQueryStatus(String zid , String kanming) throws SQLException, ClassNotFoundException {
        ManuscriptDao md=new ManuscriptDao();
        String db=null;
        if ("gxb".equals(kanming)){
            db="Jweb_zjugxb";
        }else if ("skb".equals(kanming)) {
            db = "Jweb_zjuskb";
        }else if ("yxb".equals(kanming)){
            db="Jweb_zjuyxb";
        }else if ("gcsj".equals(kanming)){
            db="Jweb_zjugcsjxb";
        }else if ("lxb".equals(kanming)){
            db = "journalx_zjulxb";
        }else if ("nxb".equals(kanming)){
            db="Jweb_zjunxb";
        }
        if (db==null){
            return "databaseerror";
        }
        List<Manuscript> list=md.QueryStatuslistOne(zid,db);
        if (list.size()>0) {

            return list.get(0).toString();
            //返回json格式的数据
        }
        return "meizhi";
    }

    public String ManuflowQueryStatus(String zid , String kanming) throws SQLException, ClassNotFoundException {
        ManuflowDao mf= new ManuflowDao();
        String db=null;
        if ("gxb".equals(kanming)){
            db="Jweb_zjugxb";
        }else if ("skb".equals(kanming)) {
            db = "Jweb_zjuskb";
        }else if ("yxb".equals(kanming)){
            db="Jweb_zjuyxb";
        }else if ("gcsj".equals(kanming)){
            db="journalx_zjugcsjxb";
        }else if ("lxb".equals(kanming)){
            db="journalx_zjulxb";
        }else if ("nxb".equals(kanming)){
            db="jweb_zjunxb";
        }
        if (db==null){
            return "databaseerror";
        }
        List<Manuflow> list=mf.QueryStatusflow(zid,db);
        String json="{"+'\"'+"manuflows"+'\"'+":[";
        if (list.size()>0) {
            for (int i=0;i<list.size();i++){

                json=json+list.get(i).toString();
                if (i!=list.size()-1){
                    json+=", ";
                }
            }
            return json+"]}";
            //返回json格式的数据
        }
        return "meizhi";
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        TableService ts=new TableService();
        String data=ts.ManuflowQueryStatus("2016-123","gcsj");
        System.out.println(data);
    }

}
