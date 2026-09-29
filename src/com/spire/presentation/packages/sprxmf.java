/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraif;
import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlyn;
import com.spire.presentation.packages.sprsnf;
import com.spire.presentation.packages.sprsqaa;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprvmg;
import com.spire.presentation.packages.sprxfg;
import com.spire.presentation.packages.sprxng;
import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;

public class sprxmf
extends Signature {
    private ByteArrayOutputStream cfr_renamed_1;
    private SecureRandom cfr_renamed_2;
    private sprvmg cfr_renamed_3;
    private sprxng cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInitVerify(PublicKey arg0) throws InvalidKeyException {
        String string;
        PublicKey publicKey;
        if (!(arg0 instanceof spraif)) {
            try {
                publicKey = arg0 = new spraif(sprvhm.cfr_renamed_23(arg0.getEncoded()));
            }
            catch (Exception exception) {
                throw new InvalidKeyException(new StringBuilder().insert(0, sprsqaa.cfr_renamed_9("\u0005\\\u001b\\\u001fE\u001e\u0012\u0000G\u0012^\u0019QPY\u0015KPB\u0011A\u0003W\u0014\u0012\u0004]Pv\u0019^\u0019F\u0018[\u0005_J\u0012")).append(exception.getMessage()).toString(), exception);
            }
        } else {
            publicKey = arg0;
        }
        spraif spraif2 = (spraif)publicKey;
        if (this.cfr_renamed_3 != null && !(string = sprkoe.cfr_renamed_116(this.cfr_renamed_3.cfr_renamed_313())).equals(spraif2.getAlgorithm())) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprlyn.cfr_renamed_9("Z\u0001N\u0006H\u001c\\\u001aLHJ\u0007G\u000e@\u000f\\\u001aL\f\t\u000eF\u001a\t")).append(string).toString());
        }
        this.cfr_renamed_4.cfr_renamed_5535(false, spraif2.cfr_renamed_5650());
    }

    @Override
    public Object engineGetParameter(String arg0) {
        throw new UnsupportedOperationException(sprsqaa.cfr_renamed_9("\u0015\\\u0017[\u001eW#W\u0004b\u0011@\u0011_\u0015F\u0015@PG\u001eA\u0005B\u0000]\u0002F\u0015V"));
    }

    /*
     * WARNING - void declaration
     */
    public sprxmf(sprxng sprxng2) {
        void arg0;
        sprxmf sprxmf2 = this;
        super(sprlyn.cfr_renamed_9("m\u0001E\u0001]\u0000@\u001dD"));
        sprxmf sprxmf3 = this;
        sprxmf3.cfr_renamed_1 = new ByteArrayOutputStream();
        sprxmf2.cfr_renamed_4 = arg0;
        sprxmf2.cfr_renamed_3 = null;
    }

    @Override
    public boolean engineVerify(byte[] arg0) throws SignatureException {
        sprxmf sprxmf2 = this;
        byte[] byArray = sprxmf2.cfr_renamed_1.toByteArray();
        sprxmf2.cfr_renamed_1.reset();
        return sprxmf2.cfr_renamed_4.cfr_renamed_129(byArray, arg0);
    }

    @Override
    public void engineUpdate(byte arg0) throws SignatureException {
        this.cfr_renamed_1.write(arg0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        void arg1;
        this.cfr_renamed_2 = arg1;
        this.engineInitSign(privateKey);
    }

    @Override
    public void engineSetParameter(String arg0, Object arg1) {
        throw new UnsupportedOperationException(sprsqaa.cfr_renamed_9("\u0015\\\u0017[\u001eW#W\u0004b\u0011@\u0011_\u0015F\u0015@PG\u001eA\u0005B\u0000]\u0002F\u0015V"));
    }

    /*
     * WARNING - void declaration
     */
    public sprxmf(sprxng sprxng2, sprvmg sprvmg2) {
        void arg0;
        void arg1;
        sprxmf sprxmf2 = this;
        super(sprkoe.cfr_renamed_116(arg1.cfr_renamed_313()));
        sprxmf sprxmf3 = this;
        sprxmf3.cfr_renamed_1 = new ByteArrayOutputStream();
        sprxmf2.cfr_renamed_4 = arg0;
        sprxmf2.cfr_renamed_3 = sprvmg2;
    }

    @Override
    public void engineUpdate(byte[] arg0, int arg1, int arg2) throws SignatureException {
        this.cfr_renamed_1.write(arg0, arg1, arg2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineSign() throws SignatureException {
        try {
            sprxmf sprxmf2 = this;
            byte[] byArray = sprxmf2.cfr_renamed_1.toByteArray();
            sprxmf2.cfr_renamed_1.reset();
            return sprxmf2.cfr_renamed_4.cfr_renamed_125(byArray);
        }
        catch (Exception exception) {
            throw new SignatureException(exception.toString());
        }
    }

    @Override
    public void engineInitSign(PrivateKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprsnf) {
            String string;
            sprsnf sprsnf2 = (sprsnf)arg0;
            sprxfg sprxfg2 = sprsnf2.cfr_renamed_5650();
            if (this.cfr_renamed_3 != null && !(string = sprkoe.cfr_renamed_116(this.cfr_renamed_3.cfr_renamed_313())).equals(sprsnf2.getAlgorithm())) {
                throw new InvalidKeyException(new StringBuilder().insert(0, sprlyn.cfr_renamed_9("Z\u0001N\u0006H\u001c\\\u001aLHJ\u0007G\u000e@\u000f\\\u001aL\f\t\u000eF\u001a\t")).append(string).toString());
            }
            if (this.cfr_renamed_2 != null) {
                this.cfr_renamed_4.cfr_renamed_5535(true, new sprbgk(sprxfg2, this.cfr_renamed_2));
                return;
            }
            this.cfr_renamed_4.cfr_renamed_5535(true, sprxfg2);
            return;
        }
        throw new InvalidKeyException(sprsqaa.cfr_renamed_9("G\u001eY\u001e]\u0007\\PB\u0002[\u0006S\u0004WPY\u0015KPB\u0011A\u0003W\u0014\u0012\u0004]Pv\u0019^\u0019F\u0018[\u0005_"));
    }

    @Override
    public void engineSetParameter(AlgorithmParameterSpec arg0) {
        throw new UnsupportedOperationException(sprlyn.cfr_renamed_9("\rG\u000f@\u0006L;L\u001cy\t[\tD\r]\r[H\\\u0006Z\u001dY\u0018F\u001a]\rM"));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3 ^ 5;
        int cfr_ignored_0 = 5 << 4 ^ (3 << 2 ^ 3);
        int n4 = n2;
        int n5 = 2 << 3 ^ 5;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }
}

