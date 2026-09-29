/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprab;
import com.spire.presentation.packages.sprbrb;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprdrda;
import com.spire.presentation.packages.spreed;
import com.spire.presentation.packages.sprfpd;
import com.spire.presentation.packages.sprhqb;
import com.spire.presentation.packages.sprijc;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprjkc;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlpb;
import com.spire.presentation.packages.sprmjb;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprohc;
import com.spire.presentation.packages.sproie;
import com.spire.presentation.packages.sprooc;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprqid;
import com.spire.presentation.packages.sprtdm;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.spruxd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwb;
import com.spire.presentation.packages.sprwc;
import com.spire.presentation.packages.sprxb;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Enumeration;

public class sprllc
implements ECPrivateKey,
sprab,
sprwb,
sprxb {
    private transient sprmra cfr_renamed_112;
    private transient BigInteger cfr_renamed_119;
    private transient sprwc cfr_renamed_91;
    private String cfr_renamed_0;
    private transient sprooc cfr_renamed_1;
    private transient ECParameterSpec cfr_renamed_2;
    private boolean cfr_renamed_3;
    public static final long cfr_renamed_4 = 994553197664784084L;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprmra cfr_renamed_2504(sprohc arg0) {
        try {
            sprdce sprdce2 = sprdce.cfr_renamed_23(sprvva.cfr_renamed_184(arg0.getEncoded()));
            return sprdce2.cfr_renamed_2314();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprllc(String string, ECPrivateKeySpec eCPrivateKeySpec, sprwc sprwc2) {
        void arg0;
        void arg1;
        sprllc sprllc2 = this;
        void v1 = arg1;
        sprllc sprllc3 = this;
        sprllc3.cfr_renamed_0 = "EC";
        sprllc sprllc4 = this;
        sprllc3.cfr_renamed_1 = new sprooc();
        sprllc3.cfr_renamed_0 = arg0;
        this.cfr_renamed_119 = v1.getS();
        sprllc2.cfr_renamed_2 = v1.getParams();
        sprllc2.cfr_renamed_91 = sprwc2;
    }

    @Override
    public Enumeration cfr_renamed_2158() {
        return this.cfr_renamed_1.cfr_renamed_2158();
    }

    @Override
    public BigInteger cfr_renamed_2112() {
        return this.cfr_renamed_119;
    }

    /*
     * WARNING - void declaration
     */
    public sprllc(String string, spreed spreed2, sprwc sprwc2) {
        void arg1;
        void arg0;
        sprllc sprllc2 = this;
        sprllc sprllc3 = this;
        this.cfr_renamed_0 = "EC";
        sprllc sprllc4 = this;
        this.cfr_renamed_1 = new sprooc();
        sprllc3.cfr_renamed_0 = arg0;
        sprllc3.cfr_renamed_119 = arg1.cfr_renamed_2112();
        sprllc2.cfr_renamed_2 = null;
        sprllc2.cfr_renamed_91 = sprwc2;
    }

    @Override
    public ECParameterSpec getParams() {
        return this.cfr_renamed_2;
    }

    @Override
    public sprlpb cfr_renamed_284() {
        if (this.cfr_renamed_2 == null) {
            return null;
        }
        sprllc sprllc2 = this;
        return sprijc.cfr_renamed_2328(sprllc2.cfr_renamed_2, sprllc2.cfr_renamed_3);
    }

    @Override
    public BigInteger getS() {
        return this.cfr_renamed_119;
    }

    @Override
    public void cfr_renamed_2327(String arg0) {
        this.cfr_renamed_3 = !sprdrda.cfr_renamed_9("<]*\\$C;V:@,W").equalsIgnoreCase(arg0);
    }

    @Override
    public void cfr_renamed_2152(sprtzd arg0, spra arg1) {
        this.cfr_renamed_1.cfr_renamed_2152(arg0, arg1);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = System.getProperty(sprtdm.cfr_renamed_9("Z\u0007X\u000b\u0018\u001dS\u001eW\u001cW\u001aY\u001c"));
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer.append(sprdrda.cfr_renamed_9(",PIC\u001bz\u001fr\u001dvIX\fj")).append(string);
        stringBuffer2.append(sprtdm.cfr_renamed_9("\u0016N\u0016N\u0016N\u0016N\u0016N\u0016N\u0016=\fN")).append(this.cfr_renamed_119.toString(16)).append(string);
        return stringBuffer2.toString();
    }

    public sprllc() {
        this.cfr_renamed_0 = "EC";
        sprllc sprllc2 = this;
        this.cfr_renamed_1 = new sprooc();
    }

    /*
     * WARNING - void declaration
     */
    public sprllc(String string, sprmke sprmke2, sprwc sprwc2) throws IOException {
        void arg2;
        void arg0;
        sprllc sprllc2 = this;
        sprllc2.cfr_renamed_0 = "EC";
        sprllc sprllc3 = this;
        sprllc2.cfr_renamed_1 = new sprooc();
        sprllc2.cfr_renamed_0 = arg0;
        this.cfr_renamed_91 = arg2;
        this.cfr_renamed_2329(sprmke2);
    }

    @Override
    public spra cfr_renamed_1510(sprtzd arg0) {
        return this.cfr_renamed_1.cfr_renamed_1510(arg0);
    }

    @Override
    public String getAlgorithm() {
        return this.cfr_renamed_0;
    }

    public sprllc(String arg0, sprhqb arg1, sprwc arg2) {
        sprllc sprllc2;
        sprhqb sprhqb2 = arg1;
        sprllc sprllc3 = this;
        sprllc3.cfr_renamed_0 = "EC";
        sprllc sprllc4 = this;
        sprllc3.cfr_renamed_1 = new sprooc();
        sprllc3.cfr_renamed_0 = arg0;
        this.cfr_renamed_119 = sprhqb2.cfr_renamed_2112();
        if (sprhqb2.cfr_renamed_2110() != null) {
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(arg1.cfr_renamed_2110().cfr_renamed_1769(), arg1.cfr_renamed_2110().cfr_renamed_2113());
            sprllc2 = this;
            this.cfr_renamed_2 = sprijc.cfr_renamed_2311(ellipticCurve, arg1.cfr_renamed_2110());
        } else {
            sprllc2 = this;
            this.cfr_renamed_2 = null;
        }
        sprllc2.cfr_renamed_91 = arg2;
    }

    @Override
    public String getFormat() {
        return sprdrda.cfr_renamed_9("9X*@J+");
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_2329(sprmke.cfr_renamed_23(sprvva.cfr_renamed_184(byArray)));
        this.cfr_renamed_91 = sprbrb.cfr_renamed_86;
        sprllc sprllc2 = this;
        sprllc2.cfr_renamed_1 = new sprooc();
    }

    public int hashCode() {
        return this.cfr_renamed_2112().hashCode() ^ this.cfr_renamed_2308().hashCode();
    }

    public sprllc(String arg0, spreed arg1, sprohc arg2, sprlpb arg3, sprwc arg4) {
        sprllc sprllc2;
        sprllc sprllc3 = this;
        sprllc sprllc4 = this;
        this.cfr_renamed_0 = "EC";
        sprllc sprllc5 = this;
        sprllc4.cfr_renamed_1 = new sprooc();
        sprqid sprqid2 = arg1.cfr_renamed_284();
        sprllc3.cfr_renamed_0 = arg0;
        sprllc4.cfr_renamed_119 = arg1.cfr_renamed_2112();
        sprllc3.cfr_renamed_91 = arg4;
        if (arg3 == null) {
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(sprqid2.cfr_renamed_1769(), sprqid2.cfr_renamed_2113());
            sprllc2 = this;
            this.cfr_renamed_2 = new ECParameterSpec(ellipticCurve, new ECPoint(sprqid2.cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), sprqid2.cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), sprqid2.cfr_renamed_1146(), sprqid2.cfr_renamed_1153().intValue());
        } else {
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(arg3.cfr_renamed_1769(), arg3.cfr_renamed_2113());
            sprllc2 = this;
            this.cfr_renamed_2 = sprijc.cfr_renamed_2311(ellipticCurve, arg3);
        }
        sprllc2.cfr_renamed_112 = this.cfr_renamed_2504(arg2);
    }

    /*
     * WARNING - void declaration
     */
    public sprllc(String string, sprllc sprllc2) {
        void arg0;
        void arg1;
        sprllc sprllc3 = this;
        void v1 = arg1;
        sprllc sprllc4 = this;
        void v3 = arg1;
        sprllc sprllc5 = this;
        sprllc5.cfr_renamed_0 = "EC";
        sprllc sprllc6 = this;
        sprllc5.cfr_renamed_1 = new sprooc();
        sprllc5.cfr_renamed_0 = arg0;
        this.cfr_renamed_119 = v3.cfr_renamed_119;
        sprllc4.cfr_renamed_2 = v3.cfr_renamed_2;
        sprllc4.cfr_renamed_3 = arg1.cfr_renamed_3;
        this.cfr_renamed_1 = v1.cfr_renamed_1;
        sprllc3.cfr_renamed_112 = v1.cfr_renamed_112;
        sprllc3.cfr_renamed_91 = sprllc2.cfr_renamed_91;
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

    private /* synthetic */ void cfr_renamed_2329(sprmke arg0) throws IOException {
        sprmke sprmke2;
        Object object;
        spra spra2;
        spruxd spruxd2 = spruxd.cfr_renamed_23(arg0.cfr_renamed_1254().cfr_renamed_284());
        if (spruxd2.cfr_renamed_2317()) {
            spra2 = sprtzd.cfr_renamed_23(spruxd2.cfr_renamed_284());
            object = sprjkc.cfr_renamed_2318((sprtzd)spra2);
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(((sprfpd)object).cfr_renamed_1769(), ((sprfpd)object).cfr_renamed_2113());
            sprmke2 = arg0;
            sprllc sprllc2 = this;
            sprllc2.cfr_renamed_2 = new sprmjb(sprjkc.cfr_renamed_2319((sprtzd)spra2), ellipticCurve, new ECPoint(((sprfpd)object).cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), ((sprfpd)object).cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), ((sprfpd)object).cfr_renamed_1146(), ((sprfpd)object).cfr_renamed_1153());
        } else if (spruxd2.cfr_renamed_2320()) {
            sprmke2 = arg0;
            this.cfr_renamed_2 = null;
        } else {
            spra2 = sprfpd.cfr_renamed_23(spruxd2.cfr_renamed_284());
            object = sprijc.cfr_renamed_2114(((sprfpd)spra2).cfr_renamed_1769(), ((sprfpd)spra2).cfr_renamed_2113());
            sprmke2 = arg0;
            this.cfr_renamed_2 = new ECParameterSpec((EllipticCurve)object, new ECPoint(((sprfpd)spra2).cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), ((sprfpd)spra2).cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), ((sprfpd)spra2).cfr_renamed_1146(), ((sprfpd)spra2).cfr_renamed_1153().intValue());
        }
        spra spra3 = spra2 = sprmke2.cfr_renamed_1229();
        if (spra2 instanceof sprooe) {
            object = sprooe.cfr_renamed_23(spra3);
            this.cfr_renamed_119 = ((sprooe)object).cfr_renamed_97();
            return;
        }
        object = sproie.cfr_renamed_23(spra3);
        sprllc sprllc3 = this;
        sprllc3.cfr_renamed_119 = ((sproie)object).cfr_renamed_1521();
        sprllc3.cfr_renamed_112 = ((sproie)object).cfr_renamed_1157();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprllc)) {
            return false;
        }
        sprllc sprllc2 = (sprllc)arg0;
        return this.cfr_renamed_2112().equals(sprllc2.cfr_renamed_2112()) && this.cfr_renamed_2308().equals(sprllc2.cfr_renamed_2308());
    }

    public sprlpb cfr_renamed_2308() {
        if (this.cfr_renamed_2 != null) {
            sprllc sprllc2 = this;
            return sprijc.cfr_renamed_2328(sprllc2.cfr_renamed_2, sprllc2.cfr_renamed_3);
        }
        return this.cfr_renamed_91.cfr_renamed_2312();
    }

    public sprllc(String arg0, spreed arg1, sprohc arg2, ECParameterSpec arg3, sprwc arg4) {
        sprllc sprllc2;
        sprllc sprllc3 = this;
        sprllc sprllc4 = this;
        this.cfr_renamed_0 = "EC";
        sprllc sprllc5 = this;
        sprllc4.cfr_renamed_1 = new sprooc();
        sprqid sprqid2 = arg1.cfr_renamed_284();
        sprllc3.cfr_renamed_0 = arg0;
        sprllc4.cfr_renamed_119 = arg1.cfr_renamed_2112();
        sprllc3.cfr_renamed_91 = arg4;
        if (arg3 == null) {
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(sprqid2.cfr_renamed_1769(), sprqid2.cfr_renamed_2113());
            sprllc2 = this;
            this.cfr_renamed_2 = new ECParameterSpec(ellipticCurve, new ECPoint(sprqid2.cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), sprqid2.cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), sprqid2.cfr_renamed_1146(), sprqid2.cfr_renamed_1153().intValue());
        } else {
            sprllc2 = this;
            this.cfr_renamed_2 = arg3;
        }
        sprllc2.cfr_renamed_112 = this.cfr_renamed_2504(arg2);
    }

    @Override
    public byte[] getEncoded() {
        sproie sproie2;
        sprkra sprkra2;
        sprllc sprllc2;
        spruxd spruxd2;
        Object object;
        if (this.cfr_renamed_2 instanceof sprmjb) {
            object = sprjkc.cfr_renamed_2326(((sprmjb)this.cfr_renamed_2).cfr_renamed_313());
            if (object == null) {
                object = new sprtzd(((sprmjb)this.cfr_renamed_2).cfr_renamed_313());
            }
            spruxd2 = new spruxd((sprtzd)object);
            sprllc2 = this;
        } else if (this.cfr_renamed_2 == null) {
            spruxd2 = new spruxd(sprume.cfr_renamed_3);
            sprllc2 = this;
        } else {
            sprllc sprllc3 = this;
            sprllc2 = sprllc3;
            Object object2 = object = sprijc.cfr_renamed_2323(sprllc3.cfr_renamed_2.getCurve());
            sprkra2 = new sprfpd((sprpib)object2, sprijc.cfr_renamed_2324((sprpib)object2, this.cfr_renamed_2.getGenerator(), this.cfr_renamed_3), this.cfr_renamed_2.getOrder(), BigInteger.valueOf(this.cfr_renamed_2.getCofactor()), this.cfr_renamed_2.getCurve().getSeed());
            spruxd2 = new spruxd((sprfpd)sprkra2);
        }
        if (sprllc2.cfr_renamed_112 != null) {
            sproie2 = new sproie(this.getS(), this.cfr_renamed_112, spruxd2);
            sprkra2 = sproie2;
        } else {
            sproie2 = new sproie(this.getS(), spruxd2);
            sprkra2 = sproie2;
        }
        try {
            object = new sprmke(new sprije(sprtk.cfr_renamed_137, spruxd2), sprkra2);
            return ((sprkra)object).cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprllc(ECPrivateKey eCPrivateKey, sprwc sprwc2) {
        void arg0;
        sprllc sprllc2 = this;
        void v1 = arg0;
        sprllc sprllc3 = this;
        sprllc3.cfr_renamed_0 = "EC";
        sprllc sprllc4 = this;
        sprllc3.cfr_renamed_1 = new sprooc();
        sprllc3.cfr_renamed_119 = arg0.getS();
        this.cfr_renamed_0 = v1.getAlgorithm();
        sprllc2.cfr_renamed_2 = v1.getParams();
        sprllc2.cfr_renamed_91 = sprwc2;
    }
}

