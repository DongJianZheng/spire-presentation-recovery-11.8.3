/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprnji;
import com.spire.presentation.packages.sprsek;
import com.spire.presentation.packages.spruji;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public class sprjug {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_7958(Cipher arg0, SecretKey arg1, int arg2, byte[] arg3, int arg4, byte[] arg5) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpec;
        if (!spruji.cfr_renamed_7959()) {
            sprnji sprnji2 = new sprnji(arg3, arg4, arg5);
            arg0.init(arg2, (Key)arg1, sprnji2);
            return;
        }
        try {
            algorithmParameterSpec = spruji.cfr_renamed_7960(new sprsek(arg3, (arg4 + 7) / 8).cfr_renamed_119());
        }
        catch (InvalidParameterSpecException invalidParameterSpecException) {
            throw new InvalidAlgorithmParameterException(invalidParameterSpecException.getMessage());
        }
        arg0.init(arg2, (Key)arg1, algorithmParameterSpec);
        arg0.update(arg5);
    }
}

