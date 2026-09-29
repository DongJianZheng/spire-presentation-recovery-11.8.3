/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprdki;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprfhk;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgij;
import com.spire.presentation.packages.sprieba;
import com.spire.presentation.packages.sprkik;
import com.spire.presentation.packages.sprmml;
import com.spire.presentation.packages.sprrpj;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprtji;
import com.spire.presentation.packages.sprvhb;
import com.spire.presentation.packages.sprwn;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;

public class sprxhj
extends SignatureSpi {
    private PSSParameterSpec cfr_renamed_107;
    private AlgorithmParameters cfr_renamed_132;
    private sprfhk cfr_renamed_102;
    private boolean cfr_renamed_93;
    private sprkik cfr_renamed_86;
    private SecureRandom cfr_renamed_152;
    private sprgf cfr_renamed_112;
    private sprwn cfr_renamed_119;
    private int cfr_renamed_91;
    private final sprrr cfr_renamed_0;
    private PSSParameterSpec cfr_renamed_1;
    private sprgf cfr_renamed_2;
    private boolean cfr_renamed_3;
    private byte cfr_renamed_4;

    private /* synthetic */ byte cfr_renamed_2480(int arg0) {
        if (arg0 == 1) {
            return -68;
        }
        throw new IllegalArgumentException(sprieba.cfr_renamed_9("c\\}\\yEx\u0012b@w[zWd\u0012p[s^r"));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void engineUpdate(byte by) throws SignatureException {
        void arg0;
        this.cfr_renamed_102.cfr_renamed_1221((byte)arg0);
        this.cfr_renamed_93 = false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGetParameters() {
        sprxhj sprxhj2;
        if (this.cfr_renamed_132 == null && this.cfr_renamed_107 != null) {
            try {
                sprxhj sprxhj3 = this;
                sprxhj3.cfr_renamed_132 = sprxhj3.cfr_renamed_0.cfr_renamed_1540(sprvhb.cfr_renamed_9("2v1"));
                sprxhj3.cfr_renamed_132.init(this.cfr_renamed_107);
                sprxhj2 = this;
                return sprxhj2.cfr_renamed_132;
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        sprxhj2 = this;
        return sprxhj2.cfr_renamed_132;
    }

    @Override
    public void engineInitSign(PrivateKey arg0) throws InvalidKeyException {
        sprxhj sprxhj2;
        if (!(arg0 instanceof RSAPrivateKey)) {
            throw new InvalidKeyException(sprieba.cfr_renamed_9("acBf^\u007fWr\u0012}Wo\u0012\u007fA6\\yF6S6`EsF@\u007fDwFsysK6[xAbSxQs"));
        }
        this.cfr_renamed_86 = sprgij.cfr_renamed_2477((RSAPrivateKey)arg0);
        sprxhj sprxhj3 = this;
        sprxhj sprxhj4 = this;
        this.cfr_renamed_102 = new sprfhk(sprxhj3.cfr_renamed_119, sprxhj3.cfr_renamed_112, sprxhj4.cfr_renamed_2, sprxhj4.cfr_renamed_91, this.cfr_renamed_4);
        if (this.cfr_renamed_152 != null) {
            sprxhj sprxhj5 = this;
            sprxhj2 = sprxhj5;
            sprxhj sprxhj6 = this;
            sprxhj5.cfr_renamed_102.cfr_renamed_5535(true, new sprbgk(sprxhj6.cfr_renamed_86, sprxhj6.cfr_renamed_152));
        } else {
            sprxhj sprxhj7 = this;
            sprxhj2 = sprxhj7;
            sprxhj7.cfr_renamed_102.cfr_renamed_5535(true, this.cfr_renamed_86);
        }
        sprxhj2.cfr_renamed_93 = true;
    }

    @Override
    public Object engineGetParameter(String arg0) {
        throw new UnsupportedOperationException(sprvhb.cfr_renamed_9("@\fB\u000bK\u0007b\u0007Q2D\u0010D\u000f@\u0016@\u0010\u0005\u0017K\u0011P\u0012U\rW\u0016@\u0006"));
    }

    @Override
    public void engineSetParameter(String arg0, Object arg1) {
        throw new UnsupportedOperationException(sprieba.cfr_renamed_9("WxU\u007f\\sasFFSdS{WbWd\u0012c\\eGfBy@bWr"));
    }

    @Override
    public void engineInitVerify(PublicKey arg0) throws InvalidKeyException {
        if (!(arg0 instanceof RSAPublicKey)) {
            throw new InvalidKeyException(sprvhb.cfr_renamed_9("1P\u0012U\u000eL\u0007ABN\u0007\\BL\u0011\u0005\fJ\u0016\u0005\u0003\u00050v#u\u0017G\u000eL\u0001n\u0007\\BL\fV\u0016D\fF\u0007"));
        }
        this.cfr_renamed_86 = sprgij.cfr_renamed_2476((RSAPublicKey)arg0);
        sprxhj sprxhj2 = this;
        sprxhj sprxhj3 = this;
        sprxhj sprxhj4 = this;
        this.cfr_renamed_102 = new sprfhk(sprxhj3.cfr_renamed_119, sprxhj3.cfr_renamed_112, sprxhj4.cfr_renamed_2, sprxhj4.cfr_renamed_91, this.cfr_renamed_4);
        this.cfr_renamed_102.cfr_renamed_5535(false, this.cfr_renamed_86);
        this.cfr_renamed_93 = true;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ (3 << 2 ^ 3);
        int cfr_ignored_0 = 3 << 3 ^ 4;
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

    public sprxhj(sprwn arg0, PSSParameterSpec arg1, boolean arg2) {
        sprxhj sprxhj2;
        sprxhj sprxhj3 = this;
        sprxhj sprxhj4 = this;
        sprxhj4.cfr_renamed_0 = new sprdki();
        sprxhj3.cfr_renamed_93 = true;
        sprxhj3.cfr_renamed_119 = arg0;
        this.cfr_renamed_1 = arg1;
        this.cfr_renamed_107 = this.cfr_renamed_1 == null ? PSSParameterSpec.DEFAULT : arg1;
        if (sprieba.cfr_renamed_9("\u007fQt'").equals(this.cfr_renamed_107.getMGFAlgorithm())) {
            sprxhj sprxhj5 = this;
            sprxhj2 = sprxhj5;
            sprxhj5.cfr_renamed_2 = sprtji.cfr_renamed_2390(sprxhj5.cfr_renamed_107.getDigestAlgorithm());
        } else {
            sprxhj sprxhj6 = this;
            sprxhj2 = sprxhj6;
            sprxhj6.cfr_renamed_2 = sprtji.cfr_renamed_2390(sprxhj6.cfr_renamed_107.getMGFAlgorithm());
        }
        sprxhj2.cfr_renamed_91 = this.cfr_renamed_107.getSaltLength();
        sprxhj sprxhj7 = this;
        this.cfr_renamed_4 = sprxhj7.cfr_renamed_2480(sprxhj7.cfr_renamed_107.getTrailerField());
        this.cfr_renamed_3 = arg2;
        this.cfr_renamed_2479();
    }

    @Override
    public boolean engineVerify(byte[] arg0) throws SignatureException {
        this.cfr_renamed_93 = true;
        return this.cfr_renamed_102.cfr_renamed_1328(arg0);
    }

    private /* synthetic */ void cfr_renamed_2479() {
        sprxhj sprxhj2 = this;
        sprxhj2.cfr_renamed_112 = sprtji.cfr_renamed_2390(sprxhj2.cfr_renamed_107.getDigestAlgorithm());
        if (sprxhj2.cfr_renamed_3) {
            sprxhj sprxhj3 = this;
            this.cfr_renamed_112 = new sprrpj(this.cfr_renamed_112);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        void arg1;
        this.cfr_renamed_152 = arg1;
        this.engineInitSign(privateKey);
    }

    public sprxhj(sprwn arg0, PSSParameterSpec arg1) {
        this(arg0, arg1, false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineSign() throws SignatureException {
        this.cfr_renamed_93 = true;
        try {
            return this.cfr_renamed_102.cfr_renamed_1329();
        }
        catch (sprmml sprmml2) {
            throw new SignatureException(sprmml2.getMessage());
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void engineUpdate(byte[] byArray, int n, int n2) throws SignatureException {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_102.cfr_renamed_1197((byte[])arg0, (int)arg1, (int)arg2);
        this.cfr_renamed_93 = false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void engineSetParameter(AlgorithmParameterSpec arg0) throws InvalidAlgorithmParameterException {
        sprgf sprgf2;
        sprgf sprgf3;
        sprxhj sprxhj2;
        if (arg0 == null) {
            if (this.cfr_renamed_1 == null) return;
            sprxhj sprxhj3 = this;
            sprxhj2 = sprxhj3;
            arg0 = sprxhj3.cfr_renamed_1;
        } else {
            sprxhj2 = this;
        }
        if (!sprxhj2.cfr_renamed_93) {
            throw new ProviderException(sprvhb.cfr_renamed_9("F\u0003K\fJ\u0016\u0005\u0001D\u000eIBV\u0007Q2D\u0010D\u000f@\u0016@\u0010\u0005\u000bKBQ\n@BH\u000bA\u0006I\u0007\u0005\rCBP\u0012A\u0003Q\u0007"));
        }
        if (!(arg0 instanceof PSSParameterSpec)) throw new InvalidAlgorithmParameterException(sprieba.cfr_renamed_9("Y\\zK6bEaFSdS{WbWdafWu\u0012eGfBy@bWr"));
        PSSParameterSpec pSSParameterSpec = (PSSParameterSpec)arg0;
        if (this.cfr_renamed_1 != null && !sprtji.cfr_renamed_2389(this.cfr_renamed_1.getDigestAlgorithm(), pSSParameterSpec.getDigestAlgorithm())) {
            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprieba.cfr_renamed_9("Bw@w_sFs@6_cAb\u0012tW6Ge[xU6")).append(this.cfr_renamed_1.getDigestAlgorithm()).toString());
        }
        if (pSSParameterSpec.getMGFAlgorithm().equalsIgnoreCase(sprvhb.cfr_renamed_9("h%cS")) || pSSParameterSpec.getMGFAlgorithm().equals(sprdl.cfr_renamed_135.cfr_renamed_19())) {
            if (!(pSSParameterSpec.getMGFParameters() instanceof MGF1ParameterSpec)) {
                throw new InvalidAlgorithmParameterException(sprieba.cfr_renamed_9("GxYx]a\\6\u007fQt6Bw@w_sFs@e"));
            }
            MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec)pSSParameterSpec.getMGFParameters();
            if (!sprtji.cfr_renamed_2389(mGF1ParameterSpec.getDigestAlgorithm(), pSSParameterSpec.getDigestAlgorithm())) {
                throw new InvalidAlgorithmParameterException(sprvhb.cfr_renamed_9("A\u000bB\u0007V\u0016\u0005\u0003I\u0005J\u0010L\u0016M\u000f\u0005\u0004J\u0010\u0005/b$\u0005\u0011M\rP\u000eABG\u0007\u0005\u0016M\u0007\u0005\u0011D\u000f@BD\u0011\u0005\u0004J\u0010\u00052v1\u0005\u0012D\u0010D\u000f@\u0016@\u0010VL"));
            }
            sprgf2 = sprgf3 = sprtji.cfr_renamed_2390(mGF1ParameterSpec.getDigestAlgorithm());
        } else {
            if (!pSSParameterSpec.getMGFAlgorithm().equals("SHAKE128") && !pSSParameterSpec.getMGFAlgorithm().equals("SHAKE256")) throw new InvalidAlgorithmParameterException(sprieba.cfr_renamed_9("GxYx]a\\6_wA}\u0012qWxWdSb[y\\6Tc\\uF\u007f]x\u0012eBsQ\u007fT\u007fWr"));
            sprgf2 = sprgf3 = sprtji.cfr_renamed_2390(pSSParameterSpec.getMGFAlgorithm());
        }
        if (sprgf2 == null) {
            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprvhb.cfr_renamed_9("\fJBH\u0003Q\u0001MBJ\f\u0005/b$\u0005\u0003I\u0005J\u0010L\u0016M\u000f\u001fB")).append(pSSParameterSpec.getMGFAlgorithm()).toString());
        }
        sprxhj sprxhj4 = this;
        this.cfr_renamed_132 = null;
        this.cfr_renamed_107 = pSSParameterSpec;
        sprxhj4.cfr_renamed_2 = sprgf3;
        sprxhj4.cfr_renamed_91 = this.cfr_renamed_107.getSaltLength();
        sprxhj4.cfr_renamed_4 = sprxhj4.cfr_renamed_2480(sprxhj4.cfr_renamed_107.getTrailerField());
        sprxhj4.cfr_renamed_2479();
        if (sprxhj4.cfr_renamed_86 == null) return;
        sprxhj sprxhj5 = this;
        sprxhj sprxhj6 = this;
        this.cfr_renamed_102 = new sprfhk(sprxhj5.cfr_renamed_119, sprxhj5.cfr_renamed_112, sprgf3, sprxhj6.cfr_renamed_91, sprxhj6.cfr_renamed_4);
        sprxhj sprxhj7 = this;
        if (this.cfr_renamed_86.cfr_renamed_1352()) {
            sprxhj7.cfr_renamed_102.cfr_renamed_5535(true, this.cfr_renamed_86);
            return;
        }
        sprxhj7.cfr_renamed_102.cfr_renamed_5535(false, this.cfr_renamed_86);
    }
}

