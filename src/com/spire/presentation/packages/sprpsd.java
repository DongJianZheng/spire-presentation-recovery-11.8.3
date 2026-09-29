/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraa;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprdrd;
import com.spire.presentation.packages.sprfse;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprggb;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprolj;
import com.spire.presentation.packages.sprpa;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprrod;
import com.spire.presentation.packages.sprsne;
import com.spire.presentation.packages.sprtci;
import com.spire.presentation.packages.spryvd;
import com.spire.presentation.packages.sprza;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class sprpsd {
    private sprza cfr_renamed_2;
    private List cfr_renamed_3;
    private List cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprpsd cfr_renamed_4423(sprcyd sprcyd2, BigInteger bigInteger) {
        void arg1;
        sprpsd sprpsd2 = this;
        this.cfr_renamed_4.add(sprcyd2);
        sprpsd2.cfr_renamed_3.add(arg1);
        return sprpsd2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprrod cfr_renamed_4424(spraa arg0) throws spryvd {
        int n;
        sprlre sprlre2 = new sprlre();
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.size()) {
            sprpa sprpa2;
            sprcyd sprcyd2 = (sprcyd)this.cfr_renamed_4.get(n);
            BigInteger bigInteger = (BigInteger)this.cfr_renamed_3.get(n);
            sprije sprije2 = this.cfr_renamed_2.cfr_renamed_1572(sprcyd2.cfr_renamed_568().cfr_renamed_89());
            if (sprije2 == null) {
                throw new spryvd(sprtci.cfr_renamed_9("Y?T0U*\u001a8S0^~[2]1H7N6W~\\1H~^7];I*\u001a8H1W~I7]0[*O,_"));
            }
            try {
                sprpa2 = arg0.cfr_renamed_578(sprije2);
            }
            catch (sprfya sprfya2) {
                throw new spryvd(new StringBuilder().insert(0, sprolj.cfr_renamed_9("A\"U.X)\u00148[lW>Q-@)\u0014(]+Q?@v\u0014")).append(sprfya2.getMessage()).toString(), sprfya2);
            }
            sprdrd.cfr_renamed_4329(sprcyd2.cfr_renamed_568(), sprpa2.cfr_renamed_470());
            sprlre2.cfr_renamed_49(new sprfse(sprpa2.cfr_renamed_580(), bigInteger));
            n2 = ++n;
        }
        return new sprrod(sprsne.cfr_renamed_23(new sprpse(sprlre2)), this.cfr_renamed_2);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ 4 << 1;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 1 << 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 3 ^ 2;
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

    public sprpsd() {
        this(new sprggb());
    }

    public sprpsd(sprza sprza2) {
        sprpsd sprpsd2 = this;
        sprpsd sprpsd3 = this;
        sprpsd2.cfr_renamed_4 = new ArrayList();
        sprpsd2.cfr_renamed_3 = new ArrayList();
        sprpsd2.cfr_renamed_2 = sprza2;
    }
}

