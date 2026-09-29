/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbqm;
import com.spire.presentation.packages.sprcwj;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdfk;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprdpg;
import com.spire.presentation.packages.sprejg;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.spripk;
import com.spire.presentation.packages.spritm;
import com.spire.presentation.packages.sprjv;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlgg;
import com.spire.presentation.packages.sprmfk;
import com.spire.presentation.packages.sprmh;
import com.spire.presentation.packages.sprni;
import com.spire.presentation.packages.sprow;
import com.spire.presentation.packages.sprqom;
import com.spire.presentation.packages.sprqpg;
import com.spire.presentation.packages.sprqrm;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprvpk;
import com.spire.presentation.packages.sprwpm;
import com.spire.presentation.packages.sprxfi;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxil;
import com.spire.presentation.packages.sprxj;
import com.spire.presentation.packages.spryrm;
import com.spire.presentation.packages.sprywa;
import com.spire.presentation.packages.sprzdq;
import java.security.AlgorithmParameters;
import java.security.Key;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class sprrpg {
    private sprni cfr_renamed_152;
    private sprlem cfr_renamed_112;
    private sprvpk cfr_renamed_119;
    private int cfr_renamed_91;
    private SecureRandom cfr_renamed_0;
    private final sprdfk cfr_renamed_1;
    private sprrr cfr_renamed_2;
    private sprlem cfr_renamed_3;
    private sprxj cfr_renamed_4;

    public static /* synthetic */ byte[] cfr_renamed_7377(char[] arg0) {
        return sprrpg.cfr_renamed_1516(arg0);
    }

    public static /* synthetic */ boolean cfr_renamed_7378(sprrpg arg0, sprlem arg1) {
        return arg0.cfr_renamed_7379(arg1);
    }

    public sprrpg cfr_renamed_7380(sprddm arg0) {
        if (this.cfr_renamed_1 != null) {
            throw new IllegalStateException(sprzdq.cfr_renamed_9("Q~V;rId;AtWuV;WhKuE;rYi_d_G}"));
        }
        sprrpg sprrpg2 = this;
        sprrpg2.cfr_renamed_119.cfr_renamed_7381(arg0);
        return sprrpg2;
    }

    /*
     * WARNING - void declaration
     */
    public sprrpg(sprlem sprlem2) {
        void arg0;
        sprrpg sprrpg2 = this;
        sprrpg sprrpg3 = this;
        this.cfr_renamed_2 = new sprrul();
        sprrpg3.cfr_renamed_152 = sprlgg.cfr_renamed_3;
        sprrpg2.cfr_renamed_4 = new sprdpg();
        sprrpg2.cfr_renamed_91 = 1024;
        sprrpg2.cfr_renamed_119 = new sprvpk();
        this.cfr_renamed_1 = null;
        if (this.cfr_renamed_7379(sprlem2)) {
            sprrpg sprrpg4 = this;
            sprrpg4.cfr_renamed_3 = arg0;
            sprrpg4.cfr_renamed_112 = arg0;
            return;
        }
        this.cfr_renamed_3 = sprdl.cfr_renamed_112;
        this.cfr_renamed_112 = arg0;
    }

    public sprrpg cfr_renamed_1616(int arg0) {
        if (this.cfr_renamed_1 != null) {
            throw new IllegalStateException(sprywa.cfr_renamed_9("(r/72c>e:c2x578x.y/7.d2y<7\u000bU\u0010S\u001dS>q"));
        }
        sprrpg sprrpg2 = this;
        sprrpg2.cfr_renamed_91 = arg0;
        sprrpg2.cfr_renamed_119.cfr_renamed_7382(arg0);
        return sprrpg2;
    }

    private static /* synthetic */ byte[] cfr_renamed_1516(char[] arg0) {
        if (arg0 != null && arg0.length > 0) {
            int n;
            byte[] byArray = new byte[(arg0.length + 1) * 2];
            int n2 = n = 0;
            while (n2 != arg0.length) {
                byArray[n * 2] = (byte)(arg0[n] >>> 8);
                int n3 = n * 2 + 1;
                byte by = (byte)arg0[n];
                byArray[n3] = by;
                n2 = ++n;
            }
            return byArray;
        }
        return new byte[0];
    }

    public sprmh cfr_renamed_1480(char[] arg0) throws sprhjg {
        if (this.cfr_renamed_0 == null) {
            sprrpg sprrpg2 = this;
            sprrpg2.cfr_renamed_0 = new SecureRandom();
        }
        try {
            sprddm sprddm2;
            Cipher cipher;
            sprrpg sprrpg3 = this;
            if (sprrpg3.cfr_renamed_7379(sprrpg3.cfr_renamed_3)) {
                byte[] byArray = new byte[20];
                sprrpg sprrpg4 = this;
                sprrpg4.cfr_renamed_0.nextBytes(byArray);
                cipher = sprrpg4.cfr_renamed_2.cfr_renamed_1496(this.cfr_renamed_3.cfr_renamed_19());
                cipher.init(1, new sprcwj(arg0, byArray, this.cfr_renamed_91));
                sprddm2 = new sprddm(this.cfr_renamed_3, new sprqrm(byArray, this.cfr_renamed_91));
            } else if (this.cfr_renamed_3.cfr_renamed_5078(sprdl.cfr_renamed_112)) {
                sprdfk sprdfk2;
                sprdfk sprdfk3 = sprdfk2 = this.cfr_renamed_1 == null ? this.cfr_renamed_119.cfr_renamed_1451() : this.cfr_renamed_1;
                if (sprow.cfr_renamed_957.cfr_renamed_5078(sprdfk2.cfr_renamed_593())) {
                    spritm spritm2;
                    spritm spritm3;
                    sprmfk sprmfk2 = (sprmfk)sprdfk2;
                    byte[] byArray = new byte[sprmfk2.cfr_renamed_4598()];
                    sprrpg sprrpg5 = this;
                    sprrpg5.cfr_renamed_0.nextBytes(byArray);
                    sprqom sprqom2 = new sprqom(byArray, sprmfk2.cfr_renamed_7383(), sprmfk2.cfr_renamed_1195(), sprmfk2.cfr_renamed_7384());
                    SecretKeyFactory secretKeyFactory = sprrpg5.cfr_renamed_2.cfr_renamed_1495(sprzdq.cfr_renamed_9("qXpBrO"));
                    SecretKey secretKey = secretKeyFactory.generateSecret(new sprxfi(arg0, byArray, sprmfk2.cfr_renamed_7383(), sprmfk2.cfr_renamed_1195(), sprmfk2.cfr_renamed_7384(), this.cfr_renamed_152.cfr_renamed_7385(new sprddm(this.cfr_renamed_112))));
                    cipher = sprrpg5.cfr_renamed_2.cfr_renamed_1496(this.cfr_renamed_112.cfr_renamed_19());
                    cipher.init(1, (Key)this.cfr_renamed_7386(secretKey), this.cfr_renamed_0);
                    AlgorithmParameters algorithmParameters = cipher.getParameters();
                    if (algorithmParameters != null) {
                        spritm3 = new spritm(new sprwpm(sprow.cfr_renamed_957, sprqom2), new sprbqm(this.cfr_renamed_112, sprxgf.cfr_renamed_184(cipher.getParameters().getEncoded())));
                        spritm2 = spritm3;
                    } else {
                        spritm3 = new spritm(new sprwpm(sprow.cfr_renamed_957, sprqom2), new sprbqm(this.cfr_renamed_112));
                        spritm2 = spritm3;
                    }
                    sprddm2 = new sprddm(this.cfr_renamed_3, spritm2);
                } else {
                    spritm spritm4;
                    spritm spritm5;
                    spripk spripk2 = (spripk)sprdfk2;
                    byte[] byArray = new byte[spripk2.cfr_renamed_4598()];
                    sprrpg sprrpg6 = this;
                    sprrpg6.cfr_renamed_0.nextBytes(byArray);
                    SecretKeyFactory secretKeyFactory = sprrpg6.cfr_renamed_2.cfr_renamed_1495(sprqpg.cfr_renamed_7376(spripk2.cfr_renamed_7387().cfr_renamed_593()));
                    SecretKey secretKey = secretKeyFactory.generateSecret(new PBEKeySpec(arg0, byArray, spripk2.cfr_renamed_1478(), this.cfr_renamed_152.cfr_renamed_7385(new sprddm(this.cfr_renamed_112))));
                    cipher = sprrpg6.cfr_renamed_2.cfr_renamed_1496(this.cfr_renamed_112.cfr_renamed_19());
                    cipher.init(1, (Key)this.cfr_renamed_7386(secretKey), this.cfr_renamed_0);
                    AlgorithmParameters algorithmParameters = cipher.getParameters();
                    if (algorithmParameters != null) {
                        spritm5 = new spritm(new sprwpm(sprdl.cfr_renamed_3247, new spryrm(byArray, spripk2.cfr_renamed_1478(), spripk2.cfr_renamed_7387())), new sprbqm(this.cfr_renamed_112, sprxgf.cfr_renamed_184(cipher.getParameters().getEncoded())));
                        spritm4 = spritm5;
                    } else {
                        spritm5 = new spritm(new sprwpm(sprdl.cfr_renamed_3247, new spryrm(byArray, spripk2.cfr_renamed_1478(), spripk2.cfr_renamed_7387())), new sprbqm(this.cfr_renamed_112));
                        spritm4 = spritm5;
                    }
                    sprddm2 = new sprddm(this.cfr_renamed_3, spritm4);
                }
            } else {
                throw new sprhjg(sprywa.cfr_renamed_9(".y)r8x<y2d>s{v7p4e2c3z"));
            }
            return new sprejg(this, sprddm2, cipher, arg0);
        }
        catch (Exception exception) {
            throw new sprhjg(new StringBuilder().insert(0, sprzdq.cfr_renamed_9("WuCyN~\u0002oM;AiGzV~\u0002TWoRnV^LxPbRoMi\u0018;")).append(exception.getMessage()).toString(), exception);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprrpg cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_2 = new sprxil((String)arg0);
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprrpg(sprdfk sprdfk2, sprlem sprlem2) {
        void arg0;
        sprrpg sprrpg2 = this;
        sprrpg sprrpg3 = this;
        sprrpg sprrpg4 = this;
        sprrpg sprrpg5 = this;
        this.cfr_renamed_2 = new sprrul();
        sprrpg5.cfr_renamed_152 = sprlgg.cfr_renamed_3;
        sprrpg4.cfr_renamed_4 = new sprdpg();
        sprrpg3.cfr_renamed_91 = 1024;
        sprrpg4.cfr_renamed_119 = new sprvpk();
        sprrpg3.cfr_renamed_3 = sprdl.cfr_renamed_112;
        sprrpg2.cfr_renamed_1 = arg0;
        sprrpg2.cfr_renamed_112 = sprlem2;
    }

    private static /* synthetic */ byte[] cfr_renamed_1606(char[] arg0) {
        if (arg0 != null) {
            int n;
            byte[] byArray = new byte[arg0.length];
            int n2 = n = 0;
            while (n2 != byArray.length) {
                int n3 = n++;
                byArray[n3] = (byte)arg0[n3];
                n2 = n;
            }
            return byArray;
        }
        return new byte[0];
    }

    private /* synthetic */ boolean cfr_renamed_7379(sprlem arg0) {
        return arg0.cfr_renamed_5966(sprdl.cfr_renamed_2920) || arg0.cfr_renamed_5966(sprjv.cfr_renamed_312) || arg0.cfr_renamed_5966(sprjv.cfr_renamed_1214);
    }

    private /* synthetic */ SecretKey cfr_renamed_7386(SecretKey arg0) {
        sprrpg sprrpg2 = this;
        if (sprrpg2.cfr_renamed_4.cfr_renamed_7388(sprrpg2.cfr_renamed_112)) {
            sprrpg sprrpg3 = this;
            if (sprrpg3.cfr_renamed_4.cfr_renamed_7389(sprrpg3.cfr_renamed_112).indexOf(sprywa.cfr_renamed_9("V\u001eD")) >= 0) {
                arg0 = new SecretKeySpec(arg0.getEncoded(), sprzdq.cfr_renamed_9("ZgH"));
            }
        }
        return arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprrpg cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_2 = new sprkhi((Provider)arg0);
        return this;
    }

    public sprrpg cfr_renamed_1613(SecureRandom arg0) {
        this.cfr_renamed_0 = arg0;
        return this;
    }

    public static /* synthetic */ byte[] cfr_renamed_7390(char[] arg0) {
        return sprrpg.cfr_renamed_1606(arg0);
    }

    public sprrpg cfr_renamed_7391(sprni arg0) {
        this.cfr_renamed_152 = arg0;
        return this;
    }
}

