/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprloia;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtzja;

@sprtea
public class sprhqn {
    @sprtea
    public static byte[] cfr_renamed_12919(byte[] arg0) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        byte by = arg0[0];
        int n7 = arg0[1];
        int n8 = arg0[2];
        byte by2 = (byte)(by & 0xFF ^ n7 & 0xFF);
        int n9 = by & 0xFF ^ n8 & 0xFF;
        int n10 = n8;
        int n11 = n7;
        int n12 = (by & 0xFF & 6) / 2;
        byte[] byArray = new byte[n12];
        int n13 = 0;
        int n14 = n6 = 3;
        while (n14 < n12 + 3) {
            byte by3 = arg0[n6];
            byArray[n13] = by3;
            ++n13;
            n14 = ++n6;
        }
        byte[] byArray2 = byArray;
        n6 = byArray.length;
        int n15 = n5 = 0;
        while (n15 < n6) {
            int n16 = byArray2[n5];
            n4 = n16 & 0xFF ^ (n11 & 0xFF) + (n9 & 0xFF);
            n11 = n10;
            n10 = n16;
            n9 = n4;
            n15 = ++n5;
        }
        byArray2 = new byte[4];
        n6 = 0;
        int n17 = n5 = n12 + 3;
        while (n17 < n12 + 7) {
            byte by4 = arg0[n5];
            byArray2[n6] = by4;
            ++n6;
            n17 = ++n5;
        }
        n6 = 0;
        n5 = 0;
        byte[] byArray3 = byArray2;
        n4 = byArray2.length;
        int n18 = n3 = 0;
        while (n18 < n4) {
            n2 = byArray3[n3];
            n = n2 & 0xFF ^ (n11 & 0xFF) + (n9 & 0xFF);
            double d = Math.pow(256.0, n6);
            n5 += (int)(d *= (double)(n & 0xFF));
            n11 = n10;
            n10 = n2;
            n9 = n;
            n6 = (byte)(n6 + 1);
            n18 = ++n3;
        }
        byArray3 = new byte[arg0.length - (n12 + 7)];
        n4 = 0;
        int n19 = n3 = n12 + 7;
        while (n19 < arg0.length) {
            byte by5 = arg0[n3];
            byArray3[n4] = by5;
            ++n4;
            n19 = ++n3;
        }
        sprpdja sprpdja2 = new sprpdja();
        byte[] byArray4 = byArray3;
        n2 = byArray3.length;
        int n20 = n = 0;
        while (n20 < n2) {
            int n21 = byArray4[n];
            byte by6 = (byte)(n21 & 0xFF ^ (n11 & 0xFF) + (n9 & 0xFF));
            sprpdja2.cfr_renamed_11594(by6);
            n11 = n10;
            n10 = n21;
            n9 = by6;
            n20 = ++n;
        }
        return sprpdja2.cfr_renamed_4529();
    }

    @sprtea
    public static spreen cfr_renamed_12804(spreen spreen2) throws Exception {
        spreen arg0;
        spreen spreen3 = spreen2;
        byte[] byArray = new byte[(int)spreen3.cfr_renamed_806()];
        spreen3.cfr_renamed_11548(0L);
        spreen spreen4 = arg0;
        spreen4.cfr_renamed_11556(byArray, 0, (int)spreen4.cfr_renamed_806());
        sprpdja sprpdja2 = new sprpdja(4096);
        int n = byArray.length;
        int n2 = 0;
        long l = sprpdja2.cfr_renamed_3274();
        int n3 = 0;
        int n4 = 0;
        if (byArray[0] == 1) {
            ++n2;
            while (n2 < n) {
                n3 = n2;
                int n5 = sprtzja.cfr_renamed_12169(byArray, n3) & 0xFFFF;
                int n6 = (n5 & 0xFFF) + 3;
                int n7 = (n5 & 0x8000) >> 15;
                n4 = (int)l;
                int n8 = Math.min(n, n3 + n6);
                n2 = n3 + 2;
                if (n7 == 1) {
                    while (n2 < n8) {
                        int n9;
                        byte by = byArray[n2++];
                        if (n2 >= n8) continue;
                        int n10 = n9 = 0;
                        while (n10 <= 7) {
                            if (n2 < n8) {
                                if (((by & 0xFF) >> n9 & 1) == 0) {
                                    sprpdja sprpdja3 = sprpdja2;
                                    sprpdja3.cfr_renamed_11548(l);
                                    sprpdja3.cfr_renamed_11594(byArray[n2]);
                                    ++n2;
                                    ++l;
                                } else {
                                    int n11;
                                    int n12 = sprtzja.cfr_renamed_12169(byArray, n2) & 0xFFFF;
                                    double d = sprrgga.cfr_renamed_12920((int)l - n4, 2.0);
                                    int n13 = (int)(d % 1.0 == 0.0 ? d : (double)((int)(Math.floor(d) + 1.0) & 0xFFFF));
                                    n13 = Math.max(n13, 4) & 0xFFFF;
                                    int n14 = 65535 >> (n13 & 0xFFFF);
                                    int n15 = ~(n14 & 0xFFFF);
                                    int n16 = (n14 & 0xFFFF) + 3;
                                    int n17 = (n12 & (n14 & 0xFFFF)) + 3;
                                    int n18 = ((n12 & (n15 & 0xFFFF)) >> 16 - (n13 & 0xFFFF)) + 1;
                                    int n19 = (int)l - (n18 & 0xFFFF);
                                    int n20 = (int)l;
                                    int n21 = n11 = 1;
                                    while (n21 <= (n17 & 0xFFFF)) {
                                        sprpdja sprpdja4 = sprpdja2;
                                        sprpdja4.cfr_renamed_11548(n20);
                                        ++n20;
                                        sprpdja4.cfr_renamed_11594(sprpdja4.cfr_renamed_4529()[n19]);
                                        ++n19;
                                        n21 = ++n11;
                                    }
                                    n2 += 2;
                                    l += (long)(n17 & 0xFFFF);
                                }
                            }
                            n10 = ++n9;
                        }
                    }
                    continue;
                }
                sprpdja sprpdja5 = new sprpdja(4096);
                sprpdja5.cfr_renamed_4924(byArray, 0, byArray.length);
                sprpdja5.cfr_renamed_12171(sprpdja2);
                n2 += 4096;
                l += 4096L;
            }
        } else {
            throw new Exception(sprloia.cfr_renamed_9("T?u.f&'\"tkd$u9r;s.c"));
        }
        return sprpdja2;
    }

    @sprtea
    public static spreen cfr_renamed_12825(spreen spreen2) {
        spreen arg0;
        spreen spreen3 = spreen2;
        byte[] byArray = new byte[(int)spreen3.cfr_renamed_806()];
        spreen3.cfr_renamed_11548(0L);
        spreen spreen4 = arg0;
        spreen4.cfr_renamed_11556(byArray, 0, (int)spreen4.cfr_renamed_806());
        sprpdja sprpdja2 = new sprpdja();
        int n = 0;
        int n2 = (int)arg0.cfr_renamed_806();
        int n3 = 0;
        int n4 = 0;
        ++n3;
        int n5 = 0;
        sprpdja2.cfr_renamed_11594((byte)1);
        int n6 = n;
        while (n6 < n2) {
            int n7;
            int n8;
            int n9;
            byte by;
            int n10;
            n4 = n3;
            n5 = n;
            int n11 = n4 + 4098;
            n3 = n4 + 2;
            int n12 = Math.min(n5 + 4096, n2);
            int n13 = n;
            while (n13 < n12 && n3 < n11) {
                n10 = n3++;
                by = 0;
                int n14 = n9 = 0;
                while (n14 <= 7) {
                    if (n < n12 && n3 < n11) {
                        int n15;
                        int n16;
                        int n17;
                        int n18;
                        int n19;
                        double d;
                        int n20;
                        n8 = 0;
                        int n21 = n - 1;
                        int n22 = 0;
                        int n23 = 0;
                        int n24 = n21;
                        while (n24 >= n5) {
                            n20 = n21;
                            int n25 = n;
                            int n26 = 0;
                            int n27 = n25;
                            while (n27 < n12 && byArray[n20] == byArray[n25]) {
                                ++n20;
                                n27 = ++n25;
                                ++n26;
                            }
                            if (n26 > n22) {
                                n22 = n26;
                                n23 = n21;
                            }
                            n24 = --n21;
                        }
                        n20 = 0;
                        if (n22 >= 3) {
                            double d2 = n - n5;
                            d = sprrgga.cfr_renamed_12920(d2, 2.0);
                            n19 = (int)(d % 1.0 == 0.0 ? d : (double)((int)(Math.floor(d) + 1.0) & 0xFFFF));
                            n19 = Math.max(n19, 4) & 0xFFFF;
                            n18 = 65535 >> (n19 & 0xFFFF);
                            n17 = ~(n18 & 0xFFFF);
                            n16 = (n18 & 0xFFFF) + 3;
                            n20 = Math.min(n22, n16 & 0xFFFF);
                            n15 = n8 = n - n23;
                        } else {
                            n20 = 0;
                            n15 = n8 = 0;
                        }
                        if ((n15 & 0xFFFF) != 0) {
                            if (n3 + 1 < n11) {
                                double d3 = n - n5;
                                d = sprrgga.cfr_renamed_12920(d3, 2.0);
                                n19 = (int)(d % 1.0 == 0.0 ? d : (double)((int)(Math.floor(d) + 1.0) & 0xFFFF));
                                n19 = Math.max(n19, 4) & 0xFFFF;
                                n18 = 65535 >> (n19 & 0xFFFF);
                                n17 = ~(n18 & 0xFFFF);
                                n16 = (n18 & 0xFFFF) + 3;
                                byte[] byArray2 = sprtzja.cfr_renamed_11602(((n8 & 0xFFFF) - 1 & 0xFFFF) << (16 - (n19 & 0xFFFF) & 0xFFFF) | (n20 & 0xFFFF) - 3 & 0xFFFF);
                                sprpdja sprpdja3 = sprpdja2;
                                sprpdja3.cfr_renamed_11548(n3);
                                sprpdja3.cfr_renamed_4924(byArray2, 0, 2);
                                n3 += 2;
                                by = (byte)(by & 0xFF & ~(1 << n9) | 1 << n9);
                                n += n20 & 0xFFFF;
                            } else {
                                n3 = n11;
                            }
                        } else if (n3 < n11) {
                            sprpdja sprpdja4 = sprpdja2;
                            sprpdja4.cfr_renamed_11548(n3);
                            ++n3;
                            sprpdja4.cfr_renamed_11594(byArray[n]);
                            ++n;
                        } else {
                            n3 = n11;
                        }
                    }
                    n14 = ++n9;
                }
                sprpdja2.cfr_renamed_11548(n10);
                sprpdja2.cfr_renamed_11594(by);
                n13 = n;
            }
            n10 = 0;
            if (n < n12) {
                by = n12 - 1;
                n3 = n4 + 2;
                n = n5;
                n9 = 4096;
                int n28 = n8 = n5;
                while (n28 <= by) {
                    sprpdja sprpdja5 = sprpdja2;
                    sprpdja5.cfr_renamed_11548(n3);
                    ++n3;
                    --n9;
                    sprpdja5.cfr_renamed_11594(byArray[n8]);
                    ++n;
                    n28 = ++n8;
                }
                int n29 = n8 = 1;
                while (n29 <= n9) {
                    sprpdja sprpdja6 = sprpdja2;
                    sprpdja6.cfr_renamed_11548(n3++);
                    sprpdja6.cfr_renamed_11594((byte)0);
                    n29 = ++n8;
                }
                n10 = 0;
                n7 = n3;
            } else {
                n10 = 1;
                n7 = n3;
            }
            by = n7 - n4;
            n9 = 0;
            n9 = 0 & 0xFFFF & 0xF000 | by - 3;
            n9 = n9 & 0xFFFF & Short.MAX_VALUE | n10 << 15;
            n9 = n9 & 0xFFFF & 0x8FFF | 0x3000;
            sprpdja sprpdja7 = sprpdja2;
            sprpdja7.cfr_renamed_11548(n4);
            byte[] byArray3 = sprtzja.cfr_renamed_11602(n9);
            sprpdja7.cfr_renamed_4924(byArray3, 0, byArray3.length);
            n6 = n;
            sprpdja2.cfr_renamed_11548(n3);
        }
        return sprpdja2;
    }

    @sprtea
    public static byte[] cfr_renamed_12921(byte[] arg0, String arg1) {
        sprpdja sprpdja2;
        byte by;
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6 = 2;
        int n7 = arg0.length;
        byte by2 = 3;
        byte by3 = 3 & 0xFF ^ n6 & 0xFF;
        int n8 = 0;
        int n9 = n5 = 0;
        while (n9 < arg1.length()) {
            n4 = arg1.charAt(n5);
            n8 = (byte)((n8 & 0xFF) + ((byte)n4 & 0xFF));
            n9 = ++n5;
        }
        byte by4 = (byte)(by2 & 0xFF ^ n8 & 0xFF);
        n5 = n8;
        n4 = by4;
        int n10 = by3;
        int n11 = (by2 & 0xFF & 6) / 2;
        byte[] byArray = new byte[n11];
        int n12 = n3 = 1;
        while (n12 <= n11) {
            int n13 = 1;
            byArray[n3 - 1] = n2 = (int)((byte)(1 & 0xFF ^ (n10 & 0xFF) + (n5 & 0xFF)));
            n10 = n4;
            n4 = n2;
            n5 = n13;
            n12 = ++n3;
        }
        byte[] byArray2 = sprtzja.cfr_renamed_11602(n7);
        byte[] byArray3 = new byte[4];
        n2 = 3;
        int n14 = 0;
        int n13 = n2;
        while (n13 >= 0) {
            n = byArray2[n2];
            byArray3[n14] = by = (byte)(n & 0xFF ^ (n10 & 0xFF) + (n5 & 0xFF));
            n10 = n4;
            n4 = by;
            n5 = n;
            ++n14;
            n13 = --n2;
        }
        sprpdja sprpdja3 = new sprpdja();
        int n15 = n14 = 0;
        while (n15 < arg0.length) {
            n = arg0[n14];
            by = (byte)(n & 0xFF ^ (n10 & 0xFF) + (n5 & 0xFF));
            sprpdja3.cfr_renamed_11594(by);
            n10 = n4;
            n4 = by;
            n5 = n;
            n15 = ++n14;
        }
        byte[] byArray4 = sprpdja3.cfr_renamed_4529();
        sprpdja sprpdja4 = sprpdja2 = new sprpdja();
        sprpdja sprpdja5 = sprpdja2;
        sprpdja5.cfr_renamed_11594(by2);
        sprpdja5.cfr_renamed_11594(by3);
        sprpdja4.cfr_renamed_11594(by4);
        sprpdja4.cfr_renamed_4924(byArray, 0, byArray.length);
        sprpdja sprpdja6 = sprpdja2;
        sprpdja6.cfr_renamed_4924(byArray3, 0, 4);
        sprpdja6.cfr_renamed_4924(byArray4, 0, byArray4.length);
        return sprpdja2.cfr_renamed_4529();
    }
}

