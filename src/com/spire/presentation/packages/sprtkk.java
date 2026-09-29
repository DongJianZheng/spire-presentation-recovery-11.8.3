/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralm;
import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprbuk;
import com.spire.presentation.packages.sprbyk;
import com.spire.presentation.packages.sprcgm;
import com.spire.presentation.packages.sprchl;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprctm;
import com.spire.presentation.packages.sprcuk;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprdt;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.sprhl;
import com.spire.presentation.packages.sprhzk;
import com.spire.presentation.packages.spridm;
import com.spire.presentation.packages.sprkhk;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmqk;
import com.spire.presentation.packages.sprnhm;
import com.spire.presentation.packages.sproom;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprppm;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprquk;
import com.spire.presentation.packages.sprqwg;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprsfk;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtu;
import com.spire.presentation.packages.spruek;
import com.spire.presentation.packages.sprusk;
import com.spire.presentation.packages.sprwrk;
import com.spire.presentation.packages.sprwsk;
import com.spire.presentation.packages.sprxem;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxrk;
import com.spire.presentation.packages.sprxum;
import com.spire.presentation.packages.spryye;
import com.spire.presentation.packages.sprzbr;
import com.spire.presentation.packages.sprzuk;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;

public class sprtkk {
    public static spryye cfr_renamed_2614(InputStream arg0) throws IOException {
        return sprtkk.cfr_renamed_5663(sprcom.cfr_renamed_23(new sprrzm(arg0).cfr_renamed_24()));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3 ^ 5;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 5 << 1;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    private static /* synthetic */ byte[] cfr_renamed_9874(sprcom arg0) throws IOException {
        return sproug.cfr_renamed_23(arg0.cfr_renamed_1229()).cfr_renamed_186();
    }

    public static spryye cfr_renamed_2615(byte[] arg0) throws IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprzbr.cfr_renamed_9("P\u000fI\u000bA\tE6E\u0004i\u0013F\u0012d\u001cT\u001c\u0000\u001cR\u000fA\u0004\u0000\u0013U\u0011L"));
        }
        if (arg0.length == 0) {
            throw new IllegalArgumentException(sprqwg.cfr_renamed_9("b%{!s#w\u001cw.[9t8V6f626`%s.22\u007f'f."));
        }
        return sprtkk.cfr_renamed_5663(sprcom.cfr_renamed_23(sprxgf.cfr_renamed_184(arg0)));
    }

    public static spryye cfr_renamed_5663(sprcom arg0) throws IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprzbr.cfr_renamed_9("K\u0018Y4N\u001bO]A\u000fG\bM\u0018N\t\u0000\u0013U\u0011L"));
        }
        sprddm sprddm2 = arg0.cfr_renamed_1254();
        sprlem sprlem2 = sprddm2.cfr_renamed_593();
        if (sprlem2.cfr_renamed_5078(sprdl.cfr_renamed_1205) || sprlem2.cfr_renamed_5078(sprdl.cfr_renamed_3250) || sprlem2.cfr_renamed_5078(sprhl.cfr_renamed_2415)) {
            sprctm sprctm2 = sprctm.cfr_renamed_23(arg0.cfr_renamed_1229());
            return new sprkhk(sprctm2.cfr_renamed_2295(), sprctm2.cfr_renamed_2296(), sprctm2.cfr_renamed_2299(), sprctm2.cfr_renamed_2300(), sprctm2.cfr_renamed_2301(), sprctm2.cfr_renamed_2302(), sprctm2.cfr_renamed_2303(), sprctm2.cfr_renamed_2304());
        }
        if (sprlem2.cfr_renamed_5078(sprdl.cfr_renamed_1214)) {
            sproom sproom2 = sproom.cfr_renamed_23(sprddm2.cfr_renamed_284());
            sprktm sprktm2 = (sprktm)arg0.cfr_renamed_1229();
            BigInteger bigInteger = sproom2.cfr_renamed_2331();
            int n = bigInteger == null ? 0 : bigInteger.intValue();
            sprwsk sprwsk2 = new sprwsk(sproom2.cfr_renamed_1155(), sproom2.cfr_renamed_1145(), null, n);
            return new sprquk(sprktm2.cfr_renamed_97(), sprwsk2);
        }
        if (sprlem2.cfr_renamed_5078(sprgt.cfr_renamed_152)) {
            sprppm sprppm2 = sprppm.cfr_renamed_23(sprddm2.cfr_renamed_284());
            sprktm sprktm3 = (sprktm)arg0.cfr_renamed_1229();
            return new sprwrk(sprktm3.cfr_renamed_97(), new sprcuk(sprppm2.cfr_renamed_1155(), sprppm2.cfr_renamed_1145()));
        }
        if (sprlem2.cfr_renamed_5078(sprbr.cfr_renamed_84)) {
            sprktm sprktm4 = (sprktm)arg0.cfr_renamed_1229();
            sprco sprco2 = sprddm2.cfr_renamed_284();
            sprmqk sprmqk2 = null;
            if (sprco2 != null) {
                sprxem sprxem2 = sprxem.cfr_renamed_23(sprco2.cfr_renamed_119());
                sprmqk2 = new sprmqk(sprxem2.cfr_renamed_1155(), sprxem2.cfr_renamed_1604(), sprxem2.cfr_renamed_1145());
            }
            return new sprusk(sprktm4.cfr_renamed_97(), sprmqk2);
        }
        if (sprlem2.cfr_renamed_5078(sprbr.cfr_renamed_135)) {
            sprcom sprcom2;
            sprqxk sprqxk2;
            sprqqe sprqqe2;
            sprcgm sprcgm2 = sprcgm.cfr_renamed_23(sprddm2.cfr_renamed_284());
            if (sprcgm2.cfr_renamed_2317()) {
                sprqqe2 = (sprlem)sprcgm2.cfr_renamed_284();
                sprhfm sprhfm2 = sprchl.cfr_renamed_7994(sprqqe2);
                if (sprhfm2 == null) {
                    sprhfm2 = sprnhm.cfr_renamed_7994(sprqqe2);
                }
                sprqxk2 = new sprxrk((sprlem)sprqqe2, sprhfm2);
                sprcom2 = arg0;
            } else {
                sprhfm sprhfm3 = sprhfm.cfr_renamed_23(sprcgm2.cfr_renamed_284());
                sprqxk2 = new sprqxk(sprhfm3.cfr_renamed_1769(), sprhfm3.cfr_renamed_1145(), sprhfm3.cfr_renamed_1146(), sprhfm3.cfr_renamed_1153(), sprhfm3.cfr_renamed_2113());
                sprcom2 = arg0;
            }
            sprqqe2 = spridm.cfr_renamed_23(sprcom2.cfr_renamed_1229());
            BigInteger bigInteger = ((spridm)sprqqe2).cfr_renamed_1521();
            return new sprzuk(bigInteger, sprqxk2);
        }
        if (sprlem2.cfr_renamed_5078(sprtu.cfr_renamed_3)) {
            return new spruek(sprtkk.cfr_renamed_9874(arg0));
        }
        if (sprlem2.cfr_renamed_5078(sprtu.cfr_renamed_4)) {
            return new sprsfk(sprtkk.cfr_renamed_9874(arg0));
        }
        if (sprlem2.cfr_renamed_5078(sprtu.cfr_renamed_0)) {
            return new sprbyk(sprtkk.cfr_renamed_9874(arg0));
        }
        if (sprlem2.cfr_renamed_5078(sprtu.cfr_renamed_2)) {
            return new sprhzk(sprtkk.cfr_renamed_9874(arg0));
        }
        if (sprlem2.cfr_renamed_5078(sprqo.cfr_renamed_93) || sprlem2.cfr_renamed_5078(sprdt.cfr_renamed_91) || sprlem2.cfr_renamed_5078(sprdt.cfr_renamed_96)) {
            sprco sprco3 = sprddm2.cfr_renamed_284();
            sprxum sprxum2 = sprxum.cfr_renamed_23(sprco3);
            sprbuk sprbuk2 = null;
            BigInteger bigInteger = null;
            sprxgf sprxgf2 = sprco3.cfr_renamed_119();
            if (sprxgf2 instanceof sprszm && (sprszm.cfr_renamed_23(sprxgf2).cfr_renamed_84() == 2 || sprszm.cfr_renamed_23(sprxgf2).cfr_renamed_84() == 3)) {
                sprhfm sprhfm4 = spralm.cfr_renamed_9184(sprxum2.cfr_renamed_2106());
                sprbuk2 = new sprbuk(new sprxrk(sprxum2.cfr_renamed_2106(), sprhfm4), sprxum2.cfr_renamed_2106(), sprxum2.cfr_renamed_2107(), sprxum2.cfr_renamed_2105());
                sproug sproug2 = arg0.cfr_renamed_1369();
                if (sproug2.cfr_renamed_186().length == 32 || sproug2.cfr_renamed_186().length == 64) {
                    bigInteger = new BigInteger(1, sproze.cfr_renamed_537(sproug2.cfr_renamed_186()));
                } else {
                    sprco sprco4;
                    sprco sprco5 = sprco4 = arg0.cfr_renamed_1229();
                    if (sprco4 instanceof sprktm) {
                        bigInteger = sprktm.cfr_renamed_23(sprco5).cfr_renamed_162();
                    } else {
                        byte[] byArray = sproze.cfr_renamed_537(sproug.cfr_renamed_23(sprco5).cfr_renamed_186());
                        bigInteger = new BigInteger(1, byArray);
                    }
                }
            } else {
                sprcom sprcom3;
                sprqqe sprqqe3;
                sprco sprco6;
                sprcgm sprcgm3;
                sprcgm sprcgm4 = sprcgm3 = sprcgm.cfr_renamed_23(sprddm2.cfr_renamed_284());
                if (sprcgm3.cfr_renamed_2317()) {
                    sprco6 = sprlem.cfr_renamed_23(sprcgm4.cfr_renamed_284());
                    sprqqe3 = sprnhm.cfr_renamed_7994(sprco6);
                    sprbuk2 = new sprbuk(new sprxrk((sprlem)sprco6, (sprhfm)sprqqe3), sprxum2.cfr_renamed_2106(), sprxum2.cfr_renamed_2107(), sprxum2.cfr_renamed_2105());
                    sprcom3 = arg0;
                } else if (sprcgm4.cfr_renamed_2320()) {
                    sprbuk2 = null;
                    sprcom3 = arg0;
                } else {
                    sprco6 = sprhfm.cfr_renamed_23(sprcgm3.cfr_renamed_284());
                    sprbuk2 = new sprbuk(new sprxrk(sprlem2, (sprhfm)sprco6), sprxum2.cfr_renamed_2106(), sprxum2.cfr_renamed_2107(), sprxum2.cfr_renamed_2105());
                    sprcom3 = arg0;
                }
                sprco sprco7 = sprco6 = sprcom3.cfr_renamed_1229();
                if (sprco6 instanceof sprktm) {
                    sprqqe3 = sprktm.cfr_renamed_23(sprco7);
                    bigInteger = ((sprktm)sprqqe3).cfr_renamed_97();
                } else {
                    sprqqe3 = spridm.cfr_renamed_23(sprco7);
                    bigInteger = ((spridm)sprqqe3).cfr_renamed_1521();
                }
            }
            return new sprzuk(bigInteger, (sprqxk)new sprbuk(sprbuk2, sprxum2.cfr_renamed_2106(), sprxum2.cfr_renamed_2107(), sprxum2.cfr_renamed_2105()));
        }
        throw new RuntimeException(sprqwg.cfr_renamed_9("s;u8`>f?\u007fw{3w9f>t>w%2>|wb%{!s#wwy2kw|8fw`2q8u9{$w3"));
    }
}

