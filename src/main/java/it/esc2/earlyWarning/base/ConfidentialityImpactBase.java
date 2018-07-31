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
public enum ConfidentialityImpactBase {
    NONE(0.0),
    PARTIAL(0.275),
    COMPLETE(0.660);

    private Double ciAmount;

    private ConfidentialityImpactBase(Double ciAmount) {
        this.ciAmount = ciAmount;
    }

    public Double getCiAmount() {
        return ciAmount;
    }

}
