/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdkm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprdt;
import com.spire.presentation.packages.sprffm;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprhl;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.spris;
import com.spire.presentation.packages.sprkim;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmis;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sprnnp;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprpxl;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprtul;
import com.spire.presentation.packages.sprug;
import com.spire.presentation.packages.sprve;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.sprws;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprypl;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class sprynl {
    private static final Map cfr_renamed_3;
    public static final sprynl cfr_renamed_4;

    public String cfr_renamed_3958(String arg0) {
        String string = (String)cfr_renamed_3.get(arg0);
        if (string != null) {
            return string;
        }
        return arg0;
    }

    public void cfr_renamed_10754(sprlem arg0, String arg1) {
        sprynl.cfr_renamed_3.put(arg0.cfr_renamed_19(), arg1);
    }

    public sprug cfr_renamed_10763(sprlem arg0, spridn arg1) {
        if (arg1 != null) {
            ArrayList<sprco> arrayList = new ArrayList<sprco>(arg1.cfr_renamed_84());
            Enumeration enumeration = arg1.cfr_renamed_329();
            while (enumeration.hasMoreElements()) {
                sprdkm sprdkm2;
                sprnvm sprnvm2;
                sprxgf sprxgf2 = ((sprco)enumeration.nextElement()).cfr_renamed_119();
                if (!(sprxgf2 instanceof sprnvm) || !(sprnvm2 = sprnvm.cfr_renamed_23(sprxgf2)).cfr_renamed_10764(1) || !arg0.cfr_renamed_5078((sprdkm2 = sprdkm.cfr_renamed_5085(sprnvm2, false)).cfr_renamed_4114())) continue;
                arrayList.add(sprdkm2.cfr_renamed_3365());
            }
            return new sprtul(arrayList);
        }
        return new sprtul(new ArrayList());
    }

    static {
        cfr_renamed_4 = new sprynl();
        cfr_renamed_3 = new HashMap();
        sprynl.cfr_renamed_3.put(sprwr.cfr_renamed_79.cfr_renamed_19(), "DSA");
        sprynl.cfr_renamed_3.put(sprwr.cfr_renamed_82.cfr_renamed_19(), "DSA");
        sprynl.cfr_renamed_3.put(sprwr.cfr_renamed_1260.cfr_renamed_19(), "DSA");
        sprynl.cfr_renamed_3.put(sprwr.cfr_renamed_1337.cfr_renamed_19(), "DSA");
        sprynl.cfr_renamed_3.put(sprwr.cfr_renamed_31.cfr_renamed_19(), "DSA");
        sprynl.cfr_renamed_3.put(sprwr.cfr_renamed_137.cfr_renamed_19(), "DSA");
        sprynl.cfr_renamed_3.put(sprwr.cfr_renamed_1217.cfr_renamed_19(), "DSA");
        sprynl.cfr_renamed_3.put(sprwr.cfr_renamed_1344.cfr_renamed_19(), "DSA");
        sprynl.cfr_renamed_3.put(sprgt.cfr_renamed_93.cfr_renamed_19(), "DSA");
        sprynl.cfr_renamed_3.put(sprgt.cfr_renamed_119.cfr_renamed_19(), "RSA");
        sprynl.cfr_renamed_3.put(sprgt.cfr_renamed_3.cfr_renamed_19(), "RSA");
        sprynl.cfr_renamed_3.put(sprgt.cfr_renamed_86.cfr_renamed_19(), "RSA");
        sprynl.cfr_renamed_3.put(sprgt.cfr_renamed_4.cfr_renamed_19(), "RSA");
        sprynl.cfr_renamed_3.put(sprdl.cfr_renamed_1762.cfr_renamed_19(), "RSA");
        sprynl.cfr_renamed_3.put(sprdl.cfr_renamed_957.cfr_renamed_19(), "RSA");
        sprynl.cfr_renamed_3.put(sprdl.cfr_renamed_614.cfr_renamed_19(), "RSA");
        sprynl.cfr_renamed_3.put(sprdl.cfr_renamed_3051.cfr_renamed_19(), "RSA");
        sprynl.cfr_renamed_3.put(sprdl.cfr_renamed_1262.cfr_renamed_19(), "RSA");
        sprynl.cfr_renamed_3.put(sprdl.cfr_renamed_1601.cfr_renamed_19(), "RSA");
        sprynl.cfr_renamed_3.put(sprdl.cfr_renamed_1572.cfr_renamed_19(), "RSA");
        sprynl.cfr_renamed_3.put(sprdl.cfr_renamed_84.cfr_renamed_19(), "RSA");
        sprynl.cfr_renamed_3.put(sprwr.cfr_renamed_0.cfr_renamed_19(), "RSA");
        sprynl.cfr_renamed_3.put(sprwr.cfr_renamed_1442.cfr_renamed_19(), "RSA");
        sprynl.cfr_renamed_3.put(sprwr.cfr_renamed_4.cfr_renamed_19(), "RSA");
        sprynl.cfr_renamed_3.put(sprwr.cfr_renamed_41.cfr_renamed_19(), "RSA");
        sprynl.cfr_renamed_3.put(sprbr.cfr_renamed_955.cfr_renamed_19(), sprmis.cfr_renamed_9("\u0019+\u0018;\u001d"));
        sprynl.cfr_renamed_3.put(sprbr.cfr_renamed_129.cfr_renamed_19(), sprnnp.cfr_renamed_9("\r\u001d\f\r\t"));
        sprynl.cfr_renamed_3.put(sprbr.cfr_renamed_79.cfr_renamed_19(), sprmis.cfr_renamed_9("\u0019+\u0018;\u001d"));
        sprynl.cfr_renamed_3.put(sprbr.cfr_renamed_107.cfr_renamed_19(), sprnnp.cfr_renamed_9("\r\u001d\f\r\t"));
        sprynl.cfr_renamed_3.put(sprbr.cfr_renamed_724.cfr_renamed_19(), sprmis.cfr_renamed_9("\u0019+\u0018;\u001d"));
        sprynl.cfr_renamed_3.put(sprwr.cfr_renamed_952.cfr_renamed_19(), sprnnp.cfr_renamed_9("\r\u001d\f\r\t"));
        sprynl.cfr_renamed_3.put(sprwr.cfr_renamed_114.cfr_renamed_19(), sprmis.cfr_renamed_9("\u0019+\u0018;\u001d"));
        sprynl.cfr_renamed_3.put(sprwr.cfr_renamed_1222.cfr_renamed_19(), sprnnp.cfr_renamed_9("\r\u001d\f\r\t"));
        sprynl.cfr_renamed_3.put(sprwr.cfr_renamed_102.cfr_renamed_19(), sprmis.cfr_renamed_9("\u0019+\u0018;\u001d"));
        sprynl.cfr_renamed_3.put(sprbr.cfr_renamed_615.cfr_renamed_19(), "DSA");
        sprynl.cfr_renamed_3.put(sprws.cfr_renamed_152.cfr_renamed_19(), sprnnp.cfr_renamed_9("\r\u001d\f\r\t"));
        sprynl.cfr_renamed_3.put(sprws.cfr_renamed_4.cfr_renamed_19(), sprmis.cfr_renamed_9("\u0019+\u0018;\u001d"));
        sprynl.cfr_renamed_3.put(sprws.cfr_renamed_105.cfr_renamed_19(), sprnnp.cfr_renamed_9("\r\u001d\f\r\t"));
        sprynl.cfr_renamed_3.put(sprws.cfr_renamed_2.cfr_renamed_19(), sprmis.cfr_renamed_9("\u0019+\u0018;\u001d"));
        sprynl.cfr_renamed_3.put(sprws.cfr_renamed_0.cfr_renamed_19(), sprnnp.cfr_renamed_9("\r\u001d\f\r\t"));
        sprynl.cfr_renamed_3.put(sprws.cfr_renamed_31.cfr_renamed_19(), "RSA");
        sprynl.cfr_renamed_3.put(sprws.cfr_renamed_93.cfr_renamed_19(), "RSA");
        sprynl.cfr_renamed_3.put(sprws.cfr_renamed_119.cfr_renamed_19(), sprmis.cfr_renamed_9(":\u000f)=\u00068%\u001b.m"));
        sprynl.cfr_renamed_3.put(sprws.cfr_renamed_132.cfr_renamed_19(), sprnnp.cfr_renamed_9("\f\u001b\u001f)0,\u0013\u000f\u0018y"));
        sprynl.cfr_renamed_3.put(sprbr.cfr_renamed_84.cfr_renamed_19(), "DSA");
        sprynl.cfr_renamed_3.put(sprdl.cfr_renamed_1205.cfr_renamed_19(), "RSA");
        sprynl.cfr_renamed_3.put(spris.cfr_renamed_3.cfr_renamed_19(), "RSA");
        sprynl.cfr_renamed_3.put(sprhl.cfr_renamed_2415.cfr_renamed_19(), "RSA");
        sprynl.cfr_renamed_3.put(sprdl.cfr_renamed_3250.cfr_renamed_19(), sprmis.cfr_renamed_9(":\u000f)=\u00068%\u001b.m"));
        sprynl.cfr_renamed_3.put(sprqo.spr\ufe34.cfr_renamed_19(), sprnnp.cfr_renamed_9("\u0019\u0007\r\u001cm|ox"));
        sprynl.cfr_renamed_3.put(sprqo.cfr_renamed_93.cfr_renamed_19(), "ECGOST3410");
        sprynl.cfr_renamed_3.put(new sprlem(sprmis.cfr_renamed_9("Yr[r^rYr\\rYr]d\\eFmFjFn")).cfr_renamed_19(), "ECGOST3410");
        sprynl.cfr_renamed_3.put(new sprlem(sprnnp.cfr_renamed_9("ofmfhfofjfofkpjqpypyp}")).cfr_renamed_19(), sprmis.cfr_renamed_9("/\u0013;\b[hYl"));
        sprynl.cfr_renamed_3.put(sprdt.cfr_renamed_96.cfr_renamed_19(), sprnnp.cfr_renamed_9("\r\u001d\u000f\u0011\u001b\n{jynelxozszk~"));
        sprynl.cfr_renamed_3.put(sprdt.cfr_renamed_91.cfr_renamed_19(), sprmis.cfr_renamed_9("\u0019+\u001b'\u000f<o\\mXqZlYnEiYn"));
        sprynl.cfr_renamed_3.put(sprqo.cfr_renamed_96.cfr_renamed_19(), "ECGOST3410");
        sprynl.cfr_renamed_3.put(sprqo.cfr_renamed_107.cfr_renamed_19(), sprnnp.cfr_renamed_9("\u0019\u0007\r\u001cm|ox"));
        sprynl.cfr_renamed_3.put(sprdt.cfr_renamed_1.cfr_renamed_19(), sprmis.cfr_renamed_9("\u0019+\u001b'\u000f<o\\mXqZlYnEn]j"));
        sprynl.cfr_renamed_3.put(sprdt.cfr_renamed_107.cfr_renamed_19(), sprnnp.cfr_renamed_9("\r\u001d\u000f\u0011\u001b\n{jynelxozs}oz"));
    }

    public sprug cfr_renamed_10675(spridn arg0) {
        if (arg0 != null) {
            ArrayList<sprtpl> arrayList = new ArrayList<sprtpl>(arg0.cfr_renamed_84());
            Enumeration enumeration = arg0.cfr_renamed_329();
            while (enumeration.hasMoreElements()) {
                sprxgf sprxgf2 = ((sprco)enumeration.nextElement()).cfr_renamed_119();
                if (!(sprxgf2 instanceof sprszm)) continue;
                arrayList.add(new sprtpl(sprndm.cfr_renamed_23(sprxgf2)));
            }
            return new sprtul(arrayList);
        }
        return new sprtul(new ArrayList());
    }

    public sprddm cfr_renamed_10756(sprddm arg0, sprve arg1) {
        sprco sprco2 = arg0.cfr_renamed_284();
        if (sprco2 == null || sprpen.cfr_renamed_4.cfr_renamed_7476(sprco2)) {
            return arg1.cfr_renamed_5307(arg0.cfr_renamed_593());
        }
        return arg0;
    }

    public sprug cfr_renamed_10674(spridn arg0) {
        if (arg0 != null) {
            ArrayList<sprpxl> arrayList = new ArrayList<sprpxl>(arg0.cfr_renamed_84());
            Enumeration enumeration = arg0.cfr_renamed_329();
            while (enumeration.hasMoreElements()) {
                sprxgf sprxgf2 = ((sprco)enumeration.nextElement()).cfr_renamed_119();
                if (!(sprxgf2 instanceof sprszm)) continue;
                arrayList.add(new sprpxl(sprffm.cfr_renamed_23(sprxgf2)));
            }
            return new sprtul(arrayList);
        }
        return new sprtul(new ArrayList());
    }

    public sprug cfr_renamed_10765(spridn arg0) {
        if (arg0 != null) {
            ArrayList<sprypl> arrayList = new ArrayList<sprypl>(arg0.cfr_renamed_84());
            Enumeration enumeration = arg0.cfr_renamed_329();
            while (enumeration.hasMoreElements()) {
                sprnvm sprnvm2;
                sprxgf sprxgf2 = ((sprco)enumeration.nextElement()).cfr_renamed_119();
                if (!(sprxgf2 instanceof sprnvm) || (sprnvm2 = (sprnvm)sprxgf2).cfr_renamed_312() != 1 && sprnvm2.cfr_renamed_312() != 2) continue;
                arrayList.add(new sprypl(sprkim.cfr_renamed_23(sprnvm2.cfr_renamed_10766(false, 16))));
            }
            return new sprtul(arrayList);
        }
        return new sprtul(new ArrayList());
    }
}

