/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprbrb;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprdqc;
import com.spire.presentation.packages.sprfpd;
import com.spire.presentation.packages.sprgge;
import com.spire.presentation.packages.sprhee;
import com.spire.presentation.packages.sprijc;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprjk;
import com.spire.presentation.packages.sprkkb;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprktb;
import com.spire.presentation.packages.sprlpb;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlsb;
import com.spire.presentation.packages.sprlzz;
import com.spire.presentation.packages.sprmjb;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprpke;
import com.spire.presentation.packages.sprpon;
import com.spire.presentation.packages.sprqid;
import com.spire.presentation.packages.sprrge;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruxd;
import com.spire.presentation.packages.sprvb;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwmd;
import com.spire.presentation.packages.sprxb;
import com.spire.presentation.packages.sprxie;
import com.spire.presentation.packages.sprxue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;

public class sprccd
implements ECPublicKey,
sprvb,
sprxb {
    private boolean cfr_renamed_91;
    private transient sprrlb cfr_renamed_0;
    private transient sprhee cfr_renamed_1;
    private transient ECParameterSpec cfr_renamed_2;
    public static final long cfr_renamed_3 = 7026240464295649314L;
    private String cfr_renamed_4;

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

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        v0.defaultWriteObject();
        v0.writeObject(this.getEncoded());
    }

    public sprccd(ECPublicKeySpec arg0) {
        sprccd sprccd2 = this;
        this.cfr_renamed_4 = "DSTU4145";
        sprccd2.cfr_renamed_2 = arg0.getParams();
        sprccd2.cfr_renamed_0 = sprijc.cfr_renamed_2313(this.cfr_renamed_2, arg0.getW(), false);
    }

    @Override
    public void cfr_renamed_2327(String arg0) {
        this.cfr_renamed_91 = !sprlzz.cfr_renamed_9("uJcKmTrAsWe@").equalsIgnoreCase(arg0);
    }

    public sprccd(ECPublicKey arg0) {
        sprccd sprccd2 = this;
        this.cfr_renamed_4 = "DSTU4145";
        this.cfr_renamed_4 = arg0.getAlgorithm();
        sprccd2.cfr_renamed_2 = arg0.getParams();
        sprccd2.cfr_renamed_0 = sprijc.cfr_renamed_2313(this.cfr_renamed_2, arg0.getW(), false);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprccd)) {
            return false;
        }
        sprccd sprccd2 = (sprccd)arg0;
        return this.cfr_renamed_2307().cfr_renamed_1962(sprccd2.cfr_renamed_2307()) && this.cfr_renamed_2308().equals(sprccd2.cfr_renamed_2308());
    }

    public sprccd(sprkkb arg0) {
        sprkkb sprkkb2 = arg0;
        this.cfr_renamed_4 = "DSTU4145";
        this.cfr_renamed_0 = sprkkb2.cfr_renamed_1604();
        if (sprkkb2.cfr_renamed_2110() != null) {
            sprpib sprpib2 = arg0.cfr_renamed_2110().cfr_renamed_1769();
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(sprpib2, arg0.cfr_renamed_2110().cfr_renamed_2113());
            this.cfr_renamed_2 = sprijc.cfr_renamed_2311(ellipticCurve, arg0.cfr_renamed_2110());
            return;
        }
        if (this.cfr_renamed_0.cfr_renamed_1769() == null) {
            sprlpb sprlpb2 = sprbrb.cfr_renamed_86.cfr_renamed_2312();
            this.cfr_renamed_0 = sprlpb2.cfr_renamed_1769().cfr_renamed_1996(this.cfr_renamed_0.cfr_renamed_1969().cfr_renamed_1779(), this.cfr_renamed_0.cfr_renamed_1973().cfr_renamed_1779());
        }
        this.cfr_renamed_2 = null;
    }

    @Override
    public sprrlb cfr_renamed_1604() {
        if (this.cfr_renamed_2 == null) {
            return this.cfr_renamed_0.cfr_renamed_1976();
        }
        return this.cfr_renamed_0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_2310(sprdce arg0) {
        sprlpb sprlpb2;
        Object object;
        Object object2;
        sprxue sprxue2;
        sprmra sprmra2 = arg0.cfr_renamed_2314();
        this.cfr_renamed_4 = "DSTU4145";
        try {
            sprxue2 = (sprxue)sprvva.cfr_renamed_184(sprmra2.cfr_renamed_81());
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(sprpon.cfr_renamed_9("o{xfx)xlif|lx`dn*y\u007fkf`i)als"));
        }
        byte[] byArray = sprxue2.cfr_renamed_186();
        if (arg0.cfr_renamed_593().cfr_renamed_593().equals(sprjk.cfr_renamed_3)) {
            this.cfr_renamed_2505(byArray);
        }
        this.cfr_renamed_1 = sprhee.cfr_renamed_23((sprbne)arg0.cfr_renamed_593().cfr_renamed_284());
        sprlpb sprlpb3 = null;
        if (this.cfr_renamed_1.cfr_renamed_2317()) {
            object2 = this.cfr_renamed_1.cfr_renamed_2507();
            object = sprxie.cfr_renamed_2102((sprtzd)object2);
            sprlpb3 = new sprlsb(((sprtzd)object2).cfr_renamed_19(), ((sprqid)object).cfr_renamed_1769(), ((sprqid)object).cfr_renamed_1145(), ((sprqid)object).cfr_renamed_1146(), ((sprqid)object).cfr_renamed_1153(), ((sprqid)object).cfr_renamed_2113());
            sprlpb2 = sprlpb3;
        } else {
            object2 = this.cfr_renamed_1.cfr_renamed_2508();
            object = ((sprpke)object2).cfr_renamed_1997();
            if (arg0.cfr_renamed_593().cfr_renamed_593().equals(sprjk.cfr_renamed_3)) {
                this.cfr_renamed_2505((byte[])object);
            }
            sprkra sprkra2 = object2;
            sprgge sprgge2 = ((sprpke)sprkra2).cfr_renamed_845();
            sprktb sprktb2 = new sprktb(sprgge2.cfr_renamed_1186(), sprgge2.cfr_renamed_2115(), sprgge2.cfr_renamed_2117(), sprgge2.cfr_renamed_2116(), ((sprpke)object2).cfr_renamed_1778(), new BigInteger(1, (byte[])object));
            byte[] byArray2 = ((sprpke)sprkra2).cfr_renamed_1145();
            if (arg0.cfr_renamed_593().cfr_renamed_593().equals(sprjk.cfr_renamed_3)) {
                this.cfr_renamed_2505(byArray2);
            }
            sprktb sprktb3 = sprktb2;
            sprlpb3 = new sprlpb(sprktb3, sprrge.cfr_renamed_2509(sprktb3, byArray2), ((sprpke)object2).cfr_renamed_1146());
            sprlpb2 = sprlpb3;
        }
        object2 = sprlpb2.cfr_renamed_1769();
        object = sprijc.cfr_renamed_2114((sprpib)object2, sprlpb3.cfr_renamed_2113());
        this.cfr_renamed_0 = sprrge.cfr_renamed_2509((sprpib)object2, byArray);
        sprccd sprccd2 = this;
        if (this.cfr_renamed_1.cfr_renamed_2317()) {
            sprccd sprccd3 = this;
            sprccd2.cfr_renamed_2 = new sprmjb(this.cfr_renamed_1.cfr_renamed_2507().cfr_renamed_19(), (EllipticCurve)object, new ECPoint(sprlpb3.cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), sprlpb3.cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), sprlpb3.cfr_renamed_1146(), sprlpb3.cfr_renamed_1153());
            return;
        }
        sprccd2.cfr_renamed_2 = new ECParameterSpec((EllipticCurve)object, new ECPoint(sprlpb3.cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), sprlpb3.cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), sprlpb3.cfr_renamed_1146(), sprlpb3.cfr_renamed_1153().intValue());
    }

    @Override
    public String getAlgorithm() {
        return this.cfr_renamed_4;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = System.getProperty(sprlzz.cfr_renamed_9("LmNa\u000ewEtAvApOv"));
        StringBuffer stringBuffer2 = stringBuffer.append(sprpon.cfr_renamed_9("OJ*Y\u007fkf`i)Als")).append(string);
        StringBuffer stringBuffer3 = stringBuffer;
        stringBuffer.append(sprlzz.cfr_renamed_9("$\u0000$\u0000$\u0000$\u0000$\u0000$\u0000\\\u001a$")).append(this.cfr_renamed_0.cfr_renamed_1969().cfr_renamed_1779().toString(16)).append(string);
        stringBuffer3.append(sprpon.cfr_renamed_9("*)*)*)*)*)*)S3*")).append(this.cfr_renamed_0.cfr_renamed_1973().cfr_renamed_1779().toString(16)).append(string);
        return stringBuffer3.toString();
    }

    @Override
    public String getFormat() {
        return sprlzz.cfr_renamed_9("\\\u000e1\u0010=");
    }

    public byte[] cfr_renamed_2387() {
        if (null != this.cfr_renamed_1) {
            return this.cfr_renamed_1.cfr_renamed_2510();
        }
        return sprhee.cfr_renamed_2511();
    }

    /*
     * WARNING - void declaration
     */
    public sprccd(sprccd sprccd2) {
        void arg0;
        sprccd sprccd3 = this;
        void v1 = arg0;
        sprccd sprccd4 = this;
        sprccd4.cfr_renamed_4 = "DSTU4145";
        sprccd4.cfr_renamed_0 = arg0.cfr_renamed_0;
        this.cfr_renamed_2 = v1.cfr_renamed_2;
        sprccd3.cfr_renamed_91 = v1.cfr_renamed_91;
        sprccd3.cfr_renamed_1 = sprccd2.cfr_renamed_1;
    }

    @Override
    public ECParameterSpec getParams() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprccd(String string, sprwmd sprwmd2) {
        void arg1;
        void arg0;
        sprccd sprccd2 = this;
        sprccd sprccd3 = this;
        sprccd3.cfr_renamed_4 = "DSTU4145";
        sprccd3.cfr_renamed_4 = arg0;
        sprccd2.cfr_renamed_0 = arg1.cfr_renamed_1604();
        sprccd2.cfr_renamed_2 = null;
    }

    @Override
    public byte[] getEncoded() {
        sprdce sprdce2;
        Object object;
        sprkra sprkra2;
        sprccd sprccd2;
        if (this.cfr_renamed_1 != null) {
            sprccd sprccd3 = this;
            sprccd2 = sprccd3;
            sprkra2 = sprccd3.cfr_renamed_1;
        } else if (this.cfr_renamed_2 instanceof sprmjb) {
            sprkra2 = new sprhee(new sprtzd(((sprmjb)this.cfr_renamed_2).cfr_renamed_313()));
            sprccd2 = this;
        } else {
            sprccd sprccd4 = this;
            sprccd2 = sprccd4;
            object = sprijc.cfr_renamed_2323(sprccd4.cfr_renamed_2.getCurve());
            sprfpd sprfpd2 = new sprfpd((sprpib)object, sprijc.cfr_renamed_2324((sprpib)object, this.cfr_renamed_2.getGenerator(), this.cfr_renamed_91), this.cfr_renamed_2.getOrder(), BigInteger.valueOf(this.cfr_renamed_2.getCofactor()), this.cfr_renamed_2.getCurve().getSeed());
            sprkra2 = new spruxd(sprfpd2);
        }
        object = sprrge.cfr_renamed_2512(sprccd2.cfr_renamed_0);
        try {
            sprdce2 = new sprdce(new sprije(sprjk.cfr_renamed_4, sprkra2), new sprlqe((byte[])object));
        }
        catch (IOException iOException) {
            return null;
        }
        return sprdqc.cfr_renamed_1188(sprdce2);
    }

    private /* synthetic */ ECParameterSpec cfr_renamed_2309(EllipticCurve arg0, sprqid arg1) {
        return new ECParameterSpec(arg0, new ECPoint(arg1.cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), arg1.cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), arg1.cfr_renamed_1146(), arg1.cfr_renamed_1153().intValue());
    }

    @Override
    public sprlpb cfr_renamed_284() {
        if (this.cfr_renamed_2 == null) {
            return null;
        }
        sprccd sprccd2 = this;
        return sprijc.cfr_renamed_2328(sprccd2.cfr_renamed_2, sprccd2.cfr_renamed_91);
    }

    public int hashCode() {
        return this.cfr_renamed_2307().hashCode() ^ this.cfr_renamed_2308().hashCode();
    }

    public sprrlb cfr_renamed_2307() {
        return this.cfr_renamed_0;
    }

    @Override
    public ECPoint getW() {
        return new ECPoint(this.cfr_renamed_0.cfr_renamed_1969().cfr_renamed_1779(), this.cfr_renamed_0.cfr_renamed_1973().cfr_renamed_1779());
    }

    public sprlpb cfr_renamed_2308() {
        if (this.cfr_renamed_2 != null) {
            sprccd sprccd2 = this;
            return sprijc.cfr_renamed_2328(sprccd2.cfr_renamed_2, sprccd2.cfr_renamed_91);
        }
        return sprbrb.cfr_renamed_86.cfr_renamed_2312();
    }

    /*
     * WARNING - void declaration
     */
    public sprccd(String string, sprwmd sprwmd2, ECParameterSpec eCParameterSpec) {
        void arg2;
        void arg1;
        void arg0;
        sprccd sprccd2 = this;
        sprccd2.cfr_renamed_4 = "DSTU4145";
        sprqid sprqid2 = sprwmd2.cfr_renamed_284();
        sprccd2.cfr_renamed_4 = arg0;
        sprccd2.cfr_renamed_0 = arg1.cfr_renamed_1604();
        if (arg2 == null) {
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(sprqid2.cfr_renamed_1769(), sprqid2.cfr_renamed_2113());
            this.cfr_renamed_2 = this.cfr_renamed_2309(ellipticCurve, sprqid2);
            return;
        }
        this.cfr_renamed_2 = arg2;
    }

    /*
     * WARNING - void declaration
     */
    public sprccd(String string, sprwmd sprwmd2, sprlpb sprlpb2) {
        void arg2;
        void arg1;
        void arg0;
        sprccd sprccd2 = this;
        sprccd2.cfr_renamed_4 = "DSTU4145";
        sprqid sprqid2 = sprwmd2.cfr_renamed_284();
        sprccd2.cfr_renamed_4 = arg0;
        sprccd2.cfr_renamed_0 = arg1.cfr_renamed_1604();
        if (arg2 == null) {
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(sprqid2.cfr_renamed_1769(), sprqid2.cfr_renamed_2113());
            this.cfr_renamed_2 = this.cfr_renamed_2309(ellipticCurve, sprqid2);
            return;
        }
        EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(arg2.cfr_renamed_1769(), arg2.cfr_renamed_2113());
        this.cfr_renamed_2 = sprijc.cfr_renamed_2311(ellipticCurve, (sprlpb)arg2);
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_2310(sprdce.cfr_renamed_23(sprvva.cfr_renamed_184(byArray)));
    }

    public sprccd(sprdce sprdce2) {
        this.cfr_renamed_4 = "DSTU4145";
        this.cfr_renamed_2310(sprdce2);
    }
}

