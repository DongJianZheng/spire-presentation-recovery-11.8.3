/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprccb;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprevm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.spropo;
import com.spire.presentation.packages.sproum;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprfqm
extends sprqqe {
    private sprszm cfr_renamed_2;
    private sproum cfr_renamed_3;
    private sprevm cfr_renamed_4;

    public sprevm[] cfr_renamed_4754() {
        if (this.cfr_renamed_2 != null) {
            return sprevm.cfr_renamed_11254(this.cfr_renamed_2);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_11255(sprco arg0) {
        sprnvm sprnvm2 = sprnvm.cfr_renamed_23(arg0);
        switch (sprnvm2.cfr_renamed_312()) {
            case 0: {
                this.cfr_renamed_3 = sproum.cfr_renamed_5085(sprnvm2, false);
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, spropo.cfr_renamed_9("\u0011y/y+`*70v#7!y'x1y0r6r -d")).append(sprnvm2.cfr_renamed_312()).toString());
    }

    public sprfqm(sprevm arg0, sproum arg1) {
        this(arg0, null, arg1);
    }

    public sprfqm(sprevm arg0) {
        this(arg0, null, null);
    }

    public sprevm cfr_renamed_4750() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprfqm(sprszm sprszm2) {
        void arg0;
        int n = 0;
        sprco sprco2 = sprszm2.cfr_renamed_85(0);
        ++n;
        this.cfr_renamed_4 = sprevm.cfr_renamed_23(sprco2);
        if (arg0.cfr_renamed_84() > 1) {
            sprco2 = arg0.cfr_renamed_85(n);
            ++n;
            if (sprco2 instanceof sprnvm) {
                this.cfr_renamed_11255(sprco2);
                return;
            }
            this.cfr_renamed_2 = sprszm.cfr_renamed_23(sprco2);
            if (arg0.cfr_renamed_84() > 2) {
                sprco2 = arg0.cfr_renamed_85(n);
                this.cfr_renamed_11255(sprco2);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprfqm(sprevm sprevm2, sprevm[] sprevmArray, sproum sproum2) {
        void arg2;
        void arg0;
        this.cfr_renamed_4 = arg0;
        if (sprevmArray != null) {
            void arg1;
            sprfqm sprfqm2 = this;
            sprfqm2.cfr_renamed_2 = new sprcen((sprco[])arg1);
        }
        this.cfr_renamed_3 = arg2;
    }

    public sprfqm(sprevm arg0, sprevm[] arg1) {
        this(arg0, arg1, null);
    }

    public static sprfqm[] cfr_renamed_11254(sprszm arg0) {
        int n;
        sprfqm[] sprfqmArray = new sprfqm[arg0.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprfqmArray.length) {
            int n3 = n++;
            sprfqmArray[n3] = sprfqm.cfr_renamed_23(arg0.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprfqmArray;
    }

    public static sprfqm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprfqm) {
            return (sprfqm)arg0;
        }
        if (arg0 != null) {
            return new sprfqm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        sprfqm sprfqm2 = this;
        sprrvm2.cfr_renamed_5004(sprfqm2.cfr_renamed_4);
        if (sprfqm2.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        }
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_3));
        }
        return new sprcen(sprrvm2);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(sprccb.cfr_renamed_9("\u0003d%b2q\u0012q4F?d>kw~]"));
        stringBuffer.append(spropo.cfr_renamed_9("c%e#r0-d") + this.cfr_renamed_4 + "\n");
        if (this.cfr_renamed_2 != null) {
            stringBuffer.append(new StringBuilder().insert(0, sprccb.cfr_renamed_9("4m6l9?w")).append(this.cfr_renamed_2).append("\n").toString());
        }
        if (this.cfr_renamed_3 != null) {
            stringBuffer.append(new StringBuilder().insert(0, spropo.cfr_renamed_9("4v0\u007f\u0014e+t\ry4b0-d")).append(this.cfr_renamed_3).append("\n").toString());
        }
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer2.append(sprccb.cfr_renamed_9("x]"));
        return stringBuffer2.toString();
    }

    public sproum cfr_renamed_4753() {
        return this.cfr_renamed_3;
    }

    public static sprfqm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprfqm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }
}

