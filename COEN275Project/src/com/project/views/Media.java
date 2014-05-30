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
@Table(name = "media")

public class Media implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Id
    @Basic(optional = false)
    @Column(name = "path")
    private String path;
    @JoinColumn(name = "project_id", referencedColumnName = "project_id")
    @ManyToOne(optional = false)
    private ProjectDetails projectId;

    public Media() {
    }

    public Media(String path) {
        this.path = path;
    }

    public Media(String path, String name) {
        this.path = path;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
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
        hash += (path != null ? path.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Media)) {
            return false;
        }
        Media other = (Media) object;
        if ((this.path == null && other.path != null) || (this.path != null && !this.path.equals(other.path))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.project.views.Media[ path=" + path + " ]";
    }
    
}
