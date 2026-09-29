/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcop;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprfzo;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprghn;
import com.spire.presentation.packages.sprign;
import com.spire.presentation.packages.sproin;
import com.spire.presentation.packages.sprpon;
import com.spire.presentation.packages.sprqjn;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprujha;
import com.spire.presentation.packages.sprvqo;
import com.spire.presentation.packages.sprxsp;
import com.spire.presentation.packages.sprznp;
import java.util.Iterator;

@sprtea
public class sprhmn {
    private sprvqo cfr_renamed_2;
    private sprghn cfr_renamed_3;
    private StringBuilder cfr_renamed_4;

    @sprtea
    public String cfr_renamed_14110(String arg0) {
        this.cfr_renamed_4.setLength(0);
        Iterator iterator = new sprcop(arg0).iterator();
        while (iterator.hasNext()) {
            int n = (Integer)iterator.next();
            if (this.cfr_renamed_2.cfr_renamed_13308(n) < 0) continue;
            sprghha.cfr_renamed_12279(this.cfr_renamed_4, sprxsp.cfr_renamed_12396(n));
        }
        return this.cfr_renamed_4.toString();
    }

    @sprtea
    public String cfr_renamed_14101(sprpon[] sprponArray) {
        int n;
        this.cfr_renamed_4.setLength(0);
        sprpon[] sprponArray2 = sprponArray;
        int n2 = sprponArray.length;
        int n3 = n = 0;
        while (n3 < n2) {
            sprpon sprpon2 = sprponArray2[n];
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
                        sprhmn sprhmn2;
                        int[] nArray;
                        object = sprpon2.cfr_renamed_13027()[n6];
                        n5 = ((sprqjn)object).cfr_renamed_13072();
                        if (n6 >= sprpon2.cfr_renamed_13079().length) {
                            int[] nArray2 = new int[1];
                            nArray2[0] = sprpon2.cfr_renamed_13079()[sprpon2.cfr_renamed_13079().length - 1];
                            nArray = nArray2;
                            sprhmn2 = this;
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
                            sprhmn2 = this;
                        }
                        n8 = sprhmn2.cfr_renamed_13411().cfr_renamed_13325(((sprqjn)object).cfr_renamed_13072());
                        sprhmn sprhmn3 = this;
                        n4 = sprhmn3.cfr_renamed_13411().cfr_renamed_14126(nArray);
                        sprhmn3.cfr_renamed_13411().cfr_renamed_13326(n4, n8);
                        sprghha.cfr_renamed_12279(sprhmn3.cfr_renamed_4, sprxsp.cfr_renamed_12396(n4));
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
                        sprhmn sprhmn4 = this;
                        n4 = sprhmn4.cfr_renamed_13411().cfr_renamed_13325(sprqjn2.cfr_renamed_13072());
                        int n13 = sprpon2.cfr_renamed_13079()[n6];
                        sprhmn4.cfr_renamed_13411().cfr_renamed_13326(n13, n4);
                        ++n6;
                        sprghha.cfr_renamed_12279(sprhmn4.cfr_renamed_4, sprxsp.cfr_renamed_12396(n13));
                        n12 = ++n11;
                    }
                }
            }
            n3 = ++n;
        }
        return this.cfr_renamed_4.toString();
    }

    @sprtea
    public sprhmn(sprfzo arg0) {
        sprhmn sprhmn2 = this;
        sprhmn2.cfr_renamed_4 = new StringBuilder();
        this.cfr_renamed_2 = arg0.cfr_renamed_13412(false, true, false);
        this.cfr_renamed_3 = new sprghn(this.cfr_renamed_2);
        this.cfr_renamed_2.cfr_renamed_13308(32);
    }

    public sprvqo cfr_renamed_13411() {
        return this.cfr_renamed_2;
    }

    @sprtea
    public void cfr_renamed_11814(spreen arg0) {
        sprhmn sprhmn2 = this;
        sprhmn2.cfr_renamed_2.cfr_renamed_14127(arg0);
        sproin sproin2 = new sproin(arg0);
        Object[] objectArray = new Object[1];
        objectArray[0] = this.cfr_renamed_313();
        sprhmn2.cfr_renamed_3.cfr_renamed_14128(sproin2, sprraia.cfr_renamed_11562(sprign.cfr_renamed_9("\bs\ni(T2\u00144"), objectArray));
        sproin2.cfr_renamed_14085(sprujha.cfr_renamed_9("~W\u0006makq9\u0010A\u0012[0f*&,6\n9*&,Kqu>{!y\"s7y?bqf>f"), this.cfr_renamed_313());
    }

    @sprtea
    public String cfr_renamed_313() {
        String string = this.cfr_renamed_2.cfr_renamed_13261().cfr_renamed_14129();
        if (!sprznp.cfr_renamed_12328(string)) {
            string = this.cfr_renamed_2.cfr_renamed_13261().cfr_renamed_13492();
        }
        return string;
    }
}

