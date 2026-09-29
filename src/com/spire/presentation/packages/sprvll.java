/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraol;
import com.spire.presentation.packages.sprbpm;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprcmm;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprfz;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprnfg;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprtwl;
import com.spire.presentation.packages.sprxra;
import com.spire.presentation.packages.spryrm;
import java.security.SecureRandom;

public abstract class sprvll
implements sprfz {
    private sprddm cfr_renamed_86;
    private int cfr_renamed_152;
    private int cfr_renamed_112;
    private int cfr_renamed_119;
    private byte[] cfr_renamed_91;
    public char[] cfr_renamed_0;
    private SecureRandom cfr_renamed_1;
    private sprlem cfr_renamed_2;
    private int cfr_renamed_3;
    private spraol cfr_renamed_4;

    public abstract byte[] cfr_renamed_10670(int var1, sprddm var2, int var3) throws sprlyl;

    public sprvll(sprlem arg0, char[] arg1) {
        sprlem sprlem2 = arg0;
        this(sprlem2, arg1, sprvll.cfr_renamed_7413(sprlem2), (Integer)sprtwl.cfr_renamed_3.get(arg0));
    }

    public sprvll cfr_renamed_4012(int arg0) {
        this.cfr_renamed_112 = arg0;
        return this;
    }

    public sprvll cfr_renamed_10672(spraol arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public sprvll cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_1 = arg0;
        return this;
    }

    @Override
    public sprbpm cfr_renamed_10668(sprnfg arg0) throws sprlyl {
        sprvll sprvll2 = this;
        byte[] byArray = new byte[sprvll2.cfr_renamed_152];
        if (sprvll2.cfr_renamed_1 == null) {
            sprvll sprvll3 = this;
            sprvll3.cfr_renamed_1 = new SecureRandom();
        }
        sprvll sprvll4 = this;
        sprvll4.cfr_renamed_1.nextBytes(byArray);
        if (sprvll4.cfr_renamed_91 == null) {
            this.cfr_renamed_91 = new byte[20];
            this.cfr_renamed_1.nextBytes(this.cfr_renamed_91);
        }
        sprvll sprvll5 = this;
        sprvll sprvll6 = this;
        sprvll5.cfr_renamed_86 = new sprddm(sprdl.cfr_renamed_3247, new spryrm(sprvll6.cfr_renamed_91, sprvll6.cfr_renamed_119, this.cfr_renamed_4.cfr_renamed_1));
        sprvll sprvll7 = this;
        byte[] byArray2 = sprvll7.cfr_renamed_10670(sprvll5.cfr_renamed_112, this.cfr_renamed_86, sprvll7.cfr_renamed_3);
        byte[] byArray3 = sprvll5.cfr_renamed_10673(new sprddm(this.cfr_renamed_2, new sprfvg(byArray)), byArray2, arg0);
        sprfvg sprfvg2 = new sprfvg(byArray3);
        sprrvm sprrvm2 = new sprrvm();
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        sprrvm2.cfr_renamed_5004(new sprfvg(byArray));
        sprddm sprddm2 = new sprddm(sprdl.cfr_renamed_1579, new sprcen(sprrvm2));
        return new sprbpm(new sprcmm(this.cfr_renamed_86, sprddm2, sprfvg2));
    }

    private static /* synthetic */ int cfr_renamed_7413(sprlem arg0) {
        Integer n = (Integer)sprtwl.cfr_renamed_4.get(arg0);
        if (n == null) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprxra.cfr_renamed_9("a\u0019l\u0016m\f\"\u001ek\u0016fXi\u001d{Xq\u0011x\u001d\"\u001em\n\"\u0019n\u001fm\nk\fj\u00158X")).append(arg0).toString());
        }
        return n;
    }

    public abstract byte[] cfr_renamed_10673(sprddm var1, byte[] var2, sprnfg var3) throws sprlyl;

    /*
     * WARNING - void declaration
     */
    public sprvll cfr_renamed_4013(byte[] byArray, int n) {
        void arg0;
        this.cfr_renamed_91 = sproze.cfr_renamed_158((byte[])arg0);
        this.cfr_renamed_119 = n;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprvll(sprlem sprlem2, char[] cArray, int n, int n2) {
        void arg3;
        void arg2;
        void arg0;
        void arg1;
        sprvll sprvll2 = this;
        sprvll sprvll3 = this;
        sprvll sprvll4 = this;
        sprvll4.cfr_renamed_0 = arg1;
        sprvll4.cfr_renamed_112 = 1;
        sprvll3.cfr_renamed_2 = arg0;
        sprvll3.cfr_renamed_3 = arg2;
        sprvll2.cfr_renamed_152 = arg3;
        sprvll2.cfr_renamed_4 = spraol.cfr_renamed_0;
        sprvll2.cfr_renamed_119 = 1024;
    }
}

