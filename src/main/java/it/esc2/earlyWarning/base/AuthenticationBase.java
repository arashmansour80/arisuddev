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
public enum AuthenticationBase {
    NO_AUTHENTICATION(0.704),
    SINGLE_INSTANCES_OF_AUTH(0.56),
    MULTIPLE_INSTANCES_OF_AUTH(0.45);

    private Double authAmount;

    private AuthenticationBase(Double authAmount) {
        this.authAmount = authAmount;
    }

    public Double getAuthAmount() {
        return authAmount;
    }

}
