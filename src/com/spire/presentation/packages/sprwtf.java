/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprang;
import com.spire.presentation.packages.sprbig;
import com.spire.presentation.packages.sprbn;
import com.spire.presentation.packages.sprceg;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprcvf;
import com.spire.presentation.packages.sprczf;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprdwf;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.spremf;
import com.spire.presentation.packages.sprfhg;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprgad;
import com.spire.presentation.packages.sprghg;
import com.spire.presentation.packages.sprhqg;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.spripg;
import com.spire.presentation.packages.spriyf;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlkg;
import com.spire.presentation.packages.sprmag;
import com.spire.presentation.packages.sprmuf;
import com.spire.presentation.packages.sprneg;
import com.spire.presentation.packages.sprngg;
import com.spire.presentation.packages.sprozf;
import com.spire.presentation.packages.sprpig;
import com.spire.presentation.packages.sprpkg;
import com.spire.presentation.packages.sprpmg;
import com.spire.presentation.packages.sprpof;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqgo;
import com.spire.presentation.packages.sprqjg;
import com.spire.presentation.packages.sprqsf;
import com.spire.presentation.packages.sprrbg;
import com.spire.presentation.packages.sprrfg;
import com.spire.presentation.packages.sprrhg;
import com.spire.presentation.packages.sprrlf;
import com.spire.presentation.packages.sprrog;
import com.spire.presentation.packages.sprrsf;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprtdg;
import com.spire.presentation.packages.sprtpg;
import com.spire.presentation.packages.sprutf;
import com.spire.presentation.packages.sprvof;
import com.spire.presentation.packages.sprwag;
import com.spire.presentation.packages.sprwxe;
import com.spire.presentation.packages.sprwzf;
import com.spire.presentation.packages.sprxfg;
import com.spire.presentation.packages.sprxxf;
import com.spire.presentation.packages.sprybf;
import com.spire.presentation.packages.sprybg;
import com.spire.presentation.packages.spryog;
import com.spire.presentation.packages.spryye;
import java.io.IOException;

public class sprwtf {
    public static sprcom cfr_renamed_5661(spryye arg0, spridn arg1) throws IOException {
        if (arg0 instanceof sprybf) {
            sprybf sprybf2 = (sprybf)arg0;
            sprddm sprddm2 = sprrlf.cfr_renamed_5924(sprybf2.cfr_renamed_5538());
            return new sprcom(sprddm2, new sprfvg(sprybf2.cfr_renamed_3880()), arg1);
        }
        if (arg0 instanceof sprwag) {
            sprwag sprwag2 = (sprwag)arg0;
            sprddm sprddm3 = new sprddm(sprbn.cfr_renamed_82, new sprghg(sprrlf.cfr_renamed_5907(sprwag2.cfr_renamed_3234())));
            return new sprcom(sprddm3, new sprfvg(sprwag2.cfr_renamed_5683()));
        }
        if (arg0 instanceof sprwzf) {
            int n;
            sprwzf sprwzf2 = (sprwzf)arg0;
            sprddm sprddm4 = new sprddm(sprbn.cfr_renamed_128);
            short[] sArray = sprwzf2.cfr_renamed_5698();
            byte[] byArray = new byte[sArray.length * 2];
            int n2 = n = 0;
            while (n2 != sArray.length) {
                sprpxe.cfr_renamed_5168(sArray[n], byArray, n++ * 2);
                n2 = n;
            }
            return new sprcom(sprddm4, new sprfvg(byArray));
        }
        if (arg0 instanceof spriyf) {
            spriyf spriyf2 = (spriyf)arg0;
            byte[] byArray = sprutf.cfr_renamed_5939().cfr_renamed_5940(1).cfr_renamed_5941(spriyf2).cfr_renamed_1451();
            byte[] byArray2 = sprutf.cfr_renamed_5939().cfr_renamed_5940(1).cfr_renamed_5941(spriyf2.cfr_renamed_1157()).cfr_renamed_1451();
            sprddm sprddm5 = new sprddm(sprdl.cfr_renamed_3);
            return new sprcom(sprddm5, new sprfvg(byArray), arg1, byArray2);
        }
        if (arg0 instanceof sprceg) {
            sprceg sprceg2 = (sprceg)arg0;
            byte[] byArray = sprutf.cfr_renamed_5939().cfr_renamed_5940(sprceg2.cfr_renamed_2331()).cfr_renamed_5941(sprceg2).cfr_renamed_1451();
            byte[] byArray3 = sprutf.cfr_renamed_5939().cfr_renamed_5940(sprceg2.cfr_renamed_2331()).cfr_renamed_5941(sprceg2.cfr_renamed_1157().cfr_renamed_5942()).cfr_renamed_1451();
            sprddm sprddm6 = new sprddm(sprdl.cfr_renamed_3);
            return new sprcom(sprddm6, new sprfvg(byArray), arg1, byArray3);
        }
        if (arg0 instanceof sprcvf) {
            sprcvf sprcvf2 = (sprcvf)arg0;
            sprddm sprddm7 = new sprddm(sprrlf.cfr_renamed_5910(sprcvf2.cfr_renamed_284()));
            sprang sprang2 = new sprang(sprcvf2.cfr_renamed_5769(), sprcvf2.cfr_renamed_1411());
            sprhqg sprhqg2 = new sprhqg(0, sprcvf2.cfr_renamed_2113(), sprcvf2.cfr_renamed_2386(), sprang2);
            return new sprcom(sprddm7, sprhqg2, arg1);
        }
        if (arg0 instanceof sprybg) {
            sprybg sprybg2 = (sprybg)arg0;
            byte[] byArray = sprybg2.cfr_renamed_91();
            sprddm sprddm8 = new sprddm(sprrlf.cfr_renamed_5927(sprybg2.cfr_renamed_284()));
            return new sprcom(sprddm8, new sprfvg(byArray), arg1);
        }
        if (arg0 instanceof sprfhg) {
            sprfhg sprfhg2 = (sprfhg)arg0;
            sprddm sprddm9 = new sprddm(sprrlf.cfr_renamed_5934(sprfhg2.cfr_renamed_284()));
            sprqjg sprqjg2 = new sprqjg(sprfhg2.cfr_renamed_5947());
            sprrfg sprrfg2 = new sprrfg(0, sprfhg2.cfr_renamed_5948(), sprfhg2.cfr_renamed_3369(), sprfhg2.cfr_renamed_1145(), sprfhg2.cfr_renamed_5949(), sprfhg2.cfr_renamed_5950(), sprqjg2);
            return new sprcom(sprddm9, sprrfg2, arg1);
        }
        if (arg0 instanceof spremf) {
            spremf spremf2 = (spremf)arg0;
            sprddm sprddm10 = new sprddm(sprbn.cfr_renamed_1329, new sprrog(spremf2.cfr_renamed_284().cfr_renamed_1452(), sprrlf.cfr_renamed_5938(spremf2.cfr_renamed_3234())));
            return new sprcom(sprddm10, sprwtf.cfr_renamed_5951(spremf2), arg1);
        }
        if (arg0 instanceof sprpof) {
            sprpof sprpof2 = (sprpof)arg0;
            sprddm sprddm11 = new sprddm(sprbn.cfr_renamed_84, new spryog(sprpof2.cfr_renamed_284().cfr_renamed_1452(), sprpof2.cfr_renamed_284().cfr_renamed_1134(), sprrlf.cfr_renamed_5938(sprpof2.cfr_renamed_3234())));
            return new sprcom(sprddm11, sprwtf.cfr_renamed_5952(sprpof2), arg1);
        }
        if (arg0 instanceof sprwxe) {
            sprwxe sprwxe2 = (sprwxe)arg0;
            sprlkg sprlkg2 = new sprlkg(sprwxe2.cfr_renamed_1146(), sprwxe2.cfr_renamed_1150(), sprwxe2.cfr_renamed_845(), sprwxe2.cfr_renamed_1147(), sprwxe2.cfr_renamed_1155(), sprrlf.cfr_renamed_5929(sprwxe2.cfr_renamed_580()));
            sprddm sprddm12 = new sprddm(sprbn.cfr_renamed_102);
            return new sprcom(sprddm12, sprlkg2);
        }
        if (arg0 instanceof sprtdg) {
            sprtdg sprtdg2 = (sprtdg)arg0;
            byte[] byArray = sprtdg2.cfr_renamed_91();
            sprddm sprddm13 = new sprddm(sprrlf.cfr_renamed_5922(sprtdg2.cfr_renamed_284()));
            return new sprcom(sprddm13, new sprfvg(byArray), arg1);
        }
        if (arg0 instanceof sprrbg) {
            sprrbg sprrbg2 = (sprrbg)arg0;
            byte[] byArray = sprrbg2.cfr_renamed_91();
            sprddm sprddm14 = new sprddm(sprrlf.cfr_renamed_5937(sprrbg2.cfr_renamed_284()));
            return new sprcom(sprddm14, new sprfvg(byArray), arg1);
        }
        if (arg0 instanceof sprczf) {
            sprczf sprczf2 = (sprczf)arg0;
            byte[] byArray = sprczf2.cfr_renamed_91();
            sprddm sprddm15 = new sprddm(sprrlf.cfr_renamed_5908(sprczf2.cfr_renamed_284()));
            return new sprcom(sprddm15, new sprfvg(byArray), arg1);
        }
        if (arg0 instanceof sprdwf) {
            sprdwf sprdwf2 = (sprdwf)arg0;
            sprddm sprddm16 = new sprddm(sprrlf.cfr_renamed_5916(sprdwf2.cfr_renamed_284()));
            sprrhg sprrhg2 = new sprrhg(sprdwf2.cfr_renamed_1157());
            sprtpg sprtpg2 = new sprtpg(0, sprdwf2.cfr_renamed_5953(), sprdwf2.cfr_renamed_1145(), sprdwf2.cfr_renamed_5954(), sprrhg2);
            return new sprcom(sprddm16, sprtpg2, arg1);
        }
        if (arg0 instanceof sprneg) {
            sprneg sprneg2 = (sprneg)arg0;
            sprddm sprddm17 = new sprddm(sprrlf.cfr_renamed_5923(sprneg2.cfr_renamed_284()));
            spripg spripg2 = new spripg(sprneg2.cfr_renamed_1144(), sprneg2.cfr_renamed_5955());
            sprngg sprngg2 = new sprngg(0, sprneg2.cfr_renamed_5950(), sprneg2.cfr_renamed_5956(), sprneg2.cfr_renamed_596(), spripg2);
            return new sprcom(sprddm17, sprngg2, arg1);
        }
        if (arg0 instanceof sprxxf) {
            sprxxf sprxxf2 = (sprxxf)arg0;
            sprrvm sprrvm2 = new sprrvm();
            sprrvm2.cfr_renamed_5004(new sprfvg(sprxxf2.cfr_renamed_5957()));
            sprrvm2.cfr_renamed_5004(new sprfvg(sprxxf2.cfr_renamed_3382()));
            sprrvm2.cfr_renamed_5004(new sprfvg(sprxxf2.cfr_renamed_5955()));
            sprrvm2.cfr_renamed_5004(new sprfvg(sprxxf2.cfr_renamed_2690()));
            sprddm sprddm18 = new sprddm(sprrlf.cfr_renamed_5905(sprxxf2.cfr_renamed_284()));
            return new sprcom(sprddm18, new sprcen(sprrvm2), arg1);
        }
        if (arg0 instanceof sprmuf) {
            sprmuf sprmuf2 = (sprmuf)arg0;
            sprrvm sprrvm3 = new sprrvm();
            sprrvm3.cfr_renamed_5004(new sprfvg(sprmuf2.cfr_renamed_5958()));
            sprrvm3.cfr_renamed_5004(new sprfvg(sprmuf2.cfr_renamed_5959()));
            sprrvm3.cfr_renamed_5004(new sprfvg(sprmuf2.cfr_renamed_3382()));
            sprrvm3.cfr_renamed_5004(new sprfvg(sprmuf2.cfr_renamed_5955()));
            sprrvm3.cfr_renamed_5004(new sprfvg(sprmuf2.cfr_renamed_2690()));
            sprddm sprddm19 = new sprddm(sprrlf.cfr_renamed_5913(sprmuf2.cfr_renamed_284()));
            return new sprcom(sprddm19, new sprcen(sprrvm3), arg1);
        }
        if (arg0 instanceof sprxfg) {
            sprxfg sprxfg2 = (sprxfg)arg0;
            sprrvm sprrvm4 = new sprrvm();
            sprrvm4.cfr_renamed_5004(new sprktm(0L));
            sprrvm4.cfr_renamed_5004(new sprdye(sprxfg2.cfr_renamed_5955()));
            sprrvm4.cfr_renamed_5004(new sprdye(sprxfg2.cfr_renamed_1150()));
            sprrvm4.cfr_renamed_5004(new sprdye(sprxfg2.cfr_renamed_5960()));
            sprrvm4.cfr_renamed_5004(new sprdye(sprxfg2.cfr_renamed_5961()));
            sprrvm4.cfr_renamed_5004(new sprdye(sprxfg2.cfr_renamed_5962()));
            sprrvm4.cfr_renamed_5004(new sprdye(sprxfg2.cfr_renamed_5963()));
            sprddm sprddm20 = new sprddm(sprrlf.cfr_renamed_5921(sprxfg2.cfr_renamed_284()));
            sprpig sprpig2 = sprxfg2.cfr_renamed_130();
            return new sprcom(sprddm20, new sprcen(sprrvm4), arg1, sprpig2.cfr_renamed_91());
        }
        if (arg0 instanceof sprpkg) {
            sprpkg sprpkg2 = (sprpkg)arg0;
            sprddm sprddm21 = new sprddm(sprrlf.cfr_renamed_5933(sprpkg2.cfr_renamed_284()));
            byte[] byArray = sprpkg2.cfr_renamed_91();
            return new sprcom(sprddm21, new sprfvg(byArray), arg1);
        }
        if (arg0 instanceof sprmag) {
            sprmag sprmag2 = (sprmag)arg0;
            sprddm sprddm22 = new sprddm(sprrlf.cfr_renamed_5931(sprmag2.cfr_renamed_284()));
            byte[] byArray = sprmag2.cfr_renamed_91();
            return new sprcom(sprddm22, new sprfvg(byArray), arg1);
        }
        if (arg0 instanceof sprozf) {
            sprozf sprozf2 = (sprozf)arg0;
            sprddm sprddm23 = new sprddm(sprrlf.cfr_renamed_5928(sprozf2.cfr_renamed_284()));
            byte[] byArray = sprozf2.cfr_renamed_91();
            return new sprcom(sprddm23, new sprfvg(byArray), arg1);
        }
        throw new IOException(sprqgo.cfr_renamed_9("\t}\u001b8\u0012y\u0010y\u000f}\u0016}\u0010kBv\rlBj\u0007{\r\u007f\fq\u0018}\u0006"));
    }

    public static sprcom cfr_renamed_5964(spryye arg0) throws IOException {
        return sprwtf.cfr_renamed_5661(arg0, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprbig cfr_renamed_5952(sprpof arg0) throws IOException {
        sprpof sprpof2 = arg0;
        byte[] byArray = sprpof2.cfr_renamed_91();
        int n = sprpof2.cfr_renamed_284().cfr_renamed_5732();
        int n2 = sprpof2.cfr_renamed_284().cfr_renamed_1452();
        int n3 = (n2 + 7) / 8;
        int n4 = n;
        int n5 = n;
        int n6 = n;
        int n7 = n;
        int n8 = 0;
        int n9 = (int)sprvof.cfr_renamed_5761(byArray, n8, n3);
        if (!sprvof.cfr_renamed_5764(n2, n9)) {
            throw new IllegalArgumentException(sprgad.cfr_renamed_9("[\u0004V\u000fJJ]\u001fFJ]\f\u0012\b]\u001f\\\u000eA"));
        }
        byte[] byArray2 = sprvof.cfr_renamed_5759(byArray, n8 += n3, n4);
        byte[] byArray3 = sprvof.cfr_renamed_5759(byArray, n8 += n4, n5);
        byte[] byArray4 = sprvof.cfr_renamed_5759(byArray, n8 += n5, n6);
        byte[] byArray5 = sprvof.cfr_renamed_5759(byArray, n8 += n6, n7);
        byte[] byArray6 = sprvof.cfr_renamed_5759(byArray, n8 += n7, byArray.length - n8);
        sprrsf sprrsf2 = null;
        try {
            sprrsf2 = (sprrsf)sprvof.cfr_renamed_5758(byArray6, sprrsf.class);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new IOException(new StringBuilder().insert(0, sprqgo.cfr_renamed_9("{\u0003v\fw\u00168\u0012y\u0010k\u00078 \\1K\u0016y\u0016}/y\u0012\"B")).append(classNotFoundException.getMessage()).toString());
        }
        if (sprrsf2.cfr_renamed_5797() != (1L << n2) - 1L) {
            return new sprbig(n9, byArray2, byArray3, byArray4, byArray5, byArray6, sprrsf2.cfr_renamed_5797());
        }
        return new sprbig(n9, byArray2, byArray3, byArray4, byArray5, byArray6);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ (2 << 2 ^ 1);
        int cfr_ignored_0 = 4 << 4;
        int n4 = n2;
        int n5 = (2 ^ 5) << 3 ^ 5;
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

    private /* synthetic */ sprwtf() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprpmg cfr_renamed_5951(spremf arg0) throws IOException {
        spremf spremf2 = arg0;
        byte[] byArray = spremf2.cfr_renamed_91();
        int n = spremf2.cfr_renamed_284().cfr_renamed_5732();
        int n2 = spremf2.cfr_renamed_284().cfr_renamed_1452();
        int n3 = 4;
        int n4 = n;
        int n5 = n;
        int n6 = n;
        int n7 = n;
        int n8 = 0;
        int n9 = (int)sprvof.cfr_renamed_5761(byArray, n8, n3);
        if (!sprvof.cfr_renamed_5764(n2, n9)) {
            throw new IllegalArgumentException(sprgad.cfr_renamed_9("[\u0004V\u000fJJ]\u001fFJ]\f\u0012\b]\u001f\\\u000eA"));
        }
        byte[] byArray2 = sprvof.cfr_renamed_5759(byArray, n8 += n3, n4);
        byte[] byArray3 = sprvof.cfr_renamed_5759(byArray, n8 += n4, n5);
        byte[] byArray4 = sprvof.cfr_renamed_5759(byArray, n8 += n5, n6);
        byte[] byArray5 = sprvof.cfr_renamed_5759(byArray, n8 += n6, n7);
        byte[] byArray6 = sprvof.cfr_renamed_5759(byArray, n8 += n7, byArray.length - n8);
        sprqsf sprqsf2 = null;
        try {
            sprqsf2 = (sprqsf)sprvof.cfr_renamed_5758(byArray6, sprqsf.class);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new IOException(new StringBuilder().insert(0, sprqgo.cfr_renamed_9("{\u0003v\fw\u00168\u0012y\u0010k\u00078 \\1\"B")).append(classNotFoundException.getMessage()).toString());
        }
        if (sprqsf2.cfr_renamed_5797() != (1 << n2) - 1) {
            return new sprpmg(n9, byArray2, byArray3, byArray4, byArray5, byArray6, sprqsf2.cfr_renamed_5797());
        }
        return new sprpmg(n9, byArray2, byArray3, byArray4, byArray5, byArray6);
    }
}

