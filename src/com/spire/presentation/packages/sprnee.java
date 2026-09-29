/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcae;
import com.spire.presentation.packages.sprice;
import com.spire.presentation.packages.sprjgba;
import com.spire.presentation.packages.sprjuy;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwm;
import com.spire.presentation.packages.sprx;
import com.spire.presentation.packages.spryte;
import java.util.Enumeration;

public class sprnee
extends sprkra {
    private sprice cfr_renamed_1;
    private String cfr_renamed_2;
    public static final sprtzd cfr_renamed_3 = new sprtzd(sprwm.cfr_renamed_93 + sprjgba.cfr_renamed_9("3\""));
    private sprtzd cfr_renamed_4;

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ sprnee(sprbne sprbne2) {
        Enumeration enumeration;
        Enumeration enumeration2;
        spra spra2;
        void arg0;
        if (sprbne2.cfr_renamed_84() > 3) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprjuy.cfr_renamed_9("\u001dd;%,`.p:k<`\u007fv6\u007f:?\u007f")).append(arg0.cfr_renamed_84()).toString());
        }
        Enumeration enumeration3 = arg0.cfr_renamed_329();
        if (enumeration3.hasMoreElements()) {
            spra2 = (spra)enumeration3.nextElement();
            if (spra2 instanceof sprtzd) {
                this.cfr_renamed_4 = (sprtzd)spra2;
                enumeration2 = enumeration3;
            } else if (spra2 instanceof sprcae) {
                enumeration2 = enumeration3;
                this.cfr_renamed_2 = sprcae.cfr_renamed_23(spra2).cfr_renamed_314();
            } else {
                if (!(spra2 instanceof sprx)) throw new IllegalArgumentException(new StringBuilder().insert(0, sprjgba.cfr_renamed_9("_ry3rqwv~g=vsprfsgxaxw'3")).append(spra2.getClass()).toString());
                enumeration2 = enumeration3;
                this.cfr_renamed_1 = sprice.cfr_renamed_23(spra2);
            }
        } else {
            enumeration2 = enumeration3;
        }
        if (enumeration2.hasMoreElements()) {
            spra2 = (spra)enumeration3.nextElement();
            if (spra2 instanceof sprcae) {
                enumeration = enumeration3;
                this.cfr_renamed_2 = sprcae.cfr_renamed_23(spra2).cfr_renamed_314();
            } else {
                if (!(spra2 instanceof sprx)) throw new IllegalArgumentException(new StringBuilder().insert(0, sprjuy.cfr_renamed_9("G>a\u007fj=o:f+%:k<j*k+`-`;?\u007f")).append(spra2.getClass()).toString());
                enumeration = enumeration3;
                this.cfr_renamed_1 = sprice.cfr_renamed_23(spra2);
            }
        } else {
            enumeration = enumeration3;
        }
        if (!enumeration.hasMoreElements()) return;
        spra2 = (spra)enumeration3.nextElement();
        if (!(spra2 instanceof sprx)) throw new IllegalArgumentException(new StringBuilder().insert(0, sprjgba.cfr_renamed_9("_ry3rqwv~g=vsprfsgxaxw'3")).append(spra2.getClass()).toString());
        this.cfr_renamed_1 = sprice.cfr_renamed_23(spra2);
    }

    /*
     * WARNING - void declaration
     */
    public sprnee(sprtzd sprtzd2, String string, sprice sprice2) {
        void arg1;
        void arg0;
        sprnee sprnee2 = this;
        this.cfr_renamed_4 = arg0;
        sprnee2.cfr_renamed_2 = arg1;
        sprnee2.cfr_renamed_1 = sprice2;
    }

    public static sprnee cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprnee) {
            return (sprnee)arg0;
        }
        if (arg0 instanceof sprbne) {
            return new sprnee((sprbne)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprjuy.cfr_renamed_9("6i3`8d3%0g5`<q\u007fl1%8`+L1v+d1f:?\u007f")).append(arg0.getClass().getName()).toString());
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        }
        if (this.cfr_renamed_2 != null) {
            sprlre2.cfr_renamed_49(new sprcae(this.cfr_renamed_2, true));
        }
        if (this.cfr_renamed_1 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_1);
        }
        return new sprpse(sprlre2);
    }

    public sprice cfr_renamed_4627() {
        return this.cfr_renamed_1;
    }

    public sprtzd cfr_renamed_4628() {
        return this.cfr_renamed_4;
    }

    public String cfr_renamed_4629() {
        return this.cfr_renamed_2;
    }

    public static sprnee cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprnee.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }
}

