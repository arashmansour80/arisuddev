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
public enum AccessVectorBase {

    LOCAL_ACCESS(0.395),
    lOCAL_NETWORK_ACCESSIBLE(0.646),
    NETWORK_ACCESSIBLE(1.00);

    private Double avAmount;

    private AccessVectorBase(Double avAmount) {
        this.avAmount = avAmount;
    }

    public Double getAvAmount() {
        return avAmount;
    }

}
