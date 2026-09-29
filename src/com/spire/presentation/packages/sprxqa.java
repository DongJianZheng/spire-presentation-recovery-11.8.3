/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.spretc;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlid;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpsd;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryee;
import com.spire.presentation.packages.spryte;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprxqa
extends sprkra {
    public sprxue cfr_renamed_2;
    public sprooe cfr_renamed_3;
    public spryee cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprxqa(byte[] byArray, spryee spryee2, BigInteger bigInteger) {
        void arg2;
        void arg1;
        void arg0;
        sprxqa sprxqa2 = this;
        sprxqa sprxqa3 = this;
        sprxqa3.cfr_renamed_2 = null;
        sprxqa3.cfr_renamed_4 = null;
        sprxqa2.cfr_renamed_3 = null;
        sprxqa2.cfr_renamed_2 = byArray != null ? new sprlqe((byte[])arg0) : null;
        sprxqa sprxqa4 = this;
        sprxqa4.cfr_renamed_4 = arg1;
        sprxqa4.cfr_renamed_3 = arg2 != null ? new sprooe((BigInteger)arg2) : null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public sprxqa(sprbne sprbne2) {
        sprxqa sprxqa2 = this;
        this.cfr_renamed_2 = null;
        sprxqa2.cfr_renamed_4 = null;
        sprxqa2.cfr_renamed_3 = null;
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        block5: while (true) {
            if (!enumeration.hasMoreElements()) {
                return;
            }
            spryte spryte2 = sprhse.cfr_renamed_23(enumeration.nextElement());
            switch (spryte2.cfr_renamed_312()) {
                case 0: {
                    this.cfr_renamed_2 = sprxue.cfr_renamed_341(spryte2, false);
                    continue block5;
                }
                case 1: {
                    this.cfr_renamed_4 = spryee.cfr_renamed_341(spryte2, false);
                    continue block5;
                }
                case 2: {
                    this.cfr_renamed_3 = sprooe.cfr_renamed_341(spryte2, false);
                    continue block5;
                }
            }
            break;
        }
        throw new IllegalArgumentException(spretc.cfr_renamed_9("\nu\u000f|\u0004x\u000f9\u0017x\u0004"));
    }

    public static sprxqa cfr_renamed_2757(sprszd arg0) {
        return sprxqa.cfr_renamed_23(arg0.cfr_renamed_4477(sprtie.cfr_renamed_96));
    }

    public spryee cfr_renamed_288() {
        return this.cfr_renamed_4;
    }

    public sprxqa(spryee arg0, BigInteger arg1) {
        this((byte[])null, arg0, arg1);
    }

    public String toString() {
        return new StringBuilder().insert(0, sprpsd.cfr_renamed_9("\u0019G,Z7@1F!y=K\u0011V=\\,[>[=@b\u0012\u0013W!{\u001c\u001a")).append(this.cfr_renamed_2.cfr_renamed_186()).append(")").toString();
    }

    /*
     * WARNING - void declaration
     */
    public sprxqa(sprdce sprdce2) {
        void arg0;
        sprxqa sprxqa2 = this;
        this.cfr_renamed_2 = null;
        sprxqa2.cfr_renamed_4 = null;
        sprxqa2.cfr_renamed_3 = null;
        sprlid sprlid2 = new sprlid();
        byte[] byArray = new byte[sprlid2.cfr_renamed_1218()];
        byte[] byArray2 = arg0.cfr_renamed_2314().cfr_renamed_81();
        sprlid2.cfr_renamed_1197(byArray2, 0, byArray2.length);
        sprlid2.cfr_renamed_1219(byArray, 0);
        sprxqa sprxqa3 = this;
        sprxqa3.cfr_renamed_2 = new sprlqe(byArray);
    }

    public byte[] cfr_renamed_327() {
        if (this.cfr_renamed_2 != null) {
            return this.cfr_renamed_2.cfr_renamed_186();
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_2 != null) {
            sprlre2.cfr_renamed_49(new sprhse(0 != 0, 0, this.cfr_renamed_2));
        }
        if (this.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(new sprhse(false, 1, this.cfr_renamed_4));
        }
        if (this.cfr_renamed_3 != null) {
            sprlre2.cfr_renamed_49(new sprhse(false, 2, this.cfr_renamed_3));
        }
        return new sprpse(sprlre2);
    }

    public static sprxqa cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprxqa.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public static sprxqa cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprxqa) {
            return (sprxqa)arg0;
        }
        if (arg0 != null) {
            return new sprxqa(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprxqa(sprdce sprdce2, spryee spryee2, BigInteger bigInteger) {
        void arg2;
        void arg1;
        void arg0;
        sprxqa sprxqa2 = this;
        this.cfr_renamed_2 = null;
        sprxqa2.cfr_renamed_4 = null;
        sprxqa2.cfr_renamed_3 = null;
        sprlid sprlid2 = new sprlid();
        byte[] byArray = new byte[sprlid2.cfr_renamed_1218()];
        byte[] byArray2 = arg0.cfr_renamed_2314().cfr_renamed_81();
        sprlid2.cfr_renamed_1197(byArray2, 0, byArray2.length);
        sprlid2.cfr_renamed_1219(byArray, 0);
        sprxqa sprxqa3 = this;
        sprxqa sprxqa4 = this;
        sprxqa3.cfr_renamed_2 = new sprlqe(byArray);
        sprxqa3.cfr_renamed_4 = spryee.cfr_renamed_23(arg1.cfr_renamed_119());
        sprxqa3.cfr_renamed_3 = new sprooe((BigInteger)arg2);
    }

    public BigInteger cfr_renamed_290() {
        if (this.cfr_renamed_3 != null) {
            return this.cfr_renamed_3.cfr_renamed_97();
        }
        return null;
    }

    public sprxqa(byte[] arg0) {
        this(arg0, null, null);
    }
}

