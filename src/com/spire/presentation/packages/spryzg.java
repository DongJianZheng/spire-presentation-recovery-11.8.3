/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprchk;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprhrg;
import com.spire.presentation.packages.sprmcp;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class spryzg
extends sprqqe {
    private final sproug cfr_renamed_3;
    private final sproug cfr_renamed_4;

    public sproug spr\u3181() {
        return this.cfr_renamed_3;
    }

    public static spryzg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spryzg) {
            return (spryzg)arg0;
        }
        if (arg0 != null) {
            return new spryzg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public spryzg(sproug sproug2, sproug sproug3) {
        void arg0;
        void arg1;
        if (sproug2.cfr_renamed_186().length != 48) {
            throw new IllegalArgumentException(sprchk.cfr_renamed_9("dFq\u0013o\u0012<\u0004yF(^<\u0004e\u0012y\u0015<\ns\b{"));
        }
        if (arg1.cfr_renamed_186().length != 48) {
            throw new IllegalArgumentException(sprmcp.cfr_renamed_9("k0\u007fead2rw0&(2rkdwc2|}~u"));
        }
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_3 = arg1;
    }

    public sproug cfr_renamed_1980() {
        return this.cfr_renamed_4;
    }

    public static sprhrg cfr_renamed_7843() {
        return new sprhrg();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_4;
        sprcoArray[1] = this.cfr_renamed_3;
        return new sprcen(sprcoArray);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spryzg(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprchk.cfr_renamed_9("y\u001el\u0003\u007f\u0012y\u0002<\u0015y\u0017i\u0003r\u0005yFo\u000ff\u0003<\tzF."));
        }
        spryzg spryzg2 = this;
        spryzg2.cfr_renamed_4 = sproug.cfr_renamed_23(arg0.cfr_renamed_85(0));
        spryzg2.cfr_renamed_3 = sproug.cfr_renamed_23(arg0.cfr_renamed_85(1));
        if (this.cfr_renamed_4.cfr_renamed_186().length != 48) {
            throw new IllegalArgumentException(sprmcp.cfr_renamed_9("j0\u007fead2rw0&(2rkdwc2|}~u"));
        }
        if (this.cfr_renamed_3.cfr_renamed_186().length != 48) {
            throw new IllegalArgumentException(sprchk.cfr_renamed_9("eFq\u0013o\u0012<\u0004yF(^<\u0004e\u0012y\u0015<\ns\b{"));
        }
    }
}

