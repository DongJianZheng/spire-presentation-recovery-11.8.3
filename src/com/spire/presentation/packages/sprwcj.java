/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcul;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprxbaa;
import java.security.DigestException;
import java.security.MessageDigest;

public class sprwcj
extends MessageDigest {
    public int cfr_renamed_3;
    public sprgf cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprwcj(sprgf sprgf2) {
        void arg0;
        sprwcj sprwcj2 = this;
        void v1 = arg0;
        super(v1.cfr_renamed_1315());
        sprwcj2.cfr_renamed_4 = v1;
        sprwcj2.cfr_renamed_3 = sprgf2.cfr_renamed_1218();
    }

    @Override
    public void engineReset() {
        this.cfr_renamed_4.cfr_renamed_41();
    }

    @Override
    public int engineGetDigestLength() {
        return this.cfr_renamed_3;
    }

    @Override
    public int engineDigest(byte[] arg0, int arg1, int arg2) throws DigestException {
        if (arg2 < this.cfr_renamed_3) {
            throw new DigestException(sprxbaa.cfr_renamed_9("\u0013 \u00115\n \u000fa\u0007(\u0004$\u00105\u0010a\r.\u0017a\u0011$\u00174\u0011/\u0006%"));
        }
        if (arg0.length - arg1 < this.cfr_renamed_3) {
            throw new DigestException(sprcul.cfr_renamed_9("\nu\u0010n\u0005}\nx\n~\roCh\u0013z\u0000~Cr\r;\u0017s\u0006;\fn\u0017k\u0016oCy\u0016}\u0005~\u0011;\u0017tCh\u0017t\u0011~Co\u000b~C\u007f\n|\u0006h\u0017"));
        }
        sprwcj sprwcj2 = this;
        sprwcj2.cfr_renamed_4.cfr_renamed_1219(arg0, arg1);
        return sprwcj2.cfr_renamed_3;
    }

    @Override
    public void engineUpdate(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public byte[] engineDigest() {
        sprwcj sprwcj2 = this;
        byte[] byArray = new byte[sprwcj2.cfr_renamed_3];
        sprwcj2.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        return byArray;
    }

    @Override
    public void engineUpdate(byte arg0) {
        this.cfr_renamed_4.cfr_renamed_1221(arg0);
    }
}

