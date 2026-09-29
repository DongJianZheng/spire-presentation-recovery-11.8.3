/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprayn;
import com.spire.presentation.packages.sprcop;
import com.spire.presentation.packages.sprhbga;
import com.spire.presentation.packages.sprhhp;
import com.spire.presentation.packages.sprkzn;
import com.spire.presentation.packages.sprpmn;
import com.spire.presentation.packages.sprpon;
import com.spire.presentation.packages.sprqjn;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprthn;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprzyn;
import java.util.Iterator;

@sprtea
public class sprmxn {
    private sprkzn cfr_renamed_4;

    private /* synthetic */ sprayn cfr_renamed_14966(sprthn arg0) {
        sprmxn sprmxn2 = this;
        sprayn sprayn2 = sprmxn2.cfr_renamed_14967(arg0.cfr_renamed_13257());
        sprmxn2.cfr_renamed_13380().cfr_renamed_14968(sprayn2.cfr_renamed_14969());
        sprmxn2.cfr_renamed_13380().cfr_renamed_14970((byte)-88);
        sprmxn2.cfr_renamed_13380().cfr_renamed_14971(65535);
        sprmxn2.cfr_renamed_13380().cfr_renamed_14970((byte)-86);
        sprmxn2.cfr_renamed_13380().cfr_renamed_14972(arg0.cfr_renamed_13257().cfr_renamed_13265());
        sprmxn2.cfr_renamed_13380().cfr_renamed_14970((byte)-90);
        sprmxn2.cfr_renamed_13380().cfr_renamed_14973((byte)111);
        return sprayn2;
    }

    private /* synthetic */ sprayn cfr_renamed_14967(sprhhp arg0) {
        return this.cfr_renamed_4.cfr_renamed_2524().cfr_renamed_14832(arg0);
    }

    @sprtea
    public void cfr_renamed_14974(sprthn arg0) {
        if (arg0.cfr_renamed_12553().cfr_renamed_29() && arg0.cfr_renamed_13268().cfr_renamed_29()) {
            return;
        }
        sprpon[] sprponArray = arg0.cfr_renamed_13256();
        if (sprponArray != null) {
            this.cfr_renamed_14975(arg0, sprponArray);
            return;
        }
        this.cfr_renamed_13386(arg0);
    }

    private /* synthetic */ sprzyn cfr_renamed_13380() {
        return this.cfr_renamed_4.cfr_renamed_13380();
    }

    private /* synthetic */ void cfr_renamed_14975(sprthn arg0, sprpon[] arg1) {
        boolean bl;
        sprmxn sprmxn2 = this;
        sprayn sprayn2 = sprmxn2.cfr_renamed_14966(arg0);
        sprvrx sprvrx2 = new sprvrx();
        sprvrx sprvrx3 = new sprvrx();
        sprmxn2.cfr_renamed_14976(arg0, arg1, sprayn2, sprvrx3, sprvrx2);
        Float[] floatArray = sprhbga.cfr_renamed_14977(sprvrx2.toArray(), null);
        int[] nArray = sprhbga.cfr_renamed_14978(sprvrx3.toArray(), null);
        boolean bl2 = bl = arg0.cfr_renamed_13094() != null && !arg0.cfr_renamed_13094().cfr_renamed_13656();
        if (!arg0.cfr_renamed_12553().cfr_renamed_29()) {
            if (bl) {
                float f = 0.0f;
                int n = 0;
                int n2 = nArray.length;
                int n3 = n;
                while (n3 < n2) {
                    float f2 = arg0.cfr_renamed_13110().cfr_renamed_1980() + (f += n == 0 ? 0.0f : floatArray[n - 1].floatValue());
                    sprthn sprthn2 = arg0;
                    sprsuja sprsuja2 = arg0.cfr_renamed_13094().cfr_renamed_13791(new sprsuja(f2, this.cfr_renamed_4.cfr_renamed_14979().cfr_renamed_13093() ? -sprthn2.cfr_renamed_13110().spr\u3181() : sprthn2.cfr_renamed_13110().spr\u3181()));
                    int[] nArray2 = new int[1];
                    nArray2[0] = nArray[n];
                    this.cfr_renamed_14980(sprsuja2, nArray2, null, false, arg0.cfr_renamed_12553());
                    n3 = ++n;
                }
            } else {
                this.cfr_renamed_14980(arg0.cfr_renamed_13110(), nArray, floatArray, false, arg0.cfr_renamed_12553());
            }
        }
    }

    private /* synthetic */ void cfr_renamed_14976(sprthn arg0, sprpon[] arg1, sprayn arg2, sprvrx arg3, sprvrx arg4) {
        int n;
        sprpon[] sprponArray = arg1;
        int n2 = arg1.length;
        int n3 = n = 0;
        while (n3 < n2) {
            sprpon sprpon2 = sprponArray[n];
            if (sprpon2.cfr_renamed_13078() != 0) {
                int n4;
                int n5;
                Object object;
                int n6;
                boolean bl;
                boolean bl2 = bl = sprpon2.cfr_renamed_13079().length != 1 || sprpon2.cfr_renamed_13027().length != 1;
                if (bl) {
                    int n7 = n6 = 0;
                    while (n7 < sprpon2.cfr_renamed_13027().length) {
                        int n8;
                        sprayn sprayn2;
                        int[] nArray;
                        object = sprpon2.cfr_renamed_13027()[n6];
                        n5 = ((sprqjn)object).cfr_renamed_13072();
                        if (n6 >= sprpon2.cfr_renamed_13079().length) {
                            int[] nArray2 = new int[1];
                            nArray2[0] = sprpon2.cfr_renamed_13079()[sprpon2.cfr_renamed_13079().length - 1];
                            nArray = nArray2;
                            sprayn2 = arg2;
                        } else {
                            if (n6 == sprpon2.cfr_renamed_13027().length - 1) {
                                nArray = new int[sprpon2.cfr_renamed_13079().length - n6];
                                int n9 = n8 = 0;
                                while (n9 < nArray.length) {
                                    int n10 = n8++;
                                    nArray[n10] = sprpon2.cfr_renamed_13079()[n6 + n10];
                                    n9 = n8;
                                }
                            } else {
                                int[] nArray3 = new int[1];
                                nArray3[0] = sprpon2.cfr_renamed_13079()[n6];
                                nArray = nArray3;
                            }
                            sprayn2 = arg2;
                        }
                        n8 = sprayn2.cfr_renamed_13411().cfr_renamed_13325(((sprqjn)object).cfr_renamed_13072());
                        sprayn sprayn3 = arg2;
                        n4 = sprayn3.cfr_renamed_13411().cfr_renamed_14126(nArray);
                        sprayn3.cfr_renamed_13411().cfr_renamed_13326(n4, n8);
                        float f = ((sprqjn)object).cfr_renamed_13070(arg0.cfr_renamed_13257().cfr_renamed_13261().cfr_renamed_13317(), arg0.cfr_renamed_13257().cfr_renamed_13265());
                        arg4.add(Float.valueOf(f));
                        arg3.add(n4);
                        n7 = ++n6;
                    }
                } else {
                    int n11;
                    n6 = 0;
                    object = sprpon2.cfr_renamed_13027();
                    n5 = ((sprqjn[])object).length;
                    int n12 = n11 = 0;
                    while (n12 < n5) {
                        sprqjn sprqjn2 = object[n11];
                        sprayn sprayn4 = arg2;
                        n4 = sprayn4.cfr_renamed_13411().cfr_renamed_13325(sprqjn2.cfr_renamed_13072());
                        int n13 = sprpon2.cfr_renamed_13079()[n6];
                        sprayn4.cfr_renamed_13411().cfr_renamed_13326(n13, n4);
                        arg4.add(Float.valueOf(sprqjn2.cfr_renamed_13070(arg0.cfr_renamed_13257().cfr_renamed_13261().cfr_renamed_13317(), arg0.cfr_renamed_13257().cfr_renamed_13265())));
                        ++n6;
                        arg3.add(n13);
                        n12 = ++n11;
                    }
                }
            }
            n3 = ++n;
        }
    }

    @sprtea
    public sprmxn(sprkzn sprkzn2) {
        this.cfr_renamed_4 = sprkzn2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ 2;
        int cfr_ignored_0 = 1 << 3 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ (2 << 2 ^ 1);
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

    private static /* synthetic */ void cfr_renamed_14981(sprthn arg0, sprayn arg1, int[] arg2, Float[] arg3) {
        Iterator iterator;
        sprpmn sprpmn2 = null;
        if (null != arg0.cfr_renamed_12567()) {
            sprpmn2 = new sprpmn(arg0.cfr_renamed_12567());
        }
        int n = 0;
        Iterator iterator2 = iterator = new sprcop(arg0.cfr_renamed_13030()).iterator();
        while (iterator2.hasNext()) {
            int n2 = (Integer)iterator.next();
            int n3 = n2;
            if (n3 > 65535) {
                n3 = -1;
            }
            int n4 = arg2[n] = n3 < 0 ? 0 : n3;
            if (null != sprpmn2) {
                int n5 = n;
                arg3[n5] = Float.valueOf(sprpmn2.cfr_renamed_13353(n) + sprpmn2.cfr_renamed_13354(n5));
            } else {
                arg3[n] = Float.valueOf(arg0.cfr_renamed_13257().cfr_renamed_14982(n2));
            }
            ++n;
            iterator2 = iterator;
        }
    }

    private /* synthetic */ void cfr_renamed_14983(sprthn arg0, sprayn arg1, int[] arg2, Float[] arg3, boolean arg4, sprwbp arg5) {
        Iterator iterator;
        int n = 0;
        float f = 0.0f;
        Iterator iterator2 = iterator = new sprcop(arg0.cfr_renamed_13030()).iterator();
        while (iterator2.hasNext()) {
            int n2 = (Integer)iterator.next();
            sprsuja sprsuja2 = arg0.cfr_renamed_13094().cfr_renamed_13791(new sprsuja(arg0.cfr_renamed_13110().cfr_renamed_1980() + (f += n == 0 ? 0.0f : arg3[n - 1].floatValue()), this.cfr_renamed_4.cfr_renamed_14979().cfr_renamed_13093() ? -arg0.cfr_renamed_13110().spr\u3181() : arg0.cfr_renamed_13110().spr\u3181()));
            iterator2 = iterator;
            int[] nArray = new int[1];
            nArray[0] = arg2[n];
            ++n;
            this.cfr_renamed_14980(sprsuja2, nArray, null, arg4, arg5);
        }
    }

    private /* synthetic */ void cfr_renamed_14980(sprsuja arg0, int[] arg1, Float[] arg2, boolean arg3, sprwbp arg4) {
        boolean bl = arg3;
        this.cfr_renamed_4.cfr_renamed_14984().cfr_renamed_14360(arg4, bl);
        if (bl) {
            this.cfr_renamed_4.cfr_renamed_14984().cfr_renamed_14985(false);
        }
        sprmxn sprmxn2 = this;
        sprmxn2.cfr_renamed_13166(arg0);
        sprmxn2.cfr_renamed_13380().cfr_renamed_14986(arg1);
        sprmxn2.cfr_renamed_13380().cfr_renamed_14970((byte)-85);
        if (arg2 != null && arg2.length > 0) {
            int n;
            int[] nArray = new int[arg2.length];
            int n2 = n = 0;
            while (n2 < arg2.length) {
                int n3 = n++;
                nArray[n3] = arg2[n3].intValue();
                n2 = n;
            }
            sprmxn sprmxn3 = this;
            sprmxn3.cfr_renamed_13380().cfr_renamed_14986(nArray);
            sprmxn3.cfr_renamed_13380().cfr_renamed_14970((byte)-81);
        }
        if (!arg3) {
            this.cfr_renamed_13380().cfr_renamed_14973((byte)-88);
            return;
        }
        sprmxn sprmxn4 = this;
        sprmxn4.cfr_renamed_13380().cfr_renamed_14973((byte)-87);
        sprmxn4.cfr_renamed_13380().cfr_renamed_14973((byte)-124);
        sprmxn4.cfr_renamed_13380().cfr_renamed_14973((byte)-122);
    }

    private /* synthetic */ void cfr_renamed_13166(sprsuja arg0) {
        sprmxn sprmxn2 = this;
        sprmxn2.cfr_renamed_13380().cfr_renamed_14410(arg0);
        sprmxn2.cfr_renamed_13380().cfr_renamed_14970((byte)76);
        sprmxn2.cfr_renamed_13380().cfr_renamed_14973((byte)107);
    }

    private /* synthetic */ void cfr_renamed_13386(sprthn arg0) {
        boolean bl;
        sprayn sprayn2 = this.cfr_renamed_14966(arg0);
        sprayn2.cfr_renamed_14110(arg0.cfr_renamed_13030());
        int n = arg0.cfr_renamed_13030().length();
        int[] nArray = new int[n];
        Float[] floatArray = new Float[n];
        sprthn sprthn2 = arg0;
        sprmxn.cfr_renamed_14981(sprthn2, sprayn2, nArray, floatArray);
        boolean bl2 = bl = sprthn2.cfr_renamed_13094() != null && !arg0.cfr_renamed_13094().cfr_renamed_13656();
        if (!arg0.cfr_renamed_12553().cfr_renamed_29()) {
            if (bl) {
                this.cfr_renamed_14983(arg0, sprayn2, nArray, floatArray, false, arg0.cfr_renamed_12553());
                return;
            }
            this.cfr_renamed_14980(arg0.cfr_renamed_13110(), nArray, floatArray, false, arg0.cfr_renamed_12553());
        }
    }
}

