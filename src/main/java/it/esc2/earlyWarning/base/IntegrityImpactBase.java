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
public enum IntegrityImpactBase {

    NONE(0.0),
    PARTIAL(0.275),
    COMPLETE(0.660);

    private Double iiAmount;

    private IntegrityImpactBase(Double iiAmount) {
        this.iiAmount = iiAmount;
    }

    public Double getIiAmount() {
        return iiAmount;
    }

}
