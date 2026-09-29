/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbfaa;
import com.spire.presentation.packages.sprdg;
import com.spire.presentation.packages.sprfap;
import com.spire.presentation.packages.sprfbe;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprgbe;
import com.spire.presentation.packages.sprgza;
import com.spire.presentation.packages.sprhn;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.spritd;
import com.spire.presentation.packages.sprkee;
import com.spire.presentation.packages.sprkvd;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sproa;
import com.spire.presentation.packages.sproab;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprrwd;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprzje;
import java.io.IOException;
import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

public class spruya {
    private Cipher cfr_renamed_272;
    private AlgorithmParameterGenerator cfr_renamed_145;
    private SecretKeyFactory cfr_renamed_114;
    public static final String cfr_renamed_96;
    private SecretKey cfr_renamed_105;
    private char[] cfr_renamed_137;
    private sprhn cfr_renamed_79;
    public static final String cfr_renamed_107;
    public static final String cfr_renamed_132;
    public static final String cfr_renamed_102;
    public static final String cfr_renamed_93;
    private AlgorithmParameters cfr_renamed_86;
    private sprtzd cfr_renamed_152;
    public static final String cfr_renamed_112;
    private SecureRandom cfr_renamed_119;
    public static final String cfr_renamed_91;
    public static final String cfr_renamed_0;
    public static final String cfr_renamed_1;
    public int cfr_renamed_2;
    public byte[] cfr_renamed_3;
    public static final String cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spruya(sprtzd sprtzd2) {
        void arg0;
        spruya spruya2 = this;
        spruya spruya3 = this;
        spruya3.cfr_renamed_79 = new sprkvd();
        spruya2.cfr_renamed_152 = arg0;
        spruya2.cfr_renamed_2 = 2048;
    }

    static {
        cfr_renamed_0 = sprdg.cfr_renamed_287.cfr_renamed_19();
        cfr_renamed_4 = sprdg.cfr_renamed_152.cfr_renamed_19();
        cfr_renamed_93 = sprdg.cfr_renamed_102.cfr_renamed_19();
        cfr_renamed_107 = sprm.cfr_renamed_1262.cfr_renamed_19();
        cfr_renamed_1 = sprm.cfr_renamed_813.cfr_renamed_19();
        cfr_renamed_91 = sprm.cfr_renamed_1480.cfr_renamed_19();
        cfr_renamed_96 = sprm.cfr_renamed_805.cfr_renamed_19();
        cfr_renamed_132 = sprm.cfr_renamed_613.cfr_renamed_19();
        cfr_renamed_102 = sprm.cfr_renamed_119.cfr_renamed_19();
        cfr_renamed_112 = sprm.cfr_renamed_1512.cfr_renamed_19();
    }

    public spruya cfr_renamed_1613(SecureRandom arg0) {
        this.cfr_renamed_119 = arg0;
        return this;
    }

    public spruya cfr_renamed_1614(char[] arg0) {
        this.cfr_renamed_137 = arg0;
        return this;
    }

    public static /* synthetic */ Cipher cfr_renamed_1615(spruya arg0) {
        return arg0.cfr_renamed_272;
    }

    /*
     * WARNING - void declaration
     */
    public spruya cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_79 = new spritd((Provider)arg0);
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sproa cfr_renamed_1451() throws sprfya {
        sprije sprije2;
        this.cfr_renamed_3 = new byte[20];
        if (this.cfr_renamed_119 == null) {
            spruya spruya2 = this;
            spruya2.cfr_renamed_119 = new SecureRandom();
        }
        spruya spruya3 = this;
        spruya3.cfr_renamed_119.nextBytes(spruya3.cfr_renamed_3);
        try {
            spruya spruya4 = this;
            this.cfr_renamed_272 = spruya4.cfr_renamed_79.cfr_renamed_1496(this.cfr_renamed_152.cfr_renamed_19());
            if (sprgza.cfr_renamed_1593(spruya4.cfr_renamed_152)) {
                this.cfr_renamed_145 = this.cfr_renamed_79.cfr_renamed_107(this.cfr_renamed_152.cfr_renamed_19());
            } else {
                spruya spruya5 = this;
                spruya5.cfr_renamed_114 = spruya5.cfr_renamed_79.cfr_renamed_1495(spruya5.cfr_renamed_152.cfr_renamed_19());
            }
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new sprfya(this.cfr_renamed_152 + sprbfaa.cfr_renamed_9("\"WmM\"XtXkUc[n\\8\u0019") + generalSecurityException.getMessage(), generalSecurityException);
        }
        if (sprgza.cfr_renamed_1593(this.cfr_renamed_152)) {
            this.cfr_renamed_86 = this.cfr_renamed_145.generateParameters();
            try {
                sprlre sprlre2;
                spruya spruya6 = this;
                sprzje sprzje2 = new sprzje(spruya6.cfr_renamed_152, sprvva.cfr_renamed_184(spruya6.cfr_renamed_86.getEncoded()));
                spruya spruya7 = this;
                sprzje sprzje3 = new sprzje(sprm.cfr_renamed_1217, new sprkee(spruya7.cfr_renamed_3, spruya7.cfr_renamed_2));
                sprlre sprlre3 = sprlre2 = new sprlre();
                sprlre3.cfr_renamed_49(sprzje3);
                sprlre3.cfr_renamed_49(sprzje2);
                sprije2 = new sprije(sprm.cfr_renamed_1494, sprgbe.cfr_renamed_23(new sprpse(sprlre2)));
            }
            catch (IOException iOException) {
                throw new sprfya(iOException.getMessage(), iOException);
            }
            spruya spruya8 = this;
            this.cfr_renamed_105 = sprgza.cfr_renamed_1605(this.cfr_renamed_152.cfr_renamed_19(), spruya8.cfr_renamed_137, spruya8.cfr_renamed_3, this.cfr_renamed_2);
            try {
                spruya spruya9 = this;
                this.cfr_renamed_272.init(1, (Key)spruya9.cfr_renamed_105, spruya9.cfr_renamed_86);
                return new sproab(this, sprije2);
            }
            catch (GeneralSecurityException generalSecurityException) {
                throw new sprfya(generalSecurityException.getMessage(), generalSecurityException);
            }
        }
        if (!sprgza.cfr_renamed_1492(this.cfr_renamed_152)) throw new sprfya(new StringBuilder().insert(0, sprfap.cfr_renamed_9("A]_][DZ\u0013U_S\\FZ@[Y\t\u0014")).append(this.cfr_renamed_152).toString(), null);
        sprlre sprlre4 = new sprlre();
        sprlre4.cfr_renamed_49(new sprlqe(this.cfr_renamed_3));
        sprlre4.cfr_renamed_49(new sprooe(this.cfr_renamed_2));
        sprije2 = new sprije(this.cfr_renamed_152, sprfbe.cfr_renamed_23(new sprpse(sprlre4)));
        try {
            PBEKeySpec pBEKeySpec = new PBEKeySpec(this.cfr_renamed_137);
            spruya spruya10 = this;
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(spruya10.cfr_renamed_3, spruya10.cfr_renamed_2);
            spruya spruya11 = this;
            spruya11.cfr_renamed_105 = spruya11.cfr_renamed_114.generateSecret(pBEKeySpec);
            spruya11.cfr_renamed_272.init(1, (Key)this.cfr_renamed_105, pBEParameterSpec);
            return new sproab(this, sprije2);
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new sprfya(generalSecurityException.getMessage(), generalSecurityException);
        }
    }

    /*
     * WARNING - void declaration
     */
    public spruya cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_79 = new sprrwd((String)arg0);
        return this;
    }

    public spruya cfr_renamed_1616(int arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    public static /* synthetic */ SecretKey cfr_renamed_1617(spruya arg0) {
        return arg0.cfr_renamed_105;
    }
}

