/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprniy;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpmb;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprqnl;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

public class sprxmc
extends AlgorithmParametersSpi {
    public sprpmb cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineGetEncoded() {
        try {
            sprlre sprlre2;
            sprlre sprlre3 = sprlre2 = new sprlre();
            sprlre2.cfr_renamed_49(new sprlqe(this.cfr_renamed_4.cfr_renamed_2097()));
            sprlre3.cfr_renamed_49(new sprlqe(this.cfr_renamed_4.cfr_renamed_2099()));
            sprlre2.cfr_renamed_49(new sprooe(this.cfr_renamed_4.cfr_renamed_2100()));
            return new sprpse(sprlre2).cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new RuntimeException(sprqnl.cfr_renamed_9("|:K'Kh\\&Z']!W/\u0019\u0001|\u001bi)K)T-M-K;"));
        }
    }

    @Override
    public void engineInit(byte[] arg0, String arg1) throws IOException {
        if (this.cfr_renamed_2396(arg1) || arg1.equalsIgnoreCase(sprniy.cfr_renamed_9("\"cO}C"))) {
            this.engineInit(arg0);
            return;
        }
        throw new IOException(new StringBuilder().insert(0, sprqnl.cfr_renamed_9("\u001dW#W'N&\u00198X:X%\\<\\:\u0019.V:T)Mh")).append(arg1).toString());
    }

    @Override
    public void engineInit(AlgorithmParameterSpec arg0) throws InvalidParameterSpecException {
        if (!(arg0 instanceof sprpmb)) {
            throw new InvalidParameterSpecException(sprniy.cfr_renamed_9("3\b)\u001d\u001b?\u001b \u001f9\u001f?)=\u001f.Z?\u001f<\u000f$\b(\u001em\u000e\"Z$\u0014$\u000e$\u001b!\u0013>\u001fm\u001bm3\b)m\u001b!\u001d\"\b$\u000e%\u0017m\n,\b,\u0017(\u000e(\b>Z\"\u0018'\u001f.\u000e"));
        }
        this.cfr_renamed_4 = (sprpmb)arg0;
    }

    public AlgorithmParameterSpec engineGetParameterSpec(Class arg0) throws InvalidParameterSpecException {
        if (arg0 == null) {
            throw new NullPointerException(sprqnl.cfr_renamed_9(")K/L%\\&MhM'\u0019/\\<i)K)T-M-K\u001bI-ZhT=J<\u0019&V<\u0019*\\hW=U$"));
        }
        return this.cfr_renamed_2397(arg0);
    }

    public boolean cfr_renamed_2396(String arg0) {
        return arg0 == null || arg0.equals("ASN.1");
    }

    public AlgorithmParameterSpec cfr_renamed_2397(Class arg0) throws InvalidParameterSpecException {
        if (arg0 == sprpmb.class) {
            return this.cfr_renamed_4;
        }
        throw new InvalidParameterSpecException(sprniy.cfr_renamed_9("\u000f#\u0011#\u0015:\u0014m\n,\b,\u0017(\u000e(\bm\t=\u001f.Z=\u001b>\t(\u001em\u000e\"Z\b\u0016\n\u001b \u001b!Z=\u001b?\u001b \u001f9\u001f?\tm\u0015/\u0010(\u00199T"));
    }

    @Override
    public byte[] engineGetEncoded(String arg0) {
        if (this.cfr_renamed_2396(arg0) || arg0.equalsIgnoreCase(sprqnl.cfr_renamed_9("\u0010\u0017}\tq"))) {
            return this.engineGetEncoded();
        }
        return null;
    }

    @Override
    public String engineToString() {
        return sprniy.cfr_renamed_9("\u0004?\u001eZ\u001d\u001b?\u001b \u001f9\u001f?\t");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(byte[] arg0) throws IOException {
        try {
            sprbne sprbne2 = (sprbne)sprvva.cfr_renamed_184(arg0);
            sprxmc sprxmc2 = this;
            sprxmc2.cfr_renamed_4 = new sprpmb(((sprxue)sprbne2.cfr_renamed_85(0)).cfr_renamed_186(), ((sprxue)sprbne2.cfr_renamed_85(0)).cfr_renamed_186(), ((sprooe)sprbne2.cfr_renamed_85(0)).cfr_renamed_97().intValue());
            return;
        }
        catch (ClassCastException classCastException) {
            throw new IOException(sprqnl.cfr_renamed_9("\u0006V<\u0019)\u0019>X$P,\u0019\u0001|\u001b\u0019\u0018X:X%\\<\\:\u0019-W+V,P&^f"));
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw new IOException(sprniy.cfr_renamed_9("4\"\u000em\u001bm\f,\u0016$\u001em3\b)m*,\b,\u0017(\u000e(\bm\u001f#\u0019\"\u001e$\u0014*T"));
        }
    }
}

