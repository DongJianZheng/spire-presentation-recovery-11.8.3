/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spragl;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdhl;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprdul;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprhil;
import com.spire.presentation.packages.sprjrl;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlgg;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmh;
import com.spire.presentation.packages.sprni;
import com.spire.presentation.packages.sprnuba;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprpfl;
import com.spire.presentation.packages.sprujha;
import com.spire.presentation.packages.sprzcl;
import java.security.AccessController;
import java.security.AlgorithmParameters;
import java.security.Provider;
import java.security.SecureRandom;

public class spricl {
    private final int cfr_renamed_119;
    private sprddm cfr_renamed_91;
    private sprdul cfr_renamed_0;
    private final sprlem cfr_renamed_1;
    private static final sprni cfr_renamed_2 = sprlgg.cfr_renamed_3;
    private AlgorithmParameters cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    public sprmh cfr_renamed_1451() throws sprlyl {
        spricl spricl2;
        sprco sprco2;
        if (this.cfr_renamed_3 != null) {
            spricl spricl3 = this;
            if (spricl3.cfr_renamed_0.cfr_renamed_10730(spricl3.cfr_renamed_1)) {
                spricl spricl4 = this;
                spricl spricl5 = this;
                return new sprzcl(spricl5, spricl4.cfr_renamed_1, spricl4.cfr_renamed_119, spricl5.cfr_renamed_3, this.cfr_renamed_4);
            }
            spricl spricl6 = this;
            spricl spricl7 = this;
            return new sprhil(spricl7, spricl6.cfr_renamed_1, spricl6.cfr_renamed_119, spricl7.cfr_renamed_3, this.cfr_renamed_4);
        }
        if (this.cfr_renamed_91 != null && (sprco2 = this.cfr_renamed_91.cfr_renamed_284()) != null && !sprco2.equals(sprpen.cfr_renamed_4)) {
            try {
                spricl spricl8 = this;
                this.cfr_renamed_3 = spricl8.cfr_renamed_0.cfr_renamed_10719(this.cfr_renamed_91.cfr_renamed_593());
                spricl8.cfr_renamed_3.init(sprco2.cfr_renamed_119().cfr_renamed_91());
                spricl2 = this;
            }
            catch (Exception exception) {
                throw new sprlyl(new StringBuilder().insert(0, sprujha.cfr_renamed_9("$x0t=sqb>6!d>u4e\"6!d>`8r4rqw=q>d8b9{\u0018r4x%\u007f7\u007f4dk6")).append(exception.toString()).toString(), exception);
            }
        } else {
            spricl2 = this;
        }
        if (spricl2.cfr_renamed_0.cfr_renamed_10730(this.cfr_renamed_1)) {
            spricl spricl9 = this;
            spricl spricl10 = this;
            return new sprzcl(spricl10, spricl9.cfr_renamed_1, spricl9.cfr_renamed_119, spricl10.cfr_renamed_3, this.cfr_renamed_4);
        }
        spricl spricl11 = this;
        spricl spricl12 = this;
        return new sprhil(spricl12, spricl11.cfr_renamed_1, spricl11.cfr_renamed_119, spricl12.cfr_renamed_3, this.cfr_renamed_4);
    }

    private static /* synthetic */ boolean cfr_renamed_10731() {
        return (Boolean)AccessController.doPrivileged(new spragl());
    }

    public spricl(sprlem arg0) {
        sprlem sprlem2 = arg0;
        this(sprlem2, cfr_renamed_2.cfr_renamed_7413(sprlem2));
    }

    /*
     * WARNING - void declaration
     */
    public spricl cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_0 = new sprdul(new sprpfl((String)arg0));
        return this;
    }

    public static /* synthetic */ sprdul cfr_renamed_10732(spricl arg0) {
        return arg0.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    public spricl(sprddm sprddm2) {
        this(arg0.cfr_renamed_593(), cfr_renamed_2.cfr_renamed_7413(arg0.cfr_renamed_593()));
        void arg0;
        this.cfr_renamed_91 = sprddm2;
    }

    /*
     * WARNING - void declaration
     */
    public spricl cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_0 = new sprdul(new sprdhl((Provider)arg0));
        return this;
    }

    public static /* synthetic */ boolean cfr_renamed_3565() {
        return spricl.cfr_renamed_10731();
    }

    /*
     * WARNING - void declaration
     */
    public spricl(sprlem sprlem2, int n) {
        void arg1;
        void arg0;
        spricl spricl2 = this;
        spricl2.cfr_renamed_0 = new sprdul(new sprjrl());
        spricl2.cfr_renamed_1 = sprlem2;
        void v1 = arg0;
        int n2 = cfr_renamed_2.cfr_renamed_7413((sprlem)v1);
        if (v1.cfr_renamed_5078(sprdl.cfr_renamed_2797)) {
            if (arg1 != 168 && arg1 != n2) {
                throw new IllegalArgumentException(sprnuba.cfr_renamed_9(")\u0016#\u00172\n%\u001b4X+\u001d9+)\u0002%X&\u00172X%\u0016#\n9\b4\u0011/\u0016\u000f1\u0004X0\u00193\u000b%\u001c`\f/X\"\r)\u0014$\u001d2V"));
            }
            this.cfr_renamed_119 = 168;
            return;
        }
        if (arg0.cfr_renamed_5078(sprgt.cfr_renamed_2)) {
            if (arg1 != 56 && arg1 != n2) {
                throw new IllegalArgumentException(sprujha.cfr_renamed_9("8x2y#d4u%6:s(E8l467y#64x2d(f%\u007f>x\u001e_\u00156!w\"e4rqb>63c8z5s#8"));
            }
            this.cfr_renamed_119 = 56;
            return;
        }
        if (n2 > 0 && n2 != arg1) {
            throw new IllegalArgumentException(sprnuba.cfr_renamed_9(")\u0016#\u00172\n%\u001b4X+\u001d9+)\u0002%X&\u00172X%\u0016#\n9\b4\u0011/\u0016\u000f1\u0004X0\u00193\u000b%\u001c`\f/X\"\r)\u0014$\u001d2V"));
        }
        this.cfr_renamed_119 = arg1;
    }

    public spricl cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public spricl cfr_renamed_10725(AlgorithmParameters arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }
}

