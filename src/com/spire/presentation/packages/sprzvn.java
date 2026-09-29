/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprebp;
import com.spire.presentation.packages.sprhxn;
import com.spire.presentation.packages.sprpdi;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvwz;
import com.spire.presentation.packages.spryjn;

@sprtea
public class sprzvn {
    private float cfr_renamed_119;
    private float cfr_renamed_91;
    private String cfr_renamed_0;
    private float cfr_renamed_1;
    private int cfr_renamed_2;
    private float cfr_renamed_3;
    private float cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_14627(spryjn arg0) {
        sprzvn sprzvn2 = this;
        arg0.cfr_renamed_14319(sprpdi.cfr_renamed_9("!pJvZpKv"), sprzvn2.cfr_renamed_0, sprhxn.cfr_renamed_14576(sprzvn2.cfr_renamed_2));
    }

    private /* synthetic */ void cfr_renamed_14628(spryjn arg0) {
        spryjn spryjn2;
        block8: {
            sprzvn sprzvn2 = this;
            String string = sprebp.cfr_renamed_14063((int)sprzvn2.cfr_renamed_91);
            String string2 = sprebp.cfr_renamed_14063((int)sprzvn2.cfr_renamed_3);
            String string3 = sprebp.cfr_renamed_14063((int)sprzvn2.cfr_renamed_1);
            String string4 = sprebp.cfr_renamed_14063((int)sprzvn2.cfr_renamed_119);
            String string5 = spryjn.cfr_renamed_14078(sprzvn2.cfr_renamed_4);
            switch (sprzvn2.cfr_renamed_2) {
                case 0: {
                    spryjn spryjn3 = arg0;
                    while (false) {
                    }
                    spryjn2 = spryjn3;
                    spryjn3.cfr_renamed_14314(sprvwz.cfr_renamed_9("\u0013r\u0003t\u0013r\u0002t\u0013r\u0001t"), string, string4, string5);
                    break block8;
                }
                case 1: 
                case 5: {
                    break;
                }
                case 2: 
                case 6: {
                    spryjn spryjn4 = arg0;
                    spryjn2 = spryjn4;
                    spryjn4.cfr_renamed_14305(sprpdi.cfr_renamed_9("ZpJv"), string4);
                    break block8;
                }
                case 3: 
                case 7: {
                    spryjn spryjn5 = arg0;
                    spryjn2 = spryjn5;
                    spryjn5.cfr_renamed_14305(sprvwz.cfr_renamed_9("\u0013r\u0003t"), string);
                    break block8;
                }
                case 4: {
                    spryjn2 = arg0;
                    spryjn spryjn6 = arg0;
                    spryjn6.cfr_renamed_14319(sprpdi.cfr_renamed_9("ZpJvZpKv"), string, string2);
                    spryjn6.cfr_renamed_14319(sprvwz.cfr_renamed_9("r\u0003t\u0013r\u0002t"), string3, string4);
                    break block8;
                }
                default: {
                    throw new IllegalArgumentException(sprpdi.cfr_renamed_9("[\u001by\u001bf\u001f\u007f\u001fyZe\u001bf\u001f1ZM\u0013\u007f.r\nn"));
                }
            }
            spryjn2 = arg0;
        }
        spryjn2.cfr_renamed_11835("]");
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprzvn(String string, int n, float f) {
        void arg1;
        void arg0;
        sprzvn sprzvn2 = this;
        this.cfr_renamed_0 = arg0;
        sprzvn2.cfr_renamed_2 = arg1;
        sprzvn2.cfr_renamed_119 = f;
    }

    @sprtea
    public static sprzvn cfr_renamed_14629(String arg0) {
        return new sprzvn(arg0, 1);
    }

    @sprtea
    public static sprzvn cfr_renamed_14630(String arg0, float arg1, float arg2, float arg3) {
        if (arg3 < 0.0f) {
            throw new IllegalArgumentException(sprvwz.cfr_renamed_9("if\\duhP}\\{"));
        }
        sprzvn sprzvn2 = new sprzvn(arg0, 0);
        sprzvn2.cfr_renamed_91 = arg1;
        sprzvn2.cfr_renamed_119 = arg2;
        sprzvn2.cfr_renamed_4 = arg3;
        return sprzvn2;
    }

    @sprtea
    public static sprzvn cfr_renamed_14631(String arg0, float arg1) {
        new sprzvn(arg0, 2).cfr_renamed_119 = arg1;
        return new sprzvn(arg0, 2);
    }

    @sprtea
    public static sprzvn cfr_renamed_14632(String arg0, float arg1, float arg2, float arg3, float arg4) {
        sprzvn sprzvn2;
        sprzvn sprzvn3 = sprzvn2 = new sprzvn(arg0, 4);
        sprzvn3.cfr_renamed_91 = arg1;
        sprzvn3.cfr_renamed_1 = arg3;
        sprzvn2.cfr_renamed_3 = arg2;
        sprzvn2.cfr_renamed_119 = arg4;
        return sprzvn2;
    }

    @sprtea
    public static sprzvn cfr_renamed_14448(String arg0, sprsuja arg1) {
        return sprzvn.cfr_renamed_14630(arg0, arg1.cfr_renamed_1980(), arg1.spr\u3181(), 0.0f);
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public void cfr_renamed_14441(spryjn spryjn2) {
        void arg0;
        sprzvn sprzvn2 = this;
        sprzvn2.cfr_renamed_14627((spryjn)arg0);
        sprzvn2.cfr_renamed_14628(spryjn2);
    }

    @sprtea
    public static sprzvn cfr_renamed_14633(String arg0, float arg1) {
        new sprzvn(arg0, 6).cfr_renamed_119 = arg1;
        return new sprzvn(arg0, 6);
    }

    @sprtea
    public static sprzvn cfr_renamed_14634(String arg0) {
        return new sprzvn(arg0, 5);
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprzvn(String string, int n) {
        void arg0;
        sprzvn sprzvn2 = this;
        sprzvn2.cfr_renamed_0 = arg0;
        sprzvn2.cfr_renamed_2 = n;
    }

    @sprtea
    public static sprzvn cfr_renamed_14635(String arg0, float arg1) {
        new sprzvn(arg0, 3).cfr_renamed_91 = arg1;
        return new sprzvn(arg0, 3);
    }

    @sprtea
    public static sprzvn cfr_renamed_14636(String arg0, float arg1) {
        new sprzvn(arg0, 7).cfr_renamed_91 = arg1;
        return new sprzvn(arg0, 7);
    }
}

