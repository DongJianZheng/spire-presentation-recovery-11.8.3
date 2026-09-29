/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprazh;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprcqj;
import com.spire.presentation.packages.sprcsh;
import com.spire.presentation.packages.sprctk;
import com.spire.presentation.packages.sprdki;
import com.spire.presentation.packages.sprfyj;
import com.spire.presentation.packages.sprjrj;
import com.spire.presentation.packages.sprkgs;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprnn;
import com.spire.presentation.packages.sprpqk;
import com.spire.presentation.packages.sprpyk;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprrrk;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprumn;
import com.spire.presentation.packages.sprvsk;
import com.spire.presentation.packages.sprwpk;
import com.spire.presentation.packages.sprwsk;
import com.spire.presentation.packages.spryye;
import com.spire.presentation.packages.sprztk;
import java.io.ByteArrayOutputStream;
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
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.DHKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;

public class sprqdk
extends sprcqj {
    private AlgorithmParameters cfr_renamed_93;
    private final sprrr cfr_renamed_86;
    private int cfr_renamed_152;
    private ByteArrayOutputStream cfr_renamed_112;
    private final int cfr_renamed_119;
    private spryye cfr_renamed_91;
    private SecureRandom cfr_renamed_0;
    private sprvsk cfr_renamed_1;
    private sprcsh cfr_renamed_2;
    private boolean cfr_renamed_3;
    private spryye cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineDoFinal(byte[] arg0, int arg1, int arg2) throws IllegalBlockSizeException, BadPaddingException {
        sprbj sprbj2;
        byte[] byArray;
        block15: {
            sprrrk sprrrk2;
            sprwsk sprwsk2;
            block14: {
                if (arg2 != 0) {
                    this.cfr_renamed_112.write(arg0, arg1, arg2);
                }
                sprqdk sprqdk2 = this;
                byArray = sprqdk2.cfr_renamed_112.toByteArray();
                sprqdk2.cfr_renamed_112.reset();
                sprbj2 = new sprctk(this.cfr_renamed_2.cfr_renamed_2097(), this.cfr_renamed_2.cfr_renamed_2099(), this.cfr_renamed_2.cfr_renamed_2100(), this.cfr_renamed_2.cfr_renamed_2098());
                if (sprqdk2.cfr_renamed_2.cfr_renamed_596() != null) {
                    sprbj2 = new sprkpk(sprbj2, this.cfr_renamed_2.cfr_renamed_596());
                }
                sprwsk2 = ((sprztk)this.cfr_renamed_4).cfr_renamed_284();
                if (this.cfr_renamed_91 != null) {
                    try {
                        sprqdk sprqdk3;
                        if (this.cfr_renamed_152 != 1 && this.cfr_renamed_152 != 3) {
                            sprqdk sprqdk4 = this;
                            sprqdk3 = sprqdk4;
                            sprqdk sprqdk5 = this;
                            sprqdk4.cfr_renamed_1.cfr_renamed_9427(false, sprqdk5.cfr_renamed_4, sprqdk5.cfr_renamed_91, sprbj2);
                            return sprqdk3.cfr_renamed_1.cfr_renamed_1337(byArray, 0, byArray.length);
                        }
                        sprqdk sprqdk6 = this;
                        sprqdk3 = sprqdk6;
                        sprqdk sprqdk7 = this;
                        sprqdk6.cfr_renamed_1.cfr_renamed_9427(true, sprqdk7.cfr_renamed_91, sprqdk7.cfr_renamed_4, sprbj2);
                        return sprqdk3.cfr_renamed_1.cfr_renamed_1337(byArray, 0, byArray.length);
                    }
                    catch (Exception exception) {
                        throw new sprazh(sprumn.cfr_renamed_9("rmfakf'wh#wqh`bpt#eoh`l"), exception);
                    }
                }
                if (this.cfr_renamed_152 == 1) break block14;
                if (this.cfr_renamed_152 != 3) break block15;
            }
            (sprrrk2 = new sprrrk()).cfr_renamed_5536(new sprpqk(this.cfr_renamed_0, sprwsk2));
            sprpyk sprpyk2 = new sprpyk(sprrrk2, new sprfyj(this));
            try {
                sprqdk sprqdk8 = this;
                sprqdk8.cfr_renamed_1.cfr_renamed_9428(sprqdk8.cfr_renamed_4, sprbj2, sprpyk2);
                return sprqdk8.cfr_renamed_1.cfr_renamed_1337(byArray, 0, byArray.length);
            }
            catch (Exception exception) {
                throw new sprazh(sprkgs.cfr_renamed_9("`dthyo5~z*exzipyf*wfzi~"), exception);
            }
        }
        if (this.cfr_renamed_152 != 2) {
            if (this.cfr_renamed_152 != 4) throw new IllegalStateException(sprkgs.cfr_renamed_9("\\OFI|z}og*{ea*|d|~|kycfoq"));
        }
        try {
            sprqdk sprqdk9 = this;
            sprqdk9.cfr_renamed_1.cfr_renamed_9429(sprqdk9.cfr_renamed_4, sprbj2, new sprwpk(((sprztk)this.cfr_renamed_4).cfr_renamed_284()));
            return this.cfr_renamed_1.cfr_renamed_1337(byArray, 0, byArray.length);
        }
        catch (sprull sprull2) {
            throw new sprazh(sprumn.cfr_renamed_9("rmfakf'wh#wqh`bpt#eoh`l"), sprull2);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public byte[] engineUpdate(byte[] byArray, int n, int n2) {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_112.write((byte[])arg0, (int)arg1, (int)arg2);
        return null;
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
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprumn.cfr_renamed_9("dbimhw'kfmcob#tvwskjbg'sfqfnbwbq'pwfd9'")).append(invalidAlgorithmParameterException.getMessage()).toString());
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprqdk(sprvsk sprvsk2) {
        void arg0;
        sprqdk sprqdk2 = this;
        sprqdk sprqdk3 = this;
        sprqdk sprqdk4 = this;
        sprqdk sprqdk5 = this;
        sprqdk sprqdk6 = this;
        sprqdk5.cfr_renamed_86 = new sprdki();
        sprqdk5.cfr_renamed_152 = -1;
        sprqdk5.cfr_renamed_112 = new ByteArrayOutputStream();
        sprqdk4.cfr_renamed_93 = null;
        sprqdk4.cfr_renamed_2 = null;
        sprqdk3.cfr_renamed_3 = false;
        sprqdk3.cfr_renamed_91 = null;
        sprqdk2.cfr_renamed_1 = arg0;
        sprqdk2.cfr_renamed_119 = 0;
    }

    @Override
    public int engineGetBlockSize() {
        if (this.cfr_renamed_1.cfr_renamed_2471() != null) {
            return this.cfr_renamed_1.cfr_renamed_2471().cfr_renamed_1195();
        }
        return 0;
    }

    @Override
    public byte[] engineGetIV() {
        if (this.cfr_renamed_2 != null) {
            return this.cfr_renamed_2.cfr_renamed_596();
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int engineUpdate(byte[] byArray, int n, int n2, byte[] byArray2, int n3) {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_112.write((byte[])arg0, (int)arg1, (int)arg2);
        return 0;
    }

    @Override
    public int engineGetKeySize(Key arg0) {
        if (arg0 instanceof DHKey) {
            return ((DHKey)((Object)arg0)).getParams().getP().bitLength();
        }
        throw new IllegalArgumentException(sprkgs.cfr_renamed_9("dz~5k5N]*~ol"));
    }

    @Override
    public void engineSetMode(String arg0) throws NoSuchAlgorithmException {
        String string = sprkoe.cfr_renamed_116(arg0);
        if (string.equals(sprumn.cfr_renamed_9("MHMB"))) {
            this.cfr_renamed_3 = false;
            return;
        }
        if (string.equals(sprkgs.cfr_renamed_9("QBTOF"))) {
            this.cfr_renamed_3 = true;
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprumn.cfr_renamed_9("dbi$s#tvwshqs#jlcf'")).append(arg0).toString());
    }

    @Override
    public void engineSetPadding(String arg0) throws NoSuchPaddingException {
        String string = sprkoe.cfr_renamed_116(arg0);
        if (string.equals(sprkgs.cfr_renamed_9("[EEKQN\\DR"))) {
            return;
        }
        if (!string.equals(sprumn.cfr_renamed_9("SL@T6WBCGNM@"))) {
            if (string.equals(sprkgs.cfr_renamed_9("Z^IF=EKQN\\DR"))) {
                return;
            }
            throw new NoSuchPaddingException(sprumn.cfr_renamed_9("sfgcjid'mhw'bqbnofakf'tnwo#NFT@nsofu"));
        }
    }

    @Override
    public int engineDoFinal(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        byte[] byArray = this.engineDoFinal(arg0, arg1, arg2);
        System.arraycopy(byArray, 0, arg3, arg4, byArray.length);
        return byArray.length;
    }

    @Override
    public int engineGetOutputSize(int arg0) {
        sprqdk sprqdk2;
        int n;
        sprqdk sprqdk3;
        int n2;
        if (this.cfr_renamed_4 == null) {
            throw new IllegalStateException(sprkgs.cfr_renamed_9("i|z}og*{ea*|d|~|kycfoq"));
        }
        sprqdk sprqdk4 = this;
        int n3 = sprqdk4.cfr_renamed_1.cfr_renamed_1472().cfr_renamed_2404();
        if (sprqdk4.cfr_renamed_91 == null) {
            n2 = 1 + 2 * (((sprztk)this.cfr_renamed_4).cfr_renamed_284().cfr_renamed_1155().bitLength() + 7) / 8;
            sprqdk3 = this;
        } else {
            n2 = 0;
            sprqdk3 = this;
        }
        if (sprqdk3.cfr_renamed_1.cfr_renamed_2471() == null) {
            n = arg0;
            sprqdk2 = this;
        } else if (this.cfr_renamed_152 == 1 || this.cfr_renamed_152 == 3) {
            sprqdk sprqdk5 = this;
            sprqdk2 = sprqdk5;
            n = sprqdk5.cfr_renamed_1.cfr_renamed_2471().cfr_renamed_1202(arg0);
        } else if (this.cfr_renamed_152 == 2 || this.cfr_renamed_152 == 4) {
            sprqdk sprqdk6 = this;
            sprqdk2 = sprqdk6;
            n = sprqdk6.cfr_renamed_1.cfr_renamed_2471().cfr_renamed_1202(arg0 - n3 - n2);
        } else {
            throw new IllegalStateException(sprumn.cfr_renamed_9("`nsofu#ils#nmnwnbkjtfc"));
        }
        if (sprqdk2.cfr_renamed_152 == 1 || this.cfr_renamed_152 == 3) {
            return this.cfr_renamed_112.size() + n3 + n2 + n;
        }
        if (this.cfr_renamed_152 == 2 || this.cfr_renamed_152 == 4) {
            return this.cfr_renamed_112.size() - n3 - n2 + n;
        }
        throw new IllegalStateException(sprkgs.cfr_renamed_9("\\OFI|z}og*{ea*|d|~|kycfoq"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGetParameters() {
        sprqdk sprqdk2;
        if (this.cfr_renamed_93 == null && this.cfr_renamed_2 != null) {
            try {
                sprqdk sprqdk3 = this;
                sprqdk3.cfr_renamed_93 = sprqdk3.cfr_renamed_86.cfr_renamed_1540(sprumn.cfr_renamed_9("NFT"));
                sprqdk3.cfr_renamed_93.init(this.cfr_renamed_2);
                sprqdk2 = this;
                return sprqdk2.cfr_renamed_93;
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        sprqdk2 = this;
        return sprqdk2.cfr_renamed_93;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameterSpec arg2, SecureRandom arg3) throws InvalidAlgorithmParameterException, InvalidKeyException {
        sprqdk sprqdk2;
        if (!(arg2 instanceof sprcsh)) {
            throw new InvalidAlgorithmParameterException(sprkgs.cfr_renamed_9("x\u007ff~5hp*ekfypn5CPY5ztxtgp~pxf"));
        }
        this.cfr_renamed_2 = (sprcsh)arg2;
        byte[] byArray = this.cfr_renamed_2.cfr_renamed_596();
        if (this.cfr_renamed_119 != 0 && (byArray == null || byArray.length != this.cfr_renamed_119)) {
            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprumn.cfr_renamed_9("MHMDF'ji#NFT#Wbubjfsfup'mbfcp'wh#ef'")).append(this.cfr_renamed_119).append(sprkgs.cfr_renamed_9("5hl~py5fzdr")).toString());
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 instanceof DHPublicKey) {
                this.cfr_renamed_4 = sprjrj.cfr_renamed_1216((PublicKey)arg1);
                sprqdk2 = this;
            } else {
                if (!(arg1 instanceof sprnn)) throw new InvalidKeyException(sprumn.cfr_renamed_9("jvtw'ab#wbtpbg'qb`nsnfiw p'srakjd#CK'hbz'ehq'fi`uzwwnli"));
                sprnn sprnn2 = (sprnn)arg1;
                sprqdk2 = this;
                this.cfr_renamed_4 = sprjrj.cfr_renamed_1216(sprnn2.cfr_renamed_1224());
                this.cfr_renamed_91 = sprjrj.cfr_renamed_1220(sprnn2.cfr_renamed_1225());
            }
        } else {
            if (arg0 != 2 && arg0 != 4) throw new InvalidKeyException(sprumn.cfr_renamed_9("jvtw'ab#wbtpbg'FD#lf~"));
            if (arg1 instanceof DHPrivateKey) {
                this.cfr_renamed_4 = sprjrj.cfr_renamed_1220((PrivateKey)arg1);
                sprqdk2 = this;
            } else {
                if (!(arg1 instanceof sprnn)) throw new InvalidKeyException(sprkgs.cfr_renamed_9("g`ya*wo5ztyfoq*govcecpda-f*ex||t~p*QB5aps5lzx5npigse~|e{"));
                sprnn sprnn3 = (sprnn)arg1;
                sprqdk2 = this;
                this.cfr_renamed_91 = sprjrj.cfr_renamed_1216(sprnn3.cfr_renamed_1224());
                this.cfr_renamed_4 = sprjrj.cfr_renamed_1220(sprnn3.cfr_renamed_1225());
            }
        }
        sprqdk2.cfr_renamed_0 = arg3;
        this.cfr_renamed_152 = arg0;
        this.cfr_renamed_112.reset();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameters arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        sprqdk sprqdk2;
        sprcsh sprcsh2 = null;
        if (arg2 != null) {
            try {
                sprcsh2 = arg2.getParameterSpec(sprcsh.class);
                sprqdk2 = this;
            }
            catch (Exception exception) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprkgs.cfr_renamed_9("vk{dz~5xpizm{cfo5ztxtgp~pxf05")).append(exception.toString()).toString());
            }
        } else {
            sprqdk2 = this;
        }
        sprqdk2.cfr_renamed_93 = arg2;
        this.engineInit(arg0, arg1, sprcsh2, arg3);
    }

    /*
     * WARNING - void declaration
     */
    public sprqdk(sprvsk sprvsk2, int n) {
        void arg0;
        sprqdk sprqdk2 = this;
        sprqdk sprqdk3 = this;
        sprqdk sprqdk4 = this;
        sprqdk sprqdk5 = this;
        sprqdk sprqdk6 = this;
        sprqdk5.cfr_renamed_86 = new sprdki();
        sprqdk5.cfr_renamed_152 = -1;
        sprqdk5.cfr_renamed_112 = new ByteArrayOutputStream();
        sprqdk4.cfr_renamed_93 = null;
        sprqdk4.cfr_renamed_2 = null;
        sprqdk3.cfr_renamed_3 = false;
        sprqdk3.cfr_renamed_91 = null;
        sprqdk2.cfr_renamed_1 = arg0;
        sprqdk2.cfr_renamed_119 = n;
    }
}

