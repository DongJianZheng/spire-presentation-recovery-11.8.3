/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprahe;
import com.spire.presentation.packages.sprcld;
import com.spire.presentation.packages.sprdh;
import com.spire.presentation.packages.spreed;
import com.spire.presentation.packages.sprfpd;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprimd;
import com.spire.presentation.packages.sprisc;
import com.spire.presentation.packages.sprknp;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlbe;
import com.spire.presentation.packages.sprlnd;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmbe;
import com.spire.presentation.packages.sprmfe;
import com.spire.presentation.packages.sprmjd;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sproie;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpgd;
import com.spire.presentation.packages.sprqid;
import com.spire.presentation.packages.sprrkd;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruxd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwkd;
import com.spire.presentation.packages.sprzde;
import com.spire.presentation.packages.sprzmd;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;

public class sprwrc {
    public static sprhgb cfr_renamed_2620(sprmke arg0) throws IOException {
        sprije sprije2 = arg0.cfr_renamed_1254();
        if (sprije2.cfr_renamed_593().equals(sprm.cfr_renamed_1510)) {
            sprlbe sprlbe2 = sprlbe.cfr_renamed_23(arg0.cfr_renamed_1229());
            return new sprisc(sprlbe2.cfr_renamed_2295(), sprlbe2.cfr_renamed_2296(), sprlbe2.cfr_renamed_2299(), sprlbe2.cfr_renamed_2300(), sprlbe2.cfr_renamed_2301(), sprlbe2.cfr_renamed_2302(), sprlbe2.cfr_renamed_2303(), sprlbe2.cfr_renamed_2304());
        }
        if (sprije2.cfr_renamed_593().equals(sprm.cfr_renamed_41)) {
            sprmbe sprmbe2 = sprmbe.cfr_renamed_23(sprije2.cfr_renamed_284());
            sprooe sprooe2 = (sprooe)arg0.cfr_renamed_1229();
            BigInteger bigInteger = sprmbe2.cfr_renamed_2331();
            int n = bigInteger == null ? 0 : bigInteger.intValue();
            sprzmd sprzmd2 = new sprzmd(sprmbe2.cfr_renamed_1155(), sprmbe2.cfr_renamed_1145(), null, n);
            return new sprrkd(sprooe2.cfr_renamed_97(), sprzmd2);
        }
        if (sprije2.cfr_renamed_593().equals(sprdh.cfr_renamed_91)) {
            sprmfe sprmfe2 = sprmfe.cfr_renamed_23(sprije2.cfr_renamed_284());
            sprooe sprooe3 = (sprooe)arg0.cfr_renamed_1229();
            return new sprimd(sprooe3.cfr_renamed_97(), new sprpgd(sprmfe2.cfr_renamed_1155(), sprmfe2.cfr_renamed_1145()));
        }
        if (sprije2.cfr_renamed_593().equals(sprtk.cfr_renamed_314)) {
            sprooe sprooe4 = (sprooe)arg0.cfr_renamed_1229();
            spra spra2 = sprije2.cfr_renamed_284();
            sprcld sprcld2 = null;
            if (spra2 != null) {
                sprzde sprzde2 = sprzde.cfr_renamed_23(spra2.cfr_renamed_119());
                sprcld2 = new sprcld(sprzde2.cfr_renamed_1155(), sprzde2.cfr_renamed_1604(), sprzde2.cfr_renamed_1145());
            }
            return new sprlnd(sprooe4.cfr_renamed_97(), sprcld2);
        }
        if (sprije2.cfr_renamed_593().equals(sprtk.cfr_renamed_137)) {
            sprmke sprmke2;
            sprqid sprqid2;
            sprkra sprkra2;
            spruxd spruxd2 = new spruxd((sprvva)sprije2.cfr_renamed_284());
            if (spruxd2.cfr_renamed_2317()) {
                sprkra2 = (sprtzd)spruxd2.cfr_renamed_284();
                sprfpd sprfpd2 = sprwkd.cfr_renamed_2102(sprkra2);
                if (sprfpd2 == null) {
                    sprfpd2 = sprahe.cfr_renamed_2102(sprkra2);
                }
                sprqid2 = new sprmjd((sprtzd)sprkra2, sprfpd2.cfr_renamed_1769(), sprfpd2.cfr_renamed_1145(), sprfpd2.cfr_renamed_1146(), sprfpd2.cfr_renamed_1153(), sprfpd2.cfr_renamed_2113());
                sprmke2 = arg0;
            } else {
                sprfpd sprfpd3 = sprfpd.cfr_renamed_23(spruxd2.cfr_renamed_284());
                sprqid2 = new sprqid(sprfpd3.cfr_renamed_1769(), sprfpd3.cfr_renamed_1145(), sprfpd3.cfr_renamed_1146(), sprfpd3.cfr_renamed_1153(), sprfpd3.cfr_renamed_2113());
                sprmke2 = arg0;
            }
            sprkra2 = sproie.cfr_renamed_23(sprmke2.cfr_renamed_1229());
            BigInteger bigInteger = ((sproie)sprkra2).cfr_renamed_1521();
            return new spreed(bigInteger, sprqid2);
        }
        throw new RuntimeException(sprknp.cfr_renamed_9("ExC{V}P|I4MpAzP}B}Af\u0004}J4Oq]4J{P4VqG{CzMgAp"));
    }

    public static sprhgb cfr_renamed_2614(InputStream arg0) throws IOException {
        return sprwrc.cfr_renamed_2620(sprmke.cfr_renamed_23(new sprgle(arg0).cfr_renamed_24()));
    }

    public static sprhgb cfr_renamed_2615(byte[] arg0) throws IOException {
        return sprwrc.cfr_renamed_2620(sprmke.cfr_renamed_23(sprvva.cfr_renamed_184(arg0)));
    }
}

