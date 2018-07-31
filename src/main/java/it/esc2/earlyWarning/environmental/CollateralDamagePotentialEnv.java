/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.esc2.earlyWarning.environmental;

/**
 *
 * @author a.mansour
 */
public enum CollateralDamagePotentialEnv {
    NONE(0.0),
    LOW(0.1),
    LOW_MEDIUM(0.3),
    MEDIUM_HIGH(0.4),
    HIGH(0.5),
    NOT_DEFINED(0.0);
    
    private Double cdpAmoubt;

    private CollateralDamagePotentialEnv(Double cdpAmoubt) {
        this.cdpAmoubt = cdpAmoubt;
    }

    public Double getCdpAmoubt() {
        return cdpAmoubt;
    }    

}
