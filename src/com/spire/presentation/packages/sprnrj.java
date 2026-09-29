/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmsh;
import com.spire.presentation.packages.sprnnaa;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprwlb;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxum;
import com.spire.presentation.packages.spryxh;
import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

public class sprnrj
extends AlgorithmParametersSpi {
    public spryxh cfr_renamed_4;

    @Override
    public String engineToString() {
        return sprwlb.cfr_renamed_9("\u000es\u001ahz\bx\fil(N(Q,H,N:");
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 3 ^ 2;
        int cfr_ignored_0 = 1 << 3 ^ 1;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ 1 << 1;
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

    @Override
    public void engineInit(AlgorithmParameterSpec arg0) throws InvalidParameterSpecException {
        if (!(arg0 instanceof spryxh)) {
            throw new InvalidParameterSpecException(sprnnaa.cfr_renamed_9("hd|\u007f\u001c\u001f\u001e\u001b\u007fJ]JBN[N]x_NL\u000b]N^^FYJO\u000f_@\u000bFEF_FJCB\\N\u000fJ\u000fl`x{\u0018\u001b\u001a\u001f\u000bNGHD]B[CB\u000b_J]JBN[N]X\u000fDMAJH["));
        }
        this.cfr_renamed_4 = (spryxh)arg0;
    }

    public boolean cfr_renamed_2396(String arg0) {
        return arg0 == null || arg0.equals("ASN.1");
    }

    @Override
    public void engineInit(byte[] arg0, String arg1) throws IOException {
        if (this.cfr_renamed_2396(arg1) || arg1.equalsIgnoreCase(sprwlb.cfr_renamed_9("\u0011\u0012|\fp"))) {
            this.engineInit(arg0);
            return;
        }
        throw new IOException(new StringBuilder().insert(0, sprnnaa.cfr_renamed_9("zEDE@\\A\u000b_J]JBN[N]\u000bID]FN_\u000f")).append(arg1).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineGetEncoded() {
        sprxum sprxum2 = new sprxum(new sprlem(this.cfr_renamed_4.cfr_renamed_2109()), new sprlem(this.cfr_renamed_4.cfr_renamed_2108()), new sprlem(this.cfr_renamed_4.cfr_renamed_2101()));
        try {
            return sprxum2.cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new RuntimeException(sprwlb.cfr_renamed_9("\fN;S;\u001c,R*S-U'[i{\u0006o\u001d\u000f}\ryl(N(Q,H,N:"));
        }
    }

    public AlgorithmParameterSpec cfr_renamed_2397(Class arg0) throws InvalidParameterSpecException {
        if (arg0 == sprmsh.class || arg0 == AlgorithmParameterSpec.class) {
            return this.cfr_renamed_4;
        }
        throw new InvalidParameterSpecException(sprnnaa.cfr_renamed_9("^A@ADXE\u000f[NYNFJ_JY\u000fX_NL\u000b_J\\XJO\u000f_@\u000bhd|\u007f\u001c\u001f\u001e\u001b\u000f[NYNFJ_JY\\\u000b@IENL_\u0001"));
    }

    public AlgorithmParameterSpec engineGetParameterSpec(Class arg0) throws InvalidParameterSpecException {
        if (arg0 == null) {
            throw new NullPointerException(sprwlb.cfr_renamed_9("(N.I$Y'HiH&\u001c.Y=l(N(Q,H,N\u001aL,_iQ<O=\u001c'S=\u001c+YiR<P%"));
        }
        return this.cfr_renamed_2397(arg0);
    }

    @Override
    public byte[] engineGetEncoded(String arg0) {
        if (this.cfr_renamed_2396(arg0) || arg0.equalsIgnoreCase(sprnnaa.cfr_renamed_9("w\u0005\u001a\u001b\u0016"))) {
            return this.engineGetEncoded();
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(byte[] arg0) throws IOException {
        try {
            sprszm sprszm2 = (sprszm)sprxgf.cfr_renamed_184(arg0);
            this.cfr_renamed_4 = spryxh.cfr_renamed_9051(sprxum.cfr_renamed_23(sprszm2));
            return;
        }
        catch (ClassCastException classCastException) {
            throw new IOException(sprwlb.cfr_renamed_9("r&Hi]iJ(P Xi{\u0006o\u001d\u000f}\ry\u001c\u0019];]$Y=Y;\u001c,R*S-U'[g"));
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw new IOException(sprnnaa.cfr_renamed_9("e@_\u000fJ\u000f]NGFO\u000fl`x{\u0018\u001b\u001a\u001f\u000b\u007fJ]JBN[N]\u000bJELDKBAL\u0001"));
        }
    }
}

