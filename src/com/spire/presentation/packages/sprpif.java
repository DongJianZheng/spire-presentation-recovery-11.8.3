/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhrf;
import com.spire.presentation.packages.sprki;
import com.spire.presentation.packages.sprnlf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqye;
import com.spire.presentation.packages.sprsbi;
import com.spire.presentation.packages.sprseca;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprtua;
import com.spire.presentation.packages.sprueg;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprvhf;
import com.spire.presentation.packages.sprwdg;
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

public class sprpif
extends CipherSpi {
    private AlgorithmParameters cfr_renamed_91;
    private sprnlf cfr_renamed_0;
    private sprsbi cfr_renamed_1;
    private sprhrf cfr_renamed_2;
    private sprueg cfr_renamed_3;
    private final String cfr_renamed_4;

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

    @Override
    public int engineUpdate(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException {
        throw new IllegalStateException(sprtua.cfr_renamed_9("{\nAEF\u0010E\u0015Z\u0017A\u0000QE\\\u000b\u0015\u0004\u0015\u0012G\u0004E\u0015\\\u000bREX\nQ\u0000"));
    }

    @Override
    public int engineGetKeySize(Key arg0) {
        return 2048;
    }

    @Override
    public void engineSetMode(String arg0) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprseca.cfr_renamed_9("W\u0017z\u0018{\u00024\u0005a\u0006d\u0019f\u00024\u001b{\u0012qV")).append(arg0).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameters arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        sprpif sprpif2;
        sprsbi sprsbi2 = null;
        if (arg2 != null) {
            try {
                sprsbi2 = arg2.getParameterSpec(sprsbi.class);
                sprpif2 = this;
            }
            catch (Exception exception) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprtua.cfr_renamed_9("\u0006T\u000b\u0012\u0011\u0015\rT\u000bQ\tPEE\u0004G\u0004X\u0000A\u0000GE")).append(arg2.toString()).toString());
            }
        } else {
            sprpif2 = this;
        }
        sprpif2.engineInit(arg0, arg1, sprsbi2, arg3);
    }

    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameterSpec arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int n;
        if (arg2 == null) {
            n = arg0;
            sprpif sprpif2 = this;
            sprpif2.cfr_renamed_1 = new sprsbi(sprseca.cfr_renamed_9("7Q%9=C&"));
        } else {
            if (!(arg2 instanceof sprsbi)) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, this.cfr_renamed_4).append(sprtua.cfr_renamed_9("EV\u0004[EZ\u000bY\u001c\u0015\u0004V\u0006P\u0015AE~1f5T\u0017T\bP\u0011P\u0017f\u0015P\u0006")).toString());
            }
            this.cfr_renamed_1 = (sprsbi)arg2;
            n = arg0;
        }
        if (n == 3) {
            if (arg1 instanceof sprhrf) {
                this.cfr_renamed_2 = (sprhrf)arg1;
                this.cfr_renamed_3 = new sprueg(sprybl.cfr_renamed_5688(arg3));
                return;
            }
            throw new InvalidKeyException(new StringBuilder().insert(0, sprseca.cfr_renamed_9("9z\u001amVuV")).append(this.cfr_renamed_4).append(sprtua.cfr_renamed_9("\u0015\u0015@\u0007Y\fVE^\u0000LEV\u0004[EW\u0000\u0015\u0010F\u0000QES\nGEB\u0017T\u0015E\f[\u0002")).toString());
        }
        if (arg0 == 4) {
            if (arg1 instanceof sprnlf) {
                this.cfr_renamed_0 = (sprnlf)arg1;
                return;
            }
            throw new InvalidKeyException(new StringBuilder().insert(0, sprseca.cfr_renamed_9("9z\u001amVuV")).append(this.cfr_renamed_4).append(sprtua.cfr_renamed_9("EE\u0017\\\u0013T\u0011PE^\u0000LEV\u0004[EW\u0000\u0015\u0010F\u0000QES\nGE@\u000bB\u0017T\u0015E\f[\u0002")).toString());
        }
        throw new InvalidParameterException(sprseca.cfr_renamed_9("5}\u0006|\u0013fV{\u0018x\u000f4\u0000u\u001a}\u00124\u0010{\u00044\u0001f\u0017d\u0006}\u0018sYa\u0018c\u0004u\u0006d\u001fz\u0011"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineWrap(Key arg0) throws IllegalBlockSizeException, InvalidKeyException {
        if (arg0.getEncoded() == null) {
            throw new InvalidKeyException(sprtua.cfr_renamed_9("&T\u000b[\nAEB\u0017T\u0015\u0015\u000eP\u001c\u0019E[\u0010Y\t\u0015\u0000[\u0006Z\u0001\\\u000bRK"));
        }
        try {
            sprpif sprpif2 = this;
            sprki sprki2 = sprpif2.cfr_renamed_3.cfr_renamed_5686(sprpif2.cfr_renamed_2.cfr_renamed_5650());
            spryy spryy2 = sprqye.cfr_renamed_5665(sprpif2.cfr_renamed_1.cfr_renamed_5666());
            sprtpk sprtpk2 = new sprtpk(sprki2.cfr_renamed_3880());
            sprki sprki3 = sprki2;
            spryy2.cfr_renamed_5535(true, sprtpk2);
            byte[] byArray = sprki3.cfr_renamed_5684();
            sprki3.destroy();
            byte[] byArray2 = arg0.getEncoded();
            byte[] byArray3 = sproze.cfr_renamed_543(byArray, spryy2.cfr_renamed_1575(byArray2, 0, byArray2.length));
            sproze.cfr_renamed_3408(byArray2);
            return byArray3;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IllegalBlockSizeException(new StringBuilder().insert(0, sprseca.cfr_renamed_9("\u0003z\u0017v\u001aqV`\u00194\u0011q\u0018q\u0004u\u0002qV_\"GVg\u0013w\u0004q\u0002.V")).append(illegalArgumentException.getMessage()).toString());
        }
        catch (DestroyFailedException destroyFailedException) {
            throw new IllegalBlockSizeException(new StringBuilder().insert(0, sprtua.cfr_renamed_9("@\u000bT\u0007Y\u0000\u0015\u0011ZEQ\u0000F\u0011G\nLE\\\u000bA\u0000G\fXEC\u0004Y\u0010P\u0016\u000fE")).append(destroyFailedException.getMessage()).toString());
        }
    }

    @Override
    public byte[] engineUpdate(byte[] arg0, int arg1, int arg2) {
        throw new IllegalStateException(sprseca.cfr_renamed_9("Z\u0019`Vg\u0003d\u0006{\u0004`\u0013pV}\u00184\u00174\u0001f\u0017d\u0006}\u0018sVy\u0019p\u0013"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGetParameters() {
        sprpif sprpif2;
        if (this.cfr_renamed_91 != null) {
            sprpif2 = this;
            return sprpif2.cfr_renamed_91;
        }
        try {
            sprpif sprpif3 = this;
            sprpif3.cfr_renamed_91 = AlgorithmParameters.getInstance(sprpif3.cfr_renamed_4, "BCPQC");
            sprpif3.cfr_renamed_91.init(this.cfr_renamed_1);
            sprpif2 = this;
            return sprpif2.cfr_renamed_91;
        }
        catch (Exception exception) {
            throw sprvhf.cfr_renamed_5211(exception.toString(), exception);
        }
    }

    @Override
    public int engineGetBlockSize() {
        return 0;
    }

    @Override
    public int engineGetOutputSize(int arg0) {
        return -1;
    }

    @Override
    public void engineSetPadding(String arg0) throws NoSuchPaddingException {
        throw new NoSuchPaddingException(new StringBuilder().insert(0, sprtua.cfr_renamed_9("e\u0004Q\u0001\\\u000bRE")).append(arg0).append(sprseca.cfr_renamed_9("4\u0003z\u001dz\u0019c\u0018")).toString());
    }

    @Override
    public byte[] engineDoFinal(byte[] arg0, int arg1, int arg2) throws IllegalBlockSizeException, BadPaddingException {
        throw new IllegalStateException(sprtua.cfr_renamed_9("{\nAEF\u0010E\u0015Z\u0017A\u0000QE\\\u000b\u0015\u0004\u0015\u0012G\u0004E\u0015\\\u000bREX\nQ\u0000"));
    }

    public sprpif(String string) throws NoSuchAlgorithmException {
        this.cfr_renamed_4 = string;
    }

    @Override
    public int engineDoFinal(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        throw new IllegalStateException(sprseca.cfr_renamed_9("Z\u0019`Vg\u0003d\u0006{\u0004`\u0013pV}\u00184\u00174\u0001f\u0017d\u0006}\u0018sVy\u0019p\u0013"));
    }

    @Override
    public byte[] engineGetIV() {
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Key engineUnwrap(byte[] arg0, String arg1, int arg2) throws InvalidKeyException, NoSuchAlgorithmException {
        if (arg2 != 3) {
            throw new InvalidKeyException(sprtua.cfr_renamed_9("\n[\tLEf v7p1j.p<\u0015\u0016@\u0015E\nG\u0011P\u0001"));
        }
        try {
            sprwdg sprwdg2;
            sprwdg sprwdg3 = sprwdg2 = new sprwdg(this.cfr_renamed_0.cfr_renamed_5650());
            byte[] byArray = sprwdg3.cfr_renamed_5685(sproze.cfr_renamed_533(arg0, 0, sprwdg3.cfr_renamed_5687()));
            spryy spryy2 = sprqye.cfr_renamed_5665(this.cfr_renamed_1.cfr_renamed_5666());
            sprtpk sprtpk2 = new sprtpk(byArray);
            sproze.cfr_renamed_3408(byArray);
            spryy2.cfr_renamed_5535(false, sprtpk2);
            byte[] byArray2 = sproze.cfr_renamed_533(arg0, sprwdg2.cfr_renamed_5687(), arg0.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(spryy2.cfr_renamed_1579(byArray2, 0, byArray2.length), arg1);
            sproze.cfr_renamed_3408(sprtpk2.cfr_renamed_1521());
            return secretKeySpec;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprseca.cfr_renamed_9("a\u0018u\u0014x\u00134\u0002{Vq\u000e`\u0004u\u0015`V_\"GVg\u0013w\u0004q\u0002.V")).append(illegalArgumentException.getMessage()).toString());
        }
        catch (sprull sprull2) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprtua.cfr_renamed_9("@\u000bT\u0007Y\u0000\u0015\u0011ZEP\u001dA\u0017T\u0006AE~1fEF\u0000V\u0017P\u0011\u000fE")).append(sprull2.getMessage()).toString());
        }
    }
}

