/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravy;
import com.spire.presentation.packages.sprczj;
import com.spire.presentation.packages.sprerz;
import com.spire.presentation.packages.sprquk;
import com.spire.presentation.packages.sprryk;
import com.spire.presentation.packages.sprwsk;
import com.spire.presentation.packages.spryye;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;

public class sprjrj {
    public static spryye cfr_renamed_1220(PrivateKey arg0) throws InvalidKeyException {
        if (arg0 instanceof DHPrivateKey) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey)arg0;
            return new sprquk(dHPrivateKey.getX(), new sprwsk(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG(), null, dHPrivateKey.getParams().getL()));
        }
        throw new InvalidKeyException(spravy.cfr_renamed_9("\u000b[\u0006\u001d\u001c\u001a\u0001^\rT\u001cS\u000eCH~ \u001a\u0018H\u0001L\tN\r\u001a\u0003_\u0011\u0014"));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ (3 ^ 5);
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ 3 << 1;
        int n4 = n2;
        int n5 = 2 ^ 5;
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
        if (arg0 instanceof sprczj) {
            return ((sprczj)arg0).cfr_renamed_9389();
        }
        if (arg0 instanceof DHPublicKey) {
            DHPublicKey dHPublicKey = (DHPublicKey)arg0;
            return new sprryk(dHPublicKey.getY(), new sprwsk(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG(), null, dHPublicKey.getParams().getL()));
        }
        throw new InvalidKeyException(sprerz.cfr_renamed_9("\u000bs\u00065\u001c2\u0001v\r|\u001c{\u000ekHV 2\u0018g\n~\u0001qHy\rkF"));
    }
}

