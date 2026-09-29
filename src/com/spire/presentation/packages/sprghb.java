/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprba;
import com.spire.presentation.packages.sprfbe;
import com.spire.presentation.packages.sprfm;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprgbe;
import com.spire.presentation.packages.sprhn;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.spritd;
import com.spire.presentation.packages.sprkee;
import com.spire.presentation.packages.sprkvd;
import com.spire.presentation.packages.sprlfe;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmln;
import com.spire.presentation.packages.sproa;
import com.spire.presentation.packages.sprqlfa;
import com.spire.presentation.packages.sprrwd;
import com.spire.presentation.packages.sprrxa;
import com.spire.presentation.packages.sprsya;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprzje;
import java.security.Key;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

public class sprghb {
    private sprhn cfr_renamed_0;
    private sprtzd cfr_renamed_1;
    private sprtzd cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private sprba cfr_renamed_4;

    public static /* synthetic */ boolean cfr_renamed_1491(sprghb arg0, sprtzd arg1) {
        return arg0.cfr_renamed_1492(arg1);
    }

    private /* synthetic */ boolean cfr_renamed_1492(sprtzd arg0) {
        return arg0.cfr_renamed_1493(sprm.cfr_renamed_580) || arg0.cfr_renamed_1493(sprfm.cfr_renamed_119) || arg0.cfr_renamed_1493(sprfm.cfr_renamed_0);
    }

    /*
     * WARNING - void declaration
     */
    public sprghb(sprtzd sprtzd2) {
        void arg0;
        sprghb sprghb2 = this;
        this.cfr_renamed_0 = new sprkvd();
        this.cfr_renamed_4 = sprsya.cfr_renamed_3;
        if (this.cfr_renamed_1492(sprtzd2)) {
            sprghb sprghb3 = this;
            sprghb3.cfr_renamed_2 = arg0;
            sprghb3.cfr_renamed_1 = arg0;
            return;
        }
        this.cfr_renamed_2 = sprm.cfr_renamed_1494;
        this.cfr_renamed_1 = arg0;
    }

    public sproa cfr_renamed_1480(char[] arg0) throws sprfya {
        if (this.cfr_renamed_3 == null) {
            sprghb sprghb2 = this;
            sprghb2.cfr_renamed_3 = new SecureRandom();
        }
        byte[] byArray = new byte[20];
        this.cfr_renamed_3.nextBytes(byArray);
        try {
            sprije sprije2;
            Cipher cipher;
            if (this.cfr_renamed_2.cfr_renamed_1493(sprm.cfr_renamed_580)) {
                PBEKeySpec pBEKeySpec = new PBEKeySpec(arg0);
                sprghb sprghb3 = this;
                SecretKeyFactory secretKeyFactory = this.cfr_renamed_0.cfr_renamed_1495(sprghb3.cfr_renamed_2.cfr_renamed_19());
                PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(byArray, 1024);
                SecretKey secretKey = secretKeyFactory.generateSecret(pBEKeySpec);
                cipher = sprghb3.cfr_renamed_0.cfr_renamed_1496(this.cfr_renamed_2.cfr_renamed_19());
                cipher.init(1, (Key)secretKey, pBEParameterSpec);
                sprije2 = new sprije(this.cfr_renamed_2, new sprfbe(byArray, 1024));
            } else if (this.cfr_renamed_2.equals(sprm.cfr_renamed_1494)) {
                sprghb sprghb4 = this;
                SecretKeyFactory secretKeyFactory = sprghb4.cfr_renamed_0.cfr_renamed_1495(sprm.cfr_renamed_1217.cfr_renamed_19());
                SecretKey secretKey = secretKeyFactory.generateSecret(new PBEKeySpec(arg0, byArray, 1024, this.cfr_renamed_4.cfr_renamed_1497(new sprije(this.cfr_renamed_1))));
                cipher = sprghb4.cfr_renamed_0.cfr_renamed_1496(this.cfr_renamed_1.cfr_renamed_19());
                cipher.init(1, (Key)secretKey, this.cfr_renamed_3);
                sprgbe sprgbe2 = new sprgbe(new sprzje(sprm.cfr_renamed_1217, new sprkee(byArray, 1024)), new sprlfe(this.cfr_renamed_1, sprvva.cfr_renamed_184(cipher.getParameters().getEncoded())));
                sprije2 = new sprije(this.cfr_renamed_2, sprgbe2);
            } else {
                throw new sprfya(sprqlfa.cfr_renamed_9("AqFzWpSq]lQ{\u0014~Xx[m]k\\r"));
            }
            return new sprrxa(this, sprije2, cipher, arg0);
        }
        catch (Exception exception) {
            throw new sprfya(new StringBuilder().insert(0, sprmln.cfr_renamed_9("w2c>n9\"(m|a.g=v9\"\u0013w(r)v\u0019l?p%r(m.8|")).append(exception.getMessage()).toString(), exception);
        }
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ 3;
        int cfr_ignored_0 = 4 << 4 ^ (2 << 2 ^ 3);
        int n4 = n2;
        int n5 = 3;
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

    /*
     * WARNING - void declaration
     */
    public sprghb cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_0 = new spritd((Provider)arg0);
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprghb cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_0 = new sprrwd((String)arg0);
        return this;
    }

    public sprghb cfr_renamed_1500(sprba arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }
}

