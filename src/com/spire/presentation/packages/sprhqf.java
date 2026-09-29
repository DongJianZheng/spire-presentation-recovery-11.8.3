/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprrzp;
import com.spire.presentation.packages.spruqd;
import com.spire.presentation.packages.sprxkf;
import com.spire.presentation.packages.sprybl;
import java.io.ByteArrayOutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;

public abstract class sprhqf
extends sprxkf {
    public int cfr_renamed_0;
    public int cfr_renamed_1;
    public AlgorithmParameterSpec cfr_renamed_3;
    public ByteArrayOutputStream cfr_renamed_4;

    @Override
    public final int cfr_renamed_1202(int arg0) {
        int n;
        int n2 = arg0 + this.cfr_renamed_4.size();
        if (n2 > (n = this.cfr_renamed_1195())) {
            return 0;
        }
        if (this.cfr_renamed_3 == true) {
            return this.cfr_renamed_0;
        }
        return this.cfr_renamed_1;
    }

    public abstract byte[] cfr_renamed_136(byte[] var1) throws IllegalBlockSizeException, BadPaddingException;

    /*
     * WARNING - void declaration
     */
    @Override
    public final int cfr_renamed_1201(byte[] byArray, int n, int n2, byte[] byArray2, int n3) {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_1197((byte[])arg0, (int)arg1, (int)arg2);
        return 0;
    }

    public final void cfr_renamed_1212(Key arg0, AlgorithmParameterSpec arg1) throws InvalidKeyException, InvalidAlgorithmParameterException {
        this.cfr_renamed_1198(arg0, arg1, sprybl.cfr_renamed_2794());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void cfr_renamed_1198(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        void arg2;
        void arg1;
        this.cfr_renamed_3 = (AlgorithmParameterSpec)true;
        this.cfr_renamed_1210(key, (AlgorithmParameterSpec)arg1, (SecureRandom)arg2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final byte[] cfr_renamed_1199(byte[] byArray, int n, int n2) throws IllegalBlockSizeException, BadPaddingException {
        sprhqf sprhqf2 = this;
        sprhqf2.cfr_renamed_1215(n2);
        sprhqf sprhqf3 = this;
        sprhqf2.cfr_renamed_1197(byArray, n, n2);
        byte[] byArray2 = sprhqf3.cfr_renamed_4.toByteArray();
        sprhqf3.cfr_renamed_4.reset();
        switch (sprhqf3.cfr_renamed_3) {
            case 1: {
                return this.cfr_renamed_136(byArray2);
            }
            case 2: {
                return this.cfr_renamed_1214(byArray2);
            }
        }
        return null;
    }

    public abstract void cfr_renamed_1210(Key var1, AlgorithmParameterSpec var2, SecureRandom var3) throws InvalidKeyException, InvalidAlgorithmParameterException;

    public void cfr_renamed_1215(int arg0) throws IllegalBlockSizeException {
        int n = arg0 + this.cfr_renamed_4.size();
        if (this.cfr_renamed_3 == true) {
            if (n > this.cfr_renamed_1) {
                throw new IllegalBlockSizeException(new StringBuilder().insert(0, spruqd.cfr_renamed_9("\t\u00048L1\t3\u000b)\u0004}\u0003;L)\u00048L-\u0000<\u00053\u00188\u0014)Lu")).append(n).append(sprrzp.cfr_renamed_9("\u0005V\\@@G\f\u0014LG\u0005ZJ@\u0005GPDU[W@@P\u0005V\\\u0014")).append(spruqd.cfr_renamed_9(")\u00048L>\u0005-\u00048\u001e}D0\r%B}")).append(this.cfr_renamed_1).append(sprrzp.cfr_renamed_9("\u0005V\\@@G\f\u001a")).toString());
            }
        } else if (this.cfr_renamed_3 == 2 && n != this.cfr_renamed_0) {
            throw new IllegalBlockSizeException(new StringBuilder().insert(0, spruqd.cfr_renamed_9("%1\u00008\u000b<\u0000}\u000f4\u001c5\t/\u00188\u0014)L1\t3\u000b)\u0004}D8\u0014-\t>\u00188\b}")).append(this.cfr_renamed_0).append(sprrzp.cfr_renamed_9("\u0005V\\@@G\t\u0014RUV\u0014")).append(n).append(spruqd.cfr_renamed_9("L?\u0015)\t.Es")).toString());
        }
    }

    public abstract void cfr_renamed_1208(Key var1, AlgorithmParameterSpec var2) throws InvalidKeyException, InvalidAlgorithmParameterException;

    public abstract byte[] cfr_renamed_1214(byte[] var1) throws IllegalBlockSizeException, BadPaddingException;

    @Override
    public final int cfr_renamed_1200(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        if (arg3.length < this.cfr_renamed_1202(arg2)) {
            throw new ShortBufferException(sprrzp.cfr_renamed_9("jAQDP@\u0005VPRCQW\u0014Q[J\u0014V\\JFQ\u001a"));
        }
        byte[] byArray = this.cfr_renamed_1199(arg0, arg1, arg2);
        System.arraycopy(byArray, 0, arg3, arg4, byArray.length);
        return byArray.length;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void cfr_renamed_1194(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        void arg1;
        this.cfr_renamed_3 = (AlgorithmParameterSpec)2;
        this.cfr_renamed_1208(key, (AlgorithmParameterSpec)arg1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void cfr_renamed_1213(Key arg0) throws InvalidKeyException {
        try {
            this.cfr_renamed_1194(arg0, null);
            return;
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new InvalidParameterException(spruqd.cfr_renamed_9("\t\u00044\u001f}\u000f4\u001c5\t/L3\t8\b.L<\u0000:\u0003/\u0005)\u00040L-\r/\r0\t)\t/\u001f}\n2\u001e}\u00053\u0005)\u0005<\u00004\u0016<\u00184\u00033Lu\u000f<\u00023\u0003)L?\t}\u0002(\u00001Es"));
        }
    }

    @Override
    public final AlgorithmParameterSpec cfr_renamed_284() {
        return this.cfr_renamed_3;
    }

    @Override
    public final void cfr_renamed_1192(String arg0) {
    }

    @Override
    public final int cfr_renamed_1195() {
        if (this.cfr_renamed_3 == true) {
            return this.cfr_renamed_1;
        }
        return this.cfr_renamed_0;
    }

    @Override
    public final byte[] cfr_renamed_1205() {
        return null;
    }

    @Override
    public final void cfr_renamed_1193(String arg0) {
    }

    @Override
    public final byte[] cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.cfr_renamed_4.write(arg0, arg1, arg2);
        }
        return new byte[0];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void cfr_renamed_1211(Key arg0) throws InvalidKeyException {
        try {
            this.cfr_renamed_1198(arg0, null, sprybl.cfr_renamed_2794());
            return;
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new InvalidParameterException(sprrzp.cfr_renamed_9("`M]V\u0014F]U\\@F\u0005Z@QAG\u0005UISJFL@MY\u0005DDFDY@@@FV\u0014C[W\u0014LZL@LUI]_UQ]JZ\u0005\u001cFUKZJ@\u0005V@\u0014KAIX\f\u001a"));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void cfr_renamed_1064(Key arg0, SecureRandom arg1) throws InvalidKeyException {
        try {
            this.cfr_renamed_1198(arg0, null, arg1);
            return;
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new InvalidParameterException(spruqd.cfr_renamed_9("\t\u00044\u001f}\u000f4\u001c5\t/L3\t8\b.L<\u0000:\u0003/\u0005)\u00040L-\r/\r0\t)\t/\u001f}\n2\u001e}\u00053\u0005)\u0005<\u00004\u0016<\u00184\u00033Lu\u000f<\u00023\u0003)L?\t}\u0002(\u00001Es"));
        }
    }

    public sprhqf() {
        sprhqf sprhqf2 = this;
        sprhqf2.cfr_renamed_4 = new ByteArrayOutputStream();
    }
}

