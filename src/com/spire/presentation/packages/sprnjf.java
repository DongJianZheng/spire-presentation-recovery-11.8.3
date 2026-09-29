/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcye;
import com.spire.presentation.packages.sprdlf;
import com.spire.presentation.packages.sprlpf;
import com.spire.presentation.packages.sprmof;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpof;
import com.spire.presentation.packages.sprqrf;
import com.spire.presentation.packages.sprrya;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprusf;
import com.spire.presentation.packages.sprvif;
import com.spire.presentation.packages.sprvjf;
import com.spire.presentation.packages.sprzif;
import java.security.SecureRandom;
import java.text.ParseException;

public final class sprnjf {
    private sprvif cfr_renamed_0;
    private sprvjf cfr_renamed_1;
    private SecureRandom cfr_renamed_2;
    private sprpof cfr_renamed_3;
    private sprlpf cfr_renamed_4;

    public byte[] cfr_renamed_5769() {
        return this.cfr_renamed_3.cfr_renamed_5769();
    }

    public boolean cfr_renamed_5849(byte[] arg0, byte[] arg1, byte[] arg2) throws ParseException {
        sprqrf sprqrf2;
        if (arg0 == null) {
            throw new NullPointerException(sprcye.cfr_renamed_9("1\u0010/\u0006=\u00129UaH|\u001b)\u00190"));
        }
        if (arg1 == null) {
            throw new NullPointerException(sprrya.cfr_renamed_9("@\u0011T\u0016R\fF\nVX\u000eE\u0013\u0016F\u0014_"));
        }
        if (arg2 == null) {
            throw new NullPointerException(sprcye.cfr_renamed_9(",\u0000>\u00195\u0016\u0017\u0010%UaH|\u001b)\u00190"));
        }
        sprqrf sprqrf3 = sprqrf2 = new sprqrf();
        sprqrf3.cfr_renamed_5535(false, new sprusf(this.cfr_renamed_2110()).cfr_renamed_5850(arg2).cfr_renamed_1451());
        return sprqrf3.cfr_renamed_129(arg0, arg1);
    }

    public byte[] cfr_renamed_5851(byte[] arg0) {
        sprqrf sprqrf2;
        if (arg0 == null) {
            throw new NullPointerException(sprrya.cfr_renamed_9("^\u001d@\u000bR\u001fVX\u000eE\u0013\u0016F\u0014_"));
        }
        sprqrf sprqrf3 = sprqrf2 = new sprqrf();
        sprqrf3.cfr_renamed_5535(true, this.cfr_renamed_3);
        byte[] byArray = sprqrf3.cfr_renamed_125(arg0);
        this.cfr_renamed_3 = (sprpof)sprqrf2.cfr_renamed_5643();
        sprnjf sprnjf2 = this;
        sprnjf2.cfr_renamed_5852(this.cfr_renamed_3, sprnjf2.cfr_renamed_0);
        return byArray;
    }

    public byte[] cfr_renamed_5853() {
        return this.cfr_renamed_3.cfr_renamed_954();
    }

    public void cfr_renamed_5854() {
        sprmof sprmof2;
        sprmof sprmof3 = sprmof2 = new sprmof();
        sprmof3.cfr_renamed_5536(new sprzif(this.cfr_renamed_2110(), this.cfr_renamed_2));
        sprsil sprsil2 = sprmof3.cfr_renamed_1223();
        this.cfr_renamed_3 = (sprpof)sprsil2.cfr_renamed_1225();
        this.cfr_renamed_0 = (sprvif)sprsil2.cfr_renamed_1224();
        sprnjf sprnjf2 = this;
        sprnjf2.cfr_renamed_5852(this.cfr_renamed_3, sprnjf2.cfr_renamed_0);
    }

    public sprlpf cfr_renamed_5855() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5852(sprpof sprpof2, sprvif sprvif2) {
        void arg0;
        sprnjf sprnjf2 = this;
        this.cfr_renamed_4.cfr_renamed_5783().cfr_renamed_5766(new byte[this.cfr_renamed_1.cfr_renamed_5732()], this.cfr_renamed_3.cfr_renamed_5769());
        sprnjf2.cfr_renamed_3 = arg0;
        sprnjf2.cfr_renamed_0 = sprvif2;
    }

    public byte[] cfr_renamed_5856() {
        return this.cfr_renamed_0.cfr_renamed_954();
    }

    /*
     * WARNING - void declaration
     */
    public sprnjf(sprvjf sprvjf2, SecureRandom secureRandom) {
        void arg1;
        void arg0;
        if (sprvjf2 == null) {
            throw new NullPointerException(sprcye.cfr_renamed_9("\u0005=\u0007=\u0018/UaH|\u001b)\u00190"));
        }
        sprnjf sprnjf2 = this;
        sprnjf sprnjf3 = this;
        this.cfr_renamed_1 = arg0;
        sprnjf3.cfr_renamed_4 = this.cfr_renamed_1.cfr_renamed_5821();
        sprnjf2.cfr_renamed_2 = arg1;
        sprnjf sprnjf4 = this;
        sprnjf3.cfr_renamed_3 = new sprdlf((sprvjf)arg0).cfr_renamed_1451();
        sprnjf2.cfr_renamed_0 = new sprusf((sprvjf)arg0).cfr_renamed_1451();
    }

    public sprvjf cfr_renamed_2110() {
        return this.cfr_renamed_1;
    }

    public void cfr_renamed_5857(byte[] arg0, byte[] arg1) {
        if (arg0 == null) {
            throw new NullPointerException(sprrya.cfr_renamed_9("\bA\u0011E\u0019G\u001dx\u001dJX\u000eE\u0013\u0016F\u0014_"));
        }
        if (arg1 == null) {
            throw new NullPointerException(sprcye.cfr_renamed_9(",\u0000>\u00195\u0016\u0017\u0010%UaH|\u001b)\u00190"));
        }
        sprpof sprpof2 = new sprdlf(this.cfr_renamed_1).cfr_renamed_5858(arg0).cfr_renamed_1451();
        sprvif sprvif2 = new sprusf(this.cfr_renamed_1).cfr_renamed_5850(arg1).cfr_renamed_1451();
        if (!sproze.cfr_renamed_92(sprpof2.cfr_renamed_1411(), sprvif2.cfr_renamed_1411())) {
            throw new IllegalStateException(sprrya.cfr_renamed_9("A\u0017\\\f\u0013\u0017UXC\nZ\u000eR\fVXX\u001dJXR\u0016WXC\rQ\u0014Z\u001b\u0013\u0013V\u0001\u0013\u001c\\X]\u0017GX^\u0019G\u001b["));
        }
        if (!sproze.cfr_renamed_92(sprpof2.cfr_renamed_5769(), sprvif2.cfr_renamed_5769())) {
            throw new IllegalStateException(sprcye.cfr_renamed_9("\u0005)\u00170\u001c?U/\u00109\u0011|\u001a:U,\u00075\u0003=\u00019U7\u0010%U=\u001b8U,\u0000>\u00195\u0016|\u001e9\f|\u00113U2\u001a(U1\u0014(\u00164"));
        }
        this.cfr_renamed_4.cfr_renamed_5783().cfr_renamed_5766(new byte[this.cfr_renamed_1.cfr_renamed_5732()], sprpof2.cfr_renamed_5769());
        this.cfr_renamed_3 = sprpof2;
        this.cfr_renamed_0 = sprvif2;
    }
}

