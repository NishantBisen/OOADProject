/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.views;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gyanpatra
 */
@Entity
@Table(name = "faculty")

public class Faculty implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "faculty_id")
    private String facultyId;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @JoinColumn(name = "project_id", referencedColumnName = "project_id")
    @ManyToOne(optional = false)
    private ProjectDetails projectId;

    public Faculty() {
    }

    public Faculty(String facultyId) {
        this.facultyId = facultyId;
    }

    public Faculty(String facultyId, String name) {
        this.facultyId = facultyId;
        this.name = name;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProjectDetails getProjectId() {
        return projectId;
    }

    public void setProjectId(ProjectDetails projectId) {
        this.projectId = projectId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facultyId != null ? facultyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Faculty)) {
            return false;
        }
        Faculty other = (Faculty) object;
        if ((this.facultyId == null && other.facultyId != null) || (this.facultyId != null && !this.facultyId.equals(other.facultyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.project.views.Faculty[ facultyId=" + facultyId + " ]";
    }
    
}
