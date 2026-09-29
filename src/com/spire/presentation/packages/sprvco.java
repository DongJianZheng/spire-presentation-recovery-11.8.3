/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcrn;
import com.spire.presentation.packages.sprdxn;
import com.spire.presentation.packages.spresca;
import com.spire.presentation.packages.sprewn;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprhhp;
import com.spire.presentation.packages.sprpon;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprqjn;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprthn;
import com.spire.presentation.packages.sprttn;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprxhj;
import com.spire.presentation.packages.spryxp;
import com.spire.presentation.packages.sprznp;

@sprtea
public class sprvco {
    private boolean cfr_renamed_132;
    private sprqgp cfr_renamed_102;
    private boolean cfr_renamed_93;
    private sprgdo cfr_renamed_86;
    private sprcrn cfr_renamed_152;
    private static final int cfr_renamed_112 = 0;
    private static final int cfr_renamed_119 = 10000;
    private int cfr_renamed_91;
    private sprttn cfr_renamed_0;
    private static final int cfr_renamed_1 = 1;
    private static final int cfr_renamed_2 = 2;
    private boolean cfr_renamed_3;
    private static final float cfr_renamed_4 = 0.5f;

    private /* synthetic */ void cfr_renamed_14349() {
        if (this.cfr_renamed_3) {
            return;
        }
        this.cfr_renamed_86.cfr_renamed_14350().cfr_renamed_14103().cfr_renamed_14351().cfr_renamed_4572().cfr_renamed_14352(this.cfr_renamed_152.cfr_renamed_13380());
        this.cfr_renamed_3 = true;
    }

    private /* synthetic */ void cfr_renamed_14353(sprthn arg0, sprewn arg1) {
        sprpon[] sprponArray = arg0.cfr_renamed_13256();
        if (sprponArray == null) {
            sprthn sprthn2;
            int n = 0;
            sprvjn sprvjn2 = arg0.cfr_renamed_13689();
            if (sprvjn2 instanceof sprthn && sprznp.cfr_renamed_12328((sprthn2 = spresca.cfr_renamed_11777(sprvjn2, sprthn.class)).cfr_renamed_13030())) {
                n = sprthn2.cfr_renamed_13030().charAt(sprthn2.cfr_renamed_13030().length() - 1);
            }
            sprponArray = arg0.cfr_renamed_13257().cfr_renamed_14354(arg0.cfr_renamed_13030(), arg0.cfr_renamed_13259(), n);
        }
        this.cfr_renamed_14355(sprponArray, arg0, arg1);
    }

    private /* synthetic */ void cfr_renamed_14356(sprthn arg0) {
        sprvco sprvco2;
        boolean bl;
        boolean bl2 = !arg0.cfr_renamed_12553().cfr_renamed_29();
        boolean bl3 = bl = !arg0.cfr_renamed_13268().cfr_renamed_29() || arg0.cfr_renamed_13257().cfr_renamed_13242();
        if (!bl) {
            sprvco sprvco3 = this;
            sprvco3.cfr_renamed_14357(0);
            sprwbp sprwbp2 = (sprvco3.cfr_renamed_86.cfr_renamed_14358() || this.cfr_renamed_86.cfr_renamed_14359()) && arg0.cfr_renamed_12553().cfr_renamed_29() ? sprwbp.cfr_renamed_1513 : arg0.cfr_renamed_12553();
            this.cfr_renamed_14360(sprwbp2, false);
            return;
        }
        float f = 0.5f;
        sprthn sprthn2 = arg0;
        sprwbp sprwbp3 = sprthn2.cfr_renamed_13268();
        if (sprthn2.cfr_renamed_13257().cfr_renamed_13242()) {
            sprthn sprthn3 = arg0;
            f = sprthn3.cfr_renamed_13257().cfr_renamed_13265() / 30.0f;
            sprthn sprthn4 = arg0;
            sprwbp3 = !sprthn3.cfr_renamed_12553().cfr_renamed_29() ? sprthn4.cfr_renamed_12553() : sprthn4.cfr_renamed_13268();
        }
        sprvco sprvco4 = this;
        if (bl2) {
            sprvco4.cfr_renamed_14357(2);
            sprvco sprvco5 = this;
            sprvco2 = sprvco5;
            sprvco5.cfr_renamed_14360(arg0.cfr_renamed_12553(), false);
        } else {
            sprvco4.cfr_renamed_14357(1);
            sprvco2 = this;
        }
        sprvco2.cfr_renamed_14361(f);
        this.cfr_renamed_14360(sprwbp3, true);
    }

    public void cfr_renamed_14362() {
        if (!this.cfr_renamed_93) {
            return;
        }
        sprvco sprvco2 = this;
        sprvco2.cfr_renamed_14363();
        sprvco2.cfr_renamed_152.cfr_renamed_14058(sprdxn.cfr_renamed_9("e\u001d"));
        this.cfr_renamed_93 = false;
    }

    private /* synthetic */ void cfr_renamed_14364() {
        if (!this.cfr_renamed_3) {
            return;
        }
        this.cfr_renamed_86.cfr_renamed_14350().cfr_renamed_14103().cfr_renamed_14351().cfr_renamed_4572().cfr_renamed_14365(this.cfr_renamed_152.cfr_renamed_13380());
        this.cfr_renamed_3 = false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_14366(int n, int n2, sprewn sprewn2, float f) {
        void arg3;
        void arg1;
        void arg0;
        void arg2;
        sprewn sprewn3 = sprewn2;
        sprvco sprvco2 = this;
        this.cfr_renamed_14367();
        sprvco2.cfr_renamed_14349();
        arg2.cfr_renamed_14368((int)arg0, (int)arg1, this.cfr_renamed_152.cfr_renamed_13380());
        sprvco2.cfr_renamed_14369(sprewn3.cfr_renamed_14370(sprewn3.cfr_renamed_14371().cfr_renamed_13261().cfr_renamed_13027().cfr_renamed_14372((int)arg0).cfr_renamed_13470()), (float)arg3);
        ++sprvco2.cfr_renamed_91;
    }

    private static /* synthetic */ sprsuja cfr_renamed_14373(sprhhp arg0, sprsuja arg1, float arg2, sprqjn arg3) {
        float f = arg2 + arg0.cfr_renamed_14374(arg3.cfr_renamed_13073());
        float f2 = -arg0.cfr_renamed_14374(arg3.cfr_renamed_13074());
        return new sprsuja(arg1.cfr_renamed_1980() + f, arg1.spr\u3181() + f2);
    }

    /*
     * WARNING - void declaration
     */
    public sprvco(sprgdo sprgdo2, sprcrn sprcrn2, sprttn sprttn2) {
        void arg1;
        void arg0;
        sprvco sprvco2 = this;
        this.cfr_renamed_86 = arg0;
        sprvco2.cfr_renamed_152 = arg1;
        sprvco2.cfr_renamed_0 = sprttn2;
    }

    private /* synthetic */ void cfr_renamed_14355(sprpon[] arg0, sprthn arg1, sprewn arg2) {
        int n;
        float f = 0.0f;
        sprpon[] sprponArray = arg0;
        int n2 = arg0.length;
        int n3 = n = 0;
        while (n3 < n2) {
            int n4;
            boolean bl;
            sprpon sprpon2 = sprponArray[n];
            boolean bl2 = bl = sprpon2.cfr_renamed_13079().length != 1 || sprpon2.cfr_renamed_13027().length != 1;
            if (bl) {
                this.cfr_renamed_14375(sprpon2.cfr_renamed_314());
            }
            sprqjn[] sprqjnArray = sprpon2.cfr_renamed_13027();
            int n5 = sprqjnArray.length;
            int n6 = n4 = 0;
            while (n6 < n5) {
                sprqjn sprqjn2 = sprqjnArray[n4];
                sprsuja sprsuja2 = sprvco.cfr_renamed_14373(arg1.cfr_renamed_13257(), arg1.cfr_renamed_13110(), f, sprqjn2);
                f += sprqjn2.cfr_renamed_13070(arg1.cfr_renamed_13257().cfr_renamed_13261().cfr_renamed_13317(), arg1.cfr_renamed_13257().cfr_renamed_13265());
                this.cfr_renamed_14376(sprsuja2, arg1.cfr_renamed_13257());
                int n7 = bl ? 0 : sprpon2.cfr_renamed_13079()[0];
                sprvco sprvco2 = this;
                sprvco2.cfr_renamed_14366(sprqjn2.cfr_renamed_13072(), n7, arg2, arg1.cfr_renamed_13257().cfr_renamed_13265());
                if (sprvco2.cfr_renamed_91 >= 10000) {
                    this.cfr_renamed_14363();
                }
                n6 = ++n4;
            }
            if (bl) {
                sprvco.cfr_renamed_14377(arg2, sprpon2);
                this.cfr_renamed_14378();
            }
            n3 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_14379(sprewn arg0, float arg1) {
        if (this.cfr_renamed_86.cfr_renamed_14350().cfr_renamed_14380(arg0, arg1)) {
            return;
        }
        sprvco sprvco2 = this;
        sprvco2.cfr_renamed_14363();
        sprvco2.cfr_renamed_86.cfr_renamed_14350().cfr_renamed_14381(arg0, arg1, this.cfr_renamed_152);
    }

    public void cfr_renamed_14382() {
        if (this.cfr_renamed_93) {
            return;
        }
        this.cfr_renamed_152.cfr_renamed_14058(sprxhj.cfr_renamed_9("\r&"));
        this.cfr_renamed_93 = true;
        sprvco sprvco2 = this;
        this.cfr_renamed_102 = new sprqgp();
    }

    private /* synthetic */ void cfr_renamed_14369(int arg0, float arg1) {
        float f = (float)arg0 / 1000.0f * arg1;
        this.cfr_renamed_102.cfr_renamed_12593(new sprqgp(1.0f, 0.0f, 0.0f, 1.0f, f, 0.0f));
    }

    private /* synthetic */ void cfr_renamed_14360(sprwbp arg0, boolean arg1) {
        if (this.cfr_renamed_86.cfr_renamed_14350().cfr_renamed_14383(arg0, arg1)) {
            return;
        }
        sprvco sprvco2 = this;
        sprvco2.cfr_renamed_14363();
        sprvco sprvco3 = this;
        sprvco2.cfr_renamed_86.cfr_renamed_14350().cfr_renamed_14384(arg0, arg1, sprvco3.cfr_renamed_152, sprvco3.cfr_renamed_0);
    }

    private /* synthetic */ void cfr_renamed_14363() {
        if (!this.cfr_renamed_132) {
            return;
        }
        sprvco sprvco2 = this;
        sprvco2.cfr_renamed_14364();
        sprvco2.cfr_renamed_152.cfr_renamed_14058(sprdxn.cfr_renamed_9("}it\u0003"));
        sprvco2.cfr_renamed_132 = false;
        this.cfr_renamed_91 = 0;
    }

    private /* synthetic */ void cfr_renamed_14361(float arg0) {
        if (this.cfr_renamed_86.cfr_renamed_14350().cfr_renamed_14385(arg0)) {
            return;
        }
        sprvco sprvco2 = this;
        sprvco2.cfr_renamed_14363();
        sprvco2.cfr_renamed_86.cfr_renamed_14350().cfr_renamed_14386(arg0, this.cfr_renamed_152);
    }

    private static /* synthetic */ void cfr_renamed_14377(sprewn arg0, sprpon arg1) {
        int n;
        if (arg1.cfr_renamed_13078() == 0) {
            return;
        }
        int n2 = n = 0;
        while (n2 < arg1.cfr_renamed_13027().length) {
            sprewn sprewn2;
            int[] nArray;
            int n3 = arg1.cfr_renamed_13027()[n].cfr_renamed_13072();
            if (n >= arg1.cfr_renamed_13079().length) {
                int[] nArray2 = new int[1];
                nArray2[0] = arg1.cfr_renamed_13079()[arg1.cfr_renamed_13079().length - 1];
                nArray = nArray2;
                sprewn2 = arg0;
            } else {
                if (n == arg1.cfr_renamed_13027().length - 1) {
                    int n4;
                    nArray = new int[arg1.cfr_renamed_13079().length - n];
                    int n5 = n4 = 0;
                    while (n5 < nArray.length) {
                        int n6 = n4++;
                        nArray[n6] = arg1.cfr_renamed_13079()[n + n6];
                        n5 = n4;
                    }
                } else {
                    int[] nArray3 = new int[1];
                    nArray3[0] = arg1.cfr_renamed_13079()[n];
                    nArray = nArray3;
                }
                sprewn2 = arg0;
            }
            sprewn2.cfr_renamed_14387(n3, nArray);
            n2 = ++n;
        }
    }

    private static /* synthetic */ boolean cfr_renamed_14388(sprqgp arg0, sprqgp arg1) {
        return sprvco.cfr_renamed_14389(arg0, arg1) && sprvco.cfr_renamed_14390(arg0.cfr_renamed_12599(), arg1.cfr_renamed_12599()) && sprvco.cfr_renamed_14390(arg0.cfr_renamed_12600(), arg1.cfr_renamed_12600());
    }

    private /* synthetic */ void cfr_renamed_14357(int arg0) {
        if (this.cfr_renamed_86.cfr_renamed_14350().cfr_renamed_14391(arg0)) {
            return;
        }
        sprvco sprvco2 = this;
        sprvco2.cfr_renamed_14363();
        sprvco2.cfr_renamed_86.cfr_renamed_14350().cfr_renamed_14392(arg0, this.cfr_renamed_152);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_13386(sprthn sprthn2) {
        void arg0;
        this.cfr_renamed_14382();
        sprewn sprewn2 = sprthn2.cfr_renamed_13256() != null ? this.cfr_renamed_0.cfr_renamed_14393(arg0.cfr_renamed_13257()) : this.cfr_renamed_0.cfr_renamed_14394(arg0.cfr_renamed_13257(), arg0.cfr_renamed_13030());
        sprvco sprvco2 = this;
        sprvco sprvco3 = this;
        void v2 = arg0;
        sprvco3.cfr_renamed_14379(sprewn2, v2.cfr_renamed_13257().cfr_renamed_13265());
        void v3 = arg0;
        sprvco3.cfr_renamed_14395(v2.cfr_renamed_13257(), v3.cfr_renamed_13110());
        sprvco2.cfr_renamed_14356((sprthn)v3);
        sprvco2.cfr_renamed_14353((sprthn)arg0, sprewn2);
    }

    public static String cfr_renamed_9(String string) {
        String s;
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ (2 << 2 ^ 3);
        int n4 = n2;
        int n5 = 5 << 4;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    private /* synthetic */ void cfr_renamed_14367() {
        if (this.cfr_renamed_132) {
            return;
        }
        this.cfr_renamed_152.cfr_renamed_11835("[");
        this.cfr_renamed_132 = true;
        this.cfr_renamed_91 = 0;
    }

    private static /* synthetic */ boolean cfr_renamed_14390(float arg0, float arg1) {
        float f = 0.001f;
        return spryxp.cfr_renamed_13672(arg0, arg1, f);
    }

    private /* synthetic */ void cfr_renamed_14378() {
        sprvco sprvco2 = this;
        sprvco2.cfr_renamed_14363();
        sprvco2.cfr_renamed_152.cfr_renamed_13380().cfr_renamed_14058(sprxhj.cfr_renamed_9("7\u00021"));
    }

    private /* synthetic */ void cfr_renamed_14395(sprhhp arg0, sprsuja arg1) {
        sprqgp sprqgp2 = sprvco.cfr_renamed_14396(arg0, arg1);
        if (sprvco.cfr_renamed_14388(sprqgp2, this.cfr_renamed_102)) {
            return;
        }
        if (!sprvco.cfr_renamed_14389(sprqgp2, this.cfr_renamed_102)) {
            this.cfr_renamed_14397(sprqgp2);
            return;
        }
        if (!sprvco.cfr_renamed_14390(sprqgp2.cfr_renamed_12600(), this.cfr_renamed_102.cfr_renamed_12600())) {
            this.cfr_renamed_14397(sprqgp2);
        }
        if ((float)sprrgga.cfr_renamed_6433(sprvco.cfr_renamed_14398(sprqgp2.cfr_renamed_12599() - this.cfr_renamed_102.cfr_renamed_12599(), arg0.cfr_renamed_13265())) > 30000.0f) {
            this.cfr_renamed_14397(sprqgp2);
        }
    }

    private /* synthetic */ void cfr_renamed_14375(String arg0) {
        sprvco sprvco2 = this;
        sprvco2.cfr_renamed_14363();
        sprvco2.cfr_renamed_152.cfr_renamed_13380().cfr_renamed_14058(sprdxn.cfr_renamed_9("fs9A'\u0000u\u001cfa*T<A%t,X="));
        sprvco2.cfr_renamed_152.cfr_renamed_13380().cfr_renamed_14306(arg0);
        sprvco2.cfr_renamed_152.cfr_renamed_13380().cfr_renamed_14058(sprxhj.cfr_renamed_9("qLo0\u000b1"));
    }

    private static /* synthetic */ int cfr_renamed_14398(float arg0, float arg1) {
        return spryxp.cfr_renamed_13526(arg0 * 1000.0f / arg1);
    }

    private /* synthetic */ void cfr_renamed_14376(sprsuja arg0, sprhhp arg1) {
        if (!spryxp.cfr_renamed_14399(arg0.spr\u3181(), this.cfr_renamed_102.cfr_renamed_12600())) {
            this.cfr_renamed_14397(sprvco.cfr_renamed_14396(arg1, arg0));
            return;
        }
        int n = sprvco.cfr_renamed_14398(arg0.cfr_renamed_1980() - this.cfr_renamed_102.cfr_renamed_12599(), arg1.cfr_renamed_13265());
        if (n == 0 && !this.cfr_renamed_86.cfr_renamed_13097().cfr_renamed_14400()) {
            return;
        }
        if (!this.cfr_renamed_3) {
            this.cfr_renamed_14367();
        }
        sprvco sprvco2 = this;
        sprvco2.cfr_renamed_14364();
        int n2 = n;
        sprvco2.cfr_renamed_152.cfr_renamed_13380().cfr_renamed_14067(-((float)n2));
        sprvco2.cfr_renamed_14369(n2, arg1.cfr_renamed_13265());
    }

    private static /* synthetic */ sprqgp cfr_renamed_14396(sprhhp arg0, sprsuja arg1) {
        return new sprqgp(1.0f, 0.0f, arg0.cfr_renamed_13243() ? 0.34906584f : 0.0f, -1.0f, arg1.cfr_renamed_1980(), arg1.spr\u3181());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_14397(sprqgp sprqgp2) {
        void arg0;
        sprvco sprvco2 = this;
        sprvco2.cfr_renamed_14363();
        sprvco2.cfr_renamed_152.cfr_renamed_14401((sprqgp)arg0, sprdxn.cfr_renamed_9("t$"));
        sprvco2.cfr_renamed_102 = sprqgp2;
    }

    private /* synthetic */ void cfr_renamed_14402(sprthn arg0) {
    }

    private static /* synthetic */ boolean cfr_renamed_14389(sprqgp arg0, sprqgp arg1) {
        return spryxp.cfr_renamed_13682(arg0.cfr_renamed_12595(), arg1.cfr_renamed_12595()) && spryxp.cfr_renamed_13682(arg0.cfr_renamed_12596(), arg1.cfr_renamed_12596()) && spryxp.cfr_renamed_13682(arg0.cfr_renamed_12597(), arg1.cfr_renamed_12597()) && spryxp.cfr_renamed_13682(arg0.cfr_renamed_12598(), arg1.cfr_renamed_12598());
    }
}

