/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcfp;
import com.spire.presentation.packages.sprgge;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprksa;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprqid;
import com.spire.presentation.packages.sprrge;
import com.spire.presentation.packages.sprunb;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.sprzb;
import com.spire.presentation.packages.sprzra;
import java.math.BigInteger;

public class sprpke
extends sprkra {
    public sprxue cfr_renamed_91;
    public sprxue cfr_renamed_0;
    public sprgge cfr_renamed_1;
    public sprooe cfr_renamed_2;
    public BigInteger cfr_renamed_3 = BigInteger.valueOf(0L);
    public sprooe cfr_renamed_4;

    public BigInteger cfr_renamed_1778() {
        return this.cfr_renamed_2.cfr_renamed_97();
    }

    /*
     * WARNING - void declaration
     */
    public sprpke(sprqid sprqid2) {
        void arg0;
        sprpke sprpke2;
        sprpib sprpib2 = sprqid2.cfr_renamed_1769();
        if (!sprunb.cfr_renamed_2012(sprpib2)) {
            throw new IllegalArgumentException(sprcfp.cfr_renamed_9("G\u001aD\r\b\u0016A\u001aI\u0006QTL\u001bE\u0015A\u001a\b\u001d[TX\u001b[\u0007A\u0016D\u0011"));
        }
        int[] nArray = ((sprzb)sprpib2.cfr_renamed_845()).cfr_renamed_1764().cfr_renamed_1765();
        if (nArray.length == 3) {
            sprpke2 = this;
            this.cfr_renamed_1 = new sprgge(nArray[2], nArray[1]);
        } else {
            if (nArray.length == 5) {
                this.cfr_renamed_1 = new sprgge(nArray[4], nArray[1], nArray[2], nArray[3]);
            }
            sprpke2 = this;
        }
        sprpke2.cfr_renamed_2 = new sprooe(sprpib2.cfr_renamed_1778().cfr_renamed_1779());
        sprpke sprpke3 = this;
        sprpke3.cfr_renamed_0 = new sprlqe(sprpib2.cfr_renamed_1997().cfr_renamed_91());
        sprpke3.cfr_renamed_4 = new sprooe(arg0.cfr_renamed_1146());
        sprpke3.cfr_renamed_91 = new sprlqe(sprrge.cfr_renamed_2512(arg0.cfr_renamed_1145()));
    }

    public BigInteger cfr_renamed_1146() {
        return this.cfr_renamed_4.cfr_renamed_97();
    }

    public byte[] cfr_renamed_1145() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_91.cfr_renamed_186());
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ sprpke(sprbne sprbne2) {
        sprpke sprpke2;
        void arg0;
        int n = 0;
        if (sprbne2.cfr_renamed_85(0) instanceof spryte) {
            spryte spryte2 = (spryte)arg0.cfr_renamed_85(n);
            if (!spryte2.cfr_renamed_4567() || 0 != spryte2.cfr_renamed_312()) throw new IllegalArgumentException(sprksa.cfr_renamed_9("\nH\u000fO\u0006^EZ\u0004X\u0016OEO\u0017X\nX"));
            sprpke2 = this;
            this.cfr_renamed_3 = sprooe.cfr_renamed_23(spryte2.cfr_renamed_2414()).cfr_renamed_97();
        } else {
            sprpke2 = this;
        }
        int n2 = ++n;
        sprpke2.cfr_renamed_1 = sprgge.cfr_renamed_23(arg0.cfr_renamed_85(n2));
        sprpke sprpke3 = this;
        void v3 = arg0;
        int n3 = ++n;
        this.cfr_renamed_2 = sprooe.cfr_renamed_23(arg0.cfr_renamed_85(n3));
        int n4 = ++n;
        this.cfr_renamed_0 = sprxue.cfr_renamed_23(v3.cfr_renamed_85(n4));
        int n5 = ++n;
        sprpke3.cfr_renamed_4 = sprooe.cfr_renamed_23(v3.cfr_renamed_85(n5));
        sprpke3.cfr_renamed_91 = sprxue.cfr_renamed_23(arg0.cfr_renamed_85(++n));
    }

    public byte[] cfr_renamed_1997() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_0.cfr_renamed_186());
    }

    public static sprpke cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprpke) {
            return (sprpke)arg0;
        }
        if (arg0 != null) {
            return new sprpke(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprgge cfr_renamed_845() {
        return this.cfr_renamed_1;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (0 != this.cfr_renamed_3.compareTo(BigInteger.valueOf(0L))) {
            sprlre2.cfr_renamed_49(new sprhse(true, 0, new sprooe(this.cfr_renamed_3)));
        }
        sprlre sprlre3 = sprlre2;
        sprpke sprpke2 = this;
        sprlre sprlre4 = sprlre2;
        sprpke sprpke3 = this;
        sprlre2.cfr_renamed_49(sprpke3.cfr_renamed_1);
        sprlre4.cfr_renamed_49(sprpke3.cfr_renamed_2);
        sprlre4.cfr_renamed_49(this.cfr_renamed_0);
        sprlre3.cfr_renamed_49(sprpke2.cfr_renamed_4);
        sprlre3.cfr_renamed_49(sprpke2.cfr_renamed_91);
        return new sprpse(sprlre2);
    }
}

