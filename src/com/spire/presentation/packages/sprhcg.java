/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprang;
import com.spire.presentation.packages.sprbbg;
import com.spire.presentation.packages.sprbig;
import com.spire.presentation.packages.sprbn;
import com.spire.presentation.packages.sprceg;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprcqg;
import com.spire.presentation.packages.sprcvf;
import com.spire.presentation.packages.sprczf;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprdlf;
import com.spire.presentation.packages.sprdwf;
import com.spire.presentation.packages.sprfhg;
import com.spire.presentation.packages.sprfke;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprghg;
import com.spire.presentation.packages.sprgvf;
import com.spire.presentation.packages.sprhqg;
import com.spire.presentation.packages.sprhvf;
import com.spire.presentation.packages.spripg;
import com.spire.presentation.packages.sprivf;
import com.spire.presentation.packages.spriyf;
import com.spire.presentation.packages.sprjgg;
import com.spire.presentation.packages.sprjv;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlkg;
import com.spire.presentation.packages.sprlpf;
import com.spire.presentation.packages.sprmag;
import com.spire.presentation.packages.sprmuf;
import com.spire.presentation.packages.sprned;
import com.spire.presentation.packages.sprneg;
import com.spire.presentation.packages.sprngg;
import com.spire.presentation.packages.sprnxf;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprovf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprozf;
import com.spire.presentation.packages.sprpig;
import com.spire.presentation.packages.sprpkg;
import com.spire.presentation.packages.sprpmg;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqsf;
import com.spire.presentation.packages.sprrbg;
import com.spire.presentation.packages.sprrfg;
import com.spire.presentation.packages.sprrlf;
import com.spire.presentation.packages.sprrog;
import com.spire.presentation.packages.sprrsf;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtdg;
import com.spire.presentation.packages.sprtpg;
import com.spire.presentation.packages.sprunf;
import com.spire.presentation.packages.sprvjf;
import com.spire.presentation.packages.sprvmg;
import com.spire.presentation.packages.sprvof;
import com.spire.presentation.packages.sprvuf;
import com.spire.presentation.packages.sprwag;
import com.spire.presentation.packages.sprwuf;
import com.spire.presentation.packages.sprwxe;
import com.spire.presentation.packages.sprwzf;
import com.spire.presentation.packages.sprxfg;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxuf;
import com.spire.presentation.packages.sprxxf;
import com.spire.presentation.packages.sprybf;
import com.spire.presentation.packages.sprybg;
import com.spire.presentation.packages.spryeg;
import com.spire.presentation.packages.spryog;
import com.spire.presentation.packages.spryye;
import com.spire.presentation.packages.spryyf;
import com.spire.presentation.packages.spryzf;
import java.io.IOException;
import java.io.InputStream;

public class sprhcg {
    private static /* synthetic */ short[] cfr_renamed_5965(byte[] arg0) {
        int n;
        short[] sArray = new short[arg0.length / 2];
        int n2 = n = 0;
        while (n2 != sArray.length) {
            int n3 = n++;
            sArray[n3] = sprpxe.cfr_renamed_5180(arg0, n3 * 2);
            n2 = n;
        }
        return sArray;
    }

    public static spryye cfr_renamed_2614(InputStream arg0) throws IOException {
        return sprhcg.cfr_renamed_5663(sprcom.cfr_renamed_23(new sprrzm(arg0).cfr_renamed_24()));
    }

    public static spryye cfr_renamed_2615(byte[] arg0) throws IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprfke.cfr_renamed_9(";H\"L*N.q.C\u0002T-U\u000f[?[k[9H*CkT>V'"));
        }
        if (arg0.length == 0) {
            throw new IllegalArgumentException(sprned.cfr_renamed_9("1i(m o$P$b\bu't\u0005z5zaz3i ba~,k5b"));
        }
        return sprhcg.cfr_renamed_5663(sprcom.cfr_renamed_23(sprxgf.cfr_renamed_184(arg0)));
    }

    public static spryye cfr_renamed_5663(sprcom arg0) throws IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprfke.cfr_renamed_9("Q.C\u0002T-Uk[9H*CkT>V'"));
        }
        sprddm sprddm2 = arg0.cfr_renamed_1254();
        sprlem sprlem2 = sprddm2.cfr_renamed_593();
        if (sprlem2.cfr_renamed_5966(sprbn.cfr_renamed_133)) {
            sproug sproug2 = sproug.cfr_renamed_23(arg0.cfr_renamed_1229());
            return new sprybf(sprrlf.cfr_renamed_5906(sprddm2), sproug2.cfr_renamed_186());
        }
        if (sprlem2.cfr_renamed_5078(sprbn.cfr_renamed_82)) {
            return new sprwag(sproug.cfr_renamed_23(arg0.cfr_renamed_1229()).cfr_renamed_186(), sprrlf.cfr_renamed_5919(sprghg.cfr_renamed_23(sprddm2.cfr_renamed_284())));
        }
        if (sprlem2.cfr_renamed_5078(sprbn.cfr_renamed_128)) {
            return new sprwzf(sprhcg.cfr_renamed_5965(sproug.cfr_renamed_23(arg0.cfr_renamed_1229()).cfr_renamed_186()));
        }
        if (sprlem2.cfr_renamed_5078(sprdl.cfr_renamed_3)) {
            sprcom sprcom2 = arg0;
            byte[] byArray = sproug.cfr_renamed_23(sprcom2.cfr_renamed_1229()).cfr_renamed_186();
            sprgbf sprgbf2 = sprcom2.cfr_renamed_2314();
            if (sprpxe.cfr_renamed_446(byArray, 0) == 1) {
                if (sprgbf2 != null) {
                    byte[] byArray2 = sprgbf2.cfr_renamed_186();
                    return spriyf.cfr_renamed_5967(sproze.cfr_renamed_533(byArray, 4, byArray.length), sproze.cfr_renamed_533(byArray2, 4, byArray2.length));
                }
                return spriyf.cfr_renamed_23(sproze.cfr_renamed_533(byArray, 4, byArray.length));
            }
            if (sprgbf2 != null) {
                byte[] byArray3 = sprgbf2.cfr_renamed_186();
                return sprceg.cfr_renamed_5967(sproze.cfr_renamed_533(byArray, 4, byArray.length), byArray3);
            }
            return sprceg.cfr_renamed_23(sproze.cfr_renamed_533(byArray, 4, byArray.length));
        }
        if (sprlem2.cfr_renamed_5966(sprjv.cfr_renamed_1575)) {
            sprhqg sprhqg2 = sprhqg.cfr_renamed_23(arg0.cfr_renamed_1229());
            sprovf sprovf2 = sprrlf.cfr_renamed_5932(sprlem2);
            sprang sprang2 = sprhqg2.cfr_renamed_1157();
            return new sprcvf(sprovf2, sprhqg2.cfr_renamed_5968(), sprhqg2.cfr_renamed_5969(), sprang2.cfr_renamed_5970(), sprang2.cfr_renamed_5971());
        }
        if (sprlem2.cfr_renamed_5966(sprjv.cfr_renamed_31)) {
            byte[] byArray = sproug.cfr_renamed_23(arg0.cfr_renamed_1229()).cfr_renamed_186();
            sprnxf sprnxf2 = sprrlf.cfr_renamed_5917(sprlem2);
            return new sprybg(sprnxf2, byArray);
        }
        if (sprlem2.cfr_renamed_5966(sprjv.cfr_renamed_3235)) {
            sprrfg sprrfg2 = sprrfg.cfr_renamed_23(arg0.cfr_renamed_1229());
            sprcqg sprcqg2 = sprrlf.cfr_renamed_5918(sprlem2);
            return new sprfhg(sprcqg2, sprrfg2.cfr_renamed_5948(), sprrfg2.cfr_renamed_3369(), sprrfg2.cfr_renamed_1145(), sprrfg2.cfr_renamed_5949(), sprrfg2.cfr_renamed_5950());
        }
        if (sprlem2.cfr_renamed_5966(sprjv.cfr_renamed_3246)) {
            byte[] byArray = sproug.cfr_renamed_23(arg0.cfr_renamed_1229()).cfr_renamed_186();
            sprgvf sprgvf2 = sprrlf.cfr_renamed_5936(sprlem2);
            return new sprtdg(sprgvf2, byArray);
        }
        if (sprlem2.cfr_renamed_5966(sprjv.cfr_renamed_578)) {
            byte[] byArray = sproug.cfr_renamed_23(arg0.cfr_renamed_1229()).cfr_renamed_186();
            sprxuf sprxuf2 = sprrlf.cfr_renamed_5920(sprlem2);
            return new sprrbg(sprxuf2, byArray);
        }
        if (sprlem2.cfr_renamed_5966(sprjv.cfr_renamed_2829)) {
            byte[] byArray = sproug.cfr_renamed_23(arg0.cfr_renamed_1229()).cfr_renamed_186();
            sprvuf sprvuf2 = sprrlf.cfr_renamed_5935(sprlem2);
            return new sprczf(sprvuf2, byArray);
        }
        if (sprlem2.cfr_renamed_5966(sprjv.cfr_renamed_1221)) {
            sprngg sprngg2 = sprngg.cfr_renamed_23(arg0.cfr_renamed_1229());
            sprwuf sprwuf2 = sprrlf.cfr_renamed_5915(sprlem2);
            spripg spripg2 = sprngg2.cfr_renamed_1157();
            if (spripg2 != null) {
                return new sprneg(sprwuf2, sprngg2.cfr_renamed_5950(), sprngg2.cfr_renamed_5972(), sprngg2.cfr_renamed_596(), spripg2.cfr_renamed_1144(), spripg2.cfr_renamed_5955());
            }
            return new sprneg(sprwuf2, sprngg2.cfr_renamed_5950(), sprngg2.cfr_renamed_5972(), sprngg2.cfr_renamed_596(), null, null);
        }
        if (sprlem2.cfr_renamed_5966(sprjv.cfr_renamed_0)) {
            sprszm sprszm2 = sprszm.cfr_renamed_23(arg0.cfr_renamed_1229());
            sprhvf sprhvf2 = sprrlf.cfr_renamed_5925(sprlem2);
            return new sprxxf(sprhvf2, sproug.cfr_renamed_23(sprszm2.cfr_renamed_85(0)).cfr_renamed_186(), sproug.cfr_renamed_23(sprszm2.cfr_renamed_85(1)).cfr_renamed_186(), sproug.cfr_renamed_23(sprszm2.cfr_renamed_85(2)).cfr_renamed_186(), sproug.cfr_renamed_23(sprszm2.cfr_renamed_85(3)).cfr_renamed_186());
        }
        if (sprlem2.cfr_renamed_5966(sprjv.cfr_renamed_1262)) {
            sprszm sprszm3 = sprszm.cfr_renamed_23(arg0.cfr_renamed_1229());
            spryeg spryeg2 = sprrlf.cfr_renamed_5914(sprlem2);
            return new sprmuf(spryeg2, sproug.cfr_renamed_23(sprszm3.cfr_renamed_85(0)).cfr_renamed_186(), sproug.cfr_renamed_23(sprszm3.cfr_renamed_85(1)).cfr_renamed_186(), sproug.cfr_renamed_23(sprszm3.cfr_renamed_85(2)).cfr_renamed_186(), sproug.cfr_renamed_23(sprszm3.cfr_renamed_85(3)).cfr_renamed_186(), sproug.cfr_renamed_23(sprszm3.cfr_renamed_85(4)).cfr_renamed_186());
        }
        if (sprlem2.cfr_renamed_5078(sprjv.cfr_renamed_3240) || sprlem2.cfr_renamed_5078(sprjv.cfr_renamed_3237) || sprlem2.cfr_renamed_5078(sprjv.cfr_renamed_499) || sprlem2.cfr_renamed_5078(sprjv.cfr_renamed_287) || sprlem2.cfr_renamed_5078(sprjv.cfr_renamed_88) || sprlem2.cfr_renamed_5078(sprjv.cfr_renamed_96)) {
            sprco sprco2 = arg0.cfr_renamed_1229();
            sprvmg sprvmg2 = sprrlf.cfr_renamed_5911(sprlem2);
            if (sprco2 instanceof sprszm) {
                sprszm sprszm4 = sprszm.cfr_renamed_23(sprco2);
                int n = sprktm.cfr_renamed_23(sprszm4.cfr_renamed_85(0)).cfr_renamed_5023();
                if (n != 0) {
                    throw new IOException(new StringBuilder().insert(0, sprned.cfr_renamed_9("n/p/t6uak3r7z5~ap$bam$i2r.u{;")).append(n).toString());
                }
                if (arg0.cfr_renamed_2314() != null) {
                    sprpig sprpig2 = spryzf.cfr_renamed_5973(sprvmg2, arg0.cfr_renamed_2314());
                    return new sprxfg(sprvmg2, sprgbf.cfr_renamed_23(sprszm4.cfr_renamed_85(1)).cfr_renamed_186(), sprgbf.cfr_renamed_23(sprszm4.cfr_renamed_85(2)).cfr_renamed_186(), sprgbf.cfr_renamed_23(sprszm4.cfr_renamed_85(3)).cfr_renamed_186(), sprgbf.cfr_renamed_23(sprszm4.cfr_renamed_85(4)).cfr_renamed_186(), sprgbf.cfr_renamed_23(sprszm4.cfr_renamed_85(5)).cfr_renamed_186(), sprgbf.cfr_renamed_23(sprszm4.cfr_renamed_85(6)).cfr_renamed_186(), sprpig2.cfr_renamed_5974());
                }
                return new sprxfg(sprvmg2, sprgbf.cfr_renamed_23(sprszm4.cfr_renamed_85(1)).cfr_renamed_186(), sprgbf.cfr_renamed_23(sprszm4.cfr_renamed_85(2)).cfr_renamed_186(), sprgbf.cfr_renamed_23(sprszm4.cfr_renamed_85(3)).cfr_renamed_186(), sprgbf.cfr_renamed_23(sprszm4.cfr_renamed_85(4)).cfr_renamed_186(), sprgbf.cfr_renamed_23(sprszm4.cfr_renamed_85(5)).cfr_renamed_186(), sprgbf.cfr_renamed_23(sprszm4.cfr_renamed_85(6)).cfr_renamed_186(), null);
            }
            throw new IOException(sprfke.cfr_renamed_9("%U?\u001a8O;J$H?_/"));
        }
        if (sprlem2.cfr_renamed_5078(sprjv.cfr_renamed_3034) || sprlem2.cfr_renamed_5078(sprjv.cfr_renamed_723)) {
            sprtpg sprtpg2 = sprtpg.cfr_renamed_23(arg0.cfr_renamed_1229());
            sprbbg sprbbg2 = sprrlf.cfr_renamed_5909(sprlem2);
            return new sprdwf(sprbbg2, sprtpg2.cfr_renamed_5975(), sprtpg2.cfr_renamed_1145(), sprtpg2.cfr_renamed_5958(), sprtpg2.cfr_renamed_1157().cfr_renamed_1153());
        }
        if (sprlem2.cfr_renamed_5966(sprjv.cfr_renamed_1)) {
            byte[] byArray = sproug.cfr_renamed_23(arg0.cfr_renamed_1229()).cfr_renamed_186();
            sprjgg sprjgg2 = sprrlf.cfr_renamed_5930(sprlem2);
            byte[] byArray4 = sproze.cfr_renamed_533(byArray, 0, sprjgg2.cfr_renamed_5976());
            byte[] byArray5 = sproze.cfr_renamed_533(byArray, sprjgg2.cfr_renamed_5976(), 2 * sprjgg2.cfr_renamed_5976());
            byte[] byArray6 = sproze.cfr_renamed_533(byArray, 2 * sprjgg2.cfr_renamed_5976(), byArray.length);
            return new sprpkg(sprjgg2, byArray4, byArray5, byArray6);
        }
        if (sprlem2.cfr_renamed_5966(sprjv.cfr_renamed_152)) {
            byte[] byArray = sproug.cfr_renamed_23(arg0.cfr_renamed_1229()).cfr_renamed_186();
            spryyf spryyf2 = sprrlf.cfr_renamed_5912(sprlem2);
            return new sprmag(spryyf2, byArray);
        }
        if (sprlem2.cfr_renamed_5966(sprjv.cfr_renamed_2851)) {
            byte[] byArray = sproug.cfr_renamed_23(arg0.cfr_renamed_1229()).cfr_renamed_186();
            sprivf sprivf2 = sprrlf.cfr_renamed_5926(sprlem2);
            return new sprozf(sprivf2, byArray);
        }
        if (sprlem2.cfr_renamed_5078(sprbn.cfr_renamed_1329)) {
            sprrog sprrog2 = sprrog.cfr_renamed_23(sprddm2.cfr_renamed_284());
            sprlem sprlem3 = sprrog2.cfr_renamed_3234().cfr_renamed_593();
            sprpmg sprpmg2 = sprpmg.cfr_renamed_23(arg0.cfr_renamed_1229());
            try {
                sprunf sprunf2 = new sprunf(new sprlpf(sprrog2.cfr_renamed_1452(), sprrlf.cfr_renamed_5654(sprlem3))).cfr_renamed_5777(sprpmg2.cfr_renamed_320()).cfr_renamed_5799(sprpmg2.cfr_renamed_5768()).cfr_renamed_5800(sprpmg2.cfr_renamed_5774()).cfr_renamed_5801(sprpmg2.cfr_renamed_5769()).cfr_renamed_5802(sprpmg2.cfr_renamed_1411());
                if (sprpmg2.cfr_renamed_3() != 0) {
                    sprunf2.cfr_renamed_5977(sprpmg2.cfr_renamed_5797());
                }
                if (sprpmg2.cfr_renamed_5978() != null) {
                    sprqsf sprqsf2 = (sprqsf)sprvof.cfr_renamed_5758(sprpmg2.cfr_renamed_5978(), sprqsf.class);
                    sprunf2.cfr_renamed_5803(sprqsf2.cfr_renamed_5807(sprlem3));
                }
                return sprunf2.cfr_renamed_1451();
            }
            catch (ClassNotFoundException classNotFoundException) {
                throw new IOException(new StringBuilder().insert(0, sprned.cfr_renamed_9("X-z2h\u000ft5].n/\u007f\u0004c\"~1o(t/;1i.x$h2r/|aY\u0005Hah5z5~{;")).append(classNotFoundException.getMessage()).toString());
            }
        }
        if (sprlem2.cfr_renamed_5078(sprbn.cfr_renamed_84)) {
            spryog spryog2 = spryog.cfr_renamed_23(sprddm2.cfr_renamed_284());
            sprlem sprlem4 = spryog2.cfr_renamed_3234().cfr_renamed_593();
            try {
                sprbig sprbig2 = sprbig.cfr_renamed_23(arg0.cfr_renamed_1229());
                sprdlf sprdlf2 = new sprdlf(new sprvjf(spryog2.cfr_renamed_1452(), spryog2.cfr_renamed_1134(), sprrlf.cfr_renamed_5654(sprlem4))).cfr_renamed_5823(sprbig2.cfr_renamed_320()).cfr_renamed_5799(sprbig2.cfr_renamed_5768()).cfr_renamed_5800(sprbig2.cfr_renamed_5774()).cfr_renamed_5801(sprbig2.cfr_renamed_5769()).cfr_renamed_5802(sprbig2.cfr_renamed_1411());
                if (sprbig2.cfr_renamed_3() != 0) {
                    sprdlf2.cfr_renamed_5979(sprbig2.cfr_renamed_5797());
                }
                if (sprbig2.cfr_renamed_5978() != null) {
                    sprrsf sprrsf2 = (sprrsf)sprvof.cfr_renamed_5758(sprbig2.cfr_renamed_5978(), Object.class);
                    sprdlf2.cfr_renamed_5836(sprrsf2.cfr_renamed_5807(sprlem4));
                }
                return sprdlf2.cfr_renamed_1451();
            }
            catch (ClassNotFoundException classNotFoundException) {
                throw new IOException(new StringBuilder().insert(0, sprfke.cfr_renamed_9("\bV*I8t$N\rU>T/\u007f3Y.J?S$TkJ9U(_8I\"T,\u001a\t~\u0018\u001a8N*N.\u0000k")).append(classNotFoundException.getMessage()).toString());
            }
        }
        if (sprlem2.cfr_renamed_5078(sprbn.cfr_renamed_102)) {
            sprlkg sprlkg2 = sprlkg.cfr_renamed_23(arg0.cfr_renamed_1229());
            return new sprwxe(sprlkg2.cfr_renamed_1146(), sprlkg2.cfr_renamed_1150(), sprlkg2.cfr_renamed_845(), sprlkg2.cfr_renamed_1147(), sprlkg2.cfr_renamed_1155(), sprrlf.cfr_renamed_5816(sprlkg2.cfr_renamed_580().cfr_renamed_593()));
        }
        throw new RuntimeException(sprned.cfr_renamed_9(" w&t3r5s,;(\u007f$u5r'r$iar/;1i(m o$;*~8;/t5;3~\"t&u(h$\u007f"));
    }
}

