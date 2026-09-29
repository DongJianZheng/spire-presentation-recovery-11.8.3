/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraen;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprkgba;
import com.spire.presentation.packages.sprkgn;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.Enumeration;

public class spruqm
extends sprqqe {
    public sprszm cfr_renamed_4;

    public spruqm(String[] arg0) {
        int n;
        sprrvm sprrvm2 = new sprrvm(arg0.length);
        int n2 = n = 0;
        while (n2 < arg0.length) {
            sprrvm2.cfr_renamed_5004(new spraen(arg0[n++]));
            n2 = n;
        }
        this.cfr_renamed_4 = new sprcen(sprrvm2);
    }

    public static spruqm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return spruqm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public spraen cfr_renamed_649(int arg0) {
        sprkgn sprkgn2 = this.cfr_renamed_5303(arg0);
        if (null == sprkgn2 || sprkgn2 instanceof spraen) {
            return (spraen)sprkgn2;
        }
        return new spraen(sprkgn2.cfr_renamed_314());
    }

    public static spruqm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spruqm) {
            return (spruqm)arg0;
        }
        if (arg0 != null) {
            return new spruqm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public spruqm(sprkgn[] sprkgnArray) {
        void arg0;
        spruqm spruqm2 = this;
        spruqm2.cfr_renamed_4 = new sprcen((sprco[])arg0);
    }

    /*
     * WARNING - void declaration
     */
    public spruqm(sprkgn sprkgn2) {
        void arg0;
        spruqm spruqm2 = this;
        spruqm2.cfr_renamed_4 = new sprcen((sprco)arg0);
    }

    /*
     * WARNING - void declaration
     */
    public spruqm(String string) {
        this(new spraen((String)arg0));
        void arg0;
    }

    public int cfr_renamed_84() {
        return this.cfr_renamed_4.cfr_renamed_84();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spruqm(sprszm sprszm2) {
        void arg0;
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        while (enumeration.hasMoreElements()) {
            if (enumeration.nextElement() instanceof sprkgn) continue;
            throw new IllegalArgumentException(sprkgba.cfr_renamed_9("w\u0018b\t{\u001cbLb\u00036\u0005x\u001fs\u001ebLx\u0003xLC8PT6?B>_\"QL\u007f\u0002b\u00036<]%P\u001es\tB\tn\u0018"));
        }
        this.cfr_renamed_4 = arg0;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public sprkgn cfr_renamed_5303(int arg0) {
        return (sprkgn)this.cfr_renamed_4.cfr_renamed_85(arg0);
    }
}

