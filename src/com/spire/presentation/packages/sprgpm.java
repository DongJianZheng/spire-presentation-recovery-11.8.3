/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprml;
import com.spire.presentation.packages.sprnrm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprppy;
import com.spire.presentation.packages.sprqhm;
import com.spire.presentation.packages.sprqlaa;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprupm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzv;
import java.util.Enumeration;

public class sprgpm
extends sprqqe {
    private sprqhm cfr_renamed_1;
    private String cfr_renamed_2;
    private sprlem cfr_renamed_3;
    public static final sprlem cfr_renamed_4 = new sprlem(sprzv.cfr_renamed_105 + sprppy.cfr_renamed_9("w4"));

    public sprlem cfr_renamed_4628() {
        return this.cfr_renamed_3;
    }

    public String cfr_renamed_4629() {
        return this.cfr_renamed_2;
    }

    public static sprgpm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprgpm) {
            return (sprgpm)arg0;
        }
        if (arg0 instanceof sprszm) {
            return new sprgpm((sprszm)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprqlaa.cfr_renamed_9("0^5W>S5\u00126P3W:Fy[7\u0012>W-{7A-S7Q<\by")).append(arg0.getClass().getName()).toString());
    }

    /*
     * WARNING - void declaration
     */
    public sprgpm(sprlem sprlem2, String string, sprqhm sprqhm2) {
        void arg1;
        void arg0;
        sprgpm sprgpm2 = this;
        this.cfr_renamed_3 = arg0;
        sprgpm2.cfr_renamed_2 = arg1;
        sprgpm2.cfr_renamed_1 = sprqhm2;
    }

    public sprqhm cfr_renamed_4627() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ sprgpm(sprszm sprszm2) {
        Enumeration enumeration;
        Enumeration enumeration2;
        sprco sprco2;
        void arg0;
        if (sprszm2.cfr_renamed_84() > 3) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprppy.cfr_renamed_9("G8ayv<t,`7f<%*l#`c%")).append(arg0.cfr_renamed_84()).toString());
        }
        Enumeration enumeration3 = arg0.cfr_renamed_329();
        if (enumeration3.hasMoreElements()) {
            sprco2 = (sprco)enumeration3.nextElement();
            if (sprco2 instanceof sprlem) {
                this.cfr_renamed_3 = (sprlem)sprco2;
                enumeration2 = enumeration3;
            } else if (sprco2 instanceof sprupm) {
                enumeration2 = enumeration3;
                this.cfr_renamed_2 = sprupm.cfr_renamed_23(sprco2).cfr_renamed_314();
            } else {
                if (!(sprco2 instanceof sprml)) throw new IllegalArgumentException(new StringBuilder().insert(0, sprqlaa.cfr_renamed_9("p8Vy];X<Q-\u0012<\\:],\\-W+W=\by")).append(sprco2.getClass()).toString());
                enumeration2 = enumeration3;
                this.cfr_renamed_1 = sprqhm.cfr_renamed_23(sprco2);
            }
        } else {
            enumeration2 = enumeration3;
        }
        if (enumeration2.hasMoreElements()) {
            sprco2 = (sprco)enumeration3.nextElement();
            if (sprco2 instanceof sprupm) {
                enumeration = enumeration3;
                this.cfr_renamed_2 = sprupm.cfr_renamed_23(sprco2).cfr_renamed_314();
            } else {
                if (!(sprco2 instanceof sprml)) throw new IllegalArgumentException(new StringBuilder().insert(0, sprppy.cfr_renamed_9("\u001bd=%6g3`:qy`7f6p7q<w<ac%")).append(sprco2.getClass()).toString());
                enumeration = enumeration3;
                this.cfr_renamed_1 = sprqhm.cfr_renamed_23(sprco2);
            }
        } else {
            enumeration = enumeration3;
        }
        if (!enumeration.hasMoreElements()) return;
        sprco2 = (sprco)enumeration3.nextElement();
        if (!(sprco2 instanceof sprml)) throw new IllegalArgumentException(new StringBuilder().insert(0, sprqlaa.cfr_renamed_9("p8Vy];X<Q-\u0012<\\:],\\-W+W=\by")).append(sprco2.getClass()).toString());
        this.cfr_renamed_1 = sprqhm.cfr_renamed_23(sprco2);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        }
        if (this.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(new sprnrm(this.cfr_renamed_2, true));
        }
        if (this.cfr_renamed_1 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_1);
        }
        return new sprcen(sprrvm2);
    }

    public static sprgpm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprgpm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }
}

