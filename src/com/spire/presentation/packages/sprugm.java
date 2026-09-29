/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprml;
import com.spire.presentation.packages.sprqhm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprqry;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxqo;
import java.util.Enumeration;

public class sprugm
extends sprqqe
implements sprlm {
    private sprszm cfr_renamed_2;
    private sprqhm cfr_renamed_3;
    private sprqhm cfr_renamed_4;

    public sprqhm cfr_renamed_4485() {
        return this.cfr_renamed_3;
    }

    public sprugm(sprqhm sprqhm2) {
        this.cfr_renamed_3 = sprqhm2;
    }

    /*
     * WARNING - void declaration
     */
    public sprugm(sprqhm sprqhm2, sprszm sprszm2) {
        void arg0;
        sprugm sprugm2 = this;
        sprugm2.cfr_renamed_4 = arg0;
        sprugm2.cfr_renamed_2 = sprszm2;
    }

    /*
     * WARNING - void declaration
     */
    public sprugm(String string) {
        this(new sprqhm((String)arg0));
        void arg0;
    }

    public sprqhm[] cfr_renamed_4484() {
        Enumeration enumeration;
        sprqhm[] sprqhmArray = new sprqhm[this.cfr_renamed_2.cfr_renamed_84()];
        int n = 0;
        Enumeration enumeration2 = enumeration = this.cfr_renamed_2.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            sprqhmArray[++n] = sprqhm.cfr_renamed_23(enumeration3.nextElement());
        }
        return sprqhmArray;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprugm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprqry.cfr_renamed_9("PDv\u0005a@cPwKq@2V{_w\u001f2")).append(arg0.cfr_renamed_84()).toString());
        }
        if (!(arg0.cfr_renamed_85(0) instanceof sprml)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprxqo.cfr_renamed_9("%&\u0003g\b%\r\"\u00043G\"\t$\b2\t3\u00025\u0002#]g")).append(arg0.cfr_renamed_85(0).getClass()).toString());
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sprqhm.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_2 = sprszm.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    public static sprugm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprugm) {
            return (sprugm)arg0;
        }
        if (arg0 instanceof sprml) {
            return new sprugm(sprqhm.cfr_renamed_23(arg0));
        }
        if (arg0 instanceof sprszm) {
            return new sprugm((sprszm)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprqry.cfr_renamed_9("{I~@uD~\u0005}Gx@qQ2L|\u0005u@fl|VfD|Fw\u001f2")).append(arg0.getClass().getName()).toString());
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        if (this.cfr_renamed_3 != null) {
            return this.cfr_renamed_3.cfr_renamed_119();
        }
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_2);
        return new sprcen(sprrvm2);
    }

    public sprqhm cfr_renamed_4486() {
        return this.cfr_renamed_4;
    }
}

