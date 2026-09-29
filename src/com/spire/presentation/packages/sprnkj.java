/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcjj;
import com.spire.presentation.packages.sprcmca;
import com.spire.presentation.packages.sprqgk;
import com.spire.presentation.packages.sprrnj;
import com.spire.presentation.packages.sprtkk;
import com.spire.presentation.packages.sprtwn;
import com.spire.presentation.packages.sprwpj;
import com.spire.presentation.packages.sprxkj;
import com.spire.presentation.packages.spryye;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;

public class sprnkj {
    public static spryye cfr_renamed_1220(PrivateKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprrnj) {
            return ((sprrnj)arg0).cfr_renamed_9389();
        }
        if (arg0 instanceof sprcjj) {
            return ((sprcjj)arg0).cfr_renamed_9389();
        }
        try {
            byte[] byArray = arg0.getEncoded();
            if (byArray == null) {
                throw new InvalidKeyException(sprcmca.cfr_renamed_9("?\u000eq\u0004?\u0002>\u00058\u000f6A7\u000e#A\u0014\u0005\u0014\"~9\u0015)q\u0011#\b'\u0000%\u0004q\n4\u0018"));
            }
            return sprtkk.cfr_renamed_2615(byArray);
        }
        catch (Exception exception) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprtwn.cfr_renamed_9("|9q6p,?1{=q,v>fxZ<Z\u001b0\u0000[\u0010?(m1i9k=?3z!%x")).append(exception.getMessage()).toString());
        }
    }

    public static spryye cfr_renamed_1216(PublicKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprwpj) {
            return ((sprwpj)arg0).cfr_renamed_9389();
        }
        if (arg0 instanceof sprxkj) {
            return ((sprxkj)arg0).cfr_renamed_9389();
        }
        try {
            byte[] byArray = arg0.getEncoded();
            if (byArray == null) {
                throw new InvalidKeyException(sprcmca.cfr_renamed_9("\u000f>A4\u000f2\u000e5\b?\u0006q\u0007>\u0013q$5$\u0012N\t%\u0019A!\u00143\r8\u0002q\n4\u0018"));
            }
            return sprqgk.cfr_renamed_2615(byArray);
        }
        catch (Exception exception) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprtwn.cfr_renamed_9(";~6q7kxv<z6k1y!?\u001d{\u001d\\wG\u001cWxo-}4v;?3z!%x")).append(exception.getMessage()).toString());
        }
    }
}

