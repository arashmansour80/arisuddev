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
public enum ReportConfidence {

    UNCONFIRMED(0.90),
    UNCORROBORATED(0.95),
    CONFIRMED(1.00),
    NOT_DEFINED(1.00);

    private Double rcAmount;

    private ReportConfidence(Double rcAmount) {
        this.rcAmount = rcAmount;
    }

    public Double getRcAmount() {
        return rcAmount;
    }

}
