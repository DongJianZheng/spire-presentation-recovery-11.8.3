/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprcgm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprfvm;
import com.spire.presentation.packages.sprhl;
import com.spire.presentation.packages.sprjqc;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnjp;
import com.spire.presentation.packages.sprqlg;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprwoh;
import com.spire.presentation.packages.sprwyl;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprzog;
import java.io.IOException;
import java.math.BigInteger;

public class sprvlg {
    private static final sprzog cfr_renamed_1;
    private static final BigInteger cfr_renamed_2;
    private static final sprzog cfr_renamed_3;
    private static final BigInteger cfr_renamed_4;

    private static /* synthetic */ void cfr_renamed_7256(BigInteger arg0) {
        int n;
        int n2;
        if ((arg0.intValue() & 1) == 0) {
            throw new IllegalArgumentException(sprjqc.cfr_renamed_9("u>fMJ\u0002C\u0018K\u0018TMN\u001e\u0007\bQ\bI"));
        }
        if (sprqlg.cfr_renamed_5159(sprnjp.cfr_renamed_9("L?B~\\ F\"J~_#B?K5C~\\5L%]9[)\u0001\"\\1\u00011C<@'p%A#N6J\u000fB?K"))) {
            return;
        }
        int n3 = sprqlg.cfr_renamed_5152(sprjqc.cfr_renamed_9("D\u0002JCT\u001dN\u001fBCW\u001eJ\u0002C\bKCT\bD\u0018U\u0004S\u0014\t\u001fT\f\t\u0000F\u0015x\u001eN\u0017B"), 15360);
        if (n3 < (n2 = arg0.bitLength())) {
            throw new IllegalArgumentException(sprnjp.cfr_renamed_9("=@4Z<Z#\u000f&N<Z5\u000f?Z$\u000f?Ip]1A7J"));
        }
        if (!arg0.gcd(cfr_renamed_2).equals(cfr_renamed_4)) {
            throw new IllegalArgumentException(sprjqc.cfr_renamed_9("?t,\u0007\u0000H\tR\u0001R\u001e\u0007\u0005F\u001e\u0007\f\u0007\u001eJ\fK\u0001\u0007\u001dU\u0004J\b\u0007\u000bF\u000eS\u0002U"));
        }
        int n4 = arg0.bitLength() / 2;
        int n5 = n4 >= 1536 ? 3 : (n4 >= 1024 ? 4 : (n = n4 >= 512 ? 7 : 50));
        if (!sprwoh.cfr_renamed_7257(arg0, sprybl.cfr_renamed_2794(), n).cfr_renamed_7258()) {
            throw new IllegalArgumentException(sprnjp.cfr_renamed_9("\u0002|\u0011\u000f=@4Z<Z#\u000f9\\pA?[pL?B @#F$J"));
        }
    }

    public static boolean cfr_renamed_5161(String arg0) {
        return sprqlg.cfr_renamed_5161(arg0);
    }

    private static /* synthetic */ int cfr_renamed_7259(int arg0, int arg1) {
        if (arg0 >= 1536) {
            if (arg1 <= 100) {
                return 3;
            }
            if (arg1 <= 128) {
                return 4;
            }
            return 4 + (arg1 - 128 + 1) / 2;
        }
        if (arg0 >= 1024) {
            if (arg1 <= 100) {
                return 4;
            }
            if (arg1 <= 112) {
                return 5;
            }
            return 5 + (arg1 - 112 + 1) / 2;
        }
        if (arg0 >= 512) {
            if (arg1 <= 80) {
                return 5;
            }
            if (arg1 <= 100) {
                return 7;
            }
            return 7 + (arg1 - 100 + 1) / 2;
        }
        if (arg1 <= 80) {
            return 40;
        }
        return 40 + (arg1 - 80 + 1) / 2;
    }

    public static boolean cfr_renamed_5158(String arg0, boolean arg1) {
        return sprqlg.cfr_renamed_5158(arg0, arg1);
    }

    public static void cfr_renamed_7260(sprvhm arg0) {
        sprlem sprlem2 = arg0.cfr_renamed_593().cfr_renamed_593();
        if (sprbr.cfr_renamed_135.cfr_renamed_5078(sprlem2)) {
            sprcgm sprcgm2 = sprcgm.cfr_renamed_23(arg0.cfr_renamed_593().cfr_renamed_284());
            if (sprcgm2.cfr_renamed_2320() || sprcgm2.cfr_renamed_2317()) {
                return;
            }
            sprszm sprszm2 = sprszm.cfr_renamed_23(sprcgm2.cfr_renamed_284());
            sprwyl sprwyl2 = sprwyl.cfr_renamed_23(sprszm2.cfr_renamed_85(1));
            if (sprwyl2.cfr_renamed_4028().cfr_renamed_5078(sprwyl.cfr_renamed_953)) {
                BigInteger bigInteger = sprktm.cfr_renamed_23(sprwyl2.cfr_renamed_284()).cfr_renamed_97();
                if (cfr_renamed_3.cfr_renamed_7261(bigInteger)) {
                    return;
                }
                int n = sprqlg.cfr_renamed_5152(sprjqc.cfr_renamed_9("D\u0002JCT\u001dN\u001fBCW\u001eJ\u0002C\bKCT\bD\u0018U\u0004S\u0014\t\bDCA\u001dx\u0000F\u0015x\u001eN\u0017B"), 1042);
                int n2 = sprqlg.cfr_renamed_5152(sprnjp.cfr_renamed_9("3@=\u0001#_9]5\u0001 \\=@4J<\u0001#J3Z\"F$V~J3\u00016_\u000fL5]$N9A$V"), 100);
                int n3 = bigInteger.bitLength();
                if (n < n3) {
                    throw new IllegalArgumentException(sprjqc.cfr_renamed_9("a\u001d\u0007\u001c\u0007\u001bF\u0001R\b\u0007\u0002R\u0019\u0007\u0002AMU\fI\nB"));
                }
                if (sprwoh.cfr_renamed_7262(bigInteger) || !sprwoh.cfr_renamed_7263(bigInteger, sprybl.cfr_renamed_2794(), sprvlg.cfr_renamed_7259(n3, n2))) {
                    throw new IllegalArgumentException(sprnjp.cfr_renamed_9("\u0016_p^pY1C%JpA?[p_\"F=J"));
                }
                cfr_renamed_3.cfr_renamed_1859(bigInteger);
                return;
            }
        } else if (sprdl.cfr_renamed_1205.cfr_renamed_5078(sprlem2) || sprhl.cfr_renamed_2415.cfr_renamed_5078(sprlem2) || sprdl.cfr_renamed_1456.cfr_renamed_5078(sprlem2) || sprdl.cfr_renamed_3250.cfr_renamed_5078(sprlem2)) {
            sprfvm sprfvm2;
            try {
                sprfvm2 = sprfvm.cfr_renamed_23(arg0.cfr_renamed_1227());
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(sprjqc.cfr_renamed_9("R\u0003F\u000fK\b\u0007\u0019HMW\fU\u001eBMu>fML\b^"));
            }
            if ((sprfvm2.cfr_renamed_2296().intValue() & 1) == 0) {
                throw new IllegalArgumentException(sprnjp.cfr_renamed_9("\u0002|\u0011\u000f Z2C9L\u0015W @>J>[pF#\u000f5Y5A"));
            }
            if (!cfr_renamed_1.cfr_renamed_7261(sprfvm2.cfr_renamed_2295())) {
                sprvlg.cfr_renamed_7256(sprfvm2.cfr_renamed_2295());
                cfr_renamed_1.cfr_renamed_1859(sprfvm2.cfr_renamed_2295());
            }
        }
    }

    static {
        cfr_renamed_3 = new sprzog(null);
        cfr_renamed_1 = new sprzog(null);
        cfr_renamed_2 = new BigInteger(sprjqc.cfr_renamed_9("\u001f\\\u0014UBUF]A\u000eA^FYBU\u0013\f\u0010Z\u0016\t\u0013]A\t\u0014]\u0012\t\u0010\u000b\u0013\fFX\u001e^\u0017[CZ\u0015X\u0016\tBX\u0013\t\u001eUF\u000b\u001f\u000bBT\u0012Z\u0015TF\\AZ\u0014\t\u001fT\u0014\u000bFY\u0015YD\t\u0015\bC\u000e\u001f[\u0014[F[D^\u0015U\u0012\b\u0017_\u0015\u000f\u0017\b\u0014U\u0011[FX\u0011XF\b\u001f\\\u0017UB\bCU\u0012T\u0016\u000eCYA\b\u001f\t\u0015\u000eBU\u0011\\\u0011XFT\u0010UCZ\u0016TB\u000fA[\u0013ZA^\u0011_C^\u0014\u000bD\f\u0015TD\t\u0016Z\u001e\u000bEY\u0015Y\u0017\\D\u000fF\u000b\u0014\tA]D[\u0016Y\u0017X\u0011\u000b\u001e\u000e\u001f\u000b\u0014\u000eA\t\u0012\\BY\u0010YF\u000bE[E\u000e\u0011T\u0010YAZ\u001f\tEUF\u000fFUBTBX\u0016ZA\tB\t\u0011X\u001fX\u001e\\F\u000f\u0010X\u0017_E\t\u0013\\\u001fY\u001eY\u0011_A"), 16);
        cfr_renamed_4 = BigInteger.valueOf(1L);
    }
}

