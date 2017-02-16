package com.zdxb.dao;

import com.zdxb.bean.Manuscript;
import com.zdxb.bean.Review_phase;
import com.zdxb.utils.StringSplit;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 和manuscript表相关的操作
 */
<<<<<<< HEAD
public class ManuscriptDao extends DaoBase{
=======
public class ManuscriptDao{

    private static final String user = "";
    private static final String password = "";
>>>>>>> fd12207ea0887ea59a701c16854e149023aa177f

    public List<Manuscript> QueryStatuslistOne(String zid,String db) throws ClassNotFoundException, SQLException {
        String url = "jdbc:sqlserver://10.23.91.253:1433;databaseName="+db;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection conn = DriverManager.getConnection(url,user,password);
//        String sql="SELECT manu_id,manu_number,phase_id,title,phase_number,dis_authors,currentflow_actual_date,currentflow_submit_date " +
//                "FROM manuscript";
        //phase_id表示状态值，currentflow_actual_date更新时间，为null为currentflow_submit_date,manu_number表示文章编号
        String sql2="SELECT t1.[manu_id]\n" +
                "      ,t2.[phase_name]\n" +
                "      ,t1.[mag_id]\n" +
                "      ,t1.[manu_number]\n" +
                "      ,t1.[phase_id]\n" +
                "      ,t1.[title]\n" +
                "      ,t1.[etitle]\n" +
                "      ,t1.[create_type_id]\n" +
                "      ,t1.[create_date]\n" +
                "      ,t1.[submit_date]\n" +
                "      ,t1.[receive_date]\n" +
                "      ,t1.[issue_date]\n" +
                "      ,t1.[characters]\n" +
                "      ,t1.[pages]\n" +
                "      ,t1.[spec_id]\n" +
                "      ,t1.[sub_id]\n" +
                "      ,t1.[fund_id]\n" +
                "      ,t1.[manu_type_id]\n" +
                "      ,t1.[is_have_letter]\n" +
                "      ,t1.[editor_key]\n" +
                "      ,t1.[booker_key]\n" +
                "      ,t1.[lines]\n" +
                "      ,t1.[pictures]\n" +
                "      ,t1.[pic_characters]\n" +
                "      ,t1.[plan_column]\n" +
                "      ,t1.[doi]\n" +
                "      ,t1.[book_class_number]\n" +
                "      ,t1.[literature_code]\n" +
                "      ,t1.[phase_number]\n" +
                "      ,t1.[review_charge_mode]\n" +
                "      ,t1.[committeeman]\n" +
                "      ,t1.[article_number]\n" +
                "      ,t1.[source]\n" +
                "      ,t1.[recommender]\n" +
                "      ,t1.[summary]\n" +
                "      ,t1.[esummary]\n" +
                "      ,t1.[remark]\n" +
                "      ,t1.[keywords]\n" +
                "      ,t1.[ekeywords]\n" +
                "      ,t1.[subject_words]\n" +
                "      ,t1.[dis_authors]\n" +
                "      ,t1.[author_ids]\n" +
                "      ,t1.[first_author_key]\n" +
                "      ,t1.[comm_author_key]\n" +
                "      ,t1.[flow_file_type]\n" +
                "      ,t1.[flow_file_path]\n" +
                "      ,t1.[status]\n" +
                "      ,t1.[phase_status]\n" +
                "      ,t1.[quality_factor]\n" +
                "      ,t1.[ch_en]\n" +
                "      ,t1.[pacs]\n" +
                "      ,t1.[contributor]\n" +
                "      ,t1.[support_info]\n" +
                "      ,t1.[fund_all_name]\n" +
                "      ,t1.[fund_all_level]\n" +
                "      ,t1.[leave_word]\n" +
                "      ,t1.[accept_review_status]\n" +
                "      ,t1.[review_status]\n" +
                "      ,t1.[urge_mail_status]\n" +
                "      ,t1.[handle_fee_key]\n" +
                "      ,t1.[layout_fee_key]\n" +
                "      ,t1.[Label]\n" +
                "      ,t1.[pictures_b_w]\n" +
                "      ,t1.[del]\n" +
                "      ,t1.[country_first]\n" +
                "      ,t1.[country_second]\n" +
                "      ,t1.[country_third]\n" +
                "      ,t1.[GAOJIANLC]\n" +
                "      ,t1.[CHUANGZUOLX]\n" +
                "      ,t1.[ZHUANYELX]\n" +
                "      ,t1.[XUEKELX]\n" +
                "      ,t1.[GAOJIANLX]\n" +
                "      ,t1.[ZERENBJ]\n" +
                "      ,t1.[DENGJIREN]\n" +
                "      ,t1.[JIESHAOXIN]\n" +
                "      ,t1.[JiHuaLM]\n" +
                "      ,t1.[manu_references]\n" +
                "      ,t1.[author_introduction]\n" +
                "      ,t1.[author_introduction_en]\n" +
                "      ,t1.[dis_authorenames]\n" +
                "      ,t1.[transfer_manu]\n" +
                "      ,t1.[author_hope_issuedate]\n" +
                "      ,t1.[editor_decide_issuedate]\n" +
                "      ,t1.[Is_archive]\n" +
                "      ,t1.[manu_level]\n" +
                "      ,t1.[transfer_magzin]\n" +
                "      ,t1.[transfer_number]\n" +
                "      ,t1.[transfer_date]\n" +
                "      ,t1.[dis_authorcompanys]\n" +
                "      ,t1.[flow_id]\n" +
                "      ,t1.[currentflow_submit_date]\n" +
                "      ,t1.[currentflow_plan_date]\n" +
                "      ,t1.[currentflow_actual_date]\n" +
                "      ,t1.[retypsetting_fx]\n" +
                "      ,t1.[typeSetting_finish]\n" +
                "      ,t1.[currentflow_handler_name]\n" +
                "      ,t1.[tgcthave]\n" +
                "      ,t1.[person_need_change_remark]\n" +
                "      ,t1.[manuscript_xml_id]\n" +
                "      ,t1.[tgct_manuid]\n" +
                "      ,t1.[conclusion_id]\n" +
                "      ,t1.[conclusion_hint]\n" +
                "      ,t1.[currentflow_submitter_name]\n" +
                "      ,t1.[year_m]\n" +
                "      ,t1.[issue_m]\n" +
                "      ,t1.[planColumn]\n" +
                "      ,t1.[ecta]\n" +
                "      ,t1.[file_status]\n" +
                "  FROM [dbo].[manuscript] t1 left join [dbo].[review_phase] t2 on t1.[phase_id]=t2.[phase_id] WHERE 1=1";
        StringBuilder sql=new StringBuilder(sql2);
        if (zid!=null && !"".equals(zid)){
            sql.append(" and manu_number = '"+zid+"'");
        }
        PreparedStatement preparedStatement = conn.prepareStatement(sql.toString());
        List<Manuscript> ManuscriptList = new ArrayList<>();
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()){
            Manuscript mu=new Manuscript();
            Review_phase rp=new Review_phase();

            mu.setCurrentflow_submit_date(rs.getString("currentflow_submit_date"));
            mu.setCurrentflow_actual_date(rs.getString("currentflow_actual_date"));
            mu.setDis_authors(rs.getString("dis_authors"));
            mu.setManu_id(rs.getString("manu_id"));
            mu.setManu_number(rs.getString("manu_number"));
            mu.setPhase_id(rs.getString("phase_id"));
            mu.setTitle(rs.getString("title"));

            rp.setPhase_name(rs.getString("phase_name"));
            mu.setPe(rp);
            ManuscriptList.add(mu);
        }



        rs.close();
        preparedStatement.close();
        conn.close();
        return ManuscriptList;
    }

    public List<Manuscript> QueryStatuslistFive() throws ClassNotFoundException, SQLException {
        String db="Jweb_zjuyxb";
        String url = "jdbc:sqlserver://10.23.91.253:1433;databaseName="+db;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection conn = DriverManager.getConnection(url,user,password);
//        String sql="SELECT manu_id,manu_number,phase_id,title,phase_number,dis_authors,currentflow_actual_date,currentflow_submit_date " +
//                "FROM manuscript";
        //phase_id表示状态值，currentflow_actual_date更新时间，为null为currentflow_submit_date,manu_number表示文章编号
        String sql2="SELECT TOP 5 t1.[manu_id]\n" +
                "      ,t2.[phase_name]\n" +
                "      ,t1.[mag_id]\n" +
                "      ,t1.[manu_number]\n" +
                "      ,t1.[phase_id]\n" +
                "      ,t1.[title]\n" +
                "      ,t1.[etitle]\n" +
                "      ,t1.[create_type_id]\n" +
                "      ,t1.[create_date]\n" +
                "      ,t1.[submit_date]\n" +
                "      ,t1.[receive_date]\n" +
                "      ,t1.[issue_date]\n" +
                "      ,t1.[characters]\n" +
                "      ,t1.[pages]\n" +
                "      ,t1.[spec_id]\n" +
                "      ,t1.[sub_id]\n" +
                "      ,t1.[fund_id]\n" +
                "      ,t1.[manu_type_id]\n" +
                "      ,t1.[is_have_letter]\n" +
                "      ,t1.[editor_key]\n" +
                "      ,t1.[booker_key]\n" +
                "      ,t1.[lines]\n" +
                "      ,t1.[pictures]\n" +
                "      ,t1.[pic_characters]\n" +
                "      ,t1.[plan_column]\n" +
                "      ,t1.[doi]\n" +
                "      ,t1.[book_class_number]\n" +
                "      ,t1.[literature_code]\n" +
                "      ,t1.[phase_number]\n" +
                "      ,t1.[review_charge_mode]\n" +
                "      ,t1.[committeeman]\n" +
                "      ,t1.[article_number]\n" +
                "      ,t1.[source]\n" +
                "      ,t1.[recommender]\n" +
                "      ,t1.[summary]\n" +
                "      ,t1.[esummary]\n" +
                "      ,t1.[remark]\n" +
                "      ,t1.[keywords]\n" +
                "      ,t1.[ekeywords]\n" +
                "      ,t1.[subject_words]\n" +
                "      ,t1.[dis_authors]\n" +
                "      ,t1.[author_ids]\n" +
                "      ,t1.[first_author_key]\n" +
                "      ,t1.[comm_author_key]\n" +
                "      ,t1.[flow_file_type]\n" +
                "      ,t1.[flow_file_path]\n" +
                "      ,t1.[status]\n" +
                "      ,t1.[phase_status]\n" +
                "      ,t1.[quality_factor]\n" +
                "      ,t1.[ch_en]\n" +
                "      ,t1.[pacs]\n" +
                "      ,t1.[contributor]\n" +
                "      ,t1.[support_info]\n" +
                "      ,t1.[fund_all_name]\n" +
                "      ,t1.[fund_all_level]\n" +
                "      ,t1.[leave_word]\n" +
                "      ,t1.[accept_review_status]\n" +
                "      ,t1.[review_status]\n" +
                "      ,t1.[urge_mail_status]\n" +
                "      ,t1.[handle_fee_key]\n" +
                "      ,t1.[layout_fee_key]\n" +
                "      ,t1.[Label]\n" +
                "      ,t1.[pictures_b_w]\n" +
                "      ,t1.[del]\n" +
                "      ,t1.[country_first]\n" +
                "      ,t1.[country_second]\n" +
                "      ,t1.[country_third]\n" +
                "      ,t1.[GAOJIANLC]\n" +
                "      ,t1.[CHUANGZUOLX]\n" +
                "      ,t1.[ZHUANYELX]\n" +
                "      ,t1.[XUEKELX]\n" +
                "      ,t1.[GAOJIANLX]\n" +
                "      ,t1.[ZERENBJ]\n" +
                "      ,t1.[DENGJIREN]\n" +
                "      ,t1.[JIESHAOXIN]\n" +
                "      ,t1.[JiHuaLM]\n" +
                "      ,t1.[manu_references]\n" +
                "      ,t1.[author_introduction]\n" +
                "      ,t1.[author_introduction_en]\n" +
                "      ,t1.[dis_authorenames]\n" +
                "      ,t1.[transfer_manu]\n" +
                "      ,t1.[author_hope_issuedate]\n" +
                "      ,t1.[editor_decide_issuedate]\n" +
                "      ,t1.[Is_archive]\n" +
                "      ,t1.[manu_level]\n" +
                "      ,t1.[transfer_magzin]\n" +
                "      ,t1.[transfer_number]\n" +
                "      ,t1.[transfer_date]\n" +
                "      ,t1.[dis_authorcompanys]\n" +
                "      ,t1.[flow_id]\n" +
                "      ,t1.[currentflow_submit_date]\n" +
                "      ,t1.[currentflow_plan_date]\n" +
                "      ,t1.[currentflow_actual_date]\n" +
                "      ,t1.[retypsetting_fx]\n" +
                "      ,t1.[typeSetting_finish]\n" +
                "      ,t1.[currentflow_handler_name]\n" +
                "      ,t1.[tgcthave]\n" +
                "      ,t1.[person_need_change_remark]\n" +
                "      ,t1.[manuscript_xml_id]\n" +
                "      ,t1.[tgct_manuid]\n" +
                "      ,t1.[conclusion_id]\n" +
                "      ,t1.[conclusion_hint]\n" +
                "      ,t1.[currentflow_submitter_name]\n" +
                "      ,t1.[year_m]\n" +
                "      ,t1.[issue_m]\n" +
                "      ,t1.[planColumn]\n" +
                "      ,t1.[ecta]\n" +
                "      ,t1.[file_status]\n" +
                "  FROM [dbo].[manuscript] t1 left join [dbo].[review_phase] t2 on t1.[phase_id]=t2.[phase_id] WHERE 1=1";

        PreparedStatement preparedStatement = conn.prepareStatement(sql2);
        List<Manuscript> ManuscriptList = new ArrayList<>();
        ResultSet rs = preparedStatement.executeQuery();
        StringSplit ss=new StringSplit();
        while (rs.next()){
            Manuscript mu=new Manuscript();
            Review_phase rp=new Review_phase();

            mu.setCurrentflow_submit_date(ss.spli(rs.getString("currentflow_submit_date")));
            mu.setCurrentflow_actual_date(ss.spli(rs.getString("currentflow_actual_date")));
            mu.setDis_authors(rs.getString("dis_authors"));
            mu.setManu_id(rs.getString("manu_id"));
            mu.setManu_number(rs.getString("manu_number"));
            mu.setPhase_id(rs.getString("phase_id"));
            mu.setTitle(rs.getString("title"));
            mu.setPe(rp);
            rp.setPhase_name(rs.getString("phase_name"));

            ManuscriptList.add(mu);
        }




        rs.close();
        preparedStatement.close();
        conn.close();
        return ManuscriptList;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ManuscriptDao manuscriptDao = new ManuscriptDao();
        manuscriptDao.QueryStatuslistOne("20110005","Jweb_zjuyxb");
        List<Manuscript> ManuscriptList = manuscriptDao.QueryStatuslistFive();
        for (Manuscript ms:ManuscriptList
                ) {
            System.out.println(ms);
        }
    }


}
