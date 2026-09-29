/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmpp;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprux;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

public class sprqjk
implements sprux {
    private final MessageDigest cfr_renamed_3;
    private final MessageDigest cfr_renamed_4;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprqjk(sprrr sprrr2) throws NoSuchProviderException, NoSuchAlgorithmException {
        sprqjk sprqjk2;
        MessageDigest messageDigest;
        this.cfr_renamed_4 = sprrr2.cfr_renamed_7438("SHA-1");
        try {
            void arg0;
            messageDigest = arg0.cfr_renamed_7438("MD5");
            sprqjk2 = this;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            messageDigest = null;
            sprqjk2 = this;
        }
        sprqjk2.cfr_renamed_3 = messageDigest;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean cfr_renamed_9689(byte[] arg0, byte[] arg1) {
        this.cfr_renamed_4.update(arg0, 0, arg0.length);
        byte[] byArray = this.cfr_renamed_4.digest();
        if (sproze.cfr_renamed_559(byArray, arg1)) return true;
        if (arg1[0] != 0) return false;
        if (arg1[1] != 0) return false;
        if (arg1[2] != 0) return false;
        if (arg1[3] != 0) return false;
        this.cfr_renamed_3.update(arg0, 0, arg0.length);
        sproze.cfr_renamed_492(byArray, (byte)0);
        try {
            this.cfr_renamed_3.digest(byArray, 4, this.cfr_renamed_3.getDigestLength());
            return sproze.cfr_renamed_559(byArray, arg1);
        }
        catch (DigestException digestException) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprmpp.cfr_renamed_9("\u0015,\b'\u000e,\u001d.\\ \t$\u001a'\u000eb\b-\\1\u0011#\u0010.Fb")).append(digestException.getMessage()).toString(), digestException);
        }
    }
}

