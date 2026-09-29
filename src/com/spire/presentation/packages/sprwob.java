/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdso;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprimp;
import com.spire.presentation.packages.sprmgd;
import com.spire.presentation.packages.sprrkd;
import com.spire.presentation.packages.sprzmd;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;

public class sprwob {
    public static sprhgb cfr_renamed_1220(PrivateKey arg0) throws InvalidKeyException {
        if (arg0 instanceof DHPrivateKey) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey)arg0;
            return new sprrkd(dHPrivateKey.getX(), new sprzmd(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG(), null, dHPrivateKey.getParams().getL()));
        }
        throw new InvalidKeyException(sprdso.cfr_renamed_9("u\rxKbL\u007f\bs\u0002b\u0005p\u00156(^Lf\u001e\u007f\u001aw\u0018sL}\toB"));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4;
        int cfr_ignored_0 = 5 << 4 ^ 2 << 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 3 ^ (3 ^ 5);
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public static sprhgb cfr_renamed_1216(PublicKey arg0) throws InvalidKeyException {
        if (arg0 instanceof DHPublicKey) {
            DHPublicKey dHPublicKey = (DHPublicKey)arg0;
            return new sprmgd(dHPublicKey.getY(), new sprzmd(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG(), null, dHPublicKey.getParams().getL()));
        }
        throw new InvalidKeyException(sprimp.cfr_renamed_9("z3wumrp6|<m;\u007f+9\u0016Qri'{>p199|+7"));
    }
}

