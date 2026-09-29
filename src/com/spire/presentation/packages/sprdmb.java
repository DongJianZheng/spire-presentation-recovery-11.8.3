/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprbrb;
import com.spire.presentation.packages.sprcxm;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprdqc;
import com.spire.presentation.packages.sprfpd;
import com.spire.presentation.packages.sprhsh;
import com.spire.presentation.packages.sprhud;
import com.spire.presentation.packages.sprijc;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprisb;
import com.spire.presentation.packages.sprizd;
import com.spire.presentation.packages.sprji;
import com.spire.presentation.packages.sprjkc;
import com.spire.presentation.packages.sprkkb;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlpb;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlsb;
import com.spire.presentation.packages.sprmjb;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprqid;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprsme;
import com.spire.presentation.packages.sprste;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.spruxd;
import com.spire.presentation.packages.sprvb;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwmd;
import com.spire.presentation.packages.sprxb;
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

public class sprdmb
implements ECPublicKey,
sprvb,
sprxb {
    private ECParameterSpec cfr_renamed_0;
    private sprsme cfr_renamed_1;
    private String cfr_renamed_2;
    private boolean cfr_renamed_3;
    private sprrlb cfr_renamed_4;

    public sprrlb cfr_renamed_2307() {
        return this.cfr_renamed_4;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprdmb)) {
            return false;
        }
        sprdmb sprdmb2 = (sprdmb)arg0;
        return this.cfr_renamed_2307().cfr_renamed_1962(sprdmb2.cfr_renamed_2307()) && this.cfr_renamed_2308().equals(sprdmb2.cfr_renamed_2308());
    }

    private /* synthetic */ ECParameterSpec cfr_renamed_2309(EllipticCurve arg0, sprqid arg1) {
        return new ECParameterSpec(arg0, new ECPoint(arg1.cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), arg1.cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), arg1.cfr_renamed_1146(), arg1.cfr_renamed_1153().intValue());
    }

    public sprdmb(sprdce sprdce2) {
        this.cfr_renamed_2 = "EC";
        this.cfr_renamed_2310(sprdce2);
    }

    public sprdmb(String arg0, sprkkb arg1) {
        sprkkb sprkkb2 = arg1;
        sprdmb sprdmb2 = this;
        sprdmb2.cfr_renamed_2 = "EC";
        sprdmb2.cfr_renamed_2 = arg0;
        this.cfr_renamed_4 = sprkkb2.cfr_renamed_1604();
        if (sprkkb2.cfr_renamed_2110() != null) {
            sprpib sprpib2 = arg1.cfr_renamed_2110().cfr_renamed_1769();
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(sprpib2, arg1.cfr_renamed_2110().cfr_renamed_2113());
            this.cfr_renamed_0 = sprijc.cfr_renamed_2311(ellipticCurve, arg1.cfr_renamed_2110());
            return;
        }
        if (this.cfr_renamed_4.cfr_renamed_1769() == null) {
            sprlpb sprlpb2 = sprbrb.cfr_renamed_86.cfr_renamed_2312();
            this.cfr_renamed_4 = sprlpb2.cfr_renamed_1769().cfr_renamed_1991(this.cfr_renamed_4.cfr_renamed_1969().cfr_renamed_1779(), this.cfr_renamed_4.cfr_renamed_1973().cfr_renamed_1779(), false);
        }
        this.cfr_renamed_0 = null;
    }

    /*
     * WARNING - void declaration
     */
    public sprdmb(String string, sprwmd sprwmd2) {
        void arg1;
        void arg0;
        sprdmb sprdmb2 = this;
        sprdmb sprdmb3 = this;
        sprdmb3.cfr_renamed_2 = "EC";
        sprdmb3.cfr_renamed_2 = arg0;
        sprdmb2.cfr_renamed_4 = arg1.cfr_renamed_1604();
        sprdmb2.cfr_renamed_0 = null;
    }

    /*
     * WARNING - void declaration
     */
    public sprdmb(String string, sprwmd sprwmd2, ECParameterSpec eCParameterSpec) {
        void arg2;
        void arg1;
        void arg0;
        sprdmb sprdmb2 = this;
        sprdmb2.cfr_renamed_2 = "EC";
        sprqid sprqid2 = sprwmd2.cfr_renamed_284();
        sprdmb2.cfr_renamed_2 = arg0;
        sprdmb2.cfr_renamed_4 = arg1.cfr_renamed_1604();
        if (arg2 == null) {
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(sprqid2.cfr_renamed_1769(), sprqid2.cfr_renamed_2113());
            this.cfr_renamed_0 = this.cfr_renamed_2309(ellipticCurve, sprqid2);
            return;
        }
        this.cfr_renamed_0 = arg2;
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        byte[] byArray = (byte[])arg0.readObject();
        this.cfr_renamed_2310(sprdce.cfr_renamed_23(sprvva.cfr_renamed_184(byArray)));
        this.cfr_renamed_2 = (String)arg0.readObject();
        this.cfr_renamed_3 = arg0.readBoolean();
    }

    public sprdmb(String arg0, ECPublicKeySpec arg1) {
        sprdmb sprdmb2 = this;
        this.cfr_renamed_2 = "EC";
        this.cfr_renamed_2 = arg0;
        sprdmb2.cfr_renamed_0 = arg1.getParams();
        sprdmb2.cfr_renamed_4 = sprijc.cfr_renamed_2313(this.cfr_renamed_0, arg1.getW(), false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_2310(sprdce arg0) {
        int n;
        sprdce sprdce2;
        sprpib sprpib2;
        Object object;
        sprkra sprkra2;
        spruxd spruxd2;
        if (arg0.cfr_renamed_1473().cfr_renamed_90().equals(sprji.cfr_renamed_4)) {
            int n2;
            sprxue sprxue2;
            sprmra sprmra2 = arg0.cfr_renamed_2314();
            this.cfr_renamed_2 = "ECGOST3410";
            try {
                sprxue2 = (sprxue)sprvva.cfr_renamed_184(sprmra2.cfr_renamed_81());
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(sprhsh.cfr_renamed_9("63!.!a!$0.%$!(=&s1&#?(0a8$*"));
            }
            byte[] byArray = sprxue2.cfr_renamed_186();
            byte[] byArray2 = new byte[32];
            byte[] byArray3 = new byte[32];
            int n3 = n2 = 0;
            while (n3 != byArray2.length) {
                int n4 = n2++;
                byArray2[n4] = byArray[31 - n4];
                n3 = n2;
            }
            int n5 = n2 = 0;
            while (true) {
                if (n5 == byArray3.length) {
                    this.cfr_renamed_1 = new sprsme((sprbne)arg0.cfr_renamed_1473().cfr_renamed_284());
                    sprlsb sprlsb2 = sprisb.cfr_renamed_2315(sprste.cfr_renamed_2316(this.cfr_renamed_1.cfr_renamed_2106()));
                    sprpib sprpib3 = sprlsb2.cfr_renamed_1769();
                    EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(sprpib3, sprlsb2.cfr_renamed_2113());
                    this.cfr_renamed_4 = sprpib3.cfr_renamed_1991(new BigInteger(1, byArray2), new BigInteger(1, byArray3), false);
                    this.cfr_renamed_0 = new sprmjb(sprste.cfr_renamed_2316(this.cfr_renamed_1.cfr_renamed_2106()), ellipticCurve, new ECPoint(sprlsb2.cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), sprlsb2.cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), sprlsb2.cfr_renamed_1146(), sprlsb2.cfr_renamed_1153());
                    return;
                }
                int n6 = n2++;
                byArray3[n6] = byArray[63 - n6];
                n5 = n2;
            }
        }
        spruxd spruxd3 = spruxd2 = new spruxd((sprvva)arg0.cfr_renamed_1473().cfr_renamed_284());
        if (spruxd2.cfr_renamed_2317()) {
            sprkra2 = (sprtzd)spruxd3.cfr_renamed_284();
            object = sprjkc.cfr_renamed_2318((sprtzd)sprkra2);
            sprpib2 = ((sprfpd)object).cfr_renamed_1769();
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(sprpib2, ((sprfpd)object).cfr_renamed_2113());
            sprdce2 = arg0;
            this.cfr_renamed_0 = new sprmjb(sprjkc.cfr_renamed_2319((sprtzd)sprkra2), ellipticCurve, new ECPoint(((sprfpd)object).cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), ((sprfpd)object).cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), ((sprfpd)object).cfr_renamed_1146(), ((sprfpd)object).cfr_renamed_1153());
        } else if (spruxd3.cfr_renamed_2320()) {
            this.cfr_renamed_0 = null;
            sprpib2 = sprbrb.cfr_renamed_86.cfr_renamed_2312().cfr_renamed_1769();
            sprdce2 = arg0;
        } else {
            sprkra2 = sprfpd.cfr_renamed_23(spruxd2.cfr_renamed_284());
            sprpib2 = ((sprfpd)sprkra2).cfr_renamed_1769();
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(sprpib2, ((sprfpd)sprkra2).cfr_renamed_2113());
            sprdce2 = arg0;
            this.cfr_renamed_0 = new ECParameterSpec(ellipticCurve, new ECPoint(((sprfpd)sprkra2).cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), ((sprfpd)sprkra2).cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), ((sprfpd)sprkra2).cfr_renamed_1146(), ((sprfpd)sprkra2).cfr_renamed_1153().intValue());
        }
        sprkra2 = sprdce2.cfr_renamed_2314();
        object = ((sprmra)sprkra2).cfr_renamed_81();
        sprxue sprxue3 = new sprlqe((byte[])object);
        if (object[0] == 4 && object[1] == ((Object)object).length - 2 && (object[2] == 2 || object[2] == 3) && (n = new sprizd().cfr_renamed_2321(sprpib2)) >= ((Object)object).length - 3) {
            try {
                sprxue3 = (sprxue)sprvva.cfr_renamed_184((byte[])object);
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(sprcxm.cfr_renamed_9("<P+M+\u0002+G:M/G+K7EyR,@5K:\u00022G "));
            }
        }
        sprhud sprhud2 = new sprhud(sprpib2, sprxue3);
        this.cfr_renamed_4 = sprhud2.cfr_renamed_2322();
    }

    @Override
    public byte[] getEncoded() {
        sprdce sprdce2;
        if (this.cfr_renamed_2.equals("ECGOST3410")) {
            Object object;
            Object object2;
            sprkra sprkra2;
            sprdmb sprdmb2;
            if (this.cfr_renamed_1 != null) {
                sprdmb sprdmb3 = this;
                sprdmb2 = sprdmb3;
                sprkra2 = sprdmb3.cfr_renamed_1;
            } else if (this.cfr_renamed_0 instanceof sprmjb) {
                sprkra2 = new sprsme(sprste.cfr_renamed_2103(((sprmjb)this.cfr_renamed_0).cfr_renamed_313()), sprji.cfr_renamed_105);
                sprdmb2 = this;
            } else {
                sprdmb sprdmb4 = this;
                sprdmb2 = sprdmb4;
                Object object3 = object2 = sprijc.cfr_renamed_2323(sprdmb4.cfr_renamed_0.getCurve());
                object = new sprfpd((sprpib)object3, sprijc.cfr_renamed_2324((sprpib)object3, this.cfr_renamed_0.getGenerator(), this.cfr_renamed_3), this.cfr_renamed_0.getOrder(), BigInteger.valueOf(this.cfr_renamed_0.getCofactor()), this.cfr_renamed_0.getCurve().getSeed());
                sprkra2 = new spruxd((sprfpd)object);
            }
            object2 = sprdmb2.cfr_renamed_4.cfr_renamed_1969().cfr_renamed_1779();
            sprdmb sprdmb5 = this;
            object = sprdmb5.cfr_renamed_4.cfr_renamed_1973().cfr_renamed_1779();
            byte[] byArray = new byte[64];
            sprdmb5.cfr_renamed_2325(byArray, 0, (BigInteger)object2);
            sprdmb5.cfr_renamed_2325(byArray, 32, (BigInteger)object);
            try {
                sprdce2 = new sprdce(new sprije(sprji.cfr_renamed_4, sprkra2), new sprlqe(byArray));
            }
            catch (IOException iOException) {
                return null;
            }
        } else {
            sprkra sprkra3;
            sprdmb sprdmb6;
            spruxd spruxd2;
            Object object;
            if (this.cfr_renamed_0 instanceof sprmjb) {
                object = sprjkc.cfr_renamed_2326(((sprmjb)this.cfr_renamed_0).cfr_renamed_313());
                if (object == null) {
                    object = new sprtzd(((sprmjb)this.cfr_renamed_0).cfr_renamed_313());
                }
                spruxd2 = new spruxd((sprtzd)object);
                sprdmb6 = this;
            } else if (this.cfr_renamed_0 == null) {
                spruxd2 = new spruxd(sprume.cfr_renamed_3);
                sprdmb6 = this;
            } else {
                sprdmb sprdmb7 = this;
                sprdmb6 = sprdmb7;
                Object object4 = object = sprijc.cfr_renamed_2323(sprdmb7.cfr_renamed_0.getCurve());
                sprkra3 = new sprfpd((sprpib)object4, sprijc.cfr_renamed_2324((sprpib)object4, this.cfr_renamed_0.getGenerator(), this.cfr_renamed_3), this.cfr_renamed_0.getOrder(), BigInteger.valueOf(this.cfr_renamed_0.getCofactor()), this.cfr_renamed_0.getCurve().getSeed());
                spruxd2 = new spruxd((sprfpd)sprkra3);
            }
            object = sprdmb6.cfr_renamed_2307().cfr_renamed_1769();
            sprkra3 = (sprxue)new sprhud(((sprpib)object).cfr_renamed_1991(this.cfr_renamed_1604().cfr_renamed_1969().cfr_renamed_1779(), this.cfr_renamed_1604().cfr_renamed_1973().cfr_renamed_1779(), this.cfr_renamed_3)).cfr_renamed_119();
            sprdce2 = new sprdce(new sprije(sprtk.cfr_renamed_137, spruxd2), ((sprxue)sprkra3).cfr_renamed_186());
        }
        return sprdqc.cfr_renamed_1188(sprdce2);
    }

    @Override
    public void cfr_renamed_2327(String arg0) {
        this.cfr_renamed_3 = !sprhsh.cfr_renamed_9("\u0014\u001d\u0002\u001c\f\u0003\u0013\u0016\u0012\u0000\u0004\u0017").equalsIgnoreCase(arg0);
    }

    @Override
    public String getAlgorithm() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprdmb(String string, sprwmd sprwmd2, sprlpb sprlpb2) {
        void arg2;
        void arg1;
        void arg0;
        sprdmb sprdmb2 = this;
        sprdmb2.cfr_renamed_2 = "EC";
        sprqid sprqid2 = sprwmd2.cfr_renamed_284();
        sprdmb2.cfr_renamed_2 = arg0;
        sprdmb2.cfr_renamed_4 = arg1.cfr_renamed_1604();
        if (arg2 == null) {
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(sprqid2.cfr_renamed_1769(), sprqid2.cfr_renamed_2113());
            this.cfr_renamed_0 = this.cfr_renamed_2309(ellipticCurve, sprqid2);
            return;
        }
        EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(arg2.cfr_renamed_1769(), arg2.cfr_renamed_2113());
        this.cfr_renamed_0 = sprijc.cfr_renamed_2311(ellipticCurve, (sprlpb)arg2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        sprdmb sprdmb2 = this;
        arg0.writeObject(sprdmb2.getEncoded());
        v0.writeObject(sprdmb2.cfr_renamed_2);
        v0.writeBoolean(this.cfr_renamed_3);
    }

    public int hashCode() {
        return this.cfr_renamed_2307().hashCode() ^ this.cfr_renamed_2308().hashCode();
    }

    public sprdmb(ECPublicKey arg0) {
        sprdmb sprdmb2 = this;
        this.cfr_renamed_2 = "EC";
        this.cfr_renamed_2 = arg0.getAlgorithm();
        sprdmb2.cfr_renamed_0 = arg0.getParams();
        sprdmb2.cfr_renamed_4 = sprijc.cfr_renamed_2313(this.cfr_renamed_0, arg0.getW(), false);
    }

    @Override
    public ECPoint getW() {
        return new ECPoint(this.cfr_renamed_4.cfr_renamed_1969().cfr_renamed_1779(), this.cfr_renamed_4.cfr_renamed_1973().cfr_renamed_1779());
    }

    private /* synthetic */ void cfr_renamed_2325(byte[] arg0, int arg1, BigInteger arg2) {
        int n;
        byte[] byArray = arg2.toByteArray();
        if (byArray.length < 32) {
            byte[] byArray2 = new byte[32];
            System.arraycopy(byArray, 0, byArray2, byArray2.length - byArray.length, byArray.length);
            byArray = byArray2;
        }
        int n2 = n = 0;
        while (n2 != 32) {
            int n3 = arg1 + n;
            byte by = byArray[byArray.length - 1 - n];
            arg0[n3] = by;
            n2 = ++n;
        }
    }

    public sprlpb cfr_renamed_2308() {
        if (this.cfr_renamed_0 != null) {
            sprdmb sprdmb2 = this;
            return sprijc.cfr_renamed_2328(sprdmb2.cfr_renamed_0, sprdmb2.cfr_renamed_3);
        }
        return sprbrb.cfr_renamed_86.cfr_renamed_2312();
    }

    @Override
    public ECParameterSpec getParams() {
        return this.cfr_renamed_0;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = System.getProperty(sprcxm.cfr_renamed_9("N0L<\f*G)C+C-M+"));
        StringBuffer stringBuffer2 = stringBuffer.append(sprhsh.cfr_renamed_9("\u0016\u0002s\u0011&#?(0a\u0018$*")).append(string);
        StringBuffer stringBuffer3 = stringBuffer;
        stringBuffer.append(sprcxm.cfr_renamed_9("y\u0002y\u0002y\u0002y\u0002y\u0002y\u0002\u0001\u0018y")).append(this.cfr_renamed_4.cfr_renamed_1969().cfr_renamed_1779().toString(16)).append(string);
        stringBuffer3.append(sprhsh.cfr_renamed_9("sasasasasasa\n{s")).append(this.cfr_renamed_4.cfr_renamed_1973().cfr_renamed_1779().toString(16)).append(string);
        return stringBuffer3.toString();
    }

    @Override
    public sprlpb cfr_renamed_284() {
        if (this.cfr_renamed_0 == null) {
            return null;
        }
        sprdmb sprdmb2 = this;
        return sprijc.cfr_renamed_2328(sprdmb2.cfr_renamed_0, sprdmb2.cfr_renamed_3);
    }

    @Override
    public String getFormat() {
        return sprcxm.cfr_renamed_9("\u0001\fl\u0012`");
    }

    @Override
    public sprrlb cfr_renamed_1604() {
        if (this.cfr_renamed_0 == null) {
            return this.cfr_renamed_4.cfr_renamed_1976();
        }
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprdmb(String string, sprdmb sprdmb2) {
        void arg0;
        void arg1;
        sprdmb sprdmb3 = this;
        void v1 = arg1;
        sprdmb sprdmb4 = this;
        this.cfr_renamed_2 = "EC";
        sprdmb4.cfr_renamed_2 = arg0;
        sprdmb4.cfr_renamed_4 = arg1.cfr_renamed_4;
        this.cfr_renamed_0 = v1.cfr_renamed_0;
        sprdmb3.cfr_renamed_3 = v1.cfr_renamed_3;
        sprdmb3.cfr_renamed_1 = sprdmb2.cfr_renamed_1;
    }
}

