/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbyfa;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprhl;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprldn;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlim;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprnrm;
import com.spire.presentation.packages.sprraz;
import com.spire.presentation.packages.sprtdm;
import com.spire.presentation.packages.spruu;
import com.spire.presentation.packages.sprxjm;
import java.util.Hashtable;

public class sprebm
extends sprlim {
    public static final sprlem cfr_renamed_499;
    public final Hashtable cfr_renamed_135 = sprebm.cfr_renamed_4093(cfr_renamed_3);
    public static final spruu cfr_renamed_956;
    public static final sprlem cfr_renamed_952;
    public static final sprlem cfr_renamed_728;
    public static final sprlem cfr_renamed_128;
    public static final sprlem cfr_renamed_957;
    public static final sprlem cfr_renamed_314;
    public static final sprlem cfr_renamed_951;
    public static final sprlem cfr_renamed_84;
    public static final sprlem cfr_renamed_723;
    public static final sprlem cfr_renamed_1226;
    public static final sprlem cfr_renamed_287;
    public static final sprlem cfr_renamed_724;
    public static final sprlem cfr_renamed_953;
    public static final sprlem cfr_renamed_133;
    public static final sprlem cfr_renamed_185;
    public static final sprlem spr\ufe34;
    public static final sprlem cfr_renamed_82;
    public static final sprlem cfr_renamed_126;
    public static final sprlem cfr_renamed_88;
    public static final sprlem cfr_renamed_31;
    public static final sprlem cfr_renamed_272;
    public static final sprlem cfr_renamed_145;
    public static final sprlem cfr_renamed_114;
    public static final sprlem cfr_renamed_96;
    public static final sprlem cfr_renamed_105;
    public static final sprlem cfr_renamed_137;
    public static final sprlem cfr_renamed_79;
    public static final sprlem cfr_renamed_107;
    public static final sprlem cfr_renamed_132;
    private static final Hashtable cfr_renamed_102;
    public static final sprlem cfr_renamed_93;
    public static final sprlem cfr_renamed_86;
    public static final sprlem cfr_renamed_152;
    public static final sprlem cfr_renamed_112;
    public static final sprlem cfr_renamed_119;
    public final Hashtable cfr_renamed_91 = sprebm.cfr_renamed_4093(cfr_renamed_102);
    public static final sprlem cfr_renamed_0;
    public static final sprlem cfr_renamed_1;
    public static final sprlem cfr_renamed_2;
    private static final Hashtable cfr_renamed_3;
    public static final sprlem cfr_renamed_4;

    @Override
    public sprlem cfr_renamed_4531(String arg0) {
        return sprtdm.cfr_renamed_4546(arg0, this.cfr_renamed_91);
    }

    @Override
    public String cfr_renamed_11159(sprlem arg0) {
        return (String)this.cfr_renamed_135.get(arg0);
    }

    @Override
    public sprco cfr_renamed_11173(sprlem arg0, String arg1) {
        if (arg0.cfr_renamed_5078(cfr_renamed_951) || arg0.cfr_renamed_5078(cfr_renamed_287)) {
            return new sprnrm(arg1);
        }
        if (arg0.cfr_renamed_5078(cfr_renamed_0)) {
            return new sprjfn(arg1);
        }
        if (arg0.cfr_renamed_5078(cfr_renamed_957) || arg0.cfr_renamed_5078(cfr_renamed_152) || arg0.cfr_renamed_5078(cfr_renamed_499) || arg0.cfr_renamed_5078(cfr_renamed_105)) {
            return new sprldn(arg1);
        }
        return super.cfr_renamed_11173(arg0, arg1);
    }

    static {
        cfr_renamed_957 = new sprlem(sprraz.cfr_renamed_9("\u0010A\u0017A\u0016A\u0014")).cfr_renamed_9910();
        cfr_renamed_728 = new sprlem(sprbyfa.cfr_renamed_9("\u007f|x|y||b")).cfr_renamed_9910();
        cfr_renamed_112 = new sprlem(sprraz.cfr_renamed_9("]\fZ\f[\f^\u0013")).cfr_renamed_9910();
        cfr_renamed_96 = new sprlem(sprbyfa.cfr_renamed_9("\u007f|x|y||`")).cfr_renamed_9910();
        cfr_renamed_82 = new sprlem(sprraz.cfr_renamed_9("\u0010A\u0017A\u0016A\u0011")).cfr_renamed_9910();
        cfr_renamed_952 = new sprlem(sprbyfa.cfr_renamed_9("`cgcfcg")).cfr_renamed_9910();
        cfr_renamed_1 = new sprlem(sprraz.cfr_renamed_9("\u0010A\u0017A\u0016A\u001b")).cfr_renamed_9910();
        cfr_renamed_152 = new sprlem(sprbyfa.cfr_renamed_9("`cgcfcg")).cfr_renamed_9910();
        cfr_renamed_79 = new sprlem(sprraz.cfr_renamed_9("\u0010A\u0017A\u0016A\u0015")).cfr_renamed_9910();
        cfr_renamed_953 = new sprlem(sprbyfa.cfr_renamed_9("`cgcfcj")).cfr_renamed_9910();
        cfr_renamed_185 = new sprlem(sprraz.cfr_renamed_9("\u0010A\u0017A\u0016A\u0016")).cfr_renamed_9910();
        cfr_renamed_86 = new sprlem(sprbyfa.cfr_renamed_9("\u007f|x|y|y`")).cfr_renamed_9910();
        cfr_renamed_723 = new sprlem(sprraz.cfr_renamed_9("]\fZ\f[\f[\u0011")).cfr_renamed_9910();
        cfr_renamed_93 = new sprlem(sprbyfa.cfr_renamed_9("\u007f|x|y|yf")).cfr_renamed_9910();
        cfr_renamed_31 = new sprlem(sprraz.cfr_renamed_9("]\fZ\f[\f[\u0017")).cfr_renamed_9910();
        cfr_renamed_126 = new sprlem(sprbyfa.cfr_renamed_9("\u007f|x|y||a")).cfr_renamed_9910();
        cfr_renamed_314 = new sprlem(sprraz.cfr_renamed_9("]\fZ\f[\f^\u0017")).cfr_renamed_9910();
        cfr_renamed_4 = new sprlem(sprbyfa.cfr_renamed_9("\u007f|x|y||e")).cfr_renamed_9910();
        cfr_renamed_499 = new sprlem(sprraz.cfr_renamed_9("]\fZ\f[\f[\u0014")).cfr_renamed_9910();
        cfr_renamed_272 = new sprlem(sprbyfa.cfr_renamed_9("\u007f|x|y|{g")).cfr_renamed_9910();
        cfr_renamed_128 = new sprlem(sprraz.cfr_renamed_9("]\fZ\f[\fX\u0010")).cfr_renamed_9910();
        cfr_renamed_0 = new sprlem(sprbyfa.cfr_renamed_9("ccacdcccgcgceckcc")).cfr_renamed_9910();
        cfr_renamed_88 = new sprlem(sprraz.cfr_renamed_9("\u0013A\u0011A\u0014A\u0013A\u0017A\u0017A\u0015A\u001bA\u0010")).cfr_renamed_9910();
        cfr_renamed_84 = new sprlem(sprbyfa.cfr_renamed_9("ccacdcccgcgceckca")).cfr_renamed_9910();
        cfr_renamed_724 = new sprlem(sprraz.cfr_renamed_9("\u0013A\u0011A\u0014A\u0013A\u0017A\u0017A\u0015A\u001bA\u0016")).cfr_renamed_9910();
        cfr_renamed_107 = new sprlem(sprbyfa.cfr_renamed_9("ccacdcccgcgceckcg")).cfr_renamed_9910();
        cfr_renamed_145 = new sprlem(sprraz.cfr_renamed_9("\u0013A\u0011A\u0011Y\fW\f\\\f^\u0016")).cfr_renamed_9910();
        spr\ufe34 = new sprlem(sprbyfa.cfr_renamed_9("\u007f|x|y||d")).cfr_renamed_9910();
        cfr_renamed_2 = new sprlem(sprraz.cfr_renamed_9("]\fZ\f[\fZ\u0016")).cfr_renamed_9910();
        cfr_renamed_105 = sprhl.cfr_renamed_2941;
        cfr_renamed_114 = sprhl.cfr_renamed_3238;
        cfr_renamed_133 = sprhl.cfr_renamed_3236;
        cfr_renamed_951 = sprdl.cfr_renamed_3243;
        cfr_renamed_137 = sprdl.cfr_renamed_3032;
        cfr_renamed_1226 = sprdl.cfr_renamed_1604;
        cfr_renamed_119 = cfr_renamed_951;
        cfr_renamed_287 = new sprlem(sprbyfa.cfr_renamed_9("}|t|\u007fay`cct`}b~b}||b}|||\u007fg"));
        cfr_renamed_132 = new sprlem(sprraz.cfr_renamed_9("\u0012A\u001bA\u0010\\\u0016]\f^\u001b]\u0012_\u0011_\u0012A\u0013_\u0012A\u0013A\u0013"));
        cfr_renamed_3 = new Hashtable();
        cfr_renamed_102 = new Hashtable();
        cfr_renamed_3.put(cfr_renamed_957, sprbyfa.cfr_renamed_9("\u0011"));
        cfr_renamed_3.put(cfr_renamed_728, sprraz.cfr_renamed_9("m"));
        cfr_renamed_3.put(cfr_renamed_96, sprbyfa.cfr_renamed_9("\u0006"));
        cfr_renamed_3.put(cfr_renamed_112, sprraz.cfr_renamed_9(" w"));
        cfr_renamed_3.put(cfr_renamed_82, sprbyfa.cfr_renamed_9("\u000e\u001c"));
        cfr_renamed_3.put(cfr_renamed_79, sprraz.cfr_renamed_9("n"));
        cfr_renamed_3.put(cfr_renamed_953, sprbyfa.cfr_renamed_9("\u001e\u0006"));
        cfr_renamed_3.put(cfr_renamed_152, sprraz.cfr_renamed_9("<g=k.n!w\"`*p"));
        cfr_renamed_3.put(cfr_renamed_951, sprbyfa.cfr_renamed_9("\u0017"));
        cfr_renamed_3.put(cfr_renamed_287, sprraz.cfr_renamed_9("+a"));
        cfr_renamed_3.put(cfr_renamed_132, sprbyfa.cfr_renamed_9("\u0007\u0004\u0016"));
        cfr_renamed_3.put(cfr_renamed_1, sprraz.cfr_renamed_9("<v=g*v"));
        cfr_renamed_3.put(cfr_renamed_185, sprbyfa.cfr_renamed_9("\u0001\u0018\u0000\u0003\u0013\u0000\u0017"));
        cfr_renamed_3.put(cfr_renamed_86, sprraz.cfr_renamed_9("e&t*l!c\"g"));
        cfr_renamed_3.put(cfr_renamed_723, sprbyfa.cfr_renamed_9("\u0004\u001c\u0004\u0006\u0004\u0013\u0001\u0001"));
        cfr_renamed_3.put(cfr_renamed_93, sprraz.cfr_renamed_9("(g!g=c;k l"));
        cfr_renamed_3.put(cfr_renamed_126, sprbyfa.cfr_renamed_9("\u0016\b\u0001\u000e\u0000\u0004\u0002\u0019\u001b\u0002\u001c"));
        cfr_renamed_3.put(cfr_renamed_128, sprraz.cfr_renamed_9("=m#g"));
        cfr_renamed_3.put(cfr_renamed_1226, sprbyfa.cfr_renamed_9("'#!9 819'?7)\u0013)6?7>!"));
        cfr_renamed_3.put(cfr_renamed_137, sprraz.cfr_renamed_9("\u001aL\u001cV\u001dW\fV\u001aP\nF!C\u0002G"));
        cfr_renamed_3.put(cfr_renamed_31, sprbyfa.cfr_renamed_9("\u0018<$#87\u00046(<9;+;( "));
        cfr_renamed_3.put(cfr_renamed_499, sprraz.cfr_renamed_9("+l"));
        cfr_renamed_3.put(cfr_renamed_272, sprbyfa.cfr_renamed_9("\u0002>786\"<4?"));
        cfr_renamed_3.put(spr\ufe34, sprraz.cfr_renamed_9("r\u0000Q\u001bC\u0003c\u000bF\u001dG\u001cQ"));
        cfr_renamed_3.put(cfr_renamed_145, sprbyfa.cfr_renamed_9("\u001c,?(\u00139\u0010$ 9:"));
        cfr_renamed_3.put(cfr_renamed_724, sprraz.cfr_renamed_9(",M\u001aL\u001bP\u0016m\ta\u0006V\u0006X\nL\u001cJ\u0006R"));
        cfr_renamed_3.put(cfr_renamed_107, sprbyfa.cfr_renamed_9("\u000e=8<9 4\u001d+\u0000(!$6(<.7"));
        cfr_renamed_3.put(cfr_renamed_84, sprraz.cfr_renamed_9("(G\u0001F\nP"));
        cfr_renamed_3.put(cfr_renamed_88, sprbyfa.cfr_renamed_9("\u001d>,1(\u001d+\u0010$ 9:"));
        cfr_renamed_3.put(cfr_renamed_0, sprraz.cfr_renamed_9("f\u000eV\nm\t`\u0006P\u001bJ"));
        cfr_renamed_3.put(cfr_renamed_4, sprbyfa.cfr_renamed_9("\u001d=>&,>\u000e=)7"));
        cfr_renamed_3.put(cfr_renamed_314, sprraz.cfr_renamed_9("-W\u001cK\u0001G\u001cQ,C\u001bG\bM\u001d["));
        cfr_renamed_3.put(cfr_renamed_105, sprbyfa.cfr_renamed_9("\u0006(>(\"%=#7\u0003' 0( "));
        cfr_renamed_3.put(cfr_renamed_114, "Name");
        cfr_renamed_3.put(cfr_renamed_133, sprraz.cfr_renamed_9("\u0000P\bC\u0001K\u0015C\u001bK\u0000L&F\nL\u001bK\tK\nP"));
        cfr_renamed_102.put("c", cfr_renamed_957);
        cfr_renamed_102.put("o", cfr_renamed_728);
        cfr_renamed_102.put("t", cfr_renamed_96);
        cfr_renamed_102.put(sprbyfa.cfr_renamed_9("\"'"), cfr_renamed_112);
        cfr_renamed_102.put("cn", cfr_renamed_82);
        cfr_renamed_102.put("l", cfr_renamed_79);
        cfr_renamed_102.put("st", cfr_renamed_953);
        cfr_renamed_102.put(sprraz.cfr_renamed_9("\u001cL"), cfr_renamed_185);
        cfr_renamed_102.put(sprbyfa.cfr_renamed_9(">7?;,>#' 0( "), cfr_renamed_152);
        cfr_renamed_102.put(sprraz.cfr_renamed_9("\u001cV\u001dG\nV"), cfr_renamed_1);
        cfr_renamed_102.put(sprbyfa.cfr_renamed_9("(?,;!3)6?7>!"), cfr_renamed_119);
        cfr_renamed_102.put(sprraz.cfr_renamed_9("\u000bA"), cfr_renamed_287);
        cfr_renamed_102.put("e", cfr_renamed_119);
        cfr_renamed_102.put(sprbyfa.cfr_renamed_9("'$6"), cfr_renamed_132);
        cfr_renamed_102.put(sprraz.cfr_renamed_9("Q\u001aP\u0001C\u0002G"), cfr_renamed_185);
        cfr_renamed_102.put(sprbyfa.cfr_renamed_9("5$$(<#3 7"), cfr_renamed_86);
        cfr_renamed_102.put("initials", cfr_renamed_723);
        cfr_renamed_102.put(sprraz.cfr_renamed_9("\bG\u0001G\u001dC\u001bK\u0000L"), cfr_renamed_93);
        cfr_renamed_102.put("description", cfr_renamed_126);
        cfr_renamed_102.put(sprbyfa.cfr_renamed_9("?=!7"), cfr_renamed_128);
        cfr_renamed_102.put(sprraz.cfr_renamed_9("W\u0001Q\u001bP\u001aA\u001bW\u001dG\u000bC\u000bF\u001dG\u001cQ"), cfr_renamed_1226);
        cfr_renamed_102.put(sprbyfa.cfr_renamed_9("8<>&?'.&8 (6#3 7"), cfr_renamed_137);
        cfr_renamed_102.put(sprraz.cfr_renamed_9("\u001aL\u0006S\u001aG\u0006F\nL\u001bK\tK\nP"), cfr_renamed_31);
        cfr_renamed_102.put("dn", cfr_renamed_499);
        cfr_renamed_102.put(sprbyfa.cfr_renamed_9("\">786\"<4?"), cfr_renamed_272);
        cfr_renamed_102.put(sprraz.cfr_renamed_9("R\u0000Q\u001bC\u0003C\u000bF\u001dG\u001cQ"), spr\ufe34);
        cfr_renamed_102.put(sprbyfa.cfr_renamed_9("<,?(390$ 9:"), cfr_renamed_145);
        cfr_renamed_102.put(sprraz.cfr_renamed_9("\fM\u001aL\u001bP\u0016M\tA\u0006V\u0006X\nL\u001cJ\u0006R"), cfr_renamed_724);
        cfr_renamed_102.put(sprbyfa.cfr_renamed_9(".=8<9 4=+ (!$6(<.7"), cfr_renamed_107);
        cfr_renamed_102.put(sprraz.cfr_renamed_9("\bG\u0001F\nP"), cfr_renamed_84);
        cfr_renamed_102.put(sprbyfa.cfr_renamed_9("=>,1(=+0$ 9:"), cfr_renamed_88);
        cfr_renamed_102.put(sprraz.cfr_renamed_9("F\u000eV\nM\t@\u0006P\u001bJ"), cfr_renamed_0);
        cfr_renamed_102.put(sprbyfa.cfr_renamed_9("==>&,>.=)7"), cfr_renamed_4);
        cfr_renamed_102.put(sprraz.cfr_renamed_9("\rW\u001cK\u0001G\u001cQ\fC\u001bG\bM\u001d["), cfr_renamed_314);
        cfr_renamed_102.put(sprbyfa.cfr_renamed_9("&(>(\"%=#7#' 0( "), cfr_renamed_105);
        cfr_renamed_102.put("name", cfr_renamed_114);
        cfr_renamed_102.put(sprraz.cfr_renamed_9("\u0000P\bC\u0001K\u0015C\u001bK\u0000L\u0006F\nL\u001bK\tK\nP"), cfr_renamed_133);
        cfr_renamed_956 = new sprebm();
    }

    @Override
    public String cfr_renamed_7319(sprnbm arg0) {
        int n;
        StringBuffer stringBuffer = new StringBuffer();
        boolean bl = true;
        sprxjm[] sprxjmArray = arg0.cfr_renamed_4544();
        int n2 = n = 0;
        while (n2 < sprxjmArray.length) {
            StringBuffer stringBuffer2;
            if (bl) {
                bl = false;
                stringBuffer2 = stringBuffer;
            } else {
                StringBuffer stringBuffer3 = stringBuffer;
                stringBuffer2 = stringBuffer3;
                stringBuffer3.append(',');
            }
            sprxjm sprxjm2 = sprxjmArray[n];
            sprtdm.cfr_renamed_11171(stringBuffer2, sprxjm2, this.cfr_renamed_135);
            n2 = ++n;
        }
        return stringBuffer.toString();
    }

    @Override
    public String[] cfr_renamed_11160(sprlem arg0) {
        return sprtdm.cfr_renamed_11172(arg0, this.cfr_renamed_91);
    }

    @Override
    public sprxjm[] cfr_renamed_3246(String arg0) {
        return sprtdm.cfr_renamed_11170(arg0, this);
    }
}

