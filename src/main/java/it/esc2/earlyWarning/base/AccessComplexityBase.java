/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.esc2.earlyWarning.base;

/**
 *
 * @author a.mansour
 */
public enum AccessComplexityBase {
    HIGH(0.35),
    MEDIUM(0.61),
    LOW(0.71);
    
    private Double acAmount;

    private AccessComplexityBase(Double acAmount) {
        this.acAmount = acAmount;
    }

    public Double getAcAmount() {
        return acAmount;
    }    
       
    
}
