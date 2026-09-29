/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbrb;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprfpd;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprji;
import com.spire.presentation.packages.sprjkc;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprqnl;
import com.spire.presentation.packages.sprtiz;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruxd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprznb;
import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public class spramb {
    public static PrivateKey cfr_renamed_2376(PrivateKey arg0, String arg1) throws IllegalArgumentException, NoSuchAlgorithmException, NoSuchProviderException {
        Provider provider = Security.getProvider(arg1);
        if (provider == null) {
            throw new NoSuchProviderException(new StringBuilder().insert(0, sprqnl.cfr_renamed_9("Z)W&V<\u0019.P&]hI:V>P,\\:\u0003h")).append(arg1).toString());
        }
        return spramb.cfr_renamed_2377(arg0, provider);
    }

    public static PublicKey cfr_renamed_2378(PublicKey arg0, String arg1) throws IllegalArgumentException, NoSuchAlgorithmException, NoSuchProviderException {
        Provider provider = Security.getProvider(arg1);
        if (provider == null) {
            throw new NoSuchProviderException(new StringBuilder().insert(0, sprtiz.cfr_renamed_9("\u0010\u0016\u001d\u0019\u001c\u0003S\u0011\u001a\u0019\u0017W\u0003\u0005\u001c\u0001\u001a\u0013\u0016\u0005IW")).append(arg1).toString());
        }
        return spramb.cfr_renamed_2379(arg0, provider);
    }

    public static PrivateKey cfr_renamed_2377(PrivateKey arg0, Provider arg1) throws IllegalArgumentException, NoSuchAlgorithmException {
        try {
            sprfpd sprfpd2;
            Object object;
            sprmke sprmke2 = sprmke.cfr_renamed_23(sprvva.cfr_renamed_184(arg0.getEncoded()));
            if (sprmke2.cfr_renamed_1473().cfr_renamed_90().equals(sprji.cfr_renamed_4)) {
                throw new UnsupportedEncodingException(sprqnl.cfr_renamed_9("+X&W'MhZ'W>\\:Mh~\u0007j\u001c\u0019#\\1\u0019<Vh\\0I$P+P<\u00198X:X%\\<\\:Jf"));
            }
            spruxd spruxd2 = spruxd.cfr_renamed_23(sprmke2.cfr_renamed_1473().cfr_renamed_284());
            if (spruxd2.cfr_renamed_2317()) {
                object = sprtzd.cfr_renamed_23(spruxd2.cfr_renamed_284());
                sprfpd2 = sprjkc.cfr_renamed_2318((sprtzd)object);
                sprfpd2 = new sprfpd(sprfpd2.cfr_renamed_1769(), sprfpd2.cfr_renamed_1145(), sprfpd2.cfr_renamed_1146(), sprfpd2.cfr_renamed_1153());
            } else if (spruxd2.cfr_renamed_2320()) {
                sprfpd2 = new sprfpd(sprbrb.cfr_renamed_86.cfr_renamed_2312().cfr_renamed_1769(), sprbrb.cfr_renamed_86.cfr_renamed_2312().cfr_renamed_1145(), sprbrb.cfr_renamed_86.cfr_renamed_2312().cfr_renamed_1146(), sprbrb.cfr_renamed_86.cfr_renamed_2312().cfr_renamed_1153());
            } else {
                return arg0;
            }
            spruxd2 = new spruxd(sprfpd2);
            sprmke2 = new sprmke(new sprije(sprtk.cfr_renamed_137, spruxd2), sprmke2.cfr_renamed_1229());
            object = KeyFactory.getInstance(arg0.getAlgorithm(), arg1);
            return ((KeyFactory)object).generatePrivate(new PKCS8EncodedKeySpec(sprmke2.cfr_renamed_91()));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw illegalArgumentException;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw noSuchAlgorithmException;
        }
        catch (Exception exception) {
            throw new sprznb(exception);
        }
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4;
        int cfr_ignored_0 = 3 << 3 ^ (3 ^ 5);
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

    public static PublicKey cfr_renamed_2379(PublicKey arg0, Provider arg1) throws IllegalArgumentException, NoSuchAlgorithmException {
        try {
            sprfpd sprfpd2;
            Object object;
            sprdce sprdce2 = sprdce.cfr_renamed_23(sprvva.cfr_renamed_184(arg0.getEncoded()));
            if (sprdce2.cfr_renamed_1473().cfr_renamed_90().equals(sprji.cfr_renamed_4)) {
                throw new IllegalArgumentException(sprtiz.cfr_renamed_9("\u0014\u0012\u0019\u001d\u0018\u0007W\u0010\u0018\u001d\u0001\u0016\u0005\u0007W48 #S\u001c\u0016\u000eS\u0003\u001cW\u0016\u000f\u0003\u001b\u001a\u0014\u001a\u0003S\u0007\u0012\u0005\u0012\u001a\u0016\u0003\u0016\u0005\u0000Y"));
            }
            spruxd spruxd2 = spruxd.cfr_renamed_23(sprdce2.cfr_renamed_1473().cfr_renamed_284());
            if (spruxd2.cfr_renamed_2317()) {
                object = sprtzd.cfr_renamed_23(spruxd2.cfr_renamed_284());
                sprfpd2 = sprjkc.cfr_renamed_2318((sprtzd)object);
                sprfpd2 = new sprfpd(sprfpd2.cfr_renamed_1769(), sprfpd2.cfr_renamed_1145(), sprfpd2.cfr_renamed_1146(), sprfpd2.cfr_renamed_1153());
            } else if (spruxd2.cfr_renamed_2320()) {
                sprfpd2 = new sprfpd(sprbrb.cfr_renamed_86.cfr_renamed_2312().cfr_renamed_1769(), sprbrb.cfr_renamed_86.cfr_renamed_2312().cfr_renamed_1145(), sprbrb.cfr_renamed_86.cfr_renamed_2312().cfr_renamed_1146(), sprbrb.cfr_renamed_86.cfr_renamed_2312().cfr_renamed_1153());
            } else {
                return arg0;
            }
            spruxd2 = new spruxd(sprfpd2);
            sprdce2 = new sprdce(new sprije(sprtk.cfr_renamed_137, spruxd2), sprdce2.cfr_renamed_2314().cfr_renamed_81());
            object = KeyFactory.getInstance(arg0.getAlgorithm(), arg1);
            return ((KeyFactory)object).generatePublic(new X509EncodedKeySpec(sprdce2.cfr_renamed_91()));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw illegalArgumentException;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw noSuchAlgorithmException;
        }
        catch (Exception exception) {
            throw new sprznb(exception);
        }
    }
}

