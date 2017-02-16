package com.zdxb.dao;

import com.zdxb.bean.Manuflow;
import com.zdxb.bean.Manuscript;
import com.zdxb.bean.Review_phase;
import com.zdxb.utils.StringSplit;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 和manuflowt表相关的操作
 */
public class ManuflowDao extends DaoBase{


    public List<Manuflow> QueryStatusflow(String zid, String db) throws ClassNotFoundException, SQLException {
        String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName="+db;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection conn = DriverManager.getConnection(url,user,password);
//        String sql="SELECT manu_id,manu_number,phase_id,title,phase_number,dis_authors,currentflow_actual_date,currentflow_submit_date " +
//                "FROM manuscript";
        //phase_id表示状态值，currentflow_actual_date更新时间，为null为currentflow_submit_date,manu_number表示文章编号
        String sql2="SELECT t1.[manu_id]\n" +
                "      ,t2.[phase_name]\n" +
                "      ,t1.[manu_number]\n" +
                "      ,t1.[phase_id]\n" +
                "      ,t3.[title]\n" +
                "      ,t3.[dis_authors]\n" +
                "      ,t1.[submit_date]\n" +
                "      ,t1.[flow_id]\n" +
                "      ,t1.[plan_date]\n" +
                "      ,t1.[actual_date]\n" +
                "  FROM [dbo].[manuflow] t1"+
                " left join [dbo].[review_phase] t2 on t1.[phase_id]=t2.[phase_id] "+
                "left join [dbo].[manuscript] t3 on t1.[manu_id]=t3.[manu_id]"+
                "WHERE 1=1";
        StringBuilder sql=new StringBuilder(sql2);
        List<Manuflow> ManuflowList = new ArrayList<>();
        String[] split = zid.split("\\+");
        if (split.length!=2){
            return ManuflowList;
        }
        zid=split[0];
        String name=split[1];
        if (zid!=null && !"".equals(zid)){
            sql.append(" and t1.[manu_number] = '"+zid+"'");
        }else {
            return ManuflowList;
        }
        if (name!=null && !"".equals(name)){
            sql.append(" and t3.[dis_authors] LIKE '%"+name+"%'");
        }else {
            return ManuflowList;
        }

        sql.append(" order by t1.[flow_id]");
        PreparedStatement preparedStatement = conn.prepareStatement(sql.toString());
        ResultSet rs = preparedStatement.executeQuery();

        StringSplit ss=new StringSplit();
        while (rs.next()){
            Manuscript mu=new Manuscript();
            Review_phase rp=new Review_phase();
            Manuflow mf=new Manuflow();

            mf.setPe(rp);
            mf.setMs(mu);
            mf.setPhase_id(rs.getString("phase_id"));
            mf.setPlan_date(ss.spli(rs.getString("plan_date")));
            mf.setActual_date(ss.spli(rs.getString("actual_date")));
            mf.setSubmit_date(ss.spli(rs.getString("submit_date")));
            mf.setFlow_id(rs.getString("flow_id"));


            mu.setTitle(rs.getString("title"));
            rp.setPhase_name(rs.getString("phase_name"));
            ManuflowList.add(mf);
        }



        rs.close();
        preparedStatement.close();
        conn.close();
        return ManuflowList;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ManuflowDao manuscriptDao = new ManuflowDao();
        manuscriptDao.QueryStatusflow("G160542W+张","Jweb_zjugxb");
        List<Manuflow> manuflowList = manuscriptDao.QueryStatusflow("G160542W","Jweb_zjugxb");
        for (Manuflow ms:manuflowList
                ) {
            System.out.println(ms);
        }
    }
}
