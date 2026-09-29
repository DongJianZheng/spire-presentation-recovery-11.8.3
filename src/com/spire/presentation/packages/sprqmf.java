/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcnf;
import com.spire.presentation.packages.sprki;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprosf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqye;
import com.spire.presentation.packages.sprsbi;
import com.spire.presentation.packages.sprsmg;
import com.spire.presentation.packages.sprtkc;
import com.spire.presentation.packages.spruhj;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprvei;
import com.spire.presentation.packages.sprvhf;
import com.spire.presentation.packages.sprwjg;
import com.spire.presentation.packages.sprwuf;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.spryy;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.DestroyFailedException;

public class sprqmf
extends CipherSpi {
    private sprwuf cfr_renamed_119;
    private sprvei cfr_renamed_91;
    private sprsmg cfr_renamed_0;
    private AlgorithmParameters cfr_renamed_1;
    private sprosf cfr_renamed_2;
    private final String cfr_renamed_3;
    private sprcnf cfr_renamed_4;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameterSpec arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        String string;
        sprqmf sprqmf2;
        int n;
        if (arg2 == null) {
            n = arg0;
            sprqmf sprqmf3 = this;
            sprqmf3.cfr_renamed_91 = new sprsbi(sprtkc.cfr_renamed_9("z\u001ehvp\fk"));
        } else {
            if (!(arg2 instanceof sprvei)) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, this.cfr_renamed_3).append(spruhj.cfr_renamed_9("z\u0005;\bz\t4\n#F;\u00059\u0003*\u0012z-\u000e5\n\u0007(\u00077\u0003.\u0003(5*\u00039")).toString());
            }
            this.cfr_renamed_91 = (sprvei)arg2;
            n = arg0;
        }
        if (n == 3) {
            if (!(arg1 instanceof sprcnf)) throw new InvalidKeyException(new StringBuilder().insert(0, sprtkc.cfr_renamed_9("t5W\"\u001b:\u001b")).append(this.cfr_renamed_3).append(spruhj.cfr_renamed_9("F*\u00138\n3\u0005z\r?\u001fz\u0005;\bz\u0004?F/\u0015?\u0002z\u00005\u0014z\u0011(\u0007*\u00163\b=")).toString());
            this.cfr_renamed_4 = (sprcnf)arg1;
            sprqmf2 = this;
            this.cfr_renamed_0 = new sprsmg(sprybl.cfr_renamed_5688(arg3));
        } else {
            if (arg0 != 4) throw new InvalidParameterException(sprtkc.cfr_renamed_9("x2K3^)\u001b4U7B{M:W2_{]4I{L)Z+K2U<\u0014.U,I:K+R5\\"));
            if (!(arg1 instanceof sprosf)) throw new InvalidKeyException(new StringBuilder().insert(0, sprtkc.cfr_renamed_9("t5W\"\u001b:\u001b")).append(this.cfr_renamed_3).append(spruhj.cfr_renamed_9("z\u0016(\u000f,\u0007.\u0003z\r?\u001fz\u0005;\bz\u0004?F/\u0015?\u0002z\u00005\u0014z\u00134\u0011(\u0007*\u00163\b=")).toString());
            this.cfr_renamed_2 = (sprosf)arg1;
            sprqmf2 = this;
        }
        if (sprqmf2.cfr_renamed_119 == null || (string = sprkoe.cfr_renamed_116(this.cfr_renamed_119.cfr_renamed_313())).equals(arg1.getAlgorithm())) return;
        throw new InvalidKeyException(new StringBuilder().insert(0, spruhj.cfr_renamed_9("9\u000f*\u000e?\u0014z\n5\u00051\u0003>F.\tz")).append(string).toString());
    }

    /*
     * WARNING - void declaration
     */
    public sprqmf(sprwuf sprwuf2) {
        void arg0;
        sprqmf sprqmf2 = this;
        sprqmf2.cfr_renamed_119 = arg0;
        sprqmf2.cfr_renamed_3 = sprkoe.cfr_renamed_116(sprwuf2.cfr_renamed_313());
    }

    @Override
    public int engineGetKeySize(Key arg0) {
        return 2048;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(int arg0, Key arg1, SecureRandom arg2) throws InvalidKeyException {
        try {
            this.engineInit(arg0, arg1, (AlgorithmParameterSpec)null, arg2);
            return;
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw sprvhf.cfr_renamed_5213(invalidAlgorithmParameterException.getMessage(), invalidAlgorithmParameterException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineWrap(Key arg0) throws IllegalBlockSizeException, InvalidKeyException {
        if (arg0.getEncoded() == null) {
            throw new InvalidKeyException(sprtkc.cfr_renamed_9("x:U5T/\u001b,I:K{P>Bw\u001b5N7W{^5X4_2U<\u0015"));
        }
        try {
            sprqmf sprqmf2 = this;
            sprki sprki2 = sprqmf2.cfr_renamed_0.cfr_renamed_5686(sprqmf2.cfr_renamed_4.cfr_renamed_5650());
            spryy spryy2 = sprqye.cfr_renamed_5669(sprqmf2.cfr_renamed_91, sprki2.cfr_renamed_3880());
            sprki sprki3 = sprki2;
            byte[] byArray = sprki3.cfr_renamed_5684();
            sprki3.destroy();
            byte[] byArray2 = arg0.getEncoded();
            byte[] byArray3 = sproze.cfr_renamed_543(byArray, spryy2.cfr_renamed_1575(byArray2, 0, byArray2.length));
            sproze.cfr_renamed_3408(byArray2);
            return byArray3;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IllegalBlockSizeException(new StringBuilder().insert(0, spruhj.cfr_renamed_9("/\b;\u00046\u0003z\u00125F=\u00034\u0003(\u0007.\u0003z-\u000e5z\u0015?\u0005(\u0003.\\z")).append(illegalArgumentException.getMessage()).toString());
        }
        catch (DestroyFailedException destroyFailedException) {
            throw new IllegalBlockSizeException(new StringBuilder().insert(0, sprtkc.cfr_renamed_9(".U:Y7^{O4\u001b?^(O)T\"\u001b2U/^)R6\u001b-Z7N>Ha\u001b")).append(destroyFailedException.getMessage()).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGetParameters() {
        sprqmf sprqmf2;
        if (this.cfr_renamed_1 != null) {
            sprqmf2 = this;
            return sprqmf2.cfr_renamed_1;
        }
        try {
            sprqmf sprqmf3 = this;
            sprqmf3.cfr_renamed_1 = AlgorithmParameters.getInstance(sprqmf3.cfr_renamed_3, "BCPQC");
            sprqmf3.cfr_renamed_1.init(this.cfr_renamed_91);
            sprqmf2 = this;
            return sprqmf2.cfr_renamed_1;
        }
        catch (Exception exception) {
            throw sprvhf.cfr_renamed_5211(exception.toString(), exception);
        }
    }

    @Override
    public byte[] engineUpdate(byte[] arg0, int arg1, int arg2) {
        throw new IllegalStateException(spruhj.cfr_renamed_9("(5\u0012z\u0015/\u0016*\t(\u0012?\u0002z\u000f4F;F-\u0014;\u0016*\u000f4\u0001z\u000b5\u0002?"));
    }

    @Override
    public int engineDoFinal(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        throw new IllegalStateException(sprtkc.cfr_renamed_9("\u0015T/\u001b(N+K4I/^?\u001b2U{Z{L)Z+K2U<\u001b6T?^"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Key engineUnwrap(byte[] arg0, String arg1, int arg2) throws InvalidKeyException, NoSuchAlgorithmException {
        if (arg2 != 3) {
            throw new InvalidKeyException(spruhj.cfr_renamed_9("5\b6\u001fz5\u001f%\b#\u000e9\u0011#\u0003F)\u0013*\u00165\u0014.\u0003>"));
        }
        try {
            sprwjg sprwjg2;
            sprwjg sprwjg3 = sprwjg2 = new sprwjg(this.cfr_renamed_2.cfr_renamed_5650());
            byte[] byArray = sprwjg3.cfr_renamed_5685(sproze.cfr_renamed_533(arg0, 0, sprwjg3.cfr_renamed_5687()));
            spryy spryy2 = sprqye.cfr_renamed_5664(this.cfr_renamed_91, byArray);
            sproze.cfr_renamed_3408(byArray);
            byte[] byArray2 = sproze.cfr_renamed_533(arg0, sprwjg2.cfr_renamed_5687(), arg0.length);
            return new SecretKeySpec(spryy2.cfr_renamed_1579(byArray2, 0, byArray2.length), arg1);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprtkc.cfr_renamed_9(".U:Y7^{O4\u001b>C/I:X/\u001b\u0010o\b\u001b(^8I>Oa\u001b")).append(illegalArgumentException.getMessage()).toString());
        }
        catch (sprull sprull2) {
            throw new InvalidKeyException(new StringBuilder().insert(0, spruhj.cfr_renamed_9("\u00134\u00078\n?F.\tz\u0003\"\u0012(\u00079\u0012z-\u000e5z\u0015?\u0005(\u0003.\\z")).append(sprull2.getMessage()).toString());
        }
    }

    @Override
    public int engineUpdate(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException {
        throw new IllegalStateException(sprtkc.cfr_renamed_9("\u0015T/\u001b(N+K4I/^?\u001b2U{Z{L)Z+K2U<\u001b6T?^"));
    }

    @Override
    public void engineSetMode(String arg0) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException(new StringBuilder().insert(0, spruhj.cfr_renamed_9("%;\b4\t.F)\u0013*\u00165\u0014.F7\t>\u0003z")).append(arg0).toString());
    }

    @Override
    public int engineGetOutputSize(int arg0) {
        return -1;
    }

    @Override
    public void engineSetPadding(String arg0) throws NoSuchPaddingException {
        throw new NoSuchPaddingException(new StringBuilder().insert(0, sprtkc.cfr_renamed_9("\u000bZ?_2U<\u001b")).append(arg0).append(spruhj.cfr_renamed_9("F/\b1\b5\u00114")).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameters arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        sprqmf sprqmf2;
        sprsbi sprsbi2 = null;
        if (arg2 != null) {
            try {
                sprsbi2 = arg2.getParameterSpec(sprsbi.class);
                sprqmf2 = this;
            }
            catch (Exception exception) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprtkc.cfr_renamed_9("X:U|O{S:U?W>\u001b+Z)Z6^/^)\u001b")).append(arg2.toString()).toString());
            }
        } else {
            sprqmf2 = this;
        }
        sprqmf2.engineInit(arg0, arg1, sprsbi2, arg3);
    }

    @Override
    public byte[] engineGetIV() {
        return null;
    }

    @Override
    public byte[] engineDoFinal(byte[] arg0, int arg1, int arg2) throws IllegalBlockSizeException, BadPaddingException {
        throw new IllegalStateException(spruhj.cfr_renamed_9("(5\u0012z\u0015/\u0016*\t(\u0012?\u0002z\u000f4F;F-\u0014;\u0016*\u000f4\u0001z\u000b5\u0002?"));
    }

    /*
     * WARNING - void declaration
     */
    public sprqmf(String string) {
        void arg0;
        sprqmf sprqmf2 = this;
        sprqmf2.cfr_renamed_3 = arg0;
        sprqmf2.cfr_renamed_119 = null;
    }

    @Override
    public int engineGetBlockSize() {
        return 0;
    }
}

