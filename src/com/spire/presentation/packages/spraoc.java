/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprab;
import com.spire.presentation.packages.sprdld;
import com.spire.presentation.packages.sprejd;
import com.spire.presentation.packages.sprfld;
import com.spire.presentation.packages.sprhfd;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprjb;
import com.spire.presentation.packages.sprjkc;
import com.spire.presentation.packages.sprlqc;
import com.spire.presentation.packages.sprmdd;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprob;
import com.spire.presentation.packages.sprolc;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprpmb;
import com.spire.presentation.packages.sprpwz;
import com.spire.presentation.packages.sprqid;
import com.spire.presentation.packages.sprqvc;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprvb;
import com.spire.presentation.packages.sprwsia;
import com.spire.presentation.packages.sprxcd;
import com.spire.presentation.packages.sprywa;
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
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;

public class spraoc
extends CipherSpi {
    private ByteArrayOutputStream cfr_renamed_86;
    private sprhgb cfr_renamed_152;
    private sprhgb cfr_renamed_112;
    private AlgorithmParameters cfr_renamed_119;
    private sprhfd cfr_renamed_91;
    private sprpmb cfr_renamed_0;
    private boolean cfr_renamed_1;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

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
    public void engineInit(int arg0, Key arg1, SecureRandom arg2) throws InvalidKeyException {
        try {
            this.engineInit(arg0, arg1, (AlgorithmParameterSpec)null, arg2);
            return;
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new IllegalArgumentException(sprpwz.cfr_renamed_9(">\u00023D)C5\u00023\u00071\u0006}\u0010(\u0013-\u000f4\u00069C-\u0002/\u00020\u0006)\u0006/C.\u00138\u0000"));
        }
    }

    @Override
    public int engineDoFinal(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        byte[] byArray = this.engineDoFinal(arg0, arg1, arg2);
        System.arraycopy(byArray, 0, arg3, arg4, byArray.length);
        return byArray.length;
    }

    @Override
    public void engineSetMode(String arg0) throws NoSuchAlgorithmException {
        String string = sprywa.cfr_renamed_116(arg0);
        if (string.equals(sprwsia.cfr_renamed_9("\\\t\\\u0003"))) {
            this.cfr_renamed_1 = false;
            return;
        }
        if (string.equals(sprpwz.cfr_renamed_9("'\u0015\"\u00180"))) {
            this.cfr_renamed_1 = true;
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprwsia.cfr_renamed_9("%s(5225g6b)`22+}\"wf")).append(arg0).toString());
    }

    @Override
    public void engineSetPadding(String arg0) throws NoSuchPaddingException {
        String string = sprywa.cfr_renamed_116(arg0);
        if (string.equals(sprpwz.cfr_renamed_9("-\u00123\u001c'\u0019*\u0013$"))) {
            return;
        }
        if (!string.equals(sprwsia.cfr_renamed_9("B\rQ\u0015'\u0016S\u0002V\u000f\\\u0001"))) {
            if (string.equals(sprpwz.cfr_renamed_9("\r(\u001e0j3\u001c'\u0019*\u0013$"))) {
                return;
            }
            throw new NoSuchPaddingException(sprwsia.cfr_renamed_9("b'v\"{(uf|)ffs0s/~'p*wfe/f.2\u000fW\u0015Q/b.w4"));
        }
    }

    @Override
    public int engineGetBlockSize() {
        if (this.cfr_renamed_91.cfr_renamed_2471() != null) {
            return this.cfr_renamed_91.cfr_renamed_2471().cfr_renamed_1195();
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void engineInit(int n, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException, InvalidKeyException {
        void arg3;
        spraoc spraoc2;
        void arg1;
        void arg0;
        spraoc spraoc3;
        this.cfr_renamed_152 = null;
        if (algorithmParameterSpec == null) {
            spraoc spraoc4 = this;
            spraoc3 = spraoc4;
            spraoc4.cfr_renamed_0 = sprlqc.cfr_renamed_2470(spraoc4.cfr_renamed_91);
        } else {
            void arg2;
            if (!(arg2 instanceof sprpmb)) throw new InvalidAlgorithmParameterException(sprpwz.cfr_renamed_9("\u000e(\u0010)C?\u0006}\u0013<\u0010.\u00069C\u0014&\u000eC-\u0002/\u00020\u0006)\u0006/\u0010"));
            this.cfr_renamed_0 = (sprpmb)arg2;
            spraoc3 = this;
        }
        byte[] byArray = spraoc3.cfr_renamed_0.cfr_renamed_596();
        if (byArray != null) {
            if (this.cfr_renamed_3 == 0) {
                throw new InvalidAlgorithmParameterException(sprwsia.cfr_renamed_9("\\\t\\\u0005Wfb4w5w(ff{(2\u000fW\u00152\u0016s4s+w2w4afe.w(2(}(wf`#c3{4w\""));
            }
            if (byArray.length != this.cfr_renamed_3) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprpwz.cfr_renamed_9("\u0013,\u0013 \u0018C4\r}*\u00180}3<\u0011<\u000e8\u00178\u0011.C3\u00068\u0007.C)\f}\u00018C")).append(this.cfr_renamed_3).append(sprwsia.cfr_renamed_9("fp?f#af~)|!")).toString());
            }
        }
        if (arg0 == true || arg0 == 3) {
            if (arg1 instanceof sprvb) {
                this.cfr_renamed_112 = sprjkc.cfr_renamed_1216((PublicKey)arg1);
                spraoc2 = this;
            } else {
                if (!(arg1 instanceof sprob)) throw new InvalidKeyException(sprpwz.cfr_renamed_9("\u000e(\u0010)C?\u0006}\u0013<\u0010.\u00069C/\u0006>\n-\n8\r)D.C-\u0016?\u000f4\u0000}&\u001eC6\u0006$C;\f/C8\r>\u0011$\u0013)\n2\r"));
                sprob sprob2 = (sprob)arg1;
                spraoc2 = this;
                this.cfr_renamed_112 = sprjkc.cfr_renamed_1216(sprob2.cfr_renamed_1224());
                this.cfr_renamed_152 = sprjkc.cfr_renamed_1220(sprob2.cfr_renamed_1225());
            }
        } else {
            if (arg0 != 2 && arg0 != 4) throw new InvalidKeyException(sprpwz.cfr_renamed_9("\u000e(\u0010)C?\u0006}\u0013<\u0010.\u00069C\u0018 }\b8\u001a"));
            if (arg1 instanceof sprab) {
                this.cfr_renamed_112 = sprjkc.cfr_renamed_1220((PrivateKey)arg1);
                spraoc2 = this;
            } else {
                if (!(arg1 instanceof sprob)) throw new InvalidKeyException(sprwsia.cfr_renamed_9("\u007f3a22$wfb'a5w\"24w%{6{#|25526`/d'f#2\u0003Qfy#kft)`fv#q4k6f/}("));
                sprob sprob3 = (sprob)arg1;
                spraoc2 = this;
                this.cfr_renamed_152 = sprjkc.cfr_renamed_1216(sprob3.cfr_renamed_1224());
                this.cfr_renamed_112 = sprjkc.cfr_renamed_1220(sprob3.cfr_renamed_1225());
            }
        }
        spraoc2.cfr_renamed_4 = arg3;
        this.cfr_renamed_2 = arg0;
        this.cfr_renamed_86.reset();
    }

    @Override
    public int engineGetKeySize(Key arg0) {
        if (arg0 instanceof sprjb) {
            return ((sprjb)((Object)arg0)).cfr_renamed_284().cfr_renamed_1769().cfr_renamed_1938();
        }
        throw new IllegalArgumentException(sprwsia.cfr_renamed_9("(}22'|fW\u00052-w?"));
    }

    @Override
    public int engineGetOutputSize(int arg0) {
        spraoc spraoc2;
        int n;
        spraoc spraoc3 = this;
        int n2 = spraoc3.cfr_renamed_91.cfr_renamed_1472().cfr_renamed_2404();
        if (spraoc3.cfr_renamed_112 == null) {
            throw new IllegalStateException(sprpwz.cfr_renamed_9(">\n-\u000b8\u0011}\r2\u0017}\n3\n)\n<\u000f4\u00108\u0007"));
        }
        int n3 = 1 + 2 * (((sprjb)((Object)this.cfr_renamed_112)).cfr_renamed_284().cfr_renamed_1769().cfr_renamed_1938() + 7) / 8;
        if (this.cfr_renamed_91.cfr_renamed_2471() == null) {
            n = arg0;
            spraoc2 = this;
        } else if (this.cfr_renamed_2 == 1 || this.cfr_renamed_2 == 3) {
            spraoc spraoc4 = this;
            spraoc2 = spraoc4;
            n = spraoc4.cfr_renamed_91.cfr_renamed_2471().cfr_renamed_1202(arg0);
        } else if (this.cfr_renamed_2 == 2 || this.cfr_renamed_2 == 4) {
            spraoc spraoc5 = this;
            spraoc2 = spraoc5;
            n = spraoc5.cfr_renamed_91.cfr_renamed_2471().cfr_renamed_1202(arg0 - n2 - n3);
        } else {
            throw new IllegalStateException(sprwsia.cfr_renamed_9("q/b.w42(}22/|/f/s*{5w\""));
        }
        if (spraoc2.cfr_renamed_2 == 1 || this.cfr_renamed_2 == 3) {
            return this.cfr_renamed_86.size() + n2 + n3 + n;
        }
        if (this.cfr_renamed_2 == 2 || this.cfr_renamed_2 == 4) {
            return this.cfr_renamed_86.size() - n2 - n3 + n;
        }
        throw new IllegalStateException(sprpwz.cfr_renamed_9(">\n-\u000b8\u0011}\r2\u0017}\n3\n)\n<\u000f4\u00108\u0007"));
    }

    /*
     * WARNING - void declaration
     */
    public spraoc(sprhfd sprhfd2) {
        void arg0;
        spraoc spraoc2 = this;
        spraoc spraoc3 = this;
        spraoc spraoc4 = this;
        this.cfr_renamed_2 = -1;
        spraoc spraoc5 = this;
        this.cfr_renamed_86 = new ByteArrayOutputStream();
        spraoc4.cfr_renamed_119 = null;
        spraoc4.cfr_renamed_0 = null;
        spraoc3.cfr_renamed_1 = false;
        spraoc3.cfr_renamed_152 = null;
        spraoc2.cfr_renamed_91 = arg0;
        spraoc2.cfr_renamed_3 = 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineDoFinal(byte[] arg0, int arg1, int arg2) throws IllegalBlockSizeException, BadPaddingException {
        sprqid sprqid2;
        sprt sprt2;
        byte[] byArray;
        block15: {
            sprmdd sprmdd2;
            block14: {
                if (arg2 != 0) {
                    this.cfr_renamed_86.write(arg0, arg1, arg2);
                }
                spraoc spraoc2 = this;
                byArray = spraoc2.cfr_renamed_86.toByteArray();
                spraoc2.cfr_renamed_86.reset();
                sprt2 = new sprxcd(this.cfr_renamed_0.cfr_renamed_2097(), this.cfr_renamed_0.cfr_renamed_2099(), this.cfr_renamed_0.cfr_renamed_2100(), this.cfr_renamed_0.cfr_renamed_2098());
                if (spraoc2.cfr_renamed_0.cfr_renamed_596() != null) {
                    sprt2 = new sprnjd(sprt2, this.cfr_renamed_0.cfr_renamed_596());
                }
                sprqid2 = ((sprfld)this.cfr_renamed_112).cfr_renamed_284();
                if (this.cfr_renamed_152 != null) {
                    try {
                        spraoc spraoc3;
                        if (this.cfr_renamed_2 != 1 && this.cfr_renamed_2 != 3) {
                            spraoc spraoc4 = this;
                            spraoc3 = spraoc4;
                            spraoc spraoc5 = this;
                            spraoc4.cfr_renamed_91.cfr_renamed_2489(false, spraoc5.cfr_renamed_112, spraoc5.cfr_renamed_152, sprt2);
                            return spraoc3.cfr_renamed_91.cfr_renamed_1337(byArray, 0, byArray.length);
                        }
                        spraoc spraoc6 = this;
                        spraoc3 = spraoc6;
                        spraoc spraoc7 = this;
                        spraoc6.cfr_renamed_91.cfr_renamed_2489(true, spraoc7.cfr_renamed_152, spraoc7.cfr_renamed_112, sprt2);
                        return spraoc3.cfr_renamed_91.cfr_renamed_1337(byArray, 0, byArray.length);
                    }
                    catch (Exception exception) {
                        throw new BadPaddingException(exception.getMessage());
                    }
                }
                if (this.cfr_renamed_2 == 1) break block14;
                if (this.cfr_renamed_2 != 3) break block15;
            }
            (sprmdd2 = new sprmdd()).cfr_renamed_1222(new sprdld(sprqid2, this.cfr_renamed_4));
            sprejd sprejd2 = new sprejd(sprmdd2, new sprolc(this));
            try {
                spraoc spraoc8 = this;
                spraoc8.cfr_renamed_91.cfr_renamed_2502(spraoc8.cfr_renamed_112, sprt2, sprejd2);
                return spraoc8.cfr_renamed_91.cfr_renamed_1337(byArray, 0, byArray.length);
            }
            catch (Exception exception) {
                throw new BadPaddingException(exception.getMessage());
            }
        }
        if (this.cfr_renamed_2 != 2) {
            if (this.cfr_renamed_2 != 4) throw new IllegalStateException(sprwsia.cfr_renamed_9("q/b.w42(}22/|/f/s*{5w\""));
        }
        try {
            spraoc spraoc9 = this;
            spraoc9.cfr_renamed_91.cfr_renamed_2503(spraoc9.cfr_renamed_112, sprt2, new sprqvc(sprqid2));
            return spraoc9.cfr_renamed_91.cfr_renamed_1337(byArray, 0, byArray.length);
        }
        catch (sprpjd sprpjd2) {
            throw new BadPaddingException(sprpjd2.getMessage());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameters arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        spraoc spraoc2;
        sprpmb sprpmb2 = null;
        if (arg2 != null) {
            try {
                sprpmb2 = arg2.getParameterSpec(sprpmb.class);
                spraoc2 = this;
            }
            catch (Exception exception) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprpwz.cfr_renamed_9("\u0000<\r3\f)C/\u0006>\f:\r4\u00108C-\u0002/\u00020\u0006)\u0006/\u0010gC")).append(exception.toString()).toString());
            }
        } else {
            spraoc2 = this;
        }
        spraoc2.cfr_renamed_119 = arg2;
        this.engineInit(arg0, arg1, sprpmb2, arg3);
    }

    /*
     * WARNING - void declaration
     */
    public spraoc(sprhfd sprhfd2, int n) {
        void arg0;
        spraoc spraoc2 = this;
        spraoc spraoc3 = this;
        spraoc spraoc4 = this;
        this.cfr_renamed_2 = -1;
        spraoc spraoc5 = this;
        this.cfr_renamed_86 = new ByteArrayOutputStream();
        spraoc4.cfr_renamed_119 = null;
        spraoc4.cfr_renamed_0 = null;
        spraoc3.cfr_renamed_1 = false;
        spraoc3.cfr_renamed_152 = null;
        spraoc2.cfr_renamed_91 = arg0;
        spraoc2.cfr_renamed_3 = n;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGetParameters() {
        spraoc spraoc2;
        if (this.cfr_renamed_119 == null && this.cfr_renamed_0 != null) {
            try {
                this.cfr_renamed_119 = AlgorithmParameters.getInstance(sprwsia.cfr_renamed_9("\u000fW\u0015"), "BC");
                this.cfr_renamed_119.init(this.cfr_renamed_0);
                spraoc2 = this;
                return spraoc2.cfr_renamed_119;
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        spraoc2 = this;
        return spraoc2.cfr_renamed_119;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public byte[] engineUpdate(byte[] byArray, int n, int n2) {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_86.write((byte[])arg0, (int)arg1, (int)arg2);
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
        this.cfr_renamed_86.write((byte[])arg0, (int)arg1, (int)arg2);
        return 0;
    }
}

