/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.views;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 *
 * @author gyanpatra
 */
@Entity
@Table(name = "project_details")

public class ProjectDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "project_id")
    private Integer projectId;
    @Basic(optional = false)
    @Column(name = "project_name")
    private String projectName;
    @Basic(optional = false)
    @Column(name = "project_status")
    private String projectStatus;
    @Basic(optional = false)
    @Column(name = "project_start_date")
    @Temporal(TemporalType.DATE)
    private Date projectStartDate;
    @Basic(optional = false)
    @Column(name = "project_end_date")
    @Temporal(TemporalType.DATE)
    private Date projectEndDate;
    @Basic(optional = false)
    @Column(name = "project_theme")
    private String projectTheme;
    @Basic(optional = false)
    @Lob
    @Column(name = "project_outcome")
    private String projectOutcome;
    @Basic(optional = false)
    @Column(name = "project_member_count")
    private int projectMemberCount;

    public ProjectDetails() {
    }

    public ProjectDetails(Integer projectId) {
        this.projectId = projectId;
    }

    public ProjectDetails(Integer projectId, String projectName, String projectStatus, Date projectStartDate, Date projectEndDate, String projectTheme, String projectOutcome, int projectMemberCount) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectStatus = projectStatus;
        this.projectStartDate = projectStartDate;
        this.projectEndDate = projectEndDate;
        this.projectTheme = projectTheme;
        this.projectOutcome = projectOutcome;
        this.projectMemberCount = projectMemberCount;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    public Date getProjectStartDate() {
        return projectStartDate;
    }

    public void setProjectStartDate(Date projectStartDate) {
        this.projectStartDate = projectStartDate;
    }

    public Date getProjectEndDate() {
        return projectEndDate;
    }

    public void setProjectEndDate(Date projectEndDate) {
        this.projectEndDate = projectEndDate;
    }

    public String getProjectTheme() {
        return projectTheme;
    }

    public void setProjectTheme(String projectTheme) {
        this.projectTheme = projectTheme;
    }

    public String getProjectOutcome() {
        return projectOutcome;
    }

    public void setProjectOutcome(String projectOutcome) {
        this.projectOutcome = projectOutcome;
    }

    public int getProjectMemberCount() {
        return projectMemberCount;
    }

    public void setProjectMemberCount(int projectMemberCount) {
        this.projectMemberCount = projectMemberCount;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (projectId != null ? projectId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProjectDetails)) {
            return false;
        }
        ProjectDetails other = (ProjectDetails) object;
        if ((this.projectId == null && other.projectId != null) || (this.projectId != null && !this.projectId.equals(other.projectId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.project.views.ProjectDetails[ projectId=" + projectId + " ]";
    }
    
}
