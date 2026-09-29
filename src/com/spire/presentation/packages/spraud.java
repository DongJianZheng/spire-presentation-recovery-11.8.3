/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprdg;
import com.spire.presentation.packages.sprdh;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.spreud;
import com.spire.presentation.packages.sprhue;
import com.spire.presentation.packages.sprhur;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprji;
import com.spire.presentation.packages.sprltd;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmg;
import com.spire.presentation.packages.sprnfe;
import com.spire.presentation.packages.spro;
import com.spire.presentation.packages.sproje;
import com.spire.presentation.packages.sproqd;
import com.spire.presentation.packages.sprpnn;
import com.spire.presentation.packages.sprs;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.sprtxd;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryk;
import com.spire.presentation.packages.spryte;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class spraud {
    private static final Map cfr_renamed_1;
    private static final Map cfr_renamed_2;
    public static final spraud cfr_renamed_3;
    private static final Map cfr_renamed_4;

    public spro cfr_renamed_4118(sprtzd arg0, sprere arg1) {
        if (arg1 != null) {
            ArrayList<spra> arrayList = new ArrayList<spra>(arg1.cfr_renamed_84());
            Enumeration enumeration = arg1.cfr_renamed_329();
            while (enumeration.hasMoreElements()) {
                sprhue sprhue2;
                spryte spryte2;
                sprvva sprvva2 = ((spra)enumeration.nextElement()).cfr_renamed_119();
                if (!(sprvva2 instanceof spryte) || (spryte2 = spryte.cfr_renamed_23(sprvva2)).cfr_renamed_312() != 1 || !arg0.equals((sprhue2 = sprhue.cfr_renamed_341(spryte2, false)).cfr_renamed_4114())) continue;
                arrayList.add(sprhue2.cfr_renamed_3365());
            }
            return new sprltd(arrayList);
        }
        return new sprltd(new ArrayList());
    }

    public void cfr_renamed_4098(sprtzd arg0, String arg1) {
        cfr_renamed_1.put(arg0.cfr_renamed_19(), arg1);
    }

    public String cfr_renamed_3958(String arg0) {
        String string = (String)cfr_renamed_4.get(arg0);
        if (string != null) {
            return string;
        }
        return arg0;
    }

    public void cfr_renamed_4097(sprtzd arg0, String arg1) {
        cfr_renamed_4.put(arg0.cfr_renamed_19(), arg1);
    }

    private static /* synthetic */ void cfr_renamed_4096(sprtzd arg0, String arg1, String arg2) {
        cfr_renamed_1.put(arg0.cfr_renamed_19(), arg1);
        cfr_renamed_4.put(arg0.cfr_renamed_19(), arg2);
    }

    static {
        cfr_renamed_3 = new spraud();
        cfr_renamed_4 = new HashMap();
        cfr_renamed_1 = new HashMap();
        cfr_renamed_2 = new HashMap();
        spraud.cfr_renamed_4096(sprdg.cfr_renamed_4, sprpnn.cfr_renamed_9("V]D'7!"), "DSA");
        spraud.cfr_renamed_4096(sprdg.cfr_renamed_1, "SHA256", "DSA");
        spraud.cfr_renamed_4096(sprdg.cfr_renamed_133, "SHA384", "DSA");
        spraud.cfr_renamed_4096(sprdg.cfr_renamed_31, "SHA512", "DSA");
        spraud.cfr_renamed_4096(sprdh.cfr_renamed_1, "SHA1", "DSA");
        spraud.cfr_renamed_4096(sprdh.cfr_renamed_4, sprhur.cfr_renamed_9("A\u00148"), "RSA");
        spraud.cfr_renamed_4096(sprdh.cfr_renamed_3, sprpnn.cfr_renamed_9("XA!"), "RSA");
        spraud.cfr_renamed_4096(sprdh.cfr_renamed_152, "MD5", "RSA");
        spraud.cfr_renamed_4096(sprdh.cfr_renamed_112, "SHA1", "RSA");
        spraud.cfr_renamed_4096(sprm.cfr_renamed_125, sprhur.cfr_renamed_9("A\u0014>"), "RSA");
        spraud.cfr_renamed_4096(sprm.cfr_renamed_88, sprpnn.cfr_renamed_9("XA!"), "RSA");
        spraud.cfr_renamed_4096(sprm.cfr_renamed_126, "MD5", "RSA");
        spraud.cfr_renamed_4096(sprm.cfr_renamed_127, "SHA1", "RSA");
        spraud.cfr_renamed_4096(sprm.cfr_renamed_128, sprhur.cfr_renamed_9("\u0003D\u0011>b8"), "RSA");
        spraud.cfr_renamed_4096(sprm.cfr_renamed_129, "SHA256", "RSA");
        spraud.cfr_renamed_4096(sprm.cfr_renamed_130, "SHA384", "RSA");
        spraud.cfr_renamed_4096(sprm.cfr_renamed_107, "SHA512", "RSA");
        spraud.cfr_renamed_4096(sprtk.cfr_renamed_4, "SHA1", sprpnn.cfr_renamed_9("PFQVT"));
        spraud.cfr_renamed_4096(sprtk.cfr_renamed_134, sprhur.cfr_renamed_9("\u0003D\u0011>b8"), sprpnn.cfr_renamed_9("PFQVT"));
        spraud.cfr_renamed_4096(sprtk.cfr_renamed_91, "SHA256", sprhur.cfr_renamed_9("I\u0013H\u0003M"));
        spraud.cfr_renamed_4096(sprtk.cfr_renamed_135, "SHA384", sprpnn.cfr_renamed_9("PFQVT"));
        spraud.cfr_renamed_4096(sprtk.cfr_renamed_136, "SHA512", sprhur.cfr_renamed_9("I\u0013H\u0003M"));
        spraud.cfr_renamed_4096(sprtk.cfr_renamed_132, "SHA1", "DSA");
        spraud.cfr_renamed_4096(sprmg.cfr_renamed_88, "SHA1", sprpnn.cfr_renamed_9("PFQVT"));
        spraud.cfr_renamed_4096(sprmg.cfr_renamed_272, sprhur.cfr_renamed_9("\u0003D\u0011>b8"), sprpnn.cfr_renamed_9("PFQVT"));
        spraud.cfr_renamed_4096(sprmg.cfr_renamed_1, "SHA256", sprhur.cfr_renamed_9("I\u0013H\u0003M"));
        spraud.cfr_renamed_4096(sprmg.cfr_renamed_93, "SHA384", sprpnn.cfr_renamed_9("PFQVT"));
        spraud.cfr_renamed_4096(sprmg.cfr_renamed_114, "SHA512", sprhur.cfr_renamed_9("I\u0013H\u0003M"));
        spraud.cfr_renamed_4096(sprmg.cfr_renamed_91, "SHA1", "RSA");
        spraud.cfr_renamed_4096(sprmg.cfr_renamed_112, "SHA256", "RSA");
        spraud.cfr_renamed_4096(sprmg.cfr_renamed_2, "SHA1", sprpnn.cfr_renamed_9("WFDtkqHRC$"));
        spraud.cfr_renamed_4096(sprmg.cfr_renamed_4, "SHA256", sprhur.cfr_renamed_9("\u0002_\u0011m>h\u001dK\u0016="));
        cfr_renamed_4.put(sprtk.cfr_renamed_314.cfr_renamed_19(), "DSA");
        cfr_renamed_4.put(sprm.cfr_renamed_1510.cfr_renamed_19(), "RSA");
        cfr_renamed_4.put(spryk.cfr_renamed_107, "RSA");
        cfr_renamed_4.put(sprs.cfr_renamed_2478.cfr_renamed_19(), "RSA");
        cfr_renamed_4.put(sprtxd.cfr_renamed_145, sprpnn.cfr_renamed_9("WFDtkqHRC$"));
        cfr_renamed_4.put(sprji.cfr_renamed_102.cfr_renamed_19(), sprhur.cfr_renamed_9("\u0017C\u0003Xc8a<"));
        cfr_renamed_4.put(sprji.cfr_renamed_4.cfr_renamed_19(), "ECGOST3410");
        cfr_renamed_4.put(sprpnn.cfr_renamed_9("4;6;3;4;1;4;0-1,+$+#+'"), "ECGOST3410");
        cfr_renamed_4.put(sprhur.cfr_renamed_9("a\"c\"f\"a\"d\"a\"e4d5~=~=~9"), sprpnn.cfr_renamed_9("BZVA6!4%"));
        cfr_renamed_4.put(sprji.cfr_renamed_137.cfr_renamed_19(), "ECGOST3410");
        cfr_renamed_4.put(sprji.cfr_renamed_88.cfr_renamed_19(), sprhur.cfr_renamed_9("\u0017C\u0003Xc8a<"));
        cfr_renamed_1.put(sprm.cfr_renamed_1575.cfr_renamed_19(), sprpnn.cfr_renamed_9("XA'"));
        cfr_renamed_1.put(sprm.cfr_renamed_1479.cfr_renamed_19(), sprhur.cfr_renamed_9("A\u00148"));
        cfr_renamed_1.put(sprm.cfr_renamed_102.cfr_renamed_19(), "MD5");
        cfr_renamed_1.put(sprdh.cfr_renamed_86.cfr_renamed_19(), "SHA1");
        cfr_renamed_1.put(sprdg.spr\ufe34.cfr_renamed_19(), sprpnn.cfr_renamed_9("V]D'7!"));
        cfr_renamed_1.put(sprdg.cfr_renamed_119.cfr_renamed_19(), "SHA256");
        cfr_renamed_1.put(sprdg.cfr_renamed_112.cfr_renamed_19(), "SHA384");
        cfr_renamed_1.put(sprdg.cfr_renamed_107.cfr_renamed_19(), "SHA512");
        cfr_renamed_1.put(spryk.cfr_renamed_126.cfr_renamed_19(), sprhur.cfr_renamed_9("^\u0019\\\u0015A\u0014=b4"));
        cfr_renamed_1.put(spryk.cfr_renamed_91.cfr_renamed_19(), "RIPEMD160");
        cfr_renamed_1.put(spryk.cfr_renamed_3.cfr_renamed_19(), sprpnn.cfr_renamed_9("GLE@XA'0#"));
        cfr_renamed_1.put(sprji.cfr_renamed_31.cfr_renamed_19(), sprhur.cfr_renamed_9("\u0017C\u0003Xc8a="));
        cfr_renamed_1.put(sprpnn.cfr_renamed_9("4;6;3;4;1;4;0-1,+$+'+$"), sprhur.cfr_renamed_9("\u0017C\u0003Xc8a="));
        String[] stringArray = new String[1];
        stringArray[0] = "SHA-1";
        cfr_renamed_2.put("SHA1", stringArray);
        String[] stringArray2 = new String[1];
        stringArray2[0] = "SHA-224";
        cfr_renamed_2.put(sprpnn.cfr_renamed_9("V]D'7!"), stringArray2);
        String[] stringArray3 = new String[1];
        stringArray3[0] = "SHA-256";
        cfr_renamed_2.put("SHA256", stringArray3);
        String[] stringArray4 = new String[1];
        stringArray4[0] = "SHA-384";
        cfr_renamed_2.put("SHA384", stringArray4);
        String[] stringArray5 = new String[1];
        stringArray5[0] = "SHA-512";
        cfr_renamed_2.put("SHA512", stringArray5);
    }

    public spro cfr_renamed_4119(sprere arg0) {
        if (arg0 != null) {
            ArrayList<sprcyd> arrayList = new ArrayList<sprcyd>(arg0.cfr_renamed_84());
            Enumeration enumeration = arg0.cfr_renamed_329();
            while (enumeration.hasMoreElements()) {
                sprvva sprvva2 = ((spra)enumeration.nextElement()).cfr_renamed_119();
                if (!(sprvva2 instanceof sprbne)) continue;
                arrayList.add(new sprcyd(sprcge.cfr_renamed_23(sprvva2)));
            }
            return new sprltd(arrayList);
        }
        return new sprltd(new ArrayList());
    }

    public spro cfr_renamed_4120(sprere arg0) {
        if (arg0 != null) {
            ArrayList<sproqd> arrayList = new ArrayList<sproqd>(arg0.cfr_renamed_84());
            Enumeration enumeration = arg0.cfr_renamed_329();
            while (enumeration.hasMoreElements()) {
                sprvva sprvva2 = ((spra)enumeration.nextElement()).cfr_renamed_119();
                if (!(sprvva2 instanceof spryte)) continue;
                arrayList.add(new sproqd(sprnfe.cfr_renamed_23(((spryte)sprvva2).cfr_renamed_2456())));
            }
            return new sprltd(arrayList);
        }
        return new sprltd(new ArrayList());
    }

    public spro cfr_renamed_4121(sprere arg0) {
        if (arg0 != null) {
            ArrayList<spreud> arrayList = new ArrayList<spreud>(arg0.cfr_renamed_84());
            Enumeration enumeration = arg0.cfr_renamed_329();
            while (enumeration.hasMoreElements()) {
                sprvva sprvva2 = ((spra)enumeration.nextElement()).cfr_renamed_119();
                if (!(sprvva2 instanceof sprbne)) continue;
                arrayList.add(new spreud(sproje.cfr_renamed_23(sprvva2)));
            }
            return new sprltd(arrayList);
        }
        return new sprltd(new ArrayList());
    }

    public sprije cfr_renamed_4122(sprije arg0) {
        if (arg0.cfr_renamed_284() == null) {
            return new sprije(arg0.cfr_renamed_593(), sprume.cfr_renamed_3);
        }
        return arg0;
    }
}

