/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.esc2.earlyWarning.temporal;

/**
 *
 * @author a.mansour
 */
public enum RemediationLevel {

    OFFICIAL_FIX(0.87),
    TEMPORARY_FIX(0.90),
    WORKAROUND(0.95),
    UNAVAILABLE(1.00),
    NOT_DEFINED(1.00);

    private Double rlAmount;

    private RemediationLevel(Double rlAmount) {
        this.rlAmount = rlAmount;
    }

    public Double getRlAmount() {
        return rlAmount;
    }

}
