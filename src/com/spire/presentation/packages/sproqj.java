/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbxm;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcsh;
import com.spire.presentation.packages.sprczx;
import com.spire.presentation.packages.sprfkba;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.io.IOException;
import java.math.BigInteger;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.Enumeration;

public class sproqj
extends AlgorithmParametersSpi {
    public sprcsh cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 2 << 1;
        int cfr_ignored_0 = (2 ^ 5) << 4;
        int n4 = n2;
        int n5 = 4 << 3 ^ 5;
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

    public AlgorithmParameterSpec cfr_renamed_2397(Class arg0) throws InvalidParameterSpecException {
        if (arg0 == sprcsh.class || arg0 == AlgorithmParameterSpec.class) {
            return this.cfr_renamed_4;
        }
        throw new InvalidParameterSpecException(sprfkba.cfr_renamed_9("7\f)\f-\u0015,B2\u00030\u0003/\u00076\u00070B1\u0012'\u0001b\u0012#\u00111\u0007&B6\rb'.%#\u000f#\u000eb\u0012#\u0010#\u000f'\u0016'\u00101B-\u0000(\u0007!\u0016l"));
    }

    @Override
    public String engineToString() {
        return sprczx.cfr_renamed_9("34)Q*\u0010\b\u0010\u0017\u0014\u000e\u0014\b\u0002");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineGetEncoded() {
        try {
            sprrvm sprrvm2 = new sprrvm();
            if (this.cfr_renamed_4.cfr_renamed_2097() != null) {
                sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)new sprfvg(this.cfr_renamed_4.cfr_renamed_2097())));
            }
            if (this.cfr_renamed_4.cfr_renamed_2099() != null) {
                sprrvm2.cfr_renamed_5004(new sprycn(false, 1, (sprco)new sprfvg(this.cfr_renamed_4.cfr_renamed_2099())));
            }
            sprrvm2.cfr_renamed_5004(new sprktm(this.cfr_renamed_4.cfr_renamed_2100()));
            if (this.cfr_renamed_4.cfr_renamed_596() != null) {
                sprrvm sprrvm3;
                sprrvm sprrvm4 = sprrvm3 = new sprrvm();
                sprrvm4.cfr_renamed_5004(new sprktm(this.cfr_renamed_4.cfr_renamed_2098()));
                sprrvm4.cfr_renamed_5004(new sprfvg(this.cfr_renamed_4.cfr_renamed_596()));
                sprrvm2.cfr_renamed_5004(new sprcen(sprrvm3));
            }
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4.cfr_renamed_9050() ? sprbxm.cfr_renamed_91 : sprbxm.cfr_renamed_4);
            return new sprcen(sprrvm2).cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new RuntimeException(sprfkba.cfr_renamed_9("'0\u0010-\u0010b\u0007,\u0001-\u0006+\f%B\u000b'\u00112#\u0010#\u000f'\u0016'\u00101"));
        }
    }

    @Override
    public void engineInit(byte[] arg0, String arg1) throws IOException {
        if (this.cfr_renamed_2396(arg1) || arg1.equalsIgnoreCase(sprczx.cfr_renamed_9(")TDJH"))) {
            this.engineInit(arg0);
            return;
        }
        throw new IOException(new StringBuilder().insert(0, sprfkba.cfr_renamed_9("\u0017\f)\f-\u0015,B2\u00030\u0003/\u00076\u00070B$\r0\u000f#\u0016b")).append(arg1).toString());
    }

    @Override
    public void engineInit(AlgorithmParameterSpec arg0) throws InvalidParameterSpecException {
        if (!(arg0 instanceof sprcsh)) {
            throw new InvalidParameterSpecException(sprczx.cfr_renamed_9("8?\"*\u0010\b\u0010\u0017\u0014\u000e\u0014\b\"\n\u0014\u0019Q\b\u0014\u000b\u0004\u0013\u0003\u001f\u0015Z\u0005\u0015Q\u0013\u001f\u0013\u0005\u0013\u0010\u0016\u0018\t\u0014Z\u0010Z8?\"Z\u0010\u0016\u0016\u0015\u0003\u0013\u0005\u0012\u001cZ\u0001\u001b\u0003\u001b\u001c\u001f\u0005\u001f\u0003\tQ\u0015\u0013\u0010\u0014\u0019\u0005"));
        }
        this.cfr_renamed_4 = (sprcsh)arg0;
    }

    @Override
    public void engineInit(byte[] arg0) throws IOException {
        try {
            sprszm sprszm2 = (sprszm)sprxgf.cfr_renamed_184(arg0);
            if (sprszm2.cfr_renamed_84() > 5) {
                throw new IOException(sprfkba.cfr_renamed_9("\u0011'\u00137\u0007,\u0001'B6\r-B \u000b%"));
            }
            byte[] byArray = null;
            byte[] byArray2 = null;
            BigInteger bigInteger = null;
            BigInteger bigInteger2 = null;
            byte[] byArray3 = null;
            boolean bl = false;
            Enumeration enumeration = sprszm2.cfr_renamed_329();
            while (enumeration.hasMoreElements()) {
                sprxgf sprxgf2;
                Object e = enumeration.nextElement();
                if (e instanceof sprnvm) {
                    sprxgf2 = sprnvm.cfr_renamed_23(e);
                    if (sprxgf2.cfr_renamed_312() == 0) {
                        byArray = sproug.cfr_renamed_5085(sprxgf2, false).cfr_renamed_186();
                        continue;
                    }
                    if (sprxgf2.cfr_renamed_312() != 1) continue;
                    byArray2 = sproug.cfr_renamed_5085(sprxgf2, false).cfr_renamed_186();
                    continue;
                }
                Object e2 = e;
                if (e instanceof sprktm) {
                    bigInteger = sprktm.cfr_renamed_23(e2).cfr_renamed_97();
                    continue;
                }
                Object e3 = e;
                if (e2 instanceof sprszm) {
                    sprxgf2 = sprszm.cfr_renamed_23(e3);
                    bigInteger2 = sprktm.cfr_renamed_23(((sprszm)sprxgf2).cfr_renamed_85(0)).cfr_renamed_97();
                    byArray3 = sproug.cfr_renamed_23(((sprszm)sprxgf2).cfr_renamed_85(1)).cfr_renamed_186();
                    continue;
                }
                if (!(e3 instanceof sprbxm)) continue;
                bl = sprbxm.cfr_renamed_23(e).cfr_renamed_587();
            }
            sproqj sproqj2 = this;
            if (bigInteger2 != null) {
                sproqj sproqj3 = this;
                sproqj2.cfr_renamed_4 = new sprcsh(byArray, byArray2, bigInteger.intValue(), bigInteger2.intValue(), byArray3, bl);
                return;
            }
            sproqj2.cfr_renamed_4 = new sprcsh(byArray, byArray2, bigInteger.intValue(), -1, null, bl);
            return;
        }
        catch (ClassCastException classCastException) {
            throw new IOException(sprczx.cfr_renamed_9("?\u0015\u0005Z\u0010Z\u0007\u001b\u001d\u0013\u0015Z8?\"Z!\u001b\u0003\u001b\u001c\u001f\u0005\u001f\u0003Z\u0014\u0014\u0012\u0015\u0015\u0013\u001f\u001d_"));
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw new IOException(sprfkba.cfr_renamed_9("\f\r6B#B4\u0003.\u000b&B\u000b'\u0011B\u0012\u00030\u0003/\u00076\u00070B'\f!\r&\u000b,\u0005l"));
        }
    }

    public AlgorithmParameterSpec engineGetParameterSpec(Class arg0) throws InvalidParameterSpecException {
        if (arg0 == null) {
            throw new NullPointerException(sprczx.cfr_renamed_9("\u0010\b\u0016\u000f\u001c\u001f\u001f\u000eQ\u000e\u001eZ\u0016\u001f\u0005*\u0010\b\u0010\u0017\u0014\u000e\u0014\b\"\n\u0014\u0019Q\u0017\u0004\t\u0005Z\u001f\u0015\u0005Z\u0013\u001fQ\u0014\u0004\u0016\u001d"));
        }
        return this.cfr_renamed_2397(arg0);
    }

    @Override
    public byte[] engineGetEncoded(String arg0) {
        if (this.cfr_renamed_2396(arg0) || arg0.equalsIgnoreCase(sprfkba.cfr_renamed_9("\u001aLwR{"))) {
            return this.engineGetEncoded();
        }
        return null;
    }

    public boolean cfr_renamed_2396(String arg0) {
        return arg0 == null || arg0.equals("ASN.1");
    }
}

