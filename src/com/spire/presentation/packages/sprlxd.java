/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprfqd;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprktb;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprnra;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprshha;
import com.spire.presentation.packages.sprtjb;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprunb;
import com.spire.presentation.packages.sprvrd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import java.math.BigInteger;

public class sprlxd
extends sprkra
implements sprtk {
    private sprtzd cfr_renamed_1472 = null;
    private sprpib cfr_renamed_3;
    private byte[] cfr_renamed_4;

    public byte[] cfr_renamed_2113() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlxd sprlxd2;
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_1472.equals(cfr_renamed_86)) {
            sprlxd2 = this;
            sprlre sprlre3 = sprlre2;
            sprlre3.cfr_renamed_49(new sprfqd(this.cfr_renamed_3.cfr_renamed_1778()).cfr_renamed_119());
            sprlre3.cfr_renamed_49(new sprfqd(this.cfr_renamed_3.cfr_renamed_1997()).cfr_renamed_119());
        } else {
            if (this.cfr_renamed_1472.equals(cfr_renamed_272)) {
                sprlre sprlre4 = sprlre2;
                sprlre4.cfr_renamed_49(new sprfqd(this.cfr_renamed_3.cfr_renamed_1778()).cfr_renamed_119());
                sprlre4.cfr_renamed_49(new sprfqd(this.cfr_renamed_3.cfr_renamed_1997()).cfr_renamed_119());
            }
            sprlxd2 = this;
        }
        if (sprlxd2.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(new sprmra(this.cfr_renamed_4));
        }
        return new sprpse(sprlre2);
    }

    private /* synthetic */ void cfr_renamed_4437() {
        if (sprunb.cfr_renamed_1838(this.cfr_renamed_3)) {
            this.cfr_renamed_1472 = cfr_renamed_86;
            return;
        }
        if (sprunb.cfr_renamed_2012(this.cfr_renamed_3)) {
            this.cfr_renamed_1472 = cfr_renamed_272;
            return;
        }
        throw new IllegalArgumentException(sprnra.cfr_renamed_9(":Y\u0007BNE\u0017A\u000b\u0011\u0001WNt-r\u001bC\u0018TNX\u001d\u0011\u0000^\u001a\u0011\u0007\\\u001e]\u000b\\\u000b_\u001aT\n"));
    }

    /*
     * WARNING - void declaration
     */
    public sprlxd(sprpib sprpib2, byte[] byArray) {
        void arg0;
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_4 = byArray;
        this.cfr_renamed_4437();
    }

    /*
     * WARNING - void declaration
     */
    public sprlxd(sprpib sprpib2) {
        void arg0;
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_4 = null;
        this.cfr_renamed_4437();
    }

    public sprpib cfr_renamed_1769() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprlxd(sprvrd sprvrd2, sprbne sprbne2) {
        void v0;
        void arg1;
        void arg0;
        this.cfr_renamed_1472 = sprvrd2.cfr_renamed_4028();
        if (this.cfr_renamed_1472.equals(cfr_renamed_86)) {
            BigInteger bigInteger = ((sprooe)arg0.cfr_renamed_284()).cfr_renamed_97();
            sprfqd sprfqd2 = new sprfqd(bigInteger, (sprxue)arg1.cfr_renamed_85(0));
            sprfqd sprfqd3 = new sprfqd(bigInteger, (sprxue)arg1.cfr_renamed_85(1));
            v0 = arg1;
            sprlxd sprlxd2 = this;
            sprlxd2.cfr_renamed_3 = new sprtjb(bigInteger, sprfqd2.cfr_renamed_97().cfr_renamed_1779(), sprfqd3.cfr_renamed_97().cfr_renamed_1779());
        } else if (this.cfr_renamed_1472.equals(cfr_renamed_272)) {
            sprkra sprkra2;
            sprbne sprbne3 = sprbne.cfr_renamed_23(arg0.cfr_renamed_284());
            int n = ((sprooe)sprbne3.cfr_renamed_85(0)).cfr_renamed_97().intValue();
            sprtzd sprtzd2 = (sprtzd)sprbne3.cfr_renamed_85(1);
            int n2 = 0;
            int n3 = 0;
            int n4 = 0;
            if (sprtzd2.equals(cfr_renamed_805)) {
                n2 = sprooe.cfr_renamed_23(sprbne3.cfr_renamed_85(2)).cfr_renamed_97().intValue();
            } else if (sprtzd2.equals(cfr_renamed_114)) {
                sprkra2 = sprbne.cfr_renamed_23(sprbne3.cfr_renamed_85(2));
                n2 = sprooe.cfr_renamed_23(((sprbne)sprkra2).cfr_renamed_85(0)).cfr_renamed_97().intValue();
                n3 = sprooe.cfr_renamed_23(((sprbne)sprkra2).cfr_renamed_85(1)).cfr_renamed_97().intValue();
                n4 = sprooe.cfr_renamed_23(((sprbne)sprkra2).cfr_renamed_85(2)).cfr_renamed_97().intValue();
            } else {
                throw new IllegalArgumentException(sprshha.cfr_renamed_9("\u0011D,_eX<\\ \f*Jei\u0006\f'M6E6\f,_eB*XeE(\\)I(I+X H"));
            }
            sprkra2 = new sprfqd(n, n2, n3, n4, (sprxue)arg1.cfr_renamed_85(0));
            sprfqd sprfqd4 = new sprfqd(n, n2, n3, n4, (sprxue)arg1.cfr_renamed_85(1));
            v0 = arg1;
            this.cfr_renamed_3 = new sprktb(n, n2, n3, n4, ((sprfqd)sprkra2).cfr_renamed_97().cfr_renamed_1779(), sprfqd4.cfr_renamed_97().cfr_renamed_1779());
        } else {
            throw new IllegalArgumentException(sprnra.cfr_renamed_9(":Y\u0007BNE\u0017A\u000b\u0011\u0001WNt-r\u001bC\u0018TNX\u001d\u0011\u0000^\u001a\u0011\u0007\\\u001e]\u000b\\\u000b_\u001aT\n"));
        }
        if (v0.cfr_renamed_84() == 3) {
            this.cfr_renamed_4 = ((sprmra)arg1.cfr_renamed_85(2)).cfr_renamed_81();
        }
    }
}

