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
public enum IntegrityImpactEnv {
    LOW(0.5),
    MEDIUM(1.0),
    HIGH(1.51),
    NOT_DEFINED(1.0);

    private Double iiAmount;

    private IntegrityImpactEnv(Double iiAmount) {
        this.iiAmount = iiAmount;
    }

    public Double getIiAmount() {
        return iiAmount;
    }

}
