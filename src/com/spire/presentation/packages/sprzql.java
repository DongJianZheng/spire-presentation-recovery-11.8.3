/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraql;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.spreul;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprfwm;
import com.spire.presentation.packages.sprgz;
import com.spire.presentation.packages.sprhrl;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprjdz;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmnm;
import com.spire.presentation.packages.sprmul;
import com.spire.presentation.packages.sprocn;
import com.spire.presentation.packages.sprpy;
import com.spire.presentation.packages.sprrpl;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprsv;
import com.spire.presentation.packages.sprve;
import com.spire.presentation.packages.sprxnc;
import com.spire.presentation.packages.sprywl;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class sprzql
extends sprhrl {
    private boolean cfr_renamed_3;
    private List cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprmul cfr_renamed_10785(sprrpl sprrpl2) throws sprlyl {
        void arg0;
        return this.cfr_renamed_5289(new spraql(null, arg0.cfr_renamed_79()), false).cfr_renamed_621();
    }

    public sprywl cfr_renamed_10786(sprsv arg0) throws sprlyl {
        return this.cfr_renamed_5289(arg0, false);
    }

    public void cfr_renamed_10787(boolean arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public sprzql() {
        sprzql sprzql2 = this;
        this.cfr_renamed_4 = new ArrayList();
        this.cfr_renamed_3 = false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprywl cfr_renamed_5289(sprsv arg0, boolean arg1) throws sprlyl {
        if (!this.cfr_renamed_4.isEmpty()) {
            throw new IllegalStateException(sprxnc.cfr_renamed_9("5K(PaN$W)L%\u0003\"B/\u0003.M-ZaA$\u00034P$GaT(W)\u0003\u0012J&M$Q\bM'L\u0006F/F3B5L3"));
        }
        var3_3 = new LinkedHashSet<sprddm>();
        var4_4 = new sprrvm();
        v0 = this;
        v0.cfr_renamed_102.clear();
        v1 = var5_5 = v0.cfr_renamed_126.iterator();
        while (v1.hasNext()) {
            var6_6 = (sprrpl)var5_5.next();
            v1 = var5_5;
            v2 = var6_6;
            spreul.cfr_renamed_10755(var3_3, v2, this.cfr_renamed_133);
            var4_4.cfr_renamed_5004(v2.cfr_renamed_568());
        }
        v3 = arg0;
        var5_5 = v3.cfr_renamed_696();
        var6_6 = null;
        if (v3.cfr_renamed_480() == null) ** GOTO lbl36
        var7_7 = null;
        if (arg1) {
            var7_7 = new ByteArrayOutputStream();
        }
        var8_8 = spreul.cfr_renamed_4111(this.cfr_renamed_724, var7_7);
        var8_8 = spreul.cfr_renamed_4113((OutputStream)var8_8);
        try {
            arg0.cfr_renamed_624((OutputStream)var8_8);
            var8_8.close();
        }
        catch (IOException var9_9) {
            throw new sprlyl(new StringBuilder().insert(0, sprjdz.cfr_renamed_9("|\u007fl\u007f8njq{{kmqp\u007f>}f{{hjqqv$8")).append(var9_9.getMessage()).toString(), var9_9);
        }
        if (!arg1) ** GOTO lbl36
        if (this.cfr_renamed_3) {
            var6_6 = new sprfvg(var7_7.toByteArray());
            v4 = this;
        } else {
            var6_6 = new sprfwm(var7_7.toByteArray());
lbl36:
            // 3 sources

            v4 = this;
        }
        for (Object var8_8 : v4.cfr_renamed_724) {
            var9_10 = var8_8.cfr_renamed_10658((sprlem)var5_5);
            var3_3.add(var9_10.cfr_renamed_410());
            var4_4.cfr_renamed_5004(var9_10);
            var10_11 /* !! */  = var8_8.cfr_renamed_3984();
            if (var10_11 /* !! */  == null) continue;
            this.cfr_renamed_102.put(var9_10.cfr_renamed_410().cfr_renamed_593().cfr_renamed_19(), var10_11 /* !! */ );
        }
        var7_7 = null;
        if (this.cfr_renamed_31.size() != 0) {
            v5 = this;
            var7_7 = this.cfr_renamed_3 != false ? spreul.cfr_renamed_10761(v5.cfr_renamed_31) : spreul.cfr_renamed_4116(v5.cfr_renamed_31);
        }
        var8_8 = null;
        if (this.cfr_renamed_119.size() != 0) {
            v6 = this;
            var8_8 = this.cfr_renamed_3 != false ? spreul.cfr_renamed_10761(v6.cfr_renamed_119) : spreul.cfr_renamed_4116(v6.cfr_renamed_119);
        }
        var9_10 = new sprlvm((sprlem)var5_5, (sprco)var6_6);
        var10_11 /* !! */  = (byte[])new sprmnm(spreul.cfr_renamed_10757(var3_3), (sprlvm)var9_10, (spridn)var7_7, (spridn)var8_8, new sprocn(var4_4));
        var11_12 = new sprlvm(sprgz.cfr_renamed_105, (sprco)var10_11 /* !! */ );
        return new sprywl((sprpy)arg0, var11_12);
    }

    /*
     * WARNING - void declaration
     */
    public sprzql(sprve sprve2) {
        super((sprve)arg0);
        void arg0;
        sprzql sprzql2 = this;
        this.cfr_renamed_4 = new ArrayList();
        this.cfr_renamed_3 = false;
    }
}

