/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprcqc;
import com.spire.presentation.packages.sprfkd;
import com.spire.presentation.packages.sprflb;
import com.spire.presentation.packages.sprh;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprkb;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprnhl;
import com.spire.presentation.packages.sprokd;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprpmd;
import com.spire.presentation.packages.sprsb;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.spruid;
import com.spire.presentation.packages.sprwob;
import com.spire.presentation.packages.spryb;
import com.spire.presentation.packages.spryid;
import com.spire.presentation.packages.sprywa;
import com.spire.presentation.packages.sprzqc;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.interfaces.DHKey;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

public class sprtmc
extends sprcqc {
    private sprokd cfr_renamed_3;
    private AlgorithmParameterSpec cfr_renamed_4;
    private AlgorithmParameters cfr_renamed_1;

    @Override
    public void engineSetPadding(String arg0) throws NoSuchPaddingException {
        String string = sprywa.cfr_renamed_116(arg0);
        if (string.equals(sprnhl.cfr_renamed_9("V\u0016H\u0018\\\u001dQ\u0017_"))) {
            sprtmc sprtmc2 = this;
            sprtmc2.cfr_renamed_3 = new sprokd(new spruid());
            return;
        }
        if (string.equals(sprwob.cfr_renamed_9("\u0010}\u0003eqf\u0001r\u0004\u007f\u000eq"))) {
            this.cfr_renamed_3 = new sprokd(new sprpmd(new spruid()));
            return;
        }
        if (string.equals(sprnhl.cfr_renamed_9("\u0010K\u0016!n!o5hH\u0018\\\u001dQ\u0017_"))) {
            this.cfr_renamed_3 = new sprokd(new sprfkd(new spruid()));
            return;
        }
        if (string.equals(sprwob.cfr_renamed_9("y\u0001s\u0010f\u0001r\u0004\u007f\u000eq"))) {
            this.cfr_renamed_2485(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (string.equals(sprnhl.cfr_renamed_9("W\u0018]\tO\u0010L\u0011U\u001d-\u0018V\u001dU\u001e^hH\u0018\\\u001dQ\u0017_"))) {
            this.cfr_renamed_2485(new OAEPParameterSpec("MD5", sprwob.cfr_renamed_9("\rq\u0006\u0007"), new MGF1ParameterSpec("MD5"), PSource.PSpecified.DEFAULT));
            return;
        }
        if (string.equals(sprnhl.cfr_renamed_9("\u0016Y\u001cH\u000eQ\rP\nP\u0018)\u0018V\u001dU\u001e^hH\u0018\\\u001dQ\u0017_"))) {
            this.cfr_renamed_2485(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (string.equals(sprwob.cfr_renamed_9("\u000fw\u0005f\u0017\u007f\u0014~\u0013~\u0001\u0004r\u0002\u0001x\u0004{\u0007pqf\u0001r\u0004\u007f\u000eq"))) {
            this.cfr_renamed_2485(new OAEPParameterSpec("SHA-224", sprnhl.cfr_renamed_9("\u0014_\u001f)"), new MGF1ParameterSpec("SHA-224"), PSource.PSpecified.DEFAULT));
            return;
        }
        if (string.equals(sprwob.cfr_renamed_9("\u000fw\u0005f\u0017\u007f\u0014~\u0013~\u0001\u0004u\u0000\u0001x\u0004{\u0007pqf\u0001r\u0004\u007f\u000eq"))) {
            this.cfr_renamed_2485(new OAEPParameterSpec("SHA-256", sprnhl.cfr_renamed_9("\u0014_\u001f)"), MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
            return;
        }
        if (string.equals(sprwob.cfr_renamed_9("\u000fw\u0005f\u0017\u007f\u0014~\u0013~\u0001\u0005x\u0002\u0001x\u0004{\u0007pqf\u0001r\u0004\u007f\u000eq"))) {
            this.cfr_renamed_2485(new OAEPParameterSpec("SHA-384", sprnhl.cfr_renamed_9("\u0014_\u001f)"), MGF1ParameterSpec.SHA384, PSource.PSpecified.DEFAULT));
            return;
        }
        if (string.equals(sprwob.cfr_renamed_9("\u000fw\u0005f\u0017\u007f\u0014~\u0013~\u0001\u0003q\u0004\u0001x\u0004{\u0007pqf\u0001r\u0004\u007f\u000eq"))) {
            this.cfr_renamed_2485(new OAEPParameterSpec("SHA-512", sprnhl.cfr_renamed_9("\u0014_\u001f)"), MGF1ParameterSpec.SHA512, PSource.PSpecified.DEFAULT));
            return;
        }
        throw new NoSuchPaddingException(new StringBuilder().insert(0, arg0).append(sprwob.cfr_renamed_9("`C.W6W)Z!T,S`A)B(\u0016\u0005Z\u0007W-W,\u0018")).toString());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int engineUpdate(byte[] byArray, int n, int n2, byte[] byArray2, int n3) {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_3.cfr_renamed_2494((byte[])arg0, (int)arg1, (int)arg2);
        return 0;
    }

    private /* synthetic */ void cfr_renamed_2485(OAEPParameterSpec arg0) throws NoSuchPaddingException {
        MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec)arg0.getMGFParameters();
        sprlc sprlc2 = sprflb.cfr_renamed_2390(mGF1ParameterSpec.getDigestAlgorithm());
        if (sprlc2 == null) {
            throw new NoSuchPaddingException(new StringBuilder().insert(0, sprnhl.cfr_renamed_9("v684y-{186vyW\u0018]\t8:w7k-j,{-w+8?w+8=q>}*lyy5\u007f6j0l1uc8")).append(mGF1ParameterSpec.getDigestAlgorithm()).toString());
        }
        this.cfr_renamed_3 = new sprokd(new spryid(new spruid(), sprlc2, ((PSource.PSpecified)arg0.getPSource()).getValue()));
        this.cfr_renamed_4 = arg0;
    }

    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameters arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException(sprwob.cfr_renamed_9("#W.\u00114\u0016(W.R,S`F!D![%B%D3\u0016)X`s,q![!Z"));
    }

    @Override
    public int engineGetKeySize(Key arg0) {
        if (arg0 instanceof spryb) {
            spryb spryb2 = (spryb)((Object)arg0);
            return spryb2.cfr_renamed_284().cfr_renamed_1155().bitLength();
        }
        if (arg0 instanceof DHKey) {
            DHKey dHKey = (DHKey)((Object)arg0);
            return dHKey.getParams().getP().bitLength();
        }
        throw new IllegalArgumentException(sprnhl.cfr_renamed_9("v6lyy78\u001ct\u001ey4y582} 9"));
    }

    @Override
    public int engineGetOutputSize(int arg0) {
        return this.cfr_renamed_3.cfr_renamed_1339();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGetParameters() {
        sprtmc sprtmc2;
        if (this.cfr_renamed_1 == null && this.cfr_renamed_4 != null) {
            try {
                this.cfr_renamed_1 = AlgorithmParameters.getInstance(sprwob.cfr_renamed_9("\u000fw\u0005f"), "BC");
                this.cfr_renamed_1.init(this.cfr_renamed_4);
                sprtmc2 = this;
                return sprtmc2.cfr_renamed_1;
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        sprtmc2 = this;
        return sprtmc2.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameterSpec arg2, SecureRandom arg3) throws InvalidKeyException {
        SecureRandom secureRandom;
        if (arg2 != null) throw new IllegalArgumentException(sprwob.cfr_renamed_9("C.].Y7X`F!D![%B%D`B9F%\u0018"));
        if (arg1 instanceof sprsb) {
            sprhgb sprhgb2 = sprzqc.cfr_renamed_1216((PublicKey)arg1);
            secureRandom = arg3;
        } else {
            if (!(arg1 instanceof sprkb)) throw new InvalidKeyException(sprnhl.cfr_renamed_9(",v2v6o782} 8-a)}yh8k*}=8-wy]5_8u8t"));
            sprhgb sprhgb3 = sprzqc.cfr_renamed_1220((PrivateKey)arg1);
            secureRandom = arg3;
        }
        if (secureRandom != null) {
            void var5_7;
            spraed spraed2 = new spraed((sprt)var5_7, arg3);
        }
        switch (arg0) {
            case 1: 
            case 3: {
                void var5_9;
                while (false) {
                }
                this.cfr_renamed_3.cfr_renamed_1217(true, (sprt)var5_9);
                return;
            }
            case 2: 
            case 4: {
                void var5_9;
                this.cfr_renamed_3.cfr_renamed_1217(false, (sprt)var5_9);
                return;
            }
        }
        throw new InvalidParameterException(new StringBuilder().insert(0, sprnhl.cfr_renamed_9("m7s7w.vyw)u6|<8")).append(arg0).append(sprwob.cfr_renamed_9("`F!E3S$\u00164Y`s,q![!Z")).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineDoFinal(byte[] arg0, int arg1, int arg2) throws IllegalBlockSizeException, BadPaddingException {
        this.cfr_renamed_3.cfr_renamed_2494(arg0, arg1, arg2);
        try {
            return this.cfr_renamed_3.cfr_renamed_1206();
        }
        catch (sprpjd sprpjd2) {
            throw new BadPaddingException(sprpjd2.getMessage());
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprtmc(sprh sprh2) {
        void arg0;
        sprtmc sprtmc2 = this;
        sprtmc2.cfr_renamed_3 = new sprokd((sprh)arg0);
    }

    @Override
    public void engineInit(int arg0, Key arg1, SecureRandom arg2) throws InvalidKeyException {
        this.engineInit(arg0, arg1, (AlgorithmParameterSpec)null, arg2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public byte[] engineUpdate(byte[] byArray, int n, int n2) {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_3.cfr_renamed_2494((byte[])arg0, (int)arg1, (int)arg2);
        return null;
    }

    @Override
    public int engineGetBlockSize() {
        return this.cfr_renamed_3.cfr_renamed_1344();
    }

    @Override
    public void engineSetMode(String arg0) throws NoSuchAlgorithmException {
        String string = sprywa.cfr_renamed_116(arg0);
        if (string.equals(sprnhl.cfr_renamed_9("\u0017W\u0017]")) || string.equals(sprwob.cfr_renamed_9("s\u0003t"))) {
            return;
        }
        throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprnhl.cfr_renamed_9("{8v~lyk,h)w+lyu6|<8")).append(arg0).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int engineDoFinal(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws IllegalBlockSizeException, BadPaddingException {
        int n;
        byte[] byArray;
        this.cfr_renamed_3.cfr_renamed_2494(arg0, arg1, arg2);
        try {
            byArray = this.cfr_renamed_3.cfr_renamed_1206();
        }
        catch (sprpjd sprpjd2) {
            throw new BadPaddingException(sprpjd2.getMessage());
        }
        int n2 = n = 0;
        while (n2 != byArray.length) {
            int n3 = arg4 + n;
            byte by = byArray[n];
            arg3[n3] = by;
            n2 = ++n;
        }
        return byArray.length;
    }
}

