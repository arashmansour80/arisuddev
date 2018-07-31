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
public enum TargetDistributionEnv {

    NONE(0.0),
    LOW(0.25),
    MEDIUM(0.75),
    HIGH(1.00),
    NOT_DEFINED(1.00);

    private double tdAmount;

    private TargetDistributionEnv(double tdAmount) {
        this.tdAmount = tdAmount;
    }

    public double getTdAmount() {
        return tdAmount;
    }

}
