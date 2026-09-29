/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprazh;
import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprdbd;
import com.spire.presentation.packages.sprdbk;
import com.spire.presentation.packages.sprdki;
import com.spire.presentation.packages.sprevc;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprntk;
import com.spire.presentation.packages.sprqpj;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprydk;
import com.spire.presentation.packages.spryye;
import com.spire.presentation.packages.sprzg;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;

public class sprfuj
extends CipherSpi {
    private sprydk cfr_renamed_91;
    private spryye cfr_renamed_0;
    private SecureRandom cfr_renamed_1;
    private sprntk cfr_renamed_2;
    private int cfr_renamed_3;
    private final sprrr cfr_renamed_4;

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
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprdbd.cfr_renamed_9("KMFBGX\bDIBL@M\f[YX\\DEMH\b\\I^IAMXM^\b_XIK\u0016\b")).append(invalidAlgorithmParameterException.getMessage()).toString());
        }
    }

    @Override
    public int engineDoFinal(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        byte[] byArray = this.engineDoFinal(arg0, arg1, arg2);
        System.arraycopy(byArray, 0, arg3, arg4, byArray.length);
        return byArray.length;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public byte[] engineUpdate(byte[] byArray, int n, int n2) {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_91.write((byte[])arg0, (int)arg1, (int)arg2);
        return null;
    }

    @Override
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    public sprfuj(sprntk sprntk2) {
        sprfuj sprfuj2 = this;
        sprfuj sprfuj3 = this;
        sprfuj3.cfr_renamed_4 = new sprdki();
        sprfuj2.cfr_renamed_3 = -1;
        sprfuj2.cfr_renamed_91 = new sprydk();
        sprfuj2.cfr_renamed_2 = sprntk2;
    }

    @Override
    public int engineGetOutputSize(int arg0) {
        if (this.cfr_renamed_3 == 1 || this.cfr_renamed_3 == 3) {
            return this.cfr_renamed_2.cfr_renamed_1202(arg0);
        }
        if (this.cfr_renamed_3 == 2 || this.cfr_renamed_3 == 4) {
            return this.cfr_renamed_2.cfr_renamed_1202(arg0);
        }
        throw new IllegalStateException(sprevc.cfr_renamed_9("k\u0003x\u0002m\u0018(\u0004g\u001e(\u0003f\u0003|\u0003i\u0006a\u0019m\u000e"));
    }

    @Override
    public int engineGetKeySize(Key arg0) {
        if (arg0 instanceof sprzg) {
            return ((sprzg)((Object)arg0)).cfr_renamed_284().cfr_renamed_1769().cfr_renamed_1938();
        }
        throw new IllegalArgumentException(sprdbd.cfr_renamed_9("FC\\\fIB\bik\fCIQ"));
    }

    @Override
    public void engineSetMode(String arg0) throws NoSuchAlgorithmException {
        if (!sprkoe.cfr_renamed_116(arg0).equals(sprevc.cfr_renamed_9("F%F/"))) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprdbd.cfr_renamed_9("KMF\u000b\\\f[YX\\G^\\\fECLI\b")).append(arg0).toString());
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int engineUpdate(byte[] byArray, int n, int n2, byte[] byArray2, int n3) {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_91.write((byte[])arg0, (int)arg1, (int)arg2);
        return 0;
    }

    @Override
    public int engineGetBlockSize() {
        return 0;
    }

    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameters arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpec = null;
        if (arg2 != null) {
            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprevc.cfr_renamed_9("\ti\u0004f\u0005|Jz\u000fk\u0005o\u0004a\u0019mJx\u000bz\u000be\u000f|\u000fz\u00192J")).append(arg2.getClass().getName()).toString());
        }
        this.engineInit(arg0, arg1, algorithmParameterSpec, arg3);
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
    public byte[] engineDoFinal(byte[] arg0, int arg1, int arg2) throws IllegalBlockSizeException, BadPaddingException {
        block11: {
            if (arg2 != 0) {
                this.cfr_renamed_91.write(arg0, arg1, arg2);
            }
            if (this.cfr_renamed_3 == 1 || this.cfr_renamed_3 == 3) {
                try {
                    sprfuj sprfuj2 = this;
                    sprfuj sprfuj3 = this;
                    sprfuj2.cfr_renamed_2.cfr_renamed_5535(true, new sprbgk(sprfuj3.cfr_renamed_0, sprfuj3.cfr_renamed_1));
                    byte[] byArray = sprfuj2.cfr_renamed_2.cfr_renamed_1337(this.cfr_renamed_91.cfr_renamed_9247(), 0, this.cfr_renamed_91.size());
                    return byArray;
                }
                catch (Exception exception) {
                    throw new sprazh(sprdbd.cfr_renamed_9("]BINDI\bXG\fX^GOM_[\fJ@GOC"), exception);
                }
            }
            if (this.cfr_renamed_3 == 2) break block11;
            if (this.cfr_renamed_3 != 4) throw new IllegalStateException(sprdbd.cfr_renamed_9("OA\\@IZ\fFC\\\fABAXAMDE[IL"));
        }
        try {
            sprfuj sprfuj4 = this;
            sprfuj4.cfr_renamed_2.cfr_renamed_5535(false, this.cfr_renamed_0);
            return sprfuj4.cfr_renamed_2.cfr_renamed_1337(this.cfr_renamed_91.cfr_renamed_9247(), 0, this.cfr_renamed_91.size());
        }
        catch (Exception exception) {
            throw new sprazh(sprevc.cfr_renamed_9("\u001ff\u000bj\u0006mJ|\u0005(\u001az\u0005k\u000f{\u0019(\bd\u0005k\u0001"), exception);
        }
        finally {
            this.cfr_renamed_91.cfr_renamed_9248();
        }
    }

    @Override
    public void engineSetPadding(String arg0) throws NoSuchPaddingException {
        if (!sprkoe.cfr_renamed_116(arg0).equals(sprevc.cfr_renamed_9("$G:I.L#F-"))) {
            throw new NoSuchPaddingException(sprdbd.cfr_renamed_9("\\IHLEFK\bBGX\bM^MA@INDI\b[AX@\fai{oA\\@IZ"));
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameterSpec arg2, SecureRandom arg3) throws InvalidAlgorithmParameterException, InvalidKeyException {
        sprfuj sprfuj2;
        SecureRandom secureRandom;
        if (arg0 == 1 || arg0 == 3) {
            if (!(arg1 instanceof PublicKey)) throw new InvalidKeyException(sprevc.cfr_renamed_9("\u0007}\u0019|Jj\u000f(\u001ai\u0019{\u000flJx\u001fj\u0006a\t(/KJc\u000fqJn\u0005zJm\u0004k\u0018q\u001a|\u0003g\u0004"));
            this.cfr_renamed_0 = sprdbk.cfr_renamed_1216((PublicKey)arg1);
            secureRandom = arg3;
        } else {
            if (arg0 != 2 && arg0 != 4) throw new InvalidKeyException(sprevc.cfr_renamed_9("\u0007}\u0019|Jj\u000f(\u001ai\u0019{\u000flJM)(\u0001m\u0013"));
            if (!(arg1 instanceof PrivateKey)) throw new InvalidKeyException(sprdbd.cfr_renamed_9("A]_\\\fJI\b\\I_[IL\fX^AZIXM\fmo\bGMU\bJG^\bHMOZUXXACF"));
            this.cfr_renamed_0 = sprqpj.cfr_renamed_1220((PrivateKey)arg1);
            secureRandom = arg3;
        }
        if (secureRandom != null) {
            sprfuj2 = this;
            this.cfr_renamed_1 = arg3;
        } else {
            sprfuj2 = this;
            this.cfr_renamed_1 = sprybl.cfr_renamed_2794();
        }
        sprfuj2.cfr_renamed_3 = arg0;
        this.cfr_renamed_91.reset();
    }
}

