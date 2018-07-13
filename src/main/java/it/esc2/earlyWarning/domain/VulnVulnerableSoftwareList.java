/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.esc2.earlyWarning.domain;

import java.util.ArrayList;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author a.mansour
 */
public class VulnVulnerableSoftwareList {

    @Field("vuln:product")
    private ArrayList<String> name;

    public ArrayList<String> getName() {
        return name;
    }

    public void setName(ArrayList<String> name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "VulnVulnerableSoftwareList{" + "name=" + name + '}';
    }

}
