/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spremn;
import com.spire.presentation.packages.sprepn;
import com.spire.presentation.packages.sprffp;
import com.spire.presentation.packages.sprfqn;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprhjn;
import com.spire.presentation.packages.sprikn;
import com.spire.presentation.packages.sprkjn;
import com.spire.presentation.packages.sprlsn;
import com.spire.presentation.packages.sprlw;
import com.spire.presentation.packages.sprngp;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprpxp;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprqsfa;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtbp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprwvn;
import com.spire.presentation.packages.sprxhn;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.sprxnn;
import com.spire.presentation.packages.spryxp;
import com.spire.presentation.packages.sprzlp;

@sprtea
public class sprphn
extends sprsmn {
    private sprtbp cfr_renamed_145;
    private static final float cfr_renamed_114 = 1.5f;
    private static float[] cfr_renamed_96;
    private sprxln cfr_renamed_105;
    private static final float cfr_renamed_137 = 1.5f;
    private static sprphja[][] cfr_renamed_79;
    private static float[] cfr_renamed_107;
    private static final float cfr_renamed_132 = 3.0f;
    private static final float cfr_renamed_102 = 3.0f;
    private static float[] cfr_renamed_93;
    private sprwvn cfr_renamed_86;
    private static float[] cfr_renamed_152;
    private float cfr_renamed_112;
    private sprffp cfr_renamed_119;
    private static final float cfr_renamed_91 = 3.0f;
    private static final float cfr_renamed_0 = 3.0f;
    private static float[][] cfr_renamed_1;
    private boolean cfr_renamed_2;
    private static final float cfr_renamed_3 = 1.8000001f;
    private static float[][] cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_13939(sprwvn arg0, sprsuja arg1, double arg2, double arg3) {
        int n;
        sprikn sprikn2;
        sprikn sprikn3 = sprikn2 = new sprikn();
        sprikn sprikn4 = sprikn2;
        sprikn4.cfr_renamed_13849(new sprsuja(arg1.cfr_renamed_1980() - this.cfr_renamed_112 * 0.5f, arg1.spr\u3181() - this.cfr_renamed_112 * 0.5f));
        sprphn sprphn2 = this;
        sprikn4.cfr_renamed_13598(new sprphja(sprphn2.cfr_renamed_112, sprphn2.cfr_renamed_112));
        sprikn3.cfr_renamed_13850(arg2);
        sprikn3.cfr_renamed_13842(arg3);
        sprhjn sprhjn2 = sprikn3.cfr_renamed_13165();
        int n2 = n = 0;
        while (n2 < sprhjn2.cfr_renamed_11861()) {
            sprovja.cfr_renamed_11658(arg0, new sprxnn(sprhjn2, n++));
            n2 = n;
        }
    }

    public static boolean cfr_renamed_13940(sprffp arg0) {
        return arg0.cfr_renamed_13941() != 1 || arg0.cfr_renamed_13942().cfr_renamed_324() != 0 || arg0.cfr_renamed_13943().cfr_renamed_324() != 0;
    }

    @Override
    public void cfr_renamed_13186(sprfqn arg0) {
        int n;
        int n2;
        if (arg0.cfr_renamed_13187().cfr_renamed_11861() < 2) {
            return;
        }
        int n3 = sprphn.cfr_renamed_13944(arg0, this.cfr_renamed_2);
        if (n3 == -1) {
            return;
        }
        sprsuja sprsuja2 = arg0.cfr_renamed_13187().cfr_renamed_576(n3);
        sprsuja sprsuja3 = sprsuja.cfr_renamed_13377();
        sprfqn sprfqn2 = arg0;
        if (this.cfr_renamed_2) {
            sprsuja3 = sprfqn2.cfr_renamed_13187().cfr_renamed_576(n3 + 1);
            sprphn sprphn2 = this;
            n2 = sprphn2.cfr_renamed_119.cfr_renamed_13942().cfr_renamed_1942();
            n = sprphn2.cfr_renamed_119.cfr_renamed_13942().cfr_renamed_806();
        } else {
            sprsuja3 = sprfqn2.cfr_renamed_13187().cfr_renamed_576(n3 - 1);
            sprphn sprphn3 = this;
            n2 = sprphn3.cfr_renamed_119.cfr_renamed_13943().cfr_renamed_1942();
            n = sprphn3.cfr_renamed_119.cfr_renamed_13943().cfr_renamed_806();
        }
        sprsuja sprsuja4 = new sprsuja(sprsuja2.cfr_renamed_1980() - sprsuja3.cfr_renamed_1980(), sprsuja2.spr\u3181() - sprsuja3.spr\u3181());
        float f = 0.0f;
        if (sprsuja4.cfr_renamed_1980() != 0.0f || sprsuja4.spr\u3181() != 0.0f) {
            f = sprphn.cfr_renamed_13945(sprsuja4);
        }
        this.cfr_renamed_13946(sprsuja2, f, n2, n);
    }

    private /* synthetic */ void cfr_renamed_13946(sprsuja arg0, float arg1, int arg2, int arg3) {
        int n;
        sprqgp sprqgp2;
        sprwvn sprwvn2;
        float f;
        sprwvn sprwvn3;
        sprlsn sprlsn2;
        int n2;
        block12: {
            sprphn sprphn2 = this;
            n2 = sprphn2.cfr_renamed_13947();
            sprlsn2 = new sprlsn();
            sprwvn3 = new sprwvn();
            f = (double)sprphn2.cfr_renamed_119.cfr_renamed_1942() <= 2.0 ? 2.0f : this.cfr_renamed_119.cfr_renamed_1942();
            sprlsn2.cfr_renamed_12625(true);
            float f2 = cfr_renamed_152[arg2];
            float f3 = cfr_renamed_152[arg3];
            switch (n2) {
                case 1: {
                    sprwvn sprwvn4 = sprwvn3;
                    while (false) {
                    }
                    sprwvn2 = sprwvn4;
                    sprovja.cfr_renamed_11658(sprwvn4, new sprfqn(cfr_renamed_107));
                    break block12;
                }
                case 2: {
                    sprwvn sprwvn5 = sprwvn3;
                    sprwvn2 = sprwvn5;
                    sprovja.cfr_renamed_11658(sprwvn5, new sprfqn(cfr_renamed_93));
                    break block12;
                }
                case 5: {
                    this.cfr_renamed_13948(sprwvn3, arg2, arg3);
                    f = 1.0f;
                    f2 = 1.0f;
                    f3 = 1.0f;
                    sprwvn2 = sprwvn3;
                    break block12;
                }
                case 3: {
                    sprwvn sprwvn6 = sprwvn3;
                    sprwvn2 = sprwvn6;
                    sprovja.cfr_renamed_11658(sprwvn6, new sprfqn(cfr_renamed_96));
                    break block12;
                }
                case 4: {
                    this.cfr_renamed_13949(sprwvn3);
                    sprwvn2 = sprwvn3;
                    break block12;
                }
                case 6: {
                    this.cfr_renamed_13950(arg1, arg0);
                    return;
                }
                case 0: {
                    break;
                }
                default: {
                    throw new IllegalStateException(sprqsfa.cfr_renamed_9("\tk7k3r2%0l2`|`2a|q%u9+"));
                }
            }
            sprwvn2 = sprwvn3;
        }
        if (sprwvn2.size() == 0) {
            return;
        }
        sprqgp sprqgp3 = sprqgp2 = new sprqgp();
        sprqgp sprqgp4 = sprqgp2;
        sprqgp4.cfr_renamed_13255(f2 *= f, f3 *= f, 0);
        sprqgp4.cfr_renamed_13466(0.0f, this.cfr_renamed_13951(n2, arg2, arg3), 1);
        sprqgp3.cfr_renamed_13952(arg1, 1);
        sprqgp3.cfr_renamed_13466(arg0.cfr_renamed_1980(), arg0.spr\u3181(), 1);
        int n3 = n = 0;
        while (n3 < sprwvn3.size()) {
            sprlw sprlw2;
            sprlw sprlw3 = sprlw2 = (sprlw)sprwvn3.get(n);
            sprlw3.cfr_renamed_12624(sprqgp2);
            sprlsn2.cfr_renamed_12507((sprvjn)((Object)sprlw3));
            n3 = ++n;
        }
        this.cfr_renamed_105.cfr_renamed_12507(sprlsn2);
    }

    private /* synthetic */ void cfr_renamed_13953(sprlsn arg0, float arg1) {
        sprlsn sprlsn2;
        int n;
        int n2;
        block2: {
            int n3;
            sprepn sprepn2 = new sprepn();
            sprgeja sprgeja2 = sprgeja.cfr_renamed_4;
            n2 = 0;
            n = arg0.cfr_renamed_11861();
            int n4 = n3 = n2;
            while (n4 < n) {
                sprgeja2 = sprepn2.cfr_renamed_13544(this.cfr_renamed_2 ? arg0.cfr_renamed_576(n3) : arg0.cfr_renamed_576(n - n3 - 1));
                if (sprgeja2.cfr_renamed_1942() >= arg1 || sprgeja2.cfr_renamed_1452() >= arg1) {
                    n2 = n3;
                    sprlsn2 = arg0;
                    break block2;
                }
                n4 = ++n3;
            }
            sprlsn2 = arg0;
        }
        sprlsn2.cfr_renamed_576(this.cfr_renamed_2 ? n2 : n - n2 - 1).cfr_renamed_13121(this);
    }

    private /* synthetic */ void cfr_renamed_13954(sprwvn arg0, sprxln arg1, sprffp arg2) {
        int n;
        int n2;
        sprphn sprphn2;
        this.cfr_renamed_119 = arg2.cfr_renamed_13616();
        if (!sprphn.cfr_renamed_13940(this.cfr_renamed_119)) {
            return;
        }
        this.cfr_renamed_105 = new sprxln();
        if (arg1.cfr_renamed_12571() != null) {
            this.cfr_renamed_105.cfr_renamed_12550(arg1.cfr_renamed_12571().cfr_renamed_12551());
        }
        this.cfr_renamed_112 = sprphn2.cfr_renamed_119.cfr_renamed_1942() <= 0.75f ? 0.75f : this.cfr_renamed_119.cfr_renamed_1942();
        float f = arg1.cfr_renamed_12571() == null ? 0.0f : arg1.cfr_renamed_12571().cfr_renamed_1942();
        sprphn sprphn3 = this;
        sprphn sprphn4 = this;
        sprphn3.cfr_renamed_86 = new sprwvn();
        sprphn3.cfr_renamed_145 = arg1.cfr_renamed_12571();
        int n3 = n2 = 0;
        while (n3 < arg1.cfr_renamed_11861()) {
            sprlsn sprlsn2 = (sprlsn)arg1.cfr_renamed_576(n2);
            if (!sprlsn2.cfr_renamed_13174() && sprlsn2.cfr_renamed_11861() != 0) {
                this.cfr_renamed_2 = true;
                this.cfr_renamed_13953(sprlsn2, f);
                this.cfr_renamed_2 = false;
                this.cfr_renamed_13953(sprlsn2, f);
            }
            n3 = ++n2;
        }
        if (this.cfr_renamed_105.cfr_renamed_11861() == 0 && this.cfr_renamed_86.size() == 0) {
            return;
        }
        sprwvn sprwvn2 = arg0;
        n2 = sprwvn2.size() + this.cfr_renamed_105.cfr_renamed_11861() + this.cfr_renamed_86.size();
        sprpxp.cfr_renamed_13955(sprwvn2, n2);
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_86.size()) {
            sprxln sprxln2 = (sprxln)this.cfr_renamed_86.get(n);
            sprovja.cfr_renamed_11658(arg0, spremn.cfr_renamed_13859(sprxln2, false));
            n4 = ++n;
        }
        int n5 = n = 0;
        while (n5 < this.cfr_renamed_105.cfr_renamed_11861()) {
            sprxln sprxln3 = new sprxln();
            sprxln3.cfr_renamed_12507(this.cfr_renamed_105.cfr_renamed_576(n));
            if (arg1.cfr_renamed_12571() != null) {
                sprxln3.cfr_renamed_12550(arg1.cfr_renamed_12571().cfr_renamed_12551());
            }
            sprxln3.cfr_renamed_12505(null);
            sprovja.cfr_renamed_11658(arg0, spremn.cfr_renamed_13859(sprxln3, false));
            n5 = ++n;
        }
    }

    public static void cfr_renamed_13956(sprwvn arg0, sprxln arg1, sprffp arg2) {
        if (arg2 == null) {
            return;
        }
        new sprphn().cfr_renamed_13954(arg0, arg1, arg2);
    }

    public static int cfr_renamed_13944(sprfqn arg0, boolean arg1) {
        int n;
        float f = 0.0f;
        int n2 = n = arg1 ? -1 : arg0.cfr_renamed_13187().cfr_renamed_11861();
        while (f < 0.7f) {
            int n3 = arg1 ? 1 : -1;
            int n4 = (n += n3) + n3;
            sprfqn sprfqn2 = arg0;
            sprsuja sprsuja2 = sprfqn2.cfr_renamed_13187().cfr_renamed_576(n);
            sprsuja sprsuja3 = sprfqn2.cfr_renamed_13187().cfr_renamed_576(n4);
            f = sprzlp.cfr_renamed_13957(sprsuja2, sprsuja3);
            boolean bl = arg1 && n4 == arg0.cfr_renamed_13187().cfr_renamed_11861() - 1 || !arg1 && n4 == 0;
            if (!bl) continue;
            if (f != 0.0f) break;
            return -1;
        }
        return n;
    }

    private /* synthetic */ void cfr_renamed_13958(sprxln arg0, sprxhn arg1) {
        if (arg1.cfr_renamed_13869()) {
            arg0.cfr_renamed_12505(null);
            if (this.cfr_renamed_145 != null) {
                arg0.cfr_renamed_12550(this.cfr_renamed_145.cfr_renamed_12551());
                return;
            }
        } else {
            sprxln sprxln2 = arg0;
            sprxln2.cfr_renamed_12505(this.cfr_renamed_145.cfr_renamed_12099());
            if (sprxln2.cfr_renamed_12571() != null) {
                arg0.cfr_renamed_12571().cfr_renamed_12572(arg0.cfr_renamed_12571().cfr_renamed_1942() * arg1.cfr_renamed_13959());
            }
            arg0.cfr_renamed_12550(null);
        }
    }

    private /* synthetic */ sprkjn cfr_renamed_13960() {
        if (this.cfr_renamed_2) {
            return this.cfr_renamed_119.cfr_renamed_13942().cfr_renamed_13961();
        }
        return this.cfr_renamed_119.cfr_renamed_13943().cfr_renamed_13961();
    }

    @Override
    public void cfr_renamed_13175(sprxnn arg0) {
        int n;
        int n2;
        sprsuja[] sprsujaArray;
        sprsuja[] sprsujaArray2 = new sprsuja[4];
        sprsujaArray2[0] = arg0.cfr_renamed_13167();
        sprsujaArray2[1] = arg0.cfr_renamed_13169();
        sprsujaArray2[2] = arg0.cfr_renamed_13170();
        sprsujaArray2[3] = arg0.cfr_renamed_13171();
        sprsuja[] sprsujaArray3 = sprsujaArray2;
        int n3 = sprsujaArray2.length - 1;
        int n4 = 0;
        int n5 = 1;
        if (this.cfr_renamed_2) {
            sprsujaArray = sprsujaArray3;
            sprphn sprphn2 = this;
            n2 = sprphn2.cfr_renamed_119.cfr_renamed_13942().cfr_renamed_1942();
            n = sprphn2.cfr_renamed_119.cfr_renamed_13942().cfr_renamed_806();
        } else {
            n4 = n3;
            n5 = -1;
            sprsujaArray = sprsujaArray3;
            sprphn sprphn3 = this;
            n2 = sprphn3.cfr_renamed_119.cfr_renamed_13943().cfr_renamed_1942();
            n = sprphn3.cfr_renamed_119.cfr_renamed_13943().cfr_renamed_806();
        }
        sprsuja sprsuja2 = sprsujaArray[n4];
        sprsuja sprsuja3 = sprsujaArray3[n4 + n5];
        int n6 = n4 + n5;
        sprsuja sprsuja4 = sprsuja2;
        while (sprsuja.cfr_renamed_13638(sprsuja4, sprsuja3) && n6 > 0 && n6 < n3) {
            sprsuja3 = sprsujaArray3[n6 += n5];
            sprsuja4 = sprsuja2;
        }
        sprsuja sprsuja5 = new sprsuja(sprsuja2.cfr_renamed_1980() - sprsuja3.cfr_renamed_1980(), sprsuja2.spr\u3181() - sprsuja3.spr\u3181());
        if (sprsuja5.spr\u3181() == 0.0f) {
            sprsuja5 = this.cfr_renamed_13962(arg0, sprsuja5, sprsuja2);
        }
        if (sprsuja5.cfr_renamed_29()) {
            return;
        }
        float f = sprphn.cfr_renamed_13945(sprsuja5);
        this.cfr_renamed_13946(sprsuja2, f, n2, n);
    }

    private /* synthetic */ void cfr_renamed_13948(sprwvn arg0, int arg1, int arg2) {
        sprphja sprphja2;
        sprphja sprphja3 = sprphja2 = cfr_renamed_79[arg1][arg2];
        float f = sprphja3.cfr_renamed_1942();
        float f2 = sprphja3.cfr_renamed_1452();
        float f3 = (this.cfr_renamed_112 < 2.0f ? 2.0f : this.cfr_renamed_112) * 3.5f;
        float f4 = 0.577f * f3;
        float[] fArray = new float[2];
        fArray[0] = 0.0f;
        fArray[1] = 0.0f;
        sprovja.cfr_renamed_11658(arg0, new sprfqn(fArray));
        sprsuja sprsuja2 = new sprsuja((f4 - this.cfr_renamed_112 * 0.25f) * f, (f3 + this.cfr_renamed_112 * 0.433f) * f2);
        sprwvn sprwvn2 = arg0;
        this.cfr_renamed_13939(sprwvn2, sprsuja2, 330.0, 180.0);
        float[] fArray2 = new float[2];
        fArray2[0] = 0.0f;
        fArray2[1] = 2.0f * this.cfr_renamed_112 * cfr_renamed_1[arg1][arg2];
        sprovja.cfr_renamed_11658(sprwvn2, new sprfqn(fArray2));
        sprsuja2 = new sprsuja(-sprsuja2.cfr_renamed_1980(), sprsuja2.spr\u3181());
        this.cfr_renamed_13939(arg0, sprsuja2, 30.0, 180.0);
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_13950(float arg0, sprsuja arg1) {
        sprkjn sprkjn2 = this.cfr_renamed_13960();
        switch (sprkjn2.cfr_renamed_13963()) {
            case 0: {
                this.cfr_renamed_13964((sprxhn)sprkjn2, arg1, arg0);
                return;
            }
            case 1: {
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    private /* synthetic */ sprsuja cfr_renamed_13962(sprxnn arg0, sprsuja arg1, sprsuja arg2) {
        sprphn sprphn2;
        sprsuja sprsuja2;
        if (this.cfr_renamed_2) {
            sprsuja2 = arg0.cfr_renamed_13167();
            sprphn2 = this;
        } else {
            sprsuja2 = arg0.cfr_renamed_13171();
            sprphn2 = this;
        }
        sprngp sprngp2 = new sprngp(sprsuja2, sprphn2.cfr_renamed_2 ? arg0.cfr_renamed_13171() : arg0.cfr_renamed_13167());
        if (sprngp2.cfr_renamed_13965() || sprrgga.cfr_renamed_13562(sprngp2.cfr_renamed_1150()) > 30.0f) {
            float f = 0.075f;
            sprsuja sprsuja3 = arg0.cfr_renamed_13799(this.cfr_renamed_2 ? f : 1.0f - f);
            arg1 = new sprsuja(arg2.cfr_renamed_1980() - sprsuja3.cfr_renamed_1980(), arg2.spr\u3181() - sprsuja3.spr\u3181());
        }
        return arg1;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ float cfr_renamed_13951(int arg0, int arg1, int arg2) {
        switch (arg0) {
            case 5: {
                return this.cfr_renamed_112 * cfr_renamed_4[arg1][arg2];
            }
        }
        return 0.0f;
    }

    private static /* synthetic */ float cfr_renamed_13945(sprsuja sprsuja2) {
        sprsuja arg0;
        sprsuja sprsuja3 = arg0;
        float f = (float)spryxp.cfr_renamed_13838(sprrgga.cfr_renamed_13966(-sprsuja2.spr\u3181() / (float)sprrgga.cfr_renamed_12687(sprsuja2.cfr_renamed_1980() * sprsuja3.cfr_renamed_1980() + arg0.spr\u3181() * arg0.spr\u3181())));
        if (sprsuja3.cfr_renamed_1980() < 0.0f) {
            f = 360.0f - f;
        }
        return f;
    }

    static {
        float[] fArray = new float[6];
        fArray[0] = -1.5f;
        fArray[1] = 3.0f;
        fArray[2] = 0.0f;
        fArray[3] = 0.0f;
        fArray[4] = 1.5f;
        fArray[5] = 3.0f;
        cfr_renamed_107 = fArray;
        float[] fArray2 = new float[8];
        fArray2[0] = -1.5f;
        fArray2[1] = 3.0f;
        fArray2[2] = 0.0f;
        fArray2[3] = 0.0f;
        fArray2[4] = 1.5f;
        fArray2[5] = 3.0f;
        fArray2[6] = 0.0f;
        fArray2[7] = 1.8000001f;
        cfr_renamed_93 = fArray2;
        float[] fArray3 = new float[8];
        fArray3[0] = 0.0f;
        fArray3[1] = -1.5f;
        fArray3[2] = 1.5f;
        fArray3[3] = 0.0f;
        fArray3[4] = 0.0f;
        fArray3[5] = 1.5f;
        fArray3[6] = -1.5f;
        fArray3[7] = 0.0f;
        cfr_renamed_96 = fArray3;
        float[] fArray4 = new float[3];
        fArray4[0] = 0.65f;
        fArray4[1] = 1.0f;
        fArray4[2] = 1.68f;
        cfr_renamed_152 = fArray4;
        sprphja[][] sprphjaArrayArray = new sprphja[3][];
        sprphja[] sprphjaArray = new sprphja[3];
        sprphjaArray[0] = new sprphja(0.7f, 0.75f);
        sprphjaArray[1] = new sprphja(0.7f, 1.1f);
        sprphjaArray[2] = new sprphja(0.7f, 1.6f);
        sprphjaArrayArray[0] = sprphjaArray;
        sprphja[] sprphjaArray2 = new sprphja[3];
        sprphjaArray2[0] = new sprphja(1.0f, 0.65f);
        sprphjaArray2[1] = new sprphja(0.97f, 1.0f);
        sprphjaArray2[2] = new sprphja(1.0f, 1.5f);
        sprphjaArrayArray[1] = sprphjaArray2;
        sprphja[] sprphjaArray3 = new sprphja[3];
        sprphjaArray3[0] = new sprphja(1.4f, 0.65f);
        sprphjaArray3[1] = new sprphja(1.4f, 0.97f);
        sprphjaArray3[2] = new sprphja(1.4f, 1.4f);
        sprphjaArrayArray[2] = sprphjaArray3;
        cfr_renamed_79 = sprphjaArrayArray;
        float[][] fArrayArray = new float[3][];
        float[] fArray5 = new float[3];
        fArray5[0] = 0.0f;
        fArray5[1] = -0.3f;
        fArray5[2] = 0.6f;
        fArrayArray[0] = fArray5;
        float[] fArray6 = new float[3];
        fArray6[0] = 0.33f;
        fArray6[1] = 0.0f;
        fArray6[2] = -0.4f;
        fArrayArray[1] = fArray6;
        float[] fArray7 = new float[3];
        fArray7[0] = 0.33f;
        fArray7[1] = 0.2f;
        fArray7[2] = 0.0f;
        fArrayArray[2] = fArray7;
        cfr_renamed_4 = fArrayArray;
        float[][] fArrayArray2 = new float[3][];
        float[] fArray8 = new float[3];
        fArray8[0] = 0.6f;
        fArray8[1] = 1.5f;
        fArray8[2] = 2.0f;
        fArrayArray2[0] = fArray8;
        float[] fArray9 = new float[3];
        fArray9[0] = 0.6f;
        fArray9[1] = 1.0f;
        fArray9[2] = 1.4f;
        fArrayArray2[1] = fArray9;
        float[] fArray10 = new float[3];
        fArray10[0] = 0.6f;
        fArray10[1] = 0.8f;
        fArray10[2] = 1.0f;
        fArrayArray2[2] = fArray10;
        cfr_renamed_1 = fArrayArray2;
    }

    private /* synthetic */ void cfr_renamed_13964(sprxhn arg0, sprsuja arg1, float arg2) {
        if (arg0.cfr_renamed_6493() == null) {
            throw new NullPointerException("path");
        }
        sprxln sprxln2 = arg0.cfr_renamed_6493().cfr_renamed_12099();
        if (sprxln2.cfr_renamed_13094() == null) {
            sprxln2.cfr_renamed_12511(new sprqgp());
        }
        arg2 = (float)spryxp.cfr_renamed_13967(arg2 - 180.0f);
        sprqgp sprqgp2 = new sprqgp();
        sprphn sprphn2 = this;
        float f = sprphn2.cfr_renamed_119.cfr_renamed_1942() * arg0.cfr_renamed_13959();
        sprqgp sprqgp3 = sprqgp2;
        float f2 = f;
        sprqgp2.cfr_renamed_13255(f2, f2, 1);
        sprqgp3.cfr_renamed_13952(arg2, 1);
        sprqgp3.cfr_renamed_13466(arg1.cfr_renamed_1980(), arg1.spr\u3181(), 1);
        sprqgp2.cfr_renamed_12593(sprxln2.cfr_renamed_13094());
        sprxln sprxln3 = sprxln2;
        sprxln3.cfr_renamed_12624(sprqgp2);
        sprxln3.cfr_renamed_12511(null);
        sprphn2.cfr_renamed_13958(sprxln2, arg0);
        sprovja.cfr_renamed_11658(sprphn2.cfr_renamed_86, sprxln2);
    }

    private /* synthetic */ void cfr_renamed_13949(sprwvn arg0) {
        int n;
        sprikn sprikn2;
        sprikn sprikn3 = sprikn2 = new sprikn();
        sprikn sprikn4 = sprikn2;
        sprikn4.cfr_renamed_13849(new sprsuja(-1.5f, -1.5f));
        sprikn4.cfr_renamed_13598(new sprphja(3.0f, 3.0f));
        sprikn3.cfr_renamed_13850(0.0);
        sprikn3.cfr_renamed_13842(360.0);
        sprhjn sprhjn2 = sprikn3.cfr_renamed_13165();
        int n2 = n = 0;
        while (n2 < sprhjn2.cfr_renamed_11861()) {
            sprovja.cfr_renamed_11658(arg0, new sprxnn(sprhjn2, n++));
            n2 = n;
        }
    }

    private /* synthetic */ int cfr_renamed_13947() {
        if (this.cfr_renamed_2) {
            return this.cfr_renamed_119.cfr_renamed_13942().cfr_renamed_324();
        }
        return this.cfr_renamed_119.cfr_renamed_13943().cfr_renamed_324();
    }
}

