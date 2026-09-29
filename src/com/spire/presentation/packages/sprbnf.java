/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbcg;
import com.spire.presentation.packages.sprbmf;
import com.spire.presentation.packages.sprffb;
import com.spire.presentation.packages.sprki;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqye;
import com.spire.presentation.packages.sprsbi;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.spruyf;
import com.spire.presentation.packages.sprvhf;
import com.spire.presentation.packages.sprvlf;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.spryy;
import com.spire.presentation.packages.sprzofa;
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

public class sprbnf
extends CipherSpi {
    private final String cfr_renamed_91;
    private sprvlf cfr_renamed_0;
    private sprbmf cfr_renamed_1;
    private sprsbi cfr_renamed_2;
    private sprbcg cfr_renamed_3;
    private AlgorithmParameters cfr_renamed_4;

    @Override
    public int engineGetKeySize(Key arg0) {
        return 2048;
    }

    @Override
    public int engineGetOutputSize(int arg0) {
        return -1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineWrap(Key arg0) throws IllegalBlockSizeException, InvalidKeyException {
        if (arg0.getEncoded() == null) {
            throw new InvalidKeyException(sprffb.cfr_renamed_9("\u001dQ0^1D~G,Q.\u00105U'\u001c~^+\\2\u0010;^=_:Y0Wp"));
        }
        try {
            sprbnf sprbnf2 = this;
            sprki sprki2 = sprbnf2.cfr_renamed_3.cfr_renamed_5686(sprbnf2.cfr_renamed_1.cfr_renamed_5650());
            spryy spryy2 = sprqye.cfr_renamed_5665(sprbnf2.cfr_renamed_2.cfr_renamed_5666());
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
            throw new IllegalBlockSizeException(new StringBuilder().insert(0, sprzofa.cfr_renamed_9("d\u001cp\u0010}\u00171\u0006~Rv\u0017\u007f\u0017c\u0013e\u001719E!1\u0001t\u0011c\u0017eH1")).append(illegalArgumentException.getMessage()).toString());
        }
        catch (DestroyFailedException destroyFailedException) {
            throw new IllegalBlockSizeException(new StringBuilder().insert(0, sprffb.cfr_renamed_9("E0Q<\\;\u0010*_~T;C*B1I~Y0D;B7]~F?\\+U-\n~")).append(destroyFailedException.getMessage()).toString());
        }
    }

    @Override
    public void engineSetMode(String arg0) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprzofa.cfr_renamed_9("1p\u001c\u007f\u001deRb\u0007a\u0002~\u0000eR|\u001du\u00171")).append(arg0).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGetParameters() {
        sprbnf sprbnf2;
        if (this.cfr_renamed_4 != null) {
            sprbnf2 = this;
            return sprbnf2.cfr_renamed_4;
        }
        try {
            sprbnf sprbnf3 = this;
            sprbnf3.cfr_renamed_4 = AlgorithmParameters.getInstance(sprbnf3.cfr_renamed_91, "BCPQC");
            sprbnf3.cfr_renamed_4.init(this.cfr_renamed_2);
            sprbnf2 = this;
            return sprbnf2.cfr_renamed_4;
        }
        catch (Exception exception) {
            throw sprvhf.cfr_renamed_5211(exception.toString(), exception);
        }
    }

    @Override
    public byte[] engineGetIV() {
        return null;
    }

    @Override
    public byte[] engineDoFinal(byte[] arg0, int arg1, int arg2) throws IllegalBlockSizeException, BadPaddingException {
        throw new IllegalStateException(sprffb.cfr_renamed_9("~1D~C+@._,D;T~Y0\u0010?\u0010)B?@.Y0W~]1T;"));
    }

    @Override
    public void engineSetPadding(String arg0) throws NoSuchPaddingException {
        throw new NoSuchPaddingException(new StringBuilder().insert(0, sprzofa.cfr_renamed_9("\"p\u0016u\u001b\u007f\u00151")).append(arg0).append(sprffb.cfr_renamed_9("\u0010+^5^1G0")).toString());
    }

    @Override
    public int engineDoFinal(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        throw new IllegalStateException(sprzofa.cfr_renamed_9("<~\u00061\u0001d\u0002a\u001dc\u0006t\u00161\u001b\u007fRpRf\u0000p\u0002a\u001b\u007f\u00151\u001f~\u0016t"));
    }

    @Override
    public byte[] engineUpdate(byte[] arg0, int arg1, int arg2) {
        throw new IllegalStateException(sprffb.cfr_renamed_9("~1D~C+@._,D;T~Y0\u0010?\u0010)B?@.Y0W~]1T;"));
    }

    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameterSpec arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int n;
        if (arg2 == null) {
            n = arg0;
            sprbnf sprbnf2 = this;
            sprbnf2.cfr_renamed_2 = new sprsbi(sprzofa.cfr_renamed_9("P7B_Z%A"));
        } else {
            if (!(arg2 instanceof sprsbi)) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, this.cfr_renamed_91).append(sprffb.cfr_renamed_9("~S?^~_0\\'\u0010?S=U.D~{\nc\u000eQ,Q3U*U,c.U=")).toString());
            }
            this.cfr_renamed_2 = (sprsbi)arg2;
            n = arg0;
        }
        if (n == 3) {
            if (arg1 instanceof sprbmf) {
                this.cfr_renamed_1 = (sprbmf)arg1;
                this.cfr_renamed_3 = new sprbcg(sprybl.cfr_renamed_5688(arg3));
                return;
            }
            throw new InvalidKeyException(new StringBuilder().insert(0, sprzofa.cfr_renamed_9("^\u001c}\u000b1\u00131")).append(this.cfr_renamed_91).append(sprffb.cfr_renamed_9("\u0010.E<\\7S~[;I~S?^~R;\u0010+C;T~V1B~G,Q.@7^9")).toString());
        }
        if (arg0 == 4) {
            if (arg1 instanceof sprvlf) {
                this.cfr_renamed_0 = (sprvlf)arg1;
                return;
            }
            throw new InvalidKeyException(new StringBuilder().insert(0, sprzofa.cfr_renamed_9("^\u001c}\u000b1\u00131")).append(this.cfr_renamed_91).append(sprffb.cfr_renamed_9("~@,Y(Q*U~[;I~S?^~R;\u0010+C;T~V1B~E0G,Q.@7^9")).toString());
        }
        throw new InvalidParameterException(sprzofa.cfr_renamed_9("R\u001ba\u001at\u00001\u001d\u007f\u001ehRg\u0013}\u001buRw\u001dcRf\u0000p\u0002a\u001b\u007f\u0015>\u0007\u007f\u0005c\u0013a\u0002x\u001cv"));
    }

    @Override
    public int engineGetBlockSize() {
        return 0;
    }

    @Override
    public int engineUpdate(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException {
        throw new IllegalStateException(sprffb.cfr_renamed_9("~1D~C+@._,D;T~Y0\u0010?\u0010)B?@.Y0W~]1T;"));
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

    public sprbnf(String string) throws NoSuchAlgorithmException {
        this.cfr_renamed_91 = string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameters arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        sprbnf sprbnf2;
        sprsbi sprsbi2 = null;
        if (arg2 != null) {
            try {
                sprsbi2 = arg2.getParameterSpec(sprsbi.class);
                sprbnf2 = this;
            }
            catch (Exception exception) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprzofa.cfr_renamed_9("r\u0013\u007fUeRy\u0013\u007f\u0016}\u00171\u0002p\u0000p\u001ft\u0006t\u00001")).append(arg2.toString()).toString());
            }
        } else {
            sprbnf2 = this;
        }
        sprbnf2.engineInit(arg0, arg1, sprsbi2, arg3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Key engineUnwrap(byte[] arg0, String arg1, int arg2) throws InvalidKeyException, NoSuchAlgorithmException {
        if (arg2 != 3) {
            throw new InvalidKeyException(sprffb.cfr_renamed_9("1^2I~c\u001bs\fu\no\u0015u\u0007\u0010-E.@1B*U:"));
        }
        try {
            spruyf spruyf2;
            spruyf spruyf3 = spruyf2 = new spruyf(this.cfr_renamed_0.cfr_renamed_5650());
            byte[] byArray = spruyf3.cfr_renamed_5685(sproze.cfr_renamed_533(arg0, 0, spruyf3.cfr_renamed_5687()));
            spryy spryy2 = sprqye.cfr_renamed_5665(this.cfr_renamed_2.cfr_renamed_5666());
            sprtpk sprtpk2 = new sprtpk(byArray);
            sproze.cfr_renamed_3408(byArray);
            spryy2.cfr_renamed_5535(false, sprtpk2);
            byte[] byArray2 = sproze.cfr_renamed_533(arg0, spruyf2.cfr_renamed_5687(), arg0.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(spryy2.cfr_renamed_1579(byArray2, 0, byArray2.length), arg1);
            sproze.cfr_renamed_3408(sprtpk2.cfr_renamed_1521());
            return secretKeySpec;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprzofa.cfr_renamed_9("\u0007\u007f\u0013s\u001etRe\u001d1\u0017i\u0006c\u0013r\u000619E!1\u0001t\u0011c\u0017eH1")).append(illegalArgumentException.getMessage()).toString());
        }
        catch (sprull sprull2) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprffb.cfr_renamed_9("E0Q<\\;\u0010*_~U&D,Q=D~{\nc~C;S,U*\n~")).append(sprull2.getMessage()).toString());
        }
    }
}

