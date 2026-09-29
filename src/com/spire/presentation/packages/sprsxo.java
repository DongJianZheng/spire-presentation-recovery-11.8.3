/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdsp;
import com.spire.presentation.packages.sprexo;
import com.spire.presentation.packages.sprhnn;
import com.spire.presentation.packages.sprkto;
import com.spire.presentation.packages.sprmzo;
import com.spire.presentation.packages.sproup;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprrpo;
import com.spire.presentation.packages.sprrpp;
import com.spire.presentation.packages.sprruo;
import com.spire.presentation.packages.sprsqo;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtvp;
import com.spire.presentation.packages.spryro;
import com.spire.presentation.packages.spryxp;

@sprtea
public class sprsxo {
    private sprpdja cfr_renamed_119;
    private boolean cfr_renamed_91;
    private sprpdja cfr_renamed_0;
    private sprrpo cfr_renamed_1;
    private sprrpo cfr_renamed_2;
    private sprpdja cfr_renamed_3;
    private sprmzo cfr_renamed_4;

    @sprtea
    public sprpdja cfr_renamed_18465() {
        return this.cfr_renamed_0;
    }

    @sprtea
    public sprrpp cfr_renamed_18478(sprkto arg0, sprkto arg1, sprtvp arg2, int arg3) {
        this.cfr_renamed_18585(arg0);
        sprrpp sprrpp2 = new sprrpp();
        int n = 0;
        int n2 = arg2.cfr_renamed_11861();
        int n3 = n;
        while (n3 < n2) {
            int n4 = arg2.cfr_renamed_576(n);
            if (!sprrpp2.cfr_renamed_14000(n4)) {
                sprexo sprexo2 = new sprexo(arg3);
                int n5 = n4;
                this.cfr_renamed_18586(n5, arg1, sprexo2, null);
                sprrpp2.cfr_renamed_12962(n5, sprhnn.cfr_renamed_13528(sprexo2));
            }
            n3 = ++n;
        }
        return sprrpp2;
    }

    @sprtea
    public void cfr_renamed_18448(sprkto arg0, sprkto arg1, sprdsp arg2) {
        sprsxo sprsxo2 = this;
        sprsxo sprsxo3 = this;
        sprsxo3.cfr_renamed_18585(arg0);
        sprdsp sprdsp2 = sprsxo3.cfr_renamed_18587(arg2, arg1);
        sprsxo2.cfr_renamed_18588(arg1, sprdsp2);
        sprsxo2.cfr_renamed_18589();
    }

    @sprtea
    public int cfr_renamed_18464(sprkto arg0, sprkto arg1, spryro arg2, sprdsp arg3) {
        sprsxo sprsxo2 = this;
        sprsxo sprsxo3 = this;
        sprsxo3.cfr_renamed_18585(arg0);
        sprsxo3.cfr_renamed_18590(arg1, arg2, arg3);
        sprsxo2.cfr_renamed_18589();
        return sprsxo2.cfr_renamed_1.cfr_renamed_15080().cfr_renamed_11861() - 1;
    }

    private /* synthetic */ void cfr_renamed_18590(sprkto arg0, spryro arg1, sprdsp arg2) {
        int n;
        sprdsp sprdsp2 = sprsxo.cfr_renamed_18591(arg2);
        sprsxo sprsxo2 = this;
        this.cfr_renamed_1 = new sprrpo(this.cfr_renamed_91);
        this.cfr_renamed_3 = new sprpdja();
        sprruo sprruo2 = new sprruo(this.cfr_renamed_3);
        this.cfr_renamed_0 = new sprpdja();
        sprruo sprruo3 = new sprruo(this.cfr_renamed_0);
        int n2 = n = 0;
        while (n2 < sprdsp2.cfr_renamed_11861()) {
            this.cfr_renamed_1.cfr_renamed_15080().cfr_renamed_12819((int)sprruo2.cfr_renamed_14060().cfr_renamed_3274());
            int n3 = (Integer)sprdsp2.cfr_renamed_13485(n);
            sprsxo sprsxo3 = this;
            sprsxo3.cfr_renamed_4.cfr_renamed_14060().cfr_renamed_11548((arg0.cfr_renamed_3 & 0xFFFFFFFFL) + (long)this.cfr_renamed_2.cfr_renamed_15080().cfr_renamed_576(n3));
            int n4 = sprsxo3.cfr_renamed_2.cfr_renamed_15080().cfr_renamed_576(n3 + 1) - this.cfr_renamed_2.cfr_renamed_15080().cfr_renamed_576(n3);
            if (n4 > 0) {
                byte[] byArray;
                short s = this.cfr_renamed_4.cfr_renamed_12254();
                if (s < 0) {
                    int n5;
                    sprruo sprruo4 = sprruo2;
                    sprruo4.cfr_renamed_14639(s);
                    byArray = this.cfr_renamed_4.cfr_renamed_16065(8);
                    sprruo4.cfr_renamed_15098(byArray, 0, byArray.length);
                    do {
                        sprsxo sprsxo4;
                        int n6;
                        n5 = this.cfr_renamed_4.cfr_renamed_13218() & 0xFFFF;
                        sprruo2.cfr_renamed_14639(n5);
                        int n7 = this.cfr_renamed_4.cfr_renamed_13218() & 0xFFFF;
                        Object object = arg2.cfr_renamed_576(n7);
                        if (object != null) {
                            n6 = (Integer)object;
                            sprsxo4 = this;
                        } else {
                            sprdsp sprdsp3 = sprdsp2;
                            int n8 = sprdsp3.cfr_renamed_7861(sprdsp3.cfr_renamed_11861() - 1);
                            n6 = n8 + 1;
                            arg2.cfr_renamed_13414(n7, n6);
                            sprdsp2.cfr_renamed_13414(n6, n7);
                            sprsxo4 = this;
                        }
                        byte[] byArray2 = sprsxo4.cfr_renamed_4.cfr_renamed_16065(sprsxo.cfr_renamed_18592(n5));
                        sprruo sprruo5 = sprruo2;
                        sprruo5.cfr_renamed_14639(n6);
                        sprruo5.cfr_renamed_15098(byArray2, 0, byArray2.length);
                    } while ((n5 & 0x20) != 0);
                    if ((n5 & 0x100) != 0) {
                        sprsxo sprsxo5 = this;
                        int n9 = sprsxo5.cfr_renamed_4.cfr_renamed_13218() & 0xFFFF;
                        byte[] byArray3 = sprsxo5.cfr_renamed_4.cfr_renamed_16065(n9);
                        sprruo sprruo6 = sprruo2;
                        sprruo6.cfr_renamed_14639(n9);
                        sprruo6.cfr_renamed_15098(byArray3, 0, byArray3.length);
                    }
                } else {
                    sprsxo sprsxo6 = this;
                    sprsxo6.cfr_renamed_4.cfr_renamed_14060().cfr_renamed_11548(this.cfr_renamed_4.cfr_renamed_14060().cfr_renamed_3274() - 2L);
                    byArray = sprsxo6.cfr_renamed_4.cfr_renamed_16065(n4);
                    sprruo2.cfr_renamed_15098(byArray, 0, byArray.length);
                }
                if (spryxp.cfr_renamed_14245(sprruo2.cfr_renamed_14060().cfr_renamed_3274())) {
                    sprruo2.cfr_renamed_11594((byte)0);
                }
            }
            sprsqo sprsqo2 = arg1.cfr_renamed_18579(n3);
            sprsqo2.cfr_renamed_18252(sprruo3);
            n2 = ++n;
        }
        this.cfr_renamed_1.cfr_renamed_15080().cfr_renamed_12819((int)sprruo2.cfr_renamed_14060().cfr_renamed_3274());
    }

    private static /* synthetic */ int cfr_renamed_18592(int arg0) {
        int n;
        int n2 = n = (arg0 & 1) != 0 ? 4 : 2;
        if ((arg0 & 8) != 0) {
            return n += 2;
        }
        if ((arg0 & 0x40) != 0) {
            return n += 4;
        }
        if ((arg0 & 0x80) != 0) {
            n += 8;
        }
        return n;
    }

    @sprtea
    public sprpdja cfr_renamed_18449() {
        return this.cfr_renamed_119;
    }

    private /* synthetic */ void cfr_renamed_18585(sprkto arg0) {
        sprsxo sprsxo2 = this;
        sprsxo2.cfr_renamed_4.cfr_renamed_14060().cfr_renamed_11548(arg0.cfr_renamed_3);
        sprsxo2.cfr_renamed_2 = sprrpo.cfr_renamed_15089(sprsxo2.cfr_renamed_4, arg0.cfr_renamed_2, this.cfr_renamed_91);
    }

    private /* synthetic */ void cfr_renamed_18593(int arg0, sprdsp arg1, sprkto arg2) {
        int n;
        if (arg1.cfr_renamed_14000(arg0)) {
            return;
        }
        if (arg0 > this.cfr_renamed_2.cfr_renamed_15080().cfr_renamed_11861() - 1) {
            return;
        }
        int n2 = arg0;
        arg1.cfr_renamed_13414(n2, n2);
        if (this.cfr_renamed_2.cfr_renamed_15080().cfr_renamed_576(arg0 + 1) - this.cfr_renamed_2.cfr_renamed_15080().cfr_renamed_576(arg0) == 0) {
            return;
        }
        sprsxo sprsxo2 = this;
        sprsxo2.cfr_renamed_4.cfr_renamed_14060().cfr_renamed_11548((arg2.cfr_renamed_3 & 0xFFFFFFFFL) + (long)this.cfr_renamed_2.cfr_renamed_15080().cfr_renamed_576(arg0));
        if (sprsxo2.cfr_renamed_4.cfr_renamed_12254() > 0) {
            return;
        }
        this.cfr_renamed_4.cfr_renamed_16065(8);
        sprtvp sprtvp2 = new sprtvp();
        do {
            sprsxo sprsxo3 = this;
            n = sprsxo3.cfr_renamed_4.cfr_renamed_13218() & 0xFFFF;
            int n3 = sprsxo3.cfr_renamed_4.cfr_renamed_13218() & 0xFFFF;
            sprsxo3.cfr_renamed_4.cfr_renamed_16065(sprsxo.cfr_renamed_18592(n));
            sprtvp2.cfr_renamed_12819(n3);
        } while ((n & 0x20) != 0);
        int n4 = n = 0;
        while (n4 < sprtvp2.cfr_renamed_11861()) {
            int n5 = sprtvp2.cfr_renamed_576(n);
            this.cfr_renamed_18593(n5, arg1, arg2);
            n4 = ++n;
        }
    }

    private static /* synthetic */ sprdsp cfr_renamed_18591(sprdsp arg0) {
        int n;
        sprdsp sprdsp2 = new sprdsp();
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_11861()) {
            sprdsp sprdsp3 = arg0;
            int n3 = sprdsp3.cfr_renamed_7861(n);
            int n4 = (Integer)sprdsp3.cfr_renamed_13485(n);
            sprdsp2.cfr_renamed_13414(n4, n3);
            n2 = ++n;
        }
        return sprdsp2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_18586(int n, sprkto sprkto2, sprexo sprexo2, sprqgp sprqgp2) {
        void arg2;
        sprqgp arg3;
        void arg0;
        void arg1;
        sprsxo sprsxo2 = this;
        sprsxo2.cfr_renamed_4.cfr_renamed_14060().cfr_renamed_11548((arg1.cfr_renamed_3 & 0xFFFFFFFFL) + (long)this.cfr_renamed_2.cfr_renamed_15080().cfr_renamed_576((int)arg0));
        short s = sprsxo2.cfr_renamed_4.cfr_renamed_12254();
        sprsxo2.cfr_renamed_4.cfr_renamed_14060().cfr_renamed_11548(this.cfr_renamed_4.cfr_renamed_14060().cfr_renamed_3274() - 2L);
        if (sprqgp2 == null) {
            arg3 = new sprqgp();
        }
        if (s < 0) {
            this.cfr_renamed_18594((sprexo)arg2, (sprkto)arg1, arg3);
            return;
        }
        this.cfr_renamed_18595((sprexo)arg2, arg3);
    }

    private /* synthetic */ float cfr_renamed_18596() {
        short s = this.cfr_renamed_4.cfr_renamed_12254();
        int n = s >> 14;
        float f = (s & 0x3FFF) / 16383;
        return (float)n + f;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprsxo(sprmzo sprmzo2, boolean bl) {
        void arg0;
        sprsxo sprsxo2 = this;
        sprsxo2.cfr_renamed_4 = arg0;
        sprsxo2.cfr_renamed_91 = bl;
    }

    private /* synthetic */ void cfr_renamed_18589() {
        this.cfr_renamed_119 = new sprpdja();
        sprruo sprruo2 = new sprruo(this.cfr_renamed_119);
        this.cfr_renamed_1.cfr_renamed_18252(sprruo2);
    }

    private /* synthetic */ sprdsp cfr_renamed_18587(sprdsp arg0, sprkto arg1) {
        int n;
        sprdsp sprdsp2 = new sprdsp();
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_11861()) {
            int n3 = arg0.cfr_renamed_7861(n);
            this.cfr_renamed_18593(n3, sprdsp2, arg1);
            n2 = ++n;
        }
        return sprdsp2;
    }

    private /* synthetic */ void cfr_renamed_18595(sprexo arg0, sprqgp arg1) {
        int n;
        sprqgp sprqgp2;
        int n2;
        int n3;
        int n4;
        sprsxo sprsxo2 = this;
        int n5 = sprsxo2.cfr_renamed_4.cfr_renamed_12254();
        sprsxo2.cfr_renamed_4.cfr_renamed_12254();
        this.cfr_renamed_4.cfr_renamed_12254();
        this.cfr_renamed_4.cfr_renamed_12254();
        this.cfr_renamed_4.cfr_renamed_12254();
        int[] nArray = new int[n5];
        int n6 = 0;
        int n7 = n6;
        while (n7 < n5) {
            nArray[n6++] = this.cfr_renamed_4.cfr_renamed_13218() & 0xFFFF;
            n7 = n6;
        }
        n6 = 0;
        int n8 = n4 = 0;
        while (n8 < nArray.length) {
            n6 = 1 + (n6 < nArray[n4] ? nArray[n4] : n6);
            n8 = ++n4;
        }
        sprsxo sprsxo3 = this;
        n4 = sprsxo3.cfr_renamed_4.cfr_renamed_13218() & 0xFFFF;
        sprsxo3.cfr_renamed_4.cfr_renamed_16065(n4);
        byte[] byArray = new byte[n6];
        int n9 = 0;
        block2: while (true) {
            int n10 = n9;
            while (n10 < n6) {
                int n11;
                byte by = this.cfr_renamed_4.cfr_renamed_12137();
                byArray[n9++] = by;
                boolean[] blArray = sproup.cfr_renamed_18597(by);
                if (!blArray[3]) {
                    n10 = n9;
                    continue;
                }
                int n12 = this.cfr_renamed_4.cfr_renamed_12137() & 0xFF;
                int n13 = n11 = 0;
                while (true) {
                    if (n13 >= n12) continue block2;
                    byArray[n9++] = by;
                    n13 = ++n11;
                }
            }
            break;
        }
        int[] nArray2 = new int[n6];
        int n14 = n3 = 0;
        while (n14 < n6) {
            boolean[] blArray = sproup.cfr_renamed_18597(byArray[n3]);
            nArray2[n3] = blArray[1] ? (this.cfr_renamed_4.cfr_renamed_12137() & 0xFF) * (blArray[4] ? 1 : -1) : (blArray[4] ? nArray2[n3] : (int)this.cfr_renamed_4.cfr_renamed_12254());
            n14 = ++n3;
        }
        int[] nArray3 = new int[n6];
        int n15 = n2 = 0;
        while (n15 < n6) {
            boolean[] blArray = sproup.cfr_renamed_18597(byArray[n2]);
            nArray3[n2] = blArray[2] ? (this.cfr_renamed_4.cfr_renamed_12137() & 0xFF) * (blArray[5] ? 1 : -1) : (blArray[5] ? nArray3[n2] : (int)this.cfr_renamed_4.cfr_renamed_12254());
            n15 = ++n2;
        }
        sprqgp sprqgp3 = arg1 != null ? new sprqgp(1.0f, 0.0f, 0.0f, 1.0f, arg1.cfr_renamed_12599(), arg1.cfr_renamed_12600()) : null;
        sprqgp sprqgp4 = sprqgp2 = arg1 != null ? new sprqgp(arg1.cfr_renamed_12595(), arg1.cfr_renamed_12596(), arg1.cfr_renamed_12597(), arg1.cfr_renamed_12598(), 0.0f, 0.0f) : null;
        if (sprqgp3 != null) {
            sprsuja sprsuja2 = new sprsuja(nArray2[0], nArray3[0]);
            sprsuja2 = sprqgp3.cfr_renamed_13791(sprsuja2);
            nArray2[0] = (int)sprsuja2.cfr_renamed_1980();
            nArray3[0] = (int)sprsuja2.spr\u3181();
        }
        int n16 = 0;
        int n17 = n = 0;
        while (n17 < n6) {
            boolean bl;
            boolean[] blArray = sproup.cfr_renamed_18597(byArray[n]);
            boolean bl2 = bl = nArray[n16] == n;
            if (bl) {
                ++n16;
            }
            sprsuja sprsuja3 = new sprsuja(nArray2[n], nArray3[n]);
            if (sprqgp2 != null) {
                sprsuja3 = sprqgp2.cfr_renamed_13791(sprsuja3);
            }
            arg0.cfr_renamed_13187().cfr_renamed_18319((int)sprsuja3.cfr_renamed_1980(), (int)sprsuja3.spr\u3181(), blArray[0], bl, n == 0);
            n17 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_18594(sprexo arg0, sprkto arg1, sprqgp arg2) {
        sprexo sprexo2;
        int n;
        this.cfr_renamed_4.cfr_renamed_12254();
        sprsxo sprsxo2 = this;
        short s = sprsxo2.cfr_renamed_4.cfr_renamed_12254();
        short s2 = sprsxo2.cfr_renamed_4.cfr_renamed_12254();
        sprsxo2.cfr_renamed_4.cfr_renamed_12254();
        this.cfr_renamed_4.cfr_renamed_12254();
        int n2 = -1;
        sprqgp sprqgp2 = arg2.cfr_renamed_12099();
        do {
            float f;
            sprsxo sprsxo3;
            int n3;
            short s3;
            short s4;
            sprsxo sprsxo4 = this;
            n = sprsxo4.cfr_renamed_4.cfr_renamed_13218() & 0xFFFF;
            int n4 = sprsxo4.cfr_renamed_4.cfr_renamed_13218() & 0xFFFF;
            sprqgp sprqgp3 = n2 == n4 ? arg2.cfr_renamed_12099() : sprqgp2.cfr_renamed_12099();
            n2 = n4;
            if ((n & 0x200) != 0) {
                sprqgp2 = sprqgp3;
            }
            if ((n & 1) != 0) {
                sprsxo sprsxo5 = this;
                s4 = sprsxo5.cfr_renamed_4.cfr_renamed_12254();
                s3 = sprsxo5.cfr_renamed_4.cfr_renamed_12254();
                n3 = n;
            } else {
                sprsxo sprsxo6 = this;
                s4 = (short)(sprsxo6.cfr_renamed_4.cfr_renamed_12137() & 0xFF);
                s3 = (short)(sprsxo6.cfr_renamed_4.cfr_renamed_12137() & 0xFF);
                n3 = n;
            }
            if ((n3 & 2) != 0) {
                sprqgp3.cfr_renamed_12629(s4, s3);
            }
            if ((n & 8) != 0) {
                sprsxo sprsxo7 = this;
                sprsxo3 = sprsxo7;
                float f2 = sprsxo7.cfr_renamed_18596();
                sprqgp3.cfr_renamed_13534(f2, f2);
            } else if ((n & 0x40) != 0) {
                sprsxo sprsxo8 = this;
                sprsxo3 = sprsxo8;
                float f3 = sprsxo8.cfr_renamed_18596();
                f = sprsxo8.cfr_renamed_18596();
                sprqgp3.cfr_renamed_13534(f3, f);
            } else {
                if ((n & 0x80) != 0) {
                    sprsxo sprsxo9 = this;
                    float f4 = sprsxo9.cfr_renamed_18596();
                    f = sprsxo9.cfr_renamed_18596();
                    float f5 = sprsxo9.cfr_renamed_18596();
                    float f6 = sprsxo9.cfr_renamed_18596();
                    sprqgp sprqgp4 = new sprqgp(f4, f, f5, f6, 0.0f, 0.0f);
                    sprqgp3.cfr_renamed_12593(sprqgp4);
                }
                sprsxo3 = this;
            }
            long l = sprsxo3.cfr_renamed_4.cfr_renamed_14060().cfr_renamed_3274();
            sprsxo sprsxo10 = this;
            sprsxo10.cfr_renamed_18586(n4, arg1, arg0, sprqgp3);
            sprsxo10.cfr_renamed_4.cfr_renamed_14060().cfr_renamed_11548(l);
        } while ((n & 0x20) != 0);
        if ((n & 0x100) != 0) {
            sprexo2 = arg0;
            sprsxo sprsxo11 = this;
            int n5 = sprsxo11.cfr_renamed_4.cfr_renamed_13218() & 0xFFFF;
            sprsxo11.cfr_renamed_4.cfr_renamed_16065(n5);
        } else {
            sprexo2 = arg0;
        }
        sprexo2.cfr_renamed_13187().cfr_renamed_18317(s, s2);
    }

    @sprtea
    public sprpdja cfr_renamed_18450() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_18588(sprkto sprkto2, sprdsp sprdsp2) {
        int n;
        sprsxo sprsxo2 = this;
        sprsxo2.cfr_renamed_1 = new sprrpo(this.cfr_renamed_91);
        sprsxo2.cfr_renamed_3 = new sprpdja();
        sprruo sprruo2 = new sprruo(this.cfr_renamed_3);
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2.cfr_renamed_15080().cfr_renamed_11861() - 1) {
            void arg1;
            this.cfr_renamed_1.cfr_renamed_15080().cfr_renamed_12819((int)sprruo2.cfr_renamed_14060().cfr_renamed_3274());
            if (arg1.cfr_renamed_14000(n)) {
                void arg0;
                sprsxo sprsxo3 = this;
                sprsxo3.cfr_renamed_4.cfr_renamed_14060().cfr_renamed_11548((arg0.cfr_renamed_3 & 0xFFFFFFFFL) + (long)this.cfr_renamed_2.cfr_renamed_15080().cfr_renamed_576(n));
                int n3 = sprsxo3.cfr_renamed_2.cfr_renamed_15080().cfr_renamed_576(n + 1) - this.cfr_renamed_2.cfr_renamed_15080().cfr_renamed_576(n);
                if (n3 != 0) {
                    byte[] byArray = this.cfr_renamed_4.cfr_renamed_16065(n3);
                    sprruo2.cfr_renamed_9854(byArray);
                }
            }
            n2 = ++n;
        }
        this.cfr_renamed_1.cfr_renamed_15080().cfr_renamed_12819((int)sprruo2.cfr_renamed_14060().cfr_renamed_3274());
    }

    @sprtea
    public sprrpp cfr_renamed_18444(sprkto arg0, sprkto arg1, sprdsp arg2, int arg3) {
        int n;
        this.cfr_renamed_18585(arg0);
        sprrpp sprrpp2 = new sprrpp();
        sprdsp sprdsp2 = sprsxo.cfr_renamed_18591(arg2);
        int n2 = n = 0;
        while (n2 < sprdsp2.cfr_renamed_11861()) {
            sprexo sprexo2 = new sprexo(arg3);
            int n3 = (Integer)sprdsp2.cfr_renamed_13485(n);
            int n4 = n++;
            this.cfr_renamed_18586(n3, arg1, sprexo2, null);
            sprrpp2.cfr_renamed_12962(n4, sprexo2);
            n2 = n;
        }
        return sprrpp2;
    }
}

