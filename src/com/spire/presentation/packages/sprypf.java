/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcul;
import com.spire.presentation.packages.sprhtf;
import com.spire.presentation.packages.sprjjf;
import com.spire.presentation.packages.sprki;
import com.spire.presentation.packages.sprklg;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpjg;
import com.spire.presentation.packages.sprqye;
import com.spire.presentation.packages.sprsbi;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.spruhg;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprvhf;
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

public class sprypf
extends CipherSpi {
    private sprsbi cfr_renamed_91;
    private final String cfr_renamed_0;
    private spruhg cfr_renamed_1;
    private sprjjf cfr_renamed_2;
    private AlgorithmParameters cfr_renamed_3;
    private sprhtf cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Key engineUnwrap(byte[] arg0, String arg1, int arg2) throws InvalidKeyException, NoSuchAlgorithmException {
        if (arg2 != 3) {
            throw new InvalidKeyException(sprcul.cfr_renamed_9("\fu\u000fbCH&X1^7D(^:;\u0010n\u0013k\fi\u0017~\u0007"));
        }
        try {
            sprpjg sprpjg2;
            sprpjg sprpjg3 = sprpjg2 = new sprpjg(this.cfr_renamed_2.cfr_renamed_5650());
            byte[] byArray = sprpjg3.cfr_renamed_5685(sproze.cfr_renamed_533(arg0, 0, sprpjg3.cfr_renamed_5687()));
            spryy spryy2 = sprqye.cfr_renamed_5665(this.cfr_renamed_91.cfr_renamed_5666());
            sprtpk sprtpk2 = new sprtpk(byArray);
            sproze.cfr_renamed_3408(byArray);
            spryy2.cfr_renamed_5535(false, sprtpk2);
            byte[] byArray2 = sproze.cfr_renamed_533(arg0, sprpjg2.cfr_renamed_5687(), arg0.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(spryy2.cfr_renamed_1579(byArray2, 0, byArray2.length), arg1);
            sproze.cfr_renamed_3408(sprtpk2.cfr_renamed_1521());
            return secretKeySpec;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprklg.cfr_renamed_9("I|]pPw\u001cfS2YjH`]qH2wFo2Ow_`Yf\u00062")).append(illegalArgumentException.getMessage()).toString());
        }
        catch (sprull sprull2) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprcul.cfr_renamed_9("n\rz\u0001w\u0006;\u0017tC~\u001bo\u0011z\u0000oCP7HCh\u0006x\u0011~\u0017!C")).append(sprull2.getMessage()).toString());
        }
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
    public AlgorithmParameters engineGetParameters() {
        sprypf sprypf2;
        if (this.cfr_renamed_3 != null) {
            sprypf2 = this;
            return sprypf2.cfr_renamed_3;
        }
        try {
            sprypf sprypf3 = this;
            sprypf3.cfr_renamed_3 = AlgorithmParameters.getInstance(sprypf3.cfr_renamed_0, "BCPQC");
            sprypf3.cfr_renamed_3.init(this.cfr_renamed_91);
            sprypf2 = this;
            return sprypf2.cfr_renamed_3;
        }
        catch (Exception exception) {
            throw sprvhf.cfr_renamed_5211(exception.toString(), exception);
        }
    }

    @Override
    public int engineDoFinal(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        throw new IllegalStateException(sprklg.cfr_renamed_9("r}H2OgLbS`HwX2U|\u001cs\u001ceNsLbU|[2Q}Xw"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameters arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        sprypf sprypf2;
        sprsbi sprsbi2 = null;
        if (arg2 != null) {
            try {
                sprsbi2 = arg2.getParameterSpec(sprsbi.class);
                sprypf2 = this;
            }
            catch (Exception exception) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprcul.cfr_renamed_9("\u0000z\r<\u0017;\u000bz\r\u007f\u000f~Ck\u0002i\u0002v\u0006o\u0006iC")).append(arg2.toString()).toString());
            }
        } else {
            sprypf2 = this;
        }
        sprypf2.engineInit(arg0, arg1, sprsbi2, arg3);
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

    @Override
    public int engineGetKeySize(Key arg0) {
        return 2048;
    }

    @Override
    public void engineSetPadding(String arg0) throws NoSuchPaddingException {
        throw new NoSuchPaddingException(new StringBuilder().insert(0, sprklg.cfr_renamed_9("lsXvU|[2")).append(arg0).append(sprcul.cfr_renamed_9(";\u0016u\bu\fl\r")).toString());
    }

    @Override
    public byte[] engineUpdate(byte[] arg0, int arg1, int arg2) {
        throw new IllegalStateException(sprklg.cfr_renamed_9("r}H2OgLbS`HwX2U|\u001cs\u001ceNsLbU|[2Q}Xw"));
    }

    @Override
    public int engineGetOutputSize(int arg0) {
        return -1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineWrap(Key arg0) throws IllegalBlockSizeException, InvalidKeyException {
        if (arg0.getEncoded() == null) {
            throw new InvalidKeyException(sprcul.cfr_renamed_9(" z\ru\foCl\u0011z\u0013;\b~\u001a7Cu\u0016w\u000f;\u0006u\u0000t\u0007r\r|M"));
        }
        try {
            sprypf sprypf2 = this;
            sprki sprki2 = sprypf2.cfr_renamed_1.cfr_renamed_5686(sprypf2.cfr_renamed_4.cfr_renamed_5650());
            spryy spryy2 = sprqye.cfr_renamed_5665(sprypf2.cfr_renamed_91.cfr_renamed_5666());
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
            throw new IllegalBlockSizeException(new StringBuilder().insert(0, sprklg.cfr_renamed_9("gRs^~Y2H}\u001cuY|Y`]fY2wFo2Ow_`Yf\u00062")).append(illegalArgumentException.getMessage()).toString());
        }
        catch (DestroyFailedException destroyFailedException) {
            throw new IllegalBlockSizeException(new StringBuilder().insert(0, sprcul.cfr_renamed_9("n\rz\u0001w\u0006;\u0017tC\u007f\u0006h\u0017i\fbCr\ro\u0006i\nvCm\u0002w\u0016~\u0010!C")).append(destroyFailedException.getMessage()).toString());
        }
    }

    @Override
    public void engineSetMode(String arg0) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprklg.cfr_renamed_9("\u007fsR|Sf\u001caIbL}Nf\u001c\u007fSvY2")).append(arg0).toString());
    }

    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameterSpec arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int n;
        if (arg2 == null) {
            n = arg0;
            sprypf sprypf2 = this;
            sprypf2.cfr_renamed_91 = new sprsbi(sprcul.cfr_renamed_9("\"^06(L3"));
        } else {
            if (!(arg2 instanceof sprsbi)) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, this.cfr_renamed_0).append(sprklg.cfr_renamed_9("2_sR2S|Pk\u001cs_qYbH2wFoB]`]\u007fYfY`obYq")).toString());
            }
            this.cfr_renamed_91 = (sprsbi)arg2;
            n = arg0;
        }
        if (n == 3) {
            if (arg1 instanceof sprhtf) {
                this.cfr_renamed_4 = (sprhtf)arg1;
                this.cfr_renamed_1 = new spruhg(sprybl.cfr_renamed_5688(arg3));
                return;
            }
            throw new InvalidKeyException(new StringBuilder().insert(0, sprcul.cfr_renamed_9(",u\u000fbCzC")).append(this.cfr_renamed_0).append(sprklg.cfr_renamed_9("\u001cbIpP{_2WwE2_sR2^w\u001cgOwX2Z}N2K`]bL{Ru")).toString());
        }
        if (arg0 == 4) {
            if (arg1 instanceof sprjjf) {
                this.cfr_renamed_2 = (sprjjf)arg1;
                return;
            }
            throw new InvalidKeyException(new StringBuilder().insert(0, sprcul.cfr_renamed_9(",u\u000fbCzC")).append(this.cfr_renamed_0).append(sprklg.cfr_renamed_9("2L`Ud]fY2WwE2_sR2^w\u001cgOwX2Z}N2I|K`]bL{Ru")).toString());
        }
        throw new InvalidParameterException(sprcul.cfr_renamed_9(" r\u0013s\u0006iCt\rw\u001a;\u0015z\u000fr\u0007;\u0005t\u0011;\u0014i\u0002k\u0013r\r|Ln\rl\u0011z\u0013k\nu\u0004"));
    }

    @Override
    public int engineGetBlockSize() {
        return 0;
    }

    public sprypf(String string) throws NoSuchAlgorithmException {
        this.cfr_renamed_0 = string;
    }

    @Override
    public int engineUpdate(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException {
        throw new IllegalStateException(sprklg.cfr_renamed_9("r}H2OgLbS`HwX2U|\u001cs\u001ceNsLbU|[2Q}Xw"));
    }

    @Override
    public byte[] engineDoFinal(byte[] arg0, int arg1, int arg2) throws IllegalBlockSizeException, BadPaddingException {
        throw new IllegalStateException(sprcul.cfr_renamed_9("U\foCh\u0016k\u0013t\u0011o\u0006\u007fCr\r;\u0002;\u0014i\u0002k\u0013r\r|Cv\f\u007f\u0006"));
    }
}

