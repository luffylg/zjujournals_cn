package com.zdxb.bean;

/**
 * Manuscript对应的实体类
 */
public class Manuscript {
    //manu_id表示主键，phase_id表示状态值，currentflow_actual_date更新时间，为null为currentflow_submit_date
    private String manu_id;
    private String manu_number;
    private String phase_id,title,phase_number,dis_authors,currentflow_actual_date,currentflow_submit_date;

    private Review_phase pe;
    public Review_phase getPe() {
        return pe;
    }

    public void setPe(Review_phase pe) {
        this.pe = pe;
    }



    public String getManu_id() {
        return manu_id;
    }

    public void setManu_id(String manu_id) {
        this.manu_id = manu_id;
    }

    public String getManu_number() {
        return manu_number;
    }

    public void setManu_number(String manu_number) {
        this.manu_number = manu_number;
    }

    public String getPhase_id() {
        return phase_id;
    }

    public void setPhase_id(String phase_id) {
        this.phase_id = phase_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhase_number() {
        return phase_number;
    }

    public void setPhase_number(String phase_number) {
        this.phase_number = phase_number;
    }

    public String getDis_authors() {
        return dis_authors;
    }

    public void setDis_authors(String dis_authors) {
        this.dis_authors = dis_authors;
    }

    public String getCurrentflow_actual_date() {
        return currentflow_actual_date;
    }

    public void setCurrentflow_actual_date(String currentflow_actual_date) {
        this.currentflow_actual_date = currentflow_actual_date;
    }

    public String getCurrentflow_submit_date() {
        return currentflow_submit_date;
    }

    public void setCurrentflow_submit_date(String currentflow_submit_date) {
        this.currentflow_submit_date = currentflow_submit_date;
    }

    @Override
    public String toString() {
        return "{" +
                '\"' +"manu_id"+'\"' +":" + '\"' +manu_id +'\"' +
                ","+'\"' +"manu_number"+'\"' +":" +'\"' +manu_number + '\"' +
                ", "+'\"' +"phase_id" + '\"' +":"+'\"'+phase_id + '\"' +
                ", "+'\"' +"title" + '\"'+":" +'\"'+title + '\"' +
                ", "+'\"' +"phase_number" + '\"'+":" +'\"'+phase_number+ '\"' +
                ", "+'\"' +"dis_authors" + '\"'+":" +'\"'+dis_authors + '\"' +
                ", "+'\"' +"currentflow_actual_date" + '\"'+":"+'\"' +currentflow_actual_date + '\"' +
                ", "+'\"' +"currentflow_submit_date" + '\"'+":" +'\"'+currentflow_submit_date + '\"' +
                ", "+'\"' +"phase_name" + '\"'+":"+'\"' +pe.getPhase_name()+ '\"' +
                '}';
    }
}
