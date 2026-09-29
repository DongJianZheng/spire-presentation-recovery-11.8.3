/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbjo;
import com.spire.presentation.packages.sprboh;
import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprcgm;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfim;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprguh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.spridm;
import com.spire.presentation.packages.sprjq;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnlj;
import com.spire.presentation.packages.sprof;
import com.spire.presentation.packages.sprpaz;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprqpj;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprrxh;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprtlj;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxo;
import com.spire.presentation.packages.sprxvh;
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

public class sprtvh
implements ECPrivateKey,
sprxo,
sprof,
sprjq {
    private String cfr_renamed_91;
    private BigInteger cfr_renamed_0;
    private sprtlj cfr_renamed_1;
    private ECParameterSpec cfr_renamed_2;
    private sprgbf cfr_renamed_3;
    private boolean cfr_renamed_4;

    public int hashCode() {
        return this.cfr_renamed_2112().hashCode() ^ this.cfr_renamed_2308().hashCode();
    }

    /*
     * WARNING - void declaration
     */
    public sprtvh(String string, sprzuk sprzuk2, sprboh sprboh2, ECParameterSpec eCParameterSpec) {
        void arg2;
        sprtvh sprtvh2;
        void arg1;
        void arg0;
        sprtvh sprtvh3 = this;
        this.cfr_renamed_91 = "EC";
        sprtvh sprtvh4 = this;
        this.cfr_renamed_1 = new sprtlj();
        sprtvh3.cfr_renamed_91 = arg0;
        sprtvh3.cfr_renamed_0 = arg1.cfr_renamed_2112();
        if (eCParameterSpec == null) {
            sprqxk sprqxk2 = arg1.cfr_renamed_284();
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(sprqxk2.cfr_renamed_1769(), sprqxk2.cfr_renamed_2113());
            sprtvh2 = this;
            this.cfr_renamed_2 = new ECParameterSpec(ellipticCurve, sprnlj.cfr_renamed_9053(sprqxk2.cfr_renamed_1145()), sprqxk2.cfr_renamed_1146(), sprqxk2.cfr_renamed_1153().intValue());
        } else {
            void arg3;
            sprtvh2 = this;
            this.cfr_renamed_2 = arg3;
        }
        sprtvh2.cfr_renamed_3 = this.cfr_renamed_9158((sprboh)arg2);
    }

    @Override
    public sprrxh cfr_renamed_284() {
        if (this.cfr_renamed_2 == null) {
            return null;
        }
        return sprnlj.cfr_renamed_9150(this.cfr_renamed_2);
    }

    @Override
    public void cfr_renamed_9065(sprlem arg0, sprco arg1) {
        this.cfr_renamed_1.cfr_renamed_9065(arg0, arg1);
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void cfr_renamed_9159(sprcom arg0) throws IOException {
        block4: {
            var2_2 = sprcgm.cfr_renamed_23(arg0.cfr_renamed_1254().cfr_renamed_284());
            if (!var2_2.cfr_renamed_2317()) break block4;
            var3_3 = sprlem.cfr_renamed_23(var2_2.cfr_renamed_284());
            var4_4 = sprqpj.cfr_renamed_9156((sprlem)var3_3);
            if (var4_4 != null) {
                var5_5 = sprnlj.cfr_renamed_9052(var4_4.cfr_renamed_1769(), var4_4.cfr_renamed_2113());
                v0 = this;
                v0.cfr_renamed_2 = new sprxvh(sprqpj.cfr_renamed_7554((sprlem)var3_3), var5_5, sprnlj.cfr_renamed_9053(var4_4.cfr_renamed_1145()), var4_4.cfr_renamed_1146(), var4_4.cfr_renamed_1153());
            }
            ** GOTO lbl20
        }
        if (var2_2.cfr_renamed_2320()) {
            v1 = arg0;
            this.cfr_renamed_2 = null;
        } else {
            var3_3 = sprhfm.cfr_renamed_23(var2_2.cfr_renamed_284());
            var4_4 = sprnlj.cfr_renamed_9052(var3_3.cfr_renamed_1769(), var3_3.cfr_renamed_2113());
            this.cfr_renamed_2 = new ECParameterSpec((EllipticCurve)var4_4, sprnlj.cfr_renamed_9053(var3_3.cfr_renamed_1145()), var3_3.cfr_renamed_1146(), var3_3.cfr_renamed_1153().intValue());
lbl20:
            // 2 sources

            v1 = arg0;
        }
        v2 = var3_3 = v1.cfr_renamed_1229();
        if (var3_3 instanceof sprktm) {
            var4_4 = sprktm.cfr_renamed_23(v2);
            this.cfr_renamed_0 = var4_4.cfr_renamed_97();
            return;
        }
        var4_4 = spridm.cfr_renamed_23(v2);
        v3 = this;
        v3.cfr_renamed_0 = var4_4.cfr_renamed_1521();
        v3.cfr_renamed_3 = var4_4.cfr_renamed_1157();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = sprkoe.cfr_renamed_5114();
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer.append(sprpaz.cfr_renamed_9("\u0004gat3M7E5Aao$]")).append(string);
        stringBuffer2.append(sprbjo.cfr_renamed_9("\u001f2\u001f2\u001f2\u001f2\u001f2\u001f2\u001fA\u00052")).append(this.cfr_renamed_0.toString(16)).append(string);
        return stringBuffer2.toString();
    }

    public sprtvh(sprcom sprcom2) throws IOException {
        this.cfr_renamed_91 = "EC";
        sprtvh sprtvh2 = this;
        this.cfr_renamed_1 = new sprtlj();
        this.cfr_renamed_9159(sprcom2);
    }

    @Override
    public void cfr_renamed_2327(String arg0) {
        this.cfr_renamed_4 = !sprpaz.cfr_renamed_9("\u0014j\u0002k\ft\u0013a\u0012w\u0004`").equalsIgnoreCase(arg0);
    }

    @Override
    public Enumeration cfr_renamed_2158() {
        return this.cfr_renamed_1.cfr_renamed_2158();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public byte[] getEncoded() {
        block11: {
            if (this.cfr_renamed_2 instanceof sprxvh) {
                var2_1 = sprqpj.cfr_renamed_2326(((sprxvh)this.cfr_renamed_2).cfr_renamed_313());
                if (var2_1 == null) {
                    var2_1 = new sprlem(((sprxvh)this.cfr_renamed_2).cfr_renamed_313());
                }
                var1_2 = new sprcgm((sprlem)var2_1);
                v0 = this;
            } else if (this.cfr_renamed_2 == null) {
                var1_2 = new sprcgm(sprpen.cfr_renamed_4);
                v0 = this;
            } else {
                v1 = this;
                v0 = v1;
                v2 = var2_1 = sprnlj.cfr_renamed_2323(v1.cfr_renamed_2.getCurve());
                v3 = var2_1;
                var3_3 = new sprhfm((sprgxh)v3, new sprfim(sprnlj.cfr_renamed_9154((sprgxh)v3, this.cfr_renamed_2.getGenerator()), this.cfr_renamed_4), this.cfr_renamed_2.getOrder(), BigInteger.valueOf(this.cfr_renamed_2.getCofactor()), this.cfr_renamed_2.getCurve().getSeed());
                var1_2 = new sprcgm((sprhfm)var3_3);
            }
            if (v0.cfr_renamed_2 == null) {
                var4_4 = sprqpj.cfr_renamed_9160(null, null, this.getS());
                v4 = this;
            } else {
                var4_4 = sprqpj.cfr_renamed_9160(null, this.cfr_renamed_2.getOrder(), this.getS());
                v4 = this;
            }
            if (v4.cfr_renamed_3 == null) break block11;
            v5 = new spridm(var4_4, this.getS(), this.cfr_renamed_3, var1_2);
            var3_3 = v5;
            v6 = this;
            ** GOTO lbl36
        }
        v5 = new spridm(var4_4, this.getS(), (sprco)var1_2);
        var3_3 = v5;
        try {
            v6 = this;
lbl36:
            // 2 sources

            if (v6.cfr_renamed_91.equals("ECGOST3410")) {
                v7 = new sprcom(new sprddm(sprqo.cfr_renamed_93, var1_2.cfr_renamed_119()), var3_3.cfr_renamed_119());
                v8 = var2_1 = v7;
            } else {
                v7 = new sprcom(new sprddm(sprbr.cfr_renamed_135, var1_2.cfr_renamed_119()), var3_3.cfr_renamed_119());
                v8 = var2_1 = v7;
            }
            return v8.cfr_renamed_104("DER");
        }
        catch (IOException var5_5) {
            return null;
        }
    }

    @Override
    public BigInteger getS() {
        return this.cfr_renamed_0;
    }

    @Override
    public sprco cfr_renamed_9064(sprlem arg0) {
        return this.cfr_renamed_1.cfr_renamed_9064(arg0);
    }

    @Override
    public String getFormat() {
        return sprbjo.cfr_renamed_9("oY|A\u001c*");
    }

    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream arg0) throws IOException {
        sprtvh sprtvh2 = this;
        ObjectOutputStream objectOutputStream = arg0;
        objectOutputStream.writeObject(this.getEncoded());
        objectOutputStream.writeObject(this.cfr_renamed_91);
        arg0.writeBoolean(sprtvh2.cfr_renamed_4);
        sprtvh2.cfr_renamed_1.cfr_renamed_2291(arg0);
    }

    @Override
    public String getAlgorithm() {
        return this.cfr_renamed_91;
    }

    @Override
    public BigInteger cfr_renamed_2112() {
        return this.cfr_renamed_0;
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        byte[] byArray = (byte[])arg0.readObject();
        this.cfr_renamed_9159(sprcom.cfr_renamed_23(sprxgf.cfr_renamed_184(byArray)));
        this.cfr_renamed_91 = (String)arg0.readObject();
        sprtvh sprtvh2 = this;
        sprtvh2.cfr_renamed_4 = arg0.readBoolean();
        sprtvh2.cfr_renamed_1 = new sprtlj();
        this.cfr_renamed_1.cfr_renamed_2290(arg0);
    }

    public sprtvh() {
        this.cfr_renamed_91 = "EC";
        sprtvh sprtvh2 = this;
        this.cfr_renamed_1 = new sprtlj();
    }

    /*
     * WARNING - void declaration
     */
    public sprtvh(String string, sprtvh sprtvh2) {
        void arg0;
        void arg1;
        sprtvh sprtvh3 = this;
        void v1 = arg1;
        sprtvh sprtvh4 = this;
        sprtvh sprtvh5 = this;
        sprtvh5.cfr_renamed_91 = "EC";
        sprtvh sprtvh6 = this;
        sprtvh5.cfr_renamed_1 = new sprtlj();
        sprtvh5.cfr_renamed_91 = arg0;
        sprtvh4.cfr_renamed_0 = arg1.cfr_renamed_0;
        sprtvh4.cfr_renamed_2 = arg1.cfr_renamed_2;
        this.cfr_renamed_4 = v1.cfr_renamed_4;
        sprtvh3.cfr_renamed_1 = v1.cfr_renamed_1;
        sprtvh3.cfr_renamed_3 = sprtvh2.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprtvh(String string, ECPrivateKeySpec eCPrivateKeySpec) {
        void arg1;
        void arg0;
        sprtvh sprtvh2 = this;
        sprtvh sprtvh3 = this;
        sprtvh3.cfr_renamed_91 = "EC";
        sprtvh sprtvh4 = this;
        sprtvh3.cfr_renamed_1 = new sprtlj();
        sprtvh3.cfr_renamed_91 = arg0;
        sprtvh2.cfr_renamed_0 = arg1.getS();
        sprtvh2.cfr_renamed_2 = eCPrivateKeySpec.getParams();
    }

    public sprtvh(String arg0, sprguh arg1) {
        sprguh sprguh2 = arg1;
        sprtvh sprtvh2 = this;
        sprtvh2.cfr_renamed_91 = "EC";
        sprtvh sprtvh3 = this;
        sprtvh2.cfr_renamed_1 = new sprtlj();
        sprtvh2.cfr_renamed_91 = arg0;
        this.cfr_renamed_0 = sprguh2.cfr_renamed_2112();
        if (sprguh2.cfr_renamed_2110() != null) {
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(arg1.cfr_renamed_2110().cfr_renamed_1769(), arg1.cfr_renamed_2110().cfr_renamed_2113());
            this.cfr_renamed_2 = sprnlj.cfr_renamed_9153(ellipticCurve, arg1.cfr_renamed_2110());
            return;
        }
        this.cfr_renamed_2 = null;
    }

    public sprrxh cfr_renamed_2308() {
        if (this.cfr_renamed_2 != null) {
            return sprnlj.cfr_renamed_9150(this.cfr_renamed_2);
        }
        return sprsci.cfr_renamed_105.cfr_renamed_2312();
    }

    /*
     * WARNING - void declaration
     */
    public sprtvh(String string, sprzuk sprzuk2, sprboh sprboh2, sprrxh sprrxh2) {
        void arg2;
        sprtvh sprtvh2;
        void arg1;
        void arg0;
        sprtvh sprtvh3 = this;
        this.cfr_renamed_91 = "EC";
        sprtvh sprtvh4 = this;
        this.cfr_renamed_1 = new sprtlj();
        sprtvh3.cfr_renamed_91 = arg0;
        sprtvh3.cfr_renamed_0 = arg1.cfr_renamed_2112();
        if (sprrxh2 == null) {
            sprqxk sprqxk2 = arg1.cfr_renamed_284();
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(sprqxk2.cfr_renamed_1769(), sprqxk2.cfr_renamed_2113());
            sprtvh2 = this;
            this.cfr_renamed_2 = new ECParameterSpec(ellipticCurve, sprnlj.cfr_renamed_9053(sprqxk2.cfr_renamed_1145()), sprqxk2.cfr_renamed_1146(), sprqxk2.cfr_renamed_1153().intValue());
        } else {
            void arg3;
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(arg3.cfr_renamed_1769(), arg3.cfr_renamed_2113());
            sprtvh2 = this;
            this.cfr_renamed_2 = new ECParameterSpec(ellipticCurve, sprnlj.cfr_renamed_9053(arg3.cfr_renamed_1145()), arg3.cfr_renamed_1146(), arg3.cfr_renamed_1153().intValue());
        }
        sprtvh2.cfr_renamed_3 = this.cfr_renamed_9158((sprboh)arg2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprgbf cfr_renamed_9158(sprboh arg0) {
        try {
            sprvhm sprvhm2 = sprvhm.cfr_renamed_23(sprxgf.cfr_renamed_184(arg0.getEncoded()));
            return sprvhm2.cfr_renamed_2314();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprtvh)) {
            return false;
        }
        sprtvh sprtvh2 = (sprtvh)arg0;
        return this.cfr_renamed_2112().equals(sprtvh2.cfr_renamed_2112()) && this.cfr_renamed_2308().equals(sprtvh2.cfr_renamed_2308());
    }

    @Override
    public ECParameterSpec getParams() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprtvh(ECPrivateKey eCPrivateKey) {
        void arg0;
        sprtvh sprtvh2 = this;
        void v1 = arg0;
        this.cfr_renamed_91 = "EC";
        sprtvh sprtvh3 = this;
        this.cfr_renamed_1 = new sprtlj();
        this.cfr_renamed_0 = v1.getS();
        sprtvh2.cfr_renamed_91 = v1.getAlgorithm();
        sprtvh2.cfr_renamed_2 = eCPrivateKey.getParams();
    }

    /*
     * WARNING - void declaration
     */
    public sprtvh(String string, sprzuk sprzuk2) {
        void arg1;
        void arg0;
        sprtvh sprtvh2 = this;
        sprtvh sprtvh3 = this;
        sprtvh3.cfr_renamed_91 = "EC";
        sprtvh sprtvh4 = this;
        sprtvh3.cfr_renamed_1 = new sprtlj();
        sprtvh3.cfr_renamed_91 = arg0;
        sprtvh2.cfr_renamed_0 = arg1.cfr_renamed_2112();
        sprtvh2.cfr_renamed_2 = null;
    }
}

