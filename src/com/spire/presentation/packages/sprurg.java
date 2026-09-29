/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprazo;
import com.spire.presentation.packages.sprcgm;
import com.spire.presentation.packages.sprcwg;
import com.spire.presentation.packages.sprcyg;
import com.spire.presentation.packages.sprghm;
import com.spire.presentation.packages.sprhrm;
import com.spire.presentation.packages.sprifm;
import com.spire.presentation.packages.sprjzg;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprkrg;
import com.spire.presentation.packages.sprmwg;
import com.spire.presentation.packages.sprmxg;
import com.spire.presentation.packages.sproah;
import com.spire.presentation.packages.sprobi;
import com.spire.presentation.packages.sprolha;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprvbh;
import com.spire.presentation.packages.sprvdm;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxil;
import com.spire.presentation.packages.spryqg;
import java.io.IOException;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class sprurg
extends spryqg {
    private sprjzg cfr_renamed_1;
    private sprcyg cfr_renamed_2;
    private static final byte cfr_renamed_3 = 64;
    private SecureRandom cfr_renamed_4;

    public sprurg cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public sprurg cfr_renamed_1499(String arg0) {
        this.cfr_renamed_2 = new sprcyg(new sprxil(arg0));
        this.cfr_renamed_1.cfr_renamed_1499(arg0);
        return this;
    }

    @Override
    public byte[] cfr_renamed_7884(sprvbh arg0, byte[] arg1) throws sprtqg {
        PublicKey publicKey;
        block9: {
            KeyAgreement keyAgreement;
            String string;
            sprobi sprobi2;
            sprvdm sprvdm2;
            sprifm sprifm2;
            block10: {
                KeyAgreement keyAgreement2;
                publicKey = this.cfr_renamed_1.cfr_renamed_7926(arg0);
                if (arg0.cfr_renamed_593() != 18) break block9;
                sprifm2 = arg0.cfr_renamed_7735();
                sprvdm2 = (sprvdm)sprifm2.cfr_renamed_1521();
                sprobi2 = new sprobi(sprcwg.cfr_renamed_7876(sprifm2, new sprmwg()));
                sprvdm sprvdm3 = sprvdm2;
                string = sprcwg.cfr_renamed_7875(sprvdm3.cfr_renamed_7877()).cfr_renamed_19();
                if (!sprvdm3.cfr_renamed_7813().cfr_renamed_5078(sprhrm.cfr_renamed_2)) break block10;
                sprurg sprurg2 = this;
                KeyPairGenerator keyPairGenerator = sprurg2.cfr_renamed_2.cfr_renamed_2381("X25519");
                keyPairGenerator.initialize(255, this.cfr_renamed_4);
                KeyPair keyPair = keyPairGenerator.generateKeyPair();
                KeyAgreement keyAgreement3 = keyAgreement2 = sprurg2.cfr_renamed_2.cfr_renamed_2382(sprcwg.cfr_renamed_7874(sprifm2));
                keyAgreement3.init((Key)keyPair.getPrivate(), sprobi2);
                keyAgreement3.doPhase(publicKey, true);
                SecretKey secretKey = keyAgreement2.generateSecret(string);
                sprvhm sprvhm2 = sprvhm.cfr_renamed_23(keyPair.getPublic().getEncoded());
                byte[] byArray = sproze.cfr_renamed_560(sprvhm2.cfr_renamed_2314().cfr_renamed_81(), (byte)64);
                return sprurg2.cfr_renamed_7927(sprvdm2, arg1, secretKey, byArray);
            }
            sprurg sprurg3 = this;
            AlgorithmParameters algorithmParameters = sprurg3.cfr_renamed_2.cfr_renamed_1540("EC");
            algorithmParameters.init(new sprcgm(sprvdm2.cfr_renamed_7813()).cfr_renamed_91());
            KeyPairGenerator keyPairGenerator = sprurg3.cfr_renamed_2.cfr_renamed_2381("EC");
            keyPairGenerator.initialize(algorithmParameters.getParameterSpec(AlgorithmParameterSpec.class), this.cfr_renamed_4);
            KeyPair keyPair = keyPairGenerator.generateKeyPair();
            KeyAgreement keyAgreement4 = keyAgreement = sprurg3.cfr_renamed_2.cfr_renamed_2382(sprcwg.cfr_renamed_7873(sprifm2));
            keyAgreement4.init((Key)keyPair.getPrivate(), sprobi2);
            keyAgreement4.doPhase(publicKey, true);
            SecretKey secretKey = keyAgreement.generateSecret(string);
            sprvhm sprvhm3 = sprvhm.cfr_renamed_23(keyPair.getPublic().getEncoded());
            byte[] byArray = sprvhm3.cfr_renamed_2314().cfr_renamed_81();
            if (null == byArray || byArray.length < 1 || byArray[0] != 4) {
                byArray = sprkrg.cfr_renamed_7928(sprvdm2.cfr_renamed_7813()).cfr_renamed_1769().cfr_renamed_2002(byArray).cfr_renamed_1972(false);
            }
            return this.cfr_renamed_7927(sprvdm2, arg1, secretKey, byArray);
        }
        try {
            Cipher cipher;
            Cipher cipher2 = cipher = this.cfr_renamed_2.cfr_renamed_7924(arg0.cfr_renamed_593());
            cipher2.init(1, (Key)publicKey, this.cfr_renamed_4);
            return cipher2.doFinal(arg1);
        }
        catch (IllegalBlockSizeException illegalBlockSizeException) {
            throw new sprtqg(new StringBuilder().insert(0, sprazo.cfr_renamed_9("}LxEsAx\u0000vL{C\u007f\u0000gInE.\u0000")).append(illegalBlockSizeException.getMessage()).toString(), illegalBlockSizeException);
        }
        catch (BadPaddingException badPaddingException) {
            throw new sprtqg(new StringBuilder().insert(0, sprolha.cfr_renamed_9("a}g<s}gxjrd&#")).append(badPaddingException.getMessage()).toString(), badPaddingException);
        }
        catch (InvalidKeyException invalidKeyException) {
            throw new sprtqg(new StringBuilder().insert(0, sprazo.cfr_renamed_9("KqY4IzVuL}D.\u0000")).append(invalidKeyException.getMessage()).toString(), invalidKeyException);
        }
        catch (IOException iOException) {
            throw new sprtqg(new StringBuilder().insert(0, sprolha.cfr_renamed_9("im}apf<ws#ym\u007flxf<NLJ&#")).append(iOException.getMessage()).toString(), iOException);
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new sprtqg(new StringBuilder().insert(0, sprazo.cfr_renamed_9("UzAvLq\u0000`O4SqT4Ud\u0000qP|EyEfAx\u0000\u007fEmS.\u0000")).append(generalSecurityException.getMessage()).toString(), generalSecurityException);
        }
    }

    public sprurg(sprvbh sprvbh2) {
        super(sprvbh2);
        sprurg sprurg2 = this;
        this.cfr_renamed_2 = new sprcyg(new sprrul());
        sprurg2.cfr_renamed_1 = new sprjzg();
    }

    private /* synthetic */ byte[] cfr_renamed_7927(sprvdm arg0, byte[] arg1, Key arg2, byte[] arg3) throws GeneralSecurityException, IOException, sprtqg {
        byte[] byArray = sproah.cfr_renamed_7902(arg1, (boolean)this.cfr_renamed_2);
        Cipher cipher = this.cfr_renamed_2.cfr_renamed_7922(arg0.cfr_renamed_7877());
        cipher.init(3, arg2, this.cfr_renamed_4);
        byte[] byArray2 = cipher.wrap(new SecretKeySpec(byArray, sprmxg.cfr_renamed_7548(arg1[0])));
        byte[] byArray3 = new sprghm(new BigInteger(1, arg3)).cfr_renamed_91();
        byte[] byArray4 = new byte[byArray3.length + 1 + byArray2.length];
        System.arraycopy(byArray3, 0, byArray4, 0, byArray3.length);
        byArray4[byArray3.length] = (byte)byArray2.length;
        System.arraycopy(byArray2, 0, byArray4, byArray3.length + 1, byArray2.length);
        return byArray4;
    }

    public sprurg cfr_renamed_1498(Provider arg0) {
        this.cfr_renamed_2 = new sprcyg(new sprkhi(arg0));
        this.cfr_renamed_1.cfr_renamed_1498(arg0);
        return this;
    }
}

