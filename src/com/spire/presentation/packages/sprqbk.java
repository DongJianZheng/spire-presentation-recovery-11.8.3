/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprcgm;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprcr;
import com.spire.presentation.packages.sprctj;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.spreph;
import com.spire.presentation.packages.sprfim;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprgoh;
import com.spire.presentation.packages.sprguh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.spridm;
import com.spire.presentation.packages.sprjq;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnlj;
import com.spire.presentation.packages.sprof;
import com.spire.presentation.packages.sprokk;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqpj;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprrxh;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtlj;
import com.spire.presentation.packages.spruhm;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprwim;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxo;
import com.spire.presentation.packages.sprxvh;
import com.spire.presentation.packages.sprxzl;
import com.spire.presentation.packages.sprysha;
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

public class sprqbk
implements ECPrivateKey,
sprxo,
sprof,
sprjq {
    private transient sprgbf cfr_renamed_119;
    public static final long cfr_renamed_91 = 7245981689601667138L;
    private String cfr_renamed_0;
    private transient ECParameterSpec cfr_renamed_1;
    private transient sprtlj cfr_renamed_2;
    private boolean cfr_renamed_3;
    private transient BigInteger cfr_renamed_4;

    public sprqbk(sprcom sprcom2) throws IOException {
        this.cfr_renamed_0 = "DSTU4145";
        sprqbk sprqbk2 = this;
        this.cfr_renamed_2 = new sprtlj();
        this.cfr_renamed_9159(sprcom2);
    }

    @Override
    public String getAlgorithm() {
        return this.cfr_renamed_0;
    }

    @Override
    public BigInteger getS() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ void cfr_renamed_2505(byte[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length / 2) {
            byte by = arg0[n];
            byte[] byArray = arg0;
            byArray[n] = arg0[byArray.length - 1 - n];
            int n3 = arg0.length - 1 - n;
            arg0[n3] = by;
            n2 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_9159(sprcom.cfr_renamed_23(sprxgf.cfr_renamed_184(byArray)));
        sprqbk sprqbk2 = this;
        sprqbk2.cfr_renamed_2 = new sprtlj();
    }

    /*
     * WARNING - void declaration
     */
    public sprqbk(sprqbk sprqbk2) {
        void arg0;
        sprqbk sprqbk3 = this;
        void v1 = arg0;
        sprqbk sprqbk4 = this;
        this.cfr_renamed_0 = "DSTU4145";
        sprqbk sprqbk5 = this;
        this.cfr_renamed_2 = new sprtlj();
        sprqbk4.cfr_renamed_4 = arg0.cfr_renamed_4;
        sprqbk4.cfr_renamed_1 = arg0.cfr_renamed_1;
        this.cfr_renamed_3 = v1.cfr_renamed_3;
        sprqbk3.cfr_renamed_2 = v1.cfr_renamed_2;
        sprqbk3.cfr_renamed_119 = sprqbk2.cfr_renamed_119;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprqbk)) {
            return false;
        }
        sprqbk sprqbk2 = (sprqbk)arg0;
        return this.cfr_renamed_2112().equals(sprqbk2.cfr_renamed_2112()) && this.cfr_renamed_2308().equals(sprqbk2.cfr_renamed_2308());
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ void cfr_renamed_9159(sprcom arg0) throws IOException {
        block11: {
            var2_2 = sprcgm.cfr_renamed_23(arg0.cfr_renamed_1254().cfr_renamed_284());
            if (!var2_2.cfr_renamed_2317()) break block11;
            var3_3 = sprlem.cfr_renamed_23(var2_2.cfr_renamed_284());
            var4_4 = sprqpj.cfr_renamed_9156((sprlem)var3_3);
            if (var4_4 == null) {
                var5_5 = sprwim.cfr_renamed_7994((sprlem)var3_3);
                var6_9 = sprnlj.cfr_renamed_9052(var5_5.cfr_renamed_1769(), var5_5.cfr_renamed_2113());
                v0 = this;
                v0.cfr_renamed_1 = new sprxvh(var3_3.cfr_renamed_19(), var6_9, sprnlj.cfr_renamed_9053(var5_5.cfr_renamed_1145()), var5_5.cfr_renamed_1146(), var5_5.cfr_renamed_1153());
            } else {
                var5_6 = sprnlj.cfr_renamed_9052(var4_4.cfr_renamed_1769(), var4_4.cfr_renamed_2113());
                this.cfr_renamed_1 = new sprxvh(sprqpj.cfr_renamed_7554((sprlem)var3_3), var5_6, sprnlj.cfr_renamed_9053(var4_4.cfr_renamed_1145()), var4_4.cfr_renamed_1146(), var4_4.cfr_renamed_1153());
            }
            ** GOTO lbl48
        }
        if (var2_2.cfr_renamed_2320()) {
            v1 = arg0;
            this.cfr_renamed_1 = null;
        } else {
            var3_3 = sprszm.cfr_renamed_23(var2_2.cfr_renamed_284());
            if (var3_3.cfr_renamed_85(0) instanceof sprktm) {
                var4_4 = sprhfm.cfr_renamed_23(var2_2.cfr_renamed_284());
                var5_7 = sprnlj.cfr_renamed_9052(var4_4.cfr_renamed_1769(), var4_4.cfr_renamed_2113());
                v1 = arg0;
                this.cfr_renamed_1 = new ECParameterSpec(var5_7, sprnlj.cfr_renamed_9053(var4_4.cfr_renamed_1145()), var4_4.cfr_renamed_1146(), var4_4.cfr_renamed_1153().intValue());
            } else {
                v2 = var4_4 = sprxzl.cfr_renamed_23(var3_3);
                if (var4_4.cfr_renamed_2317()) {
                    var6_10 = v2.cfr_renamed_2507();
                    var7_11 = sprwim.cfr_renamed_7994((sprlem)var6_10);
                    v3 /* !! */  = var5_8 /* !! */  = new spreph(var6_10.cfr_renamed_19(), var7_11.cfr_renamed_1769(), var7_11.cfr_renamed_1145(), var7_11.cfr_renamed_1146(), var7_11.cfr_renamed_1153(), var7_11.cfr_renamed_2113());
                } else {
                    var6_10 = v2.cfr_renamed_2508();
                    var7_12 = var6_10.cfr_renamed_1997();
                    if (arg0.cfr_renamed_1254().cfr_renamed_593().cfr_renamed_5078(sprcr.cfr_renamed_126)) {
                        this.cfr_renamed_2505(var7_12);
                    }
                    v4 = var6_10;
                    var8_13 = v4.cfr_renamed_845();
                    var9_14 = new sprgoh(var8_13.cfr_renamed_1186(), var8_13.cfr_renamed_2115(), var8_13.cfr_renamed_2117(), var8_13.cfr_renamed_2116(), var6_10.cfr_renamed_1778(), new BigInteger(1, var7_12), null, null);
                    var10_15 = v4.cfr_renamed_1145();
                    if (arg0.cfr_renamed_1254().cfr_renamed_593().cfr_renamed_5078(sprcr.cfr_renamed_126)) {
                        this.cfr_renamed_2505(var10_15);
                    }
                    v5 = var9_14;
                    v3 /* !! */  = var5_8 /* !! */  = new sprrxh(v5, spruhm.cfr_renamed_9446(v5, var10_15), var6_10.cfr_renamed_1146());
                }
                var6_10 = sprnlj.cfr_renamed_9052(v3 /* !! */ .cfr_renamed_1769(), var5_8 /* !! */ .cfr_renamed_2113());
                this.cfr_renamed_1 = new ECParameterSpec((EllipticCurve)var6_10, sprnlj.cfr_renamed_9053(var5_8 /* !! */ .cfr_renamed_1145()), var5_8 /* !! */ .cfr_renamed_1146(), var5_8 /* !! */ .cfr_renamed_1153().intValue());
lbl48:
                // 3 sources

                v1 = arg0;
            }
        }
        v6 = var3_3 = v1.cfr_renamed_1229();
        if (var3_3 instanceof sprktm) {
            var4_4 = sprktm.cfr_renamed_23(v6);
            this.cfr_renamed_4 = var4_4.cfr_renamed_97();
            return;
        }
        var4_4 = spridm.cfr_renamed_23(v6);
        v7 = this;
        v7.cfr_renamed_4 = var4_4.cfr_renamed_1521();
        v7.cfr_renamed_119 = var4_4.cfr_renamed_1157();
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
    public String getFormat() {
        return sprokk.cfr_renamed_9("W!D9$R");
    }

    @Override
    public void cfr_renamed_2327(String arg0) {
        this.cfr_renamed_3 = !sprysha.cfr_renamed_9("b\u0004t\u0005z\u001ae\u000fd\u0019r\u000e").equalsIgnoreCase(arg0);
    }

    public sprqbk() {
        this.cfr_renamed_0 = "DSTU4145";
        sprqbk sprqbk2 = this;
        this.cfr_renamed_2 = new sprtlj();
    }

    @Override
    public sprco cfr_renamed_9064(sprlem arg0) {
        return this.cfr_renamed_2.cfr_renamed_9064(arg0);
    }

    @Override
    public ECParameterSpec getParams() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprqbk(ECPrivateKeySpec eCPrivateKeySpec) {
        void arg0;
        sprqbk sprqbk2 = this;
        this.cfr_renamed_0 = "DSTU4145";
        sprqbk sprqbk3 = this;
        this.cfr_renamed_2 = new sprtlj();
        sprqbk2.cfr_renamed_4 = arg0.getS();
        sprqbk2.cfr_renamed_1 = eCPrivateKeySpec.getParams();
    }

    public sprrxh cfr_renamed_2308() {
        if (this.cfr_renamed_1 != null) {
            return sprnlj.cfr_renamed_9150(this.cfr_renamed_1);
        }
        return sprsci.cfr_renamed_105.cfr_renamed_2312();
    }

    public sprqbk(sprguh arg0) {
        sprguh sprguh2 = arg0;
        this.cfr_renamed_0 = "DSTU4145";
        sprqbk sprqbk2 = this;
        this.cfr_renamed_2 = new sprtlj();
        this.cfr_renamed_4 = sprguh2.cfr_renamed_2112();
        if (sprguh2.cfr_renamed_2110() != null) {
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(arg0.cfr_renamed_2110().cfr_renamed_1769(), arg0.cfr_renamed_2110().cfr_renamed_2113());
            this.cfr_renamed_1 = sprnlj.cfr_renamed_9153(ellipticCurve, arg0.cfr_renamed_2110());
            return;
        }
        this.cfr_renamed_1 = null;
    }

    /*
     * WARNING - void declaration
     */
    public sprqbk(String string, sprzuk sprzuk2, sprctj sprctj2, ECParameterSpec eCParameterSpec) {
        void arg2;
        sprqbk sprqbk2;
        void arg3;
        void arg1;
        void arg0;
        sprqbk sprqbk3 = this;
        this.cfr_renamed_0 = "DSTU4145";
        sprqbk sprqbk4 = this;
        sprqbk3.cfr_renamed_2 = new sprtlj();
        sprqxk sprqxk2 = sprzuk2.cfr_renamed_284();
        sprqbk3.cfr_renamed_0 = arg0;
        sprqbk3.cfr_renamed_4 = arg1.cfr_renamed_2112();
        if (arg3 == null) {
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(sprqxk2.cfr_renamed_1769(), sprqxk2.cfr_renamed_2113());
            sprqbk2 = this;
            this.cfr_renamed_1 = new ECParameterSpec(ellipticCurve, sprnlj.cfr_renamed_9053(sprqxk2.cfr_renamed_1145()), sprqxk2.cfr_renamed_1146(), sprqxk2.cfr_renamed_1153().intValue());
        } else {
            sprqbk2 = this;
            this.cfr_renamed_1 = arg3;
        }
        sprqbk2.cfr_renamed_119 = this.cfr_renamed_9447((sprctj)arg2);
    }

    /*
     * WARNING - void declaration
     */
    public sprqbk(String string, sprzuk sprzuk2) {
        void arg1;
        void arg0;
        sprqbk sprqbk2 = this;
        sprqbk sprqbk3 = this;
        sprqbk3.cfr_renamed_0 = "DSTU4145";
        sprqbk sprqbk4 = this;
        sprqbk3.cfr_renamed_2 = new sprtlj();
        sprqbk3.cfr_renamed_0 = arg0;
        sprqbk2.cfr_renamed_4 = arg1.cfr_renamed_2112();
        sprqbk2.cfr_renamed_1 = null;
    }

    /*
     * WARNING - void declaration
     */
    public sprqbk(String string, sprzuk sprzuk2, sprctj sprctj2, sprrxh sprrxh2) {
        void arg2;
        sprqbk sprqbk2;
        void arg3;
        void arg1;
        void arg0;
        sprqbk sprqbk3 = this;
        this.cfr_renamed_0 = "DSTU4145";
        sprqbk sprqbk4 = this;
        sprqbk3.cfr_renamed_2 = new sprtlj();
        sprqxk sprqxk2 = sprzuk2.cfr_renamed_284();
        sprqbk3.cfr_renamed_0 = arg0;
        sprqbk3.cfr_renamed_4 = arg1.cfr_renamed_2112();
        if (arg3 == null) {
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(sprqxk2.cfr_renamed_1769(), sprqxk2.cfr_renamed_2113());
            sprqbk2 = this;
            this.cfr_renamed_1 = new ECParameterSpec(ellipticCurve, sprnlj.cfr_renamed_9053(sprqxk2.cfr_renamed_1145()), sprqxk2.cfr_renamed_1146(), sprqxk2.cfr_renamed_1153().intValue());
        } else {
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(arg3.cfr_renamed_1769(), arg3.cfr_renamed_2113());
            sprqbk2 = this;
            this.cfr_renamed_1 = new ECParameterSpec(ellipticCurve, sprnlj.cfr_renamed_9053(arg3.cfr_renamed_1145()), arg3.cfr_renamed_1146(), arg3.cfr_renamed_1153().intValue());
        }
        sprqbk2.cfr_renamed_119 = this.cfr_renamed_9447((sprctj)arg2);
    }

    /*
     * WARNING - void declaration
     */
    public sprqbk(ECPrivateKey eCPrivateKey) {
        void arg0;
        sprqbk sprqbk2 = this;
        void v1 = arg0;
        this.cfr_renamed_0 = "DSTU4145";
        sprqbk sprqbk3 = this;
        this.cfr_renamed_2 = new sprtlj();
        this.cfr_renamed_4 = v1.getS();
        sprqbk2.cfr_renamed_0 = v1.getAlgorithm();
        sprqbk2.cfr_renamed_1 = eCPrivateKey.getParams();
    }

    public String toString() {
        sprqbk sprqbk2 = this;
        return sprqpj.cfr_renamed_9380(sprqbk2.cfr_renamed_0, sprqbk2.cfr_renamed_4, this.cfr_renamed_2308());
    }

    @Override
    public BigInteger cfr_renamed_2112() {
        return this.cfr_renamed_4;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public byte[] getEncoded() {
        block9: {
            if (this.cfr_renamed_1 instanceof sprxvh) {
                var3_1 = sprqpj.cfr_renamed_2326(((sprxvh)this.cfr_renamed_1).cfr_renamed_313());
                if (var3_1 == null) {
                    var3_1 = new sprlem(((sprxvh)this.cfr_renamed_1).cfr_renamed_313());
                }
                var1_2 = new sprcgm((sprlem)var3_1);
                var2_3 = sprqpj.cfr_renamed_9160(sprsci.cfr_renamed_105, this.cfr_renamed_1.getOrder(), this.getS());
                v0 = this;
            } else if (this.cfr_renamed_1 == null) {
                var1_2 = new sprcgm(sprpen.cfr_renamed_4);
                var2_3 = sprqpj.cfr_renamed_9160(sprsci.cfr_renamed_105, null, this.getS());
                v0 = this;
            } else {
                v1 = this;
                v0 = v1;
                v2 = var3_1 = sprnlj.cfr_renamed_2323(v1.cfr_renamed_1.getCurve());
                v3 = var3_1;
                var4_4 = new sprhfm((sprgxh)v3, new sprfim(sprnlj.cfr_renamed_9154((sprgxh)v3, this.cfr_renamed_1.getGenerator()), this.cfr_renamed_3), this.cfr_renamed_1.getOrder(), BigInteger.valueOf(this.cfr_renamed_1.getCofactor()), this.cfr_renamed_1.getCurve().getSeed());
                var1_2 = new sprcgm((sprhfm)var4_4);
                var2_3 = sprqpj.cfr_renamed_9160(sprsci.cfr_renamed_105, this.cfr_renamed_1.getOrder(), this.getS());
            }
            if (v0.cfr_renamed_119 == null) break block9;
            v4 = new spridm(var2_3, this.getS(), this.cfr_renamed_119, var1_2);
            var4_4 = v4;
            v5 = this;
            ** GOTO lbl33
        }
        v4 = new spridm(var2_3, this.getS(), (sprco)var1_2);
        var4_4 = v4;
        try {
            v5 = this;
lbl33:
            // 2 sources

            if (v5.cfr_renamed_0.equals("DSTU4145")) {
                v6 = new sprcom(new sprddm(sprcr.cfr_renamed_951, var1_2.cfr_renamed_119()), var4_4.cfr_renamed_119());
                v7 = var3_1 = v6;
            } else {
                v6 = new sprcom(new sprddm(sprbr.cfr_renamed_135, var1_2.cfr_renamed_119()), var4_4.cfr_renamed_119());
                v7 = var3_1 = v6;
            }
            return v7.cfr_renamed_104("DER");
        }
        catch (IOException var5_5) {
            return null;
        }
    }

    @Override
    public sprrxh cfr_renamed_284() {
        if (this.cfr_renamed_1 == null) {
            return null;
        }
        return sprnlj.cfr_renamed_9150(this.cfr_renamed_1);
    }

    @Override
    public Enumeration cfr_renamed_2158() {
        return this.cfr_renamed_2.cfr_renamed_2158();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprgbf cfr_renamed_9447(sprctj arg0) {
        try {
            sprvhm sprvhm2 = sprvhm.cfr_renamed_23(sprxgf.cfr_renamed_184(arg0.getEncoded()));
            return sprvhm2.cfr_renamed_2314();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public int hashCode() {
        return this.cfr_renamed_2112().hashCode() ^ this.cfr_renamed_2308().hashCode();
    }

    @Override
    public void cfr_renamed_9065(sprlem arg0, sprco arg1) {
        this.cfr_renamed_2.cfr_renamed_9065(arg0, arg1);
    }
}

