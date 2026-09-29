/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprald;
import com.spire.presentation.packages.spremc;
import com.spire.presentation.packages.sprflb;
import com.spire.presentation.packages.sprfpc;
import com.spire.presentation.packages.sprh;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprqzc;
import com.spire.presentation.packages.sprsdz;
import com.spire.presentation.packages.sprvmd;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;

public class spryic
extends SignatureSpi {
    private boolean cfr_renamed_86;
    private sprlc cfr_renamed_152;
    private sprh cfr_renamed_112;
    private sprqzc cfr_renamed_119;
    private byte cfr_renamed_91;
    private PSSParameterSpec cfr_renamed_0;
    private PSSParameterSpec cfr_renamed_1;
    private AlgorithmParameters cfr_renamed_2;
    private sprlc cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGetParameters() {
        spryic spryic2;
        if (this.cfr_renamed_2 == null && this.cfr_renamed_0 != null) {
            try {
                this.cfr_renamed_2 = AlgorithmParameters.getInstance(sprald.cfr_renamed_9("\u0017|\u0014"), "BC");
                this.cfr_renamed_2.init(this.cfr_renamed_0);
                spryic2 = this;
                return spryic2.cfr_renamed_2;
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        spryic2 = this;
        return spryic2.cfr_renamed_2;
    }

    private /* synthetic */ void cfr_renamed_2479() {
        if (this.cfr_renamed_86) {
            spryic spryic2 = this;
            this.cfr_renamed_152 = new sprfpc(this, this.cfr_renamed_3);
            return;
        }
        this.cfr_renamed_152 = this.cfr_renamed_3;
    }

    @Override
    public void engineUpdate(byte[] arg0, int arg1, int arg2) throws SignatureException {
        this.cfr_renamed_119.cfr_renamed_1197(arg0, arg1, arg2);
    }

    public spryic(sprh arg0, PSSParameterSpec arg1, boolean arg2) {
        spryic spryic2;
        this.cfr_renamed_112 = arg0;
        this.cfr_renamed_1 = arg1;
        if (this.cfr_renamed_1 == null) {
            spryic2 = this;
            this.cfr_renamed_0 = PSSParameterSpec.DEFAULT;
        } else {
            spryic2 = this;
            this.cfr_renamed_0 = arg1;
        }
        spryic2.cfr_renamed_3 = sprflb.cfr_renamed_2390(this.cfr_renamed_0.getDigestAlgorithm());
        spryic spryic3 = this;
        spryic3.cfr_renamed_4 = spryic3.cfr_renamed_0.getSaltLength();
        this.cfr_renamed_91 = spryic3.cfr_renamed_2480(spryic3.cfr_renamed_0.getTrailerField());
        this.cfr_renamed_86 = arg2;
        this.cfr_renamed_2479();
    }

    @Override
    public void engineUpdate(byte arg0) throws SignatureException {
        this.cfr_renamed_119.cfr_renamed_1221(arg0);
    }

    @Override
    public void engineInitSign(PrivateKey arg0) throws InvalidKeyException {
        if (!(arg0 instanceof RSAPrivateKey)) {
            throw new InvalidKeyException(sprsdz.cfr_renamed_9("2r\u0011w\rn\u0004cAl\u0004~An\u0012'\u000fh\u0015'\u0000'3T W\u0013n\u0017f\u0015b*b\u0018'\bi\u0012s\u0000i\u0002b"));
        }
        spryic spryic2 = this;
        spryic spryic3 = this;
        this.cfr_renamed_119 = new sprqzc(this.cfr_renamed_112, spryic2.cfr_renamed_152, spryic2.cfr_renamed_3, spryic3.cfr_renamed_4, spryic3.cfr_renamed_91);
        this.cfr_renamed_119.cfr_renamed_1217(true, spremc.cfr_renamed_2477((RSAPrivateKey)arg0));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineSign() throws SignatureException {
        try {
            return this.cfr_renamed_119.cfr_renamed_1329();
        }
        catch (sprvmd sprvmd2) {
            throw new SignatureException(sprvmd2.getMessage());
        }
    }

    @Override
    public void engineSetParameter(AlgorithmParameterSpec arg0) throws InvalidParameterException {
        if (arg0 instanceof PSSParameterSpec) {
            PSSParameterSpec pSSParameterSpec = (PSSParameterSpec)arg0;
            if (this.cfr_renamed_1 != null && !sprflb.cfr_renamed_2389(this.cfr_renamed_1.getDigestAlgorithm(), pSSParameterSpec.getDigestAlgorithm())) {
                throw new InvalidParameterException(new StringBuilder().insert(0, sprald.cfr_renamed_9("_&]&B\"[\"]gB2\\3\u000f%JgZ4F)Hg")).append(this.cfr_renamed_1.getDigestAlgorithm()).toString());
            }
            if (!pSSParameterSpec.getMGFAlgorithm().equalsIgnoreCase(sprsdz.cfr_renamed_9(",@'6")) && !pSSParameterSpec.getMGFAlgorithm().equals(sprm.cfr_renamed_123.cfr_renamed_19())) {
                throw new InvalidParameterException(sprald.cfr_renamed_9("Z)D)@0AgB&\\,\u000f J)J5N3F(AgI2A$[.@)\u000f4_\"L.I.J#"));
            }
            if (!(pSSParameterSpec.getMGFParameters() instanceof MGF1ParameterSpec)) {
                throw new InvalidParameterException(sprsdz.cfr_renamed_9("r\u000fl\u000ep\u000f',@''\u0011f\u0013f\fb\u0015b\u0013t"));
            }
            MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec)pSSParameterSpec.getMGFParameters();
            if (!sprflb.cfr_renamed_2389(mGF1ParameterSpec.getDigestAlgorithm(), pSSParameterSpec.getDigestAlgorithm())) {
                throw new InvalidParameterException(sprald.cfr_renamed_9("K.H\"\\3\u000f&C @5F3G*\u000f!@5\u000f\nh\u0001\u000f4G(Z+KgM\"\u000f3G\"\u000f4N*JgN4\u000f!@5\u000f\u0017|\u0014\u000f7N5N*J3J5\\i"));
            }
            sprlc sprlc2 = sprflb.cfr_renamed_2390(mGF1ParameterSpec.getDigestAlgorithm());
            if (sprlc2 == null) {
                throw new InvalidParameterException(new StringBuilder().insert(0, sprsdz.cfr_renamed_9("\u000fhAj\u0000s\u0002oAh\u000f',@''\u0005n\u0006b\u0012sAf\r`\u000eu\bs\tj['")).append(mGF1ParameterSpec.getDigestAlgorithm()).toString());
            }
            spryic spryic2 = this;
            this.cfr_renamed_2 = null;
            this.cfr_renamed_0 = pSSParameterSpec;
            spryic2.cfr_renamed_3 = sprlc2;
            spryic2.cfr_renamed_4 = this.cfr_renamed_0.getSaltLength();
            spryic2.cfr_renamed_91 = spryic2.cfr_renamed_2480(spryic2.cfr_renamed_0.getTrailerField());
            spryic2.cfr_renamed_2479();
            return;
        }
        throw new InvalidParameterException(sprald.cfr_renamed_9("\bA+Vg\u007f\u0014|\u0017N5N*J3J5|7J$\u000f4Z7_(]3J#"));
    }

    private /* synthetic */ byte cfr_renamed_2480(int arg0) {
        if (arg0 == 1) {
            return -68;
        }
        throw new IllegalArgumentException(sprsdz.cfr_renamed_9("r\u000fl\u000fh\u0016iAs\u0013f\bk\u0004uAa\bb\rc"));
    }

    @Override
    public boolean engineVerify(byte[] arg0) throws SignatureException {
        return this.cfr_renamed_119.cfr_renamed_1328(arg0);
    }

    @Override
    public void engineInitSign(PrivateKey arg0, SecureRandom arg1) throws InvalidKeyException {
        if (!(arg0 instanceof RSAPrivateKey)) {
            throw new InvalidKeyException(sprald.cfr_renamed_9("|2_7C.J#\u000f,J>\u000f.\\gA([gNg}\u0014n\u0017].Y&[\"d\"VgF)\\3N)L\""));
        }
        spryic spryic2 = this;
        spryic spryic3 = this;
        this.cfr_renamed_119 = new sprqzc(this.cfr_renamed_112, spryic2.cfr_renamed_152, spryic2.cfr_renamed_3, spryic3.cfr_renamed_4, spryic3.cfr_renamed_91);
        this.cfr_renamed_119.cfr_renamed_1217(true, new spraed(spremc.cfr_renamed_2477((RSAPrivateKey)arg0), arg1));
    }

    @Override
    public void engineInitVerify(PublicKey arg0) throws InvalidKeyException {
        if (!(arg0 instanceof RSAPublicKey)) {
            throw new InvalidKeyException(sprsdz.cfr_renamed_9("T\u0014w\u0011k\bb\u0005'\nb\u0018'\btAi\u000esAfAU2F1r\u0003k\bd*b\u0018'\bi\u0012s\u0000i\u0002b"));
        }
        spryic spryic2 = this;
        spryic spryic3 = this;
        this.cfr_renamed_119 = new sprqzc(this.cfr_renamed_112, spryic2.cfr_renamed_152, spryic2.cfr_renamed_3, spryic3.cfr_renamed_4, spryic3.cfr_renamed_91);
        this.cfr_renamed_119.cfr_renamed_1217(false, spremc.cfr_renamed_2476((RSAPublicKey)arg0));
    }

    @Override
    public Object engineGetParameter(String arg0) {
        throw new UnsupportedOperationException(sprald.cfr_renamed_9("J)H.A\"h\"[\u0017N5N*J3J5\u000f2A4Z7_(]3J#"));
    }

    @Override
    public void engineSetParameter(String arg0, Object arg1) {
        throw new UnsupportedOperationException(sprsdz.cfr_renamed_9("\u0004i\u0006n\u000fb2b\u0015W\u0000u\u0000j\u0004s\u0004uAr\u000ft\u0014w\u0011h\u0013s\u0004c"));
    }

    public spryic(sprh arg0, PSSParameterSpec arg1) {
        this(arg0, arg1, false);
    }
}

