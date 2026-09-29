/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprejf;
import com.spire.presentation.packages.sprewi;
import com.spire.presentation.packages.sprki;
import com.spire.presentation.packages.sprmfaa;
import com.spire.presentation.packages.sprnhg;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqye;
import com.spire.presentation.packages.sprsbi;
import com.spire.presentation.packages.sprsgg;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.spruof;
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

public class sprmjf
extends CipherSpi {
    private AlgorithmParameters cfr_renamed_91;
    private spruof cfr_renamed_0;
    private sprsbi cfr_renamed_1;
    private sprejf cfr_renamed_2;
    private sprnhg cfr_renamed_3;
    private final String cfr_renamed_4;

    public sprmjf(String string) {
        this.cfr_renamed_4 = string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameters arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        sprmjf sprmjf2;
        sprsbi sprsbi2 = null;
        if (arg2 != null) {
            try {
                sprsbi2 = arg2.getParameterSpec(sprsbi.class);
                sprmjf2 = this;
            }
            catch (Exception exception) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprewi.cfr_renamed_9(">{3=):5{3~1\u007f}j<h<w8n8h}")).append(arg2.toString()).toString());
            }
        } else {
            sprmjf2 = this;
        }
        sprmjf2.engineInit(arg0, arg1, sprsbi2, arg3);
    }

    @Override
    public int engineGetKeySize(Key arg0) {
        return 2048;
    }

    @Override
    public void engineSetPadding(String arg0) throws NoSuchPaddingException {
        throw new NoSuchPaddingException(new StringBuilder().insert(0, sprmfaa.cfr_renamed_9("@ptuy\u007fw1")).append(arg0).append(sprewi.cfr_renamed_9(":(t6t2m3")).toString());
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
    public Key engineUnwrap(byte[] arg0, String arg1, int arg2) throws InvalidKeyException, NoSuchAlgorithmException {
        if (arg2 != 3) {
            throw new InvalidKeyException(sprmfaa.cfr_renamed_9("~~}i1CTSCUEOZUH0bea`~beuu"));
        }
        try {
            sprsgg sprsgg2;
            sprsgg sprsgg3 = sprsgg2 = new sprsgg(this.cfr_renamed_0.cfr_renamed_5650());
            byte[] byArray = sprsgg3.cfr_renamed_5685(sproze.cfr_renamed_533(arg0, 0, sprsgg3.cfr_renamed_5687()));
            spryy spryy2 = sprqye.cfr_renamed_5665(this.cfr_renamed_1.cfr_renamed_5666());
            sprtpk sprtpk2 = new sprtpk(byArray);
            sproze.cfr_renamed_3408(byArray);
            spryy2.cfr_renamed_5535(false, sprtpk2);
            byte[] byArray2 = sproze.cfr_renamed_533(arg0, sprsgg2.cfr_renamed_5687(), arg0.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(spryy2.cfr_renamed_1579(byArray2, 0, byArray2.length), arg1);
            sproze.cfr_renamed_3408(sprtpk2.cfr_renamed_1521());
            return secretKeySpec;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprewi.cfr_renamed_9("o3{?v8:)u}\u007f%n/{>n}Q\tI}i8y/\u007f) }")).append(illegalArgumentException.getMessage()).toString());
        }
        catch (sprull sprull2) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprmfaa.cfr_renamed_9("e\u007fqs|t0e\u007f1uidcqrd1[EC1ctscue*1")).append(sprull2.getMessage()).toString());
        }
    }

    @Override
    public byte[] engineUpdate(byte[] arg0, int arg1, int arg2) {
        throw new IllegalStateException(sprewi.cfr_renamed_9("T2n}i(j-u/n8~}s3:<:*h<j-s3}}w2~8"));
    }

    @Override
    public int engineDoFinal(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        throw new IllegalStateException(sprmfaa.cfr_renamed_9("^~d1cd`a\u007fcdtt1y\u007f0p0fbp`ay\u007fw1}~tt"));
    }

    @Override
    public int engineGetOutputSize(int arg0) {
        return -1;
    }

    @Override
    public int engineGetBlockSize() {
        return 0;
    }

    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameterSpec arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int n;
        if (arg2 == null) {
            n = arg0;
            sprmjf sprmjf2 = this;
            sprmjf2.cfr_renamed_1 = new sprsbi(sprewi.cfr_renamed_9("\u001c_\u000e7\u0016M\r"));
        } else {
            if (!(arg2 instanceof sprsbi)) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, this.cfr_renamed_4).append(sprmfaa.cfr_renamed_9("1sp~1\u007f\u007f|h0psruad1[ECAqcq|ueucCaur")).toString());
            }
            this.cfr_renamed_1 = (sprsbi)arg2;
            n = arg0;
        }
        if (n == 3) {
            if (arg1 instanceof sprejf) {
                this.cfr_renamed_2 = (sprejf)arg1;
                this.cfr_renamed_3 = new sprnhg(sprybl.cfr_renamed_5688(arg3));
                return;
            }
            throw new InvalidKeyException(new StringBuilder().insert(0, sprewi.cfr_renamed_9("\u0012t1c}{}")).append(this.cfr_renamed_4).append(sprmfaa.cfr_renamed_9("0aes|xs1{ti1sp~1rt0dctt1v~b1gcqa`x~v")).toString());
        }
        if (arg0 == 4) {
            if (arg1 instanceof spruof) {
                this.cfr_renamed_0 = (spruof)arg1;
                return;
            }
            throw new InvalidKeyException(new StringBuilder().insert(0, sprewi.cfr_renamed_9("\u0012t1c}{}")).append(this.cfr_renamed_4).append(sprmfaa.cfr_renamed_9("1`cygqeu1{ti1sp~1rt0dctt1v~b1e\u007fgcqa`x~v")).toString());
        }
        throw new InvalidParameterException(sprewi.cfr_renamed_9("\u001es-r8h}u3v$:+{1s9:;u/:*h<j-s3}ro3m/{-j4t:"));
    }

    @Override
    public byte[] engineDoFinal(byte[] arg0, int arg1, int arg2) throws IllegalBlockSizeException, BadPaddingException {
        throw new IllegalStateException(sprmfaa.cfr_renamed_9("^~d1cd`a\u007fcdtt1y\u007f0p0fbp`ay\u007fw1}~tt"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineWrap(Key arg0) throws IllegalBlockSizeException, InvalidKeyException {
        if (arg0.getEncoded() == null) {
            throw new InvalidKeyException(sprewi.cfr_renamed_9("\u001e{3t2n}m/{-:6\u007f$6}t(v1:8t>u9s3}s"));
        }
        try {
            sprmjf sprmjf2 = this;
            sprki sprki2 = sprmjf2.cfr_renamed_3.cfr_renamed_5686(sprmjf2.cfr_renamed_2.cfr_renamed_5650());
            spryy spryy2 = sprqye.cfr_renamed_5665(sprmjf2.cfr_renamed_1.cfr_renamed_5666());
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
            throw new IllegalBlockSizeException(new StringBuilder().insert(0, sprmfaa.cfr_renamed_9("d~pr}u1d~0vu\u007fucqeu1[EC1ctscue*1")).append(illegalArgumentException.getMessage()).toString());
        }
        catch (DestroyFailedException destroyFailedException) {
            throw new IllegalBlockSizeException(new StringBuilder().insert(0, sprewi.cfr_renamed_9("o3{?v8:)u}~8i)h2c}s3n8h4w}l<v(\u007f. }")).append(destroyFailedException.getMessage()).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGetParameters() {
        sprmjf sprmjf2;
        if (this.cfr_renamed_91 != null) {
            sprmjf2 = this;
            return sprmjf2.cfr_renamed_91;
        }
        try {
            sprmjf sprmjf3 = this;
            sprmjf3.cfr_renamed_91 = AlgorithmParameters.getInstance(sprmjf3.cfr_renamed_4, "BCPQC");
            sprmjf3.cfr_renamed_91.init(this.cfr_renamed_1);
            sprmjf2 = this;
            return sprmjf2.cfr_renamed_91;
        }
        catch (Exception exception) {
            throw sprvhf.cfr_renamed_5211(exception.toString(), exception);
        }
    }

    @Override
    public void engineSetMode(String arg0) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprmfaa.cfr_renamed_9("Sp~\u007f\u007fe0bea`~be0|\u007fuu1")).append(arg0).toString());
    }

    @Override
    public int engineUpdate(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException {
        throw new IllegalStateException(sprewi.cfr_renamed_9("T2n}i(j-u/n8~}s3:<:*h<j-s3}}w2~8"));
    }

    @Override
    public byte[] engineGetIV() {
        return null;
    }
}

