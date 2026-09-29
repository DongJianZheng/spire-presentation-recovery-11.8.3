/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcwg;
import com.spire.presentation.packages.sprcyg;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdfj;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprhrm;
import com.spire.presentation.packages.sprifm;
import com.spire.presentation.packages.spriwg;
import com.spire.presentation.packages.sprjzg;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprmah;
import com.spire.presentation.packages.sprmwg;
import com.spire.presentation.packages.sprnhm;
import com.spire.presentation.packages.sproah;
import com.spire.presentation.packages.sprobi;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqsg;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprti;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprtu;
import com.spire.presentation.packages.sprvah;
import com.spire.presentation.packages.sprvbh;
import com.spire.presentation.packages.sprvdm;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprxil;
import com.spire.presentation.packages.sprzkl;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.interfaces.RSAKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Date;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.DHKey;

public class sprktg {
    private sprjzg cfr_renamed_91;
    private sprmwg cfr_renamed_0;
    private sprcyg cfr_renamed_1;
    private sprcyg cfr_renamed_2;
    private sprvah cfr_renamed_3;
    private static final int cfr_renamed_4 = 32;

    public sprti cfr_renamed_1568(PrivateKey arg0) {
        return new spriwg(this, arg0);
    }

    public static /* synthetic */ byte[] cfr_renamed_7929(sprktg arg0, int arg1, PrivateKey arg2, int arg3, byte[][] arg4) throws sprtqg {
        return arg0.cfr_renamed_7930(arg1, arg2, arg3, arg4);
    }

    private /* synthetic */ int cfr_renamed_7931(PrivateKey arg0) {
        if (arg0 instanceof DHKey) {
            DHKey dHKey = (DHKey)((Object)arg0);
            return (dHKey.getParams().getP().bitLength() + 7) / 8;
        }
        if (arg0 instanceof RSAKey) {
            RSAKey rSAKey = (RSAKey)((Object)arg0);
            return (rSAKey.getModulus().bitLength() + 7) / 8;
        }
        return -1;
    }

    public sprktg cfr_renamed_4045(String arg0) {
        sprktg sprktg2 = this;
        this.cfr_renamed_1 = new sprcyg(new sprxil(arg0));
        sprktg2.cfr_renamed_3 = new sprvah(this.cfr_renamed_1);
        return this;
    }

    public sprktg cfr_renamed_1498(Provider provider) {
        this.cfr_renamed_2 = new sprcyg(new sprkhi(provider));
        this.cfr_renamed_91.cfr_renamed_1498(provider);
        this.cfr_renamed_1 = this.cfr_renamed_2;
        this.cfr_renamed_3 = new sprvah(this.cfr_renamed_1);
        return this;
    }

    public static /* synthetic */ sprjzg cfr_renamed_7932(sprktg arg0) {
        return arg0.cfr_renamed_91;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ byte[] cfr_renamed_7933(sprjzg arg0, sprmah arg1, byte[][] arg2) throws sprtqg {
        sprifm sprifm2 = arg1.cfr_renamed_7735();
        sprvdm sprvdm2 = (sprvdm)sprifm2.cfr_renamed_1521();
        byte[] byArray = arg2[0];
        int n = (((byArray[0] & 0xFF) << 8) + (byArray[1] & 0xFF) + 7) / 8;
        if (2 + n + 1 > byArray.length) {
            throw new sprtqg(sprvjn.cfr_renamed_9("0P6Q1[1\u001e9[;Y!VuQ JuQ3\u001e'_;Y0"));
        }
        byte[] byArray2 = new byte[n];
        System.arraycopy(byArray, 2, byArray2, 0, n);
        int n2 = byArray[n + 2] & 0xFF;
        if (2 + n + 1 + n2 > byArray.length) {
            throw new sprtqg(sprdfj.cfr_renamed_9("6t0u7\u007f7:?\u007f=}'rsu&nsu5:!{=}6"));
        }
        byte[] byArray3 = new byte[n2];
        System.arraycopy(byArray, 2 + n + 1, byArray3, 0, n2);
        try {
            Object object;
            sprifm sprifm3;
            PublicKey publicKey;
            Object object2;
            KeyAgreement keyAgreement;
            if (sprvdm2.cfr_renamed_7813().cfr_renamed_5078(sprhrm.cfr_renamed_2)) {
                sprktg sprktg2 = this;
                keyAgreement = sprktg2.cfr_renamed_2.cfr_renamed_2382(sprcwg.cfr_renamed_7874(sprifm2));
                object2 = sprktg2.cfr_renamed_2.cfr_renamed_1511(sprvjn.cfr_renamed_9("\rz\u001d"));
                if (byArray2.length != 33 || 64 != byArray2[0]) {
                    throw new IllegalArgumentException(sprdfj.cfr_renamed_9("\u001at%{?s7:\u0010o!l6(f/b#sj&x?s0:8\u007f*"));
                }
                publicKey = ((KeyFactory)object2).generatePublic(new X509EncodedKeySpec(new sprvhm(new sprddm(sprtu.cfr_renamed_3), sproze.cfr_renamed_533(byArray2, 1, byArray2.length)).cfr_renamed_91()));
                sprifm3 = sprifm2;
            } else {
                object2 = sprnhm.cfr_renamed_7814(sprvdm2.cfr_renamed_7813());
                object = ((sprzkl)object2).cfr_renamed_1769().cfr_renamed_2002(byArray2);
                keyAgreement = this.cfr_renamed_2.cfr_renamed_2382(sprcwg.cfr_renamed_7873(sprifm2));
                publicKey = arg0.cfr_renamed_7926(new sprvbh(new sprifm(18, new Date(), new sprvdm(sprvdm2.cfr_renamed_7813(), (spreuh)object, (int)sprvdm2.cfr_renamed_579(), (int)sprvdm2.cfr_renamed_7877())), this.cfr_renamed_0));
                sprifm3 = sprifm2;
            }
            object2 = sprcwg.cfr_renamed_7876(sprifm3, this.cfr_renamed_0);
            object = arg0.cfr_renamed_7934(arg1);
            KeyAgreement keyAgreement2 = keyAgreement;
            keyAgreement2.init((Key)object, new sprobi((byte[])object2));
            keyAgreement2.doPhase(publicKey, true);
            SecretKey secretKey = keyAgreement.generateSecret(sprcwg.cfr_renamed_7875(sprvdm2.cfr_renamed_7877()).cfr_renamed_19());
            Cipher cipher = this.cfr_renamed_2.cfr_renamed_7922(sprvdm2.cfr_renamed_7877());
            cipher.init(4, secretKey);
            return sproah.cfr_renamed_7903(cipher.unwrap(byArray3, sprvjn.cfr_renamed_9("\u0006[&M<Q;"), 3).getEncoded());
        }
        catch (InvalidKeyException invalidKeyException) {
            throw new sprtqg(sprdfj.cfr_renamed_9("6h!u!: \u007f'n:t4:2i*w>\u007f'h:ysy:j;\u007f!"), invalidKeyException);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new sprtqg(sprvjn.cfr_renamed_9("0L'Q'\u001e&[!J<P2\u001e4M,S8[!L<]u]<N=['"), noSuchAlgorithmException);
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new sprtqg(sprdfj.cfr_renamed_9("6h!u!: \u007f'n:t4:2i*w>\u007f'h:ysy:j;\u007f!"), invalidAlgorithmParameterException);
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new sprtqg(sprvjn.cfr_renamed_9("0L'Q'\u001e&[!J<P2\u001e4M,S8[!L<]u]<N=['"), generalSecurityException);
        }
        catch (IOException iOException) {
            throw new sprtqg(sprdfj.cfr_renamed_9("6h!u!: \u007f'n:t4:2i*w>\u007f'h:ysy:j;\u007f!"), iOException);
        }
    }

    public sprktg() {
        sprktg sprktg2 = this;
        this.cfr_renamed_2 = new sprcyg(new sprrul());
        sprktg2.cfr_renamed_1 = new sprcyg(new sprrul());
        this.cfr_renamed_3 = new sprvah(this.cfr_renamed_1);
        this.cfr_renamed_91 = new sprjzg();
        this.cfr_renamed_0 = new sprmwg();
    }

    public sprktg cfr_renamed_4051(Provider arg0) {
        sprktg sprktg2 = this;
        this.cfr_renamed_1 = new sprcyg(new sprkhi(arg0));
        sprktg2.cfr_renamed_3 = new sprvah(this.cfr_renamed_1);
        return this;
    }

    private /* synthetic */ void cfr_renamed_7935(Cipher arg0, int arg1, byte[] arg2) {
        if (arg1 > 0) {
            if (arg2.length - 2 > arg1) {
                arg0.update(arg2, 3, arg2.length - 3);
                return;
            }
            if (arg1 > arg2.length - 2) {
                arg0.update(new byte[arg1 - (arg2.length - 2)]);
            }
            arg0.update(arg2, 2, arg2.length - 2);
            return;
        }
        arg0.update(arg2, 2, arg2.length - 2);
    }

    public sprktg cfr_renamed_1499(String string) {
        this.cfr_renamed_2 = new sprcyg(new sprxil(string));
        this.cfr_renamed_91.cfr_renamed_1499(string);
        this.cfr_renamed_1 = this.cfr_renamed_2;
        this.cfr_renamed_3 = new sprvah(this.cfr_renamed_1);
        return this;
    }

    public static /* synthetic */ int cfr_renamed_7936(sprktg arg0, PrivateKey arg1) {
        return arg0.cfr_renamed_7931(arg1);
    }

    public static /* synthetic */ sprvah cfr_renamed_7937(sprktg arg0) {
        return arg0.cfr_renamed_3;
    }

    public static /* synthetic */ byte[] cfr_renamed_7938(sprktg arg0, sprjzg arg1, sprmah arg2, byte[][] arg3) throws sprtqg {
        return arg0.cfr_renamed_7933(arg1, arg2, arg3);
    }

    public static /* synthetic */ sprcyg cfr_renamed_7939(sprktg arg0) {
        return arg0.cfr_renamed_1;
    }

    public sprti cfr_renamed_7940(sprmah arg0) {
        return new sprqsg(this, arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ byte[] cfr_renamed_7930(int arg0, PrivateKey arg1, int arg2, byte[][] arg3) throws sprtqg {
        Cipher cipher;
        Cipher cipher2 = this.cfr_renamed_2.cfr_renamed_7924(arg0);
        try {
            cipher2.init(2, arg1);
        }
        catch (InvalidKeyException invalidKeyException) {
            throw new sprtqg(sprvjn.cfr_renamed_9("0L'Q'\u001e&[!J<P2\u001e4M,S8[!L<]u]<N=['"), invalidKeyException);
        }
        if (arg0 == 2 || arg0 == 1) {
            this.cfr_renamed_7935(cipher2, arg2, arg3[0]);
            cipher = cipher2;
            return cipher.doFinal();
        }
        Cipher cipher3 = cipher2;
        this.cfr_renamed_7935(cipher3, arg2, arg3[0]);
        this.cfr_renamed_7935(cipher3, arg2, arg3[1]);
        try {
            cipher = cipher2;
            return cipher.doFinal();
        }
        catch (Exception exception) {
            throw new sprtqg(sprdfj.cfr_renamed_9("6b0\u007f#n:u=:7\u007f0h*j's=}si6i s<ts~2n2"), exception);
        }
    }
}

