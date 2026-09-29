/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.spraoe;
import com.spire.presentation.packages.sprcae;
import com.spire.presentation.packages.sprilaa;
import com.spire.presentation.packages.sprnke;
import com.spire.presentation.packages.sprok;
import com.spire.presentation.packages.sprqry;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.sprxfe;
import com.spire.presentation.packages.sprzzd;
import java.util.Hashtable;

public class sprqce
extends sprxfe {
    public static final sprtzd cfr_renamed_131 = new sprtzd(sprilaa.cfr_renamed_9("I\\N\\O\\JG"));
    public static final sprtzd cfr_renamed_722;
    public static final sprtzd cfr_renamed_955;
    public static final sprtzd cfr_renamed_1228;
    public static final sprtzd cfr_renamed_1260;
    public static final sprtzd cfr_renamed_499;
    public static final sprtzd cfr_renamed_135;
    public static final sprtzd cfr_renamed_956;
    public static final sprtzd cfr_renamed_952;
    public static final sprtzd cfr_renamed_728;
    public static final sprtzd cfr_renamed_128;
    public static final sprtzd cfr_renamed_957;
    public static final sprtzd cfr_renamed_314;
    public static final sprtzd cfr_renamed_951;
    public static final sprtzd cfr_renamed_84;
    public static final sprtzd cfr_renamed_723;
    public static final sprtzd cfr_renamed_1226;
    public static final sprok cfr_renamed_287;
    public static final sprtzd cfr_renamed_724;
    public static final sprtzd cfr_renamed_953;
    public static final sprtzd cfr_renamed_133;
    public static final sprtzd cfr_renamed_185;
    public static final sprtzd spr\ufe34;
    public static final sprtzd cfr_renamed_82;
    public static final sprtzd cfr_renamed_126;
    private static final Hashtable cfr_renamed_88;
    public static final sprtzd cfr_renamed_31;
    public final Hashtable cfr_renamed_272;
    public static final sprtzd cfr_renamed_145;
    public static final sprtzd cfr_renamed_114;
    private static final Hashtable cfr_renamed_96;
    public static final sprtzd cfr_renamed_105;
    public static final sprtzd cfr_renamed_137;
    public static final sprtzd cfr_renamed_79;
    public static final sprtzd cfr_renamed_107;
    public static final sprtzd cfr_renamed_132;
    public final Hashtable cfr_renamed_102 = sprqce.cfr_renamed_4093(cfr_renamed_96);
    public static final sprtzd cfr_renamed_93;
    public static final sprtzd cfr_renamed_86;
    public static final sprtzd cfr_renamed_152;
    public static final sprtzd cfr_renamed_112;
    public static final sprtzd cfr_renamed_119;
    public static final sprtzd cfr_renamed_91;
    public static final sprtzd cfr_renamed_0;
    public static final sprtzd cfr_renamed_1;
    public static final sprtzd cfr_renamed_2;
    public static final sprtzd cfr_renamed_3;
    public static final sprtzd cfr_renamed_4;

    @Override
    public sprnke[] cfr_renamed_3246(String arg0) {
        int n;
        sprnke[] sprnkeArray = sprzzd.cfr_renamed_4545(arg0, this);
        sprnke[] sprnkeArray2 = new sprnke[sprnkeArray.length];
        int n2 = n = 0;
        while (n2 != sprnkeArray.length) {
            int n3 = sprnkeArray2.length - n - 1;
            sprnke sprnke2 = sprnkeArray[n];
            sprnkeArray2[n3] = sprnke2;
            n2 = ++n;
        }
        return sprnkeArray2;
    }

    @Override
    public sprtzd cfr_renamed_4531(String arg0) {
        return sprzzd.cfr_renamed_4546(arg0, this.cfr_renamed_272);
    }

    @Override
    public String[] cfr_renamed_2478(sprtzd arg0) {
        return sprzzd.cfr_renamed_4547(arg0, this.cfr_renamed_272);
    }

    @Override
    public String cfr_renamed_4530(spruhe arg0) {
        int n;
        StringBuffer stringBuffer = new StringBuffer();
        boolean bl = true;
        sprnke[] sprnkeArray = arg0.cfr_renamed_4544();
        int n2 = n = sprnkeArray.length - 1;
        while (n2 >= 0) {
            StringBuffer stringBuffer2;
            if (bl) {
                bl = false;
                stringBuffer2 = stringBuffer;
            } else {
                StringBuffer stringBuffer3 = stringBuffer;
                stringBuffer2 = stringBuffer3;
                stringBuffer3.append(',');
            }
            sprnke sprnke2 = sprnkeArray[n];
            sprzzd.cfr_renamed_4548(stringBuffer2, sprnke2, this.cfr_renamed_102);
            n2 = --n;
        }
        return stringBuffer.toString();
    }

    @Override
    public String cfr_renamed_2419(sprtzd arg0) {
        return (String)cfr_renamed_96.get(arg0);
    }

    public sprqce() {
        this.cfr_renamed_272 = sprqce.cfr_renamed_4093(cfr_renamed_88);
    }

    @Override
    public spra cfr_renamed_4549(sprtzd arg0, String arg1) {
        if (arg0.equals(cfr_renamed_953)) {
            return new sprcae(arg1);
        }
        if (arg0.equals(cfr_renamed_105) || arg0.equals(cfr_renamed_955) || arg0.equals(cfr_renamed_957) || arg0.equals(cfr_renamed_91)) {
            return new spraoe(arg1);
        }
        return super.cfr_renamed_4549(arg0, arg1);
    }

    static {
        cfr_renamed_105 = new sprtzd(sprqry.cfr_renamed_9(" \u000b'\u000b&\u000b$"));
        cfr_renamed_723 = new sprtzd(sprilaa.cfr_renamed_9("@UGUFUA"));
        cfr_renamed_953 = new sprtzd(sprqry.cfr_renamed_9("\u0015<\u001c<\u0017!\u0011 \u000b#\u001c \u0015\"\u0016\"\u0015<\u0014\"\u0015<\u0014<\u0017'"));
        cfr_renamed_132 = new sprtzd(sprilaa.cfr_renamed_9("I\\N\\O\\JA"));
        cfr_renamed_3 = new sprtzd(sprqry.cfr_renamed_9("\u0017<\u0010<\u0011<\u0017%"));
        cfr_renamed_145 = new sprtzd(sprilaa.cfr_renamed_9("I\\N\\O\\OK"));
        cfr_renamed_957 = new sprtzd(sprqry.cfr_renamed_9("\u0017<\u0010<\u0011<\u0011$"));
        cfr_renamed_126 = new sprtzd(sprilaa.cfr_renamed_9("I\\N\\O\\OE"));
        cfr_renamed_728 = new sprtzd(sprqry.cfr_renamed_9("\u0017<\u0010<\u0011<\u0017!"));
        cfr_renamed_112 = new sprtzd(sprilaa.cfr_renamed_9("I\\N\\O\\OF"));
        cfr_renamed_107 = new sprtzd(sprqry.cfr_renamed_9("\u0017<\u0010<\u0011<\u0011 "));
        cfr_renamed_152 = new sprtzd(sprilaa.cfr_renamed_9("I\\N\\O\\NC"));
        cfr_renamed_956 = new sprtzd(sprqry.cfr_renamed_9("\u0017<\u0010<\u0011<\u0011!"));
        cfr_renamed_2 = new sprtzd(sprilaa.cfr_renamed_9("I\\N\\O\\IG"));
        cfr_renamed_1 = new sprtzd(sprqry.cfr_renamed_9(" \u000b'\u000b&\u000b%"));
        cfr_renamed_86 = new sprtzd(sprilaa.cfr_renamed_9("I\\N\\O\\HC"));
        cfr_renamed_82 = new sprtzd(sprqry.cfr_renamed_9("\u0017<\u0010<\u0011<\u0011#"));
        cfr_renamed_133 = new sprtzd(sprilaa.cfr_renamed_9("I\\N\\O\\JB"));
        cfr_renamed_1226 = new sprtzd(sprqry.cfr_renamed_9("\u0017<\u0010<\u0011<\u0014#"));
        cfr_renamed_185 = new sprtzd(sprilaa.cfr_renamed_9("I\\N\\O\\H@"));
        cfr_renamed_119 = new sprtzd(sprqry.cfr_renamed_9("\u0017<\u0010<\u0011<\u0014+"));
        cfr_renamed_499 = new sprtzd(sprilaa.cfr_renamed_9("I\\N\\O\\JD"));
        cfr_renamed_722 = new sprtzd(sprqry.cfr_renamed_9("\u0017<\u0010<\u0011<\u0014%"));
        spr\ufe34 = new sprtzd(sprilaa.cfr_renamed_9("I\\N\\O\\JJ"));
        cfr_renamed_135 = new sprtzd(sprqry.cfr_renamed_9("\u0017<\u0010<\u0011<\u0017*"));
        cfr_renamed_114 = new sprtzd(sprilaa.cfr_renamed_9("I\\N\\O\\ID"));
        cfr_renamed_1228 = new sprtzd(sprqry.cfr_renamed_9("\u0017<\u0010<\u0011<\u0016!"));
        cfr_renamed_128 = new sprtzd(sprilaa.cfr_renamed_9("I\\N\\O\\JF"));
        cfr_renamed_93 = new sprtzd(sprqry.cfr_renamed_9("\u0017<\u0010<\u0011<\u0016&"));
        cfr_renamed_955 = new sprtzd(sprilaa.cfr_renamed_9("@UGUFUG"));
        cfr_renamed_1260 = new sprtzd(sprqry.cfr_renamed_9(" \u000b'\u000b&\u000b&"));
        cfr_renamed_4 = new sprtzd(sprilaa.cfr_renamed_9("@UGUFUJ"));
        cfr_renamed_952 = new sprtzd(sprqry.cfr_renamed_9(" \u000b'\u000b&\u000b+"));
        cfr_renamed_91 = new sprtzd(sprilaa.cfr_renamed_9("I\\N\\O\\IB"));
        cfr_renamed_137 = new sprtzd(sprqry.cfr_renamed_9("\u0017<\u0010<\u0011<\u0017 "));
        cfr_renamed_314 = new sprtzd(sprilaa.cfr_renamed_9("I\\N\\O\\IC"));
        cfr_renamed_0 = new sprtzd(sprqry.cfr_renamed_9("\u0017<\u0010<\u0011<\u0014 "));
        cfr_renamed_84 = new sprtzd(sprilaa.cfr_renamed_9("BUKU@HFI\\JKIBKAKBUCKBUCUC"));
        cfr_renamed_31 = new sprtzd(sprqry.cfr_renamed_9("\u0017<\u0010<\u0011<\u0010\""));
        cfr_renamed_951 = new sprtzd(sprilaa.cfr_renamed_9("I\\N\\O\\HG"));
        cfr_renamed_79 = new sprtzd(sprqry.cfr_renamed_9("\u0017<\u0010<\u0011<\u0017&"));
        cfr_renamed_724 = new sprtzd(sprilaa.cfr_renamed_9("I\\N\\O\\OG"));
        cfr_renamed_96 = new Hashtable();
        cfr_renamed_88 = new Hashtable();
        cfr_renamed_96.put(cfr_renamed_131, sprqry.cfr_renamed_9("GgV{KwVafsQwB}Wk"));
        cfr_renamed_96.put(cfr_renamed_105, "c");
        cfr_renamed_96.put(cfr_renamed_723, "cn");
        cfr_renamed_96.put(cfr_renamed_953, sprilaa.cfr_renamed_9("\u001f\u0011"));
        cfr_renamed_96.put(cfr_renamed_132, "description");
        cfr_renamed_96.put(cfr_renamed_3, sprqry.cfr_renamed_9("AwVfL|DfL}K[KvLqDfJ`"));
        cfr_renamed_96.put(cfr_renamed_145, sprilaa.cfr_renamed_9("\u0016\u0012\u0001\u000f\u001b\u0015\u0015\u000e\u001b\b\u001a\u001e\u00165\u0013\u0016\u0017"));
        cfr_renamed_96.put(cfr_renamed_957, sprqry.cfr_renamed_9("vKCPsI{C{@`"));
        cfr_renamed_96.put(cfr_renamed_126, sprilaa.cfr_renamed_9("\u0017\u0015\u001a\u001a\u001c\u0018\u0017\u001f!\u001e\u0013\t\u0011\u00135\u000e\u001b\u001f\u0017"));
        cfr_renamed_96.put(cfr_renamed_728, sprqry.cfr_renamed_9("CsFaL\u007fL~@F@~@bM}KwkgHp@`"));
        cfr_renamed_96.put(cfr_renamed_112, sprilaa.cfr_renamed_9("\u0015\u001e\u001c\u001e\u0000\u001a\u0006\u0012\u001d\u0015#\u000e\u0013\u0017\u001b\u001d\u001b\u001e\u0000"));
        cfr_renamed_96.put(cfr_renamed_107, sprqry.cfr_renamed_9("uLd@|ksHw"));
        cfr_renamed_96.put(cfr_renamed_152, sprilaa.cfr_renamed_9("\u001a\u0014\u0007\b\u00172\u0016\u001e\u001c\u000f\u001b\u001d\u001b\u001e\u0000"));
        cfr_renamed_96.put(cfr_renamed_956, "initials");
        cfr_renamed_96.put(cfr_renamed_2, sprqry.cfr_renamed_9("{Kf@`KsQ{J|D~lAa\\kgHp@`"));
        cfr_renamed_96.put(cfr_renamed_1, "l");
        cfr_renamed_96.put(cfr_renamed_86, "member");
        cfr_renamed_96.put(cfr_renamed_82, "name");
        cfr_renamed_96.put(cfr_renamed_133, "o");
        cfr_renamed_96.put(cfr_renamed_1226, sprilaa.cfr_renamed_9("\u0014\u0007"));
        cfr_renamed_96.put(cfr_renamed_185, sprqry.cfr_renamed_9("}R|@`"));
        cfr_renamed_96.put(cfr_renamed_119, sprilaa.cfr_renamed_9("\u000b\u001a\u0002\u0001\u0012\u0011\u001a\u001e?\u0017\u0017\u001b\r\u0017\t\u000b4\u0014\u001d\u001b\u0018\u00175\u0013\u0016\u0017"));
        cfr_renamed_96.put(cfr_renamed_499, sprqry.cfr_renamed_9("bJaQsISAvWwVa"));
        cfr_renamed_96.put(cfr_renamed_722, sprilaa.cfr_renamed_9("\u000b\u001d\b\u0006\u001a\u001e8\u001d\u001f\u0017"));
        cfr_renamed_96.put(spr\ufe34, sprqry.cfr_renamed_9("bJaQ]CtLq@PJj"));
        cfr_renamed_96.put(cfr_renamed_135, sprilaa.cfr_renamed_9("\u0002\t\u0017\u001d\u0017\t\u0000\u001e\u0016?\u0017\u0017\u001b\r\u0017\t\u000b6\u0017\u000f\u001a\u0014\u0016"));
        cfr_renamed_96.put(cfr_renamed_114, sprqry.cfr_renamed_9("`@uLaQwWwASAvWwVa"));
        cfr_renamed_96.put(cfr_renamed_1228, sprilaa.cfr_renamed_9("\t\u001d\u0017\u00174\u0011\u0018\u0007\u000b\u0013\u0015\u0006"));
        cfr_renamed_96.put(cfr_renamed_128, sprqry.cfr_renamed_9("a@sWqMUP{Aw"));
        cfr_renamed_96.put(cfr_renamed_93, sprilaa.cfr_renamed_9("\u0001\u001e\u0017:\u001e\b\u001d"));
        cfr_renamed_96.put(cfr_renamed_955, sprqry.cfr_renamed_9("VwW{D~kgHp@`"));
        cfr_renamed_96.put(cfr_renamed_1260, sprilaa.cfr_renamed_9("\b\u001c"));
        cfr_renamed_96.put(cfr_renamed_4, "st");
        cfr_renamed_96.put(cfr_renamed_952, sprqry.cfr_renamed_9("VfWw@f"));
        cfr_renamed_96.put(cfr_renamed_91, sprilaa.cfr_renamed_9("\u0006\u001e\u001e\u001e\u0002\u0013\u001d\u0015\u00175\u0007\u0016\u0010\u001e\u0000"));
        cfr_renamed_96.put(cfr_renamed_137, sprqry.cfr_renamed_9("f@~@f@jqwW\u007fL|D~lv@|Q{C{@`"));
        cfr_renamed_96.put(cfr_renamed_314, sprilaa.cfr_renamed_9("\u0006\u001e\u001e\u001e\n5\u0007\u0016\u0010\u001e\u0000"));
        cfr_renamed_96.put(cfr_renamed_0, "title");
        cfr_renamed_96.put(cfr_renamed_84, sprqry.cfr_renamed_9("gLv"));
        cfr_renamed_96.put(cfr_renamed_31, sprilaa.cfr_renamed_9("\u000e\u001c\u0012\u0003\u000e\u00176\u0017\u0016\u0010\u001e\u0000"));
        cfr_renamed_96.put(cfr_renamed_951, sprqry.cfr_renamed_9("Pa@`usVaR}Wv"));
        cfr_renamed_96.put(cfr_renamed_79, sprilaa.cfr_renamed_9("\nJ@J3\u001f\u0016\t\u0017\b\u0001"));
        cfr_renamed_96.put(cfr_renamed_724, sprqry.cfr_renamed_9("]'\u0015\"p|LcPwlv@|Q{C{@`"));
        cfr_renamed_88.put(sprilaa.cfr_renamed_9("\u0019\u0007\b\u001b\u0015\u0017\b\u0001\u0018\u0013\u000f\u0017\u001c\u001d\t\u000b"), cfr_renamed_131);
        cfr_renamed_88.put("c", cfr_renamed_105);
        cfr_renamed_88.put("cn", cfr_renamed_723);
        cfr_renamed_88.put(sprqry.cfr_renamed_9("Aq"), cfr_renamed_953);
        cfr_renamed_88.put("description", cfr_renamed_132);
        cfr_renamed_88.put(sprilaa.cfr_renamed_9("\u001f\u0017\b\u0006\u0012\u001c\u001a\u0006\u0012\u001d\u0015\u001b\u0015\u0016\u0012\u0011\u001a\u0006\u0014\u0000"), cfr_renamed_3);
        cfr_renamed_88.put(sprqry.cfr_renamed_9("vLaQ{KuP{Vz@vKsHw"), cfr_renamed_145);
        cfr_renamed_88.put(sprilaa.cfr_renamed_9("\u0016\u0015\u0003\u000e\u0013\u0017\u001b\u001d\u001b\u001e\u0000"), cfr_renamed_957);
        cfr_renamed_88.put(sprqry.cfr_renamed_9("wKzD|FwAa@sWqMuP{Aw"), cfr_renamed_126);
        cfr_renamed_88.put(sprilaa.cfr_renamed_9("\u001d\u0013\u0018\u0001\u0012\u001f\u0012\u001e\u001e\u0006\u001e\u001e\u001e\u0002\u0013\u001d\u0015\u0017\u0015\u0007\u0016\u0010\u001e\u0000"), cfr_renamed_728);
        cfr_renamed_88.put(sprqry.cfr_renamed_9("u@|@`DfL}KcPsI{C{@`"), cfr_renamed_112);
        cfr_renamed_88.put(sprilaa.cfr_renamed_9("\u0015\u0012\u0004\u001e\u001c\u0015\u0013\u0016\u0017"), cfr_renamed_107);
        cfr_renamed_88.put(sprqry.cfr_renamed_9("zJgVwLv@|Q{C{@`"), cfr_renamed_152);
        cfr_renamed_88.put("initials", cfr_renamed_956);
        cfr_renamed_88.put(sprilaa.cfr_renamed_9("\u001b\u0015\u0006\u001e\u0000\u0015\u0013\u000f\u001b\u0014\u001c\u001a\u001e\u0012\u0001\u001f\u001c\u0015\u0007\u0016\u0010\u001e\u0000"), cfr_renamed_2);
        cfr_renamed_88.put("l", cfr_renamed_1);
        cfr_renamed_88.put("member", cfr_renamed_86);
        cfr_renamed_88.put("name", cfr_renamed_82);
        cfr_renamed_88.put("o", cfr_renamed_133);
        cfr_renamed_88.put(sprqry.cfr_renamed_9("Jg"), cfr_renamed_1226);
        cfr_renamed_88.put(sprilaa.cfr_renamed_9("\u001d\f\u001c\u001e\u0000"), cfr_renamed_185);
        cfr_renamed_88.put(sprqry.cfr_renamed_9("Uz\\aLqD~AwI{SwWkJtC{FwKsHw"), cfr_renamed_119);
        cfr_renamed_88.put(sprilaa.cfr_renamed_9("\u0002\u0014\u0001\u000f\u0013\u0017\u0013\u001f\u0016\t\u0017\b\u0001"), cfr_renamed_499);
        cfr_renamed_88.put(sprqry.cfr_renamed_9("U}VfD~F}Aw"), cfr_renamed_722);
        cfr_renamed_88.put(sprilaa.cfr_renamed_9("\u0002\u0014\u0001\u000f\u001d\u001d\u0014\u0012\u0011\u001e\u0010\u0014\n"), spr\ufe34);
        cfr_renamed_88.put(sprqry.cfr_renamed_9("bWwCwW`@vAwI{SwWkHwQzJv"), cfr_renamed_135);
        cfr_renamed_88.put(sprilaa.cfr_renamed_9("\u0000\u001e\u0015\u0012\u0001\u000f\u0017\t\u0017\u001f\u0013\u001f\u0016\t\u0017\b\u0001"), cfr_renamed_114);
        cfr_renamed_88.put(sprqry.cfr_renamed_9("W}IwJqFgUsKf"), cfr_renamed_1228);
        cfr_renamed_88.put(sprilaa.cfr_renamed_9("\u0001\u001e\u0013\t\u0011\u0013\u0015\u000e\u001b\u001f\u0017"), cfr_renamed_128);
        cfr_renamed_88.put(sprqry.cfr_renamed_9("a@wD~V}"), cfr_renamed_93);
        cfr_renamed_88.put(sprilaa.cfr_renamed_9("\b\u0017\t\u001b\u001a\u001e\u0015\u0007\u0016\u0010\u001e\u0000"), cfr_renamed_955);
        cfr_renamed_88.put(sprqry.cfr_renamed_9("V|"), cfr_renamed_1260);
        cfr_renamed_88.put("st", cfr_renamed_4);
        cfr_renamed_88.put(sprilaa.cfr_renamed_9("\b\u0006\t\u0017\u001e\u0006"), cfr_renamed_952);
        cfr_renamed_88.put(sprqry.cfr_renamed_9("f@~@bM}KwKgHp@`"), cfr_renamed_91);
        cfr_renamed_88.put(sprilaa.cfr_renamed_9("\u0006\u001e\u001e\u001e\u0006\u001e\n\u000f\u0017\t\u001f\u0012\u001c\u001a\u001e\u0012\u0016\u001e\u001c\u000f\u001b\u001d\u001b\u001e\u0000"), cfr_renamed_137);
        cfr_renamed_88.put(sprqry.cfr_renamed_9("f@~@jKgHp@`"), cfr_renamed_314);
        cfr_renamed_88.put("title", cfr_renamed_0);
        cfr_renamed_88.put(sprilaa.cfr_renamed_9("\u0007\u0012\u0016"), cfr_renamed_84);
        cfr_renamed_88.put(sprqry.cfr_renamed_9("P|LcPwHwHp@`"), cfr_renamed_31);
        cfr_renamed_88.put(sprilaa.cfr_renamed_9("\u000e\u0001\u001e\u0000\u000b\u0013\b\u0001\f\u001d\t\u0016"), cfr_renamed_951);
        cfr_renamed_88.put(sprqry.cfr_renamed_9("j\u0014 \u0014sAvWwVa"), cfr_renamed_79);
        cfr_renamed_88.put(sprilaa.cfr_renamed_9("\u0003GKB\u000e\u001c\u0012\u0003\u000e\u0017\u0012\u0016\u001e\u001c\u000f\u001b\u001d\u001b\u001e\u0000"), cfr_renamed_724);
        cfr_renamed_287 = new sprqce();
    }
}

