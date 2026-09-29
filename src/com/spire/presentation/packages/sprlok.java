/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprjp;
import com.spire.presentation.packages.sprkmk;
import com.spire.presentation.packages.sprmw;
import com.spire.presentation.packages.sprrsd;
import com.spire.presentation.packages.sprvm;
import com.spire.presentation.packages.sprwkh;
import com.spire.presentation.packages.sprys;
import com.spire.presentation.packages.spryye;
import java.math.BigInteger;

public class sprlok
implements sprvm {
    private final sprys cfr_renamed_1;
    private boolean cfr_renamed_2;
    private final sprmw cfr_renamed_3;
    private final sprgf cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprlok(sprjp sprjp2, sprgf sprgf2, sprys sprys2) {
        void arg1;
        void arg0;
        sprlok sprlok2 = this;
        this.cfr_renamed_3 = arg0;
        sprlok2.cfr_renamed_4 = arg1;
        sprlok2.cfr_renamed_1 = sprys2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5535(boolean bl, sprbj sprbj2) {
        void v0;
        spryye spryye2;
        void arg1;
        void arg0;
        this.cfr_renamed_2 = arg0;
        if (sprbj2 instanceof sprbgk) {
            spryye2 = (spryye)((sprbgk)arg1).cfr_renamed_284();
            v0 = arg0;
        } else {
            spryye2 = (spryye)arg1;
            v0 = arg0;
        }
        if (v0 != false && !spryye2.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprrsd.cfr_renamed_9("\u001f\u0003+\u0004%\u0004+J\u001e\u000f=\u001f%\u0018)\u0019l:>\u0003:\u000b8\u000fl!)\u0013b"));
        }
        if (arg0 == false && spryye2.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprwkh.cfr_renamed_9("x=\\1H1M9Z1A6\u000e\nK)[1\\=]x~-L4G;\u000e\u0013K!\u0000"));
        }
        sprlok sprlok2 = this;
        sprlok2.cfr_renamed_41();
        sprlok2.cfr_renamed_3.cfr_renamed_5535((boolean)arg0, (sprbj)arg1);
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_4.cfr_renamed_1221(arg0);
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_4.cfr_renamed_41();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_1329() {
        if (!this.cfr_renamed_2) {
            throw new IllegalStateException(sprrsd.cfr_renamed_9("\b\u0019-.%\r)\u001989%\r\"\u000f>J\"\u00058J%\u0004%\u001e%\u000b \u0003?\u000f(J*\u0005>J?\u0003+\u0004-\u001e9\u0018)J+\u000f\"\u000f>\u000b8\u0003#\u0004b"));
        }
        sprlok sprlok2 = this;
        byte[] byArray = new byte[sprlok2.cfr_renamed_4.cfr_renamed_1218()];
        sprlok2.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        BigInteger[] bigIntegerArray = this.cfr_renamed_3.cfr_renamed_125(byArray);
        try {
            return this.cfr_renamed_1.cfr_renamed_9388(this.cfr_renamed_1932(), bigIntegerArray[0], bigIntegerArray[1]);
        }
        catch (Exception exception) {
            throw new IllegalStateException(sprwkh.cfr_renamed_9("-@9L4KxZ7\u000e=@;A<Kx]1I6O,[*K"));
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprlok(sprmw sprmw2, sprgf sprgf2) {
        void arg0;
        sprlok sprlok2 = this;
        sprlok2.cfr_renamed_3 = arg0;
        sprlok2.cfr_renamed_4 = sprgf2;
        sprlok2.cfr_renamed_1 = sprkmk.cfr_renamed_4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean cfr_renamed_1328(byte[] arg0) {
        if (this.cfr_renamed_2) {
            throw new IllegalStateException(sprrsd.cfr_renamed_9(".?\u000b\b\u0003+\u000f?\u001e\u001f\u0003+\u0004)\u0018l\u0004#\u001el\u0003\"\u00038\u0003-\u0006%\u0019)\u000el\f#\u0018l\u001c)\u0018%\f%\t-\u001e%\u0005\""));
        }
        sprlok sprlok2 = this;
        byte[] byArray = new byte[sprlok2.cfr_renamed_4.cfr_renamed_1218()];
        sprlok2.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        try {
            sprlok sprlok3 = this;
            BigInteger[] bigIntegerArray = sprlok3.cfr_renamed_1.cfr_renamed_9387(this.cfr_renamed_1932(), arg0);
            return sprlok3.cfr_renamed_3.cfr_renamed_2474(byArray, bigIntegerArray[0], bigIntegerArray[1]);
        }
        catch (Exception exception) {
            return false;
        }
    }

    public BigInteger cfr_renamed_1932() {
        if (this.cfr_renamed_3 instanceof sprjp) {
            return ((sprjp)this.cfr_renamed_3).cfr_renamed_1932();
        }
        return null;
    }
}

