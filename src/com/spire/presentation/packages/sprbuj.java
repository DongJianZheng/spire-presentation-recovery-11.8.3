/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcwq;
import com.spire.presentation.packages.sprczj;
import com.spire.presentation.packages.sprdxk;
import com.spire.presentation.packages.spreai;
import com.spire.presentation.packages.sprgei;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprjmf;
import com.spire.presentation.packages.sprjs;
import com.spire.presentation.packages.sprmbl;
import com.spire.presentation.packages.sprobi;
import com.spire.presentation.packages.sprquk;
import com.spire.presentation.packages.sprrhi;
import com.spire.presentation.packages.sprryk;
import com.spire.presentation.packages.sprshl;
import com.spire.presentation.packages.spruy;
import com.spire.presentation.packages.sprwsk;
import com.spire.presentation.packages.sprwyk;
import com.spire.presentation.packages.sprwys;
import com.spire.presentation.packages.sprywk;
import com.spire.presentation.packages.sprzbk;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sprbuj
extends sprjmf {
    private spreai cfr_renamed_86;
    private static final BigInteger cfr_renamed_152;
    private BigInteger cfr_renamed_112;
    private byte[] cfr_renamed_119;
    private sprgei cfr_renamed_91;
    private final spruy cfr_renamed_0;
    private BigInteger cfr_renamed_1;
    private static final BigInteger cfr_renamed_2;
    private final sprshl cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    @Override
    public Key engineDoPhase(Key arg0, boolean arg1) throws InvalidKeyException, IllegalStateException {
        if (this.cfr_renamed_112 == null) {
            throw new IllegalStateException(sprcwq.cfr_renamed_9("\u0018\u0015:\u001a5\u0019q49\u00100\u0011=\u0012|\u00123\b|\u00152\u0015(\u0015=\u00105\u000f9\u0018r"));
        }
        if (!(arg0 instanceof DHPublicKey)) {
            throw new InvalidKeyException(sprwys.cfr_renamed_9("5J:g\bC\u0016p\u0014g\u001cg\u001fvQf\u001eR\u0019c\u0002gQp\u0014s\u0004k\u0003g\u0002\"5J!w\u0013n\u0018a:g\b"));
        }
        DHPublicKey dHPublicKey = (DHPublicKey)arg0;
        if (!dHPublicKey.getParams().getG().equals(this.cfr_renamed_4) || !dHPublicKey.getParams().getP().equals(this.cfr_renamed_1)) {
            throw new InvalidKeyException(sprcwq.cfr_renamed_9("8\u0014,)\u001e0\u0015?79\u0005|\u00123\b|\u001a3\u000e|\b4\u0015/\\\u0017\u0019%=;\u000e9\u00191\u00192\b}"));
        }
        BigInteger bigInteger = ((DHPublicKey)arg0).getY();
        if (bigInteger == null || bigInteger.compareTo(cfr_renamed_152) < 0 || bigInteger.compareTo(this.cfr_renamed_1.subtract(cfr_renamed_2)) >= 0) {
            throw new InvalidKeyException(sprwys.cfr_renamed_9("K\u001ft\u0010n\u0018fQF9\"!w\u0013n\u0018a:g\b"));
        }
        if (this.cfr_renamed_3 != null) {
            if (!arg1) {
                throw new IllegalStateException(sprcwq.cfr_renamed_9(")\u00125\u001a5\u00198\\\u0018\u0015:\u001a5\u0019q49\u00100\u0011=\u0012|\u001f=\u0012|\t/\u0019|\u00132\u0010%\\(\u000b3\\7\u0019%\\,\u001d5\u000e/"));
            }
            sprryk sprryk2 = this.cfr_renamed_1216((PublicKey)arg0);
            sprbuj sprbuj2 = this;
            sprryk sprryk3 = sprbuj2.cfr_renamed_1216(sprbuj2.cfr_renamed_86.cfr_renamed_9200());
            sprwyk sprwyk2 = new sprwyk(sprryk2, sprryk3);
            sprbuj2.cfr_renamed_119 = sprbuj2.cfr_renamed_3.cfr_renamed_5695(sprwyk2);
            return null;
        }
        if (this.cfr_renamed_0 != null) {
            if (!arg1) {
                throw new IllegalStateException(sprwys.cfr_renamed_9("<S'\"5k\u0017d\u0018g\\J\u0014n\u001do\u0010lQa\u0010lQw\u0002gQm\u001fn\b\"\u0005u\u001e\"\u001ag\b\"\u0001c\u0018p\u0002"));
            }
            sprryk sprryk4 = this.cfr_renamed_1216((PublicKey)arg0);
            sprbuj sprbuj3 = this;
            sprryk sprryk5 = sprbuj3.cfr_renamed_1216(sprbuj3.cfr_renamed_91.cfr_renamed_9200());
            sprmbl sprmbl2 = new sprmbl(sprryk4, sprryk5);
            sprbuj3.cfr_renamed_119 = sprbuj3.cfr_renamed_2499(sprbuj3.cfr_renamed_0.cfr_renamed_5695(sprmbl2));
            return null;
        }
        sprbuj sprbuj4 = this;
        BigInteger bigInteger2 = bigInteger.modPow(sprbuj4.cfr_renamed_112, sprbuj4.cfr_renamed_1);
        if (bigInteger2.compareTo(cfr_renamed_2) == 0) {
            throw new InvalidKeyException(sprcwq.cfr_renamed_9("\u000f\u0014=\u000e9\u0018|\u00179\u0005|\u001f=\u0012{\b|\u001e9\\m"));
        }
        this.cfr_renamed_119 = this.cfr_renamed_2499(bigInteger2);
        if (arg1) {
            return null;
        }
        return new sprczj(bigInteger2, dHPublicKey.getParams());
    }

    @Override
    public byte[] engineGenerateSecret() throws IllegalStateException {
        if (this.cfr_renamed_112 == null) {
            throw new IllegalStateException(sprwys.cfr_renamed_9("5k\u0017d\u0018g\\J\u0014n\u001do\u0010lQl\u001evQk\u001fk\u0005k\u0010n\u0018q\u0014f_"));
        }
        return super.engineGenerateSecret();
    }

    @Override
    public void engineInit(Key arg0, SecureRandom arg1) throws InvalidKeyException {
        DHPrivateKey dHPrivateKey;
        if (!(arg0 instanceof DHPrivateKey)) {
            throw new InvalidKeyException(sprcwq.cfr_renamed_9("8\u001479\u0005\u001d\u001b.\u00199\u00119\u0012(\\.\u0019-\t5\u000e9\u000f|8\u0014,.\u0015*\u001d(\u0019\u0017\u0019%"));
        }
        DHPrivateKey dHPrivateKey2 = dHPrivateKey = (DHPrivateKey)arg0;
        this.cfr_renamed_1 = dHPrivateKey2.getParams().getP();
        this.cfr_renamed_4 = dHPrivateKey2.getParams().getG();
        this.cfr_renamed_112 = dHPrivateKey.getX();
        this.cfr_renamed_119 = this.cfr_renamed_2499(this.cfr_renamed_112);
    }

    @Override
    public SecretKey engineGenerateSecret(String arg0) throws NoSuchAlgorithmException {
        if (this.cfr_renamed_112 == null) {
            throw new IllegalStateException(sprwys.cfr_renamed_9("5k\u0017d\u0018g\\J\u0014n\u001do\u0010lQl\u001evQk\u001fk\u0005k\u0010n\u0018q\u0014f_"));
        }
        if (arg0.equals(sprcwq.cfr_renamed_9("(0\u000f\f\u000e9\u0011=\u000f(\u0019./9\u001f.\u0019("))) {
            return new SecretKeySpec(sprbuj.cfr_renamed_9394(this.cfr_renamed_119), arg0);
        }
        return super.engineGenerateSecret(arg0);
    }

    public byte[] cfr_renamed_2499(BigInteger arg0) {
        return sprhdf.cfr_renamed_512((this.cfr_renamed_1.bitLength() + 7) / 8, arg0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void cfr_renamed_5691(Key arg0, AlgorithmParameterSpec arg1, SecureRandom arg2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        sprbuj sprbuj2;
        if (!(arg0 instanceof DHPrivateKey)) {
            throw new InvalidKeyException(sprwys.cfr_renamed_9("5J:g\bC\u0016p\u0014g\u001cg\u001fvQp\u0014s\u0004k\u0003g\u0002\"5J!p\u0018t\u0010v\u0014I\u0014{Qd\u001epQk\u001fk\u0005k\u0010n\u0018q\u0010v\u0018m\u001f"));
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey)arg0;
        if (arg1 != null) {
            if (arg1 instanceof DHParameterSpec) {
                DHParameterSpec dHParameterSpec = (DHParameterSpec)arg1;
                sprbuj2 = this;
                sprbuj sprbuj3 = this;
                sprbuj3.cfr_renamed_1 = dHParameterSpec.getP();
                sprbuj3.cfr_renamed_4 = dHParameterSpec.getG();
                this.cfr_renamed_86 = null;
                this.cfr_renamed_4 = null;
            } else if (arg1 instanceof spreai) {
                if (this.cfr_renamed_3 == null) {
                    throw new InvalidAlgorithmParameterException(sprcwq.cfr_renamed_9("=\u001b.\u00199\u00119\u0012(\\=\u0010;\u0013.\u0015(\u00141\\2\u0013(\\\u00184\t\\>\u001d/\u00198"));
                }
                sprbuj sprbuj4 = this;
                sprbuj4.cfr_renamed_1 = dHPrivateKey.getParams().getP();
                sprbuj4.cfr_renamed_4 = dHPrivateKey.getParams().getG();
                this.cfr_renamed_86 = (spreai)arg1;
                this.cfr_renamed_4 = ((spreai)arg1).cfr_renamed_4032();
                if (this.cfr_renamed_86.cfr_renamed_2096() != null) {
                    sprbuj sprbuj5 = this;
                    sprbuj2 = sprbuj5;
                    sprbuj sprbuj6 = this;
                    sprbuj sprbuj7 = this;
                    sprbuj5.cfr_renamed_3.cfr_renamed_5692(new sprywk(this.cfr_renamed_1220(dHPrivateKey), sprbuj6.cfr_renamed_1220(sprbuj6.cfr_renamed_86.cfr_renamed_2094()), sprbuj7.cfr_renamed_1216(sprbuj7.cfr_renamed_86.cfr_renamed_2096())));
                } else {
                    sprbuj sprbuj8 = this;
                    sprbuj2 = sprbuj8;
                    sprbuj sprbuj9 = this;
                    sprbuj8.cfr_renamed_3.cfr_renamed_5692(new sprywk(this.cfr_renamed_1220(dHPrivateKey), sprbuj9.cfr_renamed_1220(sprbuj9.cfr_renamed_86.cfr_renamed_2094())));
                }
            } else if (arg1 instanceof sprgei) {
                if (this.cfr_renamed_0 == null) {
                    throw new InvalidAlgorithmParameterException(sprwys.cfr_renamed_9("\u0010e\u0003g\u0014o\u0014l\u0005\"\u0010n\u0016m\u0003k\u0005j\u001c\"\u001fm\u0005\"<S'\"\u0013c\u0002g\u0015"));
                }
                sprbuj sprbuj10 = this;
                sprbuj10.cfr_renamed_1 = dHPrivateKey.getParams().getP();
                sprbuj10.cfr_renamed_4 = dHPrivateKey.getParams().getG();
                this.cfr_renamed_91 = (sprgei)arg1;
                this.cfr_renamed_4 = ((sprgei)arg1).cfr_renamed_4032();
                sprbuj sprbuj11 = this;
                if (this.cfr_renamed_91.cfr_renamed_2096() != null) {
                    sprbuj sprbuj12 = this;
                    sprbuj sprbuj13 = this;
                    sprbuj11.cfr_renamed_0.cfr_renamed_5692(new sprdxk(this.cfr_renamed_1220(dHPrivateKey), sprbuj12.cfr_renamed_1220(sprbuj12.cfr_renamed_91.cfr_renamed_2094()), sprbuj13.cfr_renamed_1216(sprbuj13.cfr_renamed_91.cfr_renamed_2096())));
                    sprbuj2 = this;
                } else {
                    sprbuj sprbuj14 = this;
                    sprbuj11.cfr_renamed_0.cfr_renamed_5692(new sprdxk(this.cfr_renamed_1220(dHPrivateKey), sprbuj14.cfr_renamed_1220(sprbuj14.cfr_renamed_91.cfr_renamed_2094())));
                    sprbuj2 = this;
                }
            } else {
                if (!(arg1 instanceof sprobi)) throw new InvalidAlgorithmParameterException(sprwys.cfr_renamed_9("5J:g\bC\u0016p\u0014g\u001cg\u001fvQm\u001fn\b\"\u0010a\u0012g\u0001v\u0002\"5J!c\u0003c\u001cg\u0005g\u0003Q\u0001g\u0012"));
                if (this.cfr_renamed_91 == null) {
                    throw new InvalidAlgorithmParameterException(sprcwq.cfr_renamed_9("2\u0013|7\u0018:|\u000f,\u0019?\u0015:\u00159\u0018|\u001a3\u000e|)/\u0019.79\u00055\u0012;1=\b9\u000e5\u001d0/,\u0019?"));
                }
                sprbuj sprbuj15 = this;
                DHPrivateKey dHPrivateKey2 = dHPrivateKey;
                this.cfr_renamed_1 = dHPrivateKey2.getParams().getP();
                sprbuj15.cfr_renamed_4 = dHPrivateKey2.getParams().getG();
                sprbuj15.cfr_renamed_86 = null;
                this.cfr_renamed_4 = ((sprobi)arg1).cfr_renamed_4032();
                sprbuj2 = this;
            }
        } else {
            sprbuj2 = this;
            sprbuj sprbuj16 = this;
            sprbuj16.cfr_renamed_1 = dHPrivateKey.getParams().getP();
            sprbuj16.cfr_renamed_4 = dHPrivateKey.getParams().getG();
        }
        sprbuj2.cfr_renamed_112 = dHPrivateKey.getX();
        sprbuj sprbuj17 = this;
        sprbuj17.cfr_renamed_119 = sprbuj17.cfr_renamed_2499(sprbuj17.cfr_renamed_112);
    }

    @Override
    public int engineGenerateSecret(byte[] arg0, int arg1) throws IllegalStateException, ShortBufferException {
        if (this.cfr_renamed_112 == null) {
            throw new IllegalStateException(sprcwq.cfr_renamed_9("\u0018\u0015:\u001a5\u0019q49\u00100\u0011=\u0012|\u00123\b|\u00152\u0015(\u0015=\u00105\u000f9\u0018r"));
        }
        return super.engineGenerateSecret(arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprbuj(String string, sprjs sprjs2) {
        void arg1;
        void arg0;
        sprbuj sprbuj2 = this;
        super((String)arg0, (sprjs)arg1);
        sprbuj2.cfr_renamed_3 = null;
        sprbuj2.cfr_renamed_0 = null;
    }

    static {
        cfr_renamed_2 = BigInteger.valueOf(1L);
        cfr_renamed_152 = BigInteger.valueOf(2L);
    }

    private /* synthetic */ sprryk cfr_renamed_1216(PublicKey arg0) throws InvalidKeyException {
        if (arg0 instanceof DHPublicKey) {
            if (arg0 instanceof sprczj) {
                return ((sprczj)arg0).cfr_renamed_9389();
            }
            DHPublicKey dHPublicKey = (DHPublicKey)arg0;
            DHParameterSpec dHParameterSpec = dHPublicKey.getParams();
            if (dHParameterSpec instanceof sprrhi) {
                return new sprryk(dHPublicKey.getY(), ((sprrhi)dHParameterSpec).cfr_renamed_3373());
            }
            return new sprryk(dHPublicKey.getY(), new sprwsk(dHParameterSpec.getP(), dHParameterSpec.getG(), null, dHParameterSpec.getL()));
        }
        throw new InvalidKeyException(sprwys.cfr_renamed_9("r\u0004`\u001dk\u0012\"\u001ag\b\"\u001fm\u0005\"\u0010\"5J!w\u0013n\u0018a:g\b"));
    }

    private /* synthetic */ sprquk cfr_renamed_1220(PrivateKey arg0) throws InvalidKeyException {
        if (arg0 instanceof DHPrivateKey) {
            if (arg0 instanceof sprzbk) {
                return ((sprzbk)arg0).cfr_renamed_9389();
            }
            DHPrivateKey dHPrivateKey = (DHPrivateKey)arg0;
            DHParameterSpec dHParameterSpec = dHPrivateKey.getParams();
            return new sprquk(dHPrivateKey.getX(), new sprwsk(dHParameterSpec.getP(), dHParameterSpec.getG(), null, dHParameterSpec.getL()));
        }
        throw new InvalidKeyException(sprcwq.cfr_renamed_9("\f.\u0015*\u001d(\u0019|\u00179\u0005|\u00123\b|\u001d|8\u0014,.\u0015*\u001d(\u0019\u0017\u0019%"));
    }

    @Override
    public byte[] cfr_renamed_5696() {
        return this.cfr_renamed_119;
    }

    /*
     * WARNING - void declaration
     */
    public sprbuj(String string, spruy spruy2, sprjs sprjs2) {
        void arg2;
        void arg0;
        sprbuj sprbuj2 = this;
        super((String)arg0, (sprjs)arg2);
        sprbuj2.cfr_renamed_3 = null;
        sprbuj2.cfr_renamed_0 = spruy2;
    }

    /*
     * WARNING - void declaration
     */
    public sprbuj(String string, sprshl sprshl2, sprjs sprjs2) {
        void arg1;
        void arg2;
        void arg0;
        sprbuj sprbuj2 = this;
        super((String)arg0, (sprjs)arg2);
        sprbuj2.cfr_renamed_3 = arg1;
        sprbuj2.cfr_renamed_0 = null;
    }

    public sprbuj() {
        this(sprwys.cfr_renamed_9("F\u0018d\u0017k\u0014/9g\u001dn\u001cc\u001f"), null);
    }
}

