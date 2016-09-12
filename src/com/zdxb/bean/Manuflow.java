package com.zdxb.bean;

/**
 * Manuflow对应的实体类
 */
public class Manuflow {
    private String flow_id;
    private String manu_id;
    private String manu_number;
    private String phase_id;
    private String pahse_number;
    private String submitter_name;
    private String submitter_id;
    private String submit_date;
    private String handler_id;
    private String handler_name;
    private String handler_type;
    private String plan_date;
    private String actual_date;
    private String opinion;
    private Review_phase pe;
    private Manuscript ms;

    public Manuscript getMs() {
        return ms;
    }

    public void setMs(Manuscript ms) {
        this.ms = ms;
    }
    public Review_phase getPe() {
        return pe;
    }

    public void setPe(Review_phase pe) {
        this.pe = pe;
    }

    public String getFlow_id() {
        return flow_id;
    }

    public void setFlow_id(String flow_id) {
        this.flow_id = flow_id;
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

    public String getPahse_number() {
        return pahse_number;
    }

    public void setPahse_number(String pahse_number) {
        this.pahse_number = pahse_number;
    }

    public String getSubmitter_name() {
        return submitter_name;
    }

    public void setSubmitter_name(String submitter_name) {
        this.submitter_name = submitter_name;
    }

    public String getSubmitter_id() {
        return submitter_id;
    }

    public void setSubmitter_id(String submitter_id) {
        this.submitter_id = submitter_id;
    }

    public String getSubmit_date() {
        return submit_date;
    }

    public void setSubmit_date(String submit_date) {
        this.submit_date = submit_date;
    }

    public String getHandler_id() {
        return handler_id;
    }

    public void setHandler_id(String handler_id) {
        this.handler_id = handler_id;
    }

    public String getHandler_name() {
        return handler_name;
    }

    public void setHandler_name(String handler_name) {
        this.handler_name = handler_name;
    }

    public String getHandler_type() {
        return handler_type;
    }

    public void setHandler_type(String handler_type) {
        this.handler_type = handler_type;
    }

    public String getPlan_date() {
        return plan_date;
    }

    public void setPlan_date(String plan_date) {
        this.plan_date = plan_date;
    }

    public String getActual_date() {
        return actual_date;
    }

    public void setActual_date(String actual_date) {
        this.actual_date = actual_date;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public String toString() {
        return "{" +
                '\"' +"flow_id"+'\"' +":" + '\"' +flow_id+'\"' +
                ","+'\"' +"manu_number"+'\"' +":" +'\"' +manu_number + '\"' +
                ", "+'\"' +"phase_id" + '\"' +":"+'\"'+phase_id + '\"' +
                ", "+'\"' +"title" + '\"'+":" +'\"'+ms.getTitle() + '\"' +
                ", "+'\"' +"submit_date" + '\"'+":" +'\"'+submit_date+ '\"' +
                ", "+'\"' +"plan_date" + '\"'+":"+'\"' +plan_date + '\"' +
                ", "+'\"' +"actual_date" + '\"'+":" +'\"'+actual_date + '\"' +
                ", "+'\"' +"phase_name" + '\"'+":"+'\"' +pe.getPhase_name()+ '\"' +
                '}';
    }
}
