/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprahe;
import com.spire.presentation.packages.sprcld;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprdh;
import com.spire.presentation.packages.sprfae;
import com.spire.presentation.packages.sprfpd;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprhud;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmbe;
import com.spire.presentation.packages.sprmfe;
import com.spire.presentation.packages.sprmgd;
import com.spire.presentation.packages.sprmjd;
import com.spire.presentation.packages.sprmtc;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpgd;
import com.spire.presentation.packages.sprqid;
import com.spire.presentation.packages.sprqnd;
import com.spire.presentation.packages.sprs;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruke;
import com.spire.presentation.packages.spruld;
import com.spire.presentation.packages.spruxd;
import com.spire.presentation.packages.sprvge;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwbe;
import com.spire.presentation.packages.sprwkd;
import com.spire.presentation.packages.sprwmd;
import com.spire.presentation.packages.sprxpe;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.sprzde;
import com.spire.presentation.packages.sprzkd;
import com.spire.presentation.packages.sprzmd;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;

public class sprhcd {
    public static sprhgb cfr_renamed_2614(InputStream arg0) throws IOException {
        return sprhcd.cfr_renamed_1531(sprdce.cfr_renamed_23(new sprgle(arg0).cfr_renamed_24()));
    }

    public static sprhgb cfr_renamed_2615(byte[] arg0) throws IOException {
        return sprhcd.cfr_renamed_1531(sprdce.cfr_renamed_23(sprvva.cfr_renamed_184(arg0)));
    }

    public static sprhgb cfr_renamed_1531(sprdce arg0) throws IOException {
        sprije sprije2 = arg0.cfr_renamed_593();
        if (sprije2.cfr_renamed_593().equals(sprm.cfr_renamed_1510) || sprije2.cfr_renamed_593().equals(sprs.cfr_renamed_2478)) {
            sprfae sprfae2 = sprfae.cfr_renamed_23(arg0.cfr_renamed_1227());
            return new sprmtc(false, sprfae2.cfr_renamed_2295(), sprfae2.cfr_renamed_2296());
        }
        if (sprije2.cfr_renamed_593().equals(sprtk.cfr_renamed_88)) {
            spruke spruke2 = spruke.cfr_renamed_23(arg0.cfr_renamed_1227());
            BigInteger bigInteger = spruke2.spr\u3181().cfr_renamed_97();
            sprwbe sprwbe2 = sprwbe.cfr_renamed_23(sprije2.cfr_renamed_284());
            BigInteger bigInteger2 = sprwbe2.cfr_renamed_1155().cfr_renamed_97();
            BigInteger bigInteger3 = sprwbe2.cfr_renamed_1145().cfr_renamed_97();
            BigInteger bigInteger4 = sprwbe2.cfr_renamed_1604().cfr_renamed_97();
            BigInteger bigInteger5 = null;
            if (sprwbe2.cfr_renamed_2616() != null) {
                bigInteger5 = sprwbe2.cfr_renamed_2616().cfr_renamed_97();
            }
            sprqnd sprqnd2 = null;
            sprvge sprvge2 = sprwbe2.cfr_renamed_2617();
            if (sprvge2 != null) {
                sprvge sprvge3 = sprvge2;
                byte[] byArray = sprvge3.cfr_renamed_2113().cfr_renamed_81();
                BigInteger bigInteger6 = sprvge3.cfr_renamed_2618().cfr_renamed_97();
                sprqnd2 = new sprqnd(byArray, bigInteger6.intValue());
            }
            return new sprmgd(bigInteger, new sprzmd(bigInteger2, bigInteger3, bigInteger4, bigInteger5, sprqnd2));
        }
        if (sprije2.cfr_renamed_593().equals(sprm.cfr_renamed_41)) {
            sprmbe sprmbe2 = sprmbe.cfr_renamed_23(sprije2.cfr_renamed_284());
            sprooe sprooe2 = (sprooe)arg0.cfr_renamed_1227();
            BigInteger bigInteger = sprmbe2.cfr_renamed_2331();
            int n = bigInteger == null ? 0 : bigInteger.intValue();
            sprzmd sprzmd2 = new sprzmd(sprmbe2.cfr_renamed_1155(), sprmbe2.cfr_renamed_1145(), null, n);
            return new sprmgd(sprooe2.cfr_renamed_97(), sprzmd2);
        }
        if (sprije2.cfr_renamed_593().equals(sprdh.cfr_renamed_91)) {
            sprmfe sprmfe2 = sprmfe.cfr_renamed_23(sprije2.cfr_renamed_284());
            sprooe sprooe3 = (sprooe)arg0.cfr_renamed_1227();
            return new sprzkd(sprooe3.cfr_renamed_97(), new sprpgd(sprmfe2.cfr_renamed_1155(), sprmfe2.cfr_renamed_1145()));
        }
        if (sprije2.cfr_renamed_593().equals(sprtk.cfr_renamed_314) || sprije2.cfr_renamed_593().equals(sprdh.cfr_renamed_1)) {
            sprooe sprooe4 = (sprooe)arg0.cfr_renamed_1227();
            spra spra2 = sprije2.cfr_renamed_284();
            sprcld sprcld2 = null;
            if (spra2 != null) {
                sprzde sprzde2 = sprzde.cfr_renamed_23(spra2.cfr_renamed_119());
                sprcld2 = new sprcld(sprzde2.cfr_renamed_1155(), sprzde2.cfr_renamed_1604(), sprzde2.cfr_renamed_1145());
            }
            return new spruld(sprooe4.cfr_renamed_97(), sprcld2);
        }
        if (sprije2.cfr_renamed_593().equals(sprtk.cfr_renamed_137)) {
            sprqid sprqid2;
            sprfpd sprfpd2;
            sprvva sprvva2;
            spruxd spruxd2 = spruxd.cfr_renamed_23(sprije2.cfr_renamed_284());
            if (spruxd2.cfr_renamed_2317()) {
                sprvva2 = (sprtzd)spruxd2.cfr_renamed_284();
                sprfpd2 = sprwkd.cfr_renamed_2102(sprvva2);
                if (sprfpd2 == null) {
                    sprfpd2 = sprahe.cfr_renamed_2102(sprvva2);
                }
                sprqid2 = new sprmjd((sprtzd)sprvva2, sprfpd2.cfr_renamed_1769(), sprfpd2.cfr_renamed_1145(), sprfpd2.cfr_renamed_1146(), sprfpd2.cfr_renamed_1153(), sprfpd2.cfr_renamed_2113());
            } else {
                sprfpd2 = sprfpd.cfr_renamed_23(spruxd2.cfr_renamed_284());
                sprqid2 = new sprqid(sprfpd2.cfr_renamed_1769(), sprfpd2.cfr_renamed_1145(), sprfpd2.cfr_renamed_1146(), sprfpd2.cfr_renamed_1153(), sprfpd2.cfr_renamed_2113());
            }
            sprvva2 = new sprlqe(arg0.cfr_renamed_2314().cfr_renamed_81());
            sprhud sprhud2 = new sprhud(sprfpd2.cfr_renamed_1769(), (sprxue)sprvva2);
            return new sprwmd(sprhud2.cfr_renamed_2322(), sprqid2);
        }
        throw new RuntimeException(sprxpe.cfr_renamed_9("\u007fgydlbjcs+wo{ejbxb{y>bp+ung+pdj+ln}dyewx{o"));
    }
}

