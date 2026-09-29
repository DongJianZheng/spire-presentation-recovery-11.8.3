/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcsl;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprij;
import com.spire.presentation.packages.sprisda;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlzz;
import com.spire.presentation.packages.sprns;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprpp;
import com.spire.presentation.packages.sprsf;
import com.spire.presentation.packages.sprtlm;
import com.spire.presentation.packages.sprwy;
import com.spire.presentation.packages.sprzol;
import java.security.SecureRandom;

public class sprsol
implements sprij {
    private int cfr_renamed_112;
    private sprtlm cfr_renamed_119;
    private sprddm cfr_renamed_91;
    private int cfr_renamed_0;
    private SecureRandom cfr_renamed_1;
    private int cfr_renamed_2;
    private sprddm cfr_renamed_3;
    private sprpp cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprsol(sprpp sprpp2) {
        this(new sprddm(sprgt.cfr_renamed_0), 1000, new sprddm(sprns.cfr_renamed_4, sprpen.cfr_renamed_4), (sprpp)arg0);
        void arg0;
    }

    private /* synthetic */ sprsf cfr_renamed_10959(sprtlm arg0, char[] arg1) throws sprcsl {
        byte[] byArray = sprkoe.cfr_renamed_432(arg1);
        byte[] byArray2 = arg0.cfr_renamed_1477().cfr_renamed_186();
        byte[] byArray3 = new byte[byArray.length + byArray2.length];
        System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
        System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
        sprtlm sprtlm2 = arg0;
        this.cfr_renamed_4.cfr_renamed_10958(arg0.cfr_renamed_4336(), sprtlm2.cfr_renamed_1472());
        int n = sprtlm2.cfr_renamed_1478().cfr_renamed_5023();
        do {
            byArray3 = this.cfr_renamed_4.cfr_renamed_3213(byArray3);
        } while (--n > 0);
        byte[] byArray4 = byArray3;
        return new sprzol(this, arg0, byArray4);
    }

    public static /* synthetic */ sprpp cfr_renamed_10960(sprsol arg0) {
        return arg0.cfr_renamed_4;
    }

    public sprsol cfr_renamed_1616(int arg0) {
        if (arg0 < 100) {
            throw new IllegalArgumentException(sprisda.cfr_renamed_9("'\r+\u000b/\r'\u0016 Y-\u0016;\u0017:Y#\f=\rn\u001b+Y/\rn\u0015+\u0018=\rnH~I"));
        }
        this.cfr_renamed_4334(arg0);
        this.cfr_renamed_2 = arg0;
        return this;
    }

    public sprsol cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_1 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprsol cfr_renamed_10957(sprtlm sprtlm2) {
        void arg0;
        sprsol sprsol2 = this;
        sprsol2.cfr_renamed_4334(arg0.cfr_renamed_1478().cfr_renamed_5023());
        sprsol2.cfr_renamed_119 = sprtlm2;
        return sprsol2;
    }

    public sprsol cfr_renamed_4337(int arg0) {
        if (arg0 < 8) {
            throw new IllegalArgumentException(sprlzz.cfr_renamed_9("SeLp\u0000hEjGpH$MqSp\u0000fE$Ap\u0000hEeSp\u0000<\u0000fYpEw"));
        }
        this.cfr_renamed_112 = arg0;
        return this;
    }

    private /* synthetic */ void cfr_renamed_4334(int arg0) {
        if (this.cfr_renamed_0 > 0 && arg0 > this.cfr_renamed_0) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprisda.cfr_renamed_9("\u0010:\u001c<\u0018:\u0010!\u0017n\u001a!\f \rn\u001c6\u001a+\u001c*\nn\u0015'\u0014'\rnQ")).append(arg0).append(sprlzz.cfr_renamed_9("$\u001e$")).append(this.cfr_renamed_0).append(")").toString());
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprsol(sprpp sprpp2, int n) {
        void arg1;
        sprsol sprsol2 = this;
        this.cfr_renamed_112 = 20;
        sprsol2.cfr_renamed_0 = arg1;
        sprsol2.cfr_renamed_4 = sprpp2;
    }

    public sprsf cfr_renamed_1480(char[] arg0) throws sprcsl {
        if (this.cfr_renamed_119 != null) {
            sprsol sprsol2 = this;
            return sprsol2.cfr_renamed_10959(sprsol2.cfr_renamed_119, arg0);
        }
        sprsol sprsol3 = this;
        byte[] byArray = new byte[sprsol3.cfr_renamed_112];
        if (sprsol3.cfr_renamed_1 == null) {
            sprsol sprsol4 = this;
            sprsol4.cfr_renamed_1 = new SecureRandom();
        }
        sprsol sprsol5 = this;
        sprsol5.cfr_renamed_1.nextBytes(byArray);
        sprsol sprsol6 = this;
        return sprsol5.cfr_renamed_10959(new sprtlm(byArray, sprsol6.cfr_renamed_91, sprsol6.cfr_renamed_2, this.cfr_renamed_3), arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprsf cfr_renamed_7423(sprddm arg0, char[] arg1) throws sprhjg {
        if (!sprwy.cfr_renamed_137.cfr_renamed_5078(arg0.cfr_renamed_593())) {
            throw new sprhjg(sprisda.cfr_renamed_9(">\u000b!\r+\u001a:\u0010!\u0017n\u0018\"\u001e!\u000b'\r&\u0014n\u0017!\rn\u0014/\u001an\u001b/\n+\u001d"));
        }
        this.cfr_renamed_10957(sprtlm.cfr_renamed_23(arg0.cfr_renamed_284()));
        try {
            return this.cfr_renamed_1480(arg1);
        }
        catch (sprcsl sprcsl2) {
            throw new sprhjg(sprcsl2.getMessage(), sprcsl2.getCause());
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprsol(sprddm sprddm2, int n, sprddm sprddm3, sprpp sprpp2) {
        void arg2;
        void arg1;
        void arg0;
        sprsol sprsol2 = this;
        sprsol sprsol3 = this;
        this.cfr_renamed_112 = 20;
        sprsol3.cfr_renamed_91 = arg0;
        sprsol3.cfr_renamed_2 = arg1;
        sprsol2.cfr_renamed_3 = arg2;
        sprsol2.cfr_renamed_4 = sprpp2;
    }
}

