/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdrc;
import com.spire.presentation.packages.sprgrf;
import com.spire.presentation.packages.sprjsd;
import com.spire.presentation.packages.sprki;
import com.spire.presentation.packages.sprlcg;
import com.spire.presentation.packages.sprmxf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqye;
import com.spire.presentation.packages.sprsbi;
import com.spire.presentation.packages.sprukf;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprvei;
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

public class sprtjf
extends CipherSpi {
    private sprmxf cfr_renamed_91;
    private final String cfr_renamed_0;
    private AlgorithmParameters cfr_renamed_1;
    private sprgrf cfr_renamed_2;
    private sprvei cfr_renamed_3;
    private sprukf cfr_renamed_4;

    @Override
    public int engineGetBlockSize() {
        return 0;
    }

    public sprtjf(String string) throws NoSuchAlgorithmException {
        this.cfr_renamed_0 = string;
    }

    @Override
    public int engineDoFinal(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        throw new IllegalStateException(sprjsd.cfr_renamed_9("\"\u0007\u0018H\u001f\u001d\u001c\u0018\u0003\u001a\u0018\r\bH\u0005\u0006L\tL\u001f\u001e\t\u001c\u0018\u0005\u0006\u000bH\u0001\u0007\b\r"));
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
    public byte[] engineGetIV() {
        return null;
    }

    @Override
    public void engineSetPadding(String arg0) throws NoSuchPaddingException {
        throw new NoSuchPaddingException(new StringBuilder().insert(0, sprdrc.cfr_renamed_9("\u0002\u00046\u0001;\u000b5E")).append(arg0).append(sprjsd.cfr_renamed_9("L\u001d\u0002\u0003\u0002\u0007\u001b\u0006")).toString());
    }

    @Override
    public void engineSetMode(String arg0) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprdrc.cfr_renamed_9("\u0011\u0004<\u000b=\u0011r\u0016'\u0015\"\n \u0011r\b=\u00017E")).append(arg0).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGetParameters() {
        sprtjf sprtjf2;
        if (this.cfr_renamed_1 != null) {
            sprtjf2 = this;
            return sprtjf2.cfr_renamed_1;
        }
        try {
            sprtjf sprtjf3 = this;
            sprtjf3.cfr_renamed_1 = AlgorithmParameters.getInstance(sprtjf3.cfr_renamed_0, "BCPQC");
            sprtjf3.cfr_renamed_1.init(this.cfr_renamed_3);
            sprtjf2 = this;
            return sprtjf2.cfr_renamed_1;
        }
        catch (Exception exception) {
            throw sprvhf.cfr_renamed_5211(exception.toString(), exception);
        }
    }

    @Override
    public byte[] engineUpdate(byte[] arg0, int arg1, int arg2) {
        throw new IllegalStateException(sprjsd.cfr_renamed_9("\"\u0007\u0018H\u001f\u001d\u001c\u0018\u0003\u001a\u0018\r\bH\u0005\u0006L\tL\u001f\u001e\t\u001c\u0018\u0005\u0006\u000bH\u0001\u0007\b\r"));
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
    public Key engineUnwrap(byte[] arg0, String arg1, int arg2) throws InvalidKeyException, NoSuchAlgorithmException {
        if (arg2 != 3) {
            throw new InvalidKeyException(sprdrc.cfr_renamed_9("\n<\t+E\u0001 \u00117\u00171\r.\u0017<r\u0016'\u0015\"\n \u00117\u0001"));
        }
        try {
            sprlcg sprlcg2;
            sprlcg sprlcg3 = sprlcg2 = new sprlcg(this.cfr_renamed_4.cfr_renamed_5650());
            byte[] byArray = sprlcg3.cfr_renamed_5685(sproze.cfr_renamed_533(arg0, 0, sprlcg3.cfr_renamed_5687()));
            spryy spryy2 = sprqye.cfr_renamed_5664(this.cfr_renamed_3, byArray);
            sproze.cfr_renamed_3408(byArray);
            byte[] byArray2 = sproze.cfr_renamed_533(arg0, sprlcg2.cfr_renamed_5687(), arg0.length);
            return new SecretKeySpec(spryy2.cfr_renamed_1579(byArray2, 0, byArray2.length), arg1);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprjsd.cfr_renamed_9("\u0019\u0006\r\n\u0000\rL\u001c\u0003H\t\u0010\u0018\u001a\r\u000b\u0018H'<?H\u001f\r\u000f\u001a\t\u001cVH")).append(illegalArgumentException.getMessage()).toString());
        }
        catch (sprull sprull2) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprdrc.cfr_renamed_9("'\u000b3\u0007>\u0000r\u0011=E7\u001d&\u00173\u0006&E\u00191\u0001E!\u00001\u00177\u0011hE")).append(sprull2.getMessage()).toString());
        }
    }

    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameterSpec arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int n;
        if (arg2 == null) {
            n = arg0;
            sprtjf sprtjf2 = this;
            sprtjf2.cfr_renamed_3 = new sprsbi(sprjsd.cfr_renamed_9("));A#;8"));
        } else {
            if (!(arg2 instanceof sprvei)) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, this.cfr_renamed_0).append(sprdrc.cfr_renamed_9("E1\u0004<E=\u000b>\u001cr\u00041\u00067\u0015&E\u00191\u000153\u00173\b7\u00117\u0017\u0001\u00157\u0006")).toString());
            }
            this.cfr_renamed_3 = (sprvei)arg2;
            n = arg0;
        }
        if (n == 3) {
            if (arg1 instanceof sprgrf) {
                this.cfr_renamed_2 = (sprgrf)arg1;
                this.cfr_renamed_91 = new sprmxf(sprybl.cfr_renamed_5688(arg3));
                return;
            }
            throw new InvalidKeyException(new StringBuilder().insert(0, sprjsd.cfr_renamed_9("'\u0002\u0004\u0015H\rH")).append(this.cfr_renamed_0).append(sprdrc.cfr_renamed_9("r\u0015'\u0007>\f1E9\u0000+E1\u0004<E0\u0000r\u0010!\u00006E4\n E%\u00173\u0015\"\f<\u0002")).toString());
        }
        if (arg0 == 4) {
            if (arg1 instanceof sprukf) {
                this.cfr_renamed_4 = (sprukf)arg1;
                return;
            }
            throw new InvalidKeyException(new StringBuilder().insert(0, sprjsd.cfr_renamed_9("'\u0002\u0004\u0015H\rH")).append(this.cfr_renamed_0).append(sprdrc.cfr_renamed_9("E\"\u0017;\u00133\u00117E9\u0000+E1\u0004<E0\u0000r\u0010!\u00006E4\n E'\u000b%\u00173\u0015\"\f<\u0002")).toString());
        }
        throw new InvalidParameterException(sprjsd.cfr_renamed_9("+\u0005\u0018\u0004\r\u001eH\u0003\u0006\u0000\u0011L\u001e\r\u0004\u0005\fL\u000e\u0003\u001aL\u001f\u001e\t\u001c\u0018\u0005\u0006\u000bG\u0019\u0006\u001b\u001a\r\u0018\u001c\u0001\u0002\u000f"));
    }

    @Override
    public byte[] engineDoFinal(byte[] arg0, int arg1, int arg2) throws IllegalBlockSizeException, BadPaddingException {
        throw new IllegalStateException(sprdrc.cfr_renamed_9("\u001c\n&E!\u0010\"\u0015=\u0017&\u00006E;\u000br\u0004r\u0012 \u0004\"\u0015;\u000b5E?\n6\u0000"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineWrap(Key arg0) throws IllegalBlockSizeException, InvalidKeyException {
        if (arg0.getEncoded() == null) {
            throw new InvalidKeyException(sprjsd.cfr_renamed_9("+\r\u0006\u0002\u0007\u0018H\u001b\u001a\r\u0018L\u0003\t\u0011@H\u0002\u001d\u0000\u0004L\r\u0002\u000b\u0003\f\u0005\u0006\u000bF"));
        }
        try {
            sprtjf sprtjf2 = this;
            sprki sprki2 = sprtjf2.cfr_renamed_91.cfr_renamed_5686(sprtjf2.cfr_renamed_2.cfr_renamed_5650());
            spryy spryy2 = sprqye.cfr_renamed_5669(sprtjf2.cfr_renamed_3, sprki2.cfr_renamed_3880());
            sprki sprki3 = sprki2;
            byte[] byArray = sprki3.cfr_renamed_5684();
            sprki3.destroy();
            byte[] byArray2 = arg0.getEncoded();
            byte[] byArray3 = sproze.cfr_renamed_543(byArray, spryy2.cfr_renamed_1575(byArray2, 0, byArray2.length));
            sproze.cfr_renamed_3408(byArray2);
            return byArray3;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IllegalBlockSizeException(new StringBuilder().insert(0, sprdrc.cfr_renamed_9("\u0010<\u00040\t7E&\nr\u00027\u000b7\u00173\u00117E\u00191\u0001E!\u00001\u00177\u0011hE")).append(illegalArgumentException.getMessage()).toString());
        }
        catch (DestroyFailedException destroyFailedException) {
            throw new IllegalBlockSizeException(new StringBuilder().insert(0, sprjsd.cfr_renamed_9("\u0019\u0006\r\n\u0000\rL\u001c\u0003H\b\r\u001f\u001c\u001e\u0007\u0015H\u0005\u0006\u0018\r\u001e\u0001\u0001H\u001a\t\u0000\u001d\t\u001bVH")).append(destroyFailedException.getMessage()).toString());
        }
    }

    @Override
    public int engineUpdate(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException {
        throw new IllegalStateException(sprdrc.cfr_renamed_9("\u001c\n&E!\u0010\"\u0015=\u0017&\u00006E;\u000br\u0004r\u0012 \u0004\"\u0015;\u000b5E?\n6\u0000"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameters arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        sprtjf sprtjf2;
        sprsbi sprsbi2 = null;
        if (arg2 != null) {
            try {
                sprsbi2 = arg2.getParameterSpec(sprsbi.class);
                sprtjf2 = this;
            }
            catch (Exception exception) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprjsd.cfr_renamed_9("\u000b\r\u0006K\u001cL\u0000\r\u0006\b\u0004\tH\u001c\t\u001e\t\u0001\r\u0018\r\u001eH")).append(arg2.toString()).toString());
            }
        } else {
            sprtjf2 = this;
        }
        sprtjf2.engineInit(arg0, arg1, sprsbi2, arg3);
    }

    @Override
    public int engineGetOutputSize(int arg0) {
        return -1;
    }
}

