package com.juniverse.solid;

import com.juniverse.solid.dip.DependencyInversionPrinciple;
import com.juniverse.solid.isp.SegregationPrinciple;
import com.juniverse.solid.lsp.LiskovSubstitutionPrinciple;
import com.juniverse.solid.ocp.OpenClosedPrinciple;
import com.juniverse.solid.srp.SingleResponsibilityPrinciple;

/**
 * Recorre los cinco principios SOLID con un ejemplo de cada uno.
 *
 * @author ajuar
 */
public class Main {

    /**
     * Ejecuta los cinco ejemplos en orden.
     * @param args no se usan
     */
    public static void main(String[] args) {
        SingleResponsibilityPrinciple srp = new SingleResponsibilityPrinciple();
        srp.principle();

        OpenClosedPrinciple ocp = new OpenClosedPrinciple();
        ocp.principle();

        LiskovSubstitutionPrinciple lsp = new LiskovSubstitutionPrinciple();
        lsp.principle();

        SegregationPrinciple isp = new SegregationPrinciple();
        isp.principle();

        DependencyInversionPrinciple dip = new DependencyInversionPrinciple();
        dip.principle();
    }
}
