package com.zdxb.bean;

/**
 * Created by hp on 2016/7/24.
 */
public class Review_phase {
    private String phase_id;
    private String phase_name;
    private String phase_ename;



    public String getPhase_id() {
        return phase_id;
    }

    public void setPhase_id(String phase_id) {
        this.phase_id = phase_id;
    }

    public String getPhase_name() {
        return phase_name;
    }

    public void setPhase_name(String phase_name) {
        this.phase_name = phase_name;
    }

    public String getPhase_ename() {
        return phase_ename;
    }

    public void setPhase_ename(String phase_ename) {
        this.phase_ename = phase_ename;
    }

    @Override
    public String toString() {
        return "Review_phase{" +
                "phase_id='" + phase_id + '\'' +
                ", phase_name='" + phase_name + '\'' +
                ", phase_ename='" + phase_ename + '\'' +
                '}';
    }
}
