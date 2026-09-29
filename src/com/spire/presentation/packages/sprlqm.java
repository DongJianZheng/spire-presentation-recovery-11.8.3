/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprjii;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlwba;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprsqr;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprurm;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.util.Enumeration;

public class sprlqm
extends sprqqe {
    public sprktm cfr_renamed_1;
    public spridn cfr_renamed_2;
    public sprnbm cfr_renamed_3;
    public sprvhm cfr_renamed_4;

    public sprktm cfr_renamed_3() {
        return this.cfr_renamed_1;
    }

    public static sprlqm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprlqm) {
            return (sprlqm)arg0;
        }
        if (arg0 != null) {
            return new sprlqm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprlqm(sprszm sprszm2) {
        void arg0;
        sprlqm sprlqm2 = this;
        sprlqm sprlqm3 = this;
        sprlqm3.cfr_renamed_1 = new sprktm(0L);
        sprlqm2.cfr_renamed_2 = null;
        sprlqm2.cfr_renamed_1 = (sprktm)sprszm2.cfr_renamed_85(0);
        void v2 = arg0;
        this.cfr_renamed_3 = sprnbm.cfr_renamed_23(arg0.cfr_renamed_85(1));
        this.cfr_renamed_4 = sprvhm.cfr_renamed_23(v2.cfr_renamed_85(2));
        if (v2.cfr_renamed_84() > 3) {
            sprnvm sprnvm2 = (sprnvm)arg0.cfr_renamed_85(3);
            this.cfr_renamed_2 = spridn.cfr_renamed_5085(sprnvm2, false);
        }
        sprlqm sprlqm4 = this;
        sprlqm.cfr_renamed_11200(sprlqm4.cfr_renamed_2);
        if (sprlqm4.cfr_renamed_3 == null || this.cfr_renamed_1 == null || this.cfr_renamed_4 == null) {
            throw new IllegalArgumentException(sprsqr.cfr_renamed_9("P\rjB\u007f\u000erBs\u0003p\u0006\u007f\u0016q\u0010gBx\u000b{\u000ez\u0011>\u0011{\u0016>\u000bpB]\u0007l\u0016w\u0004w\u0001\u007f\u0016w\rp0{\u0013k\u0007m\u0016W\fx\r>\u0005{\f{\u0010\u007f\u0016q\u00100"));
        }
    }

    public sprnbm cfr_renamed_1485() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(4);
        sprlqm sprlqm2 = this;
        sprrvm sprrvm3 = sprrvm2;
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_1);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm2.cfr_renamed_5004(sprlqm2.cfr_renamed_4);
        if (sprlqm2.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_2));
        }
        return new sprcen(sprrvm2);
    }

    public sprlqm(sprjii arg0, sprvhm arg1, spridn arg2) {
        this(sprnbm.cfr_renamed_23(arg0.cfr_renamed_119()), arg1, arg2);
    }

    private static /* synthetic */ void cfr_renamed_11200(spridn arg0) {
        if (arg0 == null) {
            return;
        }
        Enumeration enumeration = arg0.cfr_renamed_329();
        while (enumeration.hasMoreElements()) {
            sprurm sprurm2 = sprurm.cfr_renamed_23(enumeration.nextElement());
            if (!sprurm2.cfr_renamed_204().cfr_renamed_5078(sprdl.cfr_renamed_725) || sprurm2.cfr_renamed_206().cfr_renamed_84() == 1) continue;
            throw new IllegalArgumentException(sprlwba.cfr_renamed_9(";'9#4*6(=\u001f9<+87=<o9;,=1--;=o5:+;x'99=o7!=o..4:="));
        }
    }

    public spridn cfr_renamed_82() {
        return this.cfr_renamed_2;
    }

    public sprvhm cfr_renamed_1489() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprlqm(sprnbm sprnbm2, sprvhm sprvhm2, spridn spridn2) {
        void arg0;
        void arg2;
        void arg1;
        sprlqm sprlqm2 = this;
        this.cfr_renamed_1 = new sprktm(0L);
        this.cfr_renamed_2 = null;
        if (sprnbm2 == null || arg1 == null) {
            throw new IllegalArgumentException(sprsqr.cfr_renamed_9("P\rjB\u007f\u000erBs\u0003p\u0006\u007f\u0016q\u0010gBx\u000b{\u000ez\u0011>\u0011{\u0016>\u000bpB]\u0007l\u0016w\u0004w\u0001\u007f\u0016w\rp0{\u0013k\u0007m\u0016W\fx\r>\u0005{\f{\u0010\u007f\u0016q\u00100"));
        }
        sprlqm.cfr_renamed_11200((spridn)arg2);
        sprlqm sprlqm3 = this;
        this.cfr_renamed_3 = arg0;
        sprlqm3.cfr_renamed_4 = arg1;
        sprlqm3.cfr_renamed_2 = arg2;
    }
}

