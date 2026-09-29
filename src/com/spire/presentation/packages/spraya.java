/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprdh;
import com.spire.presentation.packages.spreud;
import com.spire.presentation.packages.sprgoa;
import com.spire.presentation.packages.sprlbd;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprlza;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmaaa;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprna;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sproqd;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprpva;
import com.spire.presentation.packages.sprq;
import com.spire.presentation.packages.sprqla;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprywa;
import com.spire.presentation.packages.sprzde;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class spraya
implements sprq {
    private static final byte[] cfr_renamed_1;
    private final Object cfr_renamed_2;
    private static final sprtzd[] cfr_renamed_3;
    private final sprna cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spraya(Object object) {
        void arg0;
        spraya spraya2 = this;
        spraya2.cfr_renamed_2 = arg0;
        spraya2.cfr_renamed_4 = null;
    }

    private /* synthetic */ String cfr_renamed_1602(byte[] arg0) throws IOException {
        int n;
        char[] cArray = new char[arg0.length * 2];
        int n2 = n = 0;
        while (n2 != arg0.length) {
            int n3 = arg0[n] & 0xFF;
            cArray[2 * n] = (char)cfr_renamed_1[n3 >>> 4];
            int n4 = 2 * n + 1;
            cArray[n4] = (char)cfr_renamed_1[n3 & 0xF];
            n2 = ++n;
        }
        return new String(cArray);
    }

    static {
        sprtzd[] sprtzdArray = new sprtzd[2];
        sprtzdArray[0] = sprtk.cfr_renamed_314;
        sprtzdArray[1] = sprdh.cfr_renamed_1;
        cfr_renamed_3 = sprtzdArray;
        byte[] byArray = new byte[16];
        byArray[0] = 48;
        byArray[1] = 49;
        byArray[2] = 50;
        byArray[3] = 51;
        byArray[4] = 52;
        byArray[5] = 53;
        byArray[6] = 54;
        byArray[7] = 55;
        byArray[8] = 56;
        byArray[9] = 57;
        byArray[10] = 65;
        byArray[11] = 66;
        byArray[12] = 67;
        byArray[13] = 68;
        byArray[14] = 69;
        byArray[15] = 70;
        cfr_renamed_1 = byArray;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ sprpva cfr_renamed_1603(Object arg0) throws IOException {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        spraya spraya2;
        byte[] byArray;
        String string;
        if (arg0 instanceof sprpva) {
            return (sprpva)arg0;
        }
        if (arg0 instanceof sprq) {
            return ((sprq)arg0).cfr_renamed_31();
        }
        if (arg0 instanceof sprcyd) {
            string = "CERTIFICATE";
            byArray = ((sprcyd)arg0).cfr_renamed_91();
            spraya2 = this;
        } else if (arg0 instanceof spreud) {
            string = "X509 CRL";
            byArray = ((spreud)arg0).cfr_renamed_91();
            spraya2 = this;
        } else if (!(arg0 instanceof sprmke)) {
            if (arg0 instanceof sprdce) {
                string = "PUBLIC KEY";
                byArray = ((sprdce)arg0).cfr_renamed_91();
                spraya2 = this;
            } else if (arg0 instanceof sproqd) {
                string = "ATTRIBUTE CERTIFICATE";
                byArray = ((sproqd)arg0).cfr_renamed_91();
                spraya2 = this;
            } else if (arg0 instanceof sprlza) {
                string = "CERTIFICATE REQUEST";
                byArray = ((sprlza)arg0).cfr_renamed_91();
                spraya2 = this;
            } else {
                if (!(arg0 instanceof sprnte)) throw new sprqla(sprmaaa.cfr_renamed_9("p\u001fn\u001fj\u0006kQj\u0013o\u0014f\u0005%\u0001d\u0002v\u0014aQ(Qf\u0010kVqQ`\u001ff\u001ea\u0014+"));
                string = "PKCS7";
                byArray = ((sprnte)arg0).cfr_renamed_91();
                spraya2 = this;
            }
        } else {
            object4 = (sprmke)arg0;
            object3 = ((sprmke)object4).cfr_renamed_1254().cfr_renamed_593();
            if (((sprvva)object3).equals(sprm.cfr_renamed_1510)) {
                string = "RSA PRIVATE KEY";
                byArray = ((sprmke)object4).cfr_renamed_1229().cfr_renamed_119().cfr_renamed_91();
            } else if (((sprvva)object3).equals(cfr_renamed_3[0]) || ((sprvva)object3).equals(cfr_renamed_3[1])) {
                string = "DSA PRIVATE KEY";
                Object object5 = object4;
                object2 = sprzde.cfr_renamed_23(((sprmke)object5).cfr_renamed_1254().cfr_renamed_284());
                Object object6 = object = new sprlre();
                ((sprlre)object).cfr_renamed_49(new sprooe(0L));
                ((sprlre)object6).cfr_renamed_49(new sprooe(((sprzde)object2).cfr_renamed_1155()));
                ((sprlre)object).cfr_renamed_49(new sprooe(((sprzde)object2).cfr_renamed_1604()));
                ((sprlre)object).cfr_renamed_49(new sprooe(((sprzde)object2).cfr_renamed_1145()));
                BigInteger bigInteger = sprooe.cfr_renamed_23(((sprmke)object5).cfr_renamed_1229()).cfr_renamed_97();
                BigInteger bigInteger2 = ((sprzde)object2).cfr_renamed_1145().modPow(bigInteger, ((sprzde)object2).cfr_renamed_1155());
                Object object7 = object;
                ((sprlre)object7).cfr_renamed_49(new sprooe(bigInteger2));
                ((sprlre)object7).cfr_renamed_49(new sprooe(bigInteger));
                byArray = new sprpse((sprlre)object).cfr_renamed_91();
            } else {
                if (!((sprvva)object3).equals(sprtk.cfr_renamed_137)) throw new IOException(sprlbd.cfr_renamed_9("5%\u0018*\u00190V-\u0012!\u00180\u001f\"\u000fd\u00066\u001f2\u00170\u0013d\u001d!\u000f"));
                string = "EC PRIVATE KEY";
                byArray = ((sprmke)object4).cfr_renamed_1229().cfr_renamed_119().cfr_renamed_91();
            }
            spraya2 = this;
        }
        if (spraya2.cfr_renamed_4 == null) return new sprpva(string, byArray);
        object4 = sprywa.cfr_renamed_116(this.cfr_renamed_4.cfr_renamed_593());
        if (((String)object4).equals(sprlbd.cfr_renamed_9("\u00003\u00173\u00003"))) {
            object4 = sprmaaa.cfr_renamed_9("5@\"(4A46\\F3F");
        }
        spraya spraya3 = this;
        object3 = spraya3.cfr_renamed_4.cfr_renamed_1205();
        object2 = spraya3.cfr_renamed_4.cfr_renamed_1512(byArray);
        object = new ArrayList<sprgoa>(2);
        object.add(new sprgoa(sprlbd.cfr_renamed_9("&6\u0019'[\u0010\u000f4\u0013"), sprmaaa.cfr_renamed_9("1]@?F#\\!Q4A")));
        object.add(new sprgoa(sprlbd.cfr_renamed_9("\u00003\u000f[\r\u0018\"\u0019"), new StringBuilder().insert(0, (String)object4).append(",").append(this.cfr_renamed_1602((byte[])object3)).toString()));
        return new sprpva(string, (List)object, (byte[])object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprpva cfr_renamed_31() throws sprqla {
        try {
            spraya spraya2 = this;
            return spraya2.cfr_renamed_1603(spraya2.cfr_renamed_2);
        }
        catch (IOException iOException) {
            throw new sprqla(new StringBuilder().insert(0, sprmaaa.cfr_renamed_9("\u0014k\u0012j\u0015l\u001fbQ`\tf\u0014u\u0005l\u001ekK%")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    /*
     * WARNING - void declaration
     */
    public spraya(Object object, sprna sprna2) {
        void arg0;
        spraya spraya2 = this;
        spraya2.cfr_renamed_2 = arg0;
        spraya2.cfr_renamed_4 = sprna2;
    }
}

