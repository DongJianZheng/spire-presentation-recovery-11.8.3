/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprcgm;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprdbk;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.spreph;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprguh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprgyj;
import com.spire.presentation.packages.spridm;
import com.spire.presentation.packages.sprjq;
import com.spire.presentation.packages.sprjrf;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnhm;
import com.spire.presentation.packages.sprnlj;
import com.spire.presentation.packages.sprof;
import com.spire.presentation.packages.sproyj;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqpj;
import com.spire.presentation.packages.sprqw;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprrxh;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprtlj;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxo;
import com.spire.presentation.packages.sprxrk;
import com.spire.presentation.packages.sprzuk;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Enumeration;

public class sprtuj
implements ECPrivateKey,
sprxo,
sprof,
sprjq {
    private transient sprzuk cfr_renamed_93;
    private transient sprcom cfr_renamed_86;
    private transient byte[] cfr_renamed_152;
    private transient ECParameterSpec cfr_renamed_112;
    private transient sprgbf cfr_renamed_119;
    private transient sprqw cfr_renamed_91;
    private boolean cfr_renamed_0;
    private String cfr_renamed_1;
    private transient BigInteger cfr_renamed_2;
    private transient sprtlj cfr_renamed_3;
    public static final long cfr_renamed_4 = 994553197664784084L;

    @Override
    public void cfr_renamed_2327(String arg0) {
        this.cfr_renamed_0 = !sprjrf.cfr_renamed_9("@8V9X&G3F%P2").equalsIgnoreCase(arg0);
    }

    public sprrxh cfr_renamed_2308() {
        if (this.cfr_renamed_112 != null) {
            return sprnlj.cfr_renamed_9150(this.cfr_renamed_112);
        }
        return this.cfr_renamed_91.cfr_renamed_2312();
    }

    @Override
    public String getFormat() {
        return sprgyj.cfr_renamed_9("\u000e@\u001dX}3");
    }

    @Override
    public ECParameterSpec getParams() {
        return this.cfr_renamed_112;
    }

    @Override
    public sprco cfr_renamed_9064(sprlem arg0) {
        return this.cfr_renamed_3.cfr_renamed_9064(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprtuj(String string, sprzuk sprzuk2, sprqw sprqw2) {
        void arg2;
        void arg1;
        void arg0;
        sprtuj sprtuj2 = this;
        sprtuj sprtuj3 = this;
        sprtuj sprtuj4 = this;
        sprtuj4.cfr_renamed_1 = "EC";
        sprtuj sprtuj5 = this;
        sprtuj4.cfr_renamed_3 = new sprtlj();
        sprtuj4.cfr_renamed_1 = arg0;
        sprtuj3.cfr_renamed_2 = arg1.cfr_renamed_2112();
        sprtuj3.cfr_renamed_112 = null;
        sprtuj2.cfr_renamed_91 = arg2;
        sprtuj2.cfr_renamed_93 = sprzuk2;
    }

    @Override
    public BigInteger getS() {
        return this.cfr_renamed_2;
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ sprcom cfr_renamed_1598() {
        block4: {
            block5: {
                if (this.cfr_renamed_86 != null) break block4;
                v0 = this;
                var1_1 = sprdbk.cfr_renamed_9442(this.cfr_renamed_112, v0.cfr_renamed_0);
                if (v0.cfr_renamed_112 == null) {
                    v1 = this;
                    v2 = v1;
                    var2_2 = sprqpj.cfr_renamed_9160(this.cfr_renamed_91, null, v1.getS());
                } else {
                    v3 = this;
                    v2 = v3;
                    var2_2 = sprqpj.cfr_renamed_9160(v3.cfr_renamed_91, v3.cfr_renamed_112.getOrder(), this.getS());
                }
                if (v2.cfr_renamed_119 == null) break block5;
                var3_3 = new spridm(var2_2, this.getS(), this.cfr_renamed_119, var1_1);
                v4 = this;
                ** GOTO lbl20
            }
            var3_3 = new spridm(var2_2, this.getS(), (sprco)var1_1);
            try {
                v4 = this;
lbl20:
                // 2 sources

                v4.cfr_renamed_86 = new sprcom(new sprddm(sprbr.cfr_renamed_135, var1_1), var3_3);
                v5 = this;
            }
            catch (IOException var4_4) {
                return null;
            }
        }
        v5 = this;
        return v5.cfr_renamed_86;
    }

    /*
     * WARNING - void declaration
     */
    public sprtuj(String string, sprcom sprcom2, sprqw sprqw2) throws IOException {
        void arg2;
        void arg0;
        sprtuj sprtuj2 = this;
        sprtuj2.cfr_renamed_1 = "EC";
        sprtuj sprtuj3 = this;
        sprtuj2.cfr_renamed_3 = new sprtlj();
        sprtuj2.cfr_renamed_1 = arg0;
        this.cfr_renamed_91 = arg2;
        this.cfr_renamed_9159(sprcom2);
    }

    @Override
    public BigInteger cfr_renamed_2112() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprtuj(String string, sprzuk sprzuk2, sproyj sproyj2, ECParameterSpec eCParameterSpec, sprqw sprqw2) {
        void arg2;
        sprtuj sprtuj2;
        void arg4;
        void arg1;
        void arg0;
        sprtuj sprtuj3 = this;
        sprtuj sprtuj4 = this;
        this.cfr_renamed_1 = "EC";
        sprtuj sprtuj5 = this;
        this.cfr_renamed_3 = new sprtlj();
        sprtuj4.cfr_renamed_1 = arg0;
        sprtuj4.cfr_renamed_2 = arg1.cfr_renamed_2112();
        sprtuj3.cfr_renamed_91 = arg4;
        sprtuj3.cfr_renamed_93 = arg1;
        if (eCParameterSpec == null) {
            sprqxk sprqxk2 = arg1.cfr_renamed_284();
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(sprqxk2.cfr_renamed_1769(), sprqxk2.cfr_renamed_2113());
            sprtuj2 = this;
            this.cfr_renamed_112 = new ECParameterSpec(ellipticCurve, sprnlj.cfr_renamed_9053(sprqxk2.cfr_renamed_1145()), sprqxk2.cfr_renamed_1146(), sprqxk2.cfr_renamed_1153().intValue());
        } else {
            void arg3;
            sprtuj2 = this;
            this.cfr_renamed_112 = arg3;
        }
        sprtuj2.cfr_renamed_119 = this.cfr_renamed_9443((sproyj)arg2);
    }

    public sprtuj(String arg0, ECPrivateKeySpec arg1, sprqw arg2) {
        sprtuj sprtuj2 = this;
        ECPrivateKeySpec eCPrivateKeySpec = arg1;
        sprtuj sprtuj3 = this;
        sprtuj3.cfr_renamed_1 = "EC";
        sprtuj sprtuj4 = this;
        sprtuj3.cfr_renamed_3 = new sprtlj();
        sprtuj3.cfr_renamed_1 = arg0;
        this.cfr_renamed_2 = eCPrivateKeySpec.getS();
        this.cfr_renamed_112 = eCPrivateKeySpec.getParams();
        sprtuj2.cfr_renamed_91 = arg2;
        sprtuj2.cfr_renamed_93 = sprtuj.cfr_renamed_9444(this);
    }

    private /* synthetic */ void cfr_renamed_9159(sprcom arg0) throws IOException {
        sprtuj sprtuj2;
        sprcom sprcom2 = arg0;
        sprcgm sprcgm2 = sprcgm.cfr_renamed_23(sprcom2.cfr_renamed_1254().cfr_renamed_284());
        sprgxh sprgxh2 = sprnlj.cfr_renamed_9384(this.cfr_renamed_91, sprcgm2);
        this.cfr_renamed_112 = sprnlj.cfr_renamed_9385(sprcgm2, sprgxh2);
        sprco sprco2 = sprcom2.cfr_renamed_1229();
        if (sprco2 instanceof sprktm) {
            sprktm sprktm2 = sprktm.cfr_renamed_23(sprco2);
            sprtuj2 = this;
            this.cfr_renamed_2 = sprktm2.cfr_renamed_97();
        } else {
            spridm spridm2 = spridm.cfr_renamed_23(sprco2);
            sprtuj2 = this;
            this.cfr_renamed_2 = spridm2.cfr_renamed_1521();
            this.cfr_renamed_119 = spridm2.cfr_renamed_1157();
        }
        sprtuj2.cfr_renamed_93 = sprtuj.cfr_renamed_9444(this);
    }

    @Override
    public String getAlgorithm() {
        return this.cfr_renamed_1;
    }

    private static /* synthetic */ sprzuk cfr_renamed_9444(sprtuj arg0) {
        String string;
        sprtuj sprtuj2 = arg0;
        sprrxh sprrxh2 = sprtuj2.cfr_renamed_284();
        if (sprrxh2 == null) {
            sprrxh2 = sprsci.cfr_renamed_105.cfr_renamed_2312();
        }
        if (sprtuj2.cfr_renamed_284() instanceof spreph && (string = ((spreph)sprtuj2.cfr_renamed_284()).cfr_renamed_313()) != null) {
            return new sprzuk(sprtuj2.cfr_renamed_2112(), (sprqxk)new sprxrk(sprnhm.cfr_renamed_2103(string), sprrxh2.cfr_renamed_1769(), sprrxh2.cfr_renamed_1145(), sprrxh2.cfr_renamed_1146(), sprrxh2.cfr_renamed_1153(), sprrxh2.cfr_renamed_2113()));
        }
        return new sprzuk(sprtuj2.cfr_renamed_2112(), new sprqxk(sprrxh2.cfr_renamed_1769(), sprrxh2.cfr_renamed_1145(), sprrxh2.cfr_renamed_1146(), sprrxh2.cfr_renamed_1153(), sprrxh2.cfr_renamed_2113()));
    }

    @Override
    public Enumeration cfr_renamed_2158() {
        return this.cfr_renamed_3.cfr_renamed_2158();
    }

    public String toString() {
        return sprqpj.cfr_renamed_9380("EC", this.cfr_renamed_2, this.cfr_renamed_2308());
    }

    public sprtuj(String arg0, sprguh arg1, sprqw arg2) {
        sprtuj sprtuj2;
        sprguh sprguh2 = arg1;
        sprtuj sprtuj3 = this;
        sprtuj3.cfr_renamed_1 = "EC";
        sprtuj sprtuj4 = this;
        sprtuj3.cfr_renamed_3 = new sprtlj();
        sprtuj3.cfr_renamed_1 = arg0;
        this.cfr_renamed_2 = sprguh2.cfr_renamed_2112();
        if (sprguh2.cfr_renamed_2110() != null) {
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(arg1.cfr_renamed_2110().cfr_renamed_1769(), arg1.cfr_renamed_2110().cfr_renamed_2113());
            sprtuj2 = this;
            this.cfr_renamed_112 = sprnlj.cfr_renamed_9153(ellipticCurve, arg1.cfr_renamed_2110());
        } else {
            sprtuj2 = this;
            this.cfr_renamed_112 = null;
        }
        sprtuj2.cfr_renamed_91 = arg2;
        this.cfr_renamed_93 = sprtuj.cfr_renamed_9444(this);
    }

    public sprzuk cfr_renamed_9389() {
        return this.cfr_renamed_93;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        sprtuj sprtuj2;
        if (this.cfr_renamed_152 != null) {
            sprtuj2 = this;
            return sproze.cfr_renamed_158(sprtuj2.cfr_renamed_152);
        }
        sprcom sprcom2 = this.cfr_renamed_1598();
        if (sprcom2 == null) {
            return null;
        }
        try {
            this.cfr_renamed_152 = sprcom2.cfr_renamed_104("DER");
            sprtuj2 = this;
            return sproze.cfr_renamed_158(sprtuj2.cfr_renamed_152);
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public int hashCode() {
        return this.cfr_renamed_2112().hashCode() ^ this.cfr_renamed_2308().hashCode();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprgbf cfr_renamed_9443(sproyj arg0) {
        try {
            sprvhm sprvhm2 = sprvhm.cfr_renamed_23(sprxgf.cfr_renamed_184(arg0.getEncoded()));
            return sprvhm2.cfr_renamed_2314();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        v0.defaultWriteObject();
        v0.writeObject(this.getEncoded());
    }

    @Override
    public void cfr_renamed_9065(sprlem arg0, sprco arg1) {
        this.cfr_renamed_3.cfr_renamed_9065(arg0, arg1);
    }

    public sprtuj(ECPrivateKey arg0, sprqw arg1) {
        sprtuj sprtuj2 = this;
        ECPrivateKey eCPrivateKey = arg0;
        sprtuj sprtuj3 = this;
        sprtuj3.cfr_renamed_1 = "EC";
        sprtuj sprtuj4 = this;
        sprtuj3.cfr_renamed_3 = new sprtlj();
        sprtuj3.cfr_renamed_2 = arg0.getS();
        this.cfr_renamed_1 = eCPrivateKey.getAlgorithm();
        this.cfr_renamed_112 = eCPrivateKey.getParams();
        sprtuj2.cfr_renamed_91 = arg1;
        sprtuj2.cfr_renamed_93 = sprtuj.cfr_renamed_9444(this);
    }

    /*
     * WARNING - void declaration
     */
    public sprtuj(String string, sprtuj sprtuj2) {
        void arg0;
        void arg1;
        sprtuj sprtuj3 = this;
        void v1 = arg1;
        sprtuj sprtuj4 = this;
        void v3 = arg1;
        sprtuj sprtuj5 = this;
        this.cfr_renamed_1 = "EC";
        sprtuj sprtuj6 = this;
        this.cfr_renamed_3 = new sprtlj();
        sprtuj5.cfr_renamed_1 = arg0;
        sprtuj5.cfr_renamed_2 = arg1.cfr_renamed_2;
        this.cfr_renamed_112 = v3.cfr_renamed_112;
        sprtuj4.cfr_renamed_0 = v3.cfr_renamed_0;
        sprtuj4.cfr_renamed_3 = arg1.cfr_renamed_3;
        this.cfr_renamed_119 = v1.cfr_renamed_119;
        sprtuj3.cfr_renamed_91 = v1.cfr_renamed_91;
        sprtuj3.cfr_renamed_93 = sprtuj2.cfr_renamed_93;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprtuj(String var1_1, sprzuk var2_2, sproyj var3_3, sprrxh var4_4, sprqw var5_5) {
        block2: {
            v0 = this;
            v1 = this;
            super();
            this.cfr_renamed_1 = "EC";
            v2 = this;
            this.cfr_renamed_3 = new sprtlj();
            v1.cfr_renamed_1 = arg0;
            v1.cfr_renamed_2 = arg1.cfr_renamed_2112();
            v0.cfr_renamed_91 = arg4;
            v0.cfr_renamed_93 = arg1;
            if (var4_4 != null) break block2;
            var6_6 = arg1.cfr_renamed_284();
            var7_9 = sprnlj.cfr_renamed_9052(var6_6.cfr_renamed_1769(), var6_6.cfr_renamed_2113());
            v3 = this;
            this.cfr_renamed_112 = new ECParameterSpec(var7_9, sprnlj.cfr_renamed_9053(var6_6.cfr_renamed_1145()), var6_6.cfr_renamed_1146(), var6_6.cfr_renamed_1153().intValue());
            ** GOTO lbl24
        }
        var6_7 = sprnlj.cfr_renamed_9052(arg3.cfr_renamed_1769(), arg3.cfr_renamed_2113());
        this.cfr_renamed_112 = sprnlj.cfr_renamed_9153(var6_7, (sprrxh)arg3);
        try {
            v3 = this;
lbl24:
            // 2 sources

            v3.cfr_renamed_119 = this.cfr_renamed_9443((sproyj)arg2);
            return;
        }
        catch (Exception var6_8) {
            this.cfr_renamed_119 = null;
            return;
        }
    }

    public sprtuj() {
        this.cfr_renamed_1 = "EC";
        sprtuj sprtuj2 = this;
        this.cfr_renamed_3 = new sprtlj();
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        this.cfr_renamed_91 = sprsci.cfr_renamed_105;
        this.cfr_renamed_9159(sprcom.cfr_renamed_23(sprxgf.cfr_renamed_184((byte[])objectInputStream.readObject())));
        sprtuj sprtuj2 = this;
        this.cfr_renamed_3 = new sprtlj();
    }

    public boolean equals(Object arg0) {
        if (arg0 instanceof ECPrivateKey) {
            sprcom sprcom2;
            ECPrivateKey eCPrivateKey = (ECPrivateKey)arg0;
            sprcom sprcom3 = this.cfr_renamed_1598();
            sprcom sprcom4 = sprcom2 = eCPrivateKey instanceof sprtuj ? ((sprtuj)eCPrivateKey).cfr_renamed_1598() : sprcom.cfr_renamed_23(eCPrivateKey.getEncoded());
            if (sprcom3 == null || sprcom2 == null) {
                return false;
            }
            try {
                boolean bl = sproze.cfr_renamed_559(sprcom3.cfr_renamed_1254().cfr_renamed_91(), sprcom2.cfr_renamed_1254().cfr_renamed_91());
                boolean bl2 = sproze.cfr_renamed_559(this.getS().toByteArray(), eCPrivateKey.getS().toByteArray());
                return bl & bl2;
            }
            catch (IOException iOException) {
                return false;
            }
        }
        return false;
    }

    @Override
    public sprrxh cfr_renamed_284() {
        if (this.cfr_renamed_112 == null) {
            return null;
        }
        return sprnlj.cfr_renamed_9150(this.cfr_renamed_112);
    }
}

