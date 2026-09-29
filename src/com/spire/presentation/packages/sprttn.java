/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravp;
import com.spire.presentation.packages.sprcq;
import com.spire.presentation.packages.sprewn;
import com.spire.presentation.packages.sprfvn;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprhhp;
import com.spire.presentation.packages.sprmzo;
import com.spire.presentation.packages.sprpln;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprrin;
import com.spire.presentation.packages.sprswn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtqo;
import com.spire.presentation.packages.spruhm;
import com.spire.presentation.packages.spryjn;
import java.util.Iterator;

@sprtea
public class sprttn {
    private spravp cfr_renamed_91;
    private spravp cfr_renamed_0;
    private spravp cfr_renamed_1;
    private spravp cfr_renamed_2;
    private spravp cfr_renamed_3;
    private sprgdo cfr_renamed_4;

    public sprswn cfr_renamed_14598(sprpln arg0, sprgeja arg1) {
        sprswn sprswn2 = this.cfr_renamed_4.cfr_renamed_14626().cfr_renamed_14598(arg0, arg1);
        if (sprswn2 != null) {
            this.cfr_renamed_3.cfr_renamed_13301(sprswn2.cfr_renamed_14599(), sprswn2);
        }
        return sprswn2;
    }

    public sprewn cfr_renamed_14394(sprhhp arg0, String arg1) {
        sprttn sprttn2 = this;
        sprewn sprewn2 = sprttn2.cfr_renamed_4.cfr_renamed_14626().cfr_renamed_14394(arg0, arg1);
        sprttn2.cfr_renamed_2.cfr_renamed_13301(sprewn2.cfr_renamed_14599(), sprewn2);
        return sprewn2;
    }

    private /* synthetic */ void cfr_renamed_14645(spryjn arg0, String arg1, spravp arg2) {
        Iterator iterator;
        if (arg2.size() == 0) {
            return;
        }
        spryjn spryjn2 = arg0;
        spryjn2.cfr_renamed_11835(arg1);
        spryjn2.cfr_renamed_14086();
        Iterator iterator2 = iterator = arg2.cfr_renamed_13435().iterator();
        while (iterator2.hasNext()) {
            sprcq sprcq2 = (sprcq)iterator.next();
            Object[] objectArray = new Object[1];
            objectArray[0] = sprcq2.cfr_renamed_14599();
            arg0.cfr_renamed_14057(sprraia.cfr_renamed_11562(spruhm.cfr_renamed_9("n[q]"), objectArray), sprcq2.cfr_renamed_4570());
            iterator2 = iterator;
        }
        arg0.cfr_renamed_14061();
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_14485(spryjn spryjn2) {
        void arg0;
        void v0 = arg0;
        v0.cfr_renamed_14086();
        sprttn sprttn2 = this;
        void v2 = arg0;
        sprttn sprttn3 = this;
        sprttn3.cfr_renamed_14645((spryjn)arg0, sprmzo.cfr_renamed_9("\u001b>[\u0016@"), sprttn3.cfr_renamed_2);
        this.cfr_renamed_14645((spryjn)v2, spruhm.cfr_renamed_9("np T5E3N"), this.cfr_renamed_3);
        sprttn2.cfr_renamed_14645((spryjn)v2, sprmzo.cfr_renamed_9("Wq\u0000@?g\fU\fQ"), this.cfr_renamed_1);
        sprttn2.cfr_renamed_14645((spryjn)arg0, spruhm.cfr_renamed_9("nx\u000eB+E\"T"), this.cfr_renamed_91);
        this.cfr_renamed_14645((spryjn)v0, sprmzo.cfr_renamed_9("Wg\u0010U\u001c]\u0016S"), this.cfr_renamed_0);
        v0.cfr_renamed_14061();
    }

    public sprrin cfr_renamed_14602(byte[] arg0, sprtqo arg1) {
        sprttn sprttn2 = this;
        sprrin sprrin2 = sprttn2.cfr_renamed_4.cfr_renamed_14626().cfr_renamed_14602(arg0, arg1);
        sprttn2.cfr_renamed_91.cfr_renamed_13301(sprrin2.cfr_renamed_14599(), sprrin2);
        return sprrin2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3;
        int cfr_ignored_0 = 4 << 3 ^ (3 ^ 5);
        int n4 = n2;
        int n5 = 4 << 4 ^ 4 << 1;
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

    public sprfvn cfr_renamed_14600(float arg0, float arg1) {
        sprttn sprttn2 = this;
        sprfvn sprfvn2 = sprttn2.cfr_renamed_4.cfr_renamed_14626().cfr_renamed_14600(arg0, arg1);
        sprttn2.cfr_renamed_1.cfr_renamed_13301(sprfvn2.cfr_renamed_14599(), sprfvn2);
        return sprfvn2;
    }

    public boolean cfr_renamed_14646() {
        return this.cfr_renamed_2.size() > 0 || this.cfr_renamed_3.size() > 0 || this.cfr_renamed_1.size() > 0 || this.cfr_renamed_91.size() > 0 || this.cfr_renamed_0.size() > 0;
    }

    public sprewn cfr_renamed_14393(sprhhp arg0) {
        return this.cfr_renamed_14394(arg0, null);
    }

    public sprttn(sprgdo sprgdo2) {
        sprttn sprttn2 = this;
        sprttn sprttn3 = this;
        this.cfr_renamed_2 = new spravp();
        sprttn3.cfr_renamed_3 = new spravp();
        this.cfr_renamed_1 = new spravp();
        sprttn2.cfr_renamed_91 = new spravp();
        sprttn2.cfr_renamed_0 = new spravp();
        sprttn2.cfr_renamed_4 = sprgdo2;
    }
}

