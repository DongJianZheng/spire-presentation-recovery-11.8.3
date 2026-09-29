/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprfwe;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprjle
extends sprkra {
    public int cfr_renamed_1;
    public sprooe cfr_renamed_2;
    public sprooe cfr_renamed_3;
    public sprooe cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprjle sprjle2 = this;
        sprlre2.cfr_renamed_49(new sprooe(this.cfr_renamed_1));
        sprlre2.cfr_renamed_49(sprjle2.cfr_renamed_3);
        sprlre3.cfr_renamed_49(sprjle2.cfr_renamed_2);
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        return new sprpse(sprlre2);
    }

    public sprjle(int arg0, BigInteger arg1, BigInteger arg2, BigInteger arg3) {
        sprjle sprjle2 = this;
        this.cfr_renamed_1 = arg0;
        sprjle sprjle3 = this;
        sprjle2.cfr_renamed_3 = new sprooe(arg1);
        sprjle3.cfr_renamed_2 = new sprooe(arg2);
        sprjle2.cfr_renamed_4 = new sprooe(arg3);
    }

    public BigInteger cfr_renamed_1155() {
        return this.cfr_renamed_3.cfr_renamed_162();
    }

    public BigInteger cfr_renamed_1778() {
        return this.cfr_renamed_4.cfr_renamed_162();
    }

    public static sprjle cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprjle.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public BigInteger cfr_renamed_1604() {
        return this.cfr_renamed_2.cfr_renamed_162();
    }

    public sprjle(sprbne sprbne2) {
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        this.cfr_renamed_1 = ((sprooe)enumeration.nextElement()).cfr_renamed_97().intValue();
        this.cfr_renamed_3 = (sprooe)enumeration.nextElement();
        this.cfr_renamed_2 = (sprooe)enumeration.nextElement();
        this.cfr_renamed_4 = (sprooe)enumeration.nextElement();
    }

    public int cfr_renamed_2398() {
        return this.cfr_renamed_1;
    }

    public int cfr_renamed_4810() {
        return this.cfr_renamed_1;
    }

    public static sprjle cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprjle) {
            return (sprjle)arg0;
        }
        if (arg0 instanceof sprbne) {
            return new sprjle((sprbne)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprfwe.cfr_renamed_9("GExJbBj\u000bId]\u007f=\u001f?\u001b^J|JcNzN|\u0011.")).append(arg0.getClass().getName()).toString());
    }
}

