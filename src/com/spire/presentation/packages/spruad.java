/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprejd;
import com.spire.presentation.packages.sprhfd;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprjid;
import com.spire.presentation.packages.sprjuaa;
import com.spire.presentation.packages.sprkfd;
import com.spire.presentation.packages.sprlqc;
import com.spire.presentation.packages.sprlvc;
import com.spire.presentation.packages.sprnid;
import com.spire.presentation.packages.sprob;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprpmb;
import com.spire.presentation.packages.sprrzc;
import com.spire.presentation.packages.sprvzca;
import com.spire.presentation.packages.sprxcd;
import com.spire.presentation.packages.sprxnc;
import com.spire.presentation.packages.sprywa;
import com.spire.presentation.packages.sprzmd;
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
import javax.crypto.interfaces.DHKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;

public class spruad
extends CipherSpi {
    private boolean cfr_renamed_152;
    private sprhfd cfr_renamed_112;
    private sprpmb cfr_renamed_119;
    private sprhgb cfr_renamed_91;
    private int cfr_renamed_0;
    private sprhgb cfr_renamed_1;
    private ByteArrayOutputStream cfr_renamed_2;
    private AlgorithmParameters cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    @Override
    public int engineGetKeySize(Key arg0) {
        if (arg0 instanceof DHKey) {
            return ((DHKey)((Object)arg0)).getParams().getP().bitLength();
        }
        throw new IllegalArgumentException(sprjuaa.cfr_renamed_9("\u001d-\u0007b\u0012b7\nS)\u0016;"));
    }

    @Override
    public void engineSetPadding(String arg0) throws NoSuchPaddingException {
        String string = sprywa.cfr_renamed_116(arg0);
        if (string.equals(sprvzca.cfr_renamed_9("6/(!<$1.?"))) {
            return;
        }
        if (!string.equals(sprjuaa.cfr_renamed_9("#\t0\u0011F\u00122\u00067\u000b=\u0005"))) {
            if (string.equals(sprvzca.cfr_renamed_9("03#+W(!<$1.?"))) {
                return;
            }
            throw new NoSuchPaddingException(sprjuaa.cfr_renamed_9("\u0003#\u0017&\u001a,\u0014b\u001d-\u0007b\u00124\u0012+\u001f#\u0011.\u0016b\u0004+\u0007*S\u000b6\u00110+\u0003*\u00160"));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameters arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        spruad spruad2;
        sprpmb sprpmb2 = null;
        if (arg2 != null) {
            try {
                sprpmb2 = arg2.getParameterSpec(sprpmb.class);
                spruad2 = this;
            }
            catch (Exception exception) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprvzca.cfr_renamed_9("\u001b\u0001\u0016\u000e\u0017\u0014X\u0012\u001d\u0003\u0017\u0007\u0016\t\u000b\u0005X\u0010\u0019\u0012\u0019\r\u001d\u0014\u001d\u0012\u000bZX")).append(exception.toString()).toString());
            }
        } else {
            spruad2 = this;
        }
        spruad2.cfr_renamed_3 = arg2;
        this.engineInit(arg0, arg1, sprpmb2, arg3);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int engineUpdate(byte[] byArray, int n, int n2, byte[] byArray2, int n3) {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_2.write((byte[])arg0, (int)arg1, (int)arg2);
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGetParameters() {
        spruad spruad2;
        if (this.cfr_renamed_3 == null && this.cfr_renamed_119 != null) {
            try {
                this.cfr_renamed_3 = AlgorithmParameters.getInstance(sprjuaa.cfr_renamed_9("\u000b6\u0011"), "BC");
                this.cfr_renamed_3.init(this.cfr_renamed_119);
                spruad2 = this;
                return spruad2.cfr_renamed_3;
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        spruad2 = this;
        return spruad2.cfr_renamed_3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameterSpec arg2, SecureRandom arg3) throws InvalidAlgorithmParameterException, InvalidKeyException {
        spruad spruad2;
        int n;
        if (arg2 == null) {
            n = arg0;
            this.cfr_renamed_119 = sprlqc.cfr_renamed_2470(this.cfr_renamed_112);
        } else {
            if (!(arg2 instanceof sprpmb)) throw new InvalidAlgorithmParameterException(sprvzca.cfr_renamed_9("\u0015\u0015\u000b\u0014X\u0002\u001d@\b\u0001\u000b\u0013\u001d\u0004X)=3X\u0010\u0019\u0012\u0019\r\u001d\u0014\u001d\u0012\u000b"));
            this.cfr_renamed_119 = (sprpmb)arg2;
            n = arg0;
        }
        if (n == 1 || arg0 == 3) {
            if (arg1 instanceof DHPublicKey) {
                this.cfr_renamed_1 = sprxnc.cfr_renamed_1216((PublicKey)arg1);
                spruad2 = this;
            } else {
                if (!(arg1 instanceof sprob)) throw new InvalidKeyException(sprjuaa.cfr_renamed_9("/\u00061\u0007b\u0011'S2\u00121\u0000'\u0017b\u0001'\u0010+\u0003+\u0016,\u0007e\u0000b\u00037\u0011.\u001a!S\u0006;b\u0018'\nb\u0015-\u0001b\u0016,\u00100\n2\u0007+\u001c,"));
                sprob sprob2 = (sprob)arg1;
                spruad2 = this;
                this.cfr_renamed_1 = sprxnc.cfr_renamed_1216(sprob2.cfr_renamed_1224());
                this.cfr_renamed_91 = sprxnc.cfr_renamed_1220(sprob2.cfr_renamed_1225());
            }
        } else {
            if (arg0 != 2 && arg0 != 4) throw new InvalidKeyException(sprjuaa.cfr_renamed_9("/\u00061\u0007b\u0011'S2\u00121\u0000'\u0017b6\u0001S)\u0016;"));
            if (arg1 instanceof DHPrivateKey) {
                this.cfr_renamed_1 = sprxnc.cfr_renamed_1220((PrivateKey)arg1);
                spruad2 = this;
            } else {
                if (!(arg1 instanceof sprob)) throw new InvalidKeyException(sprvzca.cfr_renamed_9("\r\r\u0013\f@\u001a\u0005X\u0010\u0019\u0013\u000b\u0005\u001c@\n\u0005\u001b\t\b\t\u001d\u000e\fG\u000b@\b\u0012\u0011\u0016\u0019\u0014\u001d@<(X\u000b\u001d\u0019X\u0006\u0017\u0012X\u0004\u001d\u0003\n\u0019\b\u0014\u0011\u000f\u0016"));
                sprob sprob3 = (sprob)arg1;
                spruad2 = this;
                this.cfr_renamed_91 = sprxnc.cfr_renamed_1216(sprob3.cfr_renamed_1224());
                this.cfr_renamed_1 = sprxnc.cfr_renamed_1220(sprob3.cfr_renamed_1225());
            }
        }
        spruad2.cfr_renamed_4 = arg3;
        this.cfr_renamed_0 = arg0;
        this.cfr_renamed_2.reset();
    }

    @Override
    public int engineDoFinal(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        byte[] byArray = this.engineDoFinal(arg0, arg1, arg2);
        System.arraycopy(byArray, 0, arg3, arg4, byArray.length);
        return byArray.length;
    }

    @Override
    public int engineGetBlockSize() {
        if (this.cfr_renamed_112.cfr_renamed_2471() != null) {
            return this.cfr_renamed_112.cfr_renamed_2471().cfr_renamed_1195();
        }
        return 0;
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
            throw new IllegalArgumentException(sprvzca.cfr_renamed_9("\u0003\u0019\u000e_\u0014X\b\u0019\u000e\u001c\f\u001d@\u000b\u0015\b\u0010\u0014\t\u001d\u0004X\u0010\u0019\u0012\u0019\r\u001d\u0014\u001d\u0012X\u0013\b\u0005\u001b"));
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
        this.cfr_renamed_2.write((byte[])arg0, (int)arg1, (int)arg2);
        return null;
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
        sprxcd sprxcd2;
        byte[] byArray;
        block14: {
            sprkfd sprkfd2;
            sprzmd sprzmd2;
            block13: {
                if (arg2 != 0) {
                    this.cfr_renamed_2.write(arg0, arg1, arg2);
                }
                spruad spruad2 = this;
                byArray = spruad2.cfr_renamed_2.toByteArray();
                spruad2.cfr_renamed_2.reset();
                sprxcd2 = new sprxcd(this.cfr_renamed_119.cfr_renamed_2097(), this.cfr_renamed_119.cfr_renamed_2099(), this.cfr_renamed_119.cfr_renamed_2100(), this.cfr_renamed_119.cfr_renamed_2098());
                sprzmd2 = ((sprnid)spruad2.cfr_renamed_1).cfr_renamed_284();
                if (this.cfr_renamed_91 != null) {
                    try {
                        spruad spruad3;
                        if (this.cfr_renamed_0 != 1 && this.cfr_renamed_0 != 3) {
                            spruad spruad4 = this;
                            spruad3 = spruad4;
                            spruad spruad5 = this;
                            spruad4.cfr_renamed_112.cfr_renamed_2489(false, spruad5.cfr_renamed_1, spruad5.cfr_renamed_91, sprxcd2);
                            return spruad3.cfr_renamed_112.cfr_renamed_1337(byArray, 0, byArray.length);
                        }
                        spruad spruad6 = this;
                        spruad3 = spruad6;
                        spruad spruad7 = this;
                        spruad6.cfr_renamed_112.cfr_renamed_2489(true, spruad7.cfr_renamed_91, spruad7.cfr_renamed_1, sprxcd2);
                        return spruad3.cfr_renamed_112.cfr_renamed_1337(byArray, 0, byArray.length);
                    }
                    catch (Exception exception) {
                        throw new BadPaddingException(exception.getMessage());
                    }
                }
                if (this.cfr_renamed_0 == 1) break block13;
                if (this.cfr_renamed_0 != 3) break block14;
            }
            (sprkfd2 = new sprkfd()).cfr_renamed_1222(new sprjid(this.cfr_renamed_4, sprzmd2));
            sprejd sprejd2 = new sprejd(sprkfd2, new sprlvc(this));
            try {
                spruad spruad8 = this;
                spruad8.cfr_renamed_112.cfr_renamed_2502(spruad8.cfr_renamed_1, sprxcd2, sprejd2);
                return spruad8.cfr_renamed_112.cfr_renamed_1337(byArray, 0, byArray.length);
            }
            catch (Exception exception) {
                throw new BadPaddingException(exception.getMessage());
            }
        }
        if (this.cfr_renamed_0 != 2) {
            if (this.cfr_renamed_0 != 4) throw new IllegalStateException(sprjuaa.cfr_renamed_9("\u000b6\u00110+\u0003*\u00160S,\u001c6S+\u001d+\u0007+\u0012.\u001a1\u0016&"));
        }
        try {
            spruad spruad9 = this;
            spruad9.cfr_renamed_112.cfr_renamed_2503(spruad9.cfr_renamed_1, sprxcd2, new sprrzc(((sprnid)this.cfr_renamed_1).cfr_renamed_284()));
            return this.cfr_renamed_112.cfr_renamed_1337(byArray, 0, byArray.length);
        }
        catch (sprpjd sprpjd2) {
            throw new BadPaddingException(sprpjd2.getMessage());
        }
    }

    @Override
    public void engineSetMode(String arg0) throws NoSuchAlgorithmException {
        String string = sprywa.cfr_renamed_116(arg0);
        if (string.equals(sprvzca.cfr_renamed_9(".7.="))) {
            this.cfr_renamed_152 = false;
            return;
        }
        if (string.equals(sprjuaa.cfr_renamed_9("\u0006;\u00036\u0011"))) {
            this.cfr_renamed_152 = true;
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprvzca.cfr_renamed_9("\u001b\u0001\u0016G\f@\u000b\u0015\b\u0010\u0017\u0012\f@\u0015\u000f\u001c\u0005X")).append(arg0).toString());
    }

    @Override
    public int engineGetOutputSize(int arg0) {
        spruad spruad2;
        int n;
        spruad spruad3 = this;
        int n2 = spruad3.cfr_renamed_112.cfr_renamed_1472().cfr_renamed_2404();
        if (spruad3.cfr_renamed_1 == null) {
            throw new IllegalStateException(sprjuaa.cfr_renamed_9("\u0010+\u0003*\u00160S,\u001c6S+\u001d+\u0007+\u0012.\u001a1\u0016&"));
        }
        int n3 = ((DHKey)((Object)this.cfr_renamed_1)).getParams().getP().bitLength() / 8 + 1;
        if (this.cfr_renamed_112.cfr_renamed_2471() == null) {
            n = arg0;
            spruad2 = this;
        } else if (this.cfr_renamed_0 == 1 || this.cfr_renamed_0 == 3) {
            spruad spruad4 = this;
            spruad2 = spruad4;
            n = spruad4.cfr_renamed_112.cfr_renamed_2471().cfr_renamed_1202(arg0);
        } else if (this.cfr_renamed_0 == 2 || this.cfr_renamed_0 == 4) {
            spruad spruad5 = this;
            spruad2 = spruad5;
            n = spruad5.cfr_renamed_112.cfr_renamed_2471().cfr_renamed_1202(arg0 - n2 - n3);
        } else {
            throw new IllegalStateException(sprvzca.cfr_renamed_9("\u0003\u0011\u0010\u0010\u0005\n@\u0016\u000f\f@\u0011\u000e\u0011\u0014\u0011\u0001\u0014\t\u000b\u0005\u001c"));
        }
        if (spruad2.cfr_renamed_0 == 1 || this.cfr_renamed_0 == 3) {
            return this.cfr_renamed_2.size() + n2 + n3 + n;
        }
        if (this.cfr_renamed_0 == 2 || this.cfr_renamed_0 == 4) {
            return this.cfr_renamed_2.size() - n2 - n3 + n;
        }
        throw new IllegalStateException(sprjuaa.cfr_renamed_9("\u000b6\u00110+\u0003*\u00160S,\u001c6S+\u001d+\u0007+\u0012.\u001a1\u0016&"));
    }

    public spruad(sprhfd sprhfd2) {
        spruad spruad2 = this;
        spruad spruad3 = this;
        spruad spruad4 = this;
        spruad4.cfr_renamed_0 = -1;
        spruad spruad5 = this;
        spruad4.cfr_renamed_2 = new ByteArrayOutputStream();
        spruad4.cfr_renamed_3 = null;
        spruad3.cfr_renamed_119 = null;
        spruad3.cfr_renamed_152 = false;
        spruad2.cfr_renamed_91 = null;
        spruad2.cfr_renamed_112 = sprhfd2;
    }
}

