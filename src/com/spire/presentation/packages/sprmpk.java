/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravy;
import com.spire.presentation.packages.sprbyk;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprctm;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.spridm;
import com.spire.presentation.packages.sprkhk;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmqk;
import com.spire.presentation.packages.sprnhm;
import com.spire.presentation.packages.sprnjk;
import com.spire.presentation.packages.sprnuk;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.spromk;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqfk;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruik;
import com.spire.presentation.packages.sprusk;
import com.spire.presentation.packages.sprxjk;
import com.spire.presentation.packages.sprxrk;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprynm;
import com.spire.presentation.packages.spryye;
import com.spire.presentation.packages.sprzgg;
import com.spire.presentation.packages.sprzuk;
import java.io.IOException;
import java.math.BigInteger;

public class sprmpk {
    public static final byte[] cfr_renamed_4 = sprkoe.cfr_renamed_433(spravy.cfr_renamed_9("U\u0018_\u0006I\u001bREQ\rCELY:"));

    private /* synthetic */ sprmpk() {
    }

    private static /* synthetic */ boolean cfr_renamed_9879(sprszm arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_84()) {
            if (!(arg0.cfr_renamed_85(n) instanceof sprktm)) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    public static byte[] cfr_renamed_9399(spryye arg0) throws IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprzgg.cfr_renamed_9("\u0010U\u0012U\r\u0014\tG@Z\u0015X\f"));
        }
        if (arg0 instanceof sprkhk) {
            sprcom sprcom2 = sprnjk.cfr_renamed_5964(arg0);
            return sprcom2.cfr_renamed_1229().cfr_renamed_119().cfr_renamed_91();
        }
        if (arg0 instanceof sprzuk) {
            sprcom sprcom3 = sprnjk.cfr_renamed_5964(arg0);
            return sprcom3.cfr_renamed_1229().cfr_renamed_119().cfr_renamed_91();
        }
        if (arg0 instanceof sprusk) {
            sprrvm sprrvm2;
            sprusk sprusk2 = (sprusk)arg0;
            sprmqk sprmqk2 = sprusk2.cfr_renamed_284();
            sprrvm sprrvm3 = sprrvm2 = new sprrvm();
            sprrvm sprrvm4 = sprrvm2;
            sprrvm4.cfr_renamed_5004(new sprktm(0L));
            sprrvm2.cfr_renamed_5004(new sprktm(sprmqk2.cfr_renamed_1155()));
            sprrvm4.cfr_renamed_5004(new sprktm(sprmqk2.cfr_renamed_1604()));
            sprrvm3.cfr_renamed_5004(new sprktm(sprmqk2.cfr_renamed_1145()));
            BigInteger bigInteger = sprmqk2.cfr_renamed_1145().modPow(sprusk2.cfr_renamed_1980(), sprmqk2.cfr_renamed_1155());
            sprrvm3.cfr_renamed_5004(new sprktm(bigInteger));
            sprrvm3.cfr_renamed_5004(new sprktm(sprusk2.cfr_renamed_1980()));
            try {
                return new sprcen(sprrvm2).cfr_renamed_91();
            }
            catch (Exception exception) {
                throw new IllegalStateException(new StringBuilder().insert(0, spravy.cfr_renamed_9("O\u0006[\nV\r\u001a\u001cUH_\u0006Y\u0007^\r\u001a,i)j\u001aS\u001e[\u001c_#_\u0011j\tH\tW\rN\rH\u001b\u001a")).append(exception.getMessage()).toString());
            }
        }
        if (arg0 instanceof sprbyk) {
            sprqfk sprqfk2;
            sprnuk sprnuk2 = ((sprbyk)arg0).cfr_renamed_9432();
            sprqfk sprqfk3 = sprqfk2 = new sprqfk();
            sprqfk sprqfk4 = sprqfk2;
            sprqfk sprqfk5 = sprqfk2;
            sprqfk5.cfr_renamed_9854(cfr_renamed_4);
            sprqfk5.cfr_renamed_9853("none");
            sprqfk4.cfr_renamed_9853("none");
            sprqfk4.cfr_renamed_9853("");
            sprqfk3.cfr_renamed_9849(1);
            Object object = sprxjk.cfr_renamed_9398(sprnuk2);
            sprqfk3.cfr_renamed_9848((byte[])object);
            object = new sprqfk();
            int n = sprybl.cfr_renamed_2794().nextInt();
            Object object2 = object;
            Object object3 = object;
            ((sprqfk)object3).cfr_renamed_9849(n);
            ((sprqfk)object3).cfr_renamed_9849(n);
            ((sprqfk)object2).cfr_renamed_9853("ssh-ed25519");
            byte[] byArray = sprnuk2.cfr_renamed_91();
            ((sprqfk)object2).cfr_renamed_9848(byArray);
            ((sprqfk)object2).cfr_renamed_9848(sproze.cfr_renamed_543(((sprbyk)arg0).cfr_renamed_91(), byArray));
            sprqfk sprqfk6 = sprqfk2;
            ((sprqfk)object).cfr_renamed_9853("");
            sprqfk6.cfr_renamed_9848(((sprqfk)object).cfr_renamed_9850());
            return sprqfk6.cfr_renamed_81();
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprzgg.cfr_renamed_9("A\u000eU\u0002X\u0005\u0014\u0014[@W\u000fZ\u0016Q\u0012@@")).append(arg0.getClass().getName()).append(spravy.cfr_renamed_9("\u001a\u001cUHU\u0018_\u0006I\u001bRHJ\u001aS\u001e[\u001c_HQ\rC")).toString());
    }

    public static spryye cfr_renamed_9401(byte[] arg0) {
        spryye spryye2 = null;
        if (arg0[0] == 48) {
            sprszm sprszm2 = sprszm.cfr_renamed_23(arg0);
            if (sprszm2.cfr_renamed_84() == 6) {
                if (sprmpk.cfr_renamed_9879(sprszm2) && ((sprktm)sprszm2.cfr_renamed_85(0)).cfr_renamed_162().equals(sprhdf.cfr_renamed_0)) {
                    spryye2 = new sprusk(((sprktm)sprszm2.cfr_renamed_85(5)).cfr_renamed_162(), new sprmqk(((sprktm)sprszm2.cfr_renamed_85(1)).cfr_renamed_162(), ((sprktm)sprszm2.cfr_renamed_85(2)).cfr_renamed_162(), ((sprktm)sprszm2.cfr_renamed_85(3)).cfr_renamed_162()));
                }
            } else if (sprszm2.cfr_renamed_84() == 9) {
                if (sprmpk.cfr_renamed_9879(sprszm2) && ((sprktm)sprszm2.cfr_renamed_85(0)).cfr_renamed_162().equals(sprhdf.cfr_renamed_0)) {
                    sprctm sprctm2 = sprctm.cfr_renamed_23(sprszm2);
                    spryye2 = new sprkhk(sprctm2.cfr_renamed_2295(), sprctm2.cfr_renamed_2296(), sprctm2.cfr_renamed_2299(), sprctm2.cfr_renamed_2300(), sprctm2.cfr_renamed_2301(), sprctm2.cfr_renamed_2302(), sprctm2.cfr_renamed_2303(), sprctm2.cfr_renamed_2304());
                }
            } else if (sprszm2.cfr_renamed_84() == 4 && sprszm2.cfr_renamed_85(3) instanceof sprnvm && sprszm2.cfr_renamed_85(2) instanceof sprnvm) {
                spridm spridm2 = spridm.cfr_renamed_23(sprszm2);
                sprlem sprlem2 = sprlem.cfr_renamed_23(spridm2.cfr_renamed_9439());
                sprhfm sprhfm2 = sprnhm.cfr_renamed_7994(sprlem2);
                spryye2 = new sprzuk(spridm2.cfr_renamed_1521(), (sprqxk)new sprxrk(sprlem2, sprhfm2));
            }
        } else {
            spromk spromk2;
            int n;
            spromk spromk3 = new spromk(cfr_renamed_4, arg0);
            String string = spromk3.cfr_renamed_9857();
            if (!"none".equals(string)) {
                throw new IllegalStateException(sprzgg.cfr_renamed_9("Q\u000eW\u0012M\u0010@\u0005P@_\u0005M\u0013\u0014\u000e[\u0014\u0014\u0013A\u0010D\u000fF\u0014Q\u0004"));
            }
            spromk spromk4 = spromk3;
            spromk4.cfr_renamed_9858();
            spromk4.cfr_renamed_9858();
            int n2 = spromk4.cfr_renamed_9856();
            if (n2 != 1) {
                throw new IllegalStateException(spravy.cfr_renamed_9("W\u001dV\u001cS\u0018V\r\u001a\u0003_\u0011IHT\u0007NHI\u001dJ\u0018U\u001aN\r^"));
            }
            spromk spromk5 = spromk3;
            sprxjk.cfr_renamed_9400(spromk5.cfr_renamed_9855());
            byte[] byArray = spromk3.cfr_renamed_9860();
            if (spromk5.cfr_renamed_9671()) {
                throw new IllegalArgumentException(sprzgg.cfr_renamed_9("\u0004Q\u0003[\u0004Q\u0004\u0014\u000bQ\u0019\u0014\bU\u0013\u0014\u0014F\u0001]\f]\u000eS@P\u0001@\u0001"));
            }
            spromk spromk6 = new spromk(byArray);
            int n3 = spromk6.cfr_renamed_9856();
            if (n3 != (n = spromk6.cfr_renamed_9856())) {
                throw new IllegalStateException(spravy.cfr_renamed_9("J\u001aS\u001e[\u001c_HQ\rCHY\u0000_\u000bQHL\tV\u001d_\u001b\u001a\tH\r\u001a\u0006U\u001c\u001a\u001cR\r\u001a\u001b[\u0005_"));
            }
            String string2 = spromk6.cfr_renamed_9857();
            if ("ssh-ed25519".equals(string2)) {
                spromk6.cfr_renamed_9855();
                byte[] byArray2 = spromk6.cfr_renamed_9855();
                if (byArray2.length != 64) {
                    throw new IllegalStateException(sprzgg.cfr_renamed_9("\u0010F\tB\u0001@\u0005\u0014\u000bQ\u0019\u0014\u0016U\fA\u0005\u0014\u000fR@C\u0012[\u000eS@X\u0005Z\u0007@\b"));
                }
                spryye2 = new sprbyk(byArray2, 0);
                spromk2 = spromk6;
            } else if (string2.startsWith("ecdsa")) {
                sprlem sprlem3 = spruik.cfr_renamed_1837(sprkoe.cfr_renamed_184(spromk6.cfr_renamed_9855()));
                if (sprlem3 == null) {
                    throw new IllegalStateException(new StringBuilder().insert(0, spravy.cfr_renamed_9("u!~HT\u0007NH\\\u0007O\u0006^H\\\u0007HR\u001a")).append(string2).toString());
                }
                sprhfm sprhfm3 = sprynm.cfr_renamed_7994(sprlem3);
                if (sprhfm3 == null) {
                    throw new IllegalStateException(new StringBuilder().insert(0, sprzgg.cfr_renamed_9("#A\u0012B\u0005\u0014\u000e[\u0014\u0014\u0006[\u0015Z\u0004\u0014\u0006[\u0012\u000e@")).append(sprlem3).toString());
                }
                spromk spromk7 = spromk6;
                spromk2 = spromk7;
                spromk7.cfr_renamed_9855();
                byte[] byArray3 = spromk6.cfr_renamed_9855();
                spryye2 = new sprzuk(new BigInteger(1, byArray3), (sprqxk)new sprxrk(sprlem3, sprhfm3));
            } else {
                if (string2.startsWith("ssh-rsa")) {
                    BigInteger bigInteger = new BigInteger(1, spromk6.cfr_renamed_9855());
                    BigInteger bigInteger2 = new BigInteger(1, spromk6.cfr_renamed_9855());
                    BigInteger bigInteger3 = new BigInteger(1, spromk6.cfr_renamed_9855());
                    BigInteger bigInteger4 = new BigInteger(1, spromk6.cfr_renamed_9855());
                    BigInteger bigInteger5 = new BigInteger(1, spromk6.cfr_renamed_9855());
                    BigInteger bigInteger6 = new BigInteger(1, spromk6.cfr_renamed_9855());
                    BigInteger bigInteger7 = bigInteger5.subtract(sprhdf.cfr_renamed_2);
                    BigInteger bigInteger8 = bigInteger6.subtract(sprhdf.cfr_renamed_2);
                    BigInteger bigInteger9 = bigInteger3;
                    BigInteger bigInteger10 = bigInteger9.remainder(bigInteger7);
                    BigInteger bigInteger11 = bigInteger9.remainder(bigInteger8);
                    spryye2 = new sprkhk(bigInteger, bigInteger2, bigInteger3, bigInteger5, bigInteger6, bigInteger10, bigInteger11, bigInteger4);
                }
                spromk2 = spromk6;
            }
            spromk2.cfr_renamed_9858();
            if (spromk6.cfr_renamed_9671()) {
                throw new IllegalArgumentException(spravy.cfr_renamed_9("J\u001aS\u001e[\u001c_HQ\rCHX\u0004U\u000bQHR\tIHN\u001a[\u0001V\u0001T\u000f\u001a\f[\u001c["));
            }
        }
        if (spryye2 == null) {
            throw new IllegalArgumentException(sprzgg.cfr_renamed_9("\u0015Z\u0001V\fQ@@\u000f\u0014\u0010U\u0012G\u0005\u0014\u000bQ\u0019"));
        }
        return spryye2;
    }
}

