/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprboo;
import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprcgm;
import com.spire.presentation.packages.sprdbk;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfim;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprgnz;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprjcf;
import com.spire.presentation.packages.sprjij;
import com.spire.presentation.packages.sprjq;
import com.spire.presentation.packages.sprnlj;
import com.spire.presentation.packages.sprnsh;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqjm;
import com.spire.presentation.packages.sprqpj;
import com.spire.presentation.packages.sprqw;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprrxh;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxz;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;

public class sproyj
implements ECPublicKey,
sprxz,
sprjq {
    private transient sprnzk cfr_renamed_112;
    private transient ECParameterSpec cfr_renamed_119;
    private String cfr_renamed_91;
    private transient byte[] cfr_renamed_0;
    public static final long cfr_renamed_1 = 2422789860422731812L;
    private transient boolean cfr_renamed_2;
    private boolean cfr_renamed_3;
    private transient sprqw cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        this.cfr_renamed_4 = sprsci.cfr_renamed_105;
        this.cfr_renamed_9152(sprvhm.cfr_renamed_23(sprxgf.cfr_renamed_184((byte[])objectInputStream.readObject())));
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

    public boolean equals(Object arg0) {
        if (arg0 instanceof sproyj) {
            sproyj sproyj2 = (sproyj)arg0;
            return this.cfr_renamed_112.cfr_renamed_1604().cfr_renamed_8927(sproyj2.cfr_renamed_112.cfr_renamed_1604()) && this.cfr_renamed_2308().equals(sproyj2.cfr_renamed_2308());
        }
        if (arg0 instanceof ECPublicKey) {
            ECPublicKey eCPublicKey = (ECPublicKey)arg0;
            return sproze.cfr_renamed_92(this.getEncoded(), eCPublicKey.getEncoded());
        }
        return false;
    }

    @Override
    public ECPoint getW() {
        return sprnlj.cfr_renamed_9053(this.cfr_renamed_112.cfr_renamed_1604());
    }

    /*
     * WARNING - void declaration
     */
    public sproyj(ECPublicKey eCPublicKey, sprqw sprqw2) {
        void arg1;
        void arg0;
        sproyj sproyj2 = this;
        void v1 = arg0;
        this.cfr_renamed_91 = "EC";
        this.cfr_renamed_91 = v1.getAlgorithm();
        sproyj2.cfr_renamed_119 = v1.getParams();
        sproyj sproyj3 = this;
        sproyj2.cfr_renamed_112 = new sprnzk(sprnlj.cfr_renamed_9155(this.cfr_renamed_119, arg0.getW()), sprnlj.cfr_renamed_9383((sprqw)arg1, arg0.getParams()));
        sproyj2.cfr_renamed_4 = sprqw2;
    }

    @Override
    public void cfr_renamed_2327(String arg0) {
        this.cfr_renamed_3 = !sprgnz.cfr_renamed_9("/2937,(9)/?8").equalsIgnoreCase(arg0);
        this.cfr_renamed_0 = null;
    }

    public sprrxh cfr_renamed_2308() {
        if (this.cfr_renamed_119 != null) {
            return sprnlj.cfr_renamed_9150(this.cfr_renamed_119);
        }
        return this.cfr_renamed_4.cfr_renamed_2312();
    }

    @Override
    public spreuh cfr_renamed_1604() {
        sproyj sproyj2 = this;
        spreuh spreuh2 = sproyj2.cfr_renamed_112.cfr_renamed_1604();
        if (sproyj2.cfr_renamed_119 == null) {
            return spreuh2.cfr_renamed_1976();
        }
        return spreuh2;
    }

    @Override
    public byte[] getEncoded() {
        boolean bl = sprjcf.cfr_renamed_5159(sprboo.cfr_renamed_9(";\u00015@+\u001e1\u001c=@(\u001d5\u0001<\u000b4@+\u000b;\u001b*\u0007,\u0017v\u000b;@=\u00009\f4\u000b\u0007\u001e;"));
        if (this.cfr_renamed_0 == null || this.cfr_renamed_2 != bl) {
            boolean bl2 = this.cfr_renamed_3 || bl;
            sprddm sprddm2 = new sprddm(sprbr.cfr_renamed_135, sprdbk.cfr_renamed_9442(this.cfr_renamed_119, bl2));
            byte[] byArray = this.cfr_renamed_112.cfr_renamed_1604().cfr_renamed_1972(bl2);
            this.cfr_renamed_0 = sprjij.cfr_renamed_5677(sprddm2, byArray);
            this.cfr_renamed_2 = bl;
        }
        return sproze.cfr_renamed_158(this.cfr_renamed_0);
    }

    @Override
    public String getFormat() {
        return sprgnz.cfr_renamed_9("$TIJE");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_9152(sprvhm arg0) {
        int n;
        sprvhm sprvhm2 = arg0;
        sprcgm sprcgm2 = sprcgm.cfr_renamed_23(sprvhm2.cfr_renamed_593().cfr_renamed_284());
        sprgxh sprgxh2 = sprnlj.cfr_renamed_9384(this.cfr_renamed_4, sprcgm2);
        this.cfr_renamed_119 = sprnlj.cfr_renamed_9385(sprcgm2, sprgxh2);
        byte[] byArray = sprvhm2.cfr_renamed_2314().cfr_renamed_81();
        sproug sproug2 = new sprfvg(byArray);
        if (byArray[0] == 4 && byArray[1] == byArray.length - 2 && (byArray[2] == 2 || byArray[2] == 3) && (n = new sprqjm().cfr_renamed_9157(sprgxh2)) >= byArray.length - 3) {
            try {
                sproug2 = (sproug)sprxgf.cfr_renamed_184(byArray);
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(sprboo.cfr_renamed_9("=\u001c*\u0001*N*\u000b;\u0001.\u000b*\u00076\tx\u001e-\f4\u0007;N3\u000b!"));
            }
        }
        sprfim sprfim2 = new sprfim(sprgxh2, sproug2);
        sproyj sproyj2 = this;
        sproyj2.cfr_renamed_112 = new sprnzk(sprfim2.cfr_renamed_2322(), sprqpj.cfr_renamed_9375(this.cfr_renamed_4, sprcgm2));
    }

    @Override
    public ECParameterSpec getParams() {
        return this.cfr_renamed_119;
    }

    /*
     * WARNING - void declaration
     */
    public sproyj(String string, ECPublicKeySpec eCPublicKeySpec, sprqw sprqw2) {
        void arg2;
        void arg1;
        void arg0;
        sproyj sproyj2 = this;
        sproyj sproyj3 = this;
        sproyj3.cfr_renamed_91 = "EC";
        sproyj3.cfr_renamed_91 = arg0;
        sproyj2.cfr_renamed_119 = arg1.getParams();
        sproyj sproyj4 = this;
        sproyj2.cfr_renamed_112 = new sprnzk(sprnlj.cfr_renamed_9155(this.cfr_renamed_119, arg1.getW()), sprnlj.cfr_renamed_9383((sprqw)arg2, arg1.getParams()));
        sproyj2.cfr_renamed_4 = sprqw2;
    }

    @Override
    public sprrxh cfr_renamed_284() {
        if (this.cfr_renamed_119 == null) {
            return null;
        }
        return sprnlj.cfr_renamed_9150(this.cfr_renamed_119);
    }

    /*
     * WARNING - void declaration
     */
    public sproyj(String string, sprnzk sprnzk2, ECParameterSpec eCParameterSpec, sprqw sprqw2) {
        void arg3;
        sproyj sproyj2;
        void arg2;
        void arg1;
        void arg0;
        sproyj sproyj3 = this;
        sproyj3.cfr_renamed_91 = "EC";
        sprqxk sprqxk2 = sprnzk2.cfr_renamed_284();
        sproyj3.cfr_renamed_91 = arg0;
        sproyj3.cfr_renamed_112 = arg1;
        if (arg2 == null) {
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(sprqxk2.cfr_renamed_1769(), sprqxk2.cfr_renamed_2113());
            sproyj sproyj4 = this;
            sproyj2 = sproyj4;
            sproyj4.cfr_renamed_119 = sproyj4.cfr_renamed_9151(ellipticCurve, sprqxk2);
        } else {
            sproyj2 = this;
            this.cfr_renamed_119 = arg2;
        }
        sproyj2.cfr_renamed_4 = arg3;
    }

    private /* synthetic */ ECParameterSpec cfr_renamed_9151(EllipticCurve arg0, sprqxk arg1) {
        return new ECParameterSpec(arg0, sprnlj.cfr_renamed_9053(arg1.cfr_renamed_1145()), arg1.cfr_renamed_1146(), arg1.cfr_renamed_1153().intValue());
    }

    @Override
    public String getAlgorithm() {
        return this.cfr_renamed_91;
    }

    public sprnzk cfr_renamed_9389() {
        return this.cfr_renamed_112;
    }

    /*
     * WARNING - void declaration
     */
    public sproyj(String string, sproyj sproyj2) {
        void arg0;
        void arg1;
        sproyj sproyj3 = this;
        void v1 = arg1;
        sproyj sproyj4 = this;
        this.cfr_renamed_91 = "EC";
        sproyj4.cfr_renamed_91 = arg0;
        sproyj4.cfr_renamed_112 = arg1.cfr_renamed_112;
        this.cfr_renamed_119 = v1.cfr_renamed_119;
        sproyj3.cfr_renamed_3 = v1.cfr_renamed_3;
        sproyj3.cfr_renamed_4 = sproyj2.cfr_renamed_4;
    }

    public String toString() {
        return sprqpj.cfr_renamed_9376("EC", this.cfr_renamed_112.cfr_renamed_1604(), this.cfr_renamed_2308());
    }

    /*
     * WARNING - void declaration
     */
    public sproyj(String string, sprnsh sprnsh2, sprqw sprqw2) {
        void arg2;
        sproyj sproyj2;
        void arg1;
        void arg0;
        sproyj sproyj3 = this;
        sproyj3.cfr_renamed_91 = "EC";
        sproyj3.cfr_renamed_91 = arg0;
        if (sprnsh2.cfr_renamed_2110() != null) {
            sprgxh sprgxh2 = arg1.cfr_renamed_2110().cfr_renamed_1769();
            sproyj2 = this;
            sproyj sproyj4 = this;
            this.cfr_renamed_112 = new sprnzk(arg1.cfr_renamed_1604(), sprqpj.cfr_renamed_9378((sprqw)arg2, arg1.cfr_renamed_2110()));
            this.cfr_renamed_119 = sprnlj.cfr_renamed_9153(sprnlj.cfr_renamed_9052(sprgxh2, arg1.cfr_renamed_2110().cfr_renamed_2113()), arg1.cfr_renamed_2110());
        } else {
            sprrxh sprrxh2 = arg2.cfr_renamed_2312();
            this.cfr_renamed_112 = new sprnzk(sprrxh2.cfr_renamed_1769().cfr_renamed_1996(arg1.cfr_renamed_1604().cfr_renamed_1969().cfr_renamed_1779(), arg1.cfr_renamed_1604().cfr_renamed_1973().cfr_renamed_1779()), sprnlj.cfr_renamed_9383((sprqw)arg2, null));
            sproyj2 = this;
            this.cfr_renamed_119 = null;
        }
        sproyj2.cfr_renamed_4 = arg2;
    }

    public int hashCode() {
        return this.cfr_renamed_112.cfr_renamed_1604().hashCode() ^ this.cfr_renamed_2308().hashCode();
    }

    /*
     * WARNING - void declaration
     */
    public sproyj(String string, sprnzk sprnzk2, sprrxh sprrxh2, sprqw sprqw2) {
        void arg3;
        void arg1;
        sproyj sproyj2;
        void arg2;
        void arg0;
        sproyj sproyj3 = this;
        sproyj3.cfr_renamed_91 = "EC";
        sprqxk sprqxk2 = sprnzk2.cfr_renamed_284();
        sproyj3.cfr_renamed_91 = arg0;
        if (arg2 == null) {
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(sprqxk2.cfr_renamed_1769(), sprqxk2.cfr_renamed_2113());
            sproyj sproyj4 = this;
            sproyj2 = sproyj4;
            sproyj4.cfr_renamed_119 = sproyj4.cfr_renamed_9151(ellipticCurve, sprqxk2);
        } else {
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(arg2.cfr_renamed_1769(), arg2.cfr_renamed_2113());
            sproyj2 = this;
            this.cfr_renamed_119 = sprnlj.cfr_renamed_9153(ellipticCurve, (sprrxh)arg2);
        }
        sproyj2.cfr_renamed_112 = arg1;
        this.cfr_renamed_4 = arg3;
    }

    /*
     * WARNING - void declaration
     */
    public sproyj(String string, sprvhm sprvhm2, sprqw sprqw2) {
        void arg2;
        void arg0;
        sproyj sproyj2 = this;
        sproyj2.cfr_renamed_91 = "EC";
        sproyj2.cfr_renamed_91 = arg0;
        this.cfr_renamed_4 = arg2;
        this.cfr_renamed_9152(sprvhm2);
    }

    /*
     * WARNING - void declaration
     */
    public sproyj(String string, sprnzk sprnzk2, sprqw sprqw2) {
        void arg1;
        void arg0;
        sproyj sproyj2 = this;
        sproyj sproyj3 = this;
        this.cfr_renamed_91 = "EC";
        sproyj3.cfr_renamed_91 = arg0;
        sproyj3.cfr_renamed_112 = arg1;
        sproyj2.cfr_renamed_119 = null;
        sproyj2.cfr_renamed_4 = sprqw2;
    }
}

