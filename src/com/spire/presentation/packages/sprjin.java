/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraep;
import com.spire.presentation.packages.sprali;
import com.spire.presentation.packages.sprmvo;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprqt;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprrhq;
import com.spire.presentation.packages.sprsto;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtqo;
import com.spire.presentation.packages.sprvyo;

@sprtea
public abstract class sprjin {
    private int cfr_renamed_2;
    private sprqt cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @sprtea
    public byte[] cfr_renamed_13320(byte[] arg0, sprtqo arg1) {
        try {
            if (arg1 == null) return arg0;
            if (!arg1.cfr_renamed_14231()) return arg0;
            sprvyo sprvyo2 = arg1.cfr_renamed_15047(arg0);
            try {
                arg0 = this.cfr_renamed_13336(sprvyo2);
                return arg0;
            }
            finally {
                if (sprvyo2 != null) {
                    sprvyo2.cfr_renamed_11665();
                }
            }
        }
        catch (Exception exception) {
            Object[] objectArray = new Object[1];
            objectArray[0] = exception.getMessage();
            this.cfr_renamed_3.cfr_renamed_12477(2, this.cfr_renamed_4, sprraia.cfr_renamed_11562(sprrhq.cfr_renamed_9("\u0006\n.\u0000*G,\u0006!\t \u0013o\u0005*G,\u0015 \u0017?\u0002+G-\u0002,\u0006:\u0014*]o\u001c\u007f\u001a"), objectArray));
        }
        return arg0;
    }

    @sprtea
    public byte[] cfr_renamed_13336(sprvyo arg0) {
        sprpdja sprpdja2;
        sprpdja sprpdja3 = new sprpdja();
        if (this.cfr_renamed_13216(arg0.cfr_renamed_12642())) {
            sprpdja sprpdja4 = sprpdja3;
            sprpdja2 = sprpdja4;
            arg0.cfr_renamed_12641(sprpdja4, arg0.cfr_renamed_12642());
        } else if (arg0.cfr_renamed_12642() == 9 && this.cfr_renamed_13216(6)) {
            sprpdja sprpdja5 = sprpdja3;
            sprpdja2 = sprpdja5;
            arg0.cfr_renamed_12641(sprpdja5, 6);
            this.cfr_renamed_3.cfr_renamed_12477(2, this.cfr_renamed_4, sprali.cfr_renamed_9("z${MT\u0000\\\nX\u001e\u001d\fO\b\u001d\u0003R\u0019\u001d\u001eH\u001dM\u0002O\u0019X\t\u0011MT\u0000\\\nXM^\u0002S\u001bX\u001fI\bYMI\u0002\u001d=s*"));
        } else {
            sprvyo sprvyo2 = arg0;
            sprvyo2.cfr_renamed_14200(sprpdja3, this.cfr_renamed_2);
            String string = sprvyo2.cfr_renamed_12642() == 0 ? sprrhq.cfr_renamed_9("2!\f!\b8\t") : spraep.cfr_renamed_13311(arg0.cfr_renamed_12642());
            sprpdja2 = sprpdja3;
            this.cfr_renamed_3.cfr_renamed_12475(2, this.cfr_renamed_4, sprali.cfr_renamed_9("\u0016\r\u0010\u001d\u0004P\fZ\bNM\\\u001fXMS\u0002IMN\u0018M\u001dR\u001fI\bYA\u001d\u0004P\fZ\b\u001d\u000eR\u0003K\bO\u0019X\t\u001d\u0019RMw=x*"), string);
        }
        return sprmvo.cfr_renamed_12452(sprpdja2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @sprtea
    public byte[] cfr_renamed_13297(byte[] arg0) {
        if (this.cfr_renamed_13224(arg0)) {
            return arg0;
        }
        try {
            sprvyo sprvyo2 = new sprvyo(arg0);
            try {
                byte[] byArray = this.cfr_renamed_13336(sprvyo2);
                return byArray;
            }
            finally {
                if (sprvyo2 != null) {
                    sprvyo2.cfr_renamed_11665();
                }
            }
        }
        catch (Exception exception) {
            return this.cfr_renamed_13297(sprsto.cfr_renamed_13709());
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprjin(int n, sprqt sprqt2, int n2) {
        void arg1;
        void arg0;
        sprjin sprjin2 = this;
        sprjin sprjin3 = this;
        sprjin3.cfr_renamed_2 = 95;
        sprjin3.cfr_renamed_2 = arg0;
        sprjin2.cfr_renamed_3 = arg1;
        sprjin2.cfr_renamed_4 = n2;
    }

    @sprtea
    public boolean cfr_renamed_13216(int arg0) {
        return false;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public boolean cfr_renamed_13224(byte[] byArray) {
        void arg0;
        return this.cfr_renamed_13216(sprsto.cfr_renamed_13225((byte[])arg0));
    }
}

