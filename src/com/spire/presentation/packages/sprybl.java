/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprap;
import com.spire.presentation.packages.sprcll;
import com.spire.presentation.packages.sprfhi;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprizk;
import com.spire.presentation.packages.sprjcf;
import com.spire.presentation.packages.sprjdl;
import com.spire.presentation.packages.sprjej;
import com.spire.presentation.packages.sprlel;
import com.spire.presentation.packages.sprmqk;
import com.spire.presentation.packages.sprpx;
import com.spire.presentation.packages.sprqll;
import com.spire.presentation.packages.sprrll;
import com.spire.presentation.packages.sprsuk;
import com.spire.presentation.packages.sprtbl;
import com.spire.presentation.packages.sprwsk;
import com.spire.presentation.packages.sprxq;
import java.math.BigInteger;
import java.security.AccessController;
import java.security.Permission;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

public final class sprybl {
    private static final sprpx cfr_renamed_102;
    private static final Permission cfr_renamed_93;
    private static final Map<String, Object[]> cfr_renamed_86;
    private static final Permission cfr_renamed_152;
    private static final sprap cfr_renamed_112;
    private static final AtomicReference<sprap> cfr_renamed_119;
    private static final boolean cfr_renamed_91;
    private static final Logger cfr_renamed_0;
    private static final Permission cfr_renamed_1;
    private static final ThreadLocal<Map<String, Object[]>> cfr_renamed_2;
    private static final Permission cfr_renamed_3;
    private static final AtomicReference<sprpx> cfr_renamed_4;

    public static <T> void cfr_renamed_10566(sprrll arg0, T ... arg1) {
        sprybl.cfr_renamed_10567(cfr_renamed_152);
        if (!sprrll.cfr_renamed_10568(arg0).isAssignableFrom(arg1[0].getClass())) {
            throw new IllegalArgumentException(sprfhi.cfr_renamed_9("\u0014P2\u0011&C9A3C\"HvG7]#TvA7B%T2"));
        }
        sprybl.cfr_renamed_10569(arg0, (Object[])arg1.clone());
    }

    public static SecureRandom cfr_renamed_5688(SecureRandom arg0) {
        if (null == arg0) {
            return sprybl.cfr_renamed_2794();
        }
        return arg0;
    }

    public static <T> T cfr_renamed_9165(sprrll arg0, int arg1) {
        block6: {
            int n;
            Object[] objectArray;
            block5: {
                int n2;
                objectArray = sprybl.cfr_renamed_10570(arg0);
                if (objectArray == null) {
                    return null;
                }
                if (!sprrll.cfr_renamed_10568(arg0).isAssignableFrom(sprwsk.class)) break block5;
                int n3 = n2 = 0;
                while (n3 != objectArray.length) {
                    sprwsk sprwsk2 = (sprwsk)objectArray[n2];
                    if (sprwsk2.cfr_renamed_1155().bitLength() == arg1) {
                        return (T)sprwsk2;
                    }
                    n3 = ++n2;
                }
                break block6;
            }
            if (!sprrll.cfr_renamed_10568(arg0).isAssignableFrom(sprmqk.class)) break block6;
            int n4 = n = 0;
            while (n4 != objectArray.length) {
                sprmqk sprmqk2 = (sprmqk)objectArray[n];
                if (sprmqk2.cfr_renamed_1155().bitLength() == arg1) {
                    return (T)sprmqk2;
                }
                n4 = ++n;
            }
        }
        return null;
    }

    private static /* synthetic */ <T> void cfr_renamed_10569(sprrll arg0, T[] arg1) {
        Map<String, Object[]> map = cfr_renamed_2.get();
        if (map == null) {
            map = new HashMap<String, Object[]>();
            cfr_renamed_2.set(map);
        }
        map.put(sprrll.cfr_renamed_10571(arg0), arg1);
    }

    private static /* synthetic */ void cfr_renamed_10567(Permission arg0) {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            AccessController.doPrivileged(new sprtbl(securityManager, arg0));
        }
    }

    private static /* synthetic */ int cfr_renamed_10572(int arg0) {
        int n = 160;
        if (arg0 > 1024) {
            if (arg0 <= 2048) {
                n = 224;
                return 224;
            }
            if (arg0 <= 3072) {
                n = 256;
                return 256;
            }
            if (arg0 <= 7680) {
                n = 384;
                return 384;
            }
            n = 512;
        }
        return n;
    }

    private static /* synthetic */ <T> void cfr_renamed_10573(sprrll arg0, T ... arg1) {
        if (!sprrll.cfr_renamed_10568(arg0).isAssignableFrom(arg1[0].getClass())) {
            throw new IllegalArgumentException(sprjej.cfr_renamed_9("Y>\u007f\u007fk-t/~-o&;)z3n:;/z,h:\u007f"));
        }
        sprybl.cfr_renamed_10569(arg0, arg1);
        cfr_renamed_86.put(sprrll.cfr_renamed_10571(arg0), arg1);
    }

    private static /* synthetic */ sprwsk cfr_renamed_10574(sprmqk arg0) {
        int n = sprybl.cfr_renamed_10572(arg0.cfr_renamed_1155().bitLength());
        return new sprwsk(arg0.cfr_renamed_1155(), arg0.cfr_renamed_1145(), arg0.cfr_renamed_1604(), n, 0, null, new sprsuk(arg0.cfr_renamed_3371().cfr_renamed_2113(), arg0.cfr_renamed_3371().cfr_renamed_3374()));
    }

    public static <T> T[] cfr_renamed_10575(sprrll arg0) {
        sprybl.cfr_renamed_10567(cfr_renamed_3);
        sprybl.cfr_renamed_10576(arg0);
        return cfr_renamed_86.remove(sprrll.cfr_renamed_10571(arg0));
    }

    public static <T> T[] cfr_renamed_10577(sprrll arg0) {
        Object[] objectArray = sprybl.cfr_renamed_10570(arg0);
        if (objectArray == null) {
            return null;
        }
        return (Object[])objectArray.clone();
    }

    private static /* synthetic */ Object[] cfr_renamed_10576(sprrll arg0) {
        Map<String, Object[]> map = cfr_renamed_2.get();
        if (map == null) {
            map = new HashMap<String, Object[]>();
            cfr_renamed_2.set(map);
        }
        return map.remove(sprrll.cfr_renamed_10571(arg0));
    }

    static {
        cfr_renamed_0 = Logger.getLogger(sprybl.class.getName());
        cfr_renamed_3 = new sprcll("globalConfig");
        cfr_renamed_152 = new sprcll("threadLocalConfig");
        cfr_renamed_1 = new sprcll("defaultRandomConfig");
        cfr_renamed_93 = new sprcll("constraints");
        cfr_renamed_2 = new ThreadLocal();
        cfr_renamed_86 = Collections.synchronizedMap(new HashMap());
        cfr_renamed_102 = new sprjdl(null);
        cfr_renamed_112 = new sprqll();
        cfr_renamed_4 = new AtomicReference();
        cfr_renamed_119 = new AtomicReference();
        sprmqk sprmqk2 = new sprmqk(new BigInteger(sprfhi.cfr_renamed_9("W5P`\tdR3\t3\u0000dR7S7\u0003`T0R5Wa\u0000g\u00013\u0004d\u00072Sf\u0006nSf\u00043U3R4R2\u00003SbPd\u0001nWeP3\u0000`\u0000aP3\u0001gWe\u00044\bgPb\u00063\u00072W`\u0002b\u0000eRcTg\u00033Uf\to\b4R2\u0000e\u00037R2\u0004fUo\bg\u0004gS2Rb\u00023Ta\u0002a\u0004o\u00033\u0000a"), 16), new BigInteger(sprjej.cfr_renamed_9("f-m~;\u007f<xl-fx=zg~=ym-o~:-=->*m-;\"l/i~l#<."), 16), new BigInteger(sprfhi.cfr_renamed_9("\u0007a\tb\u0006gSd\u00067\b5Wb\u00053To\u00007\u0005oRc\u0000b\u00062SgPoP7Wd\u0005bWf\u00047\u0005e\u00052\u0007b\t`\be\u00002\u00032\u0000b\u0003a\u00004\b3\u0002c\u0001e\u00014\u0006gW2\u0006eU7\u0000a\bf\u0007oSe\u00033\u0003o\u0002c\u0007e\u00013\u00005\u0003f\u0007d\u0002c\u00052\u00012Pd\u00017\u00075\u0005g\u00073\u0004fS3\u0006o\u00055Pb"), 16), new sprizk(sprfqe.cfr_renamed_5217(sprjej.cfr_renamed_9("=#i\"<#myl.;,o~nyn}9\"nym#:(hzi):x;xl/k+fy")), 123));
        sprmqk sprmqk3 = new sprmqk(new BigInteger(sprfhi.cfr_renamed_9("ToT`\u0005d\u0004o\b2\u0002c\u00040\u0002aRo\u00060W2\u0002c\u0007a\u0000d\u00014\t3\u0003cRoR2\u0005eTo\u0003aSePo\u0007a\u00010S3RcUn\bf\u0000b\u0000o\u0003dUdReSeP2\u0003b\tf\u0001o\u0002a\bo\t`\b2\u00003\tb\u00077P4\u0005oW7SfP2\u0003`UdR3\u00077\u0003d\u0003g\b2\u0005a\u00014R3\u00062\u0006a\u00062\u00057\u0003gW4ToRd\u0006fSc\u00060\u0007f\u0006f\u0001dWeR3Wn\u0002o\u0002`\bbR0\u0005cT3\u0002`\tnRg\u00007\t5\u0004`P4\u0000d\u00067\u00022P0"), 16), new BigInteger(sprjej.cfr_renamed_9("fx;y;#kxf}nz<)9(g\u007fo}g+9/mz=\"j):,l(gy9.n*"), 16), new BigInteger(sprfhi.cfr_renamed_9("\u0002f\u0005a\u00017UcPf\u0001cW4\u0000bR3\u00032\b2R2\taTe\t4RaUgSgRcW7R4P3R4To\u00040\u0000o\u00017PaPe\u00002\u0003eRbU4S5S3\u0001`\u0000a\u0005c\u0005b\u0005f\u00007\u00044\u00035\u0001d\u0001o\u0007cUnRdS2\u0003g\u0006gUe\u0007`\tb\u0005c\u0006a\u00000\u0006bS7\u0001n\u00052\u0003f\u0003oUn\u00025\u00005\u0000c\tc\u0005aWePoWgPd\u0006g\u00044Td\u00022\u0004gP3\u00052\u00023\u00047\u00000\u00077\u0006f\u0007bWe\u0000`\be\u00027\u0002b\u00072\u00020\u0004d\bd\u0004d"), 16), new sprizk(sprfqe.cfr_renamed_5217(sprjej.cfr_renamed_9("h,;+9#</;z;*j~=#</9)9#;-h)ix:};\"i\u007fjy=(f\"")), 263));
        sprmqk sprmqk4 = new sprmqk(new BigInteger(sprfhi.cfr_renamed_9("W2\u00060\u0004e\tg\u00002\u0006c\u0000d\u0003o\u0004dU0\u00057\b5\u00033T5TbTaW`\u0000gSa\u0004d\u00025T0\u0005b\u0001fRe\u00003\u00020\tfS`\u0004g\u0003`\u0007o\u0005c\u00042\u0005f\u0003d\u0004gW4\u0004o\u00022\t2\u0004nW7S0RcWcS7\u0002fW`R4\b4\u0004c\u00075Ua\tg\u00024\tf\u00002\u0002b\u00070Wd\u0007`\u0007fSa\u00074\bo\u0004fPcPb\b0\b0Tn\u0001b\u00064\u0000f\u0003dRd\u00050S4PoUaW3SaR`\u00004Wn\u00024\u0004aTaR`PnP`\u0000c\u00010\u0001bW4\teW`UeRc\u00003Re\u0001d\u0002c\u0004b\u0000e\u00047\u0000`\bg\u0002dW`\u0006cWeP3\u00034\u0007gUa\u00037T0Wd\u0003d\u0001e\u0000o\b2Ug\u0005n\u0001gRa"), 16), new BigInteger(sprjej.cfr_renamed_9("f,i+j+g}n.m(oy<x=)f)=\"g)>):yg/oy9+j#nx9."), 16), new BigInteger(sprfhi.cfr_renamed_9("WaTgPf\tcU`\b4\u00022U3R4S5P4\u00045\u0002`Sn\u0004aSo\u0006o\bbP0S4W7\u00027T7\tdWo\u0004a\u00055\u00014\u00022\u0001a\td\u0007a\u0004g\u0004o\u0004a\t3S7Ub\u0004o\u00050T`\u0006g\u0001a\u0000f\tg\tfSb\u0005o\u0000`\u0006g\u0003eTn\u00055\u0003n\u0000`\u0000eSaR0\u0001o\u0002d\t5RnP`Tg\u00025\u0000`\u00067\t4\u0004b\u00065\t2\u0003nTfPeP3\u00003\u00034SeP`\u0006c\bg\u00073Pe\u00060\u00014W7\u0003g\u0002c\u0007dWgW4\u0007d\u00067\u0001g\u0003b\u00024R5PbWgS3Pn\u0004g\bf\toPn\teU0Tg\u00047Tc\b0\u0001`\bd\t4\u0007`\u00043\tf\u00064\u0004c\u0003c\u0007b\u0001g\u00055\u00024W3R0\u0005o\u00037"), 16), new sprizk(sprfqe.cfr_renamed_5217(sprjej.cfr_renamed_9("g\u007fj*j.g\"k)m\";.:-g\":~o*:-o*gzm(h~mx>~i/<\u007f")), 92));
        sprmqk sprmqk5 = new sprmqk(new BigInteger(sprfhi.cfr_renamed_9("\bc\u0005a\u00045WcUo\u00023\u0004o\u00075\u00020R2\u00002\bf\u00037U2\u0001dWb\u0003aWcWeRa\u0003g\u0001e\u0000eS4\u0005cW4\u00052\u00044SdTcW3\u00005S2\u0007a\t5UbS4U2\tbRo\te\u00074TgWe\u00005\u0001a\u0006a\u0006d\u00047T4\u00075\u00030Re\t4\tcWb\tf\u0006`W7\u0006`S5Un\u0000b\u00075Rn\b7\u00070SdWa\u0001`U2\u0006g\bn\bnRd\u0001n\u00022RnUn\b`Wn\u0005f\u0007dTdRoRo\u00052\u0000e\u00064\u0001c\u00057\t2\tf\b`P2SnUc\u0000o\u0004d\u0002o\t3T5Pn\u0004dPfP0\u0000dU0\teTb\u0006cP7\u0007cUbT5\u00015\u0002nPo\u0004`\u00012\u0004`\u0007g\u0000n\u00070Wo\t4\b0RoT4\u0007fT3TnSf\u0002f\u0002a\u00074\u0003e\u00074Ra\u00024TeP5U4Ua\u00050U`\u00005\u00002\u0003b\u0006cW7\u0002f\u0006aSnWf\tf\u0005`\u0006n\tgW0\u00063\u00005Pc\u00070T3\u0001`\u00072\u0006o\u0004f\u00077U3\u0004gT2S4\u0004b\u0005ePc\u0007e\bd\u00062S5\u00054Pc\u0003f\u0001n\u0007a\u0005`\u0000a\u00045\tn\tc\bd\u00043S5\u0007bR`\u0000b\u0006o\u0001`\u0006a\u0002b\b`\bo\u00015Sa\u0000bT5\u0007`\u0006e\u0001bTd\u0007gW7T3\u0002eSeR4U0\u0001f\t3\u00015\u00020Po\u0001`\u0004fUo\u00062\u0002o\u0001oRo\u0003a\u00044WbP5\t`W0R4\u00022\u0001eT`U0RnP2Pc\be\u0005d\u0005dU2\u00072\u00024R5PdPb\u0001`R4\u00014"), 16), new BigInteger(sprjej.cfr_renamed_9("9#n#l-i#=zj}<.=yo-=.f#n~i\u007fgyh\"j\u007fl+=#f,g\u007fk(<zo~<.h):(h~o\"f(fzf,h("), 16), new BigInteger(sprfhi.cfr_renamed_9("\u0005dU3S4\b2PcSeUn\t5Ro\u0004`Tf\ta\taT5\u00020\u00027\u0001oS4PcWb\t4\tn\b7\u0006bP7Wc\u0002g\u0006bP7\u00010S3\u00063\u00025\u00044\t0R2\u00067\u0004eS3Wc\u0007eSfTo\tc\u0007f\u0002d\to\u0007fPo\u0004g\u00060\u0005f\u0000bUe\u0002d\u00040Ra\b`\u00034WgTf\u0005o\u0002a\u00012\u0006`Ug\u0002g\u00057\u0006`\u0000e\u00063\u0006o\u00030\u00020\u00012Sn\u0004oUf\bcTbPcSo\u0002d\u0001d\u00050\u0001a\b3R0\u00033Wf\b5\u0006o\u0006b\u0004dSf\u0006a\u00013\u0000e\u0004f\u0006n\u00033Uc\u00062U0\u0006o\u0005o\u0006oU5T0\u0003eR4\b`Wg\te\u0001`\u0000o\u0007cRbT4Ro\u00025\b5\u0006gRc\u00074\bd\u0004o\u0004cPa\u00040\bbR5R0\u0000b\u0005oP5\u0005eUc\t`UfS3T3\u0005e\u0003c\u00004\u00014\u0003d\ta\u0002b\b2\u0007nU3\u00012\u0000b\u0005b\u0001eWg\u00023\tf\u00030\u0005g\u0005`Un\tdTf\u0004aP0\u0000oS`W`\u0003a\u00045\u0007`\u0006`RnW7\u00013\u00025Pd\u0006g\u00027\u0002d\u0004aW2\u00004\u0003aUf\u0007e\b0\u0007o\u00043\u0002b\u00062\t2\u00005WoP5\tg\b7\u0003`R7\b4\u0001bR4\u00013SoSaSf\u0002c\bn\t2\u0000cS4P5\u0007c\u0003g\u00037\u0004c\u0003e\b5W5\u00063\u0004nW7Te\t2\u0006d\u0004fP4\bo\bgW0S5\ba\u0000e\u0005f\u0003cW3\t5Tf\u00055\u0005e\boP2\b`\u0004`\b4To\u00007\u0004b\u00070\u0005o\u0006n\u0007o\u00025\u00067"), 16), new sprizk(sprfqe.cfr_renamed_5217(sprjej.cfr_renamed_9("=+=/k*h-o*=.fx=xf\u007fgz<#9\"l.<z;z:xk}j}=ym}m(h#j-o\">~k-i,k#;\"=.>.l-")), 497));
        sprmqk[] sprmqkArray = new sprmqk[4];
        sprmqkArray[0] = sprmqk2;
        sprmqkArray[1] = sprmqk3;
        sprmqkArray[2] = sprmqk4;
        sprmqkArray[3] = sprmqk5;
        sprybl.cfr_renamed_10573(sprrll.cfr_renamed_0, sprmqkArray);
        sprwsk[] sprwskArray = new sprwsk[4];
        sprwskArray[0] = sprybl.cfr_renamed_10574(sprmqk2);
        sprwskArray[1] = sprybl.cfr_renamed_10574(sprmqk3);
        sprwskArray[2] = sprybl.cfr_renamed_10574(sprmqk4);
        sprwskArray[3] = sprybl.cfr_renamed_10574(sprmqk5);
        sprybl.cfr_renamed_10573(sprrll.cfr_renamed_2, sprwskArray);
        cfr_renamed_119.set(sprybl.cfr_renamed_112);
        cfr_renamed_91 = cfr_renamed_119.get() != cfr_renamed_112;
    }

    public static SecureRandom cfr_renamed_2794() {
        cfr_renamed_4.compareAndSet(null, cfr_renamed_102);
        return cfr_renamed_4.get().cfr_renamed_1397();
    }

    private static /* synthetic */ Object[] cfr_renamed_10570(sprrll arg0) {
        Map<String, Object[]> map = cfr_renamed_2.get();
        if (map == null || !map.containsKey(sprrll.cfr_renamed_10571(arg0))) {
            Object[] objectArray = cfr_renamed_86.get(sprrll.cfr_renamed_10571(arg0));
            return objectArray;
        }
        Object[] objectArray = map.get(sprrll.cfr_renamed_10571(arg0));
        return objectArray;
    }

    public static void cfr_renamed_10578(sprap arg0) {
        sprap sprap2;
        sprybl.cfr_renamed_10567(cfr_renamed_93);
        sprap sprap3 = sprap2 = arg0 == null ? cfr_renamed_112 : arg0;
        if (cfr_renamed_91) {
            if (sprjcf.cfr_renamed_5159(sprfhi.cfr_renamed_9("5^;\u001f%A?C3\u001f&B;^2T:\u001f%T5D$X\"HxR9_%E$P?_\"BxP:]9F\t^ T$C?U3"))) {
                cfr_renamed_119.set(sprap2);
                return;
            }
            cfr_renamed_0.warning(sprjej.cfr_renamed_9(">o+~2k+;+t\u007ft)~-i6\u007f:;/i:6<t1}6|*i:\u007f\u007fx0u,o-z6u+h\u007fr8u0i:\u007f"));
            return;
        }
        cfr_renamed_119.set(sprap2);
    }

    public static sprap cfr_renamed_10579() {
        return cfr_renamed_119.get();
    }

    public static void cfr_renamed_9170(sprxq arg0) {
        cfr_renamed_119.get().cfr_renamed_10580(arg0);
    }

    public static <T> T[] cfr_renamed_10581(sprrll arg0) {
        sprybl.cfr_renamed_10567(cfr_renamed_152);
        return sprybl.cfr_renamed_10576(arg0);
    }

    public static void cfr_renamed_10582(sprpx arg0) {
        sprybl.cfr_renamed_10567(cfr_renamed_1);
        cfr_renamed_4.set(arg0);
    }

    private /* synthetic */ sprybl() {
    }

    public static <T> T cfr_renamed_10583(sprrll arg0) {
        Object[] objectArray = sprybl.cfr_renamed_10570(arg0);
        if (objectArray != null) {
            return (T)objectArray[0];
        }
        return null;
    }

    public static void cfr_renamed_1555(SecureRandom arg0) {
        sprybl.cfr_renamed_10567(cfr_renamed_1);
        if (arg0 == null) {
            cfr_renamed_4.set(cfr_renamed_102);
            return;
        }
        cfr_renamed_4.set(new sprlel(arg0));
    }

    public static <T> void cfr_renamed_10584(sprrll arg0, T ... arg1) {
        sprybl.cfr_renamed_10567(cfr_renamed_3);
        sprybl.cfr_renamed_10573(arg0, (Object[])arg1.clone());
    }
}

