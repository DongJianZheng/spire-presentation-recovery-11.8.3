/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcnx;
import com.spire.presentation.packages.sprhud;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprlxd;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.sprunb;
import com.spire.presentation.packages.sprver;
import com.spire.presentation.packages.sprvrd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.sprzb;
import java.math.BigInteger;

public class sprfpd
extends sprkra
implements sprtk {
    private sprrlb cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private static final BigInteger cfr_renamed_0 = BigInteger.valueOf(1L);
    private sprpib cfr_renamed_1;
    private BigInteger cfr_renamed_2;
    private BigInteger cfr_renamed_3;
    private sprvrd cfr_renamed_4;

    public byte[] cfr_renamed_2113() {
        return this.cfr_renamed_91;
    }

    public sprfpd(sprpib arg0, sprrlb arg1, BigInteger arg2) {
        this(arg0, arg1, arg2, cfr_renamed_0, null);
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre sprlre4 = sprlre2;
        sprlre sprlre5 = sprlre2;
        sprlre4.cfr_renamed_49(new sprooe(1L));
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        sprfpd sprfpd2 = this;
        sprlre4.cfr_renamed_49(new sprlxd(sprfpd2.cfr_renamed_1, sprfpd2.cfr_renamed_91));
        sprlre3.cfr_renamed_49(new sprhud(this.cfr_renamed_119));
        sprlre3.cfr_renamed_49(new sprooe(this.cfr_renamed_3));
        if (this.cfr_renamed_2 != null) {
            sprlre2.cfr_renamed_49(new sprooe(this.cfr_renamed_2));
        }
        return new sprpse(sprlre2);
    }

    public sprfpd(sprpib arg0, sprrlb arg1, BigInteger arg2, BigInteger arg3) {
        this(arg0, arg1, arg2, arg3, null);
    }

    /*
     * WARNING - void declaration
     */
    public sprfpd(sprpib sprpib2, sprrlb sprrlb2, BigInteger bigInteger, BigInteger bigInteger2, byte[] byArray) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprfpd sprfpd2 = this;
        sprfpd sprfpd3 = this;
        this.cfr_renamed_1 = arg0;
        sprfpd3.cfr_renamed_119 = arg1.cfr_renamed_1775();
        sprfpd3.cfr_renamed_3 = arg2;
        sprfpd2.cfr_renamed_2 = arg3;
        sprfpd2.cfr_renamed_91 = arg4;
        if (sprunb.cfr_renamed_1838(sprpib2)) {
            sprfpd sprfpd4 = this;
            sprfpd4.cfr_renamed_4 = new sprvrd(arg0.cfr_renamed_845().cfr_renamed_1762());
            return;
        }
        if (sprunb.cfr_renamed_2012((sprpib)arg0)) {
            int[] nArray = ((sprzb)arg0.cfr_renamed_845()).cfr_renamed_1764().cfr_renamed_1765();
            if (nArray.length == 3) {
                this.cfr_renamed_4 = new sprvrd(nArray[2], nArray[1]);
                return;
            }
            if (nArray.length == 5) {
                this.cfr_renamed_4 = new sprvrd(nArray[4], nArray[1], nArray[2], nArray[3]);
                return;
            }
            throw new IllegalArgumentException(sprver.cfr_renamed_9("\u001fJ<]pP\"M>K=M1HpE>@pT5J$K=M1HpG%V&A#\u00041V5\u0004#Q T?V$A4"));
        }
        throw new IllegalArgumentException(sprcnx.cfr_renamed_9("b/0>3)bl,?e##l$\"e9+?0<5#78 (e8<< "));
    }

    public static sprfpd cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprfpd) {
            return (sprfpd)arg0;
        }
        if (arg0 != null) {
            return new sprfpd(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public BigInteger cfr_renamed_1153() {
        if (this.cfr_renamed_2 == null) {
            return cfr_renamed_0;
        }
        return this.cfr_renamed_2;
    }

    public BigInteger cfr_renamed_1146() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprfpd(sprbne sprbne2) {
        sprfpd sprfpd2;
        void arg0;
        if (!(sprbne2.cfr_renamed_85(0) instanceof sprooe) || !((sprooe)arg0.cfr_renamed_85(0)).cfr_renamed_97().equals(cfr_renamed_0)) {
            throw new IllegalArgumentException(sprver.cfr_renamed_9("2E4\u0004&A\"W9K>\u00049Jp|ia\u0013t1V1I5P5V#"));
        }
        sprlxd sprlxd2 = new sprlxd(sprvrd.cfr_renamed_23(arg0.cfr_renamed_85(1)), sprbne.cfr_renamed_23(arg0.cfr_renamed_85(2)));
        this.cfr_renamed_1 = sprlxd2.cfr_renamed_1769();
        spra spra2 = arg0.cfr_renamed_85(3);
        if (spra2 instanceof sprhud) {
            this.cfr_renamed_119 = ((sprhud)spra2).cfr_renamed_2322();
            sprfpd2 = this;
        } else {
            this.cfr_renamed_119 = new sprhud(this.cfr_renamed_1, (sprxue)spra2).cfr_renamed_2322();
            sprfpd2 = this;
        }
        sprfpd2.cfr_renamed_3 = ((sprooe)arg0.cfr_renamed_85(4)).cfr_renamed_97();
        this.cfr_renamed_91 = sprlxd2.cfr_renamed_2113();
        if (arg0.cfr_renamed_84() == 6) {
            this.cfr_renamed_2 = ((sprooe)arg0.cfr_renamed_85(5)).cfr_renamed_97();
        }
    }

    public sprrlb cfr_renamed_1145() {
        return this.cfr_renamed_119;
    }

    public sprpib cfr_renamed_1769() {
        return this.cfr_renamed_1;
    }
}

