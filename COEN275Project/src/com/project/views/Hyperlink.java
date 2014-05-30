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
@Table(name = "hyperlink")

public class Hyperlink implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "hyperlink")
    private String hyperlink;
    @JoinColumn(name = "id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Hyperlinktype id;
    @JoinColumn(name = "project_id", referencedColumnName = "project_id")
    @ManyToOne(optional = false)
    private ProjectDetails projectId;

    public Hyperlink() {
    }

    public Hyperlink(String hyperlink) {
        this.hyperlink = hyperlink;
    }

    public String getHyperlink() {
        return hyperlink;
    }

    public void setHyperlink(String hyperlink) {
        this.hyperlink = hyperlink;
    }

    public Hyperlinktype getId() {
        return id;
    }

    public void setId(Hyperlinktype id) {
        this.id = id;
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
        hash += (hyperlink != null ? hyperlink.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hyperlink)) {
            return false;
        }
        Hyperlink other = (Hyperlink) object;
        if ((this.hyperlink == null && other.hyperlink != null) || (this.hyperlink != null && !this.hyperlink.equals(other.hyperlink))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.project.views.Hyperlink[ hyperlink=" + hyperlink + " ]";
    }
    
}
