/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbpf;
import com.spire.presentation.packages.sprcxe;
import com.spire.presentation.packages.sprdvf;
import com.spire.presentation.packages.sprjod;
import com.spire.presentation.packages.sprki;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqye;
import com.spire.presentation.packages.sprsbi;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprvhf;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.spryy;
import com.spire.presentation.packages.sprzsf;
import com.spire.presentation.packages.sprzvf;
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

public class sprcif
extends CipherSpi {
    private sprbpf cfr_renamed_91;
    private sprzvf cfr_renamed_0;
    private final String cfr_renamed_1;
    private sprzsf cfr_renamed_2;
    private sprsbi cfr_renamed_3;
    private AlgorithmParameters cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameters arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        sprcif sprcif2;
        sprsbi sprsbi2 = null;
        if (arg2 != null) {
            try {
                sprsbi2 = arg2.getParameterSpec(sprsbi.class);
                sprcif2 = this;
            }
            catch (Exception exception) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprjod.cfr_renamed_9("\u00132\u001et\u0004s\u00182\u001e7\u001c6P#\u0011!\u0011>\u0015'\u0015!P")).append(arg2.toString()).toString());
            }
        } else {
            sprcif2 = this;
        }
        sprcif2.engineInit(arg0, arg1, sprsbi2, arg3);
    }

    @Override
    public void engineSetPadding(String arg0) throws NoSuchPaddingException {
        throw new NoSuchPaddingException(new StringBuilder().insert(0, sprcxe.cfr_renamed_9("c\u001cW\u0019Z\u0013T]")).append(arg0).append(sprjod.cfr_renamed_9("s\u0005=\u001b=\u001f$\u001e")).toString());
    }

    @Override
    public byte[] engineUpdate(byte[] arg0, int arg1, int arg2) {
        throw new IllegalStateException(sprcxe.cfr_renamed_9("}\u0012G]@\bC\r\\\u000fG\u0018W]Z\u0013\u0013\u001c\u0013\nA\u001cC\rZ\u0013T]^\u0012W\u0018"));
    }

    @Override
    public int engineGetBlockSize() {
        return 0;
    }

    @Override
    public byte[] engineGetIV() {
        return null;
    }

    @Override
    public int engineGetKeySize(Key arg0) {
        return 2048;
    }

    @Override
    public void engineSetMode(String arg0) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprjod.cfr_renamed_9("\u0010\u0011=\u001e<\u0004s\u0003&\u0000#\u001f!\u0004s\u001d<\u00146P")).append(arg0).toString());
    }

    @Override
    public int engineDoFinal(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        throw new IllegalStateException(sprcxe.cfr_renamed_9("}\u0012G]@\bC\r\\\u000fG\u0018W]Z\u0013\u0013\u001c\u0013\nA\u001cC\rZ\u0013T]^\u0012W\u0018"));
    }

    public sprcif(String string) throws NoSuchAlgorithmException {
        this.cfr_renamed_1 = string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Key engineUnwrap(byte[] arg0, String arg1, int arg2) throws InvalidKeyException, NoSuchAlgorithmException {
        if (arg2 != 3) {
            throw new InvalidKeyException(sprjod.cfr_renamed_9("\u001f=\u001c*P\u00005\u0010\"\u0016$\f;\u0016)s\u0003&\u0000#\u001f!\u00046\u0014"));
        }
        try {
            sprdvf sprdvf2;
            sprdvf sprdvf3 = sprdvf2 = new sprdvf(this.cfr_renamed_91.cfr_renamed_5650());
            byte[] byArray = sprdvf3.cfr_renamed_5685(sproze.cfr_renamed_533(arg0, 0, sprdvf3.cfr_renamed_5687()));
            spryy spryy2 = sprqye.cfr_renamed_5665(this.cfr_renamed_3.cfr_renamed_5666());
            sprtpk sprtpk2 = new sprtpk(byArray);
            sproze.cfr_renamed_3408(byArray);
            spryy2.cfr_renamed_5535(false, sprtpk2);
            byte[] byArray2 = sproze.cfr_renamed_533(arg0, sprdvf2.cfr_renamed_5687(), arg0.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(spryy2.cfr_renamed_1579(byArray2, 0, byArray2.length), arg1);
            sproze.cfr_renamed_3408(sprtpk2.cfr_renamed_1521());
            return secretKeySpec;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            illegalArgumentException.printStackTrace();
            throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprcxe.cfr_renamed_9("F\u0013R\u001f_\u0018\u0013\t\\]V\u0005G\u000fR\u001eG]x)`]@\u0018P\u000fV\t\t]")).append(illegalArgumentException.getMessage()).toString());
        }
        catch (sprull sprull2) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprjod.cfr_renamed_9("&\u001e2\u0012?\u0015s\u0004<P6\b'\u00022\u0013'P\u0018$\u0000P \u00150\u00026\u0004iP")).append(sprull2.getMessage()).toString());
        }
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
            throw new InvalidKeyException(sprcxe.cfr_renamed_9(">R\u0013]\u0012G]D\u000fR\r\u0013\u0016V\u0004\u001f]]\b_\u0011\u0013\u0018]\u001e\\\u0019Z\u0013TS"));
        }
        try {
            sprcif sprcif2 = this;
            sprki sprki2 = sprcif2.cfr_renamed_0.cfr_renamed_5686(sprcif2.cfr_renamed_2.cfr_renamed_5650());
            spryy spryy2 = sprqye.cfr_renamed_5665(sprcif2.cfr_renamed_3.cfr_renamed_5666());
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
            throw new IllegalBlockSizeException(new StringBuilder().insert(0, sprjod.cfr_renamed_9("\u0005=\u00111\u001c6P'\u001fs\u00176\u001e6\u00022\u00046P\u0018$\u0000P \u00150\u00026\u0004iP")).append(illegalArgumentException.getMessage()).toString());
        }
        catch (DestroyFailedException destroyFailedException) {
            throw new IllegalBlockSizeException(new StringBuilder().insert(0, sprcxe.cfr_renamed_9("F\u0013R\u001f_\u0018\u0013\t\\]W\u0018@\tA\u0012J]Z\u0013G\u0018A\u0014^]E\u001c_\bV\u000e\t]")).append(destroyFailedException.getMessage()).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGetParameters() {
        sprcif sprcif2;
        if (this.cfr_renamed_4 != null) {
            sprcif2 = this;
            return sprcif2.cfr_renamed_4;
        }
        try {
            sprcif sprcif3 = this;
            sprcif3.cfr_renamed_4 = AlgorithmParameters.getInstance(sprcif3.cfr_renamed_1, "BCPQC");
            sprcif3.cfr_renamed_4.init(this.cfr_renamed_3);
            sprcif2 = this;
            return sprcif2.cfr_renamed_4;
        }
        catch (Exception exception) {
            throw sprvhf.cfr_renamed_5211(exception.toString(), exception);
        }
    }

    @Override
    public byte[] engineDoFinal(byte[] arg0, int arg1, int arg2) throws IllegalBlockSizeException, BadPaddingException {
        throw new IllegalStateException(sprjod.cfr_renamed_9("\u001d\u001f'P \u0005#\u0000<\u0002'\u00157P:\u001es\u0011s\u0007!\u0011#\u0000:\u001e4P>\u001f7\u0015"));
    }

    @Override
    public int engineGetOutputSize(int arg0) {
        return -1;
    }

    @Override
    public int engineUpdate(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException {
        throw new IllegalStateException(sprcxe.cfr_renamed_9("}\u0012G]@\bC\r\\\u000fG\u0018W]Z\u0013\u0013\u001c\u0013\nA\u001cC\rZ\u0013T]^\u0012W\u0018"));
    }

    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameterSpec arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int n;
        if (arg2 == null) {
            n = arg0;
            sprcif sprcif2 = this;
            sprcif2.cfr_renamed_3 = new sprsbi(sprjod.cfr_renamed_9("1\u0016#~;\u0004 "));
        } else {
            if (!(arg2 instanceof sprsbi)) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, this.cfr_renamed_1).append(sprcxe.cfr_renamed_9("]P\u001c]]\\\u0013_\u0004\u0013\u001cP\u001eV\rG]x)`-R\u000fR\u0010V\tV\u000f`\rV\u001e")).toString());
            }
            this.cfr_renamed_3 = (sprsbi)arg2;
            n = arg0;
        }
        if (n == 3) {
            if (arg1 instanceof sprzsf) {
                this.cfr_renamed_2 = (sprzsf)arg1;
                this.cfr_renamed_0 = new sprzvf(sprybl.cfr_renamed_5688(arg3));
                return;
            }
            throw new InvalidKeyException(new StringBuilder().insert(0, sprjod.cfr_renamed_9("?=\u001c*P2P")).append(this.cfr_renamed_1).append(sprcxe.cfr_renamed_9("\u0013\rF\u001f_\u0014P]X\u0018J]P\u001c]]Q\u0018\u0013\b@\u0018W]U\u0012A]D\u000fR\rC\u0014]\u001a")).toString());
        }
        if (arg0 == 4) {
            if (arg1 instanceof sprbpf) {
                this.cfr_renamed_91 = (sprbpf)arg1;
                return;
            }
            throw new InvalidKeyException(new StringBuilder().insert(0, sprjod.cfr_renamed_9("?=\u001c*P2P")).append(this.cfr_renamed_1).append(sprcxe.cfr_renamed_9("]C\u000fZ\u000bR\tV]X\u0018J]P\u001c]]Q\u0018\u0013\b@\u0018W]U\u0012A]F\u0013D\u000fR\rC\u0014]\u001a")).toString());
        }
        throw new InvalidParameterException(sprjod.cfr_renamed_9("3:\u0000;\u0015!P<\u001e?\ts\u00062\u001c:\u0014s\u0016<\u0002s\u0007!\u0011#\u0000:\u001e4_&\u001e$\u00022\u0000#\u0019=\u0017"));
    }
}

