/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfqn;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprikn;
import com.spire.presentation.packages.sprktp;
import com.spire.presentation.packages.sprlsn;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwhn;
import com.spire.presentation.packages.sprxln;

@sprtea
public class sprqoo {
    private static /* synthetic */ sprsuja[] cfr_renamed_16376(sprsuja[] arg0, int arg1, float arg2) {
        sprsuja[] sprsujaArray = new sprsuja[4];
        int n = arg1 - 1;
        if (n < 0) {
            n = 0;
        }
        int n2 = arg1;
        int n3 = arg1 + 1;
        int n4 = arg1 + 2;
        if (n4 > arg0.length - 1) {
            n4 = n3;
        }
        sprsuja sprsuja2 = arg0[n2];
        sprsuja sprsuja3 = arg0[n3];
        sprsuja sprsuja4 = new sprsuja(arg2 * (arg0[n3].cfr_renamed_1980() - arg0[n].cfr_renamed_1980()), arg2 * (arg0[n3].spr\u3181() - arg0[n].spr\u3181()));
        sprsuja sprsuja5 = new sprsuja(arg2 * (arg0[n4].cfr_renamed_1980() - arg0[n2].cfr_renamed_1980()), arg2 * (arg0[n4].spr\u3181() - arg0[n2].spr\u3181()));
        sprsuja sprsuja6 = new sprsuja((sprsuja4.cfr_renamed_1980() + 3.0f * sprsuja2.cfr_renamed_1980()) / 3.0f, (sprsuja4.spr\u3181() + 3.0f * sprsuja2.spr\u3181()) / 3.0f);
        sprsuja sprsuja7 = new sprsuja((3.0f * sprsuja3.cfr_renamed_1980() - sprsuja5.cfr_renamed_1980()) / 3.0f, (3.0f * sprsuja3.spr\u3181() - sprsuja5.spr\u3181()) / 3.0f);
        sprsuja[] sprsujaArray2 = sprsujaArray;
        sprsujaArray[0] = sprsuja2;
        sprsujaArray[1] = sprsuja6;
        sprsujaArray2[2] = sprsuja7;
        sprsujaArray[3] = sprsuja3;
        return sprsujaArray2;
    }

    @sprtea
    public static sprxln cfr_renamed_16377(sprsuja[] arg0, int[] arg1, boolean arg2) {
        sprxln sprxln2 = new sprxln();
        sprlsn sprlsn2 = new sprlsn();
        sprxln2.cfr_renamed_12507(sprlsn2);
        sprlsn2.cfr_renamed_12625(arg2);
        sprktp sprktp2 = null;
        int n = 0;
        int n2 = 0;
        int n3 = n2;
        while (n3 < arg0.length) {
            if (arg1[n2] == 0) {
                sprktp2 = new sprktp();
            }
            if (n != 0 && n != arg1[n2]) {
                sprqoo.cfr_renamed_16378(sprlsn2, sprktp2, n);
                sprktp2 = new sprktp();
                if (n2 > 0) {
                    sprktp2.cfr_renamed_13516(arg0[n2 - 1]);
                }
            }
            if (sprktp2 != null) {
                sprktp2.cfr_renamed_13516(arg0[n2]);
            }
            n = arg1[n2];
            if (n2 == arg0.length - 1) {
                sprqoo.cfr_renamed_16378(sprlsn2, sprktp2, n);
            }
            n3 = ++n2;
        }
        return sprxln2;
    }

    @sprtea
    public static sprxln cfr_renamed_16379(sprgeja arg0, sprsuja arg1, sprsuja arg2) {
        sprxln sprxln2 = new sprxln();
        sprlsn sprlsn2 = new sprlsn();
        sprxln sprxln3 = sprxln2;
        sprxln3.cfr_renamed_12507(sprlsn2);
        sprikn sprikn2 = sprwhn.cfr_renamed_13840(arg0, arg1, arg2, 1);
        sprlsn sprlsn3 = sprlsn2;
        sprlsn3.cfr_renamed_13649(sprikn2);
        sprfqn sprfqn2 = new sprfqn();
        sprfqn2.cfr_renamed_13187().cfr_renamed_13516(sprikn2.cfr_renamed_8417());
        sprfqn2.cfr_renamed_13187().cfr_renamed_13516(sprikn2.cfr_renamed_13167());
        sprlsn3.cfr_renamed_12507(sprfqn2);
        return sprxln3;
    }

    @sprtea
    public static sprxln cfr_renamed_16380(sprgeja arg0) {
        sprxln sprxln2 = new sprxln();
        sprlsn sprlsn2 = new sprlsn();
        sprxln sprxln3 = sprxln2;
        sprxln3.cfr_renamed_12507(sprlsn2);
        sprikn sprikn2 = new sprikn(arg0);
        sprlsn2.cfr_renamed_13649(sprikn2);
        return sprxln3;
    }

    @sprtea
    public static sprxln cfr_renamed_16381(sprgeja arg0, float arg1, float arg2) {
        sprxln sprxln2 = new sprxln();
        sprlsn sprlsn2 = new sprlsn();
        sprxln sprxln3 = sprxln2;
        sprxln3.cfr_renamed_12507(sprlsn2);
        sprikn sprikn2 = new sprikn(arg0, arg1, arg2);
        sprlsn2.cfr_renamed_13649(sprikn2);
        return sprxln3;
    }

    @sprtea
    public static sprxln cfr_renamed_16382(sprsuja[][] arg0, boolean arg1) {
        int n;
        sprxln sprxln2 = new sprxln();
        sprsuja[][] sprsujaArray = arg0;
        int n2 = arg0.length;
        int n3 = n = 0;
        while (n3 < n2) {
            sprlsn sprlsn2 = sprlsn.cfr_renamed_13644(sprsujaArray[n], false, arg1);
            sprxln2.cfr_renamed_12507(sprlsn2);
            n3 = ++n;
        }
        return sprxln2;
    }

    @sprtea
    public static sprxln cfr_renamed_16383(sprgeja arg0, sprsuja arg1, sprsuja arg2, int arg3) {
        sprxln sprxln2 = new sprxln();
        sprlsn sprlsn2 = new sprlsn();
        sprxln sprxln3 = sprxln2;
        sprxln3.cfr_renamed_12507(sprlsn2);
        sprikn sprikn2 = sprwhn.cfr_renamed_13840(arg0, arg1, arg2, arg3);
        sprlsn2.cfr_renamed_13649(sprikn2);
        return sprxln3;
    }

    @sprtea
    public static sprxln cfr_renamed_16384(sprgeja arg0, float arg1, float arg2) {
        sprxln sprxln2 = new sprxln();
        sprlsn sprlsn2 = new sprlsn();
        sprxln sprxln3 = sprxln2;
        sprxln3.cfr_renamed_12507(sprlsn2);
        sprikn sprikn2 = new sprikn(arg0, arg1, arg2);
        sprlsn sprlsn3 = sprlsn2;
        sprlsn3.cfr_renamed_13649(sprikn2);
        sprfqn sprfqn2 = new sprfqn();
        sprfqn2.cfr_renamed_13187().cfr_renamed_13516(sprikn2.cfr_renamed_8417());
        sprfqn2.cfr_renamed_13187().cfr_renamed_13516(sprikn2.cfr_renamed_13167());
        sprlsn3.cfr_renamed_12507(sprfqn2);
        return sprxln3;
    }

    @sprtea
    public static sprxln cfr_renamed_16385(sprgeja arg0, sprphja arg1) {
        sprfqn sprfqn2;
        if (arg1.cfr_renamed_1942() == 0.0f || arg1.cfr_renamed_1452() == 0.0f) {
            return sprxln.cfr_renamed_13253(arg0);
        }
        sprxln sprxln2 = new sprxln();
        sprlsn sprlsn2 = new sprlsn();
        sprxln sprxln3 = sprxln2;
        sprxln3.cfr_renamed_12507(sprlsn2);
        sprphja sprphja2 = new sprphja(arg1.cfr_renamed_1942() / 2.0f, arg1.cfr_renamed_1452() / 2.0f);
        sprfqn sprfqn3 = sprfqn2 = new sprfqn();
        sprfqn3.cfr_renamed_13187().cfr_renamed_13516(new sprsuja(arg0.cfr_renamed_13430() + sprphja2.cfr_renamed_1942(), arg0.cfr_renamed_13342()));
        sprfqn3.cfr_renamed_13187().cfr_renamed_13516(new sprsuja(arg0.cfr_renamed_13341() - sprphja2.cfr_renamed_1942(), arg0.cfr_renamed_13342()));
        sprlsn2.cfr_renamed_12507(sprfqn3);
        sprikn sprikn2 = sprwhn.cfr_renamed_13839(new sprgeja(arg0.cfr_renamed_13341() - arg1.cfr_renamed_1942(), arg0.cfr_renamed_13342(), arg1.cfr_renamed_1942(), arg1.cfr_renamed_1452()), new sprsuja(arg0.cfr_renamed_13341() - sprphja2.cfr_renamed_1942(), arg0.cfr_renamed_13342()), new sprsuja(arg0.cfr_renamed_13341(), arg0.cfr_renamed_13342() + sprphja2.cfr_renamed_1452()));
        sprlsn sprlsn3 = sprlsn2;
        sprlsn3.cfr_renamed_13649(sprikn2);
        sprfqn sprfqn4 = new sprfqn();
        sprfqn4.cfr_renamed_13187().cfr_renamed_13516(new sprsuja(arg0.cfr_renamed_13341(), arg0.cfr_renamed_13429() - sprphja2.cfr_renamed_1452()));
        sprlsn3.cfr_renamed_12507(sprfqn4);
        sprikn sprikn3 = sprwhn.cfr_renamed_13839(new sprgeja(arg0.cfr_renamed_13341() - arg1.cfr_renamed_1942(), arg0.cfr_renamed_13429() - arg1.cfr_renamed_1452(), arg1.cfr_renamed_1942(), arg1.cfr_renamed_1452()), new sprsuja(arg0.cfr_renamed_13341(), arg0.cfr_renamed_13429() - sprphja2.cfr_renamed_1452()), new sprsuja(arg0.cfr_renamed_13341() - sprphja2.cfr_renamed_1942(), arg0.cfr_renamed_13429()));
        sprlsn sprlsn4 = sprlsn2;
        sprlsn4.cfr_renamed_13649(sprikn3);
        sprfqn sprfqn5 = new sprfqn();
        sprfqn5.cfr_renamed_13187().cfr_renamed_13516(new sprsuja(arg0.cfr_renamed_13430() + sprphja2.cfr_renamed_1942(), arg0.cfr_renamed_13429()));
        sprlsn4.cfr_renamed_12507(sprfqn5);
        sprikn sprikn4 = sprwhn.cfr_renamed_13839(new sprgeja(arg0.cfr_renamed_13430(), arg0.cfr_renamed_13429() - arg1.cfr_renamed_1452(), arg1.cfr_renamed_1942(), arg1.cfr_renamed_1452()), new sprsuja(arg0.cfr_renamed_13430() + sprphja2.cfr_renamed_1942(), arg0.cfr_renamed_13429()), new sprsuja(arg0.cfr_renamed_13430(), arg0.cfr_renamed_13429() - sprphja2.cfr_renamed_1452()));
        sprlsn sprlsn5 = sprlsn2;
        sprlsn5.cfr_renamed_13649(sprikn4);
        sprfqn sprfqn6 = new sprfqn();
        sprfqn6.cfr_renamed_13187().cfr_renamed_13516(new sprsuja(arg0.cfr_renamed_13430(), arg0.cfr_renamed_13342() + sprphja2.cfr_renamed_1452()));
        sprlsn5.cfr_renamed_12507(sprfqn6);
        sprikn sprikn5 = sprwhn.cfr_renamed_13839(new sprgeja(arg0.cfr_renamed_13430(), arg0.cfr_renamed_13342(), arg1.cfr_renamed_1942(), arg1.cfr_renamed_1452()), new sprsuja(arg0.cfr_renamed_13430(), arg0.cfr_renamed_13342() + sprphja2.cfr_renamed_1452()), new sprsuja(arg0.cfr_renamed_13430() + sprphja2.cfr_renamed_1942(), arg0.cfr_renamed_13342()));
        sprlsn2.cfr_renamed_13649(sprikn5);
        return sprxln3;
    }

    @sprtea
    public static sprxln cfr_renamed_16386(sprsuja[] arg0, float arg1) {
        int n = arg0.length;
        sprsuja[] sprsujaArray = new sprsuja[arg0.length + 3];
        System.arraycopy(arg0, 0, sprsujaArray, 1, arg0.length);
        sprsujaArray[0] = arg0[arg0.length - 1];
        sprsujaArray[arg0.length + 1] = sprsujaArray[1];
        sprsujaArray[arg0.length + 2] = sprsujaArray[2];
        return sprqoo.cfr_renamed_16387(sprsujaArray, 1, n, arg1);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void cfr_renamed_16378(sprlsn arg0, sprktp arg1, int arg2) {
        if (arg1 != null) {
            switch (arg2) {
                case 3: {
                    arg0.cfr_renamed_13651(arg1);
                    return;
                }
                case 1: {
                    arg0.cfr_renamed_13647(arg1, false);
                    return;
                }
            }
        }
    }

    @sprtea
    public static sprxln cfr_renamed_16388(sprsuja[] arg0, boolean arg1) {
        sprxln sprxln2 = new sprxln();
        sprlsn sprlsn2 = sprlsn.cfr_renamed_13644(arg0, false, arg1);
        sprxln sprxln3 = sprxln2;
        sprxln3.cfr_renamed_12507(sprlsn2);
        return sprxln3;
    }

    @sprtea
    public static sprxln cfr_renamed_16387(sprsuja[] arg0, int arg1, int arg2, float arg3) {
        int n;
        sprsuja[] sprsujaArray = new sprsuja[arg2 * 3 + 1];
        int n2 = 0;
        int n3 = n = arg1;
        while (n3 < arg1 + arg2) {
            sprsuja[] sprsujaArray2 = sprqoo.cfr_renamed_16376(arg0, n, arg3);
            sprsuja[] sprsujaArray3 = sprsujaArray;
            sprsuja[] sprsujaArray4 = sprsujaArray;
            sprsujaArray3[n2++] = sprsujaArray2[0];
            sprsujaArray4[n2++] = sprsujaArray2[1];
            sprsujaArray3[n2++] = sprsujaArray2[2];
            sprsujaArray4[n2] = sprsujaArray2[3];
            n3 = ++n;
        }
        return sprqoo.cfr_renamed_16389(sprsujaArray);
    }

    @sprtea
    public static sprxln cfr_renamed_16390(sprgeja arg0, sprsuja arg1, sprsuja arg2) {
        sprxln sprxln2 = new sprxln();
        sprlsn sprlsn2 = new sprlsn();
        sprxln sprxln3 = sprxln2;
        sprxln3.cfr_renamed_12507(sprlsn2);
        sprikn sprikn2 = sprwhn.cfr_renamed_13840(arg0, arg1, arg2, 1);
        sprlsn sprlsn3 = sprlsn2;
        sprlsn3.cfr_renamed_13649(sprikn2);
        sprfqn sprfqn2 = new sprfqn();
        sprfqn2.cfr_renamed_13187().cfr_renamed_13516(sprikn2.cfr_renamed_13167());
        sprlsn3.cfr_renamed_12507(sprfqn2);
        return sprxln3;
    }

    @sprtea
    public static sprxln cfr_renamed_16389(sprsuja[] arg0) {
        sprxln sprxln2 = new sprxln();
        sprlsn sprlsn2 = sprlsn.cfr_renamed_13642(arg0);
        sprxln sprxln3 = sprxln2;
        sprxln3.cfr_renamed_12507(sprlsn2);
        return sprxln3;
    }
}

