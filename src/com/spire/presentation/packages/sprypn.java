/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralq;
import com.spire.presentation.packages.sprcmn;
import com.spire.presentation.packages.sprcun;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprfzo;
import com.spire.presentation.packages.sprhdaa;
import com.spire.presentation.packages.sprhmn;
import com.spire.presentation.packages.sproin;
import com.spire.presentation.packages.sprpon;
import com.spire.presentation.packages.sprppn;
import com.spire.presentation.packages.sprqjn;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprszca;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtqo;
import com.spire.presentation.packages.sprvqo;
import com.spire.presentation.packages.sprxmn;
import com.spire.presentation.packages.sprznp;
import java.util.AbstractMap;
import java.util.Iterator;

@sprtea
public class sprypn {
    private sprppn cfr_renamed_91;
    private sprcun cfr_renamed_0;
    private sproin cfr_renamed_1;
    private sprxmn cfr_renamed_2;
    private int cfr_renamed_3;
    private spralq cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprypn(sproin sproin2, sprppn sprppn2) {
        void arg0;
        sprypn sprypn2 = this;
        sprypn sprypn3 = this;
        this.cfr_renamed_0 = new sprcun();
        sprypn3.cfr_renamed_4 = new spralq();
        sprypn2.cfr_renamed_1 = arg0;
        sprypn2.cfr_renamed_91 = sprppn2;
    }

    private /* synthetic */ sprxmn cfr_renamed_14139() {
        if (this.cfr_renamed_2 == null) {
            sprypn sprypn2 = this;
            this.cfr_renamed_2 = new sprxmn(this);
        }
        return this.cfr_renamed_2;
    }

    @sprtea
    public sprppn cfr_renamed_13097() {
        return this.cfr_renamed_91;
    }

    @sprtea
    public String cfr_renamed_14109(byte[] arg0, sprtqo arg1) {
        String string = (String)this.cfr_renamed_0.cfr_renamed_13501(arg0, arg1);
        if (!sprznp.cfr_renamed_12328(string)) {
            sprypn sprypn2 = this;
            sprcmn sprcmn2 = sprcmn.cfr_renamed_14113(sprypn2, arg0, arg1);
            string = sprypn2.cfr_renamed_14139().cfr_renamed_14111(sprcmn2);
            sprypn2.cfr_renamed_0.cfr_renamed_13502(arg0, arg1, string);
        }
        return string;
    }

    private /* synthetic */ String cfr_renamed_14140(String arg0) {
        String string = "";
        String string2 = "";
        char[] cArray = new char[3];
        cArray[0] = 43;
        cArray[1] = 45;
        cArray[2] = 95;
        String[] stringArray = sprraia.cfr_renamed_13378(arg0, cArray);
        int n = 1;
        if (stringArray.length > 1) {
            int n2;
            string = new StringBuilder().insert(0, string).append(stringArray[0]).toString();
            int n3 = n2 = 1;
            while (n3 < stringArray.length) {
                if (!sprraia.cfr_renamed_12280(stringArray[n2])) {
                    if (this.cfr_renamed_14141(stringArray[n2])) {
                        n = arg0.indexOf(stringArray[n2], n);
                        string = new StringBuilder().insert(0, string).append(arg0.charAt(n - 1)).append(stringArray[n2]).toString();
                    } else {
                        int n4;
                        byte[] byArray = sprszca.cfr_renamed_12801().cfr_renamed_11606(stringArray[n2]);
                        n = arg0.indexOf(stringArray[n2], n);
                        string2 = new StringBuilder().insert(0, string2).append(arg0.charAt(n - 1)).toString();
                        int n5 = n4 = 0;
                        while (n5 < byArray.length) {
                            Object[] objectArray = new Object[1];
                            objectArray[0] = byArray[n4];
                            string2 = new StringBuilder().insert(0, string2).append("#").append(sprraia.cfr_renamed_11562(sprhdaa.cfr_renamed_9("JL\u000b$L"), objectArray)).toString();
                            n5 = ++n4;
                        }
                        string = new StringBuilder().insert(0, string).append(string2).toString();
                        string2 = "";
                    }
                }
                n3 = ++n2;
            }
        } else {
            string = new StringBuilder().insert(0, string).append(stringArray[0]).toString();
        }
        return string;
    }

    private /* synthetic */ sprvqo cfr_renamed_13298(sprfzo arg0) {
        return this.cfr_renamed_14100(arg0).cfr_renamed_13411();
    }

    private /* synthetic */ boolean cfr_renamed_14141(String arg0) {
        int n;
        boolean bl = true;
        char[] cArray = arg0.toCharArray();
        int n2 = n = 0;
        while (n2 < cArray.length) {
            if (!(cArray[n] == '#' || cArray[n] == ',' || cArray[n] >= '0' && cArray[n] <= '9' || cArray[n] >= 'A' && cArray[n] <= 'Z' || cArray[n] >= 'a' && cArray[n] <= 'z')) {
                bl = false;
                return false;
            }
            n2 = ++n;
        }
        return bl;
    }

    @sprtea
    public sproin cfr_renamed_13380() {
        return this.cfr_renamed_1;
    }

    @sprtea
    public void cfr_renamed_13260(sprfzo arg0, sprpon[] arg1) {
        int n;
        sprvqo sprvqo2 = this.cfr_renamed_13298(arg0);
        sprpon[] sprponArray = arg1;
        int n2 = arg1.length;
        int n3 = n = 0;
        while (n3 < n2) {
            int n4;
            sprpon sprpon2 = sprponArray[n];
            sprqjn[] sprqjnArray = sprpon2.cfr_renamed_13027();
            int n5 = sprqjnArray.length;
            int n6 = n4 = 0;
            while (n6 < n5) {
                sprqjn sprqjn2 = sprqjnArray[n4];
                int n7 = sprvqo2.cfr_renamed_13325(sprqjn2.cfr_renamed_13072());
                if (sprpon2.cfr_renamed_13079().length == 1 && sprpon2.cfr_renamed_13027().length == 1) {
                    sprvqo2.cfr_renamed_13326(sprpon2.cfr_renamed_13079()[0], n7);
                }
                n6 = ++n4;
            }
            n3 = ++n;
        }
    }

    public void cfr_renamed_14097(spreen arg0) {
        Iterator iterator;
        Iterator iterator2 = iterator = this.cfr_renamed_4.entrySet().iterator();
        while (iterator2.hasNext()) {
            ((sprhmn)((AbstractMap.SimpleEntry)iterator.next()).getValue()).cfr_renamed_11814(arg0);
            iterator2 = iterator;
        }
    }

    @sprtea
    public int cfr_renamed_14112() {
        return this.cfr_renamed_3++;
    }

    @sprtea
    public sprhmn cfr_renamed_14100(sprfzo arg0) {
        sprypn sprypn2 = this;
        String string = sprypn2.cfr_renamed_14140(arg0.cfr_renamed_13492());
        String string2 = sprypn2.cfr_renamed_14140(arg0.cfr_renamed_13460());
        sprfzo sprfzo2 = arg0;
        String string3 = sprfzo2.cfr_renamed_14142(string, string2);
        sprfzo2.cfr_renamed_14143(string.replace(" ", ""));
        sprhmn sprhmn2 = (sprhmn)sprypn2.cfr_renamed_4.get(string3);
        if (sprhmn2 == null) {
            sprhmn2 = new sprhmn(arg0);
            this.cfr_renamed_4.put(string3, sprhmn2);
        }
        return sprhmn2;
    }
}

