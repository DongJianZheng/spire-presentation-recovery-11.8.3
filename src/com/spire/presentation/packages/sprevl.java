/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprdt;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprgz;
import com.spire.presentation.packages.sprhl;
import com.spire.presentation.packages.sprhv;
import com.spire.presentation.packages.spris;
import com.spire.presentation.packages.sprjv;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprow;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprrq;
import com.spire.presentation.packages.sprtny;
import com.spire.presentation.packages.sprtu;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.sprws;
import com.spire.presentation.packages.sprwv;
import com.spire.presentation.packages.sprxvh;
import java.util.HashMap;
import java.util.Map;

public class sprevl
implements sprwv {
    private final Map cfr_renamed_2;
    private final Map cfr_renamed_3;
    private final Map cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_10751(sprlem arg0, String arg1, String arg2) {
        this.cfr_renamed_2.put(arg0, arg1);
        this.cfr_renamed_3.put(arg0, arg2);
    }

    private /* synthetic */ String cfr_renamed_10752(sprlem arg0) {
        String string = (String)this.cfr_renamed_3.get(arg0);
        if (string != null) {
            return string;
        }
        return arg0.cfr_renamed_19();
    }

    private /* synthetic */ String cfr_renamed_9058(sprlem arg0) {
        String string = (String)this.cfr_renamed_2.get(arg0);
        if (string != null) {
            return string;
        }
        return arg0.cfr_renamed_19();
    }

    public void cfr_renamed_10753(sprlem arg0, String arg1) {
        this.cfr_renamed_2.put(arg0, arg1);
    }

    public sprevl() {
        sprevl sprevl2 = this;
        sprevl sprevl3 = this;
        sprevl2.cfr_renamed_3 = new HashMap();
        sprevl3.cfr_renamed_2 = new HashMap();
        sprevl2.cfr_renamed_4 = new HashMap();
        sprevl2.cfr_renamed_10751(sprwr.cfr_renamed_79, sprxvh.cfr_renamed_9("C[Q!\"'"), "DSA");
        sprevl2.cfr_renamed_10751(sprwr.cfr_renamed_82, "SHA256", "DSA");
        sprevl2.cfr_renamed_10751(sprwr.cfr_renamed_1260, "SHA384", "DSA");
        sprevl2.cfr_renamed_10751(sprwr.cfr_renamed_1337, "SHA512", "DSA");
        sprevl2.cfr_renamed_10751(sprwr.cfr_renamed_31, sprtny.cfr_renamed_9("V^D%($7\""), "DSA");
        sprevl2.cfr_renamed_10751(sprwr.cfr_renamed_137, "SHA3-256", "DSA");
        sprevl2.cfr_renamed_10751(sprwr.cfr_renamed_1217, sprxvh.cfr_renamed_9("C[Q = ('"), "DSA");
        sprevl2.cfr_renamed_10751(sprwr.cfr_renamed_1344, sprtny.cfr_renamed_9("V^D%(#4$"), "DSA");
        sprevl2.cfr_renamed_10751(sprwr.cfr_renamed_0, sprxvh.cfr_renamed_9("C[Q =!\"'"), "RSA");
        sprevl2.cfr_renamed_10751(sprwr.cfr_renamed_1442, "SHA3-256", "RSA");
        sprevl2.cfr_renamed_10751(sprwr.cfr_renamed_4, sprtny.cfr_renamed_9("V^D%(%=\""), "RSA");
        sprevl2.cfr_renamed_10751(sprwr.cfr_renamed_41, sprxvh.cfr_renamed_9("C[Q =&!!"), "RSA");
        sprevl2.cfr_renamed_10751(sprwr.cfr_renamed_952, sprtny.cfr_renamed_9("V^D%($7\""), sprxvh.cfr_renamed_9("VSWCR"));
        sprevl2.cfr_renamed_10751(sprwr.cfr_renamed_114, "SHA3-256", sprtny.cfr_renamed_9("SFRVW"));
        sprevl2.cfr_renamed_10751(sprwr.cfr_renamed_1222, sprxvh.cfr_renamed_9("C[Q = ('"), sprtny.cfr_renamed_9("SFRVW"));
        sprevl2.cfr_renamed_10751(sprwr.cfr_renamed_102, sprxvh.cfr_renamed_9("C[Q =&!!"), sprtny.cfr_renamed_9("SFRVW"));
        sprevl2.cfr_renamed_10751(sprgt.cfr_renamed_93, "SHA1", "DSA");
        sprevl2.cfr_renamed_10751(sprgt.cfr_renamed_119, sprxvh.cfr_renamed_9("^T'"), "RSA");
        sprevl2.cfr_renamed_10751(sprgt.cfr_renamed_3, sprtny.cfr_renamed_9("[A\""), "RSA");
        sprevl2.cfr_renamed_10751(sprgt.cfr_renamed_86, "MD5", "RSA");
        sprevl2.cfr_renamed_10751(sprgt.cfr_renamed_4, "SHA1", "RSA");
        sprevl2.cfr_renamed_10751(sprdl.cfr_renamed_1762, sprxvh.cfr_renamed_9("^T!"), "RSA");
        sprevl2.cfr_renamed_10751(sprdl.cfr_renamed_957, sprtny.cfr_renamed_9("[A\""), "RSA");
        sprevl2.cfr_renamed_10751(sprdl.cfr_renamed_614, "MD5", "RSA");
        sprevl2.cfr_renamed_10751(sprdl.cfr_renamed_3051, "SHA1", "RSA");
        sprevl2.cfr_renamed_10751(sprdl.cfr_renamed_1262, sprxvh.cfr_renamed_9("C[Q!\"'"), "RSA");
        sprevl2.cfr_renamed_10751(sprdl.cfr_renamed_1601, "SHA256", "RSA");
        sprevl2.cfr_renamed_10751(sprdl.cfr_renamed_1572, "SHA384", "RSA");
        sprevl2.cfr_renamed_10751(sprdl.cfr_renamed_84, "SHA512", "RSA");
        sprevl2.cfr_renamed_10751(sprdl.cfr_renamed_615, sprtny.cfr_renamed_9("EMW0'7>7$1?"), "RSA");
        sprevl2.cfr_renamed_10751(sprdl.spr\ufe34, sprxvh.cfr_renamed_9("@XR%\"\";\"&&:"), "RSA");
        sprevl2.cfr_renamed_10751(sprwr.cfr_renamed_0, sprtny.cfr_renamed_9("V^D%($7\""), "RSA");
        sprevl2.cfr_renamed_10751(sprwr.cfr_renamed_1442, "SHA3-256", "RSA");
        sprevl2.cfr_renamed_10751(sprwr.cfr_renamed_4, sprxvh.cfr_renamed_9("C[Q = ('"), "RSA");
        sprevl2.cfr_renamed_10751(sprwr.cfr_renamed_41, sprtny.cfr_renamed_9("V^D%(#4$"), "RSA");
        sprevl2.cfr_renamed_10751(sprgz.cfr_renamed_102, "SHAKE128", sprxvh.cfr_renamed_9("B@QCC@"));
        sprevl2.cfr_renamed_10751(sprgz.cfr_renamed_79, "SHAKE256", sprtny.cfr_renamed_9("WEDFVE"));
        sprevl2.cfr_renamed_10751(spris.cfr_renamed_86, sprxvh.cfr_renamed_9("AYCU^T\"\"+"), "RSA");
        sprevl2.cfr_renamed_10751(spris.cfr_renamed_133, "RIPEMD160", "RSA");
        sprevl2.cfr_renamed_10751(spris.cfr_renamed_112, sprtny.cfr_renamed_9("DLF@[A$0 "), "RSA");
        sprevl2.cfr_renamed_10751(sprbr.cfr_renamed_955, "SHA1", sprxvh.cfr_renamed_9("VSWCR"));
        sprevl2.cfr_renamed_10751(sprbr.cfr_renamed_129, sprtny.cfr_renamed_9("V^D$7\""), sprxvh.cfr_renamed_9("VSWCR"));
        sprevl2.cfr_renamed_10751(sprbr.cfr_renamed_79, "SHA256", sprtny.cfr_renamed_9("SFRVW"));
        sprevl2.cfr_renamed_10751(sprbr.cfr_renamed_107, "SHA384", sprxvh.cfr_renamed_9("VSWCR"));
        sprevl2.cfr_renamed_10751(sprbr.cfr_renamed_724, "SHA512", sprtny.cfr_renamed_9("SFRVW"));
        sprevl2.cfr_renamed_10751(sprgz.cfr_renamed_4, "SHAKE128", sprxvh.cfr_renamed_9("VSWCR"));
        sprevl2.cfr_renamed_10751(sprgz.cfr_renamed_119, "SHAKE256", sprtny.cfr_renamed_9("SFRVW"));
        sprevl2.cfr_renamed_10751(sprbr.cfr_renamed_615, "SHA1", "DSA");
        sprevl2.cfr_renamed_10751(sprws.cfr_renamed_152, "SHA1", sprxvh.cfr_renamed_9("VSWCR"));
        sprevl2.cfr_renamed_10751(sprws.cfr_renamed_4, sprtny.cfr_renamed_9("V^D$7\""), sprxvh.cfr_renamed_9("VSWCR"));
        sprevl2.cfr_renamed_10751(sprws.cfr_renamed_105, "SHA256", sprtny.cfr_renamed_9("SFRVW"));
        sprevl2.cfr_renamed_10751(sprws.cfr_renamed_2, "SHA384", sprxvh.cfr_renamed_9("VSWCR"));
        sprevl2.cfr_renamed_10751(sprws.cfr_renamed_0, "SHA512", sprtny.cfr_renamed_9("SFRVW"));
        sprevl2.cfr_renamed_10751(sprws.cfr_renamed_31, "SHA1", "RSA");
        sprevl2.cfr_renamed_10751(sprws.cfr_renamed_93, "SHA256", "RSA");
        sprevl2.cfr_renamed_10751(sprws.cfr_renamed_119, "SHA1", sprxvh.cfr_renamed_9("B@Qr~w]TV\""));
        sprevl2.cfr_renamed_10751(sprws.cfr_renamed_132, "SHA256", sprtny.cfr_renamed_9("WEDwkrHQC'"));
        sprevl2.cfr_renamed_10751(sprhv.cfr_renamed_107, "SHA1", sprxvh.cfr_renamed_9("C\\RY]=VSWCR"));
        sprevl2.cfr_renamed_10751(sprhv.cfr_renamed_0, sprtny.cfr_renamed_9("V^D$7\""), sprxvh.cfr_renamed_9("C\\RY]=VSWCR"));
        sprevl2.cfr_renamed_10751(sprhv.cfr_renamed_3, "SHA256", sprtny.cfr_renamed_9("FIWLX(SFRVW"));
        sprevl2.cfr_renamed_10751(sprhv.cfr_renamed_145, "SHA384", sprxvh.cfr_renamed_9("C\\RY]=VSWCR"));
        sprevl2.cfr_renamed_10751(sprhv.cfr_renamed_1, "SHA512", sprtny.cfr_renamed_9("FIWLX(SFRVW"));
        sprevl2.cfr_renamed_10751(sprhv.cfr_renamed_2, "RIPEMD160", sprxvh.cfr_renamed_9("C\\RY]=VSWCR"));
        sprevl2.cfr_renamed_10751(sprhv.cfr_renamed_4, sprtny.cfr_renamed_9("V^D%($7\""), sprxvh.cfr_renamed_9("C\\RY]=VSWCR"));
        sprevl2.cfr_renamed_10751(sprhv.cfr_renamed_185, "SHA3-256", sprtny.cfr_renamed_9("FIWLX(SFRVW"));
        sprevl2.cfr_renamed_10751(sprhv.cfr_renamed_112, sprxvh.cfr_renamed_9("C[Q = ('"), sprtny.cfr_renamed_9("FIWLX(SFRVW"));
        sprevl2.cfr_renamed_10751(sprhv.cfr_renamed_31, sprxvh.cfr_renamed_9("C[Q =&!!"), sprtny.cfr_renamed_9("FIWLX(SFRVW"));
        sprevl2.cfr_renamed_10751(sprrq.cfr_renamed_107, "SHA256", sprxvh.cfr_renamed_9("@]!"));
        sprevl2.cfr_renamed_10751(sprrq.cfr_renamed_1472, sprtny.cfr_renamed_9("EH%"), sprxvh.cfr_renamed_9("@]!"));
        sprevl2.cfr_renamed_10751(sprjv.cfr_renamed_1510, "SHA512", sprtny.cfr_renamed_9("VFM_KUV$0 "));
        sprevl2.cfr_renamed_10751(sprjv.cfr_renamed_1513, sprxvh.cfr_renamed_9("C[Q =&!!"), sprtny.cfr_renamed_9("VFM_KUV$0 "));
        sprevl2.cfr_renamed_10751(sprjv.cfr_renamed_2635, "SHAKE256", sprxvh.cfr_renamed_9("@zs}yp"));
        sprevl2.cfr_renamed_10751(sprjv.cfr_renamed_1540, "SHA512", sprtny.cfr_renamed_9("U\u007ffxlu"));
        sprevl2.cfr_renamed_10751(sprjv.cfr_renamed_2420, sprxvh.cfr_renamed_9("C[Q =&!!"), sprtny.cfr_renamed_9("U\u007ffxlu"));
        sprevl2.cfr_renamed_3.put(sprbr.cfr_renamed_84, "DSA");
        this.cfr_renamed_3.put(sprdl.cfr_renamed_1205, "RSA");
        this.cfr_renamed_3.put(spris.cfr_renamed_3, "RSA");
        this.cfr_renamed_3.put(sprhl.cfr_renamed_2415, "RSA");
        this.cfr_renamed_3.put(sprdl.cfr_renamed_3250, sprxvh.cfr_renamed_9("B@Qr~w]TV\""));
        this.cfr_renamed_3.put(sprqo.spr\ufe34, sprtny.cfr_renamed_9("BYVB6\"4&"));
        this.cfr_renamed_3.put(sprqo.cfr_renamed_93, "ECGOST3410");
        this.cfr_renamed_3.put(new sprlem(sprxvh.cfr_renamed_9("!=#=&=!=$=!=%+$*>\">%>!")), "ECGOST3410");
        this.cfr_renamed_3.put(new sprlem(sprtny.cfr_renamed_9("4868384818480.1/+'+'+#")), sprxvh.cfr_renamed_9("W\\CG#'!#"));
        this.cfr_renamed_3.put(sprdt.cfr_renamed_96, sprtny.cfr_renamed_9("SFQJEQ%1'5;7&4$($0 "));
        this.cfr_renamed_3.put(sprdt.cfr_renamed_91, sprxvh.cfr_renamed_9("VST_@D $\" >\"#!!=&!!"));
        this.cfr_renamed_3.put(sprqo.cfr_renamed_96, "ECGOST3410");
        this.cfr_renamed_3.put(sprqo.cfr_renamed_107, sprtny.cfr_renamed_9("BYVB6\"4&"));
        this.cfr_renamed_3.put(sprdt.cfr_renamed_1, sprxvh.cfr_renamed_9("VST_@D $\" >\"#!!=!%%"));
        this.cfr_renamed_3.put(sprdt.cfr_renamed_107, sprtny.cfr_renamed_9("SFQJEQ%1'5;7&4$(#4$"));
        this.cfr_renamed_2.put(sprdl.cfr_renamed_956, sprxvh.cfr_renamed_9("^T!"));
        this.cfr_renamed_2.put(sprdl.cfr_renamed_2094, sprtny.cfr_renamed_9("[A\""));
        this.cfr_renamed_2.put(sprdl.cfr_renamed_1540, "MD5");
        this.cfr_renamed_2.put(sprgt.cfr_renamed_0, "SHA1");
        this.cfr_renamed_2.put(sprwr.cfr_renamed_957, sprxvh.cfr_renamed_9("C[Q!\"'"));
        this.cfr_renamed_2.put(sprwr.cfr_renamed_1226, "SHA256");
        this.cfr_renamed_2.put(sprwr.cfr_renamed_112, "SHA384");
        this.cfr_renamed_2.put(sprwr.cfr_renamed_272, "SHA512");
        this.cfr_renamed_2.put(sprwr.cfr_renamed_96, sprtny.cfr_renamed_9("EMW0'7>7$1?"));
        this.cfr_renamed_2.put(sprwr.cfr_renamed_499, sprxvh.cfr_renamed_9("@XR%\"\";\"&&:"));
        this.cfr_renamed_2.put(sprwr.cfr_renamed_1, "SHAKE128");
        this.cfr_renamed_2.put(sprwr.spr\ufe34, "SHAKE256");
        this.cfr_renamed_2.put(sprwr.cfr_renamed_93, sprtny.cfr_renamed_9("V^D%($7\""));
        this.cfr_renamed_2.put(sprwr.cfr_renamed_129, "SHA3-256");
        this.cfr_renamed_2.put(sprwr.cfr_renamed_131, sprxvh.cfr_renamed_9("C[Q = ('"));
        this.cfr_renamed_2.put(sprwr.cfr_renamed_128, sprtny.cfr_renamed_9("V^D%(#4$"));
        this.cfr_renamed_2.put(spris.cfr_renamed_91, sprxvh.cfr_renamed_9("AYCU^T\"\"+"));
        this.cfr_renamed_2.put(spris.cfr_renamed_272, "RIPEMD160");
        this.cfr_renamed_2.put(spris.cfr_renamed_102, sprtny.cfr_renamed_9("DLF@[A$0 "));
        this.cfr_renamed_2.put(sprqo.cfr_renamed_112, sprxvh.cfr_renamed_9("W\\CG#'!\""));
        this.cfr_renamed_2.put(new sprlem(sprtny.cfr_renamed_9("4868384818480.1/+'+$+'")), sprxvh.cfr_renamed_9("W\\CG#'!\""));
        this.cfr_renamed_2.put(sprdt.cfr_renamed_4, sprtny.cfr_renamed_9("QJEQ%1'4;7&4$($0 "));
        this.cfr_renamed_2.put(sprdt.cfr_renamed_3, sprxvh.cfr_renamed_9("T_@D $\"!>\"#!!=&!!"));
        this.cfr_renamed_2.put(sprrq.cfr_renamed_1344, sprtny.cfr_renamed_9("EH%"));
        this.cfr_renamed_4.put(sprtu.cfr_renamed_0, "Ed25519");
        this.cfr_renamed_4.put(sprtu.cfr_renamed_2, "Ed448");
        this.cfr_renamed_4.put(sprdl.cfr_renamed_3, sprxvh.cfr_renamed_9("_]@"));
        this.cfr_renamed_4.put(sprow.cfr_renamed_272, sprtny.cfr_renamed_9("UJ[UYV_QS"));
        this.cfr_renamed_4.put(sprjv.cfr_renamed_3034, sprxvh.cfr_renamed_9("Vr|p\u007f}=&!!"));
        this.cfr_renamed_4.put(sprjv.cfr_renamed_723, sprtny.cfr_renamed_9("Pdzfyk;4&7\""));
        this.cfr_renamed_4.put(sprjv.cfr_renamed_3240, sprxvh.cfr_renamed_9("Tz|zd{yf}!"));
        this.cfr_renamed_4.put(sprjv.cfr_renamed_3237, sprtny.cfr_renamed_9("A\u007fi\u007fq~lch%"));
        this.cfr_renamed_4.put(sprjv.cfr_renamed_499, sprxvh.cfr_renamed_9("Tz|zd{yf}&"));
        this.cfr_renamed_4.put(sprjv.cfr_renamed_615, sprtny.cfr_renamed_9("U\u007ffxlu"));
    }

    @Override
    public String cfr_renamed_10639(sprddm arg0, sprddm arg1) {
        sprlem sprlem2 = arg1.cfr_renamed_593();
        String string = (String)this.cfr_renamed_4.get(sprlem2);
        if (string != null) {
            return string;
        }
        if (sprlem2.cfr_renamed_5966(sprjv.cfr_renamed_1575)) {
            return sprxvh.cfr_renamed_9("@@[Y]S@@\u007fe`");
        }
        String string2 = this.cfr_renamed_9058(sprlem2);
        if (!string2.equals(sprlem2.cfr_renamed_19())) {
            return new StringBuilder().insert(0, string2).append(sprtny.cfr_renamed_9("r\u007fq~")).append(this.cfr_renamed_10752(sprlem2)).toString();
        }
        return new StringBuilder().insert(0, this.cfr_renamed_9058(arg0.cfr_renamed_593())).append(sprxvh.cfr_renamed_9("gzd{")).append(this.cfr_renamed_10752(sprlem2)).toString();
    }

    public void cfr_renamed_10754(sprlem arg0, String arg1) {
        this.cfr_renamed_3.put(arg0, arg1);
    }
}

