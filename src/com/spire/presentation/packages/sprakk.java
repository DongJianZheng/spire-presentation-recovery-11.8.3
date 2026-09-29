/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbpo;
import com.spire.presentation.packages.sprdgk;
import com.spire.presentation.packages.sprehk;
import com.spire.presentation.packages.sprgkk;
import com.spire.presentation.packages.sprglk;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprihk;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlkk;
import com.spire.presentation.packages.sprqz;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprws;
import com.spire.presentation.packages.sprxkk;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Signature;
import java.util.Arrays;
import java.util.Hashtable;

public class sprakk {
    private sprehk cfr_renamed_3;
    private static final Hashtable cfr_renamed_4 = new Hashtable();

    private static /* synthetic */ void cfr_renamed_2549(byte[] arg0, byte[] arg1, int arg2) {
        int n = arg0.length;
        int n2 = 0;
        if (arg0[0] == 0) {
            n2 = 1;
            --n;
        }
        System.arraycopy(arg0, n2, arg1, arg2, n);
    }

    public static /* synthetic */ byte[] cfr_renamed_2550(byte[] arg0) {
        return sprakk.cfr_renamed_2546(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprakk cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_3 = new sprihk((String)arg0);
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprqz cfr_renamed_9817(sprlem arg0, PrivateKey arg1) throws sprhjg {
        Signature signature;
        try {
            signature = this.cfr_renamed_3.cfr_renamed_8039(arg0);
            signature.initSign(arg1);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new sprhjg(new StringBuilder().insert(0, sprdgk.cfr_renamed_9("eZqV|Q0@\u007f\u0014v]~P0U|S\u007fFy@xY*\u0014")).append(noSuchAlgorithmException.getMessage()).toString(), noSuchAlgorithmException);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new sprhjg(new StringBuilder().insert(0, sprbpo.cfr_renamed_9("2^&R+UgD(\u0010!Y)Tg@5_1Y#U5\ng")).append(noSuchProviderException.getMessage()).toString(), noSuchProviderException);
        }
        catch (InvalidKeyException invalidKeyException) {
            throw new sprhjg(new StringBuilder().insert(0, sprdgk.cfr_renamed_9("]~BqXyP0_uM*\u0014")).append(invalidKeyException.getMessage()).toString(), invalidKeyException);
        }
        sprgkk sprgkk2 = new sprgkk(signature);
        return new sprglk(this, arg0, sprgkk2);
    }

    public sprakk() {
        sprakk sprakk2 = this;
        sprakk2.cfr_renamed_3 = new sprlkk();
    }

    public sprqz cfr_renamed_2551(String arg0, PrivateKey arg1) throws sprhjg {
        return this.cfr_renamed_9817((sprlem)cfr_renamed_4.get(arg0), arg1);
    }

    private static /* synthetic */ int cfr_renamed_2547(byte[] arg0) {
        int n = arg0.length;
        if (arg0[0] == 0) {
            --n;
        }
        return n;
    }

    static {
        cfr_renamed_4.put(sprbpo.cfr_renamed_9("\u0014x\u0006\u00010Y3X\u0015c\u0006"), sprws.cfr_renamed_31);
        cfr_renamed_4.put(sprdgk.cfr_renamed_9("gXu\"\u0001&Cy@xfCu"), sprws.cfr_renamed_93);
        cfr_renamed_4.put(sprbpo.cfr_renamed_9("c\u000fqvG.D/b\u0014q&^#}\u0000vv"), sprws.cfr_renamed_119);
        cfr_renamed_4.put(sprdgk.cfr_renamed_9("C|Q\u0006%\u0002g]d\\BgQU~P]sV\u0005"), sprws.cfr_renamed_132);
        cfr_renamed_4.put(sprbpo.cfr_renamed_9("\u0014x\u0006\u0005v\u00020Y3X\u0015c\u0006"), sprws.cfr_renamed_102);
        cfr_renamed_4.put(sprdgk.cfr_renamed_9("C|Q\u0001!\u0006g]d\\BgQU~P]sV\u0005"), sprws.cfr_renamed_145);
        cfr_renamed_4.put(sprbpo.cfr_renamed_9("\u0014x\u0006\u00010Y3X\u0002s\u0003c\u0006"), sprws.cfr_renamed_152);
        cfr_renamed_4.put(sprdgk.cfr_renamed_9("gXu\"\u0006$Cy@xqSpCu"), sprws.cfr_renamed_4);
        cfr_renamed_4.put("SHA256withECDSA", sprws.cfr_renamed_105);
        cfr_renamed_4.put("SHA384withECDSA", sprws.cfr_renamed_2);
        cfr_renamed_4.put(sprbpo.cfr_renamed_9("\u0014x\u0006\u0005v\u00020Y3X\u0002s\u0003c\u0006"), sprws.cfr_renamed_0);
    }

    /*
     * WARNING - void declaration
     */
    public sprakk cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_3 = new sprxkk((Provider)arg0);
        return this;
    }

    private static /* synthetic */ byte[] cfr_renamed_2546(byte[] arg0) {
        sprszm sprszm2 = sprszm.cfr_renamed_23(arg0);
        BigInteger bigInteger = sprktm.cfr_renamed_23(sprszm2.cfr_renamed_85(0)).cfr_renamed_97();
        BigInteger bigInteger2 = sprktm.cfr_renamed_23(sprszm2.cfr_renamed_85(1)).cfr_renamed_97();
        byte[] byArray = bigInteger.toByteArray();
        byte[] byArray2 = bigInteger2.toByteArray();
        int n = sprakk.cfr_renamed_2547(byArray);
        int n2 = sprakk.cfr_renamed_2547(byArray2);
        int n3 = sprakk.cfr_renamed_2548(n, n2);
        byte[] byArray3 = new byte[n3 * 2];
        Arrays.fill(byArray3, (byte)0);
        sprakk.cfr_renamed_2549(byArray, byArray3, n3 - n);
        sprakk.cfr_renamed_2549(byArray2, byArray3, 2 * n3 - n2);
        return byArray3;
    }

    public static int cfr_renamed_2548(int arg0, int arg1) {
        if (arg0 > arg1) {
            return arg0;
        }
        return arg1;
    }
}

