/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzofa;

public class spraem
extends sprqqe {
    private final sprigm[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spraem(sprszm sprszm2) {
        void arg0;
        int n;
        this.cfr_renamed_4 = new sprigm[sprszm2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != arg0.cfr_renamed_84()) {
            int n3 = n++;
            this.cfr_renamed_4[n3] = sprigm.cfr_renamed_23(arg0.cfr_renamed_85(n3));
            n2 = n;
        }
    }

    private static /* synthetic */ sprigm[] cfr_renamed_11145(sprigm[] arg0) {
        sprigm[] sprigmArray = new sprigm[arg0.length];
        System.arraycopy(arg0, 0, sprigmArray, 0, arg0.length);
        return sprigmArray;
    }

    public static spraem cfr_renamed_11146(sprhgm arg0, sprlem arg1) {
        return spraem.cfr_renamed_23(sprhgm.cfr_renamed_11135(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    public spraem(sprigm sprigm2) {
        void arg0;
        sprigm[] sprigmArray = new sprigm[1];
        sprigmArray[0] = arg0;
        this.cfr_renamed_4 = sprigmArray;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprcen(this.cfr_renamed_4);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = sprkoe.cfr_renamed_5114();
        stringBuffer.append(sprzofa.cfr_renamed_9("V\u0017\u007f\u0017c\u0013}<p\u001ft\u0001+"));
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

    public spraem(sprigm[] sprigmArray) {
        this.cfr_renamed_4 = spraem.cfr_renamed_11145(sprigmArray);
    }

    public static spraem cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return new spraem(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public static spraem cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spraem) {
            return (spraem)arg0;
        }
        if (arg0 != null) {
            return new spraem(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprigm[] cfr_renamed_289() {
        return spraem.cfr_renamed_11145(this.cfr_renamed_4);
    }
}

