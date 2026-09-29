/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprann;
import com.spire.presentation.packages.sprbrp;
import com.spire.presentation.packages.sprdmn;
import com.spire.presentation.packages.sprewn;
import com.spire.presentation.packages.sprfy;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprhhp;
import com.spire.presentation.packages.sprjyn;
import com.spire.presentation.packages.sprpao;
import com.spire.presentation.packages.sprpbo;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprqkn;
import com.spire.presentation.packages.sprqxz;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryjn;
import com.spire.presentation.packages.sprznp;

@sprtea
public class sprstn
extends sprjyn {
    private String cfr_renamed_79;
    private int cfr_renamed_132;
    private static char[] cfr_renamed_102;
    private float cfr_renamed_93;
    private float cfr_renamed_86;
    private String cfr_renamed_152;
    private sprgeja cfr_renamed_112;
    private boolean cfr_renamed_119;
    private static final byte cfr_renamed_91 = 12;
    private static final byte cfr_renamed_0 = 25;
    private sprhhp cfr_renamed_1;
    private float cfr_renamed_2;
    private sprpbo cfr_renamed_3;
    private boolean cfr_renamed_4;

    private /* synthetic */ sprpbo cfr_renamed_14800() {
        sprpbo sprpbo2;
        sprpbo sprpbo3 = sprpbo2 = new sprpbo(this.cfr_renamed_2820());
        sprpbo sprpbo4 = sprpbo2;
        sprpbo3.cfr_renamed_13579(new sprgeja(0.0f, 0.0f, this.cfr_renamed_13550().cfr_renamed_1942(), this.cfr_renamed_13550().cfr_renamed_1452()));
        sprpbo3.cfr_renamed_14292(this.cfr_renamed_14801());
        return sprpbo3;
    }

    private /* synthetic */ sprgeja cfr_renamed_14802(sprgeja arg0) {
        int n = sprraia.cfr_renamed_13378(this.cfr_renamed_152, cfr_renamed_102).length;
        sprgeja sprgeja2 = arg0;
        float f = sprgeja2.cfr_renamed_1452();
        float f2 = sprgeja2.cfr_renamed_1942();
        float f3 = this.cfr_renamed_93 * (float)n;
        float f4 = f2 + 3.5f;
        float f5 = sprrgga.cfr_renamed_13566(f3, f) + 3.5f;
        return new sprgeja(arg0.cfr_renamed_1980() - 1.75f, arg0.spr\u3181() - 1.75f, f4, f5);
    }

    public static sprstn cfr_renamed_14803(sprpao arg0, sprann arg1) {
        sprhhp sprhhp2 = arg0.cfr_renamed_2820().cfr_renamed_13097().cfr_renamed_13400().cfr_renamed_14804("Times New Roman", 12.0f, 0);
        float f = sprhhp2.cfr_renamed_13265();
        float f2 = f - sprhhp2.cfr_renamed_13744();
        sprann sprann2 = arg1;
        return new sprstn(arg0, sprann2, true, sprann2.cfr_renamed_13968(), sprhhp2, arg1.cfr_renamed_13969(), f, f2, arg1.cfr_renamed_13970());
    }

    static {
        char[] cArray = new char[2];
        cArray[0] = 10;
        cArray[1] = 13;
        cfr_renamed_102 = cArray;
    }

    private /* synthetic */ float cfr_renamed_14805() {
        return this.cfr_renamed_112.cfr_renamed_1452() - this.cfr_renamed_2 - 1.75f;
    }

    @Override
    public void cfr_renamed_14806(spryjn arg0) {
        spryjn spryjn2;
        block4: {
            block3: {
                block2: {
                    if (this.cfr_renamed_132 != 0) {
                        arg0.cfr_renamed_14094(sprqxz.cfr_renamed_9("`\u0007.2\u0003/!"), this.cfr_renamed_132);
                    }
                    if (!this.cfr_renamed_119) break block2;
                    if ("".equals(this.cfr_renamed_79)) break block3;
                    spryjn spryjn3 = arg0;
                    spryjn2 = spryjn3;
                    spryjn3.cfr_renamed_14286(sprbrp.cfr_renamed_9("\u0005n|"), this.cfr_renamed_79);
                    spryjn3.cfr_renamed_14286(sprqxz.cfr_renamed_9("`\u000e\u001c"), sprbrp.cfr_renamed_9("ZER^\u0006\n\r\u0018L^\u001ckNC]F"));
                    break block4;
                }
                arg0.cfr_renamed_14310((String)cfr_renamed_119, this.cfr_renamed_14807(), false);
                if (!"".equals(this.cfr_renamed_79)) {
                    arg0.cfr_renamed_14286((String)cfr_renamed_93, this.cfr_renamed_79);
                }
            }
            spryjn2 = arg0;
        }
        spryjn2.cfr_renamed_14286(sprqxz.cfr_renamed_9("e\u0019"), this.cfr_renamed_152);
        spryjn spryjn4 = arg0;
        spryjn spryjn5 = arg0;
        spryjn5.cfr_renamed_11835((String)cfr_renamed_4);
        spryjn5.cfr_renamed_14086();
        spryjn4.cfr_renamed_14058(cfr_renamed_107);
        spryjn4.cfr_renamed_11835(this.cfr_renamed_3.cfr_renamed_4570());
        spryjn4.cfr_renamed_14061();
    }

    private /* synthetic */ int cfr_renamed_14808() {
        if (this.cfr_renamed_4) {
            return 1;
        }
        return 0;
    }

    @Override
    public int cfr_renamed_14809() {
        int n = this.cfr_renamed_14808() << 12;
        return (n |= (this.cfr_renamed_119 ? 1 : 0) << 25) | super.cfr_renamed_14809();
    }

    @Override
    public int cfr_renamed_14810() {
        return 1;
    }

    @Override
    public void cfr_renamed_14295(sprfy arg0) {
        sprstn sprstn2 = this;
        super.cfr_renamed_14295(arg0);
        sprstn2.cfr_renamed_3.cfr_renamed_14291(arg0);
    }

    public static sprstn cfr_renamed_14811(sprpao arg0, sprdmn arg1) {
        sprdmn sprdmn2 = arg1;
        return new sprstn(arg0, sprdmn2, false, arg1.cfr_renamed_13969(), sprdmn2.cfr_renamed_13257(), arg1.cfr_renamed_13969(), arg1.cfr_renamed_13972(), arg1.cfr_renamed_13971(), arg1.cfr_renamed_13970());
    }

    private /* synthetic */ sprstn(sprpao arg0, sprqkn arg1, boolean arg2, String arg3, sprhhp arg4, String arg5, float arg6, float arg7, int arg8) {
        sprstn sprstn2 = this;
        sprstn sprstn3 = this;
        sprstn sprstn4 = this;
        super(arg0, arg1);
        this.cfr_renamed_119 = arg2;
        sprstn4.cfr_renamed_79 = arg3;
        sprstn4.cfr_renamed_1 = arg4;
        sprstn3.cfr_renamed_152 = arg5;
        sprstn3.cfr_renamed_93 = arg6;
        this.cfr_renamed_2 = arg7;
        sprstn2.cfr_renamed_132 = arg8;
        sprstn2.cfr_renamed_4 = sprraia.cfr_renamed_13378(this.cfr_renamed_152, cfr_renamed_102).length > 1;
        sprstn sprstn5 = this;
        sprstn5.cfr_renamed_112 = sprstn5.cfr_renamed_14802(arg1.cfr_renamed_13550());
        sprstn5.cfr_renamed_86 = sprstn5.cfr_renamed_14805();
        sprstn5.cfr_renamed_3 = sprstn5.cfr_renamed_14800();
    }

    private /* synthetic */ float cfr_renamed_14812() {
        sprstn sprstn2 = this;
        sprstn sprstn3 = this;
        int n = sprstn2.cfr_renamed_1.cfr_renamed_13261().cfr_renamed_13317() / 2 - sprstn3.cfr_renamed_1.cfr_renamed_13261().cfr_renamed_14813().cfr_renamed_13491();
        float f = sprstn2.cfr_renamed_1.cfr_renamed_13261().cfr_renamed_13749(n, this.cfr_renamed_1.cfr_renamed_13265());
        return sprstn3.cfr_renamed_13550().cfr_renamed_1452() / 2.0f - f;
    }

    @Override
    @sprtea
    public sprgeja cfr_renamed_13550() {
        return this.cfr_renamed_112;
    }

    private /* synthetic */ String cfr_renamed_14807() {
        sprstn sprstn2 = this;
        sprstn sprstn3 = this;
        String string = sprstn2.cfr_renamed_14814(sprstn2.cfr_renamed_1, sprstn3.cfr_renamed_13976());
        String string2 = "";
        if (!sprstn3.cfr_renamed_4) {
            float f = this.cfr_renamed_86 - this.cfr_renamed_14812();
            Object[] objectArray = new Object[1];
            objectArray[0] = spryjn.cfr_renamed_14078(f);
            string2 = sprraia.cfr_renamed_11562(sprbrp.cfr_renamed_9("\r\n\f\n\f\n\r\n\f\nG\u001aA\nhG"), objectArray);
        }
        Object[] objectArray = new Object[2];
        objectArray[0] = string;
        objectArray[1] = string2;
        return sprraia.cfr_renamed_11562(sprqxz.cfr_renamed_9("1\u007f7o1~7o"), objectArray);
    }

    private /* synthetic */ sprpdja cfr_renamed_14801() {
        spryjn spryjn2;
        sprpdja sprpdja2;
        block3: {
            int n;
            sprpdja2 = new sprpdja();
            spryjn spryjn3 = new spryjn(sprpdja2);
            sprstn sprstn2 = this;
            float f = sprstn2.cfr_renamed_86;
            sprstn sprstn3 = this;
            sprstn.cfr_renamed_14815(spryjn3);
            sprstn.cfr_renamed_14816(spryjn3, sprstn3.cfr_renamed_13976(), false);
            sprewn sprewn2 = sprstn2.cfr_renamed_14817(spryjn3, sprstn3.cfr_renamed_1);
            sprstn.cfr_renamed_14818(spryjn3, f);
            String[] stringArray = sprraia.cfr_renamed_13378(sprstn2.cfr_renamed_152, cfr_renamed_102);
            int n2 = n = 0;
            while (n2 < stringArray.length) {
                if (f < 0.0f) {
                    spryjn2 = spryjn3;
                    break block3;
                }
                if (sprznp.cfr_renamed_12328(stringArray[n])) {
                    sprstn.cfr_renamed_14819(spryjn3, 0.0f, n == 0 ? 0.0f : -this.cfr_renamed_93);
                    sprstn.cfr_renamed_14820(spryjn3, stringArray[n], sprewn2);
                }
                f -= this.cfr_renamed_93;
                n2 = ++n;
            }
            spryjn2 = spryjn3;
        }
        sprstn.cfr_renamed_14821(spryjn2);
        return sprpdja2;
    }
}

