/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraoe;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdgha;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprice;
import com.spire.presentation.packages.sprjxl;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprnhe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.util.Enumeration;

public class sprfce
extends sprkra {
    private sprnhe cfr_renamed_1;
    private sprmee cfr_renamed_2;
    private sprice cfr_renamed_3;
    private String cfr_renamed_4;

    public sprmee cfr_renamed_4623() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprfce(String string, sprice sprice2, sprmee sprmee2) {
        void arg2;
        void arg1;
        void arg0;
        sprfce sprfce2 = this;
        sprfce sprfce3 = this;
        sprfce3.cfr_renamed_4 = arg0;
        sprfce3.cfr_renamed_3 = arg1;
        sprfce2.cfr_renamed_2 = arg2;
        sprfce2.cfr_renamed_1 = null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(new sprhse(1 != 0, 1, new spraoe(this.cfr_renamed_4, true)));
        }
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(new sprhse(true, 2, this.cfr_renamed_3));
        }
        if (this.cfr_renamed_2 != null) {
            sprlre2.cfr_renamed_49(new sprhse(true, 3, this.cfr_renamed_2));
        } else {
            sprlre2.cfr_renamed_49(new sprhse(true, 3, this.cfr_renamed_1));
        }
        return new sprpse(sprlre2);
    }

    public String cfr_renamed_4624() {
        return this.cfr_renamed_4;
    }

    public sprice cfr_renamed_4625() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprfce(sprbne sprbne2) {
        spryte spryte2;
        void arg0;
        if (sprbne2.cfr_renamed_84() < 1 || arg0.cfr_renamed_84() > 3) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprjxl.cfr_renamed_9("A\u0000gAp\u0004r\u0014f\u000f`\u0004#\u0012j\u001bf[#")).append(arg0.cfr_renamed_84()).toString());
        }
        Enumeration enumeration = arg0.cfr_renamed_329();
        block5: while (true) {
            if (!enumeration.hasMoreElements()) {
                return;
            }
            spryte2 = spryte.cfr_renamed_23(enumeration.nextElement());
            switch (spryte2.cfr_renamed_312()) {
                case 1: {
                    this.cfr_renamed_4 = spraoe.cfr_renamed_341(spryte2, true).cfr_renamed_314();
                    continue block5;
                }
                case 2: {
                    this.cfr_renamed_3 = sprice.cfr_renamed_341(spryte2, true);
                    continue block5;
                }
                case 3: {
                    sprvva sprvva2 = spryte2.cfr_renamed_2456();
                    sprfce sprfce2 = this;
                    if (sprvva2 instanceof spryte) {
                        sprfce2.cfr_renamed_2 = sprmee.cfr_renamed_23(sprvva2);
                        continue block5;
                    }
                    sprfce2.cfr_renamed_1 = sprnhe.cfr_renamed_23(sprvva2);
                    continue block5;
                }
            }
            break;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprdgha.cfr_renamed_9(" O\u0006\u000e\u0016O\u0005\u000e\f[\u000fL\u0007\\X\u000e")).append(spryte2.cfr_renamed_312()).toString());
    }

    /*
     * WARNING - void declaration
     */
    public sprfce(String string, sprice sprice2, sprnhe sprnhe2) {
        void arg1;
        void arg0;
        sprfce sprfce2 = this;
        sprfce sprfce3 = this;
        sprfce3.cfr_renamed_4 = arg0;
        sprfce3.cfr_renamed_3 = arg1;
        sprfce2.cfr_renamed_2 = null;
        sprfce2.cfr_renamed_1 = sprnhe2;
    }

    public sprnhe cfr_renamed_4626() {
        return this.cfr_renamed_1;
    }

    public static sprfce cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprfce) {
            return (sprfce)arg0;
        }
        if (arg0 instanceof sprbne) {
            return new sprfce((sprbne)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprjxl.cfr_renamed_9("j\ro\u0004d\u0000oAl\u0003i\u0004`\u0015#\bmAd\u0004w(m\u0012w\u0000m\u0002f[#")).append(arg0.getClass().getName()).toString());
    }
}

