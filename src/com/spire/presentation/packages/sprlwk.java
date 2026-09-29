/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdcka;
import com.spire.presentation.packages.sprdmo;
import com.spire.presentation.packages.sprdvh;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprkhk;
import com.spire.presentation.packages.sprkik;
import com.spire.presentation.packages.sprrkl;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprwoh;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprzlk;
import java.math.BigInteger;

public class sprlwk
implements sprii {
    private static final BigInteger cfr_renamed_3 = BigInteger.valueOf(1L);
    private sprzlk cfr_renamed_4;

    @Override
    public void cfr_renamed_5536(sprgye arg0) {
        this.cfr_renamed_4 = (sprzlk)arg0;
        sprybl.cfr_renamed_9170(new sprfdl(sprdcka.cfr_renamed_9("\u001bu\bm,_\u000eC'"), sprrkl.cfr_renamed_10167(arg0.cfr_renamed_3483()), null, spriil.cfr_renamed_91));
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

    public boolean cfr_renamed_10168(BigInteger arg0) {
        BigInteger bigInteger = arg0;
        int n = sprlwk.cfr_renamed_7259(bigInteger.bitLength(), this.cfr_renamed_4.cfr_renamed_3341());
        return !sprwoh.cfr_renamed_7262(bigInteger) && sprwoh.cfr_renamed_7263(arg0, this.cfr_renamed_4.cfr_renamed_1295(), n);
    }

    @Override
    public sprsil cfr_renamed_1223() {
        sprsil sprsil2 = null;
        boolean bl = false;
        int n = this.cfr_renamed_4.cfr_renamed_3483();
        int n2 = (n + 1) / 2;
        int n3 = n - n2;
        int n4 = n / 2 - 100;
        if (n4 < n / 3) {
            n4 = n / 3;
        }
        int n5 = n >> 2;
        BigInteger bigInteger = BigInteger.valueOf(2L).pow(n / 2);
        BigInteger bigInteger2 = cfr_renamed_3.shiftLeft(n - 1);
        BigInteger bigInteger3 = cfr_renamed_3.shiftLeft(n4);
        boolean bl2 = bl;
        while (!bl2) {
            BigInteger bigInteger4;
            BigInteger bigInteger5;
            BigInteger bigInteger6;
            sprlwk sprlwk2 = this;
            BigInteger bigInteger7 = sprlwk2.cfr_renamed_4.cfr_renamed_2296();
            BigInteger bigInteger8 = sprlwk2.cfr_renamed_10169(n2, bigInteger7, bigInteger2);
            block1: while (true) {
                sprlwk sprlwk3 = this;
                while (true) {
                    if ((bigInteger6 = (bigInteger5 = sprlwk3.cfr_renamed_10169(n3, bigInteger7, bigInteger2)).subtract(bigInteger8).abs()).bitLength() < n4) continue block1;
                    if (bigInteger6.compareTo(bigInteger3) <= 0) {
                        sprlwk3 = this;
                        continue;
                    }
                    bigInteger4 = bigInteger8.multiply(bigInteger5);
                    if (bigInteger4.bitLength() != n) {
                        bigInteger8 = bigInteger8.max(bigInteger5);
                        sprlwk3 = this;
                        continue;
                    }
                    if (sprdvh.cfr_renamed_1794(bigInteger4) >= n5) break block1;
                    sprlwk sprlwk4 = this;
                    sprlwk3 = sprlwk4;
                    bigInteger8 = sprlwk4.cfr_renamed_10169(n2, bigInteger7, bigInteger2);
                }
                break;
            }
            if (bigInteger8.compareTo(bigInteger5) < 0) {
                BigInteger bigInteger9 = bigInteger8;
                bigInteger8 = bigInteger5;
                bigInteger5 = bigInteger9;
            }
            BigInteger bigInteger10 = bigInteger8.subtract(cfr_renamed_3);
            BigInteger bigInteger11 = bigInteger5.subtract(cfr_renamed_3);
            BigInteger bigInteger12 = bigInteger10;
            BigInteger bigInteger13 = bigInteger12.divide(bigInteger12.gcd(bigInteger11)).multiply(bigInteger11);
            BigInteger bigInteger14 = bigInteger7.modInverse(bigInteger13);
            if (bigInteger14.compareTo(bigInteger) <= 0) {
                bl2 = bl;
                continue;
            }
            bl = true;
            BigInteger bigInteger15 = bigInteger14;
            bigInteger6 = bigInteger15.remainder(bigInteger10);
            BigInteger bigInteger16 = bigInteger15.remainder(bigInteger11);
            BigInteger bigInteger17 = sprhdf.cfr_renamed_5234(bigInteger8, bigInteger5);
            sprsil2 = new sprsil(new sprkik(false, bigInteger4, bigInteger7, true), new sprkhk(bigInteger4, bigInteger7, bigInteger14, bigInteger8, bigInteger5, bigInteger6, bigInteger16, bigInteger17, true));
            bl2 = bl;
        }
        return sprsil2;
    }

    public BigInteger cfr_renamed_10169(int arg0, BigInteger arg1, BigInteger arg2) {
        int n;
        int n2 = n = 0;
        while (n2 != 5 * arg0) {
            BigInteger bigInteger = sprhdf.cfr_renamed_5236(arg0, 1, this.cfr_renamed_4.cfr_renamed_1295());
            if (!bigInteger.mod(arg1).equals(cfr_renamed_3)) {
                BigInteger bigInteger2 = bigInteger;
                if (bigInteger2.multiply(bigInteger2).compareTo(arg2) >= 0 && this.cfr_renamed_10168(bigInteger) && arg1.gcd(bigInteger.subtract(cfr_renamed_3)).equals(cfr_renamed_3)) {
                    return bigInteger;
                }
            }
            n2 = ++n;
        }
        throw new IllegalStateException(sprdmo.cfr_renamed_9("H\u0019\\\u0015Q\u0012\u001d\u0003RWZ\u0012S\u0012O\u0016I\u0012\u001d\u0007O\u001eP\u0012\u001d\u0019H\u001a_\u0012OW[\u0018OWo$|WV\u0012D"));
    }
}

