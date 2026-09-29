/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdrda;
import com.spire.presentation.packages.sprki;
import com.spire.presentation.packages.sprlbf;
import com.spire.presentation.packages.sprotf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqye;
import com.spire.presentation.packages.sprsbi;
import com.spire.presentation.packages.sprseg;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprvhf;
import com.spire.presentation.packages.sprvir;
import com.spire.presentation.packages.sprxze;
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

public class sprlxe
extends CipherSpi {
    private AlgorithmParameters cfr_renamed_91;
    private sprseg cfr_renamed_0;
    private sprsbi cfr_renamed_1;
    private sprxze cfr_renamed_2;
    private final String cfr_renamed_3;
    private sprlbf cfr_renamed_4;

    @Override
    public void engineSetPadding(String arg0) throws NoSuchPaddingException {
        throw new NoSuchPaddingException(new StringBuilder().insert(0, sprvir.cfr_renamed_9("3n\u0007k\na\u0004/")).append(arg0).append(sprdrda.cfr_renamed_9("If\u0007x\u0007|\u001e}")).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGetParameters() {
        sprlxe sprlxe2;
        if (this.cfr_renamed_91 != null) {
            sprlxe2 = this;
            return sprlxe2.cfr_renamed_91;
        }
        try {
            sprlxe sprlxe3 = this;
            sprlxe3.cfr_renamed_91 = AlgorithmParameters.getInstance(sprlxe3.cfr_renamed_3, "BCPQC");
            sprlxe3.cfr_renamed_91.init(this.cfr_renamed_1);
            sprlxe2 = this;
            return sprlxe2.cfr_renamed_91;
        }
        catch (Exception exception) {
            throw sprvhf.cfr_renamed_5211(exception.toString(), exception);
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
    public byte[] engineWrap(Key arg0) throws IllegalBlockSizeException, InvalidKeyException {
        if (arg0.getEncoded() == null) {
            throw new InvalidKeyException(sprvir.cfr_renamed_9("L\u0002a\r`\u0017/\u0014}\u0002\u007fCd\u0006vO/\rz\u000fcCj\rl\fk\na\u0004!"));
        }
        try {
            sprlxe sprlxe2 = this;
            sprki sprki2 = sprlxe2.cfr_renamed_0.cfr_renamed_5686(sprlxe2.cfr_renamed_4.cfr_renamed_5650());
            spryy spryy2 = sprqye.cfr_renamed_5665(sprlxe2.cfr_renamed_1.cfr_renamed_5666());
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
            throw new IllegalBlockSizeException(new StringBuilder().insert(0, sprdrda.cfr_renamed_9("f\u0007r\u000b\u007f\f3\u001d|It\f}\fa\bg\f3\"G:3\u001av\na\fgS3")).append(illegalArgumentException.getMessage()).toString());
        }
        catch (DestroyFailedException destroyFailedException) {
            throw new IllegalBlockSizeException(new StringBuilder().insert(0, sprvir.cfr_renamed_9("\u0016a\u0002m\u000fjC{\f/\u0007j\u0010{\u0011`\u001a/\na\u0017j\u0011f\u000e/\u0015n\u000fz\u0006|Y/")).append(destroyFailedException.getMessage()).toString());
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
            throw new InvalidKeyException(sprdrda.cfr_renamed_9("|\u0007\u007f\u00103:V*A,G6X,JI`\u001cc\u0019|\u001bg\fw"));
        }
        try {
            sprotf sprotf2;
            sprotf sprotf3 = sprotf2 = new sprotf(this.cfr_renamed_2.cfr_renamed_5650());
            byte[] byArray = sprotf3.cfr_renamed_5685(sproze.cfr_renamed_533(arg0, 0, sprotf3.cfr_renamed_5687()));
            spryy spryy2 = sprqye.cfr_renamed_5665(this.cfr_renamed_1.cfr_renamed_5666());
            sprtpk sprtpk2 = new sprtpk(byArray);
            sproze.cfr_renamed_3408(byArray);
            spryy2.cfr_renamed_5535(false, sprtpk2);
            byte[] byArray2 = sproze.cfr_renamed_533(arg0, sprotf2.cfr_renamed_5687(), arg0.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(spryy2.cfr_renamed_1579(byArray2, 0, byArray2.length), arg1);
            sproze.cfr_renamed_3408(sprtpk2.cfr_renamed_1521());
            return secretKeySpec;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprvir.cfr_renamed_9("\u0016a\u0002m\u000fjC{\f/\u0006w\u0017}\u0002l\u0017/([0/\u0010j\u0000}\u0006{Y/")).append(illegalArgumentException.getMessage()).toString());
        }
        catch (sprull sprull2) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprdrda.cfr_renamed_9("\u001c}\bq\u0005vIg\u00063\fk\u001da\bp\u001d3\"G:3\u001av\na\fgS3")).append(sprull2.getMessage()).toString());
        }
    }

    @Override
    public int engineGetKeySize(Key arg0) {
        return 2048;
    }

    @Override
    public void engineSetMode(String arg0) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprvir.cfr_renamed_9(" n\ra\f{C|\u0016\u007f\u0013`\u0011{Cb\fk\u0006/")).append(arg0).toString());
    }

    @Override
    public int engineGetOutputSize(int arg0) {
        return -1;
    }

    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameterSpec arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int n;
        if (arg2 == null) {
            n = arg0;
            sprlxe sprlxe2 = this;
            sprlxe2.cfr_renamed_1 = new sprsbi(sprdrda.cfr_renamed_9("R,@DX>C"));
        } else {
            if (!(arg2 instanceof sprsbi)) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, this.cfr_renamed_3).append(sprvir.cfr_renamed_9("/\u0000n\r/\fa\u000fvCn\u0000l\u0006\u007f\u0017/([0_\u0002}\u0002b\u0006{\u0006}0\u007f\u0006l")).toString());
            }
            this.cfr_renamed_1 = (sprsbi)arg2;
            n = arg0;
        }
        if (n == 3) {
            if (arg1 instanceof sprlbf) {
                this.cfr_renamed_4 = (sprlbf)arg1;
                this.cfr_renamed_0 = new sprseg(sprybl.cfr_renamed_5688(arg3));
                return;
            }
            throw new InvalidKeyException(new StringBuilder().insert(0, sprdrda.cfr_renamed_9("\\\u0007\u007f\u00103\b3")).append(this.cfr_renamed_3).append(sprvir.cfr_renamed_9("C\u007f\u0016m\u000ff\u0000/\bj\u001a/\u0000n\r/\u0001jCz\u0010j\u0007/\u0005`\u0011/\u0014}\u0002\u007f\u0013f\rh")).toString());
        }
        if (arg0 == 4) {
            if (arg1 instanceof sprxze) {
                this.cfr_renamed_2 = (sprxze)arg1;
                return;
            }
            throw new InvalidKeyException(new StringBuilder().insert(0, sprdrda.cfr_renamed_9("\\\u0007\u007f\u00103\b3")).append(this.cfr_renamed_3).append(sprvir.cfr_renamed_9("/\u0013}\ny\u0002{\u0006/\bj\u001a/\u0000n\r/\u0001jCz\u0010j\u0007/\u0005`\u0011/\u0016a\u0014}\u0002\u007f\u0013f\rh")).toString());
        }
        throw new InvalidParameterException(sprdrda.cfr_renamed_9("P\u0000c\u0001v\u001b3\u0006}\u0005jIe\b\u007f\u0000wIu\u0006aId\u001br\u0019c\u0000}\u000e<\u001c}\u001ea\bc\u0019z\u0007t"));
    }

    @Override
    public int engineDoFinal(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        throw new IllegalStateException(sprvir.cfr_renamed_9("-`\u0017/\u0010z\u0013\u007f\f}\u0017j\u0007/\naCnCx\u0011n\u0013\u007f\na\u0004/\u000e`\u0007j"));
    }

    @Override
    public byte[] engineUpdate(byte[] arg0, int arg1, int arg2) {
        throw new IllegalStateException(sprdrda.cfr_renamed_9("'|\u001d3\u001af\u0019c\u0006a\u001dv\r3\u0000}IrId\u001br\u0019c\u0000}\u000e3\u0004|\rv"));
    }

    @Override
    public int engineUpdate(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException {
        throw new IllegalStateException(sprvir.cfr_renamed_9("-`\u0017/\u0010z\u0013\u007f\f}\u0017j\u0007/\naCnCx\u0011n\u0013\u007f\na\u0004/\u000e`\u0007j"));
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

    public sprlxe(String string) throws NoSuchAlgorithmException {
        this.cfr_renamed_3 = string;
    }

    @Override
    public int engineGetBlockSize() {
        return 0;
    }

    @Override
    public byte[] engineDoFinal(byte[] arg0, int arg1, int arg2) throws IllegalBlockSizeException, BadPaddingException {
        throw new IllegalStateException(sprdrda.cfr_renamed_9("'|\u001d3\u001af\u0019c\u0006a\u001dv\r3\u0000}IrId\u001br\u0019c\u0000}\u000e3\u0004|\rv"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameters arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        sprlxe sprlxe2;
        sprsbi sprsbi2 = null;
        if (arg2 != null) {
            try {
                sprsbi2 = arg2.getParameterSpec(sprsbi.class);
                sprlxe2 = this;
            }
            catch (Exception exception) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprvir.cfr_renamed_9("l\u0002aD{Cg\u0002a\u0007c\u0006/\u0013n\u0011n\u000ej\u0017j\u0011/")).append(arg2.toString()).toString());
            }
        } else {
            sprlxe2 = this;
        }
        sprlxe2.engineInit(arg0, arg1, sprsbi2, arg3);
    }
}

