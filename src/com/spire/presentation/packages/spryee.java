/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprfto;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.sprzok;

public class spryee
extends sprkra {
    private final sprmee[] cfr_renamed_4;

    public spryee(sprmee[] sprmeeArray) {
        this.cfr_renamed_4 = sprmeeArray;
    }

    /*
     * WARNING - void declaration
     */
    public spryee(sprmee sprmee2) {
        void arg0;
        sprmee[] sprmeeArray = new sprmee[1];
        sprmeeArray[0] = arg0;
        this.cfr_renamed_4 = sprmeeArray;
    }

    public sprmee[] cfr_renamed_289() {
        sprmee[] sprmeeArray = new sprmee[this.cfr_renamed_4.length];
        System.arraycopy(this.cfr_renamed_4, 0, sprmeeArray, 0, this.cfr_renamed_4.length);
        return sprmeeArray;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spryee(sprbne sprbne2) {
        void arg0;
        int n;
        this.cfr_renamed_4 = new sprmee[sprbne2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != arg0.cfr_renamed_84()) {
            int n3 = n++;
            this.cfr_renamed_4[n3] = sprmee.cfr_renamed_23(arg0.cfr_renamed_85(n3));
            n2 = n;
        }
    }

    @Override
    public sprvva cfr_renamed_119() {
        return new sprpse(this.cfr_renamed_4);
    }

    public static spryee cfr_renamed_341(spryte arg0, boolean arg1) {
        return spryee.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = System.getProperty(sprfto.cfr_renamed_9("h8j4*\"a!e#e%k#"));
        stringBuffer.append(sprzok.cfr_renamed_9("Fpopstm[`xdf;"));
        stringBuffer.append(string);
        int n = 0;
        int n2 = n;
        while (n2 != this.cfr_renamed_4.length) {
            stringBuffer.append("    ");
            stringBuffer.append(this.cfr_renamed_4[n]);
            stringBuffer.append(string);
            n2 = ++n;
        }
        return stringBuffer.toString();
    }

    public static spryee cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spryee) {
            return (spryee)arg0;
        }
        if (arg0 != null) {
            return new spryee(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public static spryee cfr_renamed_4514(sprszd arg0, sprtzd arg1) {
        return spryee.cfr_renamed_23(arg0.cfr_renamed_4477(arg1));
    }
}

