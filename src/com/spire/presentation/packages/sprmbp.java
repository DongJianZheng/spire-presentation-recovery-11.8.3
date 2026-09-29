/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgep;
import com.spire.presentation.packages.sprgmp;
import com.spire.presentation.packages.sprlzy;
import com.spire.presentation.packages.sproup;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtjp;
import com.spire.presentation.packages.sprugp;
import com.spire.presentation.packages.spryqo;

@sprtea
public class sprmbp {
    private static final int cfr_renamed_152 = 1;
    private static final int cfr_renamed_112 = 512;
    private static final int cfr_renamed_119 = 3;
    private static final int cfr_renamed_91 = 3;
    private static final int cfr_renamed_0 = 2;
    private static final int cfr_renamed_1 = 7;
    private static final int cfr_renamed_2 = 3;
    private static final int cfr_renamed_3 = 2;
    private static final int cfr_renamed_4 = 16;

    private static /* synthetic */ sprgmp cfr_renamed_19109(sprugp arg0, int arg1) {
        sprugp sprugp2 = arg0;
        sprgmp sprgmp2 = sprmbp.cfr_renamed_19110(sprugp2, arg1);
        int n = arg1;
        sprugp2.cfr_renamed_19102(arg1);
        ++arg1;
        if (sprgmp2.cfr_renamed_19111() > 0) {
            sprgmp sprgmp3;
            sprugp sprugp3 = arg0;
            sprgmp sprgmp4 = sprmbp.cfr_renamed_19110(sprugp3, arg1);
            int n2 = sprugp3.cfr_renamed_19107(n) & 0xFF;
            int n3 = sprugp3.cfr_renamed_19112().cfr_renamed_19113(n2);
            if (sprgmp4.cfr_renamed_19111() >= sprgmp2.cfr_renamed_19111() && sprgmp2.cfr_renamed_19114() > (sprgmp4.cfr_renamed_19114() * sprgmp4.cfr_renamed_806() + n3) / (sprgmp4.cfr_renamed_806() + 1)) {
                sprgmp sprgmp5 = sprgmp2;
                sprgmp3 = sprgmp5;
                sprgmp5.cfr_renamed_13011(0);
            } else {
                sprgmp sprgmp6;
                if (sprgmp2.cfr_renamed_806() > 3 && (sprgmp4 = sprmbp.cfr_renamed_19110(arg0, n + sprgmp2.cfr_renamed_806())).cfr_renamed_806() >= 2 && (sprgmp6 = sprmbp.cfr_renamed_19110(arg0, n + sprgmp2.cfr_renamed_806() - 1)).cfr_renamed_806() > sprgmp4.cfr_renamed_806() && sprgmp6.cfr_renamed_19114() < sprgmp4.cfr_renamed_19114()) {
                    int n4 = sprmbp.cfr_renamed_19115(sprgmp2.cfr_renamed_19116() + 1);
                    sprgmp sprgmp7 = sprgmp2;
                    int n5 = sprmbp.cfr_renamed_19117(arg0, sprgmp2.cfr_renamed_806() - 1, sprgmp2.cfr_renamed_19116() + 1, n4);
                    int n6 = sprmbp.cfr_renamed_19118(arg0, sprgmp7.cfr_renamed_19116() + 1, n4);
                    int n7 = n5 + n6;
                    int n8 = sprgmp7.cfr_renamed_19114() * sprgmp2.cfr_renamed_806();
                    if ((n8 += sprgmp4.cfr_renamed_19114() * sprgmp4.cfr_renamed_806()) / (sprgmp2.cfr_renamed_806() + sprgmp4.cfr_renamed_806()) > (n7 += sprgmp6.cfr_renamed_19114() * sprgmp6.cfr_renamed_806()) / (sprgmp2.cfr_renamed_806() - 1 + sprgmp6.cfr_renamed_806())) {
                        sprgmp sprgmp8 = sprgmp2;
                        sprgmp8.cfr_renamed_13011(sprgmp8.cfr_renamed_806() - 1);
                        sprgmp8.cfr_renamed_19119(sprgmp8.cfr_renamed_19116() + 1);
                    }
                }
                sprgmp3 = sprgmp2;
            }
            if (sprgmp3.cfr_renamed_806() == 2) {
                if (n >= 2 && arg0.cfr_renamed_19107(n) == arg0.cfr_renamed_19107(n - 2)) {
                    int n9 = arg0.cfr_renamed_19112().cfr_renamed_19113(arg0.cfr_renamed_19120());
                    if (sprgmp2.cfr_renamed_19114() * 2 > n9 + arg0.cfr_renamed_19112().cfr_renamed_19113(arg0.cfr_renamed_19107(n + 1) & 0xFF)) {
                        sprgmp sprgmp9 = sprgmp2;
                        sprgmp9.cfr_renamed_13011(0);
                        return sprgmp9;
                    }
                } else if (n >= 1 && n + 1 < arg0.cfr_renamed_5797() && arg0.cfr_renamed_19107(n + 1) == arg0.cfr_renamed_19107(n - 1)) {
                    int n10 = arg0.cfr_renamed_19112().cfr_renamed_19113(arg0.cfr_renamed_19120());
                    if (sprgmp2.cfr_renamed_19114() * 2 > n3 + n10) {
                        sprgmp2.cfr_renamed_13011(0);
                    }
                }
            }
        }
        return sprgmp2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static /* synthetic */ byte[] cfr_renamed_19121(byte[] arg0, boolean arg1) {
        sprpdja sprpdja2 = new sprpdja();
        try {
            spryqo spryqo2;
            spryqo spryqo3 = spryqo2 = new spryqo(sprpdja2, true);
            spryqo3.cfr_renamed_14916(arg1);
            spryqo3.cfr_renamed_17435(arg0.length, 24);
            sprugp sprugp2 = new sprugp(arg0, spryqo2);
            int n = sprugp2.cfr_renamed_19101().length;
            while (n < sprugp2.cfr_renamed_5797()) {
                int n2;
                int n3 = n;
                sprgmp sprgmp2 = sprmbp.cfr_renamed_19109(sprugp2, n);
                ++n;
                if (sprgmp2.cfr_renamed_806() > 0) {
                    int n4;
                    n2 = sprmbp.cfr_renamed_19115(sprgmp2.cfr_renamed_19116());
                    sprugp sprugp3 = sprugp2;
                    sprmbp.cfr_renamed_19122(sprugp3, sprgmp2.cfr_renamed_806(), sprgmp2.cfr_renamed_19116(), n2);
                    sprmbp.cfr_renamed_19123(sprugp3, sprgmp2.cfr_renamed_19116(), n2);
                    int n5 = n4 = 1;
                    while (n5 < sprgmp2.cfr_renamed_806()) {
                        sprugp2.cfr_renamed_19102(n);
                        n5 = ++n4;
                        ++n;
                    }
                    continue;
                }
                n2 = sprugp2.cfr_renamed_19107(n3);
                if (n3 >= 2 && n2 == sprugp2.cfr_renamed_19107(n3 - 2)) {
                    sprugp2.cfr_renamed_19112().cfr_renamed_19124(sprugp2.cfr_renamed_19120());
                    continue;
                }
                if (n3 >= 4 && n2 == sprugp2.cfr_renamed_19107(n3 - 4)) {
                    sprugp2.cfr_renamed_19112().cfr_renamed_19124(sprugp2.cfr_renamed_19125());
                    continue;
                }
                if (n3 >= 6 && n2 == sprugp2.cfr_renamed_19107(n3 - 6)) {
                    sprugp2.cfr_renamed_19112().cfr_renamed_19124(sprugp2.cfr_renamed_19126());
                    continue;
                }
                sprugp2.cfr_renamed_19112().cfr_renamed_19124(n2 & 0xFF);
            }
            spryqo2.cfr_renamed_2947();
            byte[] byArray = sprpdja2.cfr_renamed_4529();
            return byArray;
        }
        finally {
            if (sprpdja2 != null) {
                sprpdja2.cfr_renamed_2637();
            }
        }
    }

    private static /* synthetic */ void cfr_renamed_19123(sprugp arg0, int arg1, int arg2) {
        int n;
        int n2 = arg1 - 1;
        int n3 = n = (arg2 - 1) * 3;
        while (n3 >= 0) {
            int n4 = n2 >> n & 7;
            arg0.cfr_renamed_19127().cfr_renamed_19124(n4);
            n3 = n -= 3;
        }
    }

    private static /* synthetic */ int cfr_renamed_19117(sprugp arg0, int arg1, int arg2, int arg3) {
        int n;
        int n2;
        int n3 = arg1 - (arg2 >= 512 ? 3 : 2);
        int n4 = sproup.cfr_renamed_19128(n3);
        int n5 = n2 = 2;
        while (n5 < n4) {
            n5 = n2 += 2;
        }
        int n6 = 1 << n2 - 1;
        int n7 = n = n4 > 2 ? 2 : 0;
        if ((n3 & n6) != 0) {
            n |= 1;
        }
        n <<= 1;
        if ((n3 & (n6 >>= 1)) != 0) {
            n |= 1;
        }
        n6 >>= 1;
        int n8 = arg0.cfr_renamed_19112().cfr_renamed_19113(256 + n + (arg3 - 1) * 8);
        int n9 = n2 = n4 - 2;
        while (n9 >= 1) {
            int n10 = n = n2 > 2 ? 2 : 0;
            if ((n3 & n6) != 0) {
                n |= 1;
            }
            n <<= 1;
            if ((n3 & (n6 >>= 1)) != 0) {
                n |= 1;
            }
            n6 >>= 1;
            n8 += arg0.cfr_renamed_19129().cfr_renamed_19113(n);
            n9 = n2 -= 2;
        }
        return n8;
    }

    private static /* synthetic */ sprgmp cfr_renamed_19110(sprugp arg0, int arg1) {
        int n = 32;
        int[] nArray = new int[32 + 1];
        sprgmp sprgmp2 = new sprgmp(null);
        int n2 = 0;
        int n3 = arg0.cfr_renamed_5797() - arg1;
        int n4 = 0;
        if (n3 > 1) {
            sprugp sprugp2 = arg0;
            int n5 = sprugp2.cfr_renamed_19106(arg1);
            sprgep sprgep2 = null;
            sprgep sprgep3 = (sprgep)sprugp2.cfr_renamed_19104().cfr_renamed_576(n5);
            block0: while (true) {
                sprgep sprgep4 = sprgep3;
                while (sprgep4 != null) {
                    int n6;
                    int n7;
                    int n8;
                    int n9;
                    int n10 = sprgep3.cfr_renamed_320();
                    int n11 = arg1 - n10;
                    if (++n2 > 16 || n11 > Integer.MAX_VALUE) {
                        arg0.cfr_renamed_19103(n5, sprgep2, sprgep3);
                        return sprgmp2;
                    }
                    sprgep2 = sprgep3;
                    sprgep3 = sprgep2.cfr_renamed_12446();
                    int n12 = sprrgga.cfr_renamed_12461(n3, arg1 - n10);
                    if (n12 < 2) {
                        sprgep4 = sprgep3;
                        continue;
                    }
                    int n13 = arg0.cfr_renamed_19108(n10 + 2, arg1 + 2, n12 - 2) + 2;
                    if ((long)(n11 = n11 - n13 + 1) > arg0.cfr_renamed_19130()) {
                        sprgep4 = sprgep3;
                        continue;
                    }
                    if (n13 == 2 && n11 >= 512) {
                        sprgep4 = sprgep3;
                        continue;
                    }
                    if (n13 <= sprgmp2.cfr_renamed_806() && n11 > sprgmp2.cfr_renamed_19116()) {
                        if (n13 <= sprgmp2.cfr_renamed_806() - 2) {
                            sprgep4 = sprgep3;
                            continue;
                        }
                        if (n11 > sprgmp2.cfr_renamed_19116() << 3) {
                            if (n13 < sprgmp2.cfr_renamed_806()) {
                                sprgep4 = sprgep3;
                                continue;
                            }
                            if (n11 > sprgmp2.cfr_renamed_19116() << 4) {
                                sprgep4 = sprgep3;
                                continue;
                            }
                        }
                    }
                    if (n13 > n4) {
                        n9 = n13 > n ? n : n13;
                        int n14 = n4;
                        while (n14 < n9) {
                            n7 = arg0.cfr_renamed_19112().cfr_renamed_19113(arg0.cfr_renamed_19107(arg1 + n8) & 0xFF);
                            nArray[++n8 + 1] = nArray[n8] + n7;
                            n14 = n8;
                        }
                        n4 = n9;
                        if (n13 > n) {
                            n7 = nArray[n];
                            n7 += n7 / n * (n13 - n);
                        } else {
                            n7 = nArray[n13];
                        }
                    } else {
                        n7 = nArray[n13];
                    }
                    if (n7 <= sprgmp2.cfr_renamed_19111() || n7 - (n8 = sprmbp.cfr_renamed_19117(arg0, n13, n11, n9 = sprmbp.cfr_renamed_19115(n11))) - (n9 << 16) <= sprgmp2.cfr_renamed_19111() || (n6 = n7 - (n8 += sprmbp.cfr_renamed_19118(arg0, n11, n9))) <= sprgmp2.cfr_renamed_19111()) continue block0;
                    sprgmp sprgmp3 = sprgmp2;
                    sprgmp sprgmp4 = sprgmp2;
                    sprgmp4.cfr_renamed_19131(n6);
                    sprgmp4.cfr_renamed_13011(n13);
                    sprgmp3.cfr_renamed_19119(n11);
                    sprgmp3.cfr_renamed_19132(n8);
                    continue block0;
                }
                break;
            }
        }
        return sprgmp2;
    }

    private static /* synthetic */ int cfr_renamed_19118(sprugp arg0, int arg1, int arg2) {
        int n;
        int n2 = arg1 - 1;
        int n3 = (arg2 - 1) * 3;
        int n4 = 0;
        int n5 = n = n3;
        while (n5 >= 0) {
            int n6 = n2 >> n & 7;
            n4 += arg0.cfr_renamed_19127().cfr_renamed_19113(n6);
            n5 = n -= 3;
        }
        return n4;
    }

    private static /* synthetic */ int cfr_renamed_19115(int arg0) {
        return (sproup.cfr_renamed_19128(arg0 - 1) + 3 - 1) / 3;
    }

    @sprtea
    public static byte[] cfr_renamed_19094(byte[] arg0) {
        if (arg0 == null || arg0.length == 0) {
            return new byte[4];
        }
        if (((long)arg0.length & 0xFF000000L) != 0L) {
            throw new IllegalArgumentException(sprlzy.cfr_renamed_9("j\u0004H\u0004W\u0000N\u0000HET\u0004W\u0000\u0000E^\u0004N\u0004"));
        }
        byte[] byArray = sprtjp.cfr_renamed_485(arg0);
        boolean bl = byArray.length < arg0.length * 3 / 4;
        byte[] byArray2 = bl ? byArray : arg0;
        return sprmbp.cfr_renamed_19121(byArray2, bl);
    }

    private static /* synthetic */ void cfr_renamed_19122(sprugp arg0, int arg1, int arg2, int arg3) {
        int n;
        int n2;
        int n3 = arg1 - (arg2 >= 512 ? 3 : 2);
        int n4 = sproup.cfr_renamed_19128(n3);
        int n5 = n2 = 2;
        while (n5 < n4) {
            n5 = n2 += 2;
        }
        int n6 = 1 << n2 - 1;
        int n7 = n = n4 > 2 ? 2 : 0;
        if ((n3 & n6) != 0) {
            n |= 1;
        }
        n <<= 1;
        if ((n3 & (n6 >>= 1)) != 0) {
            n |= 1;
        }
        n6 >>= 1;
        arg0.cfr_renamed_19112().cfr_renamed_19124(256 + n + (arg3 - 1) * 8);
        int n8 = n2 = n4 - 2;
        while (n8 >= 1) {
            int n9 = n = n2 > 2 ? 2 : 0;
            if ((n3 & n6) != 0) {
                n |= 1;
            }
            n <<= 1;
            if ((n3 & (n6 >>= 1)) != 0) {
                n |= 1;
            }
            n6 >>= 1;
            n8 = n2 -= 2;
            arg0.cfr_renamed_19129().cfr_renamed_19124(n);
        }
    }
}

