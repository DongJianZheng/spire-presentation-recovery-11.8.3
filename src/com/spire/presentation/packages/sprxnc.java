/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprerz;
import com.spire.presentation.packages.sprfica;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprmgd;
import com.spire.presentation.packages.sprrkd;
import com.spire.presentation.packages.sprzmd;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;

public class sprxnc {
    public static sprhgb cfr_renamed_1216(PublicKey arg0) throws InvalidKeyException {
        if (arg0 instanceof DHPublicKey) {
            DHPublicKey dHPublicKey = (DHPublicKey)arg0;
            return new sprmgd(dHPublicKey.getY(), new sprzmd(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG(), null, dHPublicKey.getParams().getL()));
        }
        throw new InvalidKeyException(sprfica.cfr_renamed_9("\u0010N\u001d\b\u0007\u000f\u001aK\u0016A\u0007F\u0015VSk;\u000f\u0003Z\u0011C\u001aLSD\u0016V]"));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3 ^ 3;
        int cfr_ignored_0 = 4 << 3 ^ 5;
        int n4 = n2;
        int n5 = 4 << 4 ^ 1;
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

    public static sprhgb cfr_renamed_1220(PrivateKey arg0) throws InvalidKeyException {
        if (arg0 instanceof DHPrivateKey) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey)arg0;
            return new sprrkd(dHPrivateKey.getX(), new sprzmd(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG(), null, dHPrivateKey.getParams().getL()));
        }
        throw new InvalidKeyException(sprerz.cfr_renamed_9("q\t|OfH{\fw\u0006f\u0001t\u00112,ZHb\u001a{\u001es\u001cwHy\rkF"));
    }
}

