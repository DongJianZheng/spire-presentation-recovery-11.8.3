/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprakg;
import com.spire.presentation.packages.sprboe;
import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprcle;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprgh;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprmqg;
import com.spire.presentation.packages.sprndz;
import com.spire.presentation.packages.sprng;
import com.spire.presentation.packages.sprpxl;
import com.spire.presentation.packages.sprqme;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprvsr;
import com.spire.presentation.packages.sprxem;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprypl;
import com.spire.presentation.packages.sprzmg;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class spralg
implements sprng {
    private final Object cfr_renamed_1;
    private static final sprlem[] cfr_renamed_2;
    private final sprgh cfr_renamed_3;
    private static final byte[] cfr_renamed_4;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ sprcle cfr_renamed_1603(Object arg0) throws IOException {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        spralg spralg2;
        byte[] byArray;
        String string;
        if (arg0 instanceof sprcle) {
            return (sprcle)arg0;
        }
        if (arg0 instanceof sprng) {
            return ((sprng)arg0).cfr_renamed_31();
        }
        if (arg0 instanceof sprtpl) {
            string = "CERTIFICATE";
            byArray = ((sprtpl)arg0).cfr_renamed_91();
            spralg2 = this;
        } else if (arg0 instanceof sprpxl) {
            string = "X509 CRL";
            byArray = ((sprpxl)arg0).cfr_renamed_91();
            spralg2 = this;
        } else if (arg0 instanceof sprzmg) {
            string = "TRUSTED CERTIFICATE";
            byArray = ((sprzmg)arg0).cfr_renamed_91();
            spralg2 = this;
        } else if (!(arg0 instanceof sprcom)) {
            if (arg0 instanceof sprvhm) {
                string = "PUBLIC KEY";
                byArray = ((sprvhm)arg0).cfr_renamed_91();
                spralg2 = this;
            } else if (arg0 instanceof sprypl) {
                string = "ATTRIBUTE CERTIFICATE";
                byArray = ((sprypl)arg0).cfr_renamed_91();
                spralg2 = this;
            } else if (arg0 instanceof sprmqg) {
                string = "CERTIFICATE REQUEST";
                byArray = ((sprmqg)arg0).cfr_renamed_91();
                spralg2 = this;
            } else if (arg0 instanceof sprakg) {
                string = "ENCRYPTED PRIVATE KEY";
                byArray = ((sprakg)arg0).cfr_renamed_91();
                spralg2 = this;
            } else {
                if (!(arg0 instanceof sprlvm)) throw new sprboe(sprvsr.cfr_renamed_9("\u0010d\u000ed\n}\u000b*\nh\u000fo\u0006~Ez\u0004y\u0016o\u0001*H*\u0006k\u000b-\u0011*\u0000d\u0006e\u0001oK"));
                string = "PKCS7";
                byArray = ((sprlvm)arg0).cfr_renamed_91();
                spralg2 = this;
            }
        } else {
            object4 = (sprcom)arg0;
            object3 = ((sprcom)object4).cfr_renamed_1254().cfr_renamed_593();
            if (((sprxgf)object3).cfr_renamed_5078(sprdl.cfr_renamed_1205)) {
                string = "RSA PRIVATE KEY";
                byArray = ((sprcom)object4).cfr_renamed_1229().cfr_renamed_119().cfr_renamed_91();
            } else if (((sprxgf)object3).cfr_renamed_5078(cfr_renamed_2[0]) || ((sprxgf)object3).cfr_renamed_5078(cfr_renamed_2[1])) {
                string = "DSA PRIVATE KEY";
                Object object5 = object4;
                object2 = sprxem.cfr_renamed_23(((sprcom)object5).cfr_renamed_1254().cfr_renamed_284());
                Object object6 = object = new sprrvm();
                ((sprrvm)object).cfr_renamed_5004(new sprktm(0L));
                ((sprrvm)object6).cfr_renamed_5004(new sprktm(((sprxem)object2).cfr_renamed_1155()));
                ((sprrvm)object).cfr_renamed_5004(new sprktm(((sprxem)object2).cfr_renamed_1604()));
                ((sprrvm)object).cfr_renamed_5004(new sprktm(((sprxem)object2).cfr_renamed_1145()));
                BigInteger bigInteger = sprktm.cfr_renamed_23(((sprcom)object5).cfr_renamed_1229()).cfr_renamed_97();
                BigInteger bigInteger2 = ((sprxem)object2).cfr_renamed_1145().modPow(bigInteger, ((sprxem)object2).cfr_renamed_1155());
                Object object7 = object;
                ((sprrvm)object7).cfr_renamed_5004(new sprktm(bigInteger2));
                ((sprrvm)object7).cfr_renamed_5004(new sprktm(bigInteger));
                byArray = new sprcen((sprrvm)object).cfr_renamed_91();
            } else if (((sprxgf)object3).cfr_renamed_5078(sprbr.cfr_renamed_135)) {
                string = "EC PRIVATE KEY";
                byArray = ((sprcom)object4).cfr_renamed_1229().cfr_renamed_119().cfr_renamed_91();
            } else {
                string = "PRIVATE KEY";
                byArray = ((sprqqe)object4).cfr_renamed_91();
            }
            spralg2 = this;
        }
        if (spralg2.cfr_renamed_3 == null) return new sprcle(string, byArray);
        object4 = sprkoe.cfr_renamed_116(this.cfr_renamed_3.cfr_renamed_593());
        if (((String)object4).equals(sprndz.cfr_renamed_9("\u0019h\u000eh\u0019h"))) {
            object4 = sprvsr.cfr_renamed_9("N YHO!OV'&H&");
        }
        spralg spralg3 = this;
        object3 = spralg3.cfr_renamed_3.cfr_renamed_1205();
        object2 = spralg3.cfr_renamed_3.cfr_renamed_1512(byArray);
        object = new ArrayList<sprqme>(2);
        object.add(new sprqme(sprndz.cfr_renamed_9("}/B>\u0000\tT-H"), sprvsr.cfr_renamed_9("Q& D&X<Z1O!")));
        object.add(new sprqme(sprndz.cfr_renamed_9("\u0019h\u0016\u0000\u0014C;B"), new StringBuilder().insert(0, (String)object4).append(",").append(this.cfr_renamed_1602((byte[])object3)).toString()));
        return new sprcle(string, (List)object, (byte[])object2);
    }

    /*
     * WARNING - void declaration
     */
    public spralg(Object object) {
        void arg0;
        spralg spralg2 = this;
        spralg2.cfr_renamed_1 = arg0;
        spralg2.cfr_renamed_3 = null;
    }

    static {
        sprlem[] sprlemArray = new sprlem[2];
        sprlemArray[0] = sprbr.cfr_renamed_84;
        sprlemArray[1] = sprgt.cfr_renamed_93;
        cfr_renamed_2 = sprlemArray;
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
        cfr_renamed_4 = byArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprcle cfr_renamed_31() throws sprboe {
        try {
            spralg spralg2 = this;
            return spralg2.cfr_renamed_1603(spralg2.cfr_renamed_1);
        }
        catch (IOException iOException) {
            throw new sprboe(new StringBuilder().insert(0, sprvsr.cfr_renamed_9("o\u000bi\nn\fd\u0002*\u0000r\u0006o\u0015~\fe\u000b0E")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    private /* synthetic */ String cfr_renamed_1602(byte[] arg0) throws IOException {
        int n;
        char[] cArray = new char[arg0.length * 2];
        int n2 = n = 0;
        while (n2 != arg0.length) {
            int n3 = arg0[n] & 0xFF;
            cArray[2 * n] = (char)cfr_renamed_4[n3 >>> 4];
            int n4 = 2 * n + 1;
            cArray[n4] = (char)cfr_renamed_4[n3 & 0xF];
            n2 = ++n;
        }
        return new String(cArray);
    }

    /*
     * WARNING - void declaration
     */
    public spralg(Object object, sprgh sprgh2) {
        void arg0;
        spralg spralg2 = this;
        spralg2.cfr_renamed_1 = arg0;
        spralg2.cfr_renamed_3 = sprgh2;
    }
}

