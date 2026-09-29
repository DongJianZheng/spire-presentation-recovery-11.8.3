/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfhi;
import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprksc;
import com.spire.presentation.packages.sprquy;
import com.spire.presentation.packages.sprtdd;
import com.spire.presentation.packages.sprywa;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import javax.crypto.KeyAgreementSpi;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sprhvc
extends KeyAgreementSpi {
    private static final Hashtable cfr_renamed_0 = new Hashtable();
    private BigInteger cfr_renamed_1;
    private BigInteger cfr_renamed_2;
    private BigInteger cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    @Override
    public void engineInit(Key arg0, SecureRandom arg1) throws InvalidKeyException {
        if (!(arg0 instanceof DHPrivateKey)) {
            throw new InvalidKeyException(sprfhi.cfr_renamed_9("u\u001ez3H\u0017V$T3\\3_\"\u0011$T'D?C3Bvu\u001ea$X P\"T\u001dT/"));
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey)arg0;
        sprhvc sprhvc2 = this;
        DHPrivateKey dHPrivateKey2 = dHPrivateKey;
        this.cfr_renamed_3 = dHPrivateKey2.getParams().getP();
        sprhvc2.cfr_renamed_4 = dHPrivateKey2.getParams().getG();
        sprhvc2.cfr_renamed_2 = sprhvc2.cfr_renamed_1 = dHPrivateKey.getX();
    }

    @Override
    public int engineGenerateSecret(byte[] arg0, int arg1) throws IllegalStateException, ShortBufferException {
        if (this.cfr_renamed_2 == null) {
            throw new IllegalStateException(sprquy.cfr_renamed_9("1Q\u0013^\u001c]Xp\u0010T\u0019U\u0014VUV\u001aLUQ\u001bQ\u0001Q\u0014T\u001cK\u0010\\["));
        }
        sprhvc sprhvc2 = this;
        byte[] byArray = sprhvc2.cfr_renamed_2499(sprhvc2.cfr_renamed_1);
        if (arg0.length - arg1 < byArray.length) {
            throw new ShortBufferException(sprfhi.cfr_renamed_9("\u0012y\u001dT/p1C3T;T8Ev\u001cvS#W0T$\u0011\"^9\u0011%Y9C\""));
        }
        System.arraycopy(byArray, 0, arg0, arg1, byArray.length);
        return byArray.length;
    }

    @Override
    public byte[] engineGenerateSecret() throws IllegalStateException {
        if (this.cfr_renamed_2 == null) {
            throw new IllegalStateException(sprquy.cfr_renamed_9("1Q\u0013^\u001c]Xp\u0010T\u0019U\u0014VUV\u001aLUQ\u001bQ\u0001Q\u0014T\u001cK\u0010\\["));
        }
        sprhvc sprhvc2 = this;
        return sprhvc2.cfr_renamed_2499(sprhvc2.cfr_renamed_1);
    }

    @Override
    public void engineInit(Key arg0, AlgorithmParameterSpec arg1, SecureRandom arg2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        sprhvc sprhvc2;
        if (!(arg0 instanceof DHPrivateKey)) {
            throw new InvalidKeyException(sprfhi.cfr_renamed_9("\u0012y\u001dT/p1C3T;T8EvC3@#X$T%\u0011\u0012y\u0006C?G7E3z3HvW9CvX8X\"X7]?B7E?^8"));
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey)arg0;
        if (arg1 != null) {
            if (!(arg1 instanceof DHParameterSpec)) {
                throw new InvalidAlgorithmParameterException(sprquy.cfr_renamed_9("1p>]\fy\u0012J\u0010]\u0018]\u001bLUW\u001bT\f\u0018\u0014[\u0016]\u0005L\u0006\u00181p%Y\u0007Y\u0018]\u0001]\u0007k\u0005]\u0016"));
            }
            DHParameterSpec dHParameterSpec = (DHParameterSpec)arg1;
            sprhvc2 = this;
            this.cfr_renamed_3 = dHParameterSpec.getP();
            this.cfr_renamed_4 = dHParameterSpec.getG();
        } else {
            sprhvc2 = this;
            sprhvc sprhvc3 = this;
            sprhvc3.cfr_renamed_3 = dHPrivateKey.getParams().getP();
            sprhvc3.cfr_renamed_4 = dHPrivateKey.getParams().getG();
        }
        sprhvc2.cfr_renamed_2 = this.cfr_renamed_1 = dHPrivateKey.getX();
    }

    private /* synthetic */ byte[] cfr_renamed_2499(BigInteger bigInteger) {
        int n = (this.cfr_renamed_3.bitLength() + 7) / 8;
        byte[] byArray = bigInteger.toByteArray();
        if (byArray.length == n) {
            return byArray;
        }
        if (byArray[0] == 0 && byArray.length == n + 1) {
            byte[] byArray2 = new byte[byArray.length - 1];
            System.arraycopy(byArray, 1, byArray2, 0, byArray2.length);
            return byArray2;
        }
        byte[] byArray3 = new byte[n];
        System.arraycopy(byArray, 0, byArray3, byArray3.length - byArray.length, byArray.length);
        return byArray3;
    }

    @Override
    public SecretKey engineGenerateSecret(String arg0) {
        if (this.cfr_renamed_2 == null) {
            throw new IllegalStateException(sprfhi.cfr_renamed_9("\u0012X0W?T{y3]:\\7_v_9EvX8X\"X7]?B3Ux"));
        }
        String string = sprywa.cfr_renamed_116(arg0);
        sprhvc sprhvc2 = this;
        byte[] byArray = sprhvc2.cfr_renamed_2499(sprhvc2.cfr_renamed_1);
        if (cfr_renamed_0.containsKey(string)) {
            byte[] byArray2 = new byte[(Integer)cfr_renamed_0.get(string) / 8];
            System.arraycopy(byArray, 0, byArray2, 0, byArray2.length);
            if (string.startsWith("DES")) {
                sprtdd.cfr_renamed_1520(byArray2);
            }
            return new SecretKeySpec(byArray2, arg0);
        }
        return new SecretKeySpec(byArray, arg0);
    }

    @Override
    public Key engineDoPhase(Key arg0, boolean arg1) throws InvalidKeyException, IllegalStateException {
        if (this.cfr_renamed_2 == null) {
            throw new IllegalStateException(sprquy.cfr_renamed_9("1Q\u0013^\u001c]Xp\u0010T\u0019U\u0014VUV\u001aLUQ\u001bQ\u0001Q\u0014T\u001cK\u0010\\["));
        }
        if (!(arg0 instanceof DHPublicKey)) {
            throw new InvalidKeyException(sprfhi.cfr_renamed_9("\u0012y\u001dT/p1C3T;T8EvU9a>P%TvC3@#X$T%\u0011\u0012y\u0006D4]?R\u001dT/"));
        }
        DHPublicKey dHPublicKey = (DHPublicKey)arg0;
        if (!dHPublicKey.getParams().getG().equals(this.cfr_renamed_4) || !dHPublicKey.getParams().getP().equals(this.cfr_renamed_3)) {
            throw new InvalidKeyException(sprquy.cfr_renamed_9("|=h\u0000Z\u0019Q\u0016s\u0010AUV\u001aLU^\u001aJUL\u001dQ\u0006\u0018>]\fy\u0012J\u0010]\u0018]\u001bLT"));
        }
        if (arg1) {
            sprhvc sprhvc2 = this;
            this.cfr_renamed_1 = ((DHPublicKey)arg0).getY().modPow(sprhvc2.cfr_renamed_2, sprhvc2.cfr_renamed_3);
            return null;
        }
        sprhvc sprhvc3 = this;
        this.cfr_renamed_1 = ((DHPublicKey)arg0).getY().modPow(sprhvc3.cfr_renamed_2, sprhvc3.cfr_renamed_3);
        return new sprksc(this.cfr_renamed_1, dHPublicKey.getParams());
    }

    static {
        Integer n = spriwa.cfr_renamed_279(64);
        Integer n2 = spriwa.cfr_renamed_279(192);
        Integer n3 = spriwa.cfr_renamed_279(128);
        Integer n4 = spriwa.cfr_renamed_279(256);
        cfr_renamed_0.put("DES", n);
        cfr_renamed_0.put(sprfhi.cfr_renamed_9("u\u0013b\u0013u\u0013"), n2);
        cfr_renamed_0.put(sprquy.cfr_renamed_9("z9w\"~<k="), n3);
        cfr_renamed_0.put(sprfhi.cfr_renamed_9("\u0017t\u0005"), n4);
    }
}

