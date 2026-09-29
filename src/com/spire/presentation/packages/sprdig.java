/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcm;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprfdi;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprmkg;
import com.spire.presentation.packages.sprogg;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprpgaa;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprsf;
import com.spire.presentation.packages.sprtmm;
import com.spire.presentation.packages.sprwmr;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.sprxil;
import com.spire.presentation.packages.spryrm;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.Mac;
import javax.crypto.SecretKey;

public class sprdig {
    public static final sprddm cfr_renamed_96 = new sprddm(sprdl.cfr_renamed_3240, sprpen.cfr_renamed_4);
    private int cfr_renamed_105;
    private sprddm cfr_renamed_137;
    private byte[] cfr_renamed_79;
    public static final sprddm cfr_renamed_107;
    private spryrm cfr_renamed_132;
    private sprrr cfr_renamed_102;
    public static final sprddm cfr_renamed_93;
    private int cfr_renamed_86;
    public static final sprddm cfr_renamed_152;
    private static final sprmkg cfr_renamed_112;
    private int cfr_renamed_119;
    private SecureRandom cfr_renamed_91;
    public static final sprddm cfr_renamed_0;
    private sprddm cfr_renamed_1;
    public static final sprddm cfr_renamed_2;
    public static final sprddm cfr_renamed_3;
    public static final sprddm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprdig cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_102 = new sprkhi((Provider)arg0);
        return this;
    }

    public sprdig cfr_renamed_7401(sprrr arg0) {
        this.cfr_renamed_102 = arg0;
        return this;
    }

    public sprdig cfr_renamed_4337(int arg0) {
        this.cfr_renamed_86 = arg0;
        return this;
    }

    static {
        cfr_renamed_3 = new sprddm(sprdl.cfr_renamed_131, sprpen.cfr_renamed_4);
        cfr_renamed_93 = new sprddm(sprdl.cfr_renamed_1223, sprpen.cfr_renamed_4);
        cfr_renamed_0 = new sprddm(sprdl.cfr_renamed_2956, sprpen.cfr_renamed_4);
        cfr_renamed_4 = new sprddm(sprwr.cfr_renamed_105);
        cfr_renamed_152 = new sprddm(sprwr.cfr_renamed_728);
        cfr_renamed_2 = new sprddm(sprwr.cfr_renamed_145);
        cfr_renamed_107 = new sprddm(sprwr.cfr_renamed_119);
        cfr_renamed_112 = new sprmkg();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprsf cfr_renamed_1480(char[] arg0) throws sprhjg {
        if (this.cfr_renamed_91 == null) {
            sprdig sprdig2 = this;
            sprdig2.cfr_renamed_91 = new SecureRandom();
        }
        try {
            sprdig sprdig3;
            Mac mac;
            block6: {
                block5: {
                    block4: {
                        sprdig sprdig4 = this;
                        mac = sprdig4.cfr_renamed_102.cfr_renamed_1508(sprdig4.cfr_renamed_1.cfr_renamed_593().cfr_renamed_19());
                        if (sprdig4.cfr_renamed_132 != null) break block4;
                        if (this.cfr_renamed_79 != null) break block5;
                        if (this.cfr_renamed_86 < 0) {
                            this.cfr_renamed_86 = mac.getMacLength();
                        }
                        sprdig sprdig5 = this;
                        sprdig3 = sprdig5;
                        sprdig5.cfr_renamed_79 = new byte[sprdig5.cfr_renamed_86];
                        sprdig5.cfr_renamed_91.nextBytes(this.cfr_renamed_79);
                        break block6;
                    }
                    sprdig sprdig6 = this;
                    sprdig6.cfr_renamed_79 = sprdig6.cfr_renamed_132.cfr_renamed_1477();
                    sprdig6.cfr_renamed_105 = sprhdf.cfr_renamed_5225(sprdig6.cfr_renamed_132.cfr_renamed_1478());
                    sprdig6.cfr_renamed_119 = sprhdf.cfr_renamed_5225(sprdig6.cfr_renamed_132.cfr_renamed_4600()) * 8;
                }
                sprdig3 = this;
            }
            sprdig sprdig7 = this;
            sprdig sprdig8 = this;
            SecretKey secretKey = sprdig3.cfr_renamed_102.cfr_renamed_1495(sprwmr.cfr_renamed_9("6E-C 5")).generateSecret(new sprfdi(arg0, sprdig7.cfr_renamed_79, sprdig7.cfr_renamed_105, sprdig8.cfr_renamed_119, sprdig8.cfr_renamed_137));
            mac.init(secretKey);
            return new sprogg(this, mac, secretKey);
        }
        catch (Exception exception) {
            throw new sprhjg(new StringBuilder().insert(0, sprpgaa.cfr_renamed_9("t\u000b`\u0007m\u0000!\u0011nEb\u0017d\u0004u\u0000!(@&!\u0006`\tb\u0010m\u0004u\ns_!")).append(exception.getMessage()).toString(), exception);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprdig cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_102 = new sprxil((String)arg0);
        return this;
    }

    public static /* synthetic */ sprddm cfr_renamed_7402(sprdig arg0) {
        return arg0.cfr_renamed_1;
    }

    public sprdig cfr_renamed_7403(sprddm arg0) {
        this.cfr_renamed_137 = arg0;
        return this;
    }

    public sprdig cfr_renamed_7404(byte[] arg0) {
        this.cfr_renamed_79 = arg0;
        return this;
    }

    public sprdig(String arg0, int arg1) {
        this(arg0, arg1, cfr_renamed_112);
    }

    public static /* synthetic */ int cfr_renamed_7405(sprdig arg0) {
        return arg0.cfr_renamed_105;
    }

    public static /* synthetic */ sprddm cfr_renamed_7406(sprdig arg0) {
        return arg0.cfr_renamed_137;
    }

    public sprdig cfr_renamed_1616(int arg0) {
        this.cfr_renamed_105 = arg0;
        return this;
    }

    public sprdig cfr_renamed_1613(SecureRandom arg0) {
        this.cfr_renamed_91 = arg0;
        return this;
    }

    public static /* synthetic */ byte[] cfr_renamed_7407(sprdig arg0) {
        return arg0.cfr_renamed_79;
    }

    /*
     * WARNING - void declaration
     */
    public sprdig(String string, int n, sprcm sprcm2) {
        void arg0;
        void arg2;
        sprdig sprdig2 = this;
        sprdig sprdig3 = this;
        sprdig sprdig4 = this;
        sprdig sprdig5 = this;
        sprdig5.cfr_renamed_102 = new sprrul();
        sprdig4.cfr_renamed_86 = -1;
        sprdig4.cfr_renamed_105 = 8192;
        sprdig3.cfr_renamed_132 = null;
        sprdig3.cfr_renamed_137 = cfr_renamed_3;
        sprdig3.cfr_renamed_79 = null;
        sprdig2.cfr_renamed_1 = arg2.cfr_renamed_1494((String)arg0);
        sprdig2.cfr_renamed_119 = n;
    }

    /*
     * WARNING - void declaration
     */
    public sprdig(sprtmm sprtmm2) {
        void arg0;
        sprdig sprdig2 = this;
        sprdig sprdig3 = this;
        sprdig sprdig4 = this;
        sprdig sprdig5 = this;
        sprdig5.cfr_renamed_102 = new sprrul();
        sprdig4.cfr_renamed_86 = -1;
        sprdig4.cfr_renamed_105 = 8192;
        sprdig3.cfr_renamed_132 = null;
        sprdig3.cfr_renamed_137 = cfr_renamed_3;
        sprdig3.cfr_renamed_79 = null;
        sprdig2.cfr_renamed_1 = arg0.cfr_renamed_7408();
        sprdig2.cfr_renamed_132 = spryrm.cfr_renamed_23(sprtmm2.cfr_renamed_2429().cfr_renamed_284());
    }

    public static /* synthetic */ int cfr_renamed_7409(sprdig arg0) {
        return arg0.cfr_renamed_119;
    }
}

