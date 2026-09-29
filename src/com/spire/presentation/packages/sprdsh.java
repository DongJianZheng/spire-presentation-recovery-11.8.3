/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhhj;
import com.spire.presentation.packages.sprquk;
import com.spire.presentation.packages.sprryk;
import com.spire.presentation.packages.sprwsk;
import com.spire.presentation.packages.sprxaea;
import com.spire.presentation.packages.spryye;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;

public class sprdsh {
    public static spryye cfr_renamed_1220(PrivateKey arg0) throws InvalidKeyException {
        if (arg0 instanceof DHPrivateKey) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey)arg0;
            return new sprquk(dHPrivateKey.getX(), new sprwsk(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG(), null, dHPrivateKey.getParams().getL()));
        }
        throw new InvalidKeyException(sprhhj.cfr_renamed_9("\u0007\u0000\nF\u0010A\r\u0005\u0001\u000f\u0010\b\u0002\u0018D%,A\u0014\u0013\r\u0017\u0005\u0015\u0001A\u000f\u0004\u001dO"));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 1;
        int cfr_ignored_0 = 4 << 3 ^ 2;
        int n4 = n2;
        int n5 = 4 << 3 ^ 3;
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

    public static spryye cfr_renamed_1216(PublicKey arg0) throws InvalidKeyException {
        if (arg0 instanceof DHPublicKey) {
            DHPublicKey dHPublicKey = (DHPublicKey)arg0;
            return new sprryk(dHPublicKey.getY(), new sprwsk(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG(), null, dHPublicKey.getParams().getL()));
        }
        throw new InvalidKeyException(sprxaea.cfr_renamed_9("\u0015L\u0018\n\u0002\r\u001fI\u0013C\u0002D\u0010TVi>\r\u0006X\u0014A\u001fNVF\u0013TX"));
    }
}

