/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.SaveToHtmlOption;
import com.spire.presentation.packages.sprab;
import com.spire.presentation.packages.spraie;
import com.spire.presentation.packages.sprbmd;
import com.spire.presentation.packages.sprhfd;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprjkc;
import com.spire.presentation.packages.sprob;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprpmb;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprvb;
import com.spire.presentation.packages.sprxnc;
import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.interfaces.DHPrivateKey;

public class sprnkc
extends CipherSpi {
    private AlgorithmParameters cfr_renamed_91;
    private Class[] cfr_renamed_0;
    private int cfr_renamed_1;
    private sprpmb cfr_renamed_2;
    private ByteArrayOutputStream cfr_renamed_3;
    private sprhfd cfr_renamed_4;

    @Override
    public int engineGetBlockSize() {
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineDoFinal(byte[] arg0, int arg1, int arg2) throws IllegalBlockSizeException, BadPaddingException {
        if (arg2 != 0) {
            this.cfr_renamed_3.write(arg0, arg1, arg2);
        }
        try {
            sprnkc sprnkc2 = this;
            byte[] byArray = sprnkc2.cfr_renamed_3.toByteArray();
            sprnkc2.cfr_renamed_3.reset();
            return sprnkc2.cfr_renamed_4.cfr_renamed_1337(byArray, 0, byArray.length);
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
    public int engineDoFinal(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws IllegalBlockSizeException, BadPaddingException {
        if (arg2 != 0) {
            this.cfr_renamed_3.write(arg0, arg1, arg2);
        }
        try {
            sprnkc sprnkc2 = this;
            byte[] byArray = sprnkc2.cfr_renamed_3.toByteArray();
            sprnkc2.cfr_renamed_3.reset();
            byArray = sprnkc2.cfr_renamed_4.cfr_renamed_1337(byArray, 0, byArray.length);
            System.arraycopy(byArray, 0, arg3, arg4, byArray.length);
            return byArray.length;
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
    public void engineInit(int arg0, Key arg1, SecureRandom arg2) throws InvalidKeyException {
        if (arg0 == 1 || arg0 == 3) {
            try {
                this.engineInit(arg0, arg1, (AlgorithmParameterSpec)null, arg2);
                return;
            }
            catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
                // empty catch block
            }
        }
        throw new IllegalArgumentException(SaveToHtmlOption.cfr_renamed_9("\f\u000e\u0001H\u001bO\u0007\u000e\u0001\u000b\u0003\nO\u0001\u001a\u0003\u0003O\u001f\u000e\u001d\u000e\u0002\n\u001b\n\u001dO\u001c\u001f\n\fO\u0006\u0001O&*<"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameters arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpec = null;
        if (arg2 != null) {
            AlgorithmParameterSpec algorithmParameterSpec2;
            block5: {
                int n;
                int n2 = n = 0;
                while (n2 != this.cfr_renamed_0.length) {
                    try {
                        algorithmParameterSpec2 = algorithmParameterSpec = (AlgorithmParameterSpec)arg2.getParameterSpec(this.cfr_renamed_0[n]);
                        break block5;
                    }
                    catch (Exception exception) {
                        n2 = ++n;
                    }
                }
                algorithmParameterSpec2 = algorithmParameterSpec;
            }
            if (algorithmParameterSpec2 == null) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, spraie.cfr_renamed_9("):$|>{\":$?&>j++)+6///)j")).append(arg2.toString()).toString());
            }
        }
        this.cfr_renamed_91 = arg2;
        this.engineInit(arg0, arg1, algorithmParameterSpec, arg3);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public byte[] engineUpdate(byte[] byArray, int n, int n2) {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_3.write((byte[])arg0, (int)arg1, (int)arg2);
        return null;
    }

    @Override
    public int engineGetKeySize(Key arg0) {
        if (!(arg0 instanceof sprob)) {
            throw new IllegalArgumentException(SaveToHtmlOption.cfr_renamed_9("\u0002\u001a\u001c\u001bO\r\nO\u001f\u000e\u001c\u001c\n\u000bO&*O\u0004\n\u0016"));
        }
        sprob sprob2 = (sprob)arg0;
        if (sprob2.cfr_renamed_1225() instanceof DHPrivateKey) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey)sprob2.cfr_renamed_1225();
            return dHPrivateKey.getX().bitLength();
        }
        if (sprob2.cfr_renamed_1225() instanceof sprab) {
            sprab sprab2 = (sprab)sprob2.cfr_renamed_1225();
            return sprab2.cfr_renamed_2112().bitLength();
        }
        throw new IllegalArgumentException(spraie.cfr_renamed_9("5%/j:${\u0003\u001ej0/\"k"));
    }

    @Override
    public byte[] engineGetIV() {
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprnkc(sprhfd sprhfd2) {
        void arg0;
        sprnkc sprnkc2 = this;
        sprnkc sprnkc3 = this;
        sprnkc3.cfr_renamed_1 = -1;
        sprnkc sprnkc4 = this;
        sprnkc3.cfr_renamed_3 = new ByteArrayOutputStream();
        sprnkc3.cfr_renamed_91 = null;
        sprnkc2.cfr_renamed_2 = null;
        Class[] classArray = new Class[1];
        classArray[0] = sprpmb.class;
        sprnkc2.cfr_renamed_0 = classArray;
        this.cfr_renamed_4 = arg0;
    }

    @Override
    public void engineSetPadding(String arg0) throws NoSuchPaddingException {
        throw new NoSuchPaddingException(new StringBuilder().insert(0, arg0).append(SaveToHtmlOption.cfr_renamed_9("O\u001a\u0001\u000e\u0019\u000e\u0006\u0003\u000e\r\u0003\nO\u0018\u0006\u001b\u0007O=<.A")).toString());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int engineUpdate(byte[] byArray, int n, int n2, byte[] byArray2, int n3) {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_3.write((byte[])arg0, (int)arg1, (int)arg2);
        return 0;
    }

    @Override
    public void engineSetMode(String arg0) {
        throw new IllegalArgumentException(new StringBuilder().insert(0, spraie.cfr_renamed_9("):$|>{9.:+%)>{'4.>j")).append(arg0).toString());
    }

    @Override
    public int engineGetOutputSize(int arg0) {
        if (this.cfr_renamed_1 == 1 || this.cfr_renamed_1 == 3) {
            return this.cfr_renamed_3.size() + arg0 + 20;
        }
        if (this.cfr_renamed_1 == 2 || this.cfr_renamed_1 == 4) {
            return this.cfr_renamed_3.size() + arg0 - 20;
        }
        throw new IllegalStateException(SaveToHtmlOption.cfr_renamed_9("\f\u0006\u001f\u0007\n\u001dO\u0001\u0000\u001bO\u0006\u0001\u0006\u001b\u0006\u000e\u0003\u0006\u001c\n\u000b"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGetParameters() {
        sprnkc sprnkc2;
        if (this.cfr_renamed_91 == null && this.cfr_renamed_2 != null) {
            String string = spraie.cfr_renamed_9("\u0003\u001e\u0019");
            try {
                this.cfr_renamed_91 = AlgorithmParameters.getInstance(string, "BC");
                this.cfr_renamed_91.init(this.cfr_renamed_2);
                sprnkc2 = this;
                return sprnkc2.cfr_renamed_91;
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        sprnkc2 = this;
        return sprnkc2.cfr_renamed_91;
    }

    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameterSpec arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        sprnkc sprnkc2;
        sprhgb sprhgb2;
        Key key;
        Object object;
        Object object2;
        if (!(arg1 instanceof sprob)) {
            throw new InvalidKeyException(SaveToHtmlOption.cfr_renamed_9("\u0002\u001a\u001c\u001bO\r\nO\u001f\u000e\u001c\u001c\n\u000bO&*<O\u0004\n\u0016"));
        }
        if (arg2 == null && (arg0 == 1 || arg0 == 3)) {
            object2 = new byte[16];
            object = new byte[16];
            if (arg3 == null) {
                arg3 = new SecureRandom();
            }
            arg3.nextBytes((byte[])object2);
            arg3.nextBytes((byte[])object);
            arg2 = new sprpmb((byte[])object2, (byte[])object, 128);
            key = arg1;
        } else {
            if (!(arg2 instanceof sprpmb)) {
                throw new InvalidAlgorithmParameterException(spraie.cfr_renamed_9("'.9/j9/{::9(/?j\u0012\u000f\bj++)+6///)9"));
            }
            key = arg1;
        }
        object2 = (sprob)key;
        if (object2.cfr_renamed_1224() instanceof sprvb) {
            Object object3 = object2;
            object = sprjkc.cfr_renamed_1216(object3.cfr_renamed_1224());
            sprhgb2 = sprjkc.cfr_renamed_1220(object3.cfr_renamed_1225());
            sprnkc2 = this;
        } else {
            Object object4 = object2;
            object = sprxnc.cfr_renamed_1216(object4.cfr_renamed_1224());
            sprhgb2 = sprxnc.cfr_renamed_1220(object4.cfr_renamed_1225());
            sprnkc2 = this;
        }
        sprnkc2.cfr_renamed_2 = (sprpmb)arg2;
        sprbmd sprbmd2 = new sprbmd(this.cfr_renamed_2.cfr_renamed_2097(), this.cfr_renamed_2.cfr_renamed_2099(), this.cfr_renamed_2.cfr_renamed_2100());
        this.cfr_renamed_1 = arg0;
        this.cfr_renamed_3.reset();
        switch (this.cfr_renamed_1) {
            case 1: 
            case 3: {
                while (false) {
                }
                this.cfr_renamed_4.cfr_renamed_2489(true, sprhgb2, (sprt)object, sprbmd2);
                return;
            }
            case 2: 
            case 4: {
                this.cfr_renamed_4.cfr_renamed_2489(false, sprhgb2, (sprt)object, sprbmd2);
                return;
            }
        }
        System.out.println(SaveToHtmlOption.cfr_renamed_9("\n\n\n\u0004N"));
    }
}

