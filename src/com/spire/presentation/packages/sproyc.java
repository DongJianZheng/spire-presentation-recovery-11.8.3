/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprfjs;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprhbd;
import com.spire.presentation.packages.sprjuy;
import com.spire.presentation.packages.sprjvc;
import com.spire.presentation.packages.sprmg;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprqxc;
import com.spire.presentation.packages.sprrc;
import com.spire.presentation.packages.sprsyc;
import com.spire.presentation.packages.sprtuc;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprysc;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Signature;
import java.util.Arrays;
import java.util.Hashtable;

public class sproyc {
    private sprtuc cfr_renamed_3;
    private static final Hashtable cfr_renamed_4 = new Hashtable();

    private static /* synthetic */ byte[] cfr_renamed_2546(byte[] arg0) {
        sprbne sprbne2 = sprbne.cfr_renamed_23(arg0);
        BigInteger bigInteger = sprooe.cfr_renamed_23(sprbne2.cfr_renamed_85(0)).cfr_renamed_97();
        BigInteger bigInteger2 = sprooe.cfr_renamed_23(sprbne2.cfr_renamed_85(1)).cfr_renamed_97();
        byte[] byArray = bigInteger.toByteArray();
        byte[] byArray2 = bigInteger2.toByteArray();
        int n = sproyc.cfr_renamed_2547(byArray);
        int n2 = sproyc.cfr_renamed_2547(byArray2);
        int n3 = sproyc.cfr_renamed_2548(n, n2);
        byte[] byArray3 = new byte[n3 * 2];
        Arrays.fill(byArray3, (byte)0);
        sproyc.cfr_renamed_2549(byArray, byArray3, n3 - n);
        sproyc.cfr_renamed_2549(byArray2, byArray3, 2 * n3 - n2);
        return byArray3;
    }

    public static int cfr_renamed_2548(int arg0, int arg1) {
        if (arg0 > arg1) {
            return arg0;
        }
        return arg1;
    }

    /*
     * WARNING - void declaration
     */
    public sproyc cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_3 = new sprysc((String)arg0);
        return this;
    }

    public static /* synthetic */ byte[] cfr_renamed_2550(byte[] arg0) {
        return sproyc.cfr_renamed_2546(arg0);
    }

    private static /* synthetic */ void cfr_renamed_2549(byte[] arg0, byte[] arg1, int arg2) {
        int n = arg0.length;
        int n2 = 0;
        if (arg0[0] == 0) {
            n2 = 1;
            --n;
        }
        System.arraycopy(arg0, n2, arg1, arg2, n);
    }

    static {
        cfr_renamed_4.put(sprfjs.cfr_renamed_9("U\u0014Gmq5r4T\u000fG"), sprmg.cfr_renamed_91);
        cfr_renamed_4.put(sprjuy.cfr_renamed_9("\fM\u001e7j3(l+m\rV\u001e"), sprmg.cfr_renamed_112);
        cfr_renamed_4.put(sprfjs.cfr_renamed_9("\u000fN\u001d7+o(n\u000eU\u001dg2b\u0011A\u001a7"), sprmg.cfr_renamed_2);
        cfr_renamed_4.put(sprjuy.cfr_renamed_9("V\u0017Dm0ir6q7W\fD>k;H\u0018Cn"), sprmg.cfr_renamed_4);
        cfr_renamed_4.put(sprfjs.cfr_renamed_9("U\u0014Gi7nq5r4T\u000fG"), sprmg.cfr_renamed_31);
        cfr_renamed_4.put(sprjuy.cfr_renamed_9("V\u0017Dj4mr6q7W\fD>k;H\u0018Cn"), sprmg.cfr_renamed_119);
        cfr_renamed_4.put(sprfjs.cfr_renamed_9("U\u0014Gmq5r4C\u001fB\u000fG"), sprmg.cfr_renamed_88);
        cfr_renamed_4.put(sprjuy.cfr_renamed_9("\fM\u001e7m1(l+m\u001aF\u001bV\u001e"), sprmg.cfr_renamed_272);
        cfr_renamed_4.put("SHA256withECDSA", sprmg.cfr_renamed_1);
        cfr_renamed_4.put("SHA384withECDSA", sprmg.cfr_renamed_93);
        cfr_renamed_4.put(sprfjs.cfr_renamed_9("U\u0014Gi7nq5r4C\u001fB\u000fG"), sprmg.cfr_renamed_114);
    }

    public sproyc() {
        sproyc sproyc2 = this;
        sproyc2.cfr_renamed_3 = new sprqxc();
    }

    /*
     * WARNING - void declaration
     */
    public sproyc cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_3 = new sprhbd((Provider)arg0);
        return this;
    }

    public sprrc cfr_renamed_2551(String arg0, PrivateKey arg1) throws sprfya {
        return this.cfr_renamed_2552((sprtzd)cfr_renamed_4.get(arg0), arg1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprrc cfr_renamed_2552(sprtzd arg0, PrivateKey arg1) throws sprfya {
        Signature signature;
        try {
            signature = this.cfr_renamed_3.cfr_renamed_2553(arg0);
            signature.initSign(arg1);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new sprfya(new StringBuilder().insert(0, sprjuy.cfr_renamed_9("p1d=i:%+j\u007fc6k;%>i8j-l+m2?\u007f")).append(noSuchAlgorithmException.getMessage()).toString(), noSuchAlgorithmException);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new sprfya(new StringBuilder().insert(0, sprfjs.cfr_renamed_9("s2g>j9&(i|`5h8&,t3p5b9tf&")).append(noSuchProviderException.getMessage()).toString(), noSuchProviderException);
        }
        catch (InvalidKeyException invalidKeyException) {
            throw new sprfya(new StringBuilder().insert(0, sprjuy.cfr_renamed_9("6k)d3l;%4`&?\u007f")).append(invalidKeyException.getMessage()).toString(), invalidKeyException);
        }
        sprjvc sprjvc2 = new sprjvc(this, signature);
        return new sprsyc(this, arg0, sprjvc2);
    }

    private static /* synthetic */ int cfr_renamed_2547(byte[] arg0) {
        int n = arg0.length;
        if (arg0[0] == 0) {
            --n;
        }
        return n;
    }
}

