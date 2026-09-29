/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcrj;
import com.spire.presentation.packages.sprffm;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprieba;
import com.spire.presentation.packages.sprjpj;
import com.spire.presentation.packages.sprlrj;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprspj;
import com.spire.presentation.packages.sprtpa;
import com.spire.presentation.packages.sprvoj;
import com.spire.presentation.packages.sprwzl;
import java.io.IOException;
import java.security.cert.CRLException;

public class sprtmj
extends sprjpj {
    private volatile int cfr_renamed_1;
    private volatile boolean cfr_renamed_2;
    private final Object cfr_renamed_3;
    private sprlrj cfr_renamed_4;

    @Override
    public byte[] getEncoded() throws CRLException {
        return sproze.cfr_renamed_158(this.cfr_renamed_9340().getEncoded());
    }

    public sprtmj(sprrr sprrr2, sprffm sprffm2) throws CRLException {
        sprffm sprffm3 = sprffm2;
        super(sprrr2, sprffm3, sprtmj.cfr_renamed_9341(sprffm2), sprtmj.cfr_renamed_9342(sprffm2), sprtmj.cfr_renamed_9343(sprffm3));
        sprtmj sprtmj2 = this;
        sprtmj2.cfr_renamed_3 = new Object();
    }

    @Override
    public int hashCode() {
        if (!this.cfr_renamed_2) {
            this.cfr_renamed_1 = this.cfr_renamed_9340().hashCode();
            this.cfr_renamed_2 = true;
        }
        return this.cfr_renamed_1;
    }

    @Override
    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (arg0 instanceof sprtmj) {
            sprgbf sprgbf2;
            sprtmj sprtmj2 = (sprtmj)arg0;
            if (this.cfr_renamed_2 && sprtmj2.cfr_renamed_2 ? this.cfr_renamed_1 != sprtmj2.cfr_renamed_1 : (null == this.cfr_renamed_4 || null == sprtmj2.cfr_renamed_4) && null != (sprgbf2 = this.cfr_renamed_1.cfr_renamed_79()) && !sprgbf2.cfr_renamed_5078(sprtmj2.cfr_renamed_1.cfr_renamed_79())) {
                return false;
            }
            return this.cfr_renamed_9340().equals(sprtmj2.cfr_renamed_9340());
        }
        return this.cfr_renamed_9340().equals(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ String cfr_renamed_9341(sprffm arg0) throws CRLException {
        try {
            return sprcrj.cfr_renamed_9057(arg0.cfr_renamed_89());
        }
        catch (Exception exception) {
            throw new sprvoj(new StringBuilder().insert(0, sprieba.cfr_renamed_9("qD~6Qy\\bWxFe\u0012\u007f\\`Sz[r\b6")).append(exception.getMessage()).toString(), exception);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ boolean cfr_renamed_9343(sprffm arg0) throws CRLException {
        try {
            byte[] byArray = sprtmj.cfr_renamed_9344(arg0, sprrdm.cfr_renamed_96.cfr_renamed_19());
            if (null != byArray) return sprwzl.cfr_renamed_23(byArray).cfr_renamed_2131();
            return false;
        }
        catch (Exception exception) {
            throw new sprspj(sprtpa.cfr_renamed_9(">\u001c\u0018\u0001\u000b\u0010\u0012\u000b\u0015D\t\u0001\u001a\u0000\u0012\n\u001cD2\u0017\b\u0011\u0012\n\u001c \u0012\u0017\u000f\u0016\u0012\u0006\u000e\u0010\u0012\u000b\u00154\u0014\r\u0015\u0010"), exception);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprlrj cfr_renamed_9340() {
        Object object = this.cfr_renamed_3;
        synchronized (object) {
            if (null != this.cfr_renamed_4) {
                return this.cfr_renamed_4;
            }
        }
        object = null;
        sprvoj sprvoj2 = null;
        try {
            object = this.cfr_renamed_1.cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            sprvoj2 = new sprvoj(iOException);
        }
        sprtmj sprtmj2 = this;
        sprtmj sprtmj3 = this;
        sprlrj sprlrj2 = new sprlrj((sprrr)sprtmj2.cfr_renamed_2, (sprffm)sprtmj2.cfr_renamed_1, sprtmj3.cfr_renamed_0, (byte[])sprtmj3.cfr_renamed_4, (boolean)this.cfr_renamed_3, (byte[])object, sprvoj2);
        Object object2 = this.cfr_renamed_3;
        synchronized (object2) {
            if (null == this.cfr_renamed_4) {
                this.cfr_renamed_4 = sprlrj2;
            }
            return this.cfr_renamed_4;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ byte[] cfr_renamed_9342(sprffm arg0) throws CRLException {
        try {
            sprco sprco2 = arg0.cfr_renamed_89().cfr_renamed_284();
            if (null != sprco2) return sprco2.cfr_renamed_119().cfr_renamed_104("DER");
            return null;
        }
        catch (Exception exception) {
            throw new CRLException(new StringBuilder().insert(0, sprieba.cfr_renamed_9("qD~6Qy\\bWxFe\u0012\u007f\\`Sz[r\b6")).append(exception).toString());
        }
    }
}

