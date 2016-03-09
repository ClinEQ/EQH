package clineq.data;
// Generated Mar 6, 2016 3:14:38 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * StudyChartGroup generated by hbm2java
 */
public class StudyChartGroup  implements java.io.Serializable {


     private String chartGroupId;
     private Studies studies;
     private String chartGroupName;
     private String status;
     private Date lastUpdateDate;
     private Set<StudyChartCategory> studyChartCategories = new HashSet<StudyChartCategory>(0);

    public StudyChartGroup() {
    }

	
    public StudyChartGroup(String chartGroupId) {
        this.chartGroupId = chartGroupId;
    }
    public StudyChartGroup(String chartGroupId, Studies studies, String chartGroupName, String status, Date lastUpdateDate, Set<StudyChartCategory> studyChartCategories) {
       this.chartGroupId = chartGroupId;
       this.studies = studies;
       this.chartGroupName = chartGroupName;
       this.status = status;
       this.lastUpdateDate = lastUpdateDate;
       this.studyChartCategories = studyChartCategories;
    }
   
    public String getChartGroupId() {
        return this.chartGroupId;
    }
    
    public void setChartGroupId(String chartGroupId) {
        this.chartGroupId = chartGroupId;
    }
    public Studies getStudies() {
        return this.studies;
    }
    
    public void setStudies(Studies studies) {
        this.studies = studies;
    }
    public String getChartGroupName() {
        return this.chartGroupName;
    }
    
    public void setChartGroupName(String chartGroupName) {
        this.chartGroupName = chartGroupName;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public Date getLastUpdateDate() {
        return this.lastUpdateDate;
    }
    
    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
    public Set<StudyChartCategory> getStudyChartCategories() {
        return this.studyChartCategories;
    }
    
    public void setStudyChartCategories(Set<StudyChartCategory> studyChartCategories) {
        this.studyChartCategories = studyChartCategories;
    }




}

