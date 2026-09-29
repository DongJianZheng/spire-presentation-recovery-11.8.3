/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.charts.entity.ChartTextArea;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdim;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgij;
import com.spire.presentation.packages.sprkik;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqmk;
import com.spire.presentation.packages.sprwn;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;

public class sprznj
extends SignatureSpi {
    private sprddm cfr_renamed_2;
    private sprwn cfr_renamed_3;
    private sprgf cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprznj(sprgf sprgf2, sprwn sprwn2) {
        void arg1;
        void arg0;
        sprznj sprznj2 = this;
        this.cfr_renamed_4 = arg0;
        sprznj2.cfr_renamed_3 = arg1;
        sprznj2.cfr_renamed_2 = null;
    }

    @Override
    public void engineInitSign(PrivateKey arg0) throws InvalidKeyException {
        if (!(arg0 instanceof RSAPrivateKey)) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprqmk.cfr_renamed_9("gGDBX[QV\u0014YQK\u0014\u001a")).append(this.cfr_renamed_2482(arg0)).append(ChartTextArea.cfr_renamed_9("R\"\u0012q[l\u0014v[c[P(C+p\u0012t\u001av\u001eI\u001e{[k\u0015q\u000fc\u0015a\u001e")).toString());
        }
        sprkik sprkik2 = sprgij.cfr_renamed_2477((RSAPrivateKey)arg0);
        sprznj sprznj2 = this;
        sprznj2.cfr_renamed_4.cfr_renamed_41();
        sprznj2.cfr_renamed_3.cfr_renamed_5535(true, sprkik2);
    }

    @Override
    public Object engineGetParameter(String arg0) {
        return null;
    }

    private /* synthetic */ String cfr_renamed_2482(Object arg0) {
        if (arg0 == null) {
            return null;
        }
        return arg0.getClass().getName();
    }

    @Override
    public void engineSetParameter(String arg0, Object arg1) {
        throw new UnsupportedOperationException(sprqmk.cfr_renamed_9("Q\\S[ZWgW@bU@U_QFQ@\u0014GZAABD]FFQV"));
    }

    @Override
    public void engineInitVerify(PublicKey arg0) throws InvalidKeyException {
        if (!(arg0 instanceof RSAPublicKey)) {
            throw new InvalidKeyException(new StringBuilder().insert(0, ChartTextArea.cfr_renamed_9("Q\u000er\u000bn\u0012g\u001f\"\u0010g\u0002\"S")).append(this.cfr_renamed_2482(arg0)).append(sprqmk.cfr_renamed_9("\u001d\u0012]A\u0014\\[F\u0014S\u0014`gsdGV^]Q\u007fWM\u0012]\\GFU\\WW")).toString());
        }
        sprkik sprkik2 = sprgij.cfr_renamed_2476((RSAPublicKey)arg0);
        sprznj sprznj2 = this;
        sprznj2.cfr_renamed_4.cfr_renamed_41();
        sprznj2.cfr_renamed_3.cfr_renamed_5535(false, sprkik2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineSign() throws SignatureException {
        sprznj sprznj2 = this;
        byte[] byArray = new byte[sprznj2.cfr_renamed_4.cfr_renamed_1218()];
        sprznj2.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        try {
            sprznj sprznj3 = this;
            byte[] byArray2 = sprznj3.cfr_renamed_2481(byArray);
            return sprznj3.cfr_renamed_3.cfr_renamed_1337(byArray2, 0, byArray2.length);
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw new SignatureException(ChartTextArea.cfr_renamed_9("i\u001e{[v\u0014m[q\u0016c\u0017n[d\u0014p[q\u0012e\u0015c\u000fw\tg[v\u0002r\u001e"));
        }
        catch (Exception exception) {
            throw new SignatureException(exception.toString());
        }
    }

    @Override
    public void engineUpdate(byte[] arg0, int arg1, int arg2) throws SignatureException {
        this.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, arg2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean engineVerify(byte[] arg0) throws SignatureException {
        int n;
        byte[] byArray;
        byte[] byArray2;
        sprznj sprznj2 = this;
        byte[] byArray3 = new byte[sprznj2.cfr_renamed_4.cfr_renamed_1218()];
        sprznj2.cfr_renamed_4.cfr_renamed_1219(byArray3, 0);
        try {
            byArray2 = this.cfr_renamed_3.cfr_renamed_1337(arg0, 0, arg0.length);
            byArray = this.cfr_renamed_2481(byArray3);
        }
        catch (Exception exception) {
            return false;
        }
        if (byArray2.length == byArray.length) {
            return sproze.cfr_renamed_559(byArray2, byArray);
        }
        if (byArray2.length != byArray.length - 2) {
            sproze.cfr_renamed_559(byArray, byArray);
            return false;
        }
        byte[] byArray4 = byArray;
        byte[] byArray5 = byArray;
        byArray4[1] = (byte)(byArray4[1] - 2);
        byArray5[3] = (byte)(byArray5[3] - 2);
        int n2 = 4 + byArray[3];
        int n3 = n2 + 2;
        int n4 = 0;
        int n5 = n = 0;
        while (n5 < byArray.length - n3) {
            byte by = byArray2[n2 + n];
            byte by2 = byArray[n3 + n];
            n4 |= by ^ by2;
            n5 = ++n;
        }
        int n6 = n = 0;
        while (n6 < n2) {
            byte by = byArray2[n];
            byte by3 = byArray[n];
            n4 |= by ^ by3;
            n6 = ++n;
        }
        return n4 == 0;
    }

    @Override
    public void engineSetParameter(AlgorithmParameterSpec arg0) {
        throw new UnsupportedOperationException(sprqmk.cfr_renamed_9("Q\\S[ZWgW@bU@U_QFQ@\u0014GZAABD]FFQV"));
    }

    @Override
    public void engineUpdate(byte arg0) throws SignatureException {
        this.cfr_renamed_4.cfr_renamed_1221(arg0);
    }

    private /* synthetic */ byte[] cfr_renamed_2481(byte[] arg0) throws IOException {
        if (this.cfr_renamed_2 == null) {
            return arg0;
        }
        return new sprdim(this.cfr_renamed_2, arg0).cfr_renamed_104("DER");
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3;
        int cfr_ignored_0 = (3 ^ 5) << 3 ^ 5;
        int n4 = n2;
        int n5 = 1 << 3 ^ 5;
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
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprznj(sprlem sprlem2, sprgf sprgf2, sprwn sprwn2) {
        void arg0;
        void arg1;
        sprznj sprznj2 = this;
        sprznj2.cfr_renamed_4 = arg1;
        sprznj2.cfr_renamed_3 = sprwn2;
        sprznj sprznj3 = this;
        sprznj2.cfr_renamed_2 = new sprddm((sprlem)arg0, sprpen.cfr_renamed_4);
    }
}

