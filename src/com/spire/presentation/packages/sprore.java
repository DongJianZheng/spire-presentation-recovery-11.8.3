/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprfma;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprore
extends sprkra {
    public sprooe cfr_renamed_91;
    public sprooe cfr_renamed_0;
    public sprooe cfr_renamed_1;
    public sprooe cfr_renamed_2;
    public sprooe cfr_renamed_3;
    public sprooe cfr_renamed_4;

    public sprore(BigInteger arg0, BigInteger arg1, BigInteger arg2, BigInteger arg3, int arg4, BigInteger arg5) {
        sprore sprore2 = this;
        this.cfr_renamed_91 = new sprooe(arg0);
        sprore2.cfr_renamed_1 = new sprooe(arg1);
        this.cfr_renamed_4 = new sprooe(arg2);
        this.cfr_renamed_3 = new sprooe(arg3);
        this.cfr_renamed_2 = new sprooe(arg4);
        this.cfr_renamed_0 = new sprooe(arg5);
    }

    public BigInteger cfr_renamed_1604() {
        return this.cfr_renamed_3.cfr_renamed_162();
    }

    public static sprore cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprore.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public BigInteger cfr_renamed_1778() {
        return this.cfr_renamed_91.cfr_renamed_162();
    }

    public static sprore cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprore) {
            return (sprore)arg0;
        }
        if (arg0 instanceof sprbne) {
            return new sprore((sprbne)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprfma.cfr_renamed_9("t!K.Q&Yoz\u0000n\u001b\u000e{\f\u007fm.O.P*I*Ou\u001d")).append(arg0.getClass().getName()).toString());
    }

    public BigInteger cfr_renamed_1155() {
        return this.cfr_renamed_4.cfr_renamed_162();
    }

    public sprore(sprbne sprbne2) {
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        this.cfr_renamed_91 = (sprooe)enumeration.nextElement();
        this.cfr_renamed_1 = (sprooe)enumeration.nextElement();
        this.cfr_renamed_4 = (sprooe)enumeration.nextElement();
        this.cfr_renamed_3 = (sprooe)enumeration.nextElement();
        this.cfr_renamed_2 = (sprooe)enumeration.nextElement();
        this.cfr_renamed_0 = (sprooe)enumeration.nextElement();
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprore sprore2 = this;
        sprlre sprlre4 = sprlre2;
        sprore sprore3 = this;
        sprlre2.cfr_renamed_49(sprore3.cfr_renamed_91);
        sprlre4.cfr_renamed_49(sprore3.cfr_renamed_1);
        sprlre4.cfr_renamed_49(this.cfr_renamed_4);
        sprlre2.cfr_renamed_49(sprore2.cfr_renamed_3);
        sprlre3.cfr_renamed_49(sprore2.cfr_renamed_2);
        sprlre3.cfr_renamed_49(this.cfr_renamed_0);
        return new sprpse(sprlre2);
    }
}

