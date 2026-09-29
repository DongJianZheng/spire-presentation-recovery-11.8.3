/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbfb;
import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprbuk;
import com.spire.presentation.packages.sprbyk;
import com.spire.presentation.packages.sprcgm;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprctm;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprdt;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfim;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.sprhzk;
import com.spire.presentation.packages.spridm;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprkhk;
import com.spire.presentation.packages.sprkik;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmqk;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprsfk;
import com.spire.presentation.packages.sprtu;
import com.spire.presentation.packages.spruek;
import com.spire.presentation.packages.sprusk;
import com.spire.presentation.packages.sprxem;
import com.spire.presentation.packages.sprxrk;
import com.spire.presentation.packages.sprxum;
import com.spire.presentation.packages.spryye;
import com.spire.presentation.packages.sprzph;
import com.spire.presentation.packages.sprzuk;
import java.io.IOException;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class sprnjk {
    private static Set cfr_renamed_4 = new HashSet(5);

    public static sprcom cfr_renamed_5661(spryye arg0, spridn arg1) throws IOException {
        if (arg0 instanceof sprkik) {
            sprkhk sprkhk2 = (sprkhk)arg0;
            return new sprcom(new sprddm(sprdl.cfr_renamed_1205, sprpen.cfr_renamed_4), new sprctm(sprkhk2.cfr_renamed_2295(), sprkhk2.cfr_renamed_2296(), sprkhk2.cfr_renamed_360(), sprkhk2.cfr_renamed_1155(), sprkhk2.cfr_renamed_1604(), sprkhk2.cfr_renamed_2305(), sprkhk2.cfr_renamed_2306(), sprkhk2.cfr_renamed_1148()), arg1);
        }
        if (arg0 instanceof sprusk) {
            sprusk sprusk2 = (sprusk)arg0;
            sprmqk sprmqk2 = sprusk2.cfr_renamed_284();
            return new sprcom(new sprddm(sprbr.cfr_renamed_84, new sprxem(sprmqk2.cfr_renamed_1155(), sprmqk2.cfr_renamed_1604(), sprmqk2.cfr_renamed_1145())), new sprktm(sprusk2.cfr_renamed_1980()), arg1);
        }
        if (arg0 instanceof sprzuk) {
            Object object;
            int n;
            sprcgm sprcgm2;
            sprzuk sprzuk2 = (sprzuk)arg0;
            sprqxk sprqxk2 = sprzuk2.cfr_renamed_284();
            if (sprqxk2 == null) {
                sprcgm2 = new sprcgm(sprpen.cfr_renamed_4);
                n = sprzuk2.cfr_renamed_2112().bitLength();
            } else {
                if (sprqxk2 instanceof sprbuk) {
                    int n2;
                    sprlem sprlem2;
                    int n3;
                    sprxum sprxum2 = new sprxum(((sprbuk)sprqxk2).cfr_renamed_2106(), ((sprbuk)sprqxk2).cfr_renamed_2107(), ((sprbuk)sprqxk2).cfr_renamed_2105());
                    if (cfr_renamed_4.contains(sprxum2.cfr_renamed_2106())) {
                        n3 = 32;
                        sprlem2 = sprqo.cfr_renamed_93;
                        n2 = n3;
                    } else {
                        boolean bl = sprzuk2.cfr_renamed_2112().bitLength() > 256;
                        sprlem2 = bl ? sprdt.cfr_renamed_91 : sprdt.cfr_renamed_96;
                        n2 = n3 = bl ? 64 : 32;
                    }
                    byte[] byArray = new byte[n2];
                    sprnjk.cfr_renamed_9436(byArray, n3, 0, sprzuk2.cfr_renamed_2112());
                    return new sprcom(new sprddm(sprlem2, sprxum2), new sprfvg(byArray));
                }
                if (sprqxk2 instanceof sprxrk) {
                    sprcgm2 = new sprcgm(((sprxrk)sprqxk2).cfr_renamed_313());
                    n = sprqxk2.cfr_renamed_1146().bitLength();
                } else {
                    object = new sprhfm(sprqxk2.cfr_renamed_1769(), new sprfim(sprqxk2.cfr_renamed_1145(), false), sprqxk2.cfr_renamed_1146(), sprqxk2.cfr_renamed_1153(), sprqxk2.cfr_renamed_2113());
                    sprcgm2 = new sprcgm((sprhfm)object);
                    n = sprqxk2.cfr_renamed_1146().bitLength();
                }
            }
            object = new sprzph().cfr_renamed_8926(sprqxk2.cfr_renamed_1145(), sprzuk2.cfr_renamed_2112());
            sprdye sprdye2 = new sprdye(((spreuh)object).cfr_renamed_1972(false));
            return new sprcom(new sprddm(sprbr.cfr_renamed_135, sprcgm2), new spridm(n, sprzuk2.cfr_renamed_2112(), sprdye2, sprcgm2), arg1);
        }
        if (arg0 instanceof sprsfk) {
            sprsfk sprsfk2 = (sprsfk)arg0;
            return new sprcom(new sprddm(sprtu.cfr_renamed_4), new sprfvg(sprsfk2.cfr_renamed_91()), arg1, sprsfk2.cfr_renamed_9432().cfr_renamed_91());
        }
        if (arg0 instanceof spruek) {
            spruek spruek2 = (spruek)arg0;
            return new sprcom(new sprddm(sprtu.cfr_renamed_3), new sprfvg(spruek2.cfr_renamed_91()), arg1, spruek2.cfr_renamed_9432().cfr_renamed_91());
        }
        if (arg0 instanceof sprhzk) {
            sprhzk sprhzk2 = (sprhzk)arg0;
            return new sprcom(new sprddm(sprtu.cfr_renamed_2), new sprfvg(sprhzk2.cfr_renamed_91()), arg1, sprhzk2.cfr_renamed_9432().cfr_renamed_91());
        }
        if (arg0 instanceof sprbyk) {
            sprbyk sprbyk2 = (sprbyk)arg0;
            return new sprcom(new sprddm(sprtu.cfr_renamed_0), new sprfvg(sprbyk2.cfr_renamed_91()), arg1, sprbyk2.cfr_renamed_9432().cfr_renamed_91());
        }
        throw new IOException(sprbfb.cfr_renamed_9("$X6\u001d?\\=\\\"X;X=NoS IoO*^ Z!T5X+"));
    }

    private /* synthetic */ sprnjk() {
    }

    private static /* synthetic */ void cfr_renamed_9436(byte[] arg0, int arg1, int arg2, BigInteger arg3) {
        int n;
        byte[] byArray = arg3.toByteArray();
        if (byArray.length < arg1) {
            byte[] byArray2 = new byte[arg1];
            System.arraycopy(byArray, 0, byArray2, byArray2.length - byArray.length, byArray.length);
            byArray = byArray2;
        }
        int n2 = n = 0;
        while (n2 != arg1) {
            int n3 = arg2 + n;
            byte by = byArray[byArray.length - 1 - n];
            arg0[n3] = by;
            n2 = ++n;
        }
    }

    static {
        cfr_renamed_4.add(sprqo.cfr_renamed_272);
        cfr_renamed_4.add(sprqo.cfr_renamed_88);
        cfr_renamed_4.add(sprqo.cfr_renamed_185);
        cfr_renamed_4.add(sprqo.cfr_renamed_953);
        cfr_renamed_4.add(sprqo.cfr_renamed_105);
    }

    public static sprcom cfr_renamed_5964(spryye arg0) throws IOException {
        return sprnjk.cfr_renamed_5661(arg0, null);
    }
}

