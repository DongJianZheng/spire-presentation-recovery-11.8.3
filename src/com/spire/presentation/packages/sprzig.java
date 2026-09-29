/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbqm;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprcwj;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprewi;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprhlg;
import com.spire.presentation.packages.sprisga;
import com.spire.presentation.packages.spritm;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmgg;
import com.spire.presentation.packages.sprmh;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqrm;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprwpm;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxil;
import com.spire.presentation.packages.spryrm;
import java.io.IOException;
import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public class sprzig {
    public static final String cfr_renamed_272;
    private SecretKey cfr_renamed_145;
    private char[] cfr_renamed_114;
    public static final String cfr_renamed_96;
    public static final String cfr_renamed_105;
    public static final String cfr_renamed_137;
    public static final String cfr_renamed_79;
    public static final String cfr_renamed_107;
    private sprrr cfr_renamed_132;
    private sprlem cfr_renamed_102;
    public static final String cfr_renamed_93;
    public static final String cfr_renamed_86;
    private Cipher cfr_renamed_152;
    public byte[] cfr_renamed_112;
    private AlgorithmParameters cfr_renamed_119;
    private sprddm cfr_renamed_91;
    private AlgorithmParameterGenerator cfr_renamed_0;
    public static final String cfr_renamed_1;
    public int cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    public static final String cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprzig cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_132 = new sprkhi((Provider)arg0);
        return this;
    }

    static {
        cfr_renamed_137 = sprwr.cfr_renamed_88.cfr_renamed_19();
        cfr_renamed_272 = sprwr.cfr_renamed_1223.cfr_renamed_19();
        cfr_renamed_93 = sprwr.cfr_renamed_724.cfr_renamed_19();
        cfr_renamed_96 = sprdl.cfr_renamed_2797.cfr_renamed_19();
        cfr_renamed_86 = sprdl.cfr_renamed_272.cfr_renamed_19();
        cfr_renamed_4 = sprdl.cfr_renamed_1454.cfr_renamed_19();
        cfr_renamed_107 = sprdl.cfr_renamed_954.cfr_renamed_19();
        cfr_renamed_79 = sprdl.cfr_renamed_805.cfr_renamed_19();
        cfr_renamed_1 = sprdl.cfr_renamed_1260.cfr_renamed_19();
        cfr_renamed_105 = sprdl.cfr_renamed_2.cfr_renamed_19();
    }

    public static /* synthetic */ SecretKey cfr_renamed_7513(sprzig arg0) {
        return arg0.cfr_renamed_145;
    }

    /*
     * WARNING - void declaration
     */
    public sprzig cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_132 = new sprxil((String)arg0);
        return this;
    }

    public sprzig cfr_renamed_7380(sprddm arg0) {
        this.cfr_renamed_91 = arg0;
        return this;
    }

    public sprzig cfr_renamed_1613(SecureRandom arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    public static /* synthetic */ Cipher cfr_renamed_7514(sprzig arg0) {
        return arg0.cfr_renamed_152;
    }

    public sprzig cfr_renamed_1616(int arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprzig(sprlem sprlem2) {
        void arg0;
        sprzig sprzig2 = this;
        sprzig sprzig3 = this;
        this.cfr_renamed_132 = new sprrul();
        sprzig3.cfr_renamed_91 = new sprddm(sprdl.cfr_renamed_1763, sprpen.cfr_renamed_4);
        sprzig2.cfr_renamed_102 = arg0;
        sprzig2.cfr_renamed_2 = 2048;
    }

    public sprzig cfr_renamed_1614(char[] arg0) {
        this.cfr_renamed_114 = arg0;
        return this;
    }

    public sprzig cfr_renamed_2286(char[] arg0) {
        this.cfr_renamed_114 = arg0;
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprmh cfr_renamed_1451() throws sprhjg {
        sprddm sprddm2;
        if (this.cfr_renamed_3 == null) {
            sprzig sprzig2 = this;
            sprzig2.cfr_renamed_3 = new SecureRandom();
        }
        try {
            sprzig sprzig3 = this;
            this.cfr_renamed_152 = sprzig3.cfr_renamed_132.cfr_renamed_1496(sprmgg.cfr_renamed_7505(this.cfr_renamed_102));
            if (sprmgg.cfr_renamed_7509(sprzig3.cfr_renamed_102)) {
                this.cfr_renamed_0 = this.cfr_renamed_132.cfr_renamed_107(this.cfr_renamed_102.cfr_renamed_19());
            }
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new sprhjg(this.cfr_renamed_102 + sprewi.cfr_renamed_9(":3u):<l<s1{?v8 }") + generalSecurityException.getMessage(), generalSecurityException);
        }
        if (sprmgg.cfr_renamed_7509(this.cfr_renamed_102)) {
            sprzig sprzig4 = this;
            sprzig4.cfr_renamed_112 = new byte[sprmgg.cfr_renamed_7356(sprzig4.cfr_renamed_91.cfr_renamed_593())];
            sprzig4.cfr_renamed_3.nextBytes(this.cfr_renamed_112);
            sprzig4.cfr_renamed_119 = sprzig4.cfr_renamed_0.generateParameters();
            try {
                sprrvm sprrvm2;
                sprzig sprzig5 = this;
                sprbqm sprbqm2 = new sprbqm(sprzig5.cfr_renamed_102, sprxgf.cfr_renamed_184(sprzig5.cfr_renamed_119.getEncoded()));
                sprzig sprzig6 = this;
                sprwpm sprwpm2 = new sprwpm(sprdl.cfr_renamed_3247, new spryrm(sprzig6.cfr_renamed_112, sprzig6.cfr_renamed_2, this.cfr_renamed_91));
                sprrvm sprrvm3 = sprrvm2 = new sprrvm();
                sprrvm3.cfr_renamed_5004(sprwpm2);
                sprrvm3.cfr_renamed_5004(sprbqm2);
                sprddm2 = new sprddm(sprdl.cfr_renamed_112, spritm.cfr_renamed_23(new sprcen(sprrvm2)));
            }
            catch (IOException iOException) {
                throw new sprhjg(iOException.getMessage(), iOException);
            }
            {
                sprzig sprzig7;
                sprzig sprzig8 = this;
                if (sprmgg.cfr_renamed_7504(this.cfr_renamed_91)) {
                    sprzig sprzig9 = this;
                    sprzig sprzig10 = this;
                    sprzig8.cfr_renamed_145 = sprmgg.cfr_renamed_7507(sprzig9.cfr_renamed_132, sprzig9.cfr_renamed_102.cfr_renamed_19(), sprzig10.cfr_renamed_114, sprzig10.cfr_renamed_112, this.cfr_renamed_2);
                    sprzig7 = this;
                } else {
                    sprzig sprzig11 = this;
                    sprzig sprzig12 = this;
                    sprzig sprzig13 = this;
                    sprzig8.cfr_renamed_145 = sprmgg.cfr_renamed_7506(sprzig11.cfr_renamed_132, sprzig11.cfr_renamed_102.cfr_renamed_19(), sprzig12.cfr_renamed_114, sprzig12.cfr_renamed_112, sprzig13.cfr_renamed_2, sprzig13.cfr_renamed_91);
                    sprzig7 = this;
                }
                sprzig sprzig14 = this;
                sprzig7.cfr_renamed_152.init(1, (Key)sprzig14.cfr_renamed_145, sprzig14.cfr_renamed_119);
                return new sprhlg(this, sprddm2);
            }
        }
        if (!sprmgg.cfr_renamed_7379(this.cfr_renamed_102)) throw new sprhjg(new StringBuilder().insert(0, sprisga.cfr_renamed_9("M2S2W+V|Y0_3J5L4Uf\u0018")).append(this.cfr_renamed_102).toString(), null);
        sprrvm sprrvm4 = new sprrvm();
        this.cfr_renamed_112 = new byte[20];
        this.cfr_renamed_3.nextBytes(this.cfr_renamed_112);
        sprrvm4.cfr_renamed_5004(new sprfvg(this.cfr_renamed_112));
        sprrvm4.cfr_renamed_5004(new sprktm(this.cfr_renamed_2));
        sprddm2 = new sprddm(this.cfr_renamed_102, sprqrm.cfr_renamed_23(new sprcen(sprrvm4)));
        try {
            sprzig sprzig15 = this;
            this.cfr_renamed_152.init(1, new sprcwj(sprzig15.cfr_renamed_114, sprzig15.cfr_renamed_112, this.cfr_renamed_2));
            return new sprhlg(this, sprddm2);
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new sprhjg(generalSecurityException.getMessage(), generalSecurityException);
        }
    }
}

