/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvge;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwcq;
import com.spire.presentation.packages.sprwqc;
import com.spire.presentation.packages.spryte;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprwbe
extends sprkra {
    private sprooe cfr_renamed_0;
    private sprooe cfr_renamed_1;
    private sprooe cfr_renamed_2;
    private sprvge cfr_renamed_3;
    private sprooe cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprwbe(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, sprvge sprvge2) {
        void arg4;
        void arg3;
        void arg0;
        void arg2;
        void arg1;
        if (bigInteger == null) {
            throw new IllegalArgumentException(sprwqc.cfr_renamed_9("\u000ev\u000e&JgGhFr\tdL&GsEj"));
        }
        if (arg1 == null) {
            throw new IllegalArgumentException(sprwcq.cfr_renamed_9("080\u007ft>y1x+7=r\u007fy*{3"));
        }
        if (arg2 == null) {
            throw new IllegalArgumentException(sprwqc.cfr_renamed_9("\u000ew\u000e&JgGhFr\tdL&GsEj"));
        }
        sprwbe sprwbe2 = this;
        sprwbe2.cfr_renamed_1 = new sprooe((BigInteger)arg0);
        sprwbe sprwbe3 = this;
        sprwbe2.cfr_renamed_2 = new sprooe((BigInteger)arg1);
        sprwbe3.cfr_renamed_0 = new sprooe((BigInteger)arg2);
        sprwbe2.cfr_renamed_4 = new sprooe((BigInteger)arg3);
        this.cfr_renamed_3 = arg4;
    }

    public sprooe cfr_renamed_2616() {
        return this.cfr_renamed_4;
    }

    public sprooe cfr_renamed_1155() {
        return this.cfr_renamed_1;
    }

    public sprooe cfr_renamed_1145() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprwbe(sprbne sprbne2) {
        Enumeration enumeration;
        void arg0;
        if (sprbne2.cfr_renamed_84() < 3 || arg0.cfr_renamed_84() > 5) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprwcq.cfr_renamed_9("\u001dv;7,r.b:y<r\u007fd6m:-\u007f")).append(arg0.cfr_renamed_84()).toString());
        }
        Enumeration enumeration2 = enumeration = arg0.cfr_renamed_329();
        sprwbe sprwbe2 = this;
        sprwbe2.cfr_renamed_1 = sprooe.cfr_renamed_23(enumeration.nextElement());
        sprwbe2.cfr_renamed_2 = sprooe.cfr_renamed_23(enumeration.nextElement());
        this.cfr_renamed_0 = sprooe.cfr_renamed_23(enumeration2.nextElement());
        spra spra2 = sprwbe.cfr_renamed_4443(enumeration2);
        if (spra2 != null && spra2 instanceof sprooe) {
            this.cfr_renamed_4 = sprooe.cfr_renamed_23(spra2);
            spra2 = sprwbe.cfr_renamed_4443(enumeration);
        }
        if (spra2 != null) {
            this.cfr_renamed_3 = sprvge.cfr_renamed_23(spra2.cfr_renamed_119());
        }
    }

    public static sprwbe cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprwbe) {
            return (sprwbe)arg0;
        }
        if (arg0 instanceof sprbne) {
            return new sprwbe((sprbne)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprwqc.cfr_renamed_9("`h_gEoM&mNmiDg@hyg[gDc]c[u\u0013&")).append(arg0.getClass().getName()).toString());
    }

    public sprooe cfr_renamed_1604() {
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    public sprwbe(sprooe sprooe2, sprooe sprooe3, sprooe sprooe4, sprooe sprooe5, sprvge sprvge2) {
        void arg4;
        void arg3;
        void arg0;
        void arg2;
        void arg1;
        if (sprooe2 == null) {
            throw new IllegalArgumentException(sprwcq.cfr_renamed_9("0/0\u007ft>y1x+7=r\u007fy*{3"));
        }
        if (arg1 == null) {
            throw new IllegalArgumentException(sprwqc.cfr_renamed_9("\u000ea\u000e&JgGhFr\tdL&GsEj"));
        }
        if (arg2 == null) {
            throw new IllegalArgumentException(sprwcq.cfr_renamed_9("0.0\u007ft>y1x+7=r\u007fy*{3"));
        }
        sprwbe sprwbe2 = this;
        sprwbe sprwbe3 = this;
        sprwbe3.cfr_renamed_1 = arg0;
        sprwbe3.cfr_renamed_2 = arg1;
        sprwbe2.cfr_renamed_0 = arg2;
        sprwbe2.cfr_renamed_4 = arg3;
        this.cfr_renamed_3 = arg4;
    }

    public static sprwbe cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprwbe.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprwbe sprwbe2 = this;
        sprlre sprlre3 = sprlre2;
        sprlre3.cfr_renamed_49(this.cfr_renamed_1);
        sprlre3.cfr_renamed_49(this.cfr_renamed_2);
        sprlre2.cfr_renamed_49(sprwbe2.cfr_renamed_0);
        if (sprwbe2.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        }
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        }
        return new sprpse(sprlre2);
    }

    private static /* synthetic */ spra cfr_renamed_4443(Enumeration arg0) {
        if (arg0.hasMoreElements()) {
            return (spra)arg0.nextElement();
        }
        return null;
    }

    public sprvge cfr_renamed_2617() {
        return this.cfr_renamed_3;
    }
}

